package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fa2 extends l0 {
    public static final Parcelable.Creator<fa2> CREATOR = new p92(4);
    public final Bundle f;
    public final e51 g;
    public final ApplicationInfo h;
    public final String i;
    public final List j;
    public final PackageInfo k;
    public final String l;
    public final String m;
    public d93 n;
    public String o;
    public final boolean p;
    public final boolean q;
    public final Bundle r;
    public final Bundle s;
    public final int t;

    public fa2(Bundle bundle, e51 e51Var, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, String str2, String str3, d93 d93Var, String str4, boolean z, boolean z2, Bundle bundle2, Bundle bundle3, int i) {
        this.f = bundle;
        this.g = e51Var;
        this.i = str;
        this.h = applicationInfo;
        this.j = arrayList;
        this.k = packageInfo;
        this.l = str2;
        this.m = str3;
        this.n = d93Var;
        this.o = str4;
        this.p = z;
        this.q = z2;
        this.r = bundle2;
        this.s = bundle3;
        this.t = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.z(parcel, 1, this.f);
        uk2.C(parcel, 2, this.g, i);
        uk2.C(parcel, 3, this.h, i);
        uk2.D(parcel, 4, this.i);
        uk2.F(parcel, 5, this.j);
        uk2.C(parcel, 6, this.k, i);
        uk2.D(parcel, 7, this.l);
        uk2.D(parcel, 9, this.m);
        uk2.C(parcel, 10, this.n, i);
        uk2.D(parcel, 11, this.o);
        uk2.T(parcel, 12, 4);
        parcel.writeInt(this.p ? 1 : 0);
        uk2.T(parcel, 13, 4);
        parcel.writeInt(this.q ? 1 : 0);
        uk2.z(parcel, 14, this.r);
        uk2.z(parcel, 15, this.s);
        uk2.T(parcel, 16, 4);
        parcel.writeInt(this.t);
        uk2.O(parcel, I);
    }
}
