package t2;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;
import g3.C2333b;

/* loaded from: classes.dex */
public final class o extends N2.a {
    public static final Parcelable.Creator<o> CREATOR = new C2333b(16);

    /* renamed from: a, reason: collision with root package name */
    public final String f23640a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23641b;

    public o(String str, int i) {
        this.f23640a = str == null ? "" : str;
        this.f23641b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.u(parcel, 1, this.f23640a);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f23641b);
        AbstractC0241a.H(parcel, iE);
    }
}
