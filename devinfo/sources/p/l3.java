package p;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l3 extends m4.b {
    public static final Parcelable.Creator<l3> CREATOR = new g1.p(10);

    /* renamed from: c, reason: collision with root package name */
    public int f30759c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30760d;

    public l3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f30759c = parcel.readInt();
        this.f30760d = parcel.readInt() != 0;
    }

    @Override // m4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f30759c);
        parcel.writeInt(this.f30760d ? 1 : 0);
    }
}
