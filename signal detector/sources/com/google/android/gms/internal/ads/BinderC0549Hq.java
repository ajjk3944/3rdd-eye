package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.Hq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0549Hq extends B7 implements InterfaceC1645od {

    /* renamed from: a, reason: collision with root package name */
    public final C1119eq f9007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2035vq f9008b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0549Hq(C2035vq c2035vq, C1119eq c1119eq) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
        this.f9008b = c2035vq;
        this.f9007a = c1119eq;
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC0790Wc c0773Vc;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c0773Vc = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                c0773Vc = iInterfaceQueryLocalInterface instanceof InterfaceC0790Wc ? (InterfaceC0790Wc) iInterfaceQueryLocalInterface : new C0773Vc(strongBinder);
            }
            C7.f(parcel);
            R2(c0773Vc);
        } else if (i == 2) {
            String string = parcel.readString();
            C7.f(parcel);
            ((BinderC2251zq) this.f9007a.f13988c).D3(0, string);
        } else {
            if (i != 3) {
                return false;
            }
            C2852x0 c2852x0 = (C2852x0) C7.b(parcel, C2852x0.CREATOR);
            C7.f(parcel);
            a(c2852x0);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1645od
    public final void R2(InterfaceC0790Wc interfaceC0790Wc) {
        this.f9008b.f17348d = interfaceC0790Wc;
        ((BinderC2251zq) this.f9007a.f13988c).h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1645od
    public final void a(C2852x0 c2852x0) {
        ((BinderC2251zq) this.f9007a.f13988c).d3(c2852x0);
    }
}
