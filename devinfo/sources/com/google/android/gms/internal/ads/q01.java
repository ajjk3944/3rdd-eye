package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class q01 implements e81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t01 f15183b;

    public /* synthetic */ q01(t01 t01Var, int i4) {
        this.f15182a = i4;
        this.f15183b = t01Var;
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final /* synthetic */ vd.b c(Object obj) {
        switch (this.f15182a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                t01 t01Var = this.f15183b;
                if (zBooleanValue) {
                    return t01Var.b(0);
                }
                t01Var.f16629d.b(1003);
                return yo0.e(s01.f15823b);
            default:
                xy0 xy0Var = (xy0) obj;
                i11 i11Var = this.f15183b.f16628c;
                if (xy0Var.H() == 2) {
                    return i11Var.e(xy0Var.A(), xy0Var.B().y());
                }
                if (xy0Var.H() == 3) {
                    return i11Var.d(xy0Var.A(), xy0Var.C().y(), xy0Var.B().y());
                }
                throw new AssertionError("Unreachable");
        }
    }
}
