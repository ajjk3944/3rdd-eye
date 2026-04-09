package q2;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g1 extends N2.a {
    public static final Parcelable.Creator<g1> CREATOR = new C2819g0(12);

    /* renamed from: a, reason: collision with root package name */
    public final int f23223a;

    public g1(int i) {
        this.f23223a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f23223a);
        AbstractC0241a.H(parcel, iE);
    }
}
