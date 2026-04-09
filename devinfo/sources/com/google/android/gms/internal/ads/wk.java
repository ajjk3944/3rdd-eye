package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wk extends mg {

    /* renamed from: a, reason: collision with root package name */
    public final ua.d f18042a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18043b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18044c;

    public wk(ua.d dVar, String str, String str2) {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
        this.f18042a = dVar;
        this.f18043b = str;
        this.f18044c = str2;
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f18043b);
            return true;
        }
        if (i4 == 2) {
            parcel2.writeNoException();
            parcel2.writeString(this.f18044c);
            return true;
        }
        ua.d dVar = this.f18042a;
        if (i4 == 3) {
            vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
            ng.f(parcel);
            if (aVarR0 != null) {
                dVar.o((View) vb.b.U0(aVarR0));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i4 == 4) {
            dVar.a();
            parcel2.writeNoException();
            return true;
        }
        if (i4 != 5) {
            return false;
        }
        dVar.mo171zzc();
        parcel2.writeNoException();
        return true;
    }
}
