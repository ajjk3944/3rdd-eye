package T6;

import H6.C0675l;
import H6.C0683u;
import N7.U3;
import android.view.ViewGroup;
import c9.C2097r;
import i7.C4460a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.z;
import q9.InterfaceC5499a;
import q9.InterfaceC5500b;

/* compiled from: RebindTask.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final C0675l f12306a;

    /* renamed from: b, reason: collision with root package name */
    public final C0683u f12307b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.d f12308c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.d f12309d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f12310e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f12311f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f12312g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f12313h;
    public final LinkedHashMap i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12314j;

    /* renamed from: k, reason: collision with root package name */
    public final e f12315k;

    /* compiled from: RebindTask.kt */
    public static final class a extends IllegalArgumentException {

        /* renamed from: b, reason: collision with root package name */
        public final String f12316b;

        public a(Class<?> cls) {
            this.f12316b = cls + " is unsupported by complex rebind";
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f12316b;
        }
    }

    public d(C0675l div2View, C0683u c0683u, A7.d oldResolver, A7.d newResolver) {
        l.f(div2View, "div2View");
        l.f(oldResolver, "oldResolver");
        l.f(newResolver, "newResolver");
        this.f12306a = div2View;
        this.f12307b = c0683u;
        this.f12308c = oldResolver;
        this.f12309d = newResolver;
        this.f12310e = new LinkedHashSet();
        this.f12311f = new ArrayList();
        this.f12312g = new ArrayList();
        this.f12313h = new ArrayList();
        this.i = new LinkedHashMap();
        this.f12315k = new e();
    }

    public final boolean a(U3 u32, U3 divData, ViewGroup viewGroup) {
        Object next;
        C0675l c0675l = this.f12306a;
        c0675l.getClass();
        U3.a aVarA = c0675l.A(u32);
        if (aVarA != null) {
            T6.a aVar = new T6.a(C4460a.m(aVarA.f6382a, this.f12308c), 0, viewGroup, null);
            l.f(divData, "divData");
            U3.a aVarA2 = c0675l.A(divData);
            if (aVarA2 != null) {
                c cVar = new c(C4460a.m(aVarA2.f6382a, this.f12309d), 0, null);
                if (aVar.a(cVar)) {
                    e(aVar, cVar);
                } else {
                    c(aVar);
                    d(cVar);
                }
                Iterator it = this.f12313h.iterator();
                while (it.hasNext()) {
                    T6.a aVar2 = ((c) it.next()).f12305e;
                    if (aVar2 != null) {
                        e eVar = this.f12315k;
                        eVar.getClass();
                        LinkedList<T6.a> linkedList = eVar.f12317a.get(Integer.valueOf(aVar2.f12321c));
                        if (linkedList != null) {
                            Iterator<T> it2 = linkedList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                if (l.b(((T6.a) next).f12297e, aVar2.f12297e)) {
                                    break;
                                }
                            }
                            if ((linkedList instanceof InterfaceC5499a) && !(linkedList instanceof InterfaceC5500b)) {
                                z.d(linkedList, "kotlin.collections.MutableCollection");
                                throw null;
                            }
                            linkedList.remove(next);
                        }
                        this.f12310e.add(aVar2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void b() {
        this.f12314j = false;
        e eVar = this.f12315k;
        eVar.f12317a.clear();
        eVar.f12318b.clear();
        this.f12310e.clear();
        this.f12312g.clear();
        this.f12313h.clear();
    }

    public final void c(T6.a aVar) {
        String id = aVar.f12322d.d().getId();
        if (id != null) {
            this.i.put(id, aVar);
        } else {
            this.f12312g.add(aVar);
        }
        Iterator<T> it = aVar.b(null).iterator();
        while (it.hasNext()) {
            c((T6.a) it.next());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(T6.c r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = r8.f12312g
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r1.next()
            r4 = r2
            T6.a r4 = (T6.a) r4
            boolean r4 = r4.a(r9)
            if (r4 == 0) goto L6
            goto L1c
        L1b:
            r2 = r3
        L1c:
            T6.a r2 = (T6.a) r2
            if (r2 == 0) goto L27
            r0.remove(r2)
            r8.e(r2, r9)
            return
        L27:
            N7.Z r0 = r9.f12322d
            N7.S2 r0 = r0.d()
            java.lang.String r0 = r0.getId()
            java.util.LinkedHashMap r1 = r8.i
            if (r0 == 0) goto L3c
            java.lang.Object r2 = r1.get(r0)
            T6.a r2 = (T6.a) r2
            goto L3d
        L3c:
            r2 = r3
        L3d:
            if (r0 == 0) goto L7b
            if (r2 == 0) goto L7b
            N7.Z r4 = r2.f12322d
            java.lang.Class r5 = r4.getClass()
            N7.Z r6 = r9.f12322d
            java.lang.Class r7 = r6.getClass()
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L7b
            N7.S2 r4 = r4.d()
            N7.S2 r5 = r6.d()
            A7.d r6 = r8.f12308c
            A7.d r7 = r8.f12309d
            boolean r3 = I6.d.c(r4, r5, r6, r7, r3)
            if (r3 == 0) goto L7b
            r1.remove(r0)
            T6.a r0 = new T6.a
            android.view.View r1 = r2.f12297e
            T6.a r2 = r2.f12298f
            i7.b r3 = r9.f12319a
            int r4 = r9.f12320b
            r0.<init>(r3, r4, r1, r2)
            java.util.ArrayList r1 = r8.f12311f
            r1.add(r0)
            goto L80
        L7b:
            java.util.ArrayList r0 = r8.f12313h
            r0.add(r9)
        L80:
            java.util.List r9 = r9.b()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L8a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r9.next()
            T6.c r0 = (T6.c) r0
            r8.d(r0)
            goto L8a
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T6.d.d(T6.c):void");
    }

    public final void e(T6.a existingToken, c newToken) {
        Object next;
        l.f(existingToken, "existingToken");
        l.f(newToken, "newToken");
        T6.a aVar = new T6.a(newToken.f12319a, newToken.f12320b, existingToken.f12297e, existingToken.f12298f);
        newToken.f12305e = aVar;
        ArrayList arrayListI0 = C2097r.I0(newToken.b());
        ArrayList arrayList = new ArrayList();
        for (T6.a aVar2 : existingToken.b(aVar)) {
            Iterator it = arrayListI0.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((c) next).a(aVar2)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            c cVar = (c) next;
            if (cVar != null) {
                e(aVar2, cVar);
                arrayListI0.remove(cVar);
            } else {
                arrayList.add(aVar2);
            }
        }
        if (arrayListI0.size() != arrayList.size()) {
            this.f12310e.add(aVar);
        } else {
            e eVar = this.f12315k;
            eVar.getClass();
            HashMap<Integer, LinkedList<T6.a>> map = eVar.f12317a;
            Integer numValueOf = Integer.valueOf(aVar.f12321c);
            LinkedList<T6.a> linkedList = map.get(numValueOf);
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                map.put(numValueOf, linkedList);
            }
            linkedList.add(aVar);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c((T6.a) it2.next());
        }
        Iterator it3 = arrayListI0.iterator();
        while (it3.hasNext()) {
            d((c) it3.next());
        }
    }
}
