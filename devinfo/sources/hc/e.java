package hc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.i0;
import com.bumptech.glide.f;
import pb.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends qb.a {
    public static final Parcelable.Creator<e> CREATOR = new i0(29);

    /* renamed from: a, reason: collision with root package name */
    public final int f25048a;

    /* renamed from: b, reason: collision with root package name */
    public final nb.b f25049b;

    /* renamed from: c, reason: collision with root package name */
    public final s f25050c;

    public e(int i4, nb.b bVar, s sVar) {
        this.f25048a = i4;
        this.f25049b = bVar;
        this.f25050c = sVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = f.O(parcel, 20293);
        f.N(parcel, 1, 4);
        parcel.writeInt(this.f25048a);
        f.H(parcel, 2, this.f25049b, i4);
        f.H(parcel, 3, this.f25050c, i4);
        f.P(parcel, iO);
    }
}
