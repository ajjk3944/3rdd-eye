package q2;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class L0 extends N2.a {
    public static final Parcelable.Creator<L0> CREATOR = new C2819g0(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f23129a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23130b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23131c;

    public L0(int i, int i3, String str) {
        this.f23129a = i;
        this.f23130b = i3;
        this.f23131c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f23129a);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f23130b);
        AbstractC0241a.u(parcel, 3, this.f23131c);
        AbstractC0241a.H(parcel, iE);
    }
}
