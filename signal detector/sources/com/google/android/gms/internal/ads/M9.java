package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.View;

/* loaded from: classes.dex */
public final class M9 extends B7 {

    /* renamed from: a, reason: collision with root package name */
    public final p2.d f9809a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9810b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9811c;

    public M9(p2.d dVar, String str, String str2) {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
        this.f9809a = dVar;
        this.f9810b = str;
        this.f9811c = str2;
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f9810b);
            return true;
        }
        if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(this.f9811c);
            return true;
        }
        p2.d dVar = this.f9809a;
        if (i == 3) {
            S2.a aVarD1 = S2.b.d1(parcel.readStrongBinder());
            C7.f(parcel);
            if (aVarD1 != null) {
                dVar.k((View) S2.b.n1(aVarD1));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            dVar.c();
            parcel2.writeNoException();
            return true;
        }
        if (i != 5) {
            return false;
        }
        dVar.f();
        parcel2.writeNoException();
        return true;
    }
}
