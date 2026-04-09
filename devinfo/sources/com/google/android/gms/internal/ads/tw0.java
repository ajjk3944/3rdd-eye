package com.google.android.gms.internal.ads;

import java.io.FileInputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tw0 implements p4.w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final tw0 f16979a = new tw0();

    /* renamed from: b, reason: collision with root package name */
    public static final rw0 f16980b;

    static {
        rw0 rw0VarD = rw0.D();
        nk.k.d(rw0VarD, "getDefaultInstance(...)");
        f16980b = rw0VarD;
    }

    @Override // p4.w0
    public final /* synthetic */ Object a() {
        return f16980b;
    }

    @Override // p4.w0
    public final Object b(FileInputStream fileInputStream) {
        try {
            return rw0.C(fileInputStream);
        } catch (Exception unused) {
            return f16980b;
        }
    }

    @Override // p4.w0
    public final /* synthetic */ void c(Object obj, hm.d dVar) {
        ((rw0) obj).c(dVar);
    }
}
