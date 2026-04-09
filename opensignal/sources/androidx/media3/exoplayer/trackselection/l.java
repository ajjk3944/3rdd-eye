package androidx.media3.exoplayer.trackselection;

import a5.d0;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.e1;
import java.util.Map;
import o5.h1;

/* loaded from: classes.dex */
public final class l extends e1 {

    /* renamed from: l0, reason: collision with root package name */
    public static final l f1901l0 = new l(new k());
    public final boolean W;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public final boolean f1902a0;

    /* renamed from: b0, reason: collision with root package name */
    public final boolean f1903b0;

    /* renamed from: c0, reason: collision with root package name */
    public final boolean f1904c0;

    /* renamed from: d0, reason: collision with root package name */
    public final boolean f1905d0;

    /* renamed from: e0, reason: collision with root package name */
    public final boolean f1906e0;

    /* renamed from: f0, reason: collision with root package name */
    public final boolean f1907f0;

    /* renamed from: g0, reason: collision with root package name */
    public final boolean f1908g0;

    /* renamed from: h0, reason: collision with root package name */
    public final boolean f1909h0;

    /* renamed from: i0, reason: collision with root package name */
    public final boolean f1910i0;

    /* renamed from: j0, reason: collision with root package name */
    public final SparseArray f1911j0;

    /* renamed from: k0, reason: collision with root package name */
    public final SparseBooleanArray f1912k0;

    static {
        int i10 = d0.f105a;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
    }

    public l(k kVar) {
        super(kVar);
        this.W = kVar.A;
        this.X = kVar.B;
        this.Y = kVar.C;
        this.Z = kVar.D;
        this.f1902a0 = kVar.E;
        this.f1903b0 = kVar.F;
        this.f1904c0 = kVar.G;
        this.f1905d0 = kVar.H;
        this.f1906e0 = kVar.I;
        this.f1907f0 = kVar.J;
        this.f1908g0 = kVar.K;
        this.f1909h0 = kVar.L;
        this.f1910i0 = kVar.M;
        this.f1911j0 = kVar.N;
        this.f1912k0 = kVar.O;
    }

    @Override // androidx.media3.common.e1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (super.equals(lVar) && this.W == lVar.W && this.X == lVar.X && this.Y == lVar.Y && this.Z == lVar.Z && this.f1902a0 == lVar.f1902a0 && this.f1903b0 == lVar.f1903b0 && this.f1904c0 == lVar.f1904c0 && this.f1905d0 == lVar.f1905d0 && this.f1906e0 == lVar.f1906e0 && this.f1907f0 == lVar.f1907f0 && this.f1908g0 == lVar.f1908g0 && this.f1909h0 == lVar.f1909h0 && this.f1910i0 == lVar.f1910i0) {
                SparseBooleanArray sparseBooleanArray = lVar.f1912k0;
                SparseBooleanArray sparseBooleanArray2 = this.f1912k0;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            SparseArray sparseArray = lVar.f1911j0;
                            SparseArray sparseArray2 = this.f1911j0;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i11 = 0; i11 < size2; i11++) {
                                    int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i11));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i11);
                                        Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                h1 h1Var = (h1) entry.getKey();
                                                if (!map2.containsKey(h1Var) || !d0.a(entry.getValue(), map2.get(h1Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i10)) < 0) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.common.e1
    public final int hashCode() {
        return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.W ? 1 : 0)) * 31) + (this.X ? 1 : 0)) * 31) + (this.Y ? 1 : 0)) * 31) + (this.Z ? 1 : 0)) * 31) + (this.f1902a0 ? 1 : 0)) * 31) + (this.f1903b0 ? 1 : 0)) * 31) + (this.f1904c0 ? 1 : 0)) * 31) + (this.f1905d0 ? 1 : 0)) * 31) + (this.f1906e0 ? 1 : 0)) * 31) + (this.f1907f0 ? 1 : 0)) * 31) + (this.f1908g0 ? 1 : 0)) * 31) + (this.f1909h0 ? 1 : 0)) * 31) + (this.f1910i0 ? 1 : 0);
    }
}
