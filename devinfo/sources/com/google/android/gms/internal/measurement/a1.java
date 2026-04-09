package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a1 extends g1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f19606f;
    public final /* synthetic */ k1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(k1 k1Var, String str, int i4) {
        super(k1Var, true);
        this.f19605e = i4;
        this.f19606f = str;
        this.g = k1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        switch (this.f19605e) {
            case 0:
                j0 j0Var = this.g.f19799f;
                pb.y.h(j0Var);
                j0Var.beginAdUnitExposure(this.f19606f, this.f19751b);
                break;
            default:
                j0 j0Var2 = this.g.f19799f;
                pb.y.h(j0Var2);
                j0Var2.endAdUnitExposure(this.f19606f, this.f19751b);
                break;
        }
    }
}
