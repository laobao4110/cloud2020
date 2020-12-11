package com.atguigu.springcloud.base;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.json.JSONException;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JSONUtil {

	/**
	 * 将Object对象转换为json字符串，若不能转换将String.valueOf(obj)
	 */
	public static String toJSONString(Object obj) {
		if (null == obj) {
			return null;
		}
		if (obj instanceof String) {
			return obj.toString();
		}

		try {
			return JSONObject.toJSONString(obj);
		} catch (JSONException e) {
			return String.valueOf(obj);
		} catch (UnsupportedOperationException e) {
			return String.valueOf(obj);
		} catch (IllegalStateException e) {
			return String.valueOf(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 将obj转化为class对应的泛型对象
	 *
	 * @param obj
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T parseObject(Object obj, Class<T> clazz) {
		if (obj == null) {
			return null;
		}
		try {
			if (obj instanceof String) {
				obj = JSONObject.parse(obj.toString());
			}
			String jsonStr = toJSONString(obj);
			return com.alibaba.fastjson.JSONObject.parseObject(jsonStr, clazz);
		} catch (JSONException e) {
			return (T) obj;
		} catch (UnsupportedOperationException e) {
			return (T) obj;
		} catch (IllegalStateException e) {
			return (T) obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 将json数格式的字符串或者list转换为Class对应泛型对象的集合
	 *
	 * @param listOrJsonStr
	 * @param clazz
	 * @return List<T>
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> parseArray(Object listOrJsonStr, Class<T> clazz) {
		if (listOrJsonStr == null || clazz == null) {
			return null;
		}
		String arrStr = listOrJsonStr.toString();
		if (!arrStr.isEmpty()) {
			return null;
		}
		try {
			if (listOrJsonStr instanceof List) {
				arrStr = JSONArray.toJSONString(listOrJsonStr);
			}
			return JSONArray.parseArray(arrStr, clazz);
		} catch (Exception e) {
			List<T> retList = new ArrayList<>();
			retList.add((T) arrStr);
			return retList;
		}
	}


}