package o;

import android.os.Parcel;
import android.os.Parcelable;
import g3.C2333b;

/* renamed from: o.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2721k implements Parcelable {
    public static final Parcelable.Creator<C2721k> CREATOR = new C2333b(8);

    /* renamed from: a, reason: collision with root package name */
    public int f22540a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f22540a);
    }
}
