package M2;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l extends N2.a {
    public static final Parcelable.Creator<l> CREATOR = new A3.q(12);

    /* renamed from: a, reason: collision with root package name */
    public final int f2788a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2789b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2790c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2791d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2792e;

    public l(int i, int i3, int i6, boolean z6, boolean z7) {
        this.f2788a = i;
        this.f2789b = z6;
        this.f2790c = z7;
        this.f2791d = i3;
        this.f2792e = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f2788a);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f2789b ? 1 : 0);
        AbstractC0241a.B(parcel, 3, 4);
        parcel.writeInt(this.f2790c ? 1 : 0);
        AbstractC0241a.B(parcel, 4, 4);
        parcel.writeInt(this.f2791d);
        AbstractC0241a.B(parcel, 5, 4);
        parcel.writeInt(this.f2792e);
        AbstractC0241a.H(parcel, iE);
    }
}
