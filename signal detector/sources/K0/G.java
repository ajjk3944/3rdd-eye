package k0;

import android.os.Parcel;
import android.os.Parcelable;
import g3.C2333b;

/* loaded from: classes.dex */
public final class G implements Parcelable {
    public static final Parcelable.Creator<G> CREATOR = new C2333b(3);

    /* renamed from: a, reason: collision with root package name */
    public String f21482a;

    /* renamed from: b, reason: collision with root package name */
    public int f21483b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f21482a);
        parcel.writeInt(this.f21483b);
    }
}
