package ch;

import com.liuzh.deviceinfo.pro.account.mode.LoginData;
import com.liuzh.deviceinfo.pro.account.mode.User;
import mm.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public interface f {
    @o("api/userinfo")
    @mm.e
    Object a(@mm.c("ltoken") String str, @mm.c("sync_order") int i4, ck.c<? super fh.e<User>> cVar);

    @o("api/get_vcode")
    @mm.e
    Object b(@mm.c("ltoken") String str, @mm.c("vtype") int i4, @mm.c("language") String str2, ck.c<? super fh.e<?>> cVar);

    @o("api/verify_email")
    @mm.e
    Object c(@mm.c("email") String str, @mm.c("vcode") String str2, @mm.c("vtype") int i4, @mm.c("language") String str3, ck.c<? super fh.e<?>> cVar);

    @o("api/get_vcode")
    @mm.e
    Object d(@mm.c("email") String str, @mm.c("vtype") int i4, @mm.c("language") String str2, ck.c<? super fh.e<?>> cVar);

    @o("api/edit_userinfo")
    @mm.e
    Object e(@mm.c("ltoken") String str, @mm.c("nickname") String str2, ck.c<? super fh.e<User>> cVar);

    @o("api/redeem")
    @mm.e
    Object f(@mm.c("ltoken") String str, @mm.c("code") String str2, ck.c<? super fh.e<fh.h>> cVar);

    @o("api/bind_huawei_order")
    @mm.e
    Object g(@mm.c("ltoken") String str, @mm.c("order_token") String str2, ck.c<? super fh.e<fh.f>> cVar);

    @o("api/delete_account")
    @mm.e
    Object h(@mm.c("ltoken") String str, ck.c<? super fh.e<?>> cVar);

    @o("api/resetpwd")
    @mm.e
    Object i(@mm.c("email") String str, @mm.c("vcode") String str2, @mm.c("password") String str3, ck.c<? super fh.e<?>> cVar);

    @o("api/get_vcode")
    @mm.e
    Object j(@mm.c("ltoken") String str, @mm.c("email") String str2, @mm.c("vtype") int i4, @mm.c("language") String str3, ck.c<? super fh.e<?>> cVar);

    @o("api/register")
    @mm.e
    Object k(@mm.c("email") String str, @mm.c("vcode") String str2, @mm.c("password") String str3, @mm.c("rtype") int i4, ck.c<? super fh.e<LoginData>> cVar);

    @o("api/bind_email")
    @mm.e
    Object l(@mm.c("ltoken") String str, @mm.c("vcode_ori") String str2, @mm.c("email") String str3, @mm.c("vcode_new") String str4, @mm.c("password") String str5, ck.c<? super fh.e<User>> cVar);
}
