package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.n;
import androidx.lifecycle.v0;
import br.l;
import c.g;
import c.w;
import ee.f;
import i.j;
import io.sentry.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import o4.a0;
import o4.c0;
import o4.d0;
import o4.e0;
import o4.f0;
import o4.g0;
import o4.j0;
import o4.k;
import o4.l0;
import o4.o0;
import o4.q0;
import o4.u;
import o4.x;

/* loaded from: classes.dex */
public abstract class d {
    public final e0 A;
    public final f B;
    public f.d C;
    public f.d D;
    public f.d E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public l0 O;
    public final b4.e P;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1437b;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f1440e;

    /* renamed from: g, reason: collision with root package name */
    public w f1442g;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1447n;

    /* renamed from: o, reason: collision with root package name */
    public final t f1448o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f1449p;

    /* renamed from: q, reason: collision with root package name */
    public final c0 f1450q;

    /* renamed from: r, reason: collision with root package name */
    public final c0 f1451r;

    /* renamed from: s, reason: collision with root package name */
    public final c0 f1452s;

    /* renamed from: t, reason: collision with root package name */
    public final c0 f1453t;

    /* renamed from: u, reason: collision with root package name */
    public final d0 f1454u;

    /* renamed from: v, reason: collision with root package name */
    public int f1455v;

    /* renamed from: w, reason: collision with root package name */
    public x f1456w;

    /* renamed from: x, reason: collision with root package name */
    public ic.a f1457x;

    /* renamed from: y, reason: collision with root package name */
    public b f1458y;

    /* renamed from: z, reason: collision with root package name */
    public b f1459z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1436a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final js.e f1438c = new js.e(4);

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f1439d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final a0 f1441f = new a0(this);

    /* renamed from: h, reason: collision with root package name */
    public o4.a f1443h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1444i = false;
    public final am.d j = new am.d(this);
    public final AtomicInteger k = new AtomicInteger();

