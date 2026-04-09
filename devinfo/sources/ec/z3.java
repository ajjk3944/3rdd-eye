package ec;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z3 extends qb.a {
    public static final Parcelable.Creator<z3> CREATOR = new androidx.recyclerview.widget.i0(19);

    /* renamed from: a, reason: collision with root package name */
    public final List f23254a;

    public z3(ArrayList arrayList) {
        this.f23254a = arrayList;
    }

    public static z3 a(x2... x2VarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(x2VarArr[0].f23174a));
        return new z3(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.G(parcel, 1, this.f23254a);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
