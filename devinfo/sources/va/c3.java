package va;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c3 extends qb.a {
    public static final Parcelable.Creator<c3> CREATOR = new f1(9);

    /* renamed from: a, reason: collision with root package name */
    public final String f36038a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36039b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36040c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f36041d;

    /* renamed from: e, reason: collision with root package name */
    public final int f36042e;

    /* renamed from: f, reason: collision with root package name */
    public final int f36043f;
    public final c3[] g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f36044h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f36045i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f36046k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f36047l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f36048m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f36049n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f36050o;

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c3(android.content.Context r17, pa.h[] r18) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: va.c3.<init>(android.content.Context, pa.h[]):void");
    }

    public static c3 a() {
        return new c3("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static c3 c() {
        return new c3("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.I(parcel, 2, this.f36038a);
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(this.f36039b);
        com.bumptech.glide.f.N(parcel, 4, 4);
        parcel.writeInt(this.f36040c);
        com.bumptech.glide.f.N(parcel, 5, 4);
        parcel.writeInt(this.f36041d ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 6, 4);
        parcel.writeInt(this.f36042e);
        com.bumptech.glide.f.N(parcel, 7, 4);
        parcel.writeInt(this.f36043f);
        com.bumptech.glide.f.L(parcel, 8, this.g, i4);
        com.bumptech.glide.f.N(parcel, 9, 4);
        parcel.writeInt(this.f36044h ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 10, 4);
        parcel.writeInt(this.f36045i ? 1 : 0);
        boolean z3 = this.j;
        com.bumptech.glide.f.N(parcel, 11, 4);
        parcel.writeInt(z3 ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 12, 4);
        parcel.writeInt(this.f36046k ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 13, 4);
        parcel.writeInt(this.f36047l ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 14, 4);
        parcel.writeInt(this.f36048m ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 15, 4);
        parcel.writeInt(this.f36049n ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 16, 4);
        parcel.writeInt(this.f36050o ? 1 : 0);
        com.bumptech.glide.f.P(parcel, iO);
    }

    public c3(String str, int i4, int i10, boolean z3, int i11, int i12, c3[] c3VarArr, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f36038a = str;
        this.f36039b = i4;
        this.f36040c = i10;
        this.f36041d = z3;
        this.f36042e = i11;
        this.f36043f = i12;
        this.g = c3VarArr;
        this.f36044h = z10;
        this.f36045i = z11;
        this.j = z12;
        this.f36046k = z13;
        this.f36047l = z14;
        this.f36048m = z15;
        this.f36049n = z16;
        this.f36050o = z17;
    }

    public c3() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public c3(Context context, pa.h hVar) {
        this(context, new pa.h[]{hVar});
    }
}
