package A3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new q(0);

    /* renamed from: a, reason: collision with root package name */
    public int f492a;

    /* renamed from: b, reason: collision with root package name */
    public x3.s f493b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f492a);
        parcel.writeParcelable(this.f493b, 0);
    }
}
