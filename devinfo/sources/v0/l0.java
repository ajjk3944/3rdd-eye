package v0;

import com.applovin.shadow.okio.Segment;
import u0.e2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l0 extends pk.a {

    /* renamed from: f, reason: collision with root package name */
    public int f35587f;

    /* renamed from: h, reason: collision with root package name */
    public int f35588h;
    public int j;

    /* renamed from: e, reason: collision with root package name */
    public j0[] f35586e = new j0[16];
    public int[] g = new int[16];

    /* renamed from: i, reason: collision with root package name */
    public Object[] f35589i = new Object[16];

    public final void T() {
        this.f35587f = 0;
        this.f35588h = 0;
        zj.m.U(0, this.j, null, this.f35589i);
        this.j = 0;
    }

    public final void U(u0.c cVar, e2 e2Var, c1.o oVar, k0 k0Var) {
        if (W()) {
            androidx.datastore.preferences.protobuf.k kVar = new androidx.datastore.preferences.protobuf.k(this);
            l0 l0Var = (l0) kVar.f1003d;
            while (true) {
                j0 j0Var = l0Var.f35586e[kVar.f1000a];
                u0.a aVarB = j0Var.b(kVar);
                u0.c cVar2 = cVar;
                e2 e2Var2 = e2Var;
                c1.o oVar2 = oVar;
                k0 k0Var2 = k0Var;
                try {
                    j0Var.a(kVar, cVar2, e2Var2, oVar2, k0Var2);
                    int i4 = kVar.f1000a;
                    int i10 = l0Var.f35587f;
                    if (i4 < i10) {
                        j0 j0Var2 = l0Var.f35586e[i4];
                        kVar.f1001b += j0Var2.f35582a;
                        kVar.f1002c += j0Var2.f35583b;
                        int i11 = i4 + 1;
                        kVar.f1000a = i11;
                        if (i11 >= i10) {
                            break;
                        }
                        cVar = cVar2;
                        e2Var = e2Var2;
                        oVar = oVar2;
                        k0Var = k0Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        T();
    }

    public final boolean V() {
        return this.f35587f == 0;
    }

    public final boolean W() {
        return this.f35587f != 0;
    }

    public final void X(j0 j0Var) {
        int i4 = this.f35587f;
        j0[] j0VarArr = this.f35586e;
        int length = j0VarArr.length;
        int i10 = Segment.SHARE_MINIMUM;
        if (i4 == length) {
            j0[] j0VarArr2 = new j0[(i4 > 1024 ? 1024 : i4) + i4];
            System.arraycopy(j0VarArr, 0, j0VarArr2, 0, i4);
            this.f35586e = j0VarArr2;
        }
        int i11 = this.f35588h;
        int i12 = j0Var.f35582a;
        int i13 = j0Var.f35583b;
        int i14 = i11 + i12;
        int[] iArr = this.g;
        int length2 = iArr.length;
        if (i14 > length2) {
            int i15 = (length2 > 1024 ? 1024 : length2) + length2;
            if (i15 >= i14) {
                i14 = i15;
            }
            int[] iArr2 = new int[i14];
            zj.m.M(0, 0, length2, iArr, iArr2);
            this.g = iArr2;
        }
        int i16 = this.j + i13;
        Object[] objArr = this.f35589i;
        int length3 = objArr.length;
        if (i16 > length3) {
            if (length3 <= 1024) {
                i10 = length3;
            }
            int i17 = i10 + length3;
            if (i17 >= i16) {
                i16 = i17;
            }
            Object[] objArr2 = new Object[i16];
            System.arraycopy(objArr, 0, objArr2, 0, length3);
            this.f35589i = objArr2;
        }
        j0[] j0VarArr3 = this.f35586e;
        int i18 = this.f35587f;
        this.f35587f = i18 + 1;
        j0VarArr3[i18] = j0Var;
        this.f35588h += j0Var.f35582a;
        this.j += i13;
    }
}
