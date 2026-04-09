package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fc2 extends l0 {
    public static final Parcelable.Creator<fc2> CREATOR = new kq0(19);
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final Intent m;
    public final id1 n;
    public final boolean o;
    public final Bundle p;

    public fc2(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z, Bundle bundle) {
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = intent;
        this.n = (id1) oi0.l1(oi0.X0(iBinder));
        this.o = z;
        this.p = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.D(parcel, 2, this.f);
        uk2.D(parcel, 3, this.g);
        uk2.D(parcel, 4, this.h);
        uk2.D(parcel, 5, this.i);
        uk2.D(parcel, 6, this.j);
        uk2.D(parcel, 7, this.k);
        uk2.D(parcel, 8, this.l);
        uk2.C(parcel, 9, this.m, i);
        uk2.B(parcel, 10, new oi0(this.n));
        uk2.T(parcel, 11, 4);
        parcel.writeInt(this.o ? 1 : 0);
        uk2.z(parcel, 12, this.p);
        uk2.O(parcel, I);
    }

    public fc2(Intent intent, id1 id1Var) {
        this(null, null, null, null, null, null, null, intent, new oi0(id1Var), false, new Bundle());
    }

    public fc2(String str, String str2, String str3, String str4, String str5, String str6, String str7, id1 id1Var) {
        this(str, str2, str3, str4, str5, str6, str7, null, new oi0(id1Var), false, new Bundle());
    }
}
