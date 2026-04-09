package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class vh0 {
    public static hk a(Context context, SSLSocketFactory sSLSocketFactory) {
        kotlin.jvm.internal.l.f(context, "context");
        du1 du1VarA = ew1.a.a().a(context);
        return (du1VarA == null || !du1VarA.E0()) ? new uh0(sSLSocketFactory) : new wh0(sSLSocketFactory);
    }
}
