package o0;

import com.google.android.gms.internal.measurement.e5;
import n0.v1;

/* loaded from: classes.dex */
public final class h0 extends e5 {

    /* renamed from: b, reason: collision with root package name */
    public int f18707b;

    /* renamed from: d, reason: collision with root package name */
    public int f18709d;

    /* renamed from: f, reason: collision with root package name */
    public int f18711f;

    /* renamed from: a, reason: collision with root package name */
    public ns.d[] f18706a = new ns.d[16];

    /* renamed from: c, reason: collision with root package name */
    public int[] f18708c = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public Object[] f18710e = new Object[16];

    public final void a0() {
        this.f18707b = 0;
        this.f18709d = 0;
        mq.l.i0(this.f18710e, 0, this.f18711f);
        this.f18711f = 0;
    }

    public final void b0(n0.c cVar, v1 v1Var, al.g gVar, g0 g0Var) {
        if (d0()) {
            androidx.datastore.preferences.protobuf.l lVar = new androidx.datastore.preferences.protobuf.l(this);
            h0 h0Var = (h0) lVar.f1314d;
            while (true) {
                ns.d dVar = h0Var.f18706a[lVar.f1311a];
                n0.a aVarD = dVar.d(lVar);
                n0.c cVar2 = cVar;
                v1 v1Var2 = v1Var;
                al.g gVar2 = gVar;
                g0 g0Var2 = g0Var;
                try {
                    dVar.c(lVar, cVar2, v1Var2, gVar2, g0Var2);
                    int i10 = lVar.f1311a;
                    int i11 = h0Var.f18707b;
                    if (i10 < i11) {
                        ns.d dVar2 = h0Var.f18706a[i10];
                        lVar.f1312b += dVar2.f18526b;
                        lVar.f1313c += dVar2.f18527c;
                        int i12 = i10 + 1;
                        lVar.f1311a = i12;
                        if (i12 >= i11) {
                            break;
                        }
                        cVar = cVar2;
                        v1Var = v1Var2;
                        gVar = gVar2;
                        g0Var = g0Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        a0();
    }

    public final boolean c0() {
        return this.f18707b == 0;
    }

    public final boolean d0() {
        return this.f18707b != 0;
    }

    public final void e0(ns.d dVar) {
        int i10 = this.f18707b;
        ns.d[] dVarArr = this.f18706a;
        if (i10 == dVarArr.length) {
            ns.d[] dVarArr2 = new ns.d[(i10 > 1024 ? 1024 : i10) + i10];
            System.arraycopy(dVarArr, 0, dVarArr2, 0, i10);
            this.f18706a = dVarArr2;
        }
        int i11 = this.f18709d;
        int i12 = dVar.f18526b;
        int i13 = dVar.f18527c;
        int i14 = i11 + i12;
        int[] iArr = this.f18708c;
        int length = iArr.length;
        if (i14 > length) {
            int i15 = (length > 1024 ? 1024 : length) + length;
            if (i15 >= i14) {
                i14 = i15;
            }
            int[] iArr2 = new int[i14];
            mq.l.b0(0, 0, length, iArr, iArr2);
            this.f18708c = iArr2;
        }
        int i16 = this.f18711f + i13;
        Object[] objArr = this.f18710e;
        int length2 = objArr.length;
        if (i16 > length2) {
            int i17 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i17 >= i16) {
                i16 = i17;
            }
            Object[] objArr2 = new Object[i16];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f18710e = objArr2;
        }
        ns.d[] dVarArr3 = this.f18706a;
        int i18 = this.f18707b;
        this.f18707b = i18 + 1;
        dVarArr3[i18] = dVar;
        this.f18709d += dVar.f18526b;
        this.f18711f += i13;
    }
}
