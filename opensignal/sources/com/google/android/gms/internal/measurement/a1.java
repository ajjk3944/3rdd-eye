package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class a1 extends e1 {
    public final /* synthetic */ i1 B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f4904x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h0 f4905y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(i1 i1Var, h0 h0Var, int i10) {
        super(i1Var, true);
        this.f4904x = i10;
        this.f4905y = h0Var;
        this.B = i1Var;
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final void a() {
        switch (this.f4904x) {
            case 0:
                k0 k0Var = this.B.f5072f;
                cc.s.h(k0Var);
                k0Var.getGmpAppId(this.f4905y);
                break;
            case 1:
                k0 k0Var2 = this.B.f5072f;
                cc.s.h(k0Var2);
                k0Var2.getCachedAppInstanceId(this.f4905y);
                break;
            case 2:
                k0 k0Var3 = this.B.f5072f;
                cc.s.h(k0Var3);
                k0Var3.generateEventId(this.f4905y);
                break;
            case 3:
                k0 k0Var4 = this.B.f5072f;
                cc.s.h(k0Var4);
                k0Var4.getCurrentScreenName(this.f4905y);
                break;
            default:
                k0 k0Var5 = this.B.f5072f;
                cc.s.h(k0Var5);
                k0Var5.getCurrentScreenClass(this.f4905y);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final void b() {
        switch (this.f4904x) {
            case 0:
                this.f4905y.C(null);
                break;
            case 1:
                this.f4905y.C(null);
                break;
            case 2:
                this.f4905y.C(null);
                break;
            case 3:
                this.f4905y.C(null);
                break;
            default:
                this.f4905y.C(null);
                break;
        }
    }
}
