package n6;

import android.os.Parcel;
import android.os.Parcelable;
import g1.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends m4.b {
    public static final Parcelable.Creator<f> CREATOR = new p(7);

    /* renamed from: c, reason: collision with root package name */
    public int f29777c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f29778d;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? f.class.getClassLoader() : classLoader;
        this.f29777c = parcel.readInt();
        this.f29778d = parcel.readParcelable(classLoader);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" position=");
        return r5.c.j(this.f29777c, "}", sb2);
    }

    @Override // m4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f29777c);
        parcel.writeParcelable(this.f29778d, i4);
    }
}
