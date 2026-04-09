package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.lefan.signal.MyApplication;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.e8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1083e8 extends B7 implements InterfaceC1569n8 {

    /* renamed from: a, reason: collision with root package name */
    public com.google.ads.mediation.d f13872a;

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i == 2) {
                m();
            } else if (i == 3) {
                C2852x0 c2852x0 = (C2852x0) C7.b(parcel, C2852x0.CREATOR);
                C7.f(parcel);
                c0(c2852x0);
            } else if (i != 4) {
                if (i != 5) {
                    return false;
                }
                e();
            }
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1569n8
    public final void c0(C2852x0 c2852x0) {
        com.google.ads.mediation.d dVar = this.f13872a;
        if (dVar != null) {
            dVar.d(c2852x0.a());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1569n8
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1569n8
    public final void e() {
        if (this.f13872a != null) {
            MyApplication.f18812d = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1569n8
    public final void m() {
        com.google.ads.mediation.d dVar = this.f13872a;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1569n8
    public final void s() {
    }
}
