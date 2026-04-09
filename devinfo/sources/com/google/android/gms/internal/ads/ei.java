package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ei extends qb.a {
    public static final Parcelable.Creator<ei> CREATOR = new ci(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f10793a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10794b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10795c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10796d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10797e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f10798f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public long f10799h;

    /* renamed from: i, reason: collision with root package name */
    public String f10800i;
    public int j;

    public ei(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z3, long j8, String str5, int i4) {
        this.f10793a = str;
        this.f10794b = j;
        this.f10795c = str2 == null ? "" : str2;
        this.f10796d = str3 == null ? "" : str3;
        this.f10797e = str4 == null ? "" : str4;
        this.f10798f = bundle == null ? new Bundle() : bundle;
        this.g = z3;
        this.f10799h = j8;
        this.f10800i = str5;
        this.j = i4;
    }

    public static ei a(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 51);
                sb2.append("Expected 2 path parts for namespace and id, found :");
                sb2.append(size);
                za.i.h(sb2.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new ei(queryParameter, j, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException e2) {
            e = e2;
            za.i.i("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e10) {
            e = e10;
            za.i.i("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.I(parcel, 2, this.f10793a);
        com.bumptech.glide.f.N(parcel, 3, 8);
        parcel.writeLong(this.f10794b);
        com.bumptech.glide.f.I(parcel, 4, this.f10795c);
        com.bumptech.glide.f.I(parcel, 5, this.f10796d);
        com.bumptech.glide.f.I(parcel, 6, this.f10797e);
        com.bumptech.glide.f.D(parcel, 7, this.f10798f);
        com.bumptech.glide.f.N(parcel, 8, 4);
        parcel.writeInt(this.g ? 1 : 0);
        long j = this.f10799h;
        com.bumptech.glide.f.N(parcel, 9, 8);
        parcel.writeLong(j);
        com.bumptech.glide.f.I(parcel, 10, this.f10800i);
        int i10 = this.j;
        com.bumptech.glide.f.N(parcel, 11, 4);
        parcel.writeInt(i10);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
