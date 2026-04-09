package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ww1 extends l0 {
    public static final Parcelable.Creator<ww1> CREATOR = new kq0(22);
    public final String f;
    public final long g;
    public final String h;
    public final String i;
    public final String j;
    public final Bundle k;
    public final boolean l;
    public long m;
    public String n;
    public int o;

    public ww1(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2, String str5, int i) {
        this.f = str;
        this.g = j;
        this.h = str2 == null ? "" : str2;
        this.i = str3 == null ? "" : str3;
        this.j = str4 == null ? "" : str4;
        this.k = bundle == null ? new Bundle() : bundle;
        this.l = z;
        this.m = j2;
        this.n = str5;
        this.o = i;
    }

    public static ww1 a(Uri uri) {
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
                gi2.i0(sb.toString());
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
            return new ww1(queryParameter, j, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException | NumberFormatException unused) {
            gi2.q0(5);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.D(parcel, 2, this.f);
        uk2.T(parcel, 3, 8);
        parcel.writeLong(this.g);
        uk2.D(parcel, 4, this.h);
        uk2.D(parcel, 5, this.i);
        uk2.D(parcel, 6, this.j);
        uk2.z(parcel, 7, this.k);
        uk2.T(parcel, 8, 4);
        parcel.writeInt(this.l ? 1 : 0);
        long j = this.m;
        uk2.T(parcel, 9, 8);
        parcel.writeLong(j);
        uk2.D(parcel, 10, this.n);
        int i2 = this.o;
        uk2.T(parcel, 11, 4);
        parcel.writeInt(i2);
        uk2.O(parcel, I);
    }
}
