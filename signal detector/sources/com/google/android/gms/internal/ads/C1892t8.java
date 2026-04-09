package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.t8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1892t8 extends N2.a {
    public static final Parcelable.Creator<C1892t8> CREATOR = new C1784r8(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f16858a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16859b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16860c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16861d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16862e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f16863f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16864g;

    /* renamed from: h, reason: collision with root package name */
    public long f16865h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public int f16866j;

    public C1892t8(String str, long j6, String str2, String str3, String str4, Bundle bundle, boolean z6, long j7, String str5, int i) {
        this.f16858a = str;
        this.f16859b = j6;
        this.f16860c = str2 == null ? "" : str2;
        this.f16861d = str3 == null ? "" : str3;
        this.f16862e = str4 == null ? "" : str4;
        this.f16863f = bundle == null ? new Bundle() : bundle;
        this.f16864g = z6;
        this.f16865h = j7;
        this.i = str5;
        this.f16866j = i;
    }

    public static C1892t8 a(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 51);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                u2.k.h(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j6 = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new C1892t8(queryParameter, j6, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException e6) {
            e = e6;
            u2.k.i("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e7) {
            e = e7;
            u2.k.i("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.u(parcel, 2, this.f16858a);
        AbstractC0241a.B(parcel, 3, 8);
        parcel.writeLong(this.f16859b);
        AbstractC0241a.u(parcel, 4, this.f16860c);
        AbstractC0241a.u(parcel, 5, this.f16861d);
        AbstractC0241a.u(parcel, 6, this.f16862e);
        AbstractC0241a.q(parcel, 7, this.f16863f);
        AbstractC0241a.B(parcel, 8, 4);
        parcel.writeInt(this.f16864g ? 1 : 0);
        long j6 = this.f16865h;
        AbstractC0241a.B(parcel, 9, 8);
        parcel.writeLong(j6);
        AbstractC0241a.u(parcel, 10, this.i);
        int i3 = this.f16866j;
        AbstractC0241a.B(parcel, 11, 4);
        parcel.writeInt(i3);
        AbstractC0241a.H(parcel, iE);
    }
}
