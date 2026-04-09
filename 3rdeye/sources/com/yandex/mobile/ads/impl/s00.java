package com.yandex.mobile.ads.impl;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public final class s00 implements z02 {

    /* renamed from: a, reason: collision with root package name */
    private final a f32828a;

    /* renamed from: b, reason: collision with root package name */
    private z02 f32829b;

    public interface a {
        boolean a(SSLSocket sSLSocket);

        qd b(SSLSocket sSLSocket);
    }

    public s00(pd socketAdapterFactory) {
        kotlin.jvm.internal.l.f(socketAdapterFactory, "socketAdapterFactory");
        this.f32828a = socketAdapterFactory;
    }

    @Override // com.yandex.mobile.ads.impl.z02
    public final boolean a() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.z02
    public final String b(SSLSocket sslSocket) {
        z02 z02Var;
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        synchronized (this) {
            try {
                if (this.f32829b == null && this.f32828a.a(sslSocket)) {
                    this.f32829b = this.f32828a.b(sslSocket);
                }
                z02Var = this.f32829b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z02Var != null) {
            return z02Var.b(sslSocket);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z02
    public final void a(SSLSocket sslSocket, String str, List<? extends gm1> protocols) {
        z02 z02Var;
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        kotlin.jvm.internal.l.f(protocols, "protocols");
        synchronized (this) {
            try {
                if (this.f32829b == null && this.f32828a.a(sslSocket)) {
                    this.f32829b = this.f32828a.b(sslSocket);
                }
                z02Var = this.f32829b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z02Var != null) {
            z02Var.a(sslSocket, str, protocols);
        }
    }

    @Override // com.yandex.mobile.ads.impl.z02
    public final boolean a(SSLSocket sslSocket) {
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        return this.f32828a.a(sslSocket);
    }
}
