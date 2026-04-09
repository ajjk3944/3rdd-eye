package H6;

import G0.i;
import K6.C0713c;
import N7.B9;
import N7.C1179g4;
import N7.C1370tc;
import N7.S2;
import N7.Z;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import b9.C1992A;
import c9.C2077A;
import c9.C2092m;
import c9.C2097r;
import c9.C2099t;
import h7.C4421b;
import i6.C4458a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: DivVisibilityActionTracker.kt */
/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final B7.e f2064a;

    /* renamed from: b, reason: collision with root package name */
    public final K f2065b;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2074l;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f2066c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final A3.c f2067d = new A3.c(1);

    /* renamed from: e, reason: collision with root package name */
    public final A3.c f2068e = new A3.c(1);

    /* renamed from: f, reason: collision with root package name */
    public final V f2069f = new V(new b(), new c());

    /* renamed from: g, reason: collision with root package name */
    public final WeakHashMap<View, Z> f2070g = new WeakHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    public final WeakHashMap<View, Z> f2071h = new WeakHashMap<>();
    public final WeakHashMap<View, Boolean> i = new WeakHashMap<>();

    /* renamed from: j, reason: collision with root package name */
    public final C6.p<View, Z> f2072j = new C6.p<>();

    /* renamed from: k, reason: collision with root package name */
    public final WeakHashMap<View, Set<C1179g4>> f2073k = new WeakHashMap<>();

    /* renamed from: m, reason: collision with root package name */
    public final C8.a f2075m = new C8.a(this, 2);

    /* compiled from: DivVisibilityActionTracker.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Map<C0673j, ? extends B9>, C1992A> {
        public a() {
            super(1);
        }

        @Override // p9.l
        public final C1992A invoke(Map<C0673j, ? extends B9> map) {
            Map<C0673j, ? extends B9> emptyToken = map;
            kotlin.jvm.internal.l.f(emptyToken, "emptyToken");
            L.this.f2066c.removeCallbacksAndMessages(emptyToken);
            return C1992A.f18074a;
        }
    }

    /* compiled from: DivVisibilityActionTracker.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.s<C0675l, A7.d, View, Z, B9, C1992A> {
        public b() {
            super(5);
        }
    }

    /* compiled from: DivVisibilityActionTracker.kt */
    public static final class c extends kotlin.jvm.internal.m implements p9.s<C0675l, A7.d, View, Z, B9, C1992A> {
        public c() {
            super(5);
        }
    }

    /* compiled from: DivVisibilityActionTracker.kt */
    public static final class d extends kotlin.jvm.internal.m implements p9.p<View, Z, Boolean> {

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ C0672i f2080h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0672i c0672i) {
            super(2);
            this.f2080h = c0672i;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
        @Override // p9.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(android.view.View r8, N7.Z r9) {
            /*
                r7 = this;
                android.view.View r8 = (android.view.View) r8
                N7.Z r9 = (N7.Z) r9
                java.lang.String r0 = "currentView"
                kotlin.jvm.internal.l.f(r8, r0)
                H6.L r0 = H6.L.this
                B7.e r1 = r0.f2064a
                boolean r2 = r8.isShown()
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L36
                java.lang.Object r1 = r1.f583c
                android.graphics.Rect r1 = (android.graphics.Rect) r1
                boolean r2 = r8.getGlobalVisibleRect(r1)
                if (r2 != 0) goto L20
                goto L36
            L20:
                int r2 = r8.getWidth()
                int r5 = r1.width()
                if (r2 != r5) goto L36
                int r2 = r8.getHeight()
                int r1 = r1.height()
                if (r2 != r1) goto L36
                r1 = r3
                goto L37
            L36:
                r1 = r4
            L37:
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r2 = r0.i
                if (r1 == 0) goto L49
                java.lang.Object r5 = r2.get(r8)
                java.lang.Boolean r6 = java.lang.Boolean.TRUE
                boolean r5 = kotlin.jvm.internal.l.b(r5, r6)
                if (r5 == 0) goto L49
                r3 = r4
                goto L5b
            L49:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2.put(r8, r1)
                if (r9 == 0) goto L5b
                H6.i r1 = r7.f2080h
                H6.l r2 = r1.f2146a
                A7.d r1 = r1.f2147b
                H6.L.j(r0, r2, r1, r8, r9)
            L5b:
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: H6.L.d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Views.kt */
    public static final class e implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C0675l f2081b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C4458a f2082c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ L f2083d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ View f2084e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ A7.d f2085f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Z f2086g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2087h;
        public final /* synthetic */ List i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ List f2088j;

        public e(C0675l c0675l, C4458a c4458a, L l5, View view, A7.d dVar, Z z10, ArrayList arrayList, List list, List list2) {
            this.f2081b = c0675l;
            this.f2082c = c4458a;
            this.f2083d = l5;
            this.f2084e = view;
            this.f2085f = dVar;
            this.f2086g = z10;
            this.f2087h = arrayList;
            this.i = list;
            this.f2088j = list2;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            kotlin.jvm.internal.l.f(view, "view");
            view.removeOnLayoutChangeListener(this);
            boolean zB = kotlin.jvm.internal.l.b(this.f2081b.getDataTag(), this.f2082c);
            L l5 = this.f2083d;
            if (zB) {
                V v10 = l5.f2069f;
                ArrayList arrayList = this.f2087h;
                v10.b(this.f2084e, this.f2081b, this.f2085f, this.f2086g, arrayList);
                List list = this.i;
                A7.d dVar = this.f2085f;
                ArrayList arrayListI = C0713c.I(list, dVar);
                ArrayList arrayListI2 = C0713c.I(this.f2088j, dVar);
                this.f2083d.h(this.f2081b, dVar, this.f2084e, this.f2086g, arrayListI, arrayListI2);
            }
            l5.f2071h.remove(this.f2084e);
        }
    }

    public L(B7.e eVar, K k10) {
        this.f2064a = eVar;
        this.f2065b = k10;
    }

    public static void g(C0672i c0672i, View view, Z z10, p9.p pVar) {
        if (!((Boolean) pVar.invoke(view, z10)).booleanValue() || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            int i10 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            C0675l c0675l = c0672i.f2146a;
            c0675l.getClass();
            g(c0672i, childAt, c0675l.f2157A.get(childAt), pVar);
            i = i10;
        }
    }

    public static void j(L l5, C0675l c0675l, A7.d dVar, View view, Z z10) {
        List<C1370tc> listJ = C0713c.J(z10.d());
        S2 s2D = z10.d();
        kotlin.jvm.internal.l.f(s2D, "<this>");
        List<C1179g4> listC = s2D.c();
        if (listC == null) {
            listC = C2099t.f18581b;
        }
        l5.i(c0675l, dVar, view, z10, listJ, listC);
    }

    public final void a(C0673j c0673j, View view, B9 b92, A3.c cVar) {
        Object next;
        int i = C4421b.f38269a;
        C4421b.a(C7.a.INFO);
        a aVar = new a();
        cVar.getClass();
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) cVar.f36c;
        Iterator it = concurrentLinkedQueue.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Map) next).remove(c0673j) != null) {
                    break;
                }
            }
        }
        Map<C0673j, ? extends B9> map = (Map) next;
        if (map != null && map.isEmpty()) {
            aVar.invoke(map);
            concurrentLinkedQueue.remove(map);
        }
        WeakHashMap<View, Set<C1179g4>> weakHashMap = this.f2073k;
        Set<C1179g4> set = weakHashMap.get(view);
        if (!(b92 instanceof C1179g4) || view == null || set == null) {
            return;
        }
        set.remove(b92);
        if (set.isEmpty()) {
            weakHashMap.remove(view);
            this.f2072j.remove(view);
        }
    }

    public final LinkedHashMap b() {
        LinkedHashMap linkedHashMap;
        C6.p<View, Z> pVar = this.f2072j;
        synchronized (pVar.f958b) {
            Set<Map.Entry<View, Z>> setEntrySet = pVar.entrySet();
            int iL = C2077A.l(C2092m.T(setEntrySet, 10));
            if (iL < 16) {
                iL = 16;
            }
            linkedHashMap = new LinkedHashMap(iL);
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(H6.C0675l r8, A7.d r9, android.view.View r10, N7.B9 r11, int r12, A3.c r13) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof N7.C1370tc
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1e
            long r3 = (long) r12
            r12 = r11
            N7.tc r12 = (N7.C1370tc) r12
            A7.b<java.lang.Long> r12 = r12.f9348k
            java.lang.Object r12 = r12.a(r9)
            java.lang.Number r12 = (java.lang.Number) r12
            long r5 = r12.longValue()
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r12 < 0) goto L1c
        L1a:
            r12 = r1
            goto L49
        L1c:
            r12 = r2
            goto L49
        L1e:
            boolean r0 = r11 instanceof N7.C1179g4
            if (r0 == 0) goto L1c
            java.util.WeakHashMap<android.view.View, java.util.Set<N7.g4>> r0 = r7.f2073k
            java.lang.Object r0 = r0.get(r10)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L31
            boolean r0 = r0.contains(r11)
            goto L32
        L31:
            r0 = r2
        L32:
            if (r0 == 0) goto L1c
            long r3 = (long) r12
            r12 = r11
            N7.g4 r12 = (N7.C1179g4) r12
            A7.b<java.lang.Long> r12 = r12.f8284k
            java.lang.Object r12 = r12.a(r9)
            java.lang.Number r12 = (java.lang.Number) r12
            long r5 = r12.longValue()
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r12 > 0) goto L1c
            goto L1a
        L49:
            A7.b r0 = r11.g()
            java.lang.Object r9 = r0.a(r9)
            java.lang.String r9 = (java.lang.String) r9
            H6.j r8 = A9.I.p(r8, r9)
            r13.getClass()
            java.lang.Object r9 = r13.f36c
            java.util.concurrent.ConcurrentLinkedQueue r9 = (java.util.concurrent.ConcurrentLinkedQueue) r9
            java.util.Iterator r9 = r9.iterator()
        L62:
            boolean r0 = r9.hasNext()
            r3 = 0
            if (r0 == 0) goto L77
            java.lang.Object r0 = r9.next()
            r4 = r0
            java.util.Map r4 = (java.util.Map) r4
            boolean r4 = r4.containsKey(r8)
            if (r4 == 0) goto L62
            goto L78
        L77:
            r0 = r3
        L78:
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L9e
            java.util.Set r9 = r0.keySet()
            if (r9 == 0) goto L9e
            java.util.Collection r9 = (java.util.Collection) r9
            H6.j[] r0 = new H6.C0673j[r2]
            java.lang.Object[] r9 = r9.toArray(r0)
            H6.j[] r9 = (H6.C0673j[]) r9
            if (r9 == 0) goto L9e
            int r0 = r9.length
            r4 = r2
        L90:
            if (r4 >= r0) goto L9e
            r5 = r9[r4]
            boolean r6 = kotlin.jvm.internal.l.b(r5, r8)
            if (r6 == 0) goto L9b
            goto L9f
        L9b:
            int r4 = r4 + 1
            goto L90
        L9e:
            r5 = r3
        L9f:
            if (r10 == 0) goto La6
            if (r5 != 0) goto La6
            if (r12 == 0) goto La6
            return r1
        La6:
            if (r10 == 0) goto Lac
            if (r5 != 0) goto Lac
            if (r12 == 0) goto Lc3
        Lac:
            if (r10 == 0) goto Lb2
            if (r5 == 0) goto Lb2
            if (r12 != 0) goto Lc3
        Lb2:
            if (r10 == 0) goto Lbc
            if (r5 == 0) goto Lbc
            if (r12 != 0) goto Lbc
            r7.a(r5, r10, r11, r13)
            return r2
        Lbc:
            if (r10 != 0) goto Lc3
            if (r5 == 0) goto Lc3
            r7.a(r5, r3, r11, r13)
        Lc3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.L.c(H6.l, A7.d, android.view.View, N7.B9, int, A3.c):boolean");
    }

    public final void d(C0675l c0675l, A7.d dVar, View view, ArrayList arrayList, long j4, A3.c cVar) {
        HashMap map = new HashMap(arrayList.size(), 1.0f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B9 b92 = (B9) it.next();
            C0673j c0673jP = A9.I.p(c0675l, b92.g().a(dVar));
            int i = C4421b.f38269a;
            C4421b.a(C7.a.INFO);
            map.put(c0673jP, b92);
        }
        Map logIds = Collections.synchronizedMap(map);
        kotlin.jvm.internal.l.e(logIds, "logIds");
        cVar.getClass();
        ((ConcurrentLinkedQueue) cVar.f36c).add(logIds);
        String logId = c0675l.getLogId();
        Handler handler = this.f2066c;
        N n9 = new N(this, view, c0675l, logId, dVar, logIds, arrayList);
        if (Build.VERSION.SDK_INT >= 28) {
            i.a.b(handler, n9, logIds, j4);
            return;
        }
        Message messageObtain = Message.obtain(handler, n9);
        messageObtain.obj = logIds;
        handler.sendMessageDelayed(messageObtain, j4);
    }

    public final void e(C0672i context, View root, Z z10) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(root, "root");
        g(context, root, z10, new d(context));
    }

    public final void f(C0672i context, View view, Z div) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(div, "div");
        List<C1179g4> listC = div.d().c();
        if (listC == null) {
            return;
        }
        C2099t c2099t = C2099t.f18581b;
        A7.d dVar = context.f2147b;
        h(context.f2146a, dVar, view, div, c2099t, C0713c.I(listC, dVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(H6.C0675l r18, A7.d r19, android.view.View r20, N7.Z r21, java.util.List<N7.C1370tc> r22, java.util.List<N7.C1179g4> r23) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.L.h(H6.l, A7.d, android.view.View, N7.Z, java.util.List, java.util.List):void");
    }

    public final void i(C0675l scope, A7.d resolver, View view, Z div, List<C1370tc> list, List<C1179g4> list2) {
        Z z10;
        kotlin.jvm.internal.l.f(scope, "scope");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(div, "div");
        List<C1179g4> list3 = list2;
        ArrayList arrayListY0 = C2097r.y0(list3, list);
        if (arrayListY0.isEmpty()) {
            return;
        }
        C4458a dataTag = scope.getDataTag();
        if (view == null) {
            V v10 = this.f2069f;
            v10.getClass();
            Iterator it = arrayListY0.iterator();
            while (it.hasNext()) {
                v10.a((B9) it.next());
            }
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                c(scope, resolver, null, (C1370tc) it2.next(), 0, this.f2067d);
            }
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                c(scope, resolver, null, (C1179g4) it3.next(), 0, this.f2068e);
            }
            return;
        }
        WeakHashMap<View, Z> weakHashMap = this.f2071h;
        if (weakHashMap.containsKey(view)) {
            return;
        }
        if (C6.r.a(view) == null && !view.isLayoutRequested()) {
            if (kotlin.jvm.internal.l.b(scope.getDataTag(), dataTag)) {
                this.f2069f.b(view, scope, resolver, div, arrayListY0);
                h(scope, resolver, view, div, C0713c.I(list, resolver), C0713c.I(list2, resolver));
            }
            weakHashMap.remove(view);
            return;
        }
        View viewA = C6.r.a(view);
        if (viewA != null) {
            z10 = div;
            viewA.addOnLayoutChangeListener(new e(scope, dataTag, this, view, resolver, div, arrayListY0, list, list2));
            C1992A c1992a = C1992A.f18074a;
        } else {
            z10 = div;
        }
        weakHashMap.put(view, z10);
    }
}
