package q2;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Y0 extends N2.a {
    public static final Parcelable.Creator<Y0> CREATOR = new C2819g0(7);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23147a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23148b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23149c;

    public Y0(j2.t tVar) {
        this(tVar.f21362a, tVar.f21363b, tVar.f21364c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f23147a ? 1 : 0);
        AbstractC0241a.B(parcel, 3, 4);
        parcel.writeInt(this.f23148b ? 1 : 0);
        AbstractC0241a.B(parcel, 4, 4);
        parcel.writeInt(this.f23149c ? 1 : 0);
        AbstractC0241a.H(parcel, iE);
    }

    public Y0(boolean z6, boolean z7, boolean z8) {
        this.f23147a = z6;
        this.f23148b = z7;
        this.f23149c = z8;
    }
}
