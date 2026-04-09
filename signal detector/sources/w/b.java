package W;

import A3.w;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f3954a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f3953b = new a();
    public static final Parcelable.Creator<b> CREATOR = new w(7);

    public b() {
        this.f3954a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3954a, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f3954a = parcelable == f3953b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f3954a = parcelable == null ? f3953b : parcelable;
    }
}
