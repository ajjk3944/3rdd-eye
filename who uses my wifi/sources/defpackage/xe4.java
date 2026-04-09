package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xe4 extends l0 {
    public static final Parcelable.Creator<xe4> CREATOR = new ed4(5);
    public final String f;
    public final int g;
    public final int h;
    public final boolean i;
    public final int j;
    public final int k;
    public final xe4[] l;
    public final boolean m;
    public final boolean n;
    public boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public xe4(android.content.Context r17, defpackage.d3[] r18) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xe4.<init>(android.content.Context, d3[]):void");
    }

    public static xe4 a() {
        return new xe4("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static xe4 b() {
        return new xe4("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.D(parcel, 2, this.f);
        uk2.T(parcel, 3, 4);
        parcel.writeInt(this.g);
        uk2.T(parcel, 4, 4);
        parcel.writeInt(this.h);
        uk2.T(parcel, 5, 4);
        parcel.writeInt(this.i ? 1 : 0);
        uk2.T(parcel, 6, 4);
        parcel.writeInt(this.j);
        uk2.T(parcel, 7, 4);
        parcel.writeInt(this.k);
        uk2.G(parcel, 8, this.l, i);
        uk2.T(parcel, 9, 4);
        parcel.writeInt(this.m ? 1 : 0);
        uk2.T(parcel, 10, 4);
        parcel.writeInt(this.n ? 1 : 0);
        boolean z = this.o;
        uk2.T(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        uk2.T(parcel, 12, 4);
        parcel.writeInt(this.p ? 1 : 0);
        uk2.T(parcel, 13, 4);
        parcel.writeInt(this.q ? 1 : 0);
        uk2.T(parcel, 14, 4);
        parcel.writeInt(this.r ? 1 : 0);
        uk2.T(parcel, 15, 4);
        parcel.writeInt(this.s ? 1 : 0);
        uk2.T(parcel, 16, 4);
        parcel.writeInt(this.t ? 1 : 0);
        uk2.O(parcel, I);
    }

    public xe4(String str, int i, int i2, boolean z, int i3, int i4, xe4[] xe4VarArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f = str;
        this.g = i;
        this.h = i2;
        this.i = z;
        this.j = i3;
        this.k = i4;
        this.l = xe4VarArr;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        this.q = z6;
        this.r = z7;
        this.s = z8;
        this.t = z9;
    }

    public xe4() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public xe4(Context context, d3 d3Var) {
        this(context, new d3[]{d3Var});
    }
}
