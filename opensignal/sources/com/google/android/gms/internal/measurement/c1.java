package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c1 extends e1 {
    public final /* synthetic */ String B;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ i1 E;
    public final /* synthetic */ Object F;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f4926x = 1;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f4927y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(i1 i1Var, String str, String str2, Bundle bundle, boolean z10) {
        super(i1Var, true);
        this.f4927y = str;
        this.B = str2;
        this.F = bundle;
        this.D = z10;
        this.E = i1Var;
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final void a() {
        switch (this.f4926x) {
            case 0:
                k0 k0Var = this.E.f5072f;
                cc.s.h(k0Var);
                k0Var.getUserProperties(this.f4927y, this.B, this.D, (h0) this.F);
                break;
            default:
                long j = this.f4963a;
                k0 k0Var2 = this.E.f5072f;
                cc.s.h(k0Var2);
                k0Var2.logEvent(this.f4927y, this.B, (Bundle) this.F, this.D, true, j);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public void b() {
        switch (this.f4926x) {
            case 0:
                ((h0) this.F).C(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(i1 i1Var, String str, String str2, boolean z10, h0 h0Var) {
        super(i1Var, true);
        this.f4927y = str;
        this.B = str2;
        this.D = z10;
        this.F = h0Var;
        Objects.requireNonNull(i1Var);
        this.E = i1Var;
    }
}
