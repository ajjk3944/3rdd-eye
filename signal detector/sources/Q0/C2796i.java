package q0;

import android.util.Log;
import d5.AbstractC2282j;
import d5.C2280h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: q0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2796i {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f22978a;

    /* renamed from: b, reason: collision with root package name */
    public final C5.o f22979b;

    /* renamed from: c, reason: collision with root package name */
    public final C5.o f22980c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22981d;

    /* renamed from: e, reason: collision with root package name */
    public final A0.e f22982e;

    /* renamed from: f, reason: collision with root package name */
    public final A0.e f22983f;

    /* renamed from: g, reason: collision with root package name */
    public final L f22984g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z f22985h;

    public C2796i(z zVar, L l2) {
        q5.i.e(l2, "navigator");
        this.f22985h = zVar;
        this.f22978a = new ReentrantLock(true);
        C5.o oVar = new C5.o(d5.s.f19824a);
        this.f22979b = oVar;
        C5.o oVar2 = new C5.o(d5.u.f19826a);
        this.f22980c = oVar2;
        this.f22982e = new A0.e(3, oVar);
        this.f22983f = new A0.e(3, oVar2);
        this.f22984g = l2;
    }

    public final void a(C2794g c2794g) {
        q5.i.e(c2794g, "backStackEntry");
        ReentrantLock reentrantLock = this.f22978a;
        reentrantLock.lock();
        try {
            C5.o oVar = this.f22979b;
            Collection collection = (Collection) oVar.I();
            q5.i.e(collection, "<this>");
            ArrayList arrayList = new ArrayList(collection.size() + 1);
            arrayList.addAll(collection);
            arrayList.add(c2794g);
            oVar.J(arrayList);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(q0.C2794g r15) {
        /*
            r14 = this;
            java.lang.String r0 = "entry"
            q5.i.e(r15, r0)
            java.lang.String r0 = r15.f22969f
            q0.z r1 = r14.f22985h
            C5.o r2 = r1.i
            d5.h r3 = r1.f23061g
            java.util.LinkedHashMap r4 = r1.f23078y
            java.lang.Object r5 = r4.get(r15)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r5 = q5.i.a(r5, r6)
            C5.o r6 = r14.f22980c
            java.lang.Object r7 = r6.I()
            java.util.Set r7 = (java.util.Set) r7
            java.lang.String r8 = "<this>"
            q5.i.e(r7, r8)
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            int r9 = r7.size()
            int r9 = d5.v.J(r9)
            r8.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
            r9 = 0
            r10 = r9
        L39:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L54
            java.lang.Object r11 = r7.next()
            r12 = 1
            if (r10 != 0) goto L4e
            boolean r13 = q5.i.a(r11, r15)
            if (r13 == 0) goto L4e
            r10 = r12
            r12 = r9
        L4e:
            if (r12 == 0) goto L39
            r8.add(r11)
            goto L39
        L54:
            r6.J(r8)
            r4.remove(r15)
            boolean r4 = r3.contains(r15)
            if (r4 != 0) goto Lb9
            r1.t(r15)
            androidx.lifecycle.w r4 = r15.f22971h
            androidx.lifecycle.n r4 = r4.f5259d
            androidx.lifecycle.n r6 = androidx.lifecycle.EnumC0292n.f5245c
            int r4 = r4.compareTo(r6)
            if (r4 < 0) goto L74
            androidx.lifecycle.n r4 = androidx.lifecycle.EnumC0292n.f5243a
            r15.b(r4)
        L74:
            if (r3 == 0) goto L7d
            boolean r15 = r3.isEmpty()
            if (r15 == 0) goto L7d
            goto L96
        L7d:
            java.util.Iterator r15 = r3.iterator()
        L81:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L96
            java.lang.Object r3 = r15.next()
            q0.g r3 = (q0.C2794g) r3
            java.lang.String r3 = r3.f22969f
            boolean r3 = q5.i.a(r3, r0)
            if (r3 == 0) goto L81
            goto Lae
        L96:
            if (r5 != 0) goto Lae
            q0.o r15 = r1.f23068o
            if (r15 == 0) goto Lae
            java.lang.String r3 = "backStackEntryId"
            q5.i.e(r0, r3)
            java.util.LinkedHashMap r15 = r15.f23003b
            java.lang.Object r15 = r15.remove(r0)
            androidx.lifecycle.a0 r15 = (androidx.lifecycle.a0) r15
            if (r15 == 0) goto Lae
            r15.a()
        Lae:
            r1.u()
            java.util.ArrayList r15 = r1.q()
            r2.J(r15)
            return
        Lb9:
            boolean r15 = r14.f22981d
            if (r15 != 0) goto Ld0
            r1.u()
            C5.o r15 = r1.f23062h
            java.util.ArrayList r0 = d5.AbstractC2282j.k0(r3)
            r15.J(r0)
            java.util.ArrayList r15 = r1.q()
            r2.J(r15)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.C2796i.b(q0.g):void");
    }

    public final void c(C2794g c2794g) {
        int iNextIndex;
        ReentrantLock reentrantLock = this.f22978a;
        reentrantLock.lock();
        try {
            ArrayList arrayListK0 = AbstractC2282j.k0((Collection) ((C5.o) this.f22982e.f73b).I());
            ListIterator listIterator = arrayListK0.listIterator(arrayListK0.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (q5.i.a(((C2794g) listIterator.previous()).f22969f, c2794g.f22969f)) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            arrayListK0.set(iNextIndex, c2794g);
            this.f22979b.J(arrayListK0);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(C2794g c2794g) {
        q5.i.e(c2794g, "popUpTo");
        z zVar = this.f22985h;
        L lB = zVar.f23074u.b(c2794g.f22965b.f23036a);
        if (!lB.equals(this.f22984g)) {
            Object obj = zVar.f23075v.get(lB);
            q5.i.b(obj);
            ((C2796i) obj).d(c2794g);
            return;
        }
        C2798k c2798k = zVar.f23077x;
        if (c2798k != null) {
            c2798k.f(c2794g);
            e(c2794g);
            return;
        }
        C2280h c2280h = zVar.f23061g;
        int iIndexOf = c2280h.indexOf(c2794g);
        if (iIndexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + c2794g + " as it was not found on the current back stack");
            return;
        }
        int i = iIndexOf + 1;
        if (i != c2280h.f19820c) {
            zVar.n(((C2794g) c2280h.get(i)).f22965b.f23043h, true, false);
        }
        z.p(zVar, c2794g);
        e(c2794g);
        zVar.v();
        zVar.c();
    }

    public final void e(C2794g c2794g) {
        q5.i.e(c2794g, "popUpTo");
        ReentrantLock reentrantLock = this.f22978a;
        reentrantLock.lock();
        try {
            C5.o oVar = this.f22979b;
            Iterable iterable = (Iterable) oVar.I();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (q5.i.a((C2794g) obj, c2794g)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            oVar.J(arrayList);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void f(C2794g c2794g, boolean z6) {
        Object objPrevious;
        q5.i.e(c2794g, "popUpTo");
        C5.o oVar = this.f22980c;
        Iterable iterable = (Iterable) oVar.I();
        boolean z7 = iterable instanceof Collection;
        A0.e eVar = this.f22982e;
        if (z7 && ((Collection) iterable).isEmpty()) {
            oVar.J(d5.y.m((Set) oVar.I(), c2794g));
            C5.o oVar2 = (C5.o) eVar.f73b;
            C5.o oVar3 = (C5.o) eVar.f73b;
            List list = (List) oVar2.I();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                C2794g c2794g2 = (C2794g) objPrevious;
                if (!q5.i.a(c2794g2, c2794g) && ((List) oVar3.I()).lastIndexOf(c2794g2) < ((List) oVar3.I()).lastIndexOf(c2794g)) {
                    break;
                }
            }
            C2794g c2794g3 = (C2794g) objPrevious;
            if (c2794g3 != null) {
                oVar.J(d5.y.m((Set) oVar.I(), c2794g3));
            }
            d(c2794g);
        } else {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C2794g) it.next()) == c2794g) {
                    Iterable iterable2 = (Iterable) ((C5.o) eVar.f73b).I();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((C2794g) it2.next()) == c2794g) {
                            }
                        }
                    }
                }
            }
        }
        this.f22985h.f23078y.put(c2794g, Boolean.valueOf(z6));
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [p5.l, q5.j] */
    public final void g(C2794g c2794g) {
        q5.i.e(c2794g, "backStackEntry");
        z zVar = this.f22985h;
        L lB = zVar.f23074u.b(c2794g.f22965b.f23036a);
        if (!lB.equals(this.f22984g)) {
            Object obj = zVar.f23075v.get(lB);
            if (obj == null) {
                throw new IllegalStateException(A.f.p(new StringBuilder("NavigatorBackStack for "), c2794g.f22965b.f23036a, " should already be created").toString());
            }
            ((C2796i) obj).g(c2794g);
            return;
        }
        ?? r02 = zVar.f23076w;
        if (r02 != 0) {
            r02.f(c2794g);
            a(c2794g);
        } else {
            Log.i("NavController", "Ignoring add of destination " + c2794g.f22965b + " outside of the call to navigate(). ");
        }
    }

    public final void h(C2794g c2794g) {
        C5.o oVar = this.f22980c;
        Iterable iterable = (Iterable) oVar.I();
        boolean z6 = iterable instanceof Collection;
        A0.e eVar = this.f22982e;
        if (!z6 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C2794g) it.next()) == c2794g) {
                    Iterable iterable2 = (Iterable) ((C5.o) eVar.f73b).I();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((C2794g) it2.next()) == c2794g) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        C2794g c2794g2 = (C2794g) AbstractC2282j.Z((List) ((C5.o) eVar.f73b).I());
        if (c2794g2 != null) {
            oVar.J(d5.y.m((Set) oVar.I(), c2794g2));
        }
        oVar.J(d5.y.m((Set) oVar.I(), c2794g));
        g(c2794g);
    }
}
