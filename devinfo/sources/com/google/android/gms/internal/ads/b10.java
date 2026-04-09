package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b10 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final a10 f9543a;

    public b10(a10 a10Var) {
        this.f9543a = a10Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String a() {
        va.l2 liteSdkVersion;
        va.d1 d1Var = (va.d1) pq0.o(this.f9543a.b()).f15074c;
        if (d1Var != null) {
            try {
                liteSdkVersion = d1Var.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        } else {
            liteSdkVersion = null;
        }
        if (liteSdkVersion != null) {
            return liteSdkVersion.f36136c;
        }
        return null;
    }
}
