package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ye, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0826Ye extends B7 implements InterfaceC0554Ie {

    /* renamed from: a, reason: collision with root package name */
    public final String f12644a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12645b;

    public BinderC0826Ye(String str, int i) {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        this.f12644a = str;
        this.f12645b = i;
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f12644a);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f12645b);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0554Ie
    public final String b() {
        return this.f12644a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0554Ie
    public final int d() {
        return this.f12645b;
    }
}
