package hc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.i0;
import com.bumptech.glide.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends qb.a {
    public static final Parcelable.Creator<d> CREATOR = new i0(28);

    /* renamed from: a, reason: collision with root package name */
    public final List f25046a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25047b;

    public d(String str, ArrayList arrayList) {
        this.f25046a = arrayList;
        this.f25047b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = f.O(parcel, 20293);
        f.K(parcel, 1, this.f25046a);
        f.I(parcel, 2, this.f25047b);
        f.P(parcel, iO);
    }
}
