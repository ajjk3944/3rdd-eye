package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ri0 extends mg implements as {

    /* renamed from: a, reason: collision with root package name */
    public final ci0 f15654a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ si0 f15655b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri0(si0 si0Var, ci0 ci0Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
        this.f15655b = si0Var;
        this.f15654a = ci0Var;
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void Z(vb.a aVar) {
        this.f15655b.f16021d = (View) vb.b.U0(aVar);
        ((vi0) this.f15654a.f10136c).A1();
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void b(va.w1 w1Var) {
        ((vi0) this.f15654a.f10136c).I3(w1Var);
    }

    @Override // com.google.android.gms.internal.ads.as
    public final void g(String str) {
        ((vi0) this.f15654a.f10136c).a4(0, str);
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        gr grVar;
        if (i4 == 1) {
            vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
            ng.f(parcel);
            Z(aVarR0);
        } else if (i4 == 2) {
            String string = parcel.readString();
            ng.f(parcel);
            g(string);
        } else if (i4 == 3) {
            va.w1 w1Var = (va.w1) ng.b(parcel, va.w1.CREATOR);
            ng.f(parcel);
            b(w1Var);
        } else {
            if (i4 != 4) {
                return false;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                grVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
                grVar = iInterfaceQueryLocalInterface instanceof gr ? (gr) iInterfaceQueryLocalInterface : new gr(strongBinder);
            }
            ng.f(parcel);
            this.f15655b.f16022e = grVar;
            ((vi0) this.f15654a.f10136c).A1();
        }
        parcel2.writeNoException();
        return true;
    }
}
