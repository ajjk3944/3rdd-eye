package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1385a;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1386d;

    public BackStackState(Parcel parcel) {
        this.f1385a = parcel.createStringArrayList();
        this.f1386d = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f1385a);
        parcel.writeTypedList(this.f1386d);
    }
}
