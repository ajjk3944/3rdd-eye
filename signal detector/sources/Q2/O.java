package q2;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class O extends N2.a {
    public static final Parcelable.Creator<O> CREATOR = new C2819g0(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f23134a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23135b;

    public O(String str, String str2) {
        this.f23134a = str;
        this.f23135b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.u(parcel, 1, this.f23134a);
        AbstractC0241a.u(parcel, 2, this.f23135b);
        AbstractC0241a.H(parcel, iE);
    }
}
