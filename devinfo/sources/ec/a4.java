package ec;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a4 extends qb.a {
    public static final Parcelable.Creator<a4> CREATOR = new androidx.recyclerview.widget.i0(20);

    /* renamed from: a, reason: collision with root package name */
    public final List f22546a;

    public a4(ArrayList arrayList) {
        this.f22546a = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.M(parcel, 1, this.f22546a);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
