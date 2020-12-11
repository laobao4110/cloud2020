package com.atguigu.springcloud.base;

/**
 * 
 * <p>
 * 错误代码常量基础类
 * </p>
 *
 * @author daiqi
 * 创建时间    2018年2月2日 下午4:07:03
 */
public enum BaseErrorCodeEnum implements BaseErrorCode {
	/** 成功---BASE_000000 */
	SUCCESS("BASE_000000", "成功"),
	/** 异常---系统错误---BASE_000001 */
	SYS_ERROR("BASE_000001", "系统错误"),
	/** 异常---系统异常---BASE_000002 */
	SYS_EXCEPTION("BASE_000002", "系统异常"),
	/** 异常---运行时异常---BASE_000003 */
	RUNTIME_EXCEPTION("BASE_000003", "运行时异常"),
	/** 异常---查询对象不能为空---BASE_000004 */
	QUERY_OBJ_CANT_NULL("BASE_000004", "查询对象为空"),
	/** 异常---持久化对象不能为空---BASE_000005 */
	ENTITY_OBJ_CANT_NULL("BASE_000005", "持久化对象为空"),
	/** 异常---数据传输对象不能为空---BASE_000006 */
	DTO_OBJ_CANT_NULL("BASE_000006", "数据传输对象为空"),
	/** 异常---业务逻辑对象不能为空---BASE_000007 */
	BO_OBJ_CANT_NULL("BASE_000007", "业务逻辑对象为空"),
	/** 异常---视图对象不能为空---BASE_000008 */
	VO_OBJ_CANT_NULL("BASE_000008", "视图对象为空"),
	/** 异常---类型转换异常---BASE_000009 */
	TYPE_CONVERT_EXCEPTION("BASE_000009", "类型转换异常"),
	/** 异常---非法类型异常---BASE_000010 */
	ILLICIT_TYPE_EXCEPTION("BASE_000010", "非法类型异常"),
	/** 异常---对象不能为空异常---BASE_000011 */
	OBJECT_CANT_NULL("BASE_000011", "[%s]为空"),
	/** 异常---列表为空异常---BASE_000012 */
	LIST_NULL("BASE_000012", "列表[%s]为空"),
	/** 异常---列表为空或者空列表异常---BASE_000013 */
	LIST_EMPTY("BASE_000013", "列表[%s]数据为空"),
	/** 异常---字符串为空或者空串异常---BASE_000014 */
	STR_EMPTY("BASE_000014", "[%s]字符串为空或者空串"),
	/** 异常---数据不存在异常---BASE_000015 */
	DATBASE_NON_EXISTENT("BASE_000015", "[%s]不存在"),
	/** 异常---数据存在异常---BASE_000016 */
	DATBASE_ALREADY_EXISTENT("BASE_000016", "[%s]已经存在"),
	/** 异常---数据有误异常---BASE_000017 */
	DATA_ERROR("BASE_000017", "[%s]有误"),
	NOT_HAVE_PERMISSION("AUTHORITY_000005", "没有足够的权限"),
	PARAM_ERROR("BASE_000018", "参数错误"),
	SERVER_CONNECTION_FAILED("BASE_000019", "请求服务器连接失败，请联系管理员！"),
	/** ERP成功---J000000 */
	ERP_SUCCESS("J000000", "成功"),
	/** ERP成功---J000000 */
	ERP_SYSTEM_ERROR("BASE_000020", "ERP系统错误,请联系管理员"),
	/** 参数不能为空---BASE_000021 */
	PARAM_IS_NOT_NULL("BASE_000021", "参数不能为空"),
	/** ERP成功---J000000 */
	ERP_BUSINESS_EXCEPTION("J000000", "业务异常"),
	/** ERP成功---J000000 */
	ERP_SYSTEM_EXCEPTION("J000000", "系统异常"),
	/** ERP链接失败---BASE_000022 */
	ERP_SYSTEM_CONNECT_FAIL("BASE_000022", "ERP链接失败"),
	/** 正在修复---BASE_000023 */
	BEING_REPAIRED("BASE_000023", "正在修复"),
    FORCE_SAVE_GRADE("FORCE_SAVE_001", "强制保存"),
	;

	private String code;
	private String message;
	
	BaseErrorCodeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}


	@Override
	public String getCode() {
		return this.code;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
}

