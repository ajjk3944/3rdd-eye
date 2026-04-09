package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class w0 extends e1 {
    public final /* synthetic */ String B;
    public final /* synthetic */ i1 D;
    public final /* synthetic */ Object E;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5242x = 2;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f5243y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(i1 i1Var, zzdf zzdfVar, String str, String str2) {
        super(i1Var, true);
        this.E = zzdfVar;
        this.f5243y = str;
        this.B = str2;
        Objects.requireNonNull(i1Var);
        this.D = i1Var;
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final void a() {
        switch (this.f5242x) {
            case 0:
                k0 k0Var = this.D.f5072f;
                cc.s.h(k0Var);
                k0Var.clearConditionalUserProperty(this.f5243y, this.B, (Bundle) this.E);
                break;
            case 1:
                k0 k0Var2 = this.D.f5072f;
                cc.s.h(k0Var2);
                k0Var2.getConditionalUserProperties(this.f5243y, this.B, (h0) this.E);
                break;
            default:
                k0 k0Var3 = this.D.f5072f;
                cc.s.h(k0Var3);
                k0Var3.setCurrentScreenByScionActivityInfo((zzdf) this.E, this.f5243y, this.B, this.f4963a);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public void b() {
        switch (this.f5242x) {
            case 1:
                ((h0) this.E).C(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(i1 i1Var, String str, String str2, Bundle bundle) {
        super(i1Var, true);
        this.f5243y = str;
        this.B = str2;
        this.E = bundle;
        Objects.requireNonNull(i1Var);
        this.D = i1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(i1 i1Var, String str, String str2, h0 h0Var) {
        super(i1Var, true);
        this.f5243y = str;
        this.B = str2;
        this.E = h0Var;
        Objects.requireNonNull(i1Var);
        this.D = i1Var;
    }
}
