package G2;

import A3.q;
import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c extends N2.a {
    public static final Parcelable.Creator<c> CREATOR = new q(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f1515a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1516b;

    public c(String str, int i) {
        this.f1515a = str;
        this.f1516b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.u(parcel, 1, this.f1515a);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f1516b);
        AbstractC0241a.H(parcel, iE);
    }
}
