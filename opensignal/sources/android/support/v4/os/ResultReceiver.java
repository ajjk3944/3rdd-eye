package android.support.v4.os;

import ac.l;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b.b;
import b.c;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new l(9);

    /* renamed from: a, reason: collision with root package name */
    public b f916a;

    public void d(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f916a == null) {
                    this.f916a = new c(this);
                }
                parcel.writeStrongBinder(this.f916a.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
