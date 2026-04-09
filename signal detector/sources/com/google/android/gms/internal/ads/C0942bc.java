package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.sdk.openadsdk.TTAdConstant;

/* renamed from: com.google.android.gms.internal.ads.bc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0942bc extends N2.a {
    public static final Parcelable.Creator<C0942bc> CREATOR = new C1784r8(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f13388a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13389b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13390c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13391d;

    public C0942bc(int i, int i3, int i6, String str) {
        this.f13388a = i;
        this.f13389b = i3;
        this.f13390c = str;
        this.f13391d = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f13389b);
        AbstractC0241a.u(parcel, 2, this.f13390c);
        AbstractC0241a.B(parcel, 3, 4);
        parcel.writeInt(this.f13391d);
        AbstractC0241a.B(parcel, TTAdConstant.STYLE_SIZE_RADIO_1_1, 4);
        parcel.writeInt(this.f13388a);
        AbstractC0241a.H(parcel, iE);
    }
}
