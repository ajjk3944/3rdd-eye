package I6;

import N7.U3;
import N7.Z;
import S6.a;
import c9.C2097r;
import c9.C2099t;
import i7.C4460a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DivComparator.kt */
/* loaded from: classes.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(List list, List list2, S6.a aVar) {
        if (list.size() == list2.size()) {
            ArrayList arrayListM0 = C2097r.M0(list2, list);
            if (arrayListM0.isEmpty()) {
                return true;
            }
            Iterator it = arrayListM0.iterator();
            while (it.hasNext()) {
                b9.l lVar = (b9.l) it.next();
                i7.b bVar = (i7.b) lVar.f18083b;
                Z z10 = bVar.f38460a;
                i7.b bVar2 = (i7.b) lVar.f18084c;
                if (!b(z10, bVar2.f38460a, bVar.f38461b, bVar2.f38461b, aVar)) {
                }
            }
            return true;
        }
        if (aVar != null) {
            aVar.d();
            return false;
        }
        return false;
    }

    public static boolean b(Z z10, Z z11, A7.d oldResolver, A7.d newResolver, S6.a aVar) {
        kotlin.jvm.internal.l.f(oldResolver, "oldResolver");
        kotlin.jvm.internal.l.f(newResolver, "newResolver");
        if (kotlin.jvm.internal.l.b(z10 != null ? z10.getClass() : null, z11 != null ? z11.getClass() : null)) {
            if (z10 == null || z11 == null || z10 == z11) {
                return true;
            }
            if (c(z10.d(), z11.d(), oldResolver, newResolver, aVar) && a(d(z10, oldResolver), d(z11, newResolver), aVar)) {
                return true;
            }
        } else if (aVar != null) {
            aVar.c();
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(N7.S2 r5, N7.S2 r6, A7.d r7, A7.d r8, S6.a r9) {
        /*
            java.lang.String r0 = "old"
            kotlin.jvm.internal.l.f(r5, r0)
            java.lang.String r0 = "new"
            kotlin.jvm.internal.l.f(r6, r0)
            java.lang.String r0 = "oldResolver"
            kotlin.jvm.internal.l.f(r7, r0)
            java.lang.String r0 = "newResolver"
            kotlin.jvm.internal.l.f(r8, r0)
            java.lang.String r0 = r5.getId()
            r1 = 0
            if (r0 == 0) goto L5a
            java.lang.String r0 = r6.getId()
            if (r0 == 0) goto L5a
            java.lang.String r0 = r5.getId()
            java.lang.String r2 = r6.getId()
            boolean r0 = kotlin.jvm.internal.l.b(r0, r2)
            if (r0 != 0) goto L5a
            N7.F2 r0 = r5.w()
            if (r0 != 0) goto L54
            N7.F2 r0 = r5.B()
            if (r0 != 0) goto L54
            N7.g3 r0 = r5.C()
            if (r0 == 0) goto L42
            goto L54
        L42:
            N7.F2 r0 = r6.w()
            if (r0 != 0) goto L54
            N7.F2 r0 = r6.B()
            if (r0 != 0) goto L54
            N7.g3 r0 = r6.C()
            if (r0 == 0) goto L5a
        L54:
            if (r9 == 0) goto Lb4
            r9.b()
            return r1
        L5a:
            boolean r0 = r5 instanceof N7.R3
            if (r0 == 0) goto L78
            boolean r0 = r6 instanceof N7.R3
            if (r0 == 0) goto L78
            r0 = r5
            N7.R3 r0 = (N7.R3) r0
            r2 = r6
            N7.R3 r2 = (N7.R3) r2
            java.lang.String r2 = r2.f6132j
            java.lang.String r0 = r0.f6132j
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L78
            if (r9 == 0) goto Lb4
            r9.e()
            return r1
        L78:
            boolean r0 = r5 instanceof N7.C1431y3
            r2 = 1
            if (r0 == 0) goto Lb5
            boolean r0 = r6 instanceof N7.C1431y3
            if (r0 == 0) goto Lb5
            N7.y3 r5 = (N7.C1431y3) r5
            A7.b<N7.y3$b> r0 = r5.f9830G
            java.lang.Object r0 = r0.a(r7)
            N7.y3$b r3 = N7.C1431y3.b.OVERLAP
            if (r0 != r3) goto L8f
            r0 = r2
            goto L90
        L8f:
            r0 = r1
        L90:
            N7.y3 r6 = (N7.C1431y3) r6
            A7.b<N7.y3$b> r4 = r6.f9830G
            java.lang.Object r4 = r4.a(r8)
            if (r4 != r3) goto L9c
            r3 = r2
            goto L9d
        L9c:
            r3 = r1
        L9d:
            if (r0 == r3) goto La5
            if (r9 == 0) goto Lb4
            r9.a()
            return r1
        La5:
            boolean r5 = K6.C0713c.T(r5, r7)
            boolean r6 = K6.C0713c.T(r6, r8)
            if (r5 == r6) goto Lb5
            if (r9 == 0) goto Lb4
            r9.f()
        Lb4:
            return r1
        Lb5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: I6.d.c(N7.S2, N7.S2, A7.d, A7.d, S6.a):boolean");
    }

    public static List d(Z z10, A7.d dVar) {
        if (z10 instanceof Z.a) {
            return C4460a.b(((Z.a) z10).f7813c, dVar);
        }
        if (z10 instanceof Z.e) {
            return C4460a.j(((Z.e) z10).f7817c, dVar);
        }
        boolean z11 = z10 instanceof Z.f;
        C2099t c2099t = C2099t.f18581b;
        if (z11 || (z10 instanceof Z.d) || (z10 instanceof Z.p) || (z10 instanceof Z.k) || (z10 instanceof Z.c) || (z10 instanceof Z.i) || (z10 instanceof Z.o) || (z10 instanceof Z.m) || (z10 instanceof Z.b) || (z10 instanceof Z.h) || (z10 instanceof Z.j) || (z10 instanceof Z.g) || (z10 instanceof Z.l) || (z10 instanceof Z.q) || (z10 instanceof Z.n)) {
            return c2099t;
        }
        throw new b9.j();
    }

    public static boolean e(U3 u32, U3 u33, long j4, A7.d oldResolver, A7.d newResolver) {
        Object obj;
        Object next;
        a.C0167a.C0168a c0168a = a.C0167a.f11993a;
        kotlin.jvm.internal.l.f(u33, "new");
        kotlin.jvm.internal.l.f(oldResolver, "oldResolver");
        kotlin.jvm.internal.l.f(newResolver, "newResolver");
        if (u32 == null) {
            return false;
        }
        Iterator<T> it = u32.f6376c.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((U3.a) next).f6383b == j4) {
                break;
            }
        }
        U3.a aVar = (U3.a) next;
        Iterator<T> it2 = u33.f6376c.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((U3.a) next2).f6383b == j4) {
                obj = next2;
                break;
            }
        }
        U3.a aVar2 = (U3.a) obj;
        if (aVar == null || aVar2 == null) {
            return false;
        }
        return b(aVar.f6382a, aVar2.f6382a, oldResolver, newResolver, c0168a);
    }
}
