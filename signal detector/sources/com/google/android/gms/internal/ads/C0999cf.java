package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.cf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0999cf extends N2.a {
    public static final Parcelable.Creator<C0999cf> CREATOR = new C1784r8(17);

    /* renamed from: a, reason: collision with root package name */
    public final String f13588a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13589b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13590c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13591d;

    /* renamed from: e, reason: collision with root package name */
    public final List f13592e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13593f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13594g;

    /* renamed from: h, reason: collision with root package name */
    public final List f13595h;

    public C0999cf(String str, String str2, boolean z6, boolean z7, List list, boolean z8, boolean z9, List list2) {
        this.f13588a = str;
        this.f13589b = str2;
        this.f13590c = z6;
        this.f13591d = z7;
        this.f13592e = list;
        this.f13593f = z8;
        this.f13594g = z9;
        this.f13595h = list2 == null ? new ArrayList() : list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.u(parcel, 2, this.f13588a);
        AbstractC0241a.u(parcel, 3, this.f13589b);
        AbstractC0241a.B(parcel, 4, 4);
        parcel.writeInt(this.f13590c ? 1 : 0);
        AbstractC0241a.B(parcel, 5, 4);
        parcel.writeInt(this.f13591d ? 1 : 0);
        AbstractC0241a.w(parcel, 6, this.f13592e);
        AbstractC0241a.B(parcel, 7, 4);
        parcel.writeInt(this.f13593f ? 1 : 0);
        AbstractC0241a.B(parcel, 8, 4);
        parcel.writeInt(this.f13594g ? 1 : 0);
        AbstractC0241a.w(parcel, 9, this.f13595h);
        AbstractC0241a.H(parcel, iE);
    }
}
