package com.google.android.gms.internal.measurement;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z0 extends g1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k1 f20058f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(k1 k1Var, Object obj, int i4) {
        super(k1Var, true);
        this.f20057e = i4;
        this.g = obj;
        this.f20058f = k1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        switch (this.f20057e) {
            case 0:
                j0 j0Var = this.f20058f.f19799f;
                pb.y.h(j0Var);
                j0Var.setMeasurementEnabled(((Boolean) this.g).booleanValue(), this.f19750a);
                break;
            case 1:
                j0 j0Var2 = this.f20058f.f19799f;
                pb.y.h(j0Var2);
                j0Var2.retrieveAndUploadBatches(new b1(this, (vd.a) this.g));
                break;
            case 2:
                j0 j0Var3 = this.f20058f.f19799f;
                pb.y.h(j0Var3);
                j0Var3.logHealthData(5, "Error with data collection. Data lost.", new vb.b((Exception) this.g), new vb.b(null), new vb.b(null));
                break;
            default:
                j0 j0Var4 = this.f20058f.f19799f;
                pb.y.h(j0Var4);
                j0Var4.registerOnMeasurementEventListener((h1) this.g);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(k1 k1Var, Boolean bool) {
        super(k1Var, true);
        this.f20057e = 0;
        this.g = bool;
        Objects.requireNonNull(k1Var);
        this.f20058f = k1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(k1 k1Var, Exception exc) {
        super(k1Var, false);
        this.f20057e = 2;
        this.g = exc;
        this.f20058f = k1Var;
    }
}
