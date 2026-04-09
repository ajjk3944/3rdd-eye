package N3;

import android.os.Parcel;
import android.os.Parcelable;
import s3.I;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class j extends AbstractC8026a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    final int f14892a;

    /* renamed from: b, reason: collision with root package name */
    final I f14893b;

    j(int i10, I i11) {
        this.f14892a = i10;
        this.f14893b = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.k(parcel, 1, this.f14892a);
        t3.b.p(parcel, 2, this.f14893b, i10, false);
        t3.b.b(parcel, iA);
    }
}
