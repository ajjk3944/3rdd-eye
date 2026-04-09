package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p1 extends m4.b {
    public static final Parcelable.Creator<p1> CREATOR = new g1.p(1);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f1480c;

    public p1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1480c = parcel.readParcelable(classLoader == null ? f1.class.getClassLoader() : classLoader);
    }

    @Override // m4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeParcelable(this.f1480c, 0);
    }
}
