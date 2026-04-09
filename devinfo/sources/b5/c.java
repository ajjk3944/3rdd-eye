package b5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new androidx.recyclerview.widget.i0(4);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1750a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1751b;

    public c(Parcel parcel) {
        this.f1750a = parcel.createStringArrayList();
        this.f1751b = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStringList(this.f1750a);
        parcel.writeTypedList(this.f1751b);
    }
}
