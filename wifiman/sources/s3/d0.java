package s3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import r3.C7566d;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class d0 extends AbstractC8026a {
    public static final Parcelable.Creator<d0> CREATOR = new e0();

    /* renamed from: a, reason: collision with root package name */
    Bundle f61258a;

    /* renamed from: b, reason: collision with root package name */
    C7566d[] f61259b;

    /* renamed from: c, reason: collision with root package name */
    int f61260c;

    /* renamed from: d, reason: collision with root package name */
    C7890e f61261d;

    d0(Bundle bundle, C7566d[] c7566dArr, int i10, C7890e c7890e) {
        this.f61258a = bundle;
        this.f61259b = c7566dArr;
        this.f61260c = i10;
        this.f61261d = c7890e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.e(parcel, 1, this.f61258a, false);
        t3.b.s(parcel, 2, this.f61259b, i10, false);
        t3.b.k(parcel, 3, this.f61260c);
        t3.b.p(parcel, 4, this.f61261d, i10, false);
        t3.b.b(parcel, iA);
    }
}
