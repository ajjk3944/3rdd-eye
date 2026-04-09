package m2;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;
import g3.C2333b;

/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2654a extends N2.a {
    public static final Parcelable.Creator<C2654a> CREATOR = new C2333b(6);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21941a;

    public C2654a(boolean z6) {
        this.f21941a = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f21941a ? 1 : 0);
        AbstractC0241a.H(parcel, iE);
    }
}
