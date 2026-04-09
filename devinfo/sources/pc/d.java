package pc;

import android.os.Parcel;
import android.os.Parcelable;
import g1.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends m4.b {
    public static final Parcelable.Creator<d> CREATOR = new p(12);

    /* renamed from: c, reason: collision with root package name */
    public boolean f31682c;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            d.class.getClassLoader();
        }
        this.f31682c = parcel.readInt() == 1;
    }

    @Override // m4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f31682c ? 1 : 0);
    }
}
