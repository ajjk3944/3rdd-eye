package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y0 extends g1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20040e = 2;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f20041f;
    public final /* synthetic */ String g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k1 f20042h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f20043i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(k1 k1Var, v0 v0Var, String str, String str2) {
        super(k1Var, true);
        this.f20043i = v0Var;
        this.f20041f = str;
        this.g = str2;
        Objects.requireNonNull(k1Var);
        this.f20042h = k1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        switch (this.f20040e) {
            case 0:
                j0 j0Var = this.f20042h.f19799f;
                pb.y.h(j0Var);
                j0Var.clearConditionalUserProperty(this.f20041f, this.g, (Bundle) this.f20043i);
                break;
            case 1:
                j0 j0Var2 = this.f20042h.f19799f;
                pb.y.h(j0Var2);
                j0Var2.getConditionalUserProperties(this.f20041f, this.g, (g0) this.f20043i);
                break;
            default:
                j0 j0Var3 = this.f20042h.f19799f;
                pb.y.h(j0Var3);
                j0Var3.setCurrentScreenByScionActivityInfo((v0) this.f20043i, this.f20041f, this.g, this.f19750a);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public void b() {
        switch (this.f20040e) {
            case 1:
                ((g0) this.f20043i).X2(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(k1 k1Var, String str, String str2, Bundle bundle) {
        super(k1Var, true);
        this.f20041f = str;
        this.g = str2;
        this.f20043i = bundle;
        Objects.requireNonNull(k1Var);
        this.f20042h = k1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(k1 k1Var, String str, String str2, g0 g0Var) {
        super(k1Var, true);
        this.f20041f = str;
        this.g = str2;
        this.f20043i = g0Var;
        Objects.requireNonNull(k1Var);
        this.f20042h = k1Var;
    }
}
