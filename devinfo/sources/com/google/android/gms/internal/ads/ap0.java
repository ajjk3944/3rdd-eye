package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ap0 implements z21 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aw f9382b;

    public /* synthetic */ ap0(aw awVar, int i4) {
        this.f9381a = i4;
        this.f9382b = awVar;
    }

    @Override // com.google.android.gms.internal.ads.z21
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f9381a) {
            case 0:
                za.i.f("", (og0) obj);
                ya.a0.m("Failed to get a cache key, reverting to legacy flow.");
                aw awVar = this.f9382b;
                bp0 bp0Var = new bp0(null, awVar.w());
                awVar.f9454e = bp0Var;
                return bp0Var;
            default:
                iu iuVar = (iu) obj;
                bp0 bp0Var2 = new bp0(iuVar, new dr0(iuVar.j));
                this.f9382b.f9454e = bp0Var2;
                return bp0Var2;
        }
    }
}
