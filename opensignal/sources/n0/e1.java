package n0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f17161a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17162b;

    /* renamed from: c, reason: collision with root package name */
    public int f17163c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f17164d;

    /* renamed from: e, reason: collision with root package name */
    public final u.t f17165e;

    /* renamed from: f, reason: collision with root package name */
    public final lq.q f17166f;

    public e1(int i10, ArrayList arrayList) {
        this.f17161a = arrayList;
        this.f17162b = i10;
        if (i10 < 0) {
            g1.a("Invalid start index");
        }
        this.f17164d = new ArrayList();
        u.t tVar = new u.t();
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            p0 p0Var = (p0) this.f17161a.get(i12);
            int i13 = p0Var.f17280c;
            int i14 = p0Var.f17281d;
            tVar.h(i13, new i0(i12, i11, i14));
            i11 += i14;
        }
        this.f17165e = tVar;
        this.f17166f = kc.f.F(new d1(0, this));
    }

    public final boolean a(int i10, int i11) {
        int i12;
        u.t tVar = this.f17165e;
        i0 i0Var = (i0) tVar.b(i10);
        if (i0Var == null) {
            return false;
        }
        int i13 = i0Var.f17181b;
        int i14 = i11 - i0Var.f17182c;
        i0Var.f17182c = i11;
        if (i14 == 0) {
            return true;
        }
        Object[] objArr = tVar.f23080c;
        long[] jArr = tVar.f23078a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i15 = 0;
        while (true) {
            long j = jArr[i15];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j) < 128) {
                        i0 i0Var2 = (i0) objArr[(i15 << 3) + i17];
                        if (i0Var2.f17181b >= i13 && !i0Var2.equals(i0Var) && (i12 = i0Var2.f17181b + i14) >= 0) {
                            i0Var2.f17181b = i12;
                        }
                    }
                    j >>= 8;
                }
                if (i16 != 8) {
                    return true;
                }
            }
            if (i15 == length) {
                return true;
            }
            i15++;
        }
    }
}
