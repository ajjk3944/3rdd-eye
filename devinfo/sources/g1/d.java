package g1;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: o, reason: collision with root package name */
    public final c f24218o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f24219p;

    public d(long j, k kVar, mk.c cVar, mk.c cVar2, c cVar3) {
        super(j, kVar, cVar, cVar2);
        this.f24218o = cVar3;
        cVar3.k();
    }

    @Override // g1.c, g1.g
    public final void c() {
        if (this.f24240c) {
            return;
        }
        super.c();
        if (this.f24219p) {
            return;
        }
        this.f24219p = true;
        this.f24218o.l();
    }

    @Override // g1.c
    public final r w() throws Throwable {
        d dVar;
        c cVar = this.f24218o;
        if (cVar.f24214m || cVar.f24240c) {
            return new h(this);
        }
        x.f0 f0Var = this.f24210h;
        long j = this.f24239b;
        HashMap mapB = f0Var != null ? m.b(cVar.g(), this, this.f24218o.d()) : null;
        synchronized (m.f24260c) {
            try {
                m.c(this);
                try {
                    if (f0Var == null || f0Var.f36885d == 0) {
                        dVar = this;
                        a();
                    } else {
                        dVar = this;
                        r rVarZ = dVar.z(this.f24218o.g(), f0Var, mapB, this.f24218o.d());
                        if (!rVarZ.equals(i.f24243c)) {
                            return rVarZ;
                        }
                        x.f0 f0VarX = dVar.f24218o.x();
                        if (f0VarX != null) {
                            f0VarX.k(f0Var);
                        } else {
                            dVar.f24218o.C(f0Var);
                            dVar.f24210h = null;
                        }
                    }
                    if (nk.k.g(dVar.f24218o.g(), j) < 0) {
                        dVar.f24218o.v();
                    }
                    c cVar2 = dVar.f24218o;
                    cVar2.r(cVar2.d().c(j).a(dVar.j));
                    dVar.f24218o.A(j);
                    c cVar3 = dVar.f24218o;
                    int i4 = dVar.f24241d;
                    dVar.f24241d = -1;
                    if (i4 >= 0) {
                        int[] iArr = cVar3.f24212k;
                        nk.k.e(iArr, "<this>");
                        int length = iArr.length;
                        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                        iArrCopyOf[length] = i4;
                        cVar3.f24212k = iArrCopyOf;
                    } else {
                        cVar3.getClass();
                    }
                    dVar.f24218o.B(dVar.j);
                    c cVar4 = dVar.f24218o;
                    int[] iArr2 = dVar.f24212k;
                    cVar4.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = cVar4.f24212k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            nk.k.b(iArrCopyOf2);
                            iArr2 = iArrCopyOf2;
                        }
                        cVar4.f24212k = iArr2;
                    }
                    dVar.f24214m = true;
                    if (!dVar.f24219p) {
                        dVar.f24219p = true;
                        dVar.f24218o.l();
                    }
                    return i.f24243c;
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
