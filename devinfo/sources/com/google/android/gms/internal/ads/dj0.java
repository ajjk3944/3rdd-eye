package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dj0 extends mg implements es {

    /* renamed from: a, reason: collision with root package name */
    public final ci0 f10487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ si0 f10488b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj0(si0 si0Var, ci0 ci0Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
        this.f10488b = si0Var;
        this.f10487a = ci0Var;
    }

    @Override // com.google.android.gms.internal.ads.es
    public final void b(va.w1 w1Var) {
        ((vi0) this.f10487a.f10136c).I3(w1Var);
    }

    @Override // com.google.android.gms.internal.ads.es
    public final void g(String str) {
        ((vi0) this.f10487a.f10136c).a4(0, str);
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        lr krVar;
        if (i4 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                krVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                krVar = iInterfaceQueryLocalInterface instanceof lr ? (lr) iInterfaceQueryLocalInterface : new kr(strongBinder);
            }
            ng.f(parcel);
            m3(krVar);
        } else if (i4 == 2) {
            String string = parcel.readString();
            ng.f(parcel);
            g(string);
        } else {
            if (i4 != 3) {
                return false;
            }
            va.w1 w1Var = (va.w1) ng.b(parcel, va.w1.CREATOR);
            ng.f(parcel);
            b(w1Var);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.es
    public final void m3(lr lrVar) {
        this.f10488b.f16021d = lrVar;
        ((vi0) this.f10487a.f10136c).A1();
    }
}
