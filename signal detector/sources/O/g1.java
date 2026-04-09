package o;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g1 extends W.b {
    public static final Parcelable.Creator<g1> CREATOR = new A3.w(14);

    /* renamed from: c, reason: collision with root package name */
    public int f22509c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22510d;

    public g1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f22509c = parcel.readInt();
        this.f22510d = parcel.readInt() != 0;
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f22509c);
        parcel.writeInt(this.f22510d ? 1 : 0);
    }
}
