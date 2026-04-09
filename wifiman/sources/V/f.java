package V;

import kotlin.jvm.internal.AbstractC6492s;
import o.C7009H;
import o.I;
import o.S;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final C7009H f22958a = S.d();

    public final void a(Object obj, Object obj2) {
        C7009H c7009h = this.f22958a;
        int iL = c7009h.l(obj);
        boolean z10 = iL < 0;
        Object obj3 = z10 ? null : c7009h.f54923c[iL];
        if (obj3 != null) {
            if (obj3 instanceof I) {
                AbstractC6492s.g(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>");
                ((I) obj3).h(obj2);
            } else if (obj3 != obj2) {
                I i10 = new I(0, 1, null);
                AbstractC6492s.g(obj3, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0");
                i10.h(obj3);
                i10.h(obj2);
                obj2 = i10;
            }
            obj2 = obj3;
        }
        if (!z10) {
            c7009h.f54923c[iL] = obj2;
            return;
        }
        int i11 = ~iL;
        c7009h.f54922b[i11] = obj;
        c7009h.f54923c[i11] = obj2;
    }

    public final void b() {
        this.f22958a.i();
    }

    public final boolean c(Object obj) {
        return this.f22958a.b(obj);
    }

    public final C7009H d() {
        return this.f22958a;
    }

    public final int e() {
        return this.f22958a.e();
    }

    public final boolean f(Object obj, Object obj2) {
        Object objC = this.f22958a.c(obj);
        if (objC == null) {
            return false;
        }
        if (!(objC instanceof I)) {
            if (!AbstractC6492s.d(objC, obj2)) {
                return false;
            }
            this.f22958a.p(obj);
            return true;
        }
        I i10 = (I) objC;
        boolean zX = i10.x(obj2);
        if (zX && i10.d()) {
            this.f22958a.p(obj);
        }
        return zX;
    }

    public final void g(Object obj) {
        boolean zD;
        C7009H c7009h = this.f22958a;
        long[] jArr = c7009h.f54921a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj2 = c7009h.f54922b[i13];
                        Object obj3 = c7009h.f54923c[i13];
                        if (obj3 instanceof I) {
                            AbstractC6492s.g(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                            I i14 = (I) obj3;
                            i14.x(obj);
                            zD = i14.d();
                        } else {
                            zD = obj3 == obj;
                        }
                        if (zD) {
                            c7009h.q(i13);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void h(Object obj, Object obj2) {
        this.f22958a.s(obj, obj2);
    }
}
