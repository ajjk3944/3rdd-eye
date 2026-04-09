package q0;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.EnumC0292n;
import androidx.lifecycle.InterfaceC0298u;
import androidx.lifecycle.a0;
import c.C0372L;
import c5.C0410g;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import d5.AbstractC2282j;
import d5.C2279g;
import d5.C2280h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: A, reason: collision with root package name */
    public final ArrayList f23052A;

    /* renamed from: B, reason: collision with root package name */
    public final C0410g f23053B;

    /* renamed from: C, reason: collision with root package name */
    public final C5.k f23054C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f23055a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f23056b;

    /* renamed from: c, reason: collision with root package name */
    public x f23057c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f23058d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable[] f23059e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23060f;

    /* renamed from: g, reason: collision with root package name */
    public final C2280h f23061g;

    /* renamed from: h, reason: collision with root package name */
    public final C5.o f23062h;
    public final C5.o i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f23063j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f23064k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f23065l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f23066m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0298u f23067n;

    /* renamed from: o, reason: collision with root package name */
    public o f23068o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f23069p;

    /* renamed from: q, reason: collision with root package name */
    public EnumC0292n f23070q;

    /* renamed from: r, reason: collision with root package name */
    public final F0.c f23071r;

    /* renamed from: s, reason: collision with root package name */
    public final C0372L f23072s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f23073t;

    /* renamed from: u, reason: collision with root package name */
    public final M f23074u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashMap f23075v;

    /* renamed from: w, reason: collision with root package name */
    public q5.j f23076w;

    /* renamed from: x, reason: collision with root package name */
    public C2798k f23077x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f23078y;

    /* renamed from: z, reason: collision with root package name */
    public int f23079z;

    public z(Context context) {
        Object next;
        this.f23055a = context;
        Iterator it = x5.h.L(context, C2789b.f22948d).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f23056b = (Activity) next;
        this.f23061g = new C2280h();
        d5.s sVar = d5.s.f19824a;
        this.f23062h = new C5.o(sVar);
        this.i = new C5.o(sVar);
        this.f23063j = new LinkedHashMap();
        this.f23064k = new LinkedHashMap();
        this.f23065l = new LinkedHashMap();
        this.f23066m = new LinkedHashMap();
        this.f23069p = new CopyOnWriteArrayList();
        this.f23070q = EnumC0292n.f5244b;
        this.f23071r = new F0.c(1, this);
        this.f23072s = new C0372L(2, this);
        this.f23073t = true;
        M m6 = new M();
        this.f23074u = m6;
        this.f23075v = new LinkedHashMap();
        this.f23078y = new LinkedHashMap();
        m6.a(new y(m6));
        m6.a(new C2790c(this.f23055a));
        this.f23052A = new ArrayList();
        this.f23053B = new C0410g(new C0.y(5, this));
        this.f23054C = new C5.k(1, B5.a.f766a);
    }

    public static v e(v vVar, int i) {
        x xVar;
        if (vVar.f23043h == i) {
            return vVar;
        }
        if (vVar instanceof x) {
            xVar = (x) vVar;
        } else {
            xVar = vVar.f23037b;
            q5.i.b(xVar);
        }
        return xVar.h(i, true);
    }

    public static /* synthetic */ void p(z zVar, C2794g c2794g) {
        zVar.o(c2794g, false, new C2280h());
    }

    public final void a(v vVar, Bundle bundle, C2794g c2794g, List list) {
        boolean z6;
        Object objPrevious;
        Object objPrevious2;
        v vVar2 = c2794g.f22965b;
        boolean z7 = vVar2 instanceof InterfaceC2791d;
        int i = 0;
        boolean z8 = true;
        C2280h c2280h = this.f23061g;
        if (!z7) {
            while (!c2280h.isEmpty() && (((C2794g) c2280h.last()).f22965b instanceof InterfaceC2791d) && n(((C2794g) c2280h.last()).f22965b.f23043h, true, false)) {
            }
        }
        C2280h c2280h2 = new C2280h();
        boolean z9 = vVar instanceof x;
        Context context = this.f23055a;
        Object obj = null;
        if (z9) {
            v vVar3 = vVar2;
            do {
                q5.i.b(vVar3);
                vVar3 = vVar3.f23037b;
                if (vVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        } else {
                            objPrevious2 = listIterator.previous();
                            if (q5.i.a(((C2794g) objPrevious2).f22965b, vVar3)) {
                                break;
                            }
                        }
                    }
                    C2794g c2794gA = (C2794g) objPrevious2;
                    if (c2794gA == null) {
                        c2794gA = p1.e.a(context, vVar3, bundle, j(), this.f23068o);
                    }
                    c2280h2.addFirst(c2794gA);
                    if (!c2280h.isEmpty() && ((C2794g) c2280h.last()).f22965b == vVar3) {
                        p(this, (C2794g) c2280h.last());
                    }
                }
                if (vVar3 == null) {
                    break;
                }
            } while (vVar3 != vVar);
        }
        v vVar4 = c2280h2.isEmpty() ? vVar2 : ((C2794g) c2280h2.first()).f22965b;
        while (vVar4 != null && d(vVar4.f23043h) != vVar4) {
            vVar4 = vVar4.f23037b;
            if (vVar4 != null) {
                Bundle bundle2 = (bundle == null || bundle.isEmpty() != z8) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        z6 = z8;
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator2.previous();
                        z6 = z8;
                        if (q5.i.a(((C2794g) objPrevious).f22965b, vVar4)) {
                            break;
                        } else {
                            z8 = z6;
                        }
                    }
                }
                C2794g c2794gA2 = (C2794g) objPrevious;
                if (c2794gA2 == null) {
                    c2794gA2 = p1.e.a(context, vVar4, vVar4.b(bundle2), j(), this.f23068o);
                }
                c2280h2.addFirst(c2794gA2);
            } else {
                z6 = z8;
            }
            z8 = z6;
        }
        if (!c2280h2.isEmpty()) {
            vVar2 = ((C2794g) c2280h2.first()).f22965b;
        }
        while (!c2280h.isEmpty() && (((C2794g) c2280h.last()).f22965b instanceof x)) {
            v vVar5 = ((C2794g) c2280h.last()).f22965b;
            q5.i.c(vVar5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((x) vVar5).h(vVar2.f23043h, false) != null) {
                break;
            } else {
                p(this, (C2794g) c2280h.last());
            }
        }
        C2794g c2794g2 = (C2794g) (c2280h.isEmpty() ? null : c2280h.f19819b[c2280h.f19818a]);
        if (c2794g2 == null) {
            c2794g2 = (C2794g) (c2280h2.isEmpty() ? null : c2280h2.f19819b[c2280h2.f19818a]);
        }
        if (!q5.i.a(c2794g2 != null ? c2794g2.f22965b : null, this.f23057c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object objPrevious3 = listIterator3.previous();
                v vVar6 = ((C2794g) objPrevious3).f22965b;
                x xVar = this.f23057c;
                q5.i.b(xVar);
                if (q5.i.a(vVar6, xVar)) {
                    obj = objPrevious3;
                    break;
                }
            }
            C2794g c2794gA3 = (C2794g) obj;
            if (c2794gA3 == null) {
                x xVar2 = this.f23057c;
                q5.i.b(xVar2);
                x xVar3 = this.f23057c;
                q5.i.b(xVar3);
                c2794gA3 = p1.e.a(context, xVar2, xVar3.b(bundle), j(), this.f23068o);
            }
            c2280h2.addFirst(c2794gA3);
        }
        Iterator it = c2280h2.iterator();
        while (it.hasNext()) {
            C2794g c2794g3 = (C2794g) it.next();
            Object obj2 = this.f23075v.get(this.f23074u.b(c2794g3.f22965b.f23036a));
            if (obj2 == null) {
                throw new IllegalStateException(A.f.p(new StringBuilder("NavigatorBackStack for "), vVar.f23036a, " should already be created").toString());
            }
            ((C2796i) obj2).a(c2794g3);
        }
        c2280h.addAll(c2280h2);
        c2280h.addLast(c2794g);
        ArrayList arrayList = new ArrayList(c2280h2.size() + 1);
        arrayList.addAll(c2280h2);
        arrayList.add(c2794g);
        int size = arrayList.size();
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            C2794g c2794g4 = (C2794g) obj3;
            x xVar4 = c2794g4.f22965b.f23037b;
            if (xVar4 != null) {
                k(c2794g4, f(xVar4.f23043h));
            }
        }
    }

    public final void b(InterfaceC2797j interfaceC2797j) {
        this.f23069p.add(interfaceC2797j);
        C2280h c2280h = this.f23061g;
        if (c2280h.isEmpty()) {
            return;
        }
        C2794g c2794g = (C2794g) c2280h.last();
        interfaceC2797j.a(this, c2794g.f22965b, c2794g.a());
    }

    public final boolean c() {
        C2280h c2280h;
        while (true) {
            c2280h = this.f23061g;
            if (c2280h.isEmpty() || !(((C2794g) c2280h.last()).f22965b instanceof x)) {
                break;
            }
            p(this, (C2794g) c2280h.last());
        }
        C2794g c2794g = (C2794g) c2280h.f();
        ArrayList arrayList = this.f23052A;
        if (c2794g != null) {
            arrayList.add(c2794g);
        }
        this.f23079z++;
        u();
        int i = this.f23079z - 1;
        this.f23079z = i;
        if (i == 0) {
            ArrayList arrayListK0 = AbstractC2282j.k0(arrayList);
            arrayList.clear();
            int size = arrayListK0.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayListK0.get(i3);
                i3++;
                C2794g c2794g2 = (C2794g) obj;
                Iterator it = this.f23069p.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2797j) it.next()).a(this, c2794g2.f22965b, c2794g2.a());
                }
                this.f23054C.Q(c2794g2);
            }
            this.f23062h.J(AbstractC2282j.k0(c2280h));
            this.i.J(q());
        }
        return c2794g != null;
    }

    public final v d(int i) {
        v vVar;
        x xVar = this.f23057c;
        if (xVar == null) {
            return null;
        }
        if (xVar.f23043h == i) {
            return xVar;
        }
        C2794g c2794g = (C2794g) this.f23061g.f();
        if (c2794g == null || (vVar = c2794g.f22965b) == null) {
            vVar = this.f23057c;
            q5.i.b(vVar);
        }
        return e(vVar, i);
    }

    public final C2794g f(int i) {
        Object objPrevious;
        C2280h c2280h = this.f23061g;
        ListIterator<E> listIterator = c2280h.listIterator(c2280h.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((C2794g) objPrevious).f22965b.f23043h == i) {
                break;
            }
        }
        C2794g c2794g = (C2794g) objPrevious;
        if (c2794g != null) {
            return c2794g;
        }
        StringBuilder sbP = AbstractC1135f5.p(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbP.append(g());
        throw new IllegalArgumentException(sbP.toString().toString());
    }

    public final v g() {
        C2794g c2794g = (C2794g) this.f23061g.f();
        if (c2794g != null) {
            return c2794g.f22965b;
        }
        return null;
    }

    public final int h() {
        int i = 0;
        C2280h c2280h = this.f23061g;
        if (c2280h != null && c2280h.isEmpty()) {
            return 0;
        }
        Iterator it = c2280h.iterator();
        while (it.hasNext()) {
            if (!(((C2794g) it.next()).f22965b instanceof x) && (i = i + 1) < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }

    public final x i() {
        x xVar = this.f23057c;
        if (xVar == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        q5.i.c(xVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return xVar;
    }

    public final EnumC0292n j() {
        return this.f23067n == null ? EnumC0292n.f5245c : this.f23070q;
    }

    public final void k(C2794g c2794g, C2794g c2794g2) {
        this.f23063j.put(c2794g, c2794g2);
        LinkedHashMap linkedHashMap = this.f23064k;
        if (linkedHashMap.get(c2794g2) == null) {
            linkedHashMap.put(c2794g2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(c2794g2);
        q5.i.b(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    public final void l(int i, B b5) {
        int i3;
        int i6;
        C2280h c2280h = this.f23061g;
        v vVar = c2280h.isEmpty() ? this.f23057c : ((C2794g) c2280h.last()).f22965b;
        if (vVar == null) {
            throw new IllegalStateException("no current navigation node");
        }
        C2792e c2792eD = vVar.d(i);
        Bundle bundle = null;
        if (c2792eD != null) {
            i3 = c2792eD.f22957a;
            Bundle bundle2 = c2792eD.f22959c;
            if (bundle2 != null) {
                bundle = new Bundle();
                bundle.putAll(bundle2);
            }
        } else {
            i3 = i;
        }
        if (i3 == 0 && (i6 = b5.f22910c) != -1) {
            if (n(i6, b5.f22911d, false)) {
                c();
                return;
            }
            return;
        }
        if (i3 == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        v vVarD = d(i3);
        if (vVarD != null) {
            m(vVarD, bundle, b5);
            return;
        }
        int i7 = v.f23035j;
        Context context = this.f23055a;
        String strO = T2.g.o(context, i3);
        if (c2792eD == null) {
            throw new IllegalArgumentException("Navigation action/destination " + strO + " cannot be found from the current destination " + vVar);
        }
        StringBuilder sbQ = AbstractC1135f5.q("Navigation destination ", strO, " referenced from action ");
        sbQ.append(T2.g.o(context, i));
        sbQ.append(" cannot be found from the current destination ");
        sbQ.append(vVar);
        throw new IllegalArgumentException(sbQ.toString().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(q0.v r24, android.os.Bundle r25, q0.B r26) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.z.m(q0.v, android.os.Bundle, q0.B):void");
    }

    public final boolean n(int i, boolean z6, boolean z7) throws Resources.NotFoundException {
        v vVar;
        boolean z8;
        C2280h c2280h = this.f23061g;
        int i3 = 0;
        if (c2280h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = AbstractC2282j.f0(c2280h).iterator();
        while (true) {
            if (!it.hasNext()) {
                vVar = null;
                break;
            }
            v vVar2 = ((C2794g) it.next()).f22965b;
            L lB = this.f23074u.b(vVar2.f23036a);
            if (z6 || vVar2.f23043h != i) {
                arrayList.add(lB);
            }
            if (vVar2.f23043h == i) {
                vVar = vVar2;
                break;
            }
        }
        if (vVar == null) {
            int i6 = v.f23035j;
            Log.i("NavController", "Ignoring popBackStack to destination " + T2.g.o(this.f23055a, i) + " as it was not found on the current back stack");
            return false;
        }
        q5.l lVar = new q5.l();
        C2280h c2280h2 = new C2280h();
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                z8 = z7;
                break;
            }
            int i8 = i7 + 1;
            L l2 = (L) arrayList.get(i7);
            q5.l lVar2 = new q5.l();
            C2794g c2794g = (C2794g) c2280h.last();
            z8 = z7;
            this.f23077x = new C2798k(lVar2, lVar, this, z8, c2280h2);
            l2.i(c2794g, z8);
            this.f23077x = null;
            if (!lVar2.f23296a) {
                break;
            }
            i7 = i8;
        }
        if (z8) {
            LinkedHashMap linkedHashMap = this.f23065l;
            if (!z6) {
                x5.c cVar = new x5.c(new x5.f(x5.h.L(vVar, C2789b.f22949e), new C2799l(this, i3)));
                while (cVar.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((v) cVar.next()).f23043h);
                    C2795h c2795h = (C2795h) (c2280h2.isEmpty() ? null : c2280h2.f19819b[c2280h2.f19818a]);
                    linkedHashMap.put(numValueOf, c2795h != null ? c2795h.f22974a : null);
                }
            }
            if (!c2280h2.isEmpty()) {
                C2795h c2795h2 = (C2795h) c2280h2.first();
                int i9 = c2795h2.f22975b;
                String str = c2795h2.f22974a;
                x5.c cVar2 = new x5.c(new x5.f(x5.h.L(d(i9), C2789b.f22950f), new C2799l(this, 1)));
                while (cVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((v) cVar2.next()).f23043h), str);
                }
                this.f23066m.put(str, c2280h2);
            }
        }
        v();
        return lVar.f23296a;
    }

    public final void o(C2794g c2794g, boolean z6, C2280h c2280h) {
        o oVar;
        A0.e eVar;
        Set set;
        C2280h c2280h2 = this.f23061g;
        C2794g c2794g2 = (C2794g) c2280h2.last();
        if (!q5.i.a(c2794g2, c2794g)) {
            throw new IllegalStateException(("Attempted to pop " + c2794g.f22965b + ", which is not the top of the back stack (" + c2794g2.f22965b + ')').toString());
        }
        c2280h2.removeLast();
        C2796i c2796i = (C2796i) this.f23075v.get(this.f23074u.b(c2794g2.f22965b.f23036a));
        boolean z7 = true;
        if ((c2796i == null || (eVar = c2796i.f22983f) == null || (set = (Set) ((C5.o) eVar.f73b).I()) == null || !set.contains(c2794g2)) && !this.f23064k.containsKey(c2794g2)) {
            z7 = false;
        }
        EnumC0292n enumC0292n = c2794g2.f22971h.f5259d;
        EnumC0292n enumC0292n2 = EnumC0292n.f5245c;
        if (enumC0292n.compareTo(enumC0292n2) >= 0) {
            if (z6) {
                c2794g2.b(enumC0292n2);
                c2280h.addFirst(new C2795h(c2794g2));
            }
            if (z7) {
                c2794g2.b(enumC0292n2);
            } else {
                c2794g2.b(EnumC0292n.f5243a);
                t(c2794g2);
            }
        }
        if (z6 || z7 || (oVar = this.f23068o) == null) {
            return;
        }
        String str = c2794g2.f22969f;
        q5.i.e(str, "backStackEntryId");
        a0 a0Var = (a0) oVar.f23003b.remove(str);
        if (a0Var != null) {
            a0Var.a();
        }
    }

    public final ArrayList q() {
        EnumC0292n enumC0292n;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f23075v.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC0292n = EnumC0292n.f5246d;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((C5.o) ((C2796i) it.next()).f22983f.f73b).I();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C2794g c2794g = (C2794g) obj;
                if (!arrayList.contains(c2794g) && c2794g.f22973k.compareTo(enumC0292n) < 0) {
                    arrayList2.add(obj);
                }
            }
            d5.p.R(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f23061g.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C2794g c2794g2 = (C2794g) next;
            if (!arrayList.contains(c2794g2) && c2794g2.f22973k.compareTo(enumC0292n) >= 0) {
                arrayList3.add(next);
            }
        }
        d5.p.R(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (!(((C2794g) obj2).f22965b instanceof x)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final boolean r(int i, Bundle bundle, B b5) throws Resources.NotFoundException {
        v vVarI;
        C2794g c2794g;
        v vVar;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.f23065l;
        int i3 = 0;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection collectionValues = linkedHashMap.values();
        q5.i.e(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (q5.i.a((String) it.next(), str)) {
                it.remove();
            }
        }
        LinkedHashMap linkedHashMap2 = this.f23066m;
        q5.r.b(linkedHashMap2);
        C2280h c2280h = (C2280h) linkedHashMap2.remove(str);
        ArrayList arrayList = new ArrayList();
        C2794g c2794g2 = (C2794g) this.f23061g.f();
        if (c2794g2 == null || (vVarI = c2794g2.f22965b) == null) {
            vVarI = i();
        }
        if (c2280h != null) {
            Iterator it2 = c2280h.iterator();
            while (it2.hasNext()) {
                C2795h c2795h = (C2795h) it2.next();
                v vVarE = e(vVarI, c2795h.f22975b);
                Context context = this.f23055a;
                if (vVarE == null) {
                    int i6 = v.f23035j;
                    throw new IllegalStateException(("Restore State failed: destination " + T2.g.o(context, c2795h.f22975b) + " cannot be found from the current destination " + vVarI).toString());
                }
                arrayList.add(c2795h.a(context, vVarE, j(), this.f23068o));
                vVarI = vVarE;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (!(((C2794g) obj).f22965b instanceof x)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i8 = 0;
        while (true) {
            String str2 = null;
            if (i8 >= size2) {
                break;
            }
            Object obj2 = arrayList3.get(i8);
            i8++;
            C2794g c2794g3 = (C2794g) obj2;
            List list = (List) AbstractC2282j.Z(arrayList2);
            if (list != null && (c2794g = (C2794g) AbstractC2282j.Y(list)) != null && (vVar = c2794g.f22965b) != null) {
                str2 = vVar.f23036a;
            }
            if (q5.i.a(str2, c2794g3.f22965b.f23036a)) {
                list.add(c2794g3);
            } else {
                arrayList2.add(new ArrayList(new C2279g(new C2794g[]{c2794g3}, true)));
            }
        }
        q5.l lVar = new q5.l();
        int size3 = arrayList2.size();
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            List list2 = (List) obj3;
            L lB = this.f23074u.b(((C2794g) AbstractC2282j.T(list2)).f22965b.f23036a);
            this.f23076w = new C2800m(lVar, arrayList, new q5.m(), this, bundle);
            lB.d(list2, b5);
            this.f23076w = null;
        }
        return lVar.f23296a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(q0.x r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 1188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.z.s(q0.x, android.os.Bundle):void");
    }

    public final void t(C2794g c2794g) {
        q5.i.e(c2794g, "child");
        C2794g c2794g2 = (C2794g) this.f23063j.remove(c2794g);
        if (c2794g2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f23064k;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(c2794g2);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            C2796i c2796i = (C2796i) this.f23075v.get(this.f23074u.b(c2794g2.f22965b.f23036a));
            if (c2796i != null) {
                c2796i.b(c2794g2);
            }
            linkedHashMap.remove(c2794g2);
        }
    }

    public final void u() {
        v vVar;
        AtomicInteger atomicInteger;
        A0.e eVar;
        Set set;
        ArrayList arrayListK0 = AbstractC2282j.k0(this.f23061g);
        if (arrayListK0.isEmpty()) {
            return;
        }
        v vVar2 = ((C2794g) AbstractC2282j.Y(arrayListK0)).f22965b;
        if (vVar2 instanceof InterfaceC2791d) {
            Iterator it = AbstractC2282j.f0(arrayListK0).iterator();
            while (it.hasNext()) {
                vVar = ((C2794g) it.next()).f22965b;
                if (!(vVar instanceof x) && !(vVar instanceof InterfaceC2791d)) {
                    break;
                }
            }
            vVar = null;
        } else {
            vVar = null;
        }
        HashMap map = new HashMap();
        for (C2794g c2794g : AbstractC2282j.f0(arrayListK0)) {
            EnumC0292n enumC0292n = c2794g.f22973k;
            v vVar3 = c2794g.f22965b;
            EnumC0292n enumC0292n2 = EnumC0292n.f5247e;
            EnumC0292n enumC0292n3 = EnumC0292n.f5246d;
            if (vVar2 != null && vVar3.f23043h == vVar2.f23043h) {
                if (enumC0292n != enumC0292n2) {
                    C2796i c2796i = (C2796i) this.f23075v.get(this.f23074u.b(vVar3.f23036a));
                    if (q5.i.a((c2796i == null || (eVar = c2796i.f22983f) == null || (set = (Set) ((C5.o) eVar.f73b).I()) == null) ? null : Boolean.valueOf(set.contains(c2794g)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f23064k.get(c2794g)) != null && atomicInteger.get() == 0)) {
                        map.put(c2794g, enumC0292n3);
                    } else {
                        map.put(c2794g, enumC0292n2);
                    }
                }
                vVar2 = vVar2.f23037b;
            } else if (vVar == null || vVar3.f23043h != vVar.f23043h) {
                c2794g.b(EnumC0292n.f5245c);
            } else {
                if (enumC0292n == enumC0292n2) {
                    c2794g.b(enumC0292n3);
                } else if (enumC0292n != enumC0292n3) {
                    map.put(c2794g, enumC0292n3);
                }
                vVar = vVar.f23037b;
            }
        }
        int size = arrayListK0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListK0.get(i);
            i++;
            C2794g c2794g2 = (C2794g) obj;
            EnumC0292n enumC0292n4 = (EnumC0292n) map.get(c2794g2);
            if (enumC0292n4 != null) {
                c2794g2.b(enumC0292n4);
            } else {
                c2794g2.e();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Type inference failed for: r0v2, types: [p5.a, q5.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v() {
        /*
            r2 = this;
            boolean r0 = r2.f23073t
            if (r0 == 0) goto Lc
            int r0 = r2.h()
            r1 = 1
            if (r0 <= r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            c.L r0 = r2.f23072s
            r0.f5809a = r1
            q5.h r0 = r0.f5811c
            if (r0 == 0) goto L18
            r0.b()
        L18:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.z.v():void");
    }
}
