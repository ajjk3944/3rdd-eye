package M2;

import a.AbstractC0241a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class C extends N2.a {
    public static final Parcelable.Creator<C> CREATOR = new A3.q(13);

    /* renamed from: a, reason: collision with root package name */
    public Bundle f2708a;

    /* renamed from: b, reason: collision with root package name */
    public J2.d[] f2709b;

    /* renamed from: c, reason: collision with root package name */
    public int f2710c;

    /* renamed from: d, reason: collision with root package name */
    public C0166f f2711d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.q(parcel, 1, this.f2708a);
        AbstractC0241a.x(parcel, 2, this.f2709b, i);
        int i3 = this.f2710c;
        AbstractC0241a.B(parcel, 3, 4);
        parcel.writeInt(i3);
        AbstractC0241a.t(parcel, 4, this.f2711d, i);
        AbstractC0241a.H(parcel, iE);
    }
}
