package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c1 extends g1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19638e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0 f19639f;
    public final /* synthetic */ k1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(k1 k1Var, g0 g0Var, int i4) {
        super(k1Var, true);
        this.f19638e = i4;
        this.f19639f = g0Var;
        this.g = k1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        switch (this.f19638e) {
            case 0:
                j0 j0Var = this.g.f19799f;
                pb.y.h(j0Var);
                j0Var.getGmpAppId(this.f19639f);
                break;
            case 1:
                j0 j0Var2 = this.g.f19799f;
                pb.y.h(j0Var2);
                j0Var2.getCachedAppInstanceId(this.f19639f);
                break;
            case 2:
                j0 j0Var3 = this.g.f19799f;
                pb.y.h(j0Var3);
                j0Var3.generateEventId(this.f19639f);
                break;
            case 3:
                j0 j0Var4 = this.g.f19799f;
                pb.y.h(j0Var4);
                j0Var4.getCurrentScreenName(this.f19639f);
                break;
            default:
                j0 j0Var5 = this.g.f19799f;
                pb.y.h(j0Var5);
                j0Var5.getCurrentScreenClass(this.f19639f);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void b() {
        switch (this.f19638e) {
            case 0:
                this.f19639f.X2(null);
                break;
            case 1:
                this.f19639f.X2(null);
                break;
            case 2:
                this.f19639f.X2(null);
                break;
            case 3:
                this.f19639f.X2(null);
                break;
            default:
                this.f19639f.X2(null);
                break;
        }
    }
}
