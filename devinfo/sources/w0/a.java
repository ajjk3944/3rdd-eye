package w0;

import java.util.NoSuchElementException;
import nk.k;
import x.a0;
import x.e0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f36390a;

    public static final Object a(e0 e0Var) {
        Object objG = e0Var.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof a0)) {
            e0Var.k(null);
            return objG;
        }
        a0 a0Var = (a0) objG;
        if (a0Var.h()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i4 = a0Var.f36847b - 1;
        Object objF = a0Var.f(i4);
        a0Var.k(i4);
        k.c(objF, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (a0Var.h()) {
            e0Var.k(null);
        }
        if (a0Var.f36847b == 1) {
            e0Var.m(null, a0Var.e());
        }
        return objF;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final x.a0 b(x.e0 r14) {
        /*
            boolean r0 = r14.i()
            if (r0 == 0) goto Le
            x.a0 r14 = x.j0.f36910b
            java.lang.String r0 = "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>"
            nk.k.c(r14, r0)
            return r14
        Le:
            x.a0 r0 = new x.a0
            r0.<init>()
            java.lang.Object[] r1 = r14.f36875c
            long[] r14 = r14.f36873a
            int r2 = r14.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L65
            r3 = 0
            r4 = r3
        L1e:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L60
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L38:
            if (r9 >= r7) goto L5e
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L5a
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof x.a0
            if (r11 == 0) goto L52
            x.a0 r10 = (x.a0) r10
            r0.c(r10)
            goto L5a
        L52:
            java.lang.String r11 = "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap"
            nk.k.c(r10, r11)
            r0.a(r10)
        L5a:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L38
        L5e:
            if (r7 != r8) goto L65
        L60:
            if (r4 == r2) goto L65
            int r4 = r4 + 1
            goto L1e
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.a.b(x.e0):x.a0");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return k.a(this.f36390a, ((a) obj).f36390a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36390a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f36390a + ')';
    }
}