    /* renamed from: l, reason: collision with root package name */
    public final Map f1445l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    public final Map f1446m = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [o4.c0] */
    /* JADX WARN: Type inference failed for: r0v17, types: [o4.c0] */
    /* JADX WARN: Type inference failed for: r0v18, types: [o4.c0] */
    /* JADX WARN: Type inference failed for: r0v19, types: [o4.c0] */
    public d() {
        Collections.synchronizedMap(new HashMap());
        this.f1447n = new ArrayList();
        t tVar = new t();
        tVar.f12736a = this;
        tVar.f12737d = new CopyOnWriteArrayList();
        this.f1448o = tVar;
        this.f1449p = new CopyOnWriteArrayList();
        final int i10 = 0;
        this.f1450q = new t3.a(this) { // from class: o4.c0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ androidx.fragment.app.d f18785b;

            {
                this.f18785b = this;
            }

            @Override // t3.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        androidx.fragment.app.d dVar = this.f18785b;
                        if (dVar.M()) {
                            dVar.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        androidx.fragment.app.d dVar2 = this.f18785b;
                        if (dVar2.M() && num.intValue() == 80) {
                            dVar2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        g3.i iVar = (g3.i) obj;
                        androidx.fragment.app.d dVar3 = this.f18785b;
                        if (dVar3.M()) {
                            boolean z10 = iVar.f9293a;
                            dVar3.n(false);
                            break;
                        }
                        break;
                    default:
                        g3.u uVar = (g3.u) obj;
                        androidx.fragment.app.d dVar4 = this.f18785b;
                        if (dVar4.M()) {
                            boolean z11 = uVar.f9324a;
                            dVar4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f1451r = new t3.a(this) { // from class: o4.c0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ androidx.fragment.app.d f18785b;

            {
                this.f18785b = this;
            }

            @Override // t3.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        androidx.fragment.app.d dVar = this.f18785b;
                        if (dVar.M()) {
                            dVar.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        androidx.fragment.app.d dVar2 = this.f18785b;
                        if (dVar2.M() && num.intValue() == 80) {
                            dVar2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        g3.i iVar = (g3.i) obj;
                        androidx.fragment.app.d dVar3 = this.f18785b;
                        if (dVar3.M()) {
                            boolean z10 = iVar.f9293a;
                            dVar3.n(false);
                            break;
                        }
                        break;
                    default:
                        g3.u uVar = (g3.u) obj;
                        androidx.fragment.app.d dVar4 = this.f18785b;
                        if (dVar4.M()) {
                            boolean z11 = uVar.f9324a;
                            dVar4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 2;
        this.f1452s = new t3.a(this) { // from class: o4.c0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ androidx.fragment.app.d f18785b;

            {
                this.f18785b = this;
            }

            @Override // t3.a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        androidx.fragment.app.d dVar = this.f18785b;
                        if (dVar.M()) {
                            dVar.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        androidx.fragment.app.d dVar2 = this.f18785b;
                        if (dVar2.M() && num.intValue() == 80) {
                            dVar2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        g3.i iVar = (g3.i) obj;
                        androidx.fragment.app.d dVar3 = this.f18785b;
                        if (dVar3.M()) {
                            boolean z10 = iVar.f9293a;
                            dVar3.n(false);
                            break;
                        }
                        break;
                    default:
                        g3.u uVar = (g3.u) obj;
                        androidx.fragment.app.d dVar4 = this.f18785b;
                        if (dVar4.M()) {
                            boolean z11 = uVar.f9324a;
                            dVar4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i13 = 3;
        this.f1453t = new t3.a(this) { // from class: o4.c0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ androidx.fragment.app.d f18785b;

            {
                this.f18785b = this;
            }

            @Override // t3.a
            public final void accept(Object obj) {
                switch (i13) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        androidx.fragment.app.d dVar = this.f18785b;
                        if (dVar.M()) {
                            dVar.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        androidx.fragment.app.d dVar2 = this.f18785b;
                        if (dVar2.M() && num.intValue() == 80) {
                            dVar2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        g3.i iVar = (g3.i) obj;
                        androidx.fragment.app.d dVar3 = this.f18785b;
                        if (dVar3.M()) {
                            boolean z10 = iVar.f9293a;
                            dVar3.n(false);
                            break;
                        }
                        break;
                    default:
                        g3.u uVar = (g3.u) obj;
                        androidx.fragment.app.d dVar4 = this.f18785b;
                        if (dVar4.M()) {
                            boolean z11 = uVar.f9324a;
                            dVar4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f1454u = new d0(this);
        this.f1455v = -1;
        this.A = new e0(this);
        this.B = new f(19);
        this.F = new ArrayDeque();
        this.P = new b4.e(26, this);
    }

    public static HashSet G(o4.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < aVar.f18758a.size(); i10++) {
            b bVar = ((o0) aVar.f18758a.get(i10)).f18827b;
            if (bVar != null && aVar.f18764g) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    public static boolean K(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    public static boolean L(b bVar) {
        if (bVar.f1408a0 && bVar.f1409b0) {
            return true;
        }
        Iterator it = bVar.S.f1438c.X().iterator();
        boolean zL = false;
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            if (bVar2 != null) {
                zL = L(bVar2);
            }
            if (zL) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(b bVar) {
        if (bVar == null) {
            return true;
        }
        if (bVar.f1409b0) {
            return bVar.Q == null || N(bVar.T);
        }
        return false;
    }

    public static boolean O(b bVar) {
        if (bVar == null) {
            return true;
        }
        d dVar = bVar.Q;
        return bVar.equals(dVar.f1459z) && O(dVar.f1458y);
    }

    public final boolean A(boolean z10) {
        boolean zA;
        o4.a aVar;
        z(z10);
        if (!this.f1444i && (aVar = this.f1443h) != null) {
            aVar.f18773r = false;
            aVar.d();
            if (K(3)) {
                Objects.toString(this.f1443h);
                Objects.toString(this.f1436a);
            }
            this.f1443h.f(false, false);
            this.f1436a.add(0, this.f1443h);
            Iterator it = this.f1443h.f18758a.iterator();
            while (it.hasNext()) {
                b bVar = ((o0) it.next()).f18827b;
                if (bVar != null) {
                    bVar.J = false;
                }
            }
            this.f1443h = null;
        }
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.L;
            ArrayList arrayList2 = this.M;
            synchronized (this.f1436a) {
                if (this.f1436a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f1436a.size();
                        zA = false;
                        for (int i10 = 0; i10 < size; i10++) {
                            zA |= ((g0) this.f1436a.get(i10)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                g0();
                v();
                ((HashMap) this.f1438c.f13798g).values().removeAll(Collections.singleton(null));
                return z11;
            }
            z11 = true;
            this.f1437b = true;
            try {
                W(this.L, this.M);
            } finally {
                d();
            }
        }
    }

    public final void B(o4.a aVar, boolean z10) {
        if (z10 && (this.f1456w == null || this.J)) {
            return;
        }
        z(z10);
        o4.a aVar2 = this.f1443h;
        if (aVar2 != null) {
            aVar2.f18773r = false;
            aVar2.d();
            if (K(3)) {
                Objects.toString(this.f1443h);
                Objects.toString(aVar);
            }
            this.f1443h.f(false, false);
            this.f1443h.a(this.L, this.M);
            Iterator it = this.f1443h.f18758a.iterator();
            while (it.hasNext()) {
                b bVar = ((o0) it.next()).f18827b;
                if (bVar != null) {
                    bVar.J = false;
                }
            }
            this.f1443h = null;
        }
        aVar.a(this.L, this.M);
        this.f1437b = true;
        try {
            W(this.L, this.M);
            d();
            g0();
            v();
            ((HashMap) this.f1438c.f13798g).values().removeAll(Collections.singleton(null));
        } catch (Throwable th2) {
            d();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x023c A[PHI: r15
  0x023c: PHI (r15v21 int) = (r15v20 int), (r15v23 int) binds: [B:105:0x0229, B:109:0x0233] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(java.util.ArrayList r30, java.util.ArrayList r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 1544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.d.C(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final b D(int i10) {
        js.e eVar = this.f1438c;
        ArrayList arrayList = (ArrayList) eVar.f13797d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = (b) arrayList.get(size);
            if (bVar != null && bVar.U == i10) {
                return bVar;
            }
        }
        for (e eVar2 : ((HashMap) eVar.f13798g).values()) {
            if (eVar2 != null) {
                b bVar2 = eVar2.f1462c;
                if (bVar2.U == i10) {
                    return bVar2;
                }
            }
        }
        return null;
    }

    public final b E(String str) {
        js.e eVar = this.f1438c;
        ArrayList arrayList = (ArrayList) eVar.f13797d;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                b bVar = (b) arrayList.get(size);
                if (bVar != null && str.equals(bVar.W)) {
                    return bVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (e eVar2 : ((HashMap) eVar.f13798g).values()) {
            if (eVar2 != null) {
                b bVar2 = eVar2.f1462c;
                if (str.equals(bVar2.W)) {
                    return bVar2;
                }
            }
        }
        return null;
    }

    public final void F() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar.f18811f) {
                K(2);
                kVar.f18811f = false;
                kVar.e();
            }
        }
    }

    public final ViewGroup H(b bVar) {
        ViewGroup viewGroup = bVar.f1412d0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (bVar.V <= 0 || !this.f1457x.C()) {
            return null;
        }
        View viewB = this.f1457x.B(bVar.V);
        if (viewB instanceof ViewGroup) {
            return (ViewGroup) viewB;
        }
        return null;
    }

    public final e0 I() {
        b bVar = this.f1458y;
        return bVar != null ? bVar.Q.I() : this.A;
    }

    public final f J() {
        b bVar = this.f1458y;
        return bVar != null ? bVar.Q.J() : this.B;
    }

    public final boolean M() {
        b bVar = this.f1458y;
        if (bVar == null) {
            return true;
        }
        return bVar.w() && this.f1458y.p().M();
    }

    public final void P(int i10, boolean z10) {
        x xVar;
        if (this.f1456w == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f1455v) {
            this.f1455v = i10;
            js.e eVar = this.f1438c;
            HashMap map = (HashMap) eVar.f13798g;
            Iterator it = ((ArrayList) eVar.f13797d).iterator();
            while (it.hasNext()) {
                e eVar2 = (e) map.get(((b) it.next()).f1433y);
                if (eVar2 != null) {
                    eVar2.k();
                }
            }
            for (e eVar3 : map.values()) {
                if (eVar3 != null) {
                    eVar3.k();
                    b bVar = eVar3.f1462c;
                    if (bVar.I && !bVar.y()) {
                        eVar.g0(eVar3);
                    }
                }
            }
            e0();
            if (this.G && (xVar = this.f1456w) != null && this.f1455v == 7) {
                xVar.B.invalidateOptionsMenu();
                this.G = false;
            }
        }
    }

    public final void Q() {
        if (this.f1456w == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.f18820g = false;
        for (b bVar : this.f1438c.a0()) {
            if (bVar != null) {
                bVar.S.Q();
            }
        }
    }

    public final void R(e eVar) {
        b bVar = eVar.f1462c;
        if (bVar.f1414f0) {
            if (this.f1437b) {
                this.K = true;
            } else {
                bVar.f1414f0 = false;
                eVar.k();
            }
        }
    }

    public final boolean S() {
        return T(-1, 0);
    }

    public final boolean T(int i10, int i11) {
        A(false);
        z(true);
        b bVar = this.f1459z;
        if (bVar != null && i10 < 0 && bVar.m().S()) {
            return true;
        }
        boolean zU = U(this.L, this.M, i10, i11);
        if (zU) {
            this.f1437b = true;
            try {
                W(this.L, this.M);
            } finally {
                d();
            }
        }
        g0();
        v();
        ((HashMap) this.f1438c.f13798g).values().removeAll(Collections.singleton(null));
        return zU;
    }

    public final boolean U(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z10 = (i11 & 1) != 0;
        int size = -1;
        if (!this.f1439d.isEmpty()) {
            if (i10 < 0) {
                size = z10 ? 0 : this.f1439d.size() - 1;
            } else {
                int size2 = this.f1439d.size() - 1;
                while (size2 >= 0) {
                    o4.a aVar = (o4.a) this.f1439d.get(size2);
                    if (i10 >= 0 && i10 == aVar.f18774s) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z10) {
                    size = size2;
                    while (size > 0) {
                        o4.a aVar2 = (o4.a) this.f1439d.get(size - 1);
                        if (i10 < 0 || i10 != aVar2.f18774s) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f1439d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f1439d.size() - 1; size3 >= size; size3--) {
            arrayList.add((o4.a) this.f1439d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void V(b bVar) {
        if (K(2)) {
            Objects.toString(bVar);
        }
        boolean zY = bVar.y();
        if (bVar.Y && zY) {
            return;
        }
        js.e eVar = this.f1438c;
        synchronized (((ArrayList) eVar.f13797d)) {
            ((ArrayList) eVar.f13797d).remove(bVar);
        }
        bVar.H = false;
        if (L(bVar)) {
            this.G = true;
        }
        bVar.I = true;
        d0(bVar);
    }

    public final void W(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((o4.a) arrayList.get(i10)).f18770o) {
                if (i11 != i10) {
                    C(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((o4.a) arrayList.get(i11)).f18770o) {
                        i11++;
                    }
                }
                C(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            C(arrayList, arrayList2, i11, size);
        }
    }

    public final void X(Bundle bundle) {
        t tVar;
        int i10;
        int i11;
        e eVar;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f1456w.f18878r.getClassLoader());
                this.f1446m.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f1456w.f18878r.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        js.e eVar2 = this.f1438c;
        HashMap map2 = (HashMap) eVar2.f13799r;
        HashMap map3 = (HashMap) eVar2.f13798g;
        map2.clear();
        map2.putAll(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        map3.clear();
        Iterator it = fragmentManagerState.f1393a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            tVar = this.f1448o;
            i10 = 2;
            if (!zHasNext) {
                break;
            }
            Bundle bundleP0 = eVar2.p0((String) it.next(), null);
            if (bundleP0 != null) {
                b bVar = (b) this.O.f18815b.get(((FragmentState) bundleP0.getParcelable("state")).f1400d);
                if (bVar != null) {
                    if (K(2)) {
                        bVar.toString();
                    }
                    eVar = new e(tVar, eVar2, bVar, bundleP0);
                } else {
                    eVar = new e(this.f1448o, this.f1438c, this.f1456w.f18878r.getClassLoader(), I(), bundleP0);
                }
                b bVar2 = eVar.f1462c;
                bVar2.f1411d = bundleP0;
                bVar2.Q = this;
                if (K(2)) {
                    bVar2.toString();
                }
                eVar.m(this.f1456w.f18878r.getClassLoader());
                eVar2.f0(eVar);
                eVar.f1464e = this.f1455v;
            }
        }
        l0 l0Var = this.O;
        l0Var.getClass();
        Iterator it2 = new ArrayList(l0Var.f18815b.values()).iterator();
        while (it2.hasNext()) {
            b bVar3 = (b) it2.next();
            if (map3.get(bVar3.f1433y) == null) {
                if (K(2)) {
                    bVar3.toString();
                    Objects.toString(fragmentManagerState.f1393a);
                }
                this.O.d(bVar3);
                bVar3.Q = this;
                e eVar3 = new e(tVar, eVar2, bVar3);
                eVar3.f1464e = 1;
                eVar3.k();
                bVar3.I = true;
                eVar3.k();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.f1394d;
        ((ArrayList) eVar2.f13797d).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                b bVarD = eVar2.D(str3);
                if (bVarD == null) {
                    throw new IllegalStateException(h0.b.o("No instantiated fragment for (", str3, ")"));
                }
                if (K(2)) {
                    bVarD.toString();
                }
                eVar2.j(bVarD);
            }
        }
        if (fragmentManagerState.f1395g != null) {
            this.f1439d = new ArrayList(fragmentManagerState.f1395g.length);
            int i12 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f1395g;
                if (i12 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i12];
                ArrayList arrayList2 = backStackRecordState.f1380d;
                o4.a aVar = new o4.a(this);
                int[] iArr = backStackRecordState.f1379a;
                int i13 = 0;
                int i14 = 0;
                while (i13 < iArr.length) {
                    o0 o0Var = new o0();
                    int i15 = i13 + 1;
                    o0Var.f18826a = iArr[i13];
                    if (K(i10)) {
                        Objects.toString(aVar);
                        int i16 = iArr[i15];
                    }
                    int i17 = i10;
                    o0Var.f18833h = n.values()[backStackRecordState.f1381g[i14]];
                    o0Var.f18834i = n.values()[backStackRecordState.f1382r[i14]];
                    int i18 = i13 + 2;
                    o0Var.f18828c = iArr[i15] != 0;
                    int i19 = iArr[i18];
                    o0Var.f18829d = i19;
                    int i20 = iArr[i13 + 3];
                    o0Var.f18830e = i20;
                    int i21 = i13 + 5;
                    int i22 = iArr[i13 + 4];
                    o0Var.f18831f = i22;
                    i13 += 6;
                    int i23 = iArr[i21];
                    o0Var.f18832g = i23;
                    aVar.f18759b = i19;
                    aVar.f18760c = i20;
                    aVar.f18761d = i22;
                    aVar.f18762e = i23;
                    aVar.b(o0Var);
                    i14++;
                    i10 = i17;
                }
                int i24 = i10;
                aVar.f18763f = backStackRecordState.f1383x;
                aVar.f18765h = backStackRecordState.f1384y;
                aVar.f18764g = true;
                aVar.f18766i = backStackRecordState.D;
                aVar.j = backStackRecordState.E;
                aVar.k = backStackRecordState.F;
                aVar.f18767l = backStackRecordState.G;
                aVar.f18768m = backStackRecordState.H;
                aVar.f18769n = backStackRecordState.I;
                aVar.f18770o = backStackRecordState.J;
                aVar.f18774s = backStackRecordState.B;
                for (int i25 = 0; i25 < arrayList2.size(); i25++) {
                    String str4 = (String) arrayList2.get(i25);
                    if (str4 != null) {
                        ((o0) aVar.f18758a.get(i25)).f18827b = eVar2.D(str4);
                    }
                }
                aVar.c(1);
                if (K(i24)) {
                    aVar.toString();
                    PrintWriter printWriter = new PrintWriter(new q0());
                    aVar.h("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1439d.add(aVar);
                i12++;
                i10 = i24;
            }
            i11 = 0;
        } else {
            i11 = 0;
            this.f1439d = new ArrayList();
        }
        this.k.set(fragmentManagerState.f1396r);
        String str5 = fragmentManagerState.f1397x;
        if (str5 != null) {
            b bVarD2 = eVar2.D(str5);
            this.f1459z = bVarD2;
            r(bVarD2);
        }
        ArrayList arrayList3 = fragmentManagerState.f1398y;
        if (arrayList3 != null) {
            for (int i26 = i11; i26 < arrayList3.size(); i26++) {
                this.f1445l.put((String) arrayList3.get(i26), (BackStackState) fragmentManagerState.B.get(i26));
            }
        }
        this.F = new ArrayDeque(fragmentManagerState.D);
    }

    public final Bundle Y() {
        int i10;
        ArrayList arrayList;
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        F();
        x();
        A(true);
        this.H = true;
        this.O.f18820g = true;
        js.e eVar = this.f1438c;
        eVar.getClass();
        HashMap map = (HashMap) eVar.f13798g;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            e eVar2 = (e) it.next();
            if (eVar2 != null) {
                b bVar = eVar2.f1462c;
                String str = bVar.f1433y;
                Bundle bundle3 = new Bundle();
                b bVar2 = eVar2.f1462c;
                if (bVar2.f1407a == -1 && (bundle = bVar2.f1411d) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new FragmentState(bVar2));
                if (bVar2.f1407a > 0) {
                    Bundle bundle4 = new Bundle();
                    bVar2.P(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    eVar2.f1460a.x(bVar2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    bVar2.f1426q0.K(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleY = bVar2.S.Y();
                    if (!bundleY.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleY);
                    }
                    if (bVar2.f1413e0 != null) {
                        eVar2.o();
                    }
                    SparseArray<? extends Parcelable> sparseArray = bVar2.f1415g;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = bVar2.f1427r;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = bVar2.B;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                eVar.p0(str, bundle3);
                arrayList2.add(bVar.f1433y);
                if (K(2)) {
                    bVar.toString();
                    Objects.toString(bVar.f1411d);
                }
            }
        }
        HashMap map2 = (HashMap) this.f1438c.f13799r;
        if (map2.isEmpty()) {
            K(2);
            return bundle2;
        }
        js.e eVar3 = this.f1438c;
        synchronized (((ArrayList) eVar3.f13797d)) {
            try {
                if (((ArrayList) eVar3.f13797d).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) eVar3.f13797d).size());
                    Iterator it2 = ((ArrayList) eVar3.f13797d).iterator();
                    while (it2.hasNext()) {
                        b bVar3 = (b) it2.next();
                        arrayList.add(bVar3.f1433y);
                        if (K(2)) {
                            bVar3.toString();
                        }
                    }
                }
            } finally {
            }
        }
        int size = this.f1439d.size();
        if (size > 0) {
            backStackRecordStateArr = new BackStackRecordState[size];
            for (i10 = 0; i10 < size; i10++) {
                backStackRecordStateArr[i10] = new BackStackRecordState((o4.a) this.f1439d.get(i10));
                if (K(2)) {
                    Objects.toString(this.f1439d.get(i10));
                }
            }
        } else {
            backStackRecordStateArr = null;
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f1397x = null;
        ArrayList arrayList3 = new ArrayList();
        fragmentManagerState.f1398y = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        fragmentManagerState.B = arrayList4;
        fragmentManagerState.f1393a = arrayList2;
        fragmentManagerState.f1394d = arrayList;
        fragmentManagerState.f1395g = backStackRecordStateArr;
        fragmentManagerState.f1396r = this.k.get();
        b bVar4 = this.f1459z;
        if (bVar4 != null) {
            fragmentManagerState.f1397x = bVar4.f1433y;
        }
        arrayList3.addAll(this.f1445l.keySet());
        arrayList4.addAll(this.f1445l.values());
        fragmentManagerState.D = new ArrayList(this.F);
        bundle2.putParcelable("state", fragmentManagerState);
        for (String str2 : this.f1446m.keySet()) {
            bundle2.putBundle(c7.a.p("result_", str2), (Bundle) this.f1446m.get(str2));
        }
        for (String str3 : map2.keySet()) {
            bundle2.putBundle(c7.a.p("fragment_", str3), (Bundle) map2.get(str3));
        }
        return bundle2;
    }

    public final void Z() {
        synchronized (this.f1436a) {
            try {
                if (this.f1436a.size() == 1) {
                    this.f1456w.f18879x.removeCallbacks(this.P);
                    this.f1456w.f18879x.post(this.P);
                    g0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final e a(b bVar) {
        String str = bVar.f1421l0;
        if (str != null) {
            p4.d.c(bVar, str);
        }
        if (K(2)) {
            bVar.toString();
        }
        e eVarG = g(bVar);
        bVar.Q = this;
        js.e eVar = this.f1438c;
        eVar.f0(eVarG);
        if (!bVar.Y) {
            eVar.j(bVar);
            bVar.I = false;
            if (bVar.f1413e0 == null) {
                bVar.f1418i0 = false;
            }
            if (L(bVar)) {
                this.G = true;
            }
        }
        return eVarG;
    }

    public final void a0(b bVar, boolean z10) {
        ViewGroup viewGroupH = H(bVar);
        if (viewGroupH == null || !(viewGroupH instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupH).setDrawDisappearingViewsLast(!z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(x xVar, ic.a aVar, b bVar) {
        if (this.f1456w != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1456w = xVar;
        this.f1457x = aVar;
        this.f1458y = bVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1449p;
        if (bVar != 0) {
            copyOnWriteArrayList.add(new f0(bVar));
        } else if (xVar != null) {
            copyOnWriteArrayList.add(xVar);
        }
        if (this.f1458y != null) {
            g0();
        }
        if (xVar != null) {
            w wVarJ = xVar.B.j();
            this.f1442g = wVarJ;
            wVarJ.a(bVar != 0 ? bVar : xVar, this.j);
        }
        if (bVar != 0) {
            l0 l0Var = bVar.Q.O;
            HashMap map = l0Var.f18816c;
            l0 l0Var2 = (l0) map.get(bVar.f1433y);
            if (l0Var2 == null) {
                l0Var2 = new l0(l0Var.f18818e);
                map.put(bVar.f1433y, l0Var2);
            }
            this.O = l0Var2;
        } else if (xVar != null) {
            v0 v0VarD = xVar.B.d();
            l.e(v0VarD, "store");
            v4.a aVar2 = v4.a.f23842b;
            l.e(aVar2, "defaultCreationExtras");
            js.e eVar = new js.e(v0VarD, l0.f18814h, aVar2);
            ir.d dVarH = ir.f0.H(l0.class);
            String strN = dVarH.n();
            if (strN == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.O = (l0) eVar.d0(dVarH, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strN));
        } else {
            this.O = new l0(false);
        }
        l0 l0Var3 = this.O;
        l0Var3.f18820g = this.H || this.I;
        this.f1438c.f13800x = l0Var3;
        x xVar2 = this.f1456w;
        if (xVar2 != null && bVar == 0) {
            t tVarF = xVar2.f();
            tVarF.H("android:support:fragments", new c.d(2, (j0) this));
            Bundle bundleK = tVarF.k("android:support:fragments");
            if (bundleK != null) {
                X(bundleK);
            }
        }
        x xVar3 = this.f1456w;
        if (xVar3 != null) {
            g gVar = xVar3.B.F;
            String strP = c7.a.p("FragmentManager:", bVar != 0 ? w.g.j(new StringBuilder(), bVar.f1433y, ":") : "");
            j0 j0Var = (j0) this;
            this.C = gVar.c(w.g.f(strP, "StartActivityForResult"), new g.b(1), new c(j0Var, 1));
            this.D = gVar.c(w.g.f(strP, "StartIntentSenderForResult"), new g.b(2), new c(j0Var, 2));
            this.E = gVar.c(w.g.f(strP, "RequestPermissions"), new g.b(0), new c(j0Var, 0));
        }
        x xVar4 = this.f1456w;
        if (xVar4 != null) {
            xVar4.B.g(this.f1450q);
        }
        x xVar5 = this.f1456w;
        if (xVar5 != null) {
            xVar5.B.H.add(this.f1451r);
        }
        x xVar6 = this.f1456w;
        if (xVar6 != null) {
            xVar6.B.J.add(this.f1452s);
        }
        x xVar7 = this.f1456w;
        if (xVar7 != null) {
            xVar7.B.K.add(this.f1453t);
        }
        x xVar8 = this.f1456w;
        if (xVar8 == null || bVar != 0) {
            return;
        }
        qm.c cVar = xVar8.B.f3029g;
        ((CopyOnWriteArrayList) cVar.f20918d).add(this.f1454u);
        ((Runnable) cVar.f20919g).run();
    }

    public final void b0(b bVar, n nVar) {
        if (bVar.equals(this.f1438c.D(bVar.f1433y)) && (bVar.R == null || bVar.Q == this)) {
            bVar.f1422m0 = nVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + bVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void c(b bVar) {
        if (K(2)) {
            Objects.toString(bVar);
        }
        if (bVar.Y) {
            bVar.Y = false;
            if (bVar.H) {
                return;
            }
            this.f1438c.j(bVar);
            if (K(2)) {
                bVar.toString();
            }
            if (L(bVar)) {
                this.G = true;
            }
        }
    }

    public final void c0(b bVar) {
        if (bVar != null) {
            if (!bVar.equals(this.f1438c.D(bVar.f1433y)) || (bVar.R != null && bVar.Q != this)) {
                throw new IllegalArgumentException("Fragment " + bVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        b bVar2 = this.f1459z;
        this.f1459z = bVar;
        r(bVar2);
        r(this.f1459z);
    }

    public final void d() {
        this.f1437b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void d0(b bVar) {
        ViewGroup viewGroupH = H(bVar);
        if (viewGroupH != null) {
            u uVar = bVar.f1417h0;
            if ((uVar == null ? 0 : uVar.f18869e) + (uVar == null ? 0 : uVar.f18868d) + (uVar == null ? 0 : uVar.f18867c) + (uVar == null ? 0 : uVar.f18866b) > 0) {
                if (viewGroupH.getTag(n4.b.visible_removing_fragment_view_tag) == null) {
                    viewGroupH.setTag(n4.b.visible_removing_fragment_view_tag, bVar);
                }
                b bVar2 = (b) viewGroupH.getTag(n4.b.visible_removing_fragment_view_tag);
                u uVar2 = bVar.f1417h0;
                boolean z10 = uVar2 != null ? uVar2.f18865a : false;
                if (bVar2.f1417h0 == null) {
                    return;
                }
                bVar2.k().f18865a = z10;
            }
        }
    }

    public final HashSet e() {
        k kVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.f1438c.W().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((e) it.next()).f1462c.f1412d0;
            if (viewGroup != null) {
                l.e(J(), "factory");
                Object tag = viewGroup.getTag(n4.b.special_effects_controller_view_tag);
                if (tag instanceof k) {
                    kVar = (k) tag;
                } else {
                    kVar = new k(viewGroup);
                    viewGroup.setTag(n4.b.special_effects_controller_view_tag, kVar);
                }
                hashSet.add(kVar);
            }
        }
        return hashSet;
    }

    public final void e0() {
        Iterator it = this.f1438c.W().iterator();
        while (it.hasNext()) {
            R((e) it.next());
        }
    }

    public final HashSet f(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator it = ((o4.a) arrayList.get(i10)).f18758a.iterator();
            while (it.hasNext()) {
                b bVar = ((o0) it.next()).f18827b;
                if (bVar != null && (viewGroup = bVar.f1412d0) != null) {
                    hashSet.add(k.i(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    public final void f0(IllegalStateException illegalStateException) {
        io.sentry.android.core.e0.d("FragmentManager", illegalStateException.getMessage());
        io.sentry.android.core.e0.d("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new q0());
        x xVar = this.f1456w;
        if (xVar == null) {
            try {
                w("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e4) {
                io.sentry.android.core.e0.c("FragmentManager", "Failed dumping state", e4);
                throw illegalStateException;
            }
        }
        try {
            xVar.B.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e10) {
            io.sentry.android.core.e0.c("FragmentManager", "Failed dumping state", e10);
            throw illegalStateException;
        }
    }

    public final e g(b bVar) {
        String str = bVar.f1433y;
        js.e eVar = this.f1438c;
        e eVar2 = (e) ((HashMap) eVar.f13798g).get(str);
        if (eVar2 != null) {
            return eVar2;
        }
        e eVar3 = new e(this.f1448o, eVar, bVar);
        eVar3.m(this.f1456w.f18878r.getClassLoader());
        eVar3.f1464e = this.f1455v;
        return eVar3;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ar.a, br.k] */
    /* JADX WARN: Type inference failed for: r1v8, types: [ar.a, br.k] */
    public final void g0() {
        synchronized (this.f1436a) {
            try {
                if (!this.f1436a.isEmpty()) {
                    am.d dVar = this.j;
                    dVar.f858a = true;
                    ?? r12 = dVar.f860c;
                    if (r12 != 0) {
                        r12.c();
                    }
                    if (K(3)) {
                        toString();
                    }
                    return;
                }
                boolean z10 = this.f1439d.size() + (this.f1443h != null ? 1 : 0) > 0 && O(this.f1458y);
                if (K(3)) {
                    toString();
                }
                am.d dVar2 = this.j;
                dVar2.f858a = z10;
                ?? r02 = dVar2.f860c;
                if (r02 != 0) {
                    r02.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(b bVar) {
        if (K(2)) {
            Objects.toString(bVar);
        }
        if (bVar.Y) {
            return;
        }
        bVar.Y = true;
        if (bVar.H) {
            if (K(2)) {
                bVar.toString();
            }
            js.e eVar = this.f1438c;
            synchronized (((ArrayList) eVar.f13797d)) {
                ((ArrayList) eVar.f13797d).remove(bVar);
            }
            bVar.H = false;
            if (L(bVar)) {
                this.G = true;
            }
            d0(bVar);
        }
    }

    public final void i(boolean z10, Configuration configuration) {
        if (z10 && this.f1456w != null) {
            f0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (b bVar : this.f1438c.a0()) {
            if (bVar != null) {
                bVar.onConfigurationChanged(configuration);
                if (z10) {
                    bVar.S.i(true, configuration);
                }
            }
        }
    }

    public final boolean j() {
        if (this.f1455v >= 1) {
            for (b bVar : this.f1438c.a0()) {
                if (bVar != null) {
                    if (!bVar.X ? bVar.S.j() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        boolean zK;
        boolean z10;
        if (this.f1455v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z11 = false;
        for (b bVar : this.f1438c.a0()) {
            if (bVar != null && N(bVar)) {
                if (bVar.X) {
                    zK = false;
                } else {
                    if (bVar.f1408a0 && bVar.f1409b0) {
                        bVar.E(menu, menuInflater);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zK = z10 | bVar.S.k(menu, menuInflater);
                }
                if (zK) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(bVar);
                    z11 = true;
                }
            }
        }
        if (this.f1440e != null) {
            for (int i10 = 0; i10 < this.f1440e.size(); i10++) {
                b bVar2 = (b) this.f1440e.get(i10);
                if (arrayList == null || !arrayList.contains(bVar2)) {
                    bVar2.getClass();
                }
            }
        }
        this.f1440e = arrayList;
        return z11;
    }

    public final void l() {
        boolean zIsChangingConfigurations = true;
        this.J = true;
        A(true);
        x();
        x xVar = this.f1456w;
        js.e eVar = this.f1438c;
        if (xVar != null) {
            zIsChangingConfigurations = ((l0) eVar.f13800x).f18819f;
        } else {
            j jVar = xVar.f18878r;
            if (jVar != null) {
                zIsChangingConfigurations = true ^ jVar.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.f1445l.values().iterator();
            while (it.hasNext()) {
                for (String str : ((BackStackState) it.next()).f1385a) {
                    l0 l0Var = (l0) eVar.f13800x;
                    l0Var.getClass();
                    K(3);
                    l0Var.c(str, false);
                }
            }
        }
        u(-1);
        x xVar2 = this.f1456w;
        if (xVar2 != null) {
            xVar2.B.H.remove(this.f1451r);
        }
        x xVar3 = this.f1456w;
        if (xVar3 != null) {
            xVar3.B.G.remove(this.f1450q);
        }
        x xVar4 = this.f1456w;
        if (xVar4 != null) {
            xVar4.B.J.remove(this.f1452s);
        }
        x xVar5 = this.f1456w;
        if (xVar5 != null) {
            xVar5.B.K.remove(this.f1453t);
        }
        x xVar6 = this.f1456w;
        if (xVar6 != null && this.f1458y == null) {
            qm.c cVar = xVar6.B.f3029g;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) cVar.f20918d;
            d0 d0Var = this.f1454u;
            copyOnWriteArrayList.remove(d0Var);
            if (((HashMap) cVar.f20920r).remove(d0Var) != null) {
                throw new ClassCastException();
            }
            ((Runnable) cVar.f20919g).run();
        }
        this.f1456w = null;
        this.f1457x = null;
        this.f1458y = null;
        if (this.f1442g != null) {
            Iterator it2 = this.j.f859b.iterator();
            while (it2.hasNext()) {
                ((c.c) it2.next()).cancel();
            }
            this.f1442g = null;
        }
        f.d dVar = this.C;
        if (dVar != null) {
            dVar.b();
            this.D.b();
            this.E.b();
        }
    }

    public final void m(boolean z10) {
        if (z10 && this.f1456w != null) {
            f0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (b bVar : this.f1438c.a0()) {
            if (bVar != null) {
                bVar.onLowMemory();
                if (z10) {
                    bVar.S.m(true);
                }
            }
        }
    }

    public final void n(boolean z10) {
        if (z10 && this.f1456w != null) {
            f0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (b bVar : this.f1438c.a0()) {
            if (bVar != null && z10) {
                bVar.S.n(true);
            }
        }
    }

    public final void o() {
        Iterator it = this.f1438c.X().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                bVar.x();
                bVar.S.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        boolean zP;
        if (this.f1455v >= 1) {
            for (b bVar : this.f1438c.a0()) {
                if (bVar != null) {
                    if (bVar.X) {
                        zP = false;
                    } else {
                        if (bVar.f1408a0 && bVar.f1409b0) {
                            bVar.M(menuItem);
                        }
                        zP = bVar.S.p(menuItem);
                    }
                    if (zP) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.f1455v < 1) {
            return;
        }
        for (b bVar : this.f1438c.a0()) {
            if (bVar != null && !bVar.X) {
                bVar.S.q();
            }
        }
    }

    public final void r(b bVar) {
        if (bVar != null) {
            if (bVar.equals(this.f1438c.D(bVar.f1433y))) {
                bVar.Q.getClass();
                boolean zO = O(bVar);
                Boolean bool = bVar.G;
                if (bool == null || bool.booleanValue() != zO) {
                    bVar.G = Boolean.valueOf(zO);
                    j0 j0Var = bVar.S;
                    j0Var.g0();
                    j0Var.r(j0Var.f1459z);
                }
            }
        }
    }

    public final void s(boolean z10) {
        if (z10 && this.f1456w != null) {
            f0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (b bVar : this.f1438c.a0()) {
            if (bVar != null && z10) {
                bVar.S.s(true);
            }
        }
    }

    public final boolean t() {
        if (this.f1455v < 1) {
            return false;
        }
        boolean z10 = false;
        for (b bVar : this.f1438c.a0()) {
            if (bVar != null && N(bVar)) {
                if (bVar.X ? false : bVar.S.t() | (bVar.f1408a0 && bVar.f1409b0)) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        b bVar = this.f1458y;
        if (bVar != null) {
            sb2.append(bVar.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f1458y)));
            sb2.append("}");
        } else {
            x xVar = this.f1456w;
            if (xVar != null) {
                sb2.append(xVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f1456w)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(int i10) {
        try {
            this.f1437b = true;
            for (e eVar : ((HashMap) this.f1438c.f13798g).values()) {
                if (eVar != null) {
                    eVar.f1464e = i10;
                }
            }
            P(i10, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((k) it.next()).h();
            }
            this.f1437b = false;
            A(true);
        } catch (Throwable th2) {
            this.f1437b = false;
            throw th2;
        }
    }

    public final void v() {
        if (this.K) {
            this.K = false;
            e0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strF = w.g.f(str, "    ");
        js.e eVar = this.f1438c;
        ArrayList arrayList = (ArrayList) eVar.f13797d;
        String strF2 = w.g.f(str, "    ");
        HashMap map = (HashMap) eVar.f13798g;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (e eVar2 : map.values()) {
                printWriter.print(str);
                if (eVar2 != null) {
                    b bVar = eVar2.f1462c;
                    printWriter.println(bVar);
                    bVar.j(strF2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size2; i10++) {
                b bVar2 = (b) arrayList.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(bVar2.toString());
            }
        }
        ArrayList arrayList2 = this.f1440e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size; i11++) {
                b bVar3 = (b) this.f1440e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(bVar3.toString());
            }
        }
        int size3 = this.f1439d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size3; i12++) {
                o4.a aVar = (o4.a) this.f1439d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.h(strF, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.f1436a) {
            try {
                int size4 = this.f1436a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size4; i13++) {
                        Object obj = (g0) this.f1436a.get(i13);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1456w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1457x);
        if (this.f1458y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1458y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1455v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((k) it.next()).h();
        }
    }

    public final void y(g0 g0Var, boolean z10) {
        if (!z10) {
            if (this.f1456w == null) {
                if (!this.J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.H || this.I) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1436a) {
            try {
                if (this.f1456w == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1436a.add(g0Var);
                    Z();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void z(boolean z10) {
        if (this.f1437b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1456w == null) {
            if (!this.J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1456w.f18879x.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10 && (this.H || this.I)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }
}
