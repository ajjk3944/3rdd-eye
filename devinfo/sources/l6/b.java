package l6;

import android.os.Parcel;
import android.util.SparseIntArray;
import d.h;
import x.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f28594d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f28595e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28596f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final String f28597h;

    /* renamed from: i, reason: collision with root package name */
    public int f28598i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f28599k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e(0), new e(0), new e(0));
    }

    @Override // l6.a
    public final b a() {
        Parcel parcel = this.f28595e;
        int iDataPosition = parcel.dataPosition();
        int i4 = this.j;
        if (i4 == this.f28596f) {
            i4 = this.g;
        }
        return new b(parcel, iDataPosition, i4, h.w(new StringBuilder(), this.f28597h, "  "), this.f28591a, this.f28592b, this.f28593c);
    }

    @Override // l6.a
    public final boolean e(int i4) {
        while (this.j < this.g) {
            int i10 = this.f28599k;
            if (i10 == i4) {
                return true;
            }
            if (String.valueOf(i10).compareTo(String.valueOf(i4)) > 0) {
                return false;
            }
            int i11 = this.j;
            Parcel parcel = this.f28595e;
            parcel.setDataPosition(i11);
            int i12 = parcel.readInt();
            this.f28599k = parcel.readInt();
            this.j += i12;
        }
        return this.f28599k == i4;
    }

    @Override // l6.a
    public final void h(int i4) {
        int i10 = this.f28598i;
        SparseIntArray sparseIntArray = this.f28594d;
        Parcel parcel = this.f28595e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(iDataPosition - i11);
            parcel.setDataPosition(iDataPosition);
        }
        this.f28598i = i4;
        sparseIntArray.put(i4, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i4);
    }

    public b(Parcel parcel, int i4, int i10, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f28594d = new SparseIntArray();
        this.f28598i = -1;
        this.f28599k = -1;
        this.f28595e = parcel;
        this.f28596f = i4;
        this.g = i10;
        this.j = i4;
        this.f28597h = str;
    }
}
