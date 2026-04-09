package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tl1 implements l91 {

    /* renamed from: a, reason: collision with root package name */
    public final l91 f16879a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f16880b = Uri.EMPTY;

    public tl1(l91 l91Var) {
        this.f16879a = l91Var;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final Map A1() {
        return this.f16879a.A1();
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final long a(gb1 gb1Var) {
        l91 l91Var = this.f16879a;
        this.f16880b = gb1Var.f11479a;
        Map map = Collections.EMPTY_MAP;
        try {
            long jA = l91Var.a(gb1Var);
            Uri uriZzc = l91Var.zzc();
            if (uriZzc != null) {
                this.f16880b = uriZzc;
            }
            l91Var.A1();
            return jA;
        } catch (Throwable th2) {
            Uri uriZzc2 = l91Var.zzc();
            if (uriZzc2 != null) {
                this.f16880b = uriZzc2;
            }
            l91Var.A1();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void b(hm1 hm1Var) {
        hm1Var.getClass();
        this.f16879a.b(hm1Var);
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public final int d(int i4, int i10, byte[] bArr) {
        return this.f16879a.d(i4, i10, bArr);
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void f() {
        this.f16879a.f();
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final Uri zzc() {
        return this.f16879a.zzc();
    }
}
