package p0;

import br.l;
import java.util.NoSuchElementException;
import u.a0;
import u.z;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f20223a;

    public static final Object a(a0 a0Var) {
        Object objG = a0Var.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof z)) {
            a0Var.j(null);
            return objG;
        }
        z zVar = (z) objG;
        if (zVar.g()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i10 = zVar.f23135b - 1;
        Object objE = zVar.e(i10);
        zVar.j(i10);
        l.c(objE, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (zVar.g()) {
            a0Var.j(null);
        }
        if (zVar.f23135b == 1) {
            a0Var.l(null, zVar.d());
        }
        return objE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final u.z b(u.a0 r15) {
        /*
            boolean r0 = r15.i()
            if (r0 == 0) goto Le
            u.z r15 = u.f0.f23068b
            java.lang.String r0 = "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>"
            br.l.c(r15, r0)
            return r15
        Le:
            u.z r0 = new u.z
            r0.<init>()
            java.lang.Object[] r1 = r15.f23039c
            long[] r15 = r15.f23037a
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L88
            r3 = 0
            r4 = r3
        L1e:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L83
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L38:
            if (r9 >= r7) goto L81
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L7d
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof u.z
            if (r11 == 0) goto L75
            u.z r10 = (u.z) r10
            boolean r11 = r10.g()
            if (r11 == 0) goto L55
            goto L7d
        L55:
            int r11 = r0.f23135b
            int r12 = r10.f23135b
            int r11 = r11 + r12
            java.lang.Object[] r12 = r0.f23134a
            int r13 = r12.length
            if (r13 >= r11) goto L62
            r0.l(r11, r12)
        L62:
            java.lang.Object[] r11 = r0.f23134a
            java.lang.Object[] r12 = r10.f23134a
            int r13 = r0.f23135b
            int r14 = r10.f23135b
            mq.l.c0(r13, r3, r14, r12, r11)
            int r11 = r0.f23135b
            int r10 = r10.f23135b
            int r11 = r11 + r10
            r0.f23135b = r11
            goto L7d
        L75:
            java.lang.String r11 = "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap"
            br.l.c(r10, r11)
            r0.a(r10)
        L7d:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L38
        L81:
            if (r7 != r8) goto L88
        L83:
            if (r4 == r2) goto L88
            int r4 = r4 + 1
            goto L1e
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.a.b(u.a0):u.z");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return l.a(this.f20223a, ((a) obj).f20223a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20223a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f20223a + ')';
    }
}
