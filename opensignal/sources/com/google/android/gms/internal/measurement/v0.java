package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v0 extends e1 {
    public final /* synthetic */ Object B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5227x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i1 f5228y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(i1 i1Var, Object obj, int i10) {
        super(i1Var, true);
        this.f5227x = i10;
        this.B = obj;
        this.f5228y = i1Var;
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final void a() {
        switch (this.f5227x) {
            case 0:
                k0 k0Var = this.f5228y.f5072f;
                cc.s.h(k0Var);
                k0Var.setUserProperty("fcm", "_ln", new jc.d(this.B), true, this.f4963a);
                break;
            case 1:
                k0 k0Var2 = this.f5228y.f5072f;
                cc.s.h(k0Var2);
                k0Var2.setConditionalUserProperty((Bundle) this.B, this.f4963a);
                break;
            case 2:
                k0 k0Var3 = this.f5228y.f5072f;
                cc.s.h(k0Var3);
                k0Var3.retrieveAndUploadBatches(new z0(this, (zc.z1) this.B));
                break;
            case 3:
                k0 k0Var4 = this.f5228y.f5072f;
                cc.s.h(k0Var4);
                k0Var4.logHealthData(5, "Error with data collection. Data lost.", new jc.d((Exception) this.B), new jc.d(null), new jc.d(null));
                break;
            default:
                k0 k0Var5 = this.f5228y.f5072f;
                cc.s.h(k0Var5);
                k0Var5.registerOnMeasurementEventListener((f1) this.B);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(i1 i1Var, Bundle bundle) {
        super(i1Var, true);
        this.f5227x = 1;
        this.B = bundle;
        Objects.requireNonNull(i1Var);
        this.f5228y = i1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(i1 i1Var, Exception exc) {
        super(i1Var, false);
        this.f5227x = 3;
        this.B = exc;
        this.f5228y = i1Var;
    }
}
