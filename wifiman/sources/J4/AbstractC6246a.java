package j4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j4.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6246a implements Parcelable {
    public static final Parcelable.Creator<AbstractC6246a> CREATOR = new C6250e();

    abstract PendingIntent a();

    abstract boolean b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(a(), 0);
        parcel.writeInt(b() ? 1 : 0);
    }
}
