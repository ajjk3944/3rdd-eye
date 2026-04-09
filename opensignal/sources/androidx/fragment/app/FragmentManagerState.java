package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a(3);
    public ArrayList B;
    public ArrayList D;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1393a;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f1394d;

    /* renamed from: g, reason: collision with root package name */
    public BackStackRecordState[] f1395g;

    /* renamed from: r, reason: collision with root package name */
    public int f1396r;

    /* renamed from: x, reason: collision with root package name */
    public String f1397x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f1398y;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f1393a);
        parcel.writeStringList(this.f1394d);
        parcel.writeTypedArray(this.f1395g, i10);
        parcel.writeInt(this.f1396r);
        parcel.writeString(this.f1397x);
        parcel.writeStringList(this.f1398y);
        parcel.writeTypedList(this.B);
        parcel.writeTypedList(this.D);
    }
}
