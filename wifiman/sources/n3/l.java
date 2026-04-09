package N3;

import android.os.Parcel;
import android.os.Parcelable;
import r3.C7564b;
import s3.K;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class l extends AbstractC8026a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    final int f14894a;

    /* renamed from: b, reason: collision with root package name */
    private final C7564b f14895b;

    /* renamed from: c, reason: collision with root package name */
    private final K f14896c;

    l(int i10, C7564b c7564b, K k10) {
        this.f14894a = i10;
        this.f14895b = c7564b;
        this.f14896c = k10;
    }

    public final C7564b b() {
        return this.f14895b;
    }

    public final K e() {
        return this.f14896c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.k(parcel, 1, this.f14894a);
        t3.b.p(parcel, 2, this.f14895b, i10, false);
        t3.b.p(parcel, 3, this.f14896c, i10, false);
        t3.b.b(parcel, iA);
    }
}
