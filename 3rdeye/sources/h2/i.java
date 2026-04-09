package h2;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ParcelableUpdateRequest.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f38170b;

    /* renamed from: c, reason: collision with root package name */
    public final C4409c f38171c;

    /* compiled from: ParcelableUpdateRequest.java */
    public class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i) {
            return new i[i];
        }
    }

    public i(Parcel parcel) {
        this.f38170b = parcel.readString();
        this.f38171c = new C4409c(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f38170b);
        this.f38171c.writeToParcel(parcel, i);
    }
}
