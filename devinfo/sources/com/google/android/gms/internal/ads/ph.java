package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ph extends mg implements yh {

    /* renamed from: a, reason: collision with root package name */
    public qi.d f15004a;

    @Override // com.google.android.gms.internal.ads.yh
    public final void Q(va.w1 w1Var) {
        qi.d dVar = this.f15004a;
        if (dVar != null) {
            dVar.d(w1Var.a());
        }
    }

    @Override // com.google.android.gms.internal.ads.yh
    public final void e() {
        qi.d dVar = this.f15004a;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.yh
    public final void f() {
        qi.d dVar = this.f15004a;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            h();
        } else if (i4 == 2) {
            f();
        } else if (i4 == 3) {
            va.w1 w1Var = (va.w1) ng.b(parcel, va.w1.CREATOR);
            ng.f(parcel);
            Q(w1Var);
        } else if (i4 != 4) {
            if (i4 != 5) {
                return false;
            }
            e();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.yh
    public final void h() {
        qi.d dVar = this.f15004a;
        if (dVar != null) {
            dVar.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.yh
    public final void d() {
    }
}
