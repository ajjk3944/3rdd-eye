package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class d93 extends l0 {
    public static final Parcelable.Creator<d93> CREATOR = new p92(17);
    public final Context f;
    public final int g;
    public final c93 h;
    public final int i;
    public final int j;
    public final int k;
    public final String l;
    public final int m;
    public final int n;
    public final int o;

    public d93(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        c93[] c93VarArrValues = c93.values();
        this.f = null;
        this.g = i;
        this.h = c93VarArrValues[i];
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = str;
        this.m = i5;
        this.o = new int[]{1, 2, 3}[i5];
        this.n = i6;
        int i7 = new int[]{1}[i6];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 1, 4);
        parcel.writeInt(this.g);
        uk2.T(parcel, 2, 4);
        parcel.writeInt(this.i);
        uk2.T(parcel, 3, 4);
        parcel.writeInt(this.j);
        uk2.T(parcel, 4, 4);
        parcel.writeInt(this.k);
        uk2.D(parcel, 5, this.l);
        uk2.T(parcel, 6, 4);
        parcel.writeInt(this.m);
        uk2.T(parcel, 7, 4);
        parcel.writeInt(this.n);
        uk2.O(parcel, I);
    }

    public d93(Context context, c93 c93Var, int i, int i2, int i3, String str, String str2, String str3) {
        int i4;
        c93.values();
        this.f = context;
        this.g = c93Var.ordinal();
        this.h = c93Var;
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = str;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else {
            i4 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.o = i4;
        this.m = i4 - 1;
        "onAdClosed".equals(str3);
        this.n = 0;
    }
}
