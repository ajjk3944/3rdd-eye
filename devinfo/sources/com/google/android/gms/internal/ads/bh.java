package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bh extends mg implements va.v0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f9682b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final qa.d f9683a;

    public bh(qa.d dVar) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.f9683a = dVar;
    }

    @Override // va.v0
    public final void Y(String str, String str2) {
        this.f9683a.g(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        ng.f(parcel);
        Y(string, string2);
        parcel2.writeNoException();
        return true;
    }
}
