package q2;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e1 extends N2.a {
    public static final Parcelable.Creator<e1> CREATOR = new C2819g0(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f23203a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23204b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23205c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23206d;

    public e1(int i, long j6, int i3, String str) {
        this.f23203a = i;
        this.f23204b = i3;
        this.f23205c = str;
        this.f23206d = j6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f23203a);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f23204b);
        AbstractC0241a.u(parcel, 3, this.f23205c);
        AbstractC0241a.B(parcel, 4, 8);
        parcel.writeLong(this.f23206d);
        AbstractC0241a.H(parcel, iE);
    }
}
