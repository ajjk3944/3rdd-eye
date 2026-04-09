package M2;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j extends N2.a {
    public static final Parcelable.Creator<j> CREATOR = new A3.q(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f2777a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2778b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2779c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2780d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2781e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2782f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2783g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2784h;
    public final int i;

    public j(int i, int i3, int i6, long j6, long j7, String str, String str2, int i7, int i8) {
        this.f2777a = i;
        this.f2778b = i3;
        this.f2779c = i6;
        this.f2780d = j6;
        this.f2781e = j7;
        this.f2782f = str;
        this.f2783g = str2;
        this.f2784h = i7;
        this.i = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f2777a);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f2778b);
        AbstractC0241a.B(parcel, 3, 4);
        parcel.writeInt(this.f2779c);
        AbstractC0241a.B(parcel, 4, 8);
        parcel.writeLong(this.f2780d);
        AbstractC0241a.B(parcel, 5, 8);
        parcel.writeLong(this.f2781e);
        AbstractC0241a.u(parcel, 6, this.f2782f);
        AbstractC0241a.u(parcel, 7, this.f2783g);
        AbstractC0241a.B(parcel, 8, 4);
        parcel.writeInt(this.f2784h);
        AbstractC0241a.B(parcel, 9, 4);
        parcel.writeInt(this.i);
        AbstractC0241a.H(parcel, iE);
    }
}
