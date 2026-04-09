package j0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    public final int f26891a;

    public f(int i4) {
        this.f26891a = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f26891a == ((f) obj).f26891a;
    }

    public final int hashCode() {
        return this.f26891a;
    }

    public final String toString() {
        return d.h.u(new StringBuilder("DefaultLazyKey(index="), this.f26891a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f26891a);
    }
}
