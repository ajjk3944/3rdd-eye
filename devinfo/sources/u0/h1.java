package u0;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f34822a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34823b;

    /* renamed from: c, reason: collision with root package name */
    public int f34824c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f34825d;

    /* renamed from: e, reason: collision with root package name */
    public final x.u f34826e;

    /* renamed from: f, reason: collision with root package name */
    public final yj.n f34827f;

    public h1(int i4, ArrayList arrayList) {
        this.f34822a = arrayList;
        this.f34823b = i4;
        if (i4 < 0) {
            j1.a("Invalid start index");
        }
        this.f34825d = new ArrayList();
        x.u uVar = new x.u();
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            p0 p0Var = (p0) this.f34822a.get(i11);
            int i12 = p0Var.f34924c;
            int i13 = p0Var.f34925d;
            uVar.h(i12, new j0(i11, i10, i13));
            i10 += i13;
        }
        this.f34826e = uVar;
        this.f34827f = a.a.u(new jj.a(1, this));
    }

    public final boolean a(int i4, int i10) {
        int i11;
        x.u uVar = this.f34826e;
        j0 j0Var = (j0) uVar.b(i4);
        if (j0Var == null) {
            return false;
        }
        int i12 = j0Var.f34841b;
        int i13 = i10 - j0Var.f34842c;
        j0Var.f34842c = i10;
        if (i13 == 0) {
            return true;
        }
        Object[] objArr = uVar.f36906c;
        long[] jArr = uVar.f36904a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i14 = 0;
        while (true) {
            long j = jArr[i14];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8 - ((~(i14 - length)) >>> 31);
                for (int i16 = 0; i16 < i15; i16++) {
                    if ((255 & j) < 128) {
                        j0 j0Var2 = (j0) objArr[(i14 << 3) + i16];
                        if (j0Var2.f34841b >= i12 && !j0Var2.equals(j0Var) && (i11 = j0Var2.f34841b + i13) >= 0) {
                            j0Var2.f34841b = i11;
                        }
                    }
                    j >>= 8;
                }
                if (i15 != 8) {
                    return true;
                }
            }
            if (i14 == length) {
                return true;
            }
            i14++;
        }
    }
}
