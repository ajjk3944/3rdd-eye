package p2;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;
import g3.C2333b;

/* loaded from: classes.dex */
public final class f extends N2.a {
    public static final Parcelable.Creator<f> CREATOR = new C2333b(11);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22769a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22770b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22771c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22772d;

    /* renamed from: e, reason: collision with root package name */
    public final float f22773e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22774f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f22775g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f22776h;
    public final boolean i;

    public f(boolean z6, boolean z7, String str, boolean z8, float f2, int i, boolean z9, boolean z10, boolean z11) {
        this.f22769a = z6;
        this.f22770b = z7;
        this.f22771c = str;
        this.f22772d = z8;
        this.f22773e = f2;
        this.f22774f = i;
        this.f22775g = z9;
        this.f22776h = z10;
        this.i = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f22769a ? 1 : 0);
        AbstractC0241a.B(parcel, 3, 4);
        parcel.writeInt(this.f22770b ? 1 : 0);
        AbstractC0241a.u(parcel, 4, this.f22771c);
        AbstractC0241a.B(parcel, 5, 4);
        parcel.writeInt(this.f22772d ? 1 : 0);
        AbstractC0241a.B(parcel, 6, 4);
        parcel.writeFloat(this.f22773e);
        AbstractC0241a.B(parcel, 7, 4);
        parcel.writeInt(this.f22774f);
        AbstractC0241a.B(parcel, 8, 4);
        parcel.writeInt(this.f22775g ? 1 : 0);
        AbstractC0241a.B(parcel, 9, 4);
        parcel.writeInt(this.f22776h ? 1 : 0);
        AbstractC0241a.B(parcel, 10, 4);
        parcel.writeInt(this.i ? 1 : 0);
        AbstractC0241a.H(parcel, iE);
    }

    public f(boolean z6, boolean z7, boolean z8, float f2, boolean z9, boolean z10, boolean z11) {
        this(z6, z7, null, z8, f2, -1, z9, z10, z11);
    }
}
