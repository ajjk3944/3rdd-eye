package x0;

import java.util.Arrays;
import java.util.HashMap;
import u.b0;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: o, reason: collision with root package name */
    public final b f24691o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f24692p;

    public c(long j, j jVar, ar.k kVar, ar.k kVar2, b bVar) {
        super(j, jVar, kVar, kVar2);
        this.f24691o = bVar;
        bVar.k();
    }

    @Override // x0.b, x0.f
    public final void c() {
        if (this.f24699c) {
            return;
        }
        super.c();
        if (this.f24692p) {
            return;
        }
        this.f24692p = true;
        this.f24691o.l();
    }

    @Override // x0.b
    public final p w() throws Throwable {
        c cVar;
        b bVar = this.f24691o;
        if (bVar.f24690m || bVar.f24699c) {
            return new g(this);
        }
        b0 b0Var = this.f24687h;
        long j = this.f24698b;
        HashMap mapC = b0Var != null ? l.c(bVar.g(), this, this.f24691o.d()) : null;
        Object obj = l.f24717c;
        synchronized (obj) {
            try {
                l.d(this);
                try {
                    if (b0Var == null || b0Var.f23047d == 0) {
                        cVar = this;
                        a();
                    } else {
                        cVar = this;
                        p pVarZ = cVar.z(this.f24691o.g(), b0Var, mapC, this.f24691o.d());
                        if (!pVarZ.equals(h.f24702b)) {
                            return pVarZ;
                        }
                        b0 b0VarX = cVar.f24691o.x();
                        if (b0VarX != null) {
                            b0VarX.j(b0Var);
                        } else {
                            cVar.f24691o.B(b0Var);
                            cVar.f24687h = null;
                        }
                    }
                    if (br.l.h(cVar.f24691o.g(), j) < 0) {
                        cVar.f24691o.v();
                    }
                    b bVar2 = cVar.f24691o;
                    bVar2.r(bVar2.d().b(j).a(cVar.j));
                    cVar.f24691o.A(j);
                    b bVar3 = cVar.f24691o;
                    int i10 = cVar.f24700d;
                    cVar.f24700d = -1;
                    if (i10 >= 0) {
                        int[] iArr = bVar3.k;
                        br.l.e(iArr, "<this>");
                        int length = iArr.length;
                        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                        iArrCopyOf[length] = i10;
                        bVar3.k = iArrCopyOf;
                    } else {
                        bVar3.getClass();
                    }
                    b bVar4 = cVar.f24691o;
                    j jVar = cVar.j;
                    bVar4.getClass();
                    synchronized (obj) {
                        bVar4.j = bVar4.j.d(jVar);
                        b bVar5 = cVar.f24691o;
                        int[] iArr2 = cVar.k;
                        bVar5.getClass();
                        if (iArr2.length != 0) {
                            int[] iArr3 = bVar5.k;
                            if (iArr3.length != 0) {
                                int length2 = iArr3.length;
                                int length3 = iArr2.length;
                                int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                                System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                                br.l.b(iArrCopyOf2);
                                iArr2 = iArrCopyOf2;
                            }
                            bVar5.k = iArr2;
                        }
                    }
                    cVar.f24690m = true;
                    if (!cVar.f24692p) {
                        cVar.f24692p = true;
                        cVar.f24691o.l();
                    }
                    return h.f24702b;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }
}
