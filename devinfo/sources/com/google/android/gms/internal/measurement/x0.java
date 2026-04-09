package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x0 extends g1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f20029f;
    public final /* synthetic */ k1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(k1 k1Var, Bundle bundle, int i4) {
        super(k1Var, true);
        this.f20028e = i4;
        switch (i4) {
            case 1:
                this.f20029f = bundle;
                Objects.requireNonNull(k1Var);
                this.g = k1Var;
                super(k1Var, true);
                break;
            default:
                this.f20029f = bundle;
                Objects.requireNonNull(k1Var);
                this.g = k1Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        switch (this.f20028e) {
            case 0:
                j0 j0Var = this.g.f19799f;
                pb.y.h(j0Var);
                j0Var.setConditionalUserProperty(this.f20029f, this.f19750a);
                break;
            default:
                j0 j0Var2 = this.g.f19799f;
                pb.y.h(j0Var2);
                j0Var2.setConsentThirdParty(this.f20029f, this.f19750a);
                break;
        }
    }
}
