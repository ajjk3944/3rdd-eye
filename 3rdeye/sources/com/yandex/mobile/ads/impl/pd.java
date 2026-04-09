package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qd;
import com.yandex.mobile.ads.impl.s00;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public final class pd implements s00.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f31716a = "com.google.android.gms.org.conscrypt";

    @Override // com.yandex.mobile.ads.impl.s00.a
    public final boolean a(SSLSocket sslSocket) {
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        return y9.n.a0(sslSocket.getClass().getName(), this.f31716a + ".", false);
    }

    @Override // com.yandex.mobile.ads.impl.s00.a
    public final qd b(SSLSocket sslSocket) {
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        int i = qd.f32142g;
        return qd.a.b(sslSocket.getClass());
    }
}
