package q2;

import a.AbstractC0241a;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import j2.C2552h;

/* loaded from: classes.dex */
public final class d1 extends N2.a {
    public static final Parcelable.Creator<d1> CREATOR = new C2819g0(9);

    /* renamed from: C, reason: collision with root package name */
    public final boolean f23187C;

    /* renamed from: a, reason: collision with root package name */
    public final String f23188a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23189b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23190c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23191d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23192e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23193f;

    /* renamed from: g, reason: collision with root package name */
    public final d1[] f23194g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f23195h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f23196j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f23197k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f23198l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f23199m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f23200n;

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d1(android.content.Context r17, j2.C2552h[] r18) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.d1.<init>(android.content.Context, j2.h[]):void");
    }

    public static d1 a() {
        return new d1("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static d1 b() {
        return new d1("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.u(parcel, 2, this.f23188a);
        AbstractC0241a.B(parcel, 3, 4);
        parcel.writeInt(this.f23189b);
        AbstractC0241a.B(parcel, 4, 4);
        parcel.writeInt(this.f23190c);
        AbstractC0241a.B(parcel, 5, 4);
        parcel.writeInt(this.f23191d ? 1 : 0);
        AbstractC0241a.B(parcel, 6, 4);
        parcel.writeInt(this.f23192e);
        AbstractC0241a.B(parcel, 7, 4);
        parcel.writeInt(this.f23193f);
        AbstractC0241a.x(parcel, 8, this.f23194g, i);
        AbstractC0241a.B(parcel, 9, 4);
        parcel.writeInt(this.f23195h ? 1 : 0);
        AbstractC0241a.B(parcel, 10, 4);
        parcel.writeInt(this.i ? 1 : 0);
        boolean z6 = this.f23196j;
        AbstractC0241a.B(parcel, 11, 4);
        parcel.writeInt(z6 ? 1 : 0);
        AbstractC0241a.B(parcel, 12, 4);
        parcel.writeInt(this.f23197k ? 1 : 0);
        AbstractC0241a.B(parcel, 13, 4);
        parcel.writeInt(this.f23198l ? 1 : 0);
        AbstractC0241a.B(parcel, 14, 4);
        parcel.writeInt(this.f23199m ? 1 : 0);
        AbstractC0241a.B(parcel, 15, 4);
        parcel.writeInt(this.f23200n ? 1 : 0);
        AbstractC0241a.B(parcel, 16, 4);
        parcel.writeInt(this.f23187C ? 1 : 0);
        AbstractC0241a.H(parcel, iE);
    }

    public d1(String str, int i, int i3, boolean z6, int i6, int i7, d1[] d1VarArr, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f23188a = str;
        this.f23189b = i;
        this.f23190c = i3;
        this.f23191d = z6;
        this.f23192e = i6;
        this.f23193f = i7;
        this.f23194g = d1VarArr;
        this.f23195h = z7;
        this.i = z8;
        this.f23196j = z9;
        this.f23197k = z10;
        this.f23198l = z11;
        this.f23199m = z12;
        this.f23200n = z13;
        this.f23187C = z14;
    }

    public d1() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public d1(Context context, C2552h c2552h) {
        this(context, new C2552h[]{c2552h});
    }
}
