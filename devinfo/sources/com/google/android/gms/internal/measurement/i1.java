package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i1 extends g1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f19778f;
    public final /* synthetic */ j1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(j1 j1Var, Activity activity, int i4) {
        super(j1Var.f19787a, true);
        this.f19777e = i4;
        switch (i4) {
            case 1:
                this.f19778f = activity;
                this.g = j1Var;
                super(j1Var.f19787a, true);
                break;
            case 2:
                this.f19778f = activity;
                this.g = j1Var;
                super(j1Var.f19787a, true);
                break;
            case 3:
                this.f19778f = activity;
                this.g = j1Var;
                super(j1Var.f19787a, true);
                break;
            case 4:
                this.f19778f = activity;
                this.g = j1Var;
                super(j1Var.f19787a, true);
                break;
            default:
                this.f19778f = activity;
                this.g = j1Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        switch (this.f19777e) {
            case 0:
                j0 j0Var = this.g.f19787a.f19799f;
                pb.y.h(j0Var);
                j0Var.onActivityStartedByScionActivityInfo(v0.a(this.f19778f), this.f19751b);
                break;
            case 1:
                j0 j0Var2 = this.g.f19787a.f19799f;
                pb.y.h(j0Var2);
                j0Var2.onActivityResumedByScionActivityInfo(v0.a(this.f19778f), this.f19751b);
                break;
            case 2:
                j0 j0Var3 = this.g.f19787a.f19799f;
                pb.y.h(j0Var3);
                j0Var3.onActivityPausedByScionActivityInfo(v0.a(this.f19778f), this.f19751b);
                break;
            case 3:
                j0 j0Var4 = this.g.f19787a.f19799f;
                pb.y.h(j0Var4);
                j0Var4.onActivityStoppedByScionActivityInfo(v0.a(this.f19778f), this.f19751b);
                break;
            default:
                j0 j0Var5 = this.g.f19787a.f19799f;
                pb.y.h(j0Var5);
                j0Var5.onActivityDestroyedByScionActivityInfo(v0.a(this.f19778f), this.f19751b);
                break;
        }
    }
}
