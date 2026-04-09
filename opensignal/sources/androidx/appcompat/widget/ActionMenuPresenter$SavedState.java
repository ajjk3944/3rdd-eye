package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
class ActionMenuPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator<ActionMenuPresenter$SavedState> CREATOR = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public int f955a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f955a);
    }
}
