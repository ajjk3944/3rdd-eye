package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qt extends mg implements kw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ib.a f15438a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt(rt rtVar, ib.a aVar) {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
        this.f15438a = aVar;
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void Q0(String str, String str2, Bundle bundle) {
        this.f15438a.b(new o7.d(26, new va.k2(str)));
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            parcel.readString();
            parcel.readString();
            ng.f(parcel);
        } else if (i4 == 2) {
            String string = parcel.readString();
            ng.f(parcel);
            j(string);
        } else {
            if (i4 != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) ng.b(parcel, Bundle.CREATOR);
            ng.f(parcel);
            Q0(string2, string3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void j(String str) {
        this.f15438a.a(str);
    }
}
