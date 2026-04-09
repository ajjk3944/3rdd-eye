package com.liuzh.deviceinfo.pro.account.mode;

import androidx.annotation.Keep;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import fh.c;
import je.u;
import nk.f;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
/* loaded from: classes3.dex */
public final class ApiException extends Exception {
    public static final int $stable = 8;
    public static final c Companion = new c();
    private static final int ERR_CODE_ALIPAY_QUERY_TRANS_NOT_SUC = 10037;
    private static final int ERR_CODE_ALIPAY_QUERY_TRNAS_FAIL = 10036;
    private static final int ERR_CODE_ALREADY_BIND_HWID = 10033;
    private static final int ERR_CODE_ALREADY_BIND_WXID = 10034;
    private static final int ERR_CODE_BIND_HUAWEI_ORDER_USED = 10027;
    private static final int ERR_CODE_EMAIL_EXISTS = 10001;
    private static final int ERR_CODE_EMAIL_NOT_EXISTS = 10002;
    private static final int ERR_CODE_EMAIL_NOT_VERIFY = 10008;
    private static final int ERR_CODE_EMAIL_VERIFY_EXPIRED = 10009;
    private static final int ERR_CODE_HWCODE_AUTH_FAILED = 10030;
    private static final int ERR_CODE_HWID_EXISTS = 10031;
    private static final int ERR_CODE_HWID_NOT_EXISTS = 10032;
    private static final int ERR_CODE_LOGIN_NOT_MATCH = 10006;
    private static final int ERR_CODE_LTOKEN_USER_NOT_EXISTS = 10015;
    private static final int ERR_CODE_NEW_EMAIL_VCODE_EXPIRED = 10020;
    private static final int ERR_CODE_NEW_EMAIL_VCODE_WRONG = 10018;
    private static final int ERR_CODE_ORI_EMAIL_VCODE_EXPIRED = 10019;
    private static final int ERR_CODE_ORI_EMAIL_VCODE_WRONG = 10017;
    private static final int ERR_CODE_REDEEM_CODE_NOT_EXISTS = 10022;
    private static final int ERR_CODE_REDEEM_CODE_USED = 10023;
    private static final int ERR_CODE_REDEEM_USER_ALREADY_LIFETIME = 10024;
    private static final int ERR_CODE_SEND_EMAIL_FAILED = 10005;
    private static final int ERR_CODE_TOKEN_EXPIRED = 10021;
    private static final int ERR_CODE_UNBIND_FAIL_ONLY_METHOD = 10026;
    private static final int ERR_CODE_USER_NOT_BOUND_EMAIL = 10016;
    private static final int ERR_CODE_VCODE_EXPIRED = 10011;
    private static final int ERR_CODE_VCODE_NOT_EXPIRED = 10007;
    private static final int ERR_CODE_VCODE_WRONG = 10010;
    private static final int ERR_CODE_VERIFY_HUAWEI_ORDER_FAILED = 10029;
    private static final int ERR_CODE_VERIFY_HUAWEI_ORDER_NO_ACCESS_TOKEN = 10028;
    private static final int ERR_CODE_WXCODE_AUTH_FAILED = 10025;
    private static final int ERR_CODE_WXID_EXISTS = 10003;
    private static final int ERR_CODE_WXID_NOT_EXISTS = 10004;
    private static final int ERR_CODE_WX_PREPAY_FAIL = 10012;
    private static final int ERR_CODE_WX_QUERY_TRANS_FAIL = 10013;
    private static final int ERR_CODE_WX_QUERY_TRANS_NOT_SUC = 10014;
    private final int errCode;
    private final String msg;

    public ApiException(int i4, String str) {
        super(str);
        this.errCode = i4;
        this.msg = str;
    }

    public final int getErrCode() {
        return this.errCode;
    }

