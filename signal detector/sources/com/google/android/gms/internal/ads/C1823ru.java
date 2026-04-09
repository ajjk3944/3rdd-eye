package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.ru, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1823ru extends N2.a {
    public static final Parcelable.Creator<C1823ru> CREATOR = new C1784r8(19);

    /* renamed from: a, reason: collision with root package name */
    public final Context f16636a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16637b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC1770qu f16638c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16639d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16640e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16641f;

    /* renamed from: g, reason: collision with root package name */
    public final String f16642g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16643h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f16644j;

    public C1823ru(int i, int i3, int i6, int i7, String str, int i8, int i9) {
        EnumC1770qu[] enumC1770quArrValues = EnumC1770qu.values();
        this.f16636a = null;
        this.f16637b = i;
        this.f16638c = enumC1770quArrValues[i];
        this.f16639d = i3;
        this.f16640e = i6;
        this.f16641f = i7;
        this.f16642g = str;
        this.f16643h = i8;
        this.f16644j = new int[]{1, 2, 3}[i8];
        this.i = i9;
        int i10 = new int[]{1}[i9];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f16637b);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f16639d);
        AbstractC0241a.B(parcel, 3, 4);
        parcel.writeInt(this.f16640e);
        AbstractC0241a.B(parcel, 4, 4);
        parcel.writeInt(this.f16641f);
        AbstractC0241a.u(parcel, 5, this.f16642g);
        AbstractC0241a.B(parcel, 6, 4);
        parcel.writeInt(this.f16643h);
        AbstractC0241a.B(parcel, 7, 4);
        parcel.writeInt(this.i);
        AbstractC0241a.H(parcel, iE);
    }

    public C1823ru(Context context, EnumC1770qu enumC1770qu, int i, int i3, int i6, String str, String str2) {
        EnumC1770qu.values();
        this.f16636a = context;
        this.f16637b = enumC1770qu.ordinal();
        this.f16638c = enumC1770qu;
        this.f16639d = i;
        this.f16640e = i3;
        this.f16641f = i6;
        this.f16642g = str;
        int i7 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.f16644j = i7;
        this.f16643h = i7 - 1;
        this.i = 0;
    }
}
