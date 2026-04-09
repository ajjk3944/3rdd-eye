package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z50 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19020a;

    /* renamed from: b, reason: collision with root package name */
    public final y50 f19021b;

    public /* synthetic */ z50(y50 y50Var, int i4) {
        this.f19020a = i4;
        this.f19021b = y50Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f19020a) {
            case 0:
                return (Bundle) this.f19021b.f18644c;
            case 1:
                return Integer.valueOf(this.f19021b.g);
            case 2:
                return (eq0) this.f19021b.f18645d;
            default:
                return this.f19021b.b();
        }
    }
}
