package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c90 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10019a;

    /* renamed from: b, reason: collision with root package name */
    public final l90 f10020b;

    public /* synthetic */ c90(l90 l90Var, int i4) {
        this.f10019a = i4;
        this.f10020b = l90Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f10019a) {
            case 0:
                qz qzVar = (qz) this.f10020b.f13427c;
                if (qzVar == null) {
                    return null;
                }
                return qzVar.i();
            case 1:
                qz qzVar2 = (qz) this.f10020b.f13427c;
                if (qzVar2 != null) {
                    return qzVar2.i();
                }
                return null;
            default:
                return (qz) this.f10020b.f13427c;
        }
    }
}
