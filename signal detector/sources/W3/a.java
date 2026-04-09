package W3;

import A3.q;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new q(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b bVar = (b) this;
        parcel.writeParcelable(bVar.f4023a, 0);
        parcel.writeInt(bVar.f4024b ? 1 : 0);
    }
}
