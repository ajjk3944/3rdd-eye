package x4;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.play:review@@2.0.1 */
@SuppressLint({"RestrictedApi"})
/* renamed from: x4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5767b implements Parcelable {
    public static final Parcelable.Creator<AbstractC5767b> CREATOR = new d();

    public abstract PendingIntent c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract boolean e();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(c(), 0);
        parcel.writeInt(e() ? 1 : 0);
    }
}
