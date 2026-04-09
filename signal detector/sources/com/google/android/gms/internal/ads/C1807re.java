package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.re, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1807re extends N2.a {
    public static final Parcelable.Creator<C1807re> CREATOR = new C1784r8(13);

    /* renamed from: C, reason: collision with root package name */
    public final int f16575C;

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f16576a;

    /* renamed from: b, reason: collision with root package name */
    public final C2951a f16577b;

    /* renamed from: c, reason: collision with root package name */
    public final ApplicationInfo f16578c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16579d;

    /* renamed from: e, reason: collision with root package name */
    public final List f16580e;

    /* renamed from: f, reason: collision with root package name */
    public final PackageInfo f16581f;

    /* renamed from: g, reason: collision with root package name */
    public final String f16582g;

    /* renamed from: h, reason: collision with root package name */
    public final String f16583h;
    public C1823ru i;

    /* renamed from: j, reason: collision with root package name */
    public String f16584j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f16585k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f16586l;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f16587m;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f16588n;

    public C1807re(Bundle bundle, C2951a c2951a, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, String str2, String str3, C1823ru c1823ru, String str4, boolean z6, boolean z7, Bundle bundle2, Bundle bundle3, int i) {
        this.f16576a = bundle;
        this.f16577b = c2951a;
        this.f16579d = str;
        this.f16578c = applicationInfo;
        this.f16580e = arrayList;
        this.f16581f = packageInfo;
        this.f16582g = str2;
        this.f16583h = str3;
        this.i = c1823ru;
        this.f16584j = str4;
        this.f16585k = z6;
        this.f16586l = z7;
        this.f16587m = bundle2;
        this.f16588n = bundle3;
        this.f16575C = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.q(parcel, 1, this.f16576a);
        AbstractC0241a.t(parcel, 2, this.f16577b, i);
        AbstractC0241a.t(parcel, 3, this.f16578c, i);
        AbstractC0241a.u(parcel, 4, this.f16579d);
        AbstractC0241a.w(parcel, 5, this.f16580e);
        AbstractC0241a.t(parcel, 6, this.f16581f, i);
        AbstractC0241a.u(parcel, 7, this.f16582g);
        AbstractC0241a.u(parcel, 9, this.f16583h);
        AbstractC0241a.t(parcel, 10, this.i, i);
        AbstractC0241a.u(parcel, 11, this.f16584j);
        AbstractC0241a.B(parcel, 12, 4);
        parcel.writeInt(this.f16585k ? 1 : 0);
        AbstractC0241a.B(parcel, 13, 4);
        parcel.writeInt(this.f16586l ? 1 : 0);
        AbstractC0241a.q(parcel, 14, this.f16587m);
        AbstractC0241a.q(parcel, 15, this.f16588n);
        AbstractC0241a.B(parcel, 16, 4);
        parcel.writeInt(this.f16575C);
        AbstractC0241a.H(parcel, iE);
    }
}
