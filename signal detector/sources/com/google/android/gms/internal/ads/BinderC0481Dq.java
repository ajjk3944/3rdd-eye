package com.google.android.gms.internal.ads;

import android.os.Parcel;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.Dq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0481Dq extends B7 implements InterfaceC1537md {

    /* renamed from: a, reason: collision with root package name */
    public final C1119eq f7846a;

    public BinderC0481Dq(C1712pq c1712pq, C1119eq c1119eq) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
        this.f7846a = c1119eq;
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            b();
        } else if (i == 3) {
            String string = parcel.readString();
            C7.f(parcel);
            ((BinderC2251zq) this.f7846a.f13988c).D3(0, string);
        } else {
            if (i != 4) {
                return false;
            }
            C2852x0 c2852x0 = (C2852x0) C7.b(parcel, C2852x0.CREATOR);
            C7.f(parcel);
            a(c2852x0);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1537md
    public final void a(C2852x0 c2852x0) {
        ((BinderC2251zq) this.f7846a.f13988c).d3(c2852x0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1537md
    public final void b() {
        ((BinderC2251zq) this.f7846a.f13988c).h();
    }
}
