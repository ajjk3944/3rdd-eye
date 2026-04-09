package zc;

import android.os.Parcel;
import android.os.Parcelable;
import g1.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends m4.b {
    public static final Parcelable.Creator<a> CREATOR = new p(13);

    /* renamed from: c, reason: collision with root package name */
    public boolean f38169c;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f38169c = parcel.readInt() == 1;
    }

    @Override // m4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f38169c ? 1 : 0);
    }
}
