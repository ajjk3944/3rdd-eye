package b3;

import A3.q;
import M2.r;
import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335e extends N2.a {
    public static final Parcelable.Creator<C0335e> CREATOR = new q(24);

    /* renamed from: a, reason: collision with root package name */
    public final int f5728a;

    /* renamed from: b, reason: collision with root package name */
    public final J2.b f5729b;

    /* renamed from: c, reason: collision with root package name */
    public final r f5730c;

    public C0335e(int i, J2.b bVar, r rVar) {
        this.f5728a = i;
        this.f5729b = bVar;
        this.f5730c = rVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f5728a);
        AbstractC0241a.t(parcel, 2, this.f5729b, i);
        AbstractC0241a.t(parcel, 3, this.f5730c, i);
        AbstractC0241a.H(parcel, iE);
    }
}
