package m4;

import android.os.Parcel;
import android.os.Parcelable;
import g1.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f28876a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f28875b = new a();
    public static final Parcelable.Creator<b> CREATOR = new p(6);

    public b() {
        this.f28876a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f28876a, i4);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f28876a = parcelable == f28875b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f28876a = parcelable == null ? f28875b : parcelable;
    }
}
