package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.uq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1981uq extends B7 implements InterfaceC1429kd {

    /* renamed from: a, reason: collision with root package name */
    public final C1119eq f17174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2035vq f17175b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1981uq(C2035vq c2035vq, C1119eq c1119eq) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
        this.f17175b = c2035vq;
        this.f17174a = c1119eq;
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        C0705Rc c0705Rc;
        if (i == 1) {
            S2.a aVarD1 = S2.b.d1(parcel.readStrongBinder());
            C7.f(parcel);
            p0(aVarD1);
        } else if (i == 2) {
            String string = parcel.readString();
            C7.f(parcel);
            ((BinderC2251zq) this.f17174a.f13988c).D3(0, string);
        } else if (i == 3) {
            C2852x0 c2852x0 = (C2852x0) C7.b(parcel, C2852x0.CREATOR);
            C7.f(parcel);
            a(c2852x0);
        } else {
            if (i != 4) {
                return false;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c0705Rc = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
                c0705Rc = iInterfaceQueryLocalInterface instanceof C0705Rc ? (C0705Rc) iInterfaceQueryLocalInterface : new C0705Rc(strongBinder);
            }
            C7.f(parcel);
            this.f17175b.f17349e = c0705Rc;
            ((BinderC2251zq) this.f17174a.f13988c).h();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1429kd
    public final void a(C2852x0 c2852x0) {
        ((BinderC2251zq) this.f17174a.f13988c).d3(c2852x0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1429kd
    public final void p0(S2.a aVar) {
        this.f17175b.f17348d = (View) S2.b.n1(aVar);
        ((BinderC2251zq) this.f17174a.f13988c).h();
    }
}
