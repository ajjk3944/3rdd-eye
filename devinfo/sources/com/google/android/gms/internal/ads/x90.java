package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x90 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18329a;

    /* renamed from: b, reason: collision with root package name */
    public final m20 f18330b;

    public /* synthetic */ x90(m20 m20Var, int i4) {
        this.f18329a = i4;
        this.f18330b = m20Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f18329a) {
            case 0:
                return new w90(this.f18330b.b());
            default:
                return new mc0(this.f18330b.b());
        }
    }
}
