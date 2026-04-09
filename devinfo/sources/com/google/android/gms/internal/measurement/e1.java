package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e1 extends g1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19668e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f19669f;
    public final /* synthetic */ String g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f19670h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k1 f19671i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(k1 k1Var, String str, String str2, Bundle bundle, boolean z3) {
        super(k1Var, true);
        this.f19669f = str;
        this.g = str2;
        this.j = bundle;
        this.f19670h = z3;
        this.f19671i = k1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        switch (this.f19668e) {
            case 0:
                j0 j0Var = this.f19671i.f19799f;
                pb.y.h(j0Var);
                j0Var.getUserProperties(this.f19669f, this.g, this.f19670h, (g0) this.j);
                break;
            default:
                long j = this.f19750a;
                j0 j0Var2 = this.f19671i.f19799f;
                pb.y.h(j0Var2);
                j0Var2.logEvent(this.f19669f, this.g, (Bundle) this.j, this.f19670h, true, j);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public void b() {
        switch (this.f19668e) {
            case 0:
                ((g0) this.j).X2(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(k1 k1Var, String str, String str2, boolean z3, g0 g0Var) {
        super(k1Var, true);
        this.f19669f = str;
        this.g = str2;
        this.f19670h = z3;
        this.j = g0Var;
        Objects.requireNonNull(k1Var);
        this.f19671i = k1Var;
    }
}
