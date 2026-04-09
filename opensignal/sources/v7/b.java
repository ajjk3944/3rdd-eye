package v7;

import android.os.Parcel;
import android.util.SparseIntArray;
import u.e;
import w.g;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f23901d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f23902e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23903f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23904g;

    /* renamed from: h, reason: collision with root package name */
    public final String f23905h;

    /* renamed from: i, reason: collision with root package name */
    public int f23906i;
    public int j;
    public int k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e(0), new e(0), new e(0));
    }

    @Override // v7.a
    public final b a() {
        Parcel parcel = this.f23902e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.j;
        if (i10 == this.f23903f) {
            i10 = this.f23904g;
        }
        return new b(parcel, iDataPosition, i10, g.j(new StringBuilder(), this.f23905h, "  "), this.f23898a, this.f23899b, this.f23900c);
    }

    @Override // v7.a
    public final boolean e(int i10) {
        while (this.j < this.f23904g) {
            int i11 = this.k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.j;
            Parcel parcel = this.f23902e;
            parcel.setDataPosition(i12);
            int i13 = parcel.readInt();
            this.k = parcel.readInt();
            this.j += i13;
        }
        return this.k == i10;
    }

    @Override // v7.a
    public final void i(int i10) {
        int i11 = this.f23906i;
        SparseIntArray sparseIntArray = this.f23901d;
        Parcel parcel = this.f23902e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(iDataPosition - i12);
            parcel.setDataPosition(iDataPosition);
        }
        this.f23906i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public b(Parcel parcel, int i10, int i11, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f23901d = new SparseIntArray();
        this.f23906i = -1;
        this.k = -1;
        this.f23902e = parcel;
        this.f23903f = i10;
        this.f23904g = i11;
        this.j = i10;
        this.f23905h = str;
    }
}