    public final String getMsg() {
        return this.msg;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ApiException(int i4, String str, int i10, f fVar) {
        if ((i10 & 2) != 0) {
            Companion.getClass();
            DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
            switch (i4) {
                case ERR_CODE_EMAIL_EXISTS /* 10001 */:
                    str = deviceInfoApp.getString(R.string.err_email_exists);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_EMAIL_NOT_EXISTS /* 10002 */:
                    str = deviceInfoApp.getString(R.string.email_not_exists);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_WXID_EXISTS /* 10003 */:
                    str = deviceInfoApp.getString(R.string.wxid_exist);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_WXID_NOT_EXISTS /* 10004 */:
                case ERR_CODE_HWID_NOT_EXISTS /* 10032 */:
                case 10035:
                default:
                    str = u.r(i4, "Api Error ");
                    break;
                case ERR_CODE_SEND_EMAIL_FAILED /* 10005 */:
                    str = deviceInfoApp.getString(R.string.err_send_email_failed);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_LOGIN_NOT_MATCH /* 10006 */:
                    str = deviceInfoApp.getString(R.string.login_not_match);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_VCODE_NOT_EXPIRED /* 10007 */:
                    str = deviceInfoApp.getString(R.string.err_vcode_not_expired);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_EMAIL_NOT_VERIFY /* 10008 */:
                    str = deviceInfoApp.getString(R.string.email_not_verify);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_EMAIL_VERIFY_EXPIRED /* 10009 */:
                    str = deviceInfoApp.getString(R.string.email_verify_expired);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_VCODE_WRONG /* 10010 */:
                    str = deviceInfoApp.getString(R.string.vcode_wrong);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_VCODE_EXPIRED /* 10011 */:
                    str = deviceInfoApp.getString(R.string.vcode_expired);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_WX_PREPAY_FAIL /* 10012 */:
                    str = deviceInfoApp.getString(R.string.wx_prepay_fail);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_WX_QUERY_TRANS_FAIL /* 10013 */:
                    str = deviceInfoApp.getString(R.string.query_wx_trans_fail);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_WX_QUERY_TRANS_NOT_SUC /* 10014 */:
                    str = deviceInfoApp.getString(R.string.query_wx_trans_not_suc);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_LTOKEN_USER_NOT_EXISTS /* 10015 */:
                    str = deviceInfoApp.getString(R.string.ltoken_expired);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_USER_NOT_BOUND_EMAIL /* 10016 */:
                    str = deviceInfoApp.getString(R.string.user_not_bound_email);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_ORI_EMAIL_VCODE_WRONG /* 10017 */:
                    str = deviceInfoApp.getString(R.string.ori_email_vcode_wrong);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_NEW_EMAIL_VCODE_WRONG /* 10018 */:
                    str = deviceInfoApp.getString(R.string.new_email_vcode_wrong);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_ORI_EMAIL_VCODE_EXPIRED /* 10019 */:
                    str = deviceInfoApp.getString(R.string.ori_email_vcode_expired);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_NEW_EMAIL_VCODE_EXPIRED /* 10020 */:
                    str = deviceInfoApp.getString(R.string.new_email_vcode_expired);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_TOKEN_EXPIRED /* 10021 */:
                    str = deviceInfoApp.getString(R.string.ltoken_expired);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_REDEEM_CODE_NOT_EXISTS /* 10022 */:
                case ERR_CODE_REDEEM_CODE_USED /* 10023 */:
                    str = deviceInfoApp.getString(R.string.redeem_code_invalidate);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_REDEEM_USER_ALREADY_LIFETIME /* 10024 */:
                    str = deviceInfoApp.getString(R.string.lifetime_user_no_needed_redeem_tip_use_code_future);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_WXCODE_AUTH_FAILED /* 10025 */:
                    str = deviceInfoApp.getString(R.string.wxcode_auth_failed);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_UNBIND_FAIL_ONLY_METHOD /* 10026 */:
                    str = deviceInfoApp.getString(R.string.unbind_fail_only_method);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_BIND_HUAWEI_ORDER_USED /* 10027 */:
                    str = deviceInfoApp.getString(R.string.hw_order_already_used);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_VERIFY_HUAWEI_ORDER_NO_ACCESS_TOKEN /* 10028 */:
                case ERR_CODE_VERIFY_HUAWEI_ORDER_FAILED /* 10029 */:
                    str = deviceInfoApp.getString(R.string.verify_hw_order_failed);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_HWCODE_AUTH_FAILED /* 10030 */:
                    str = deviceInfoApp.getString(R.string.hwcode_auth_failed);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_HWID_EXISTS /* 10031 */:
                    str = deviceInfoApp.getString(R.string.hwid_exist);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_ALREADY_BIND_HWID /* 10033 */:
                    str = deviceInfoApp.getString(R.string.bind_hwid_failed_already_has_bound_hwid);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_ALREADY_BIND_WXID /* 10034 */:
                    str = deviceInfoApp.getString(R.string.bind_wxid_failed_already_has_bound_wxid);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_ALIPAY_QUERY_TRNAS_FAIL /* 10036 */:
                    str = deviceInfoApp.getString(R.string.query_alipay_trans_fail);
                    k.d(str, "getString(...)");
                    break;
                case ERR_CODE_ALIPAY_QUERY_TRANS_NOT_SUC /* 10037 */:
                    str = deviceInfoApp.getString(R.string.query_alipay_trans_not_suc);
                    k.d(str, "getString(...)");
                    break;
            }
        }
        this(i4, str);
    }
}
