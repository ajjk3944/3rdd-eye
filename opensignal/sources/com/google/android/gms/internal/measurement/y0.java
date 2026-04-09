package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class y0 extends e1 {
    public final /* synthetic */ i1 B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5265x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f5266y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(i1 i1Var, String str, int i10) {
        super(i1Var, true);
        this.f5265x = i10;
        this.f5266y = str;
        this.B = i1Var;
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final void a() {
        switch (this.f5265x) {
            case 0:
                k0 k0Var = this.B.f5072f;
                cc.s.h(k0Var);
                k0Var.beginAdUnitExposure(this.f5266y, this.f4964d);
                break;
            default:
                k0 k0Var2 = this.B.f5072f;
                cc.s.h(k0Var2);
                k0Var2.endAdUnitExposure(this.f5266y, this.f4964d);
                break;
        }
    }
}
