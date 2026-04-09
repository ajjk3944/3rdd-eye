package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qh4 extends l0 {
    public static final Parcelable.Creator<qh4> CREATOR = new ed4(7);
    public final String f;
    public long g;
    public nx2 h;
    public final Bundle i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;

    public qh4(String str, long j, nx2 nx2Var, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f = str;
        this.g = j;
        this.h = nx2Var;
        this.i = bundle;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.D(parcel, 1, this.f);
        long j = this.g;
        uk2.T(parcel, 2, 8);
        parcel.writeLong(j);
        uk2.C(parcel, 3, this.h, i);
        uk2.z(parcel, 4, this.i);
        uk2.D(parcel, 5, this.j);
        uk2.D(parcel, 6, this.k);
        uk2.D(parcel, 7, this.l);
        uk2.D(parcel, 8, this.m);
        uk2.O(parcel, I);
    }
}
