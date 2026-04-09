package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* loaded from: classes.dex */
public final class g1 extends e1 {
    public final /* synthetic */ h1 B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5039x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Activity f5040y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(h1 h1Var, Activity activity, int i10) {
        super(h1Var.f5053a, true);
        this.f5039x = i10;
        switch (i10) {
            case 1:
                this.f5040y = activity;
                this.B = h1Var;
                super(h1Var.f5053a, true);
                break;
            case 2:
                this.f5040y = activity;
                this.B = h1Var;
                super(h1Var.f5053a, true);
                break;
            case 3:
                this.f5040y = activity;
                this.B = h1Var;
                super(h1Var.f5053a, true);
                break;
            case 4:
                this.f5040y = activity;
                this.B = h1Var;
                super(h1Var.f5053a, true);
                break;
            default:
                this.f5040y = activity;
                this.B = h1Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final void a() {
        switch (this.f5039x) {
            case 0:
                k0 k0Var = this.B.f5053a.f5072f;
                cc.s.h(k0Var);
                k0Var.onActivityStartedByScionActivityInfo(zzdf.d(this.f5040y), this.f4964d);
                break;
            case 1:
                k0 k0Var2 = this.B.f5053a.f5072f;
                cc.s.h(k0Var2);
                k0Var2.onActivityResumedByScionActivityInfo(zzdf.d(this.f5040y), this.f4964d);
                break;
            case 2:
                k0 k0Var3 = this.B.f5053a.f5072f;
                cc.s.h(k0Var3);
                k0Var3.onActivityPausedByScionActivityInfo(zzdf.d(this.f5040y), this.f4964d);
                break;
            case 3:
                k0 k0Var4 = this.B.f5053a.f5072f;
                cc.s.h(k0Var4);
                k0Var4.onActivityStoppedByScionActivityInfo(zzdf.d(this.f5040y), this.f4964d);
                break;
            default:
                k0 k0Var5 = this.B.f5053a.f5072f;
                cc.s.h(k0Var5);
                k0Var5.onActivityDestroyedByScionActivityInfo(zzdf.d(this.f5040y), this.f4964d);
                break;
        }
    }
}
