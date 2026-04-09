package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zi0 extends mg implements cs {

    /* renamed from: a, reason: collision with root package name */
    public final ci0 f19087a;

    public zi0(ni0 ni0Var, ci0 ci0Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
        this.f19087a = ci0Var;
    }

    @Override // com.google.android.gms.internal.ads.cs
    public final void b(va.w1 w1Var) {
        ((vi0) this.f19087a.f10136c).I3(w1Var);
    }

    @Override // com.google.android.gms.internal.ads.cs
    public final void c() {
        ((vi0) this.f19087a.f10136c).A1();
    }

    @Override // com.google.android.gms.internal.ads.cs
    public final void g(String str) {
        ((vi0) this.f19087a.f10136c).a4(0, str);
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 2) {
            c();
        } else if (i4 == 3) {
            String string = parcel.readString();
            ng.f(parcel);
            g(string);
        } else {
            if (i4 != 4) {
                return false;
            }
            va.w1 w1Var = (va.w1) ng.b(parcel, va.w1.CREATOR);
            ng.f(parcel);
            b(w1Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
