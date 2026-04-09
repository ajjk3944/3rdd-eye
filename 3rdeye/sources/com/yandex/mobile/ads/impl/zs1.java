package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class zs1 implements ys1 {

    /* renamed from: a, reason: collision with root package name */
    private final ew1 f36613a;

    public zs1(ew1 sdkSettings) {
        kotlin.jvm.internal.l.f(sdkSettings, "sdkSettings");
        this.f36613a = sdkSettings;
    }

    @Override // com.yandex.mobile.ads.impl.ys1
    public final SSLSocketFactory a(Context context) throws NoSuchAlgorithmException, KeyManagementException {
        kotlin.jvm.internal.l.f(context, "context");
        du1 du1VarA = this.f36613a.a(context);
        cu1 cu1Var = new cu1(context);
        if (du1VarA != null && du1VarA.r0()) {
            iw1 trustManager = cr0.a(cu1Var);
            kotlin.jvm.internal.l.f(trustManager, "trustManager");
            SSLSocketFactory socketFactory = new ws1(trustManager).a().getSocketFactory();
            kotlin.jvm.internal.l.e(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        }
        if (!ba.a(21)) {
            return null;
        }
        int i = sj1.f33090b;
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
            try {
                sSLContext.init(null, null, null);
            } catch (KeyManagementException e4) {
                fp0.b(e4.getMessage());
            }
            SSLSocketFactory socketFactory2 = sSLContext.getSocketFactory();
            kotlin.jvm.internal.l.e(socketFactory2, "getSocketFactory(...)");
            return new sj1(socketFactory2);
        } catch (NoSuchAlgorithmException e10) {
            fp0.b("TLSv1.2", e10.getMessage());
            return null;
        }
    }
}
