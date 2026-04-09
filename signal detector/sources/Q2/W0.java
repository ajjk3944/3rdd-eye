package q2;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class W0 extends N2.a {
    public static final Parcelable.Creator<W0> CREATOR = new C2819g0(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f23145a;

    public W0(String str) {
        this.f23145a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.u(parcel, 15, this.f23145a);
        AbstractC0241a.H(parcel, iE);
    }
}
