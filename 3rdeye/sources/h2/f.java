package h2;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.WorkerParameters;

/* compiled from: ParcelableRemoteWorkRequest.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f38166b;

    /* renamed from: c, reason: collision with root package name */
    public final p f38167c;

    /* compiled from: ParcelableRemoteWorkRequest.java */
    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i) {
            return new f[i];
        }
    }

    public f(String str, WorkerParameters workerParameters) {
        this.f38166b = str;
        this.f38167c = new p(workerParameters);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f38166b);
        this.f38167c.writeToParcel(parcel, i);
    }

    public f(Parcel parcel) {
        this.f38166b = parcel.readString();
        this.f38167c = new p(parcel);
    }
}
