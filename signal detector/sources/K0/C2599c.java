package k0;

import android.os.Parcel;
import android.os.Parcelable;
import g3.C2333b;
import java.util.ArrayList;

/* renamed from: k0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2599c implements Parcelable {
    public static final Parcelable.Creator<C2599c> CREATOR = new C2333b(2);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21618a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21619b;

    public C2599c(ArrayList arrayList, ArrayList arrayList2) {
        this.f21618a = arrayList;
        this.f21619b = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f21618a);
        parcel.writeTypedList(this.f21619b);
    }

    public C2599c(Parcel parcel) {
        this.f21618a = parcel.createStringArrayList();
        this.f21619b = parcel.createTypedArrayList(C2598b.CREATOR);
    }
}
