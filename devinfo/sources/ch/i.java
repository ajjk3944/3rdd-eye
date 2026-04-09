package ch;

import com.liuzh.deviceinfo.pro.account.mode.User;
import mm.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public interface i {
    @o("api/verify_hw_order")
    @mm.e
    Object a(@mm.c("ltoken") String str, @mm.c("order_token") String str2, @mm.c("sku_id") long j, ck.c<? super fh.e<User>> cVar);

    @o("api/commit_hw_order")
    @mm.e
    Object b(@mm.c("ltoken") String str, @mm.c("order_token") String str2, ck.c<? super fh.e<?>> cVar);

    @o("api/alipay")
    @mm.e
    Object c(@mm.c("ltoken") String str, @mm.c("sku_id") long j, ck.c<? super fh.e<fh.b>> cVar);

    @o("api/wxpay")
    @mm.e
    Object d(@mm.c("ltoken") String str, @mm.c("sku_id") long j, ck.c<? super fh.e<fh.i>> cVar);
}
