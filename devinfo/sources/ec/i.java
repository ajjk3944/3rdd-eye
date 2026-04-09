package ec;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i extends qb.a {
    public static final Parcelable.Creator<i> CREATOR = new androidx.recyclerview.widget.i0(14);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f22786a;

    public i(Bundle bundle) {
        this.f22786a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.D(parcel, 1, this.f22786a);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
