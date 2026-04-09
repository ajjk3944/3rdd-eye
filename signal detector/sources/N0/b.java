package N0;

import A.f;
import android.os.Parcel;
import android.util.SparseIntArray;
import u.C2936e;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f2975d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f2976e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2977f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2978g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2979h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2980j;

    /* renamed from: k, reason: collision with root package name */
    public int f2981k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C2936e(0), new C2936e(0), new C2936e(0));
    }

    @Override // N0.a
    public final b a() {
        Parcel parcel = this.f2976e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f2980j;
        if (i == this.f2977f) {
            i = this.f2978g;
        }
        return new b(parcel, iDataPosition, i, f.p(new StringBuilder(), this.f2979h, "  "), this.f2972a, this.f2973b, this.f2974c);
    }

    @Override // N0.a
    public final boolean e(int i) {
        while (this.f2980j < this.f2978g) {
            int i3 = this.f2981k;
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i6 = this.f2980j;
            Parcel parcel = this.f2976e;
            parcel.setDataPosition(i6);
            int i7 = parcel.readInt();
            this.f2981k = parcel.readInt();
            this.f2980j += i7;
        }
        return this.f2981k == i;
    }

    @Override // N0.a
    public final void h(int i) {
        int i3 = this.i;
        SparseIntArray sparseIntArray = this.f2975d;
        Parcel parcel = this.f2976e;
        if (i3 >= 0) {
            int i6 = sparseIntArray.get(i3);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i6);
            parcel.writeInt(iDataPosition - i6);
            parcel.setDataPosition(iDataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public b(Parcel parcel, int i, int i3, String str, C2936e c2936e, C2936e c2936e2, C2936e c2936e3) {
        super(c2936e, c2936e2, c2936e3);
        this.f2975d = new SparseIntArray();
        this.i = -1;
        this.f2981k = -1;
        this.f2976e = parcel;
        this.f2977f = i;
        this.f2978g = i3;
        this.f2980j = i;
        this.f2979h = str;
    }
}
