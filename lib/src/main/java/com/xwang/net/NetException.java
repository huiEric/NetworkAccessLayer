package com.xwang.net;

/**
 * @date   2016-07-22
 * Define Socket error type.
 */
@SuppressWarnings("serial")
public class NetException extends Exception {
    public static final int UNKNOW_EXCEPTION     = -1011;
    public static final int SOCKET_NOT_CONNECTED = -1012;
    public static final int REQUEST_TIMEOUT      = -1013;
    public static final int NETWORK_DISCONNECT   = -1014;
    public static final int CONNECT_TIMEOUT      = -1015;
    public static final int IO_EXCEPTION         = -1016;
    public static final int PARSE_EXCEPTION      = -1017;
    public static final int USER_CANCELED        = -1018;
    public static final int NETWORK_EXCEPTION    = -1019;
    public static final int SESSION_EXPIRED      = -1020;
    public static final int SERVER_EXCEPTION     = -1021;
    public static final int PARAMS_VALID_EXCEPTION     = -1022;
    public static final int NOTIFY_EXCEPTION     = -1023;


    private static final String UNKNOW_EXCEPTION_TEXT     = "δ֪����";
    private static final String SOCKET_NOT_CONNECTED_TEXT = "����û������";
    private static final String REQUEST_TIMEOUT_TEXT      = "����ʱ";
    private static final String NETWORK_DISCONNECT_TEXT   = "����Ͽ�";
    private static final String CONNECT_TIMEOUT_TEXT      = "���ӳ�ʱ";
    private static final String IO_EXCEPTION_TEXT         = "IO����";
    private static final String PARSE_EXCEPTION_TEXT      = "�������ݴ���";
    private static final String USER_CANCELED_TEXT        = "�û�ȡ��";
    private static final String NETWORK_EXCEPTION_TEXT    = "�������";
    private static final String SESSION_EXPIRED_TEXT      = "session����";
    private static final String SERVER_EXCEPTION_TEXT     =  "����������";
    private static final String PARAMS_VALID_EXCEPTION_TEXT  = "�����Ƿ�";
    private static final String NOTIFY_EXCEPTION_TEXT     = "�ص�����";

    private int errorCode;

    public NetException(int error) {
        this(error, null);
    }

    public NetException(int error, Throwable cause) {
        super(cause);
        this.errorCode = error;
    }

    public int getErrorCode() {
        return errorCode;
    }
    public String getErrorMsg() {
        switch (errorCode) {
            case SOCKET_NOT_CONNECTED:
                return SOCKET_NOT_CONNECTED_TEXT;
            case REQUEST_TIMEOUT:
                return REQUEST_TIMEOUT_TEXT;
            case NETWORK_DISCONNECT:
                return NETWORK_DISCONNECT_TEXT;
            case CONNECT_TIMEOUT:
                return CONNECT_TIMEOUT_TEXT;
            case IO_EXCEPTION:
                return IO_EXCEPTION_TEXT;
            case PARSE_EXCEPTION:
                return PARSE_EXCEPTION_TEXT;
            case USER_CANCELED:
                return USER_CANCELED_TEXT;
            case NETWORK_EXCEPTION:
                return NETWORK_EXCEPTION_TEXT;
            case SESSION_EXPIRED:
                return SESSION_EXPIRED_TEXT;
            case SERVER_EXCEPTION:
                return SERVER_EXCEPTION_TEXT;
            case PARAMS_VALID_EXCEPTION:
                return PARAMS_VALID_EXCEPTION_TEXT;
            case NOTIFY_EXCEPTION:
                return NOTIFY_EXCEPTION_TEXT;
            default:
                return UNKNOW_EXCEPTION_TEXT;
        }
    }
}
