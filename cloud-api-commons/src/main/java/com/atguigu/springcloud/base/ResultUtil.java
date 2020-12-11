package com.atguigu.springcloud.base;


import java.lang.reflect.Field;

public class ResultUtil {
    public static Result returnErrorResult(BaseErrorCode baseErrorCode) {
        Result result = new Result<>();
        try {
            Field codeField = baseErrorCode.getClass().getDeclaredField("code");
            codeField.setAccessible(true);
            Field messageField = baseErrorCode.getClass().getDeclaredField("message");
            messageField.setAccessible(true);
            result.setCode(String.valueOf(codeField.get(baseErrorCode)));
            result.setMessage(String.valueOf(messageField.get(baseErrorCode)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static Result returnErrorResult(BaseErrorCode baseErrorCode, Object... object) {
        Result result = new Result<>();
        try {
            Field codeField = baseErrorCode.getClass().getDeclaredField("code");
            codeField.setAccessible(true);
            Field messageField = baseErrorCode.getClass().getDeclaredField("message");
            messageField.setAccessible(true);
            String message = String.valueOf(messageField.get(baseErrorCode));
            result.setCode(String.valueOf(codeField.get(baseErrorCode)));
            result.setMessage(String.valueOf(object.length > 0 ? String.valueOf(String.format(message, object)) : message));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static Result returnErrorResult(String code, String message) {
        Result result = new Result<>();
        try {
            result.setCode(code);
            result.setMessage(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    public static Result returnSuccessResult() {
        Result result = new Result<>();
        try {
            result.setCode(String.valueOf(BaseErrorCodeEnum.SUCCESS.getCode()));
            result.setMessage(String.valueOf(BaseErrorCodeEnum.SUCCESS.getMessage()));
            result.setSuccess(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static Result returnSuccessResult(Object object) {
        Result result = new Result<>();
        try {
            result.setCode(String.valueOf(BaseErrorCodeEnum.SUCCESS.getCode()));
            result.setMessage(String.valueOf(BaseErrorCodeEnum.SUCCESS.getMessage()));
            result.setSuccess(true);
            result.setData(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
