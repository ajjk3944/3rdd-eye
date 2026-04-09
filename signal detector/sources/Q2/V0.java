package q2;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class V0 extends N2.a {
    public static final Parcelable.Creator<V0> CREATOR = new C2819g0(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f23143a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23144b;

    public V0(int i, int i3) {
        this.f23143a = i;
        this.f23144b = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f23143a);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f23144b);
        AbstractC0241a.H(parcel, iE);
    }
}
