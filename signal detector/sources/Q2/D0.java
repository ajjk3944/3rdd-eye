package q2;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class D0 extends N2.a {
    public static final Parcelable.Creator<D0> CREATOR = new C2819g0(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f23089a;

    public D0(int i) {
        this.f23089a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f23089a);
        AbstractC0241a.H(parcel, iE);
    }
}
