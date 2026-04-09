package b5;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.liuzh.deviceinfo.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u0 {
    public z A;
    public f.h D;
    public f.h E;
    public f.h F;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public ArrayList O;
    public w0 P;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1878b;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f1881e;
    public d.c0 g;

    /* renamed from: r, reason: collision with root package name */
    public final h0 f1892r;

    /* renamed from: s, reason: collision with root package name */
    public final h0 f1893s;

    /* renamed from: t, reason: collision with root package name */
    public final h0 f1894t;

    /* renamed from: u, reason: collision with root package name */
    public final h0 f1895u;

    /* renamed from: x, reason: collision with root package name */
    public d0 f1898x;

    /* renamed from: y, reason: collision with root package name */
    public com.bumptech.glide.e f1899y;

    /* renamed from: z, reason: collision with root package name */
    public z f1900z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1877a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final a0.x0 f1879c = new a0.x0(2);

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f1880d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final g0 f1882f = new g0(this);

    /* renamed from: h, reason: collision with root package name */
    public a f1883h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1884i = false;
    public final i0 j = new i0(this);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f1885k = new AtomicInteger();

    /* renamed from: l, reason: collision with root package name */
    public final Map f1886l = a0.g.r();

    /* renamed from: m, reason: collision with root package name */
    public final Map f1887m = a0.g.r();

    /* renamed from: n, reason: collision with root package name */
    public final Map f1888n = a0.g.r();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f1889o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final yb.i f1890p = new yb.i(this);

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f1891q = new CopyOnWriteArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final j0 f1896v = new j0(0, this);

    /* renamed from: w, reason: collision with root package name */
    public int f1897w = -1;
    public final k0 B = new k0(this);
    public final bf.f C = new bf.f(5);
    public ArrayDeque G = new ArrayDeque();
    public final o Q = new o(2, this);

    /* JADX WARN: Type inference failed for: r0v14, types: [b5.h0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [b5.h0] */
    /* JADX WARN: Type inference failed for: r0v16, types: [b5.h0] */
    /* JADX WARN: Type inference failed for: r0v17, types: [b5.h0] */
    public u0() {
        final int i4 = 0;
        this.f1892r = new d4.a(this) { // from class: b5.h0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f1813b;

            {
                this.f1813b = this;
            }

            @Override // d4.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        u0 u0Var = this.f1813b;
                        if (u0Var.M()) {
                            u0Var.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        u0 u0Var2 = this.f1813b;
                        if (u0Var2.M() && num.intValue() == 80) {
                            u0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        r3.h hVar = (r3.h) obj;
                        u0 u0Var3 = this.f1813b;
                        if (u0Var3.M()) {
                            boolean z3 = hVar.f32745a;
                            u0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        r3.z zVar = (r3.z) obj;
                        u0 u0Var4 = this.f1813b;
                        if (u0Var4.M()) {
                            boolean z10 = zVar.f32795a;
                            u0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f1893s = new d4.a(this) { // from class: b5.h0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f1813b;

            {
                this.f1813b = this;
            }

            @Override // d4.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        u0 u0Var = this.f1813b;
                        if (u0Var.M()) {
                            u0Var.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        u0 u0Var2 = this.f1813b;
                        if (u0Var2.M() && num.intValue() == 80) {
                            u0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        r3.h hVar = (r3.h) obj;
                        u0 u0Var3 = this.f1813b;
                        if (u0Var3.M()) {
                            boolean z3 = hVar.f32745a;
                            u0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        r3.z zVar = (r3.z) obj;
                        u0 u0Var4 = this.f1813b;
                        if (u0Var4.M()) {
                            boolean z10 = zVar.f32795a;
                            u0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 2;
        this.f1894t = new d4.a(this) { // from class: b5.h0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f1813b;

            {
                this.f1813b = this;
            }

            @Override // d4.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        u0 u0Var = this.f1813b;
                        if (u0Var.M()) {
                            u0Var.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        u0 u0Var2 = this.f1813b;
                        if (u0Var2.M() && num.intValue() == 80) {
                            u0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        r3.h hVar = (r3.h) obj;
                        u0 u0Var3 = this.f1813b;
                        if (u0Var3.M()) {
                            boolean z3 = hVar.f32745a;
                            u0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        r3.z zVar = (r3.z) obj;
                        u0 u0Var4 = this.f1813b;
                        if (u0Var4.M()) {
                            boolean z10 = zVar.f32795a;
                            u0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 3;
        this.f1895u = new d4.a(this) { // from class: b5.h0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f1813b;

            {
                this.f1813b = this;
            }

            @Override // d4.a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        u0 u0Var = this.f1813b;
                        if (u0Var.M()) {
                            u0Var.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        u0 u0Var2 = this.f1813b;
                        if (u0Var2.M() && num.intValue() == 80) {
                            u0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        r3.h hVar = (r3.h) obj;
                        u0 u0Var3 = this.f1813b;
                        if (u0Var3.M()) {
                            boolean z3 = hVar.f32745a;
                            u0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        r3.z zVar = (r3.z) obj;
                        u0 u0Var4 = this.f1813b;
                        if (u0Var4.M()) {
                            boolean z10 = zVar.f32795a;
                            u0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
    }

    public static HashSet F(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < aVar.f1710c.size(); i4++) {
            z zVar = ((c1) aVar.f1710c.get(i4)).f1755b;
            if (zVar != null && aVar.f1715i) {
                hashSet.add(zVar);
            }
        }
        return hashSet;
    }

    public static boolean K(int i4) {
        return Log.isLoggable("FragmentManager", i4);
    }

    public static boolean L(z zVar) {
        zVar.getClass();
        ArrayList arrayListA = zVar.f1949w.f1879c.A();
        int size = arrayListA.size();
        boolean zL = false;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListA.get(i4);
            i4++;
            z zVar2 = (z) obj;
            if (zVar2 != null) {
                zL = L(zVar2);
            }
            if (zL) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(z zVar) {
        if (zVar == null) {
            return true;
        }
        if (zVar.E) {
            return zVar.f1947u == null || N(zVar.f1950x);
        }
        return false;
    }

    public static boolean O(z zVar) {
        if (zVar == null) {
            return true;
        }
        u0 u0Var = zVar.f1947u;
        return zVar.equals(u0Var.A) && O(u0Var.f1900z);
    }

    public static void f0(z zVar) {
        if (K(2)) {
            Log.v("FragmentManager", "show: " + zVar);
        }
        if (zVar.B) {
            zVar.B = false;
            zVar.L = !zVar.L;
        }
    }

    public final void A(a aVar, boolean z3) {
        if (z3 && (this.f1898x == null || this.K)) {
            return;
        }
        y(z3);
        a aVar2 = this.f1883h;
        if (aVar2 != null) {
            aVar2.f1725t = false;
            aVar2.d();
            if (K(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f1883h + " as part of execSingleAction for action " + aVar);
            }
            this.f1883h.f(false, false);
            this.f1883h.a(this.M, this.N);
            ArrayList arrayList = this.f1883h.f1710c;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                z zVar = ((c1) obj).f1755b;
                if (zVar != null) {
                    zVar.f1940n = false;
                }
            }
            this.f1883h = null;
        }
        aVar.a(this.M, this.N);
        this.f1878b = true;
        try {
            W(this.M, this.N);
            d();
            i0();
            if (this.L) {
                this.L = false;
                g0();
            }
            ((HashMap) this.f1879c.f145b).values().removeAll(Collections.singleton(null));
        } catch (Throwable th2) {
            d();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x021e A[PHI: r15
  0x021e: PHI (r15v24 int) = (r15v23 int), (r15v26 int) binds: [B:103:0x020b, B:107:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(java.util.ArrayList r28, java.util.ArrayList r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 1466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.u0.B(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final z C(int i4) {
        a0.x0 x0Var = this.f1879c;
        ArrayList arrayList = (ArrayList) x0Var.f148e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z zVar = (z) arrayList.get(size);
            if (zVar != null && zVar.f1951y == i4) {
                return zVar;
            }
        }
        for (b1 b1Var : ((HashMap) x0Var.f145b).values()) {
            if (b1Var != null) {
                z zVar2 = b1Var.f1747c;
                if (zVar2.f1951y == i4) {
                    return zVar2;
                }
            }
        }
        return null;
    }

    public final z D(String str) {
        a0.x0 x0Var = this.f1879c;
        ArrayList arrayList = (ArrayList) x0Var.f148e;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                z zVar = (z) arrayList.get(size);
                if (zVar != null && str.equals(zVar.A)) {
                    return zVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (b1 b1Var : ((HashMap) x0Var.f145b).values()) {
            if (b1Var != null) {
                z zVar2 = b1Var.f1747c;
                if (str.equals(zVar2.A)) {
                    return zVar2;
                }
            }
        }
        return null;
    }

    public final void E() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (nVar.f1842f) {
                if (K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                nVar.f1842f = false;
                nVar.e();
            }
        }
    }

    public final ViewGroup G(z zVar) {
        ViewGroup viewGroup = zVar.G;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (zVar.f1952z <= 0 || !this.f1899y.J()) {
            return null;
        }
        View viewI = this.f1899y.I(zVar.f1952z);
        if (viewI instanceof ViewGroup) {
            return (ViewGroup) viewI;
        }
        return null;
    }

    public final k0 H() {
        z zVar = this.f1900z;
        return zVar != null ? zVar.f1947u.H() : this.B;
    }

    public final bf.f I() {
        z zVar = this.f1900z;
        return zVar != null ? zVar.f1947u.I() : this.C;
    }

    public final void J(z zVar) {
        if (K(2)) {
            Log.v("FragmentManager", "hide: " + zVar);
        }
        if (zVar.B) {
            return;
        }
        zVar.B = true;
        zVar.L = true ^ zVar.L;
        e0(zVar);
    }

    public final boolean M() {
        z zVar = this.f1900z;
        if (zVar == null) {
            return true;
        }
        return zVar.y() && this.f1900z.s().M();
    }

    public final boolean P() {
        return this.I || this.J;
    }

    public final void Q(int i4, boolean z3) {
        d0 d0Var;
        if (this.f1898x == null && i4 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z3 || i4 != this.f1897w) {
            this.f1897w = i4;
            a0.x0 x0Var = this.f1879c;
            HashMap map = (HashMap) x0Var.f145b;
            ArrayList arrayList = (ArrayList) x0Var.f148e;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                b1 b1Var = (b1) map.get(((z) obj).f1934f);
                if (b1Var != null) {
                    b1Var.k();
                }
            }
            for (b1 b1Var2 : map.values()) {
                if (b1Var2 != null) {
                    b1Var2.k();
                    z zVar = b1Var2.f1747c;
                    if (zVar.f1939m && !zVar.A()) {
                        x0Var.F(b1Var2);
                    }
                }
            }
            g0();
            if (this.H && (d0Var = this.f1898x) != null && this.f1897w == 7) {
                d0Var.f1769e.invalidateOptionsMenu();
                this.H = false;
            }
        }
    }

    public final void R() {
        if (this.f1898x == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.g = false;
        for (z zVar : this.f1879c.B()) {
            if (zVar != null) {
                zVar.f1949w.R();
            }
        }
    }

    public final boolean S() {
        return T(-1, 0);
    }

    public final boolean T(int i4, int i10) {
        z(false);
        y(true);
        z zVar = this.A;
        if (zVar != null && i4 < 0 && zVar.o().S()) {
            return true;
        }
        boolean zU = U(this.M, this.N, i4, i10);
        if (zU) {
            this.f1878b = true;
            try {
                W(this.M, this.N);
            } finally {
                d();
            }
        }
        i0();
        if (this.L) {
            this.L = false;
            g0();
        }
        ((HashMap) this.f1879c.f145b).values().removeAll(Collections.singleton(null));
        return zU;
    }

    public final boolean U(ArrayList arrayList, ArrayList arrayList2, int i4, int i10) {
        boolean z3 = (i10 & 1) != 0;
        int size = -1;
        if (!this.f1880d.isEmpty()) {
            if (i4 < 0) {
                size = z3 ? 0 : this.f1880d.size() - 1;
            } else {
                int size2 = this.f1880d.size() - 1;
                while (size2 >= 0) {
                    a aVar = (a) this.f1880d.get(size2);
                    if (i4 >= 0 && i4 == aVar.f1726u) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z3) {
                    size = size2;
                    while (size > 0) {
                        a aVar2 = (a) this.f1880d.get(size - 1);
                        if (i4 < 0 || i4 != aVar2.f1726u) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f1880d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f1880d.size() - 1; size3 >= size; size3--) {
            arrayList.add((a) this.f1880d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void V(z zVar) {
        if (K(2)) {
            Log.v("FragmentManager", "remove: " + zVar + " nesting=" + zVar.f1946t);
        }
        boolean zA = zVar.A();
        if (zVar.C && zA) {
            return;
        }
        a0.x0 x0Var = this.f1879c;
        synchronized (((ArrayList) x0Var.f148e)) {
            ((ArrayList) x0Var.f148e).remove(zVar);
        }
        zVar.f1938l = false;
        if (L(zVar)) {
            this.H = true;
        }
        zVar.f1939m = true;
        e0(zVar);
    }

    public final void W(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i4 = 0;
        int i10 = 0;
        while (i4 < size) {
            if (!((a) arrayList.get(i4)).f1722q) {
                if (i10 != i4) {
                    B(arrayList, arrayList2, i10, i4);
                }
                i10 = i4 + 1;
                if (((Boolean) arrayList2.get(i4)).booleanValue()) {
                    while (i10 < size && ((Boolean) arrayList2.get(i10)).booleanValue() && !((a) arrayList.get(i10)).f1722q) {
                        i10++;
                    }
                }
                B(arrayList, arrayList2, i4, i10);
                i4 = i10 - 1;
            }
            i4++;
        }
        if (i10 != size) {
            B(arrayList, arrayList2, i10, size);
        }
    }

    public final void X(Bundle bundle) {
        yb.i iVar;
        int i4;
        int i10;
        Bundle bundle2;
        b1 b1Var;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.f1898x.f1766b.getClassLoader());
                this.f1887m.put(str.substring(7), bundle4);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.f1898x.f1766b.getClassLoader());
                map.put(str2.substring(9), bundle3);
            }
        }
        a0.x0 x0Var = this.f1879c;
        HashMap map2 = (HashMap) x0Var.f146c;
        HashMap map3 = (HashMap) x0Var.f145b;
        map2.clear();
        map2.putAll(map);
        v0 v0Var = (v0) bundle.getParcelable("state");
        if (v0Var == null) {
            return;
        }
        map3.clear();
        ArrayList arrayList = v0Var.f1902a;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            iVar = this.f1890p;
            if (i11 >= size) {
                break;
            }
            Object obj = arrayList.get(i11);
            i11++;
            Bundle bundleK = x0Var.K(null, (String) obj);
            if (bundleK != null) {
                z zVar = (z) this.P.f1915b.get(((z0) bundleK.getParcelable("state")).f1954b);
                if (zVar != null) {
                    if (K(2)) {
                        i10 = 2;
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + zVar);
                    } else {
                        i10 = 2;
                    }
                    b1Var = new b1(iVar, x0Var, zVar, bundleK);
                    bundle2 = bundleK;
                } else {
                    i10 = 2;
                    bundle2 = bundleK;
                    b1Var = new b1(this.f1890p, this.f1879c, this.f1898x.f1766b.getClassLoader(), H(), bundleK);
                }
                z zVar2 = b1Var.f1747c;
                zVar2.f1930b = bundle2;
                zVar2.f1947u = this;
                if (K(i10)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + zVar2.f1934f + "): " + zVar2);
                }
                b1Var.m(this.f1898x.f1766b.getClassLoader());
                x0Var.E(b1Var);
                b1Var.f1749e = this.f1897w;
            }
        }
        w0 w0Var = this.P;
        w0Var.getClass();
        ArrayList arrayList2 = new ArrayList(w0Var.f1915b.values());
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            z zVar3 = (z) obj2;
            if (map3.get(zVar3.f1934f) == null) {
                if (K(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + zVar3 + " that was not found in the set of active Fragments " + v0Var.f1902a);
                }
                this.P.h(zVar3);
                zVar3.f1947u = this;
                b1 b1Var2 = new b1(iVar, x0Var, zVar3);
                b1Var2.f1749e = 1;
                b1Var2.k();
                zVar3.f1939m = true;
                b1Var2.k();
            }
        }
        ArrayList arrayList3 = v0Var.f1903b;
        ((ArrayList) x0Var.f148e).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList3.get(i13);
                i13++;
                String str3 = (String) obj3;
                z zVarV = x0Var.v(str3);
                if (zVarV == null) {
                    throw new IllegalStateException(d.h.t("No instantiated fragment for (", str3, ")"));
                }
                if (K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + zVarV);
                }
                x0Var.h(zVarV);
            }
        }
        if (v0Var.f1904c != null) {
            this.f1880d = new ArrayList(v0Var.f1904c.length);
            int i14 = 0;
            while (true) {
                b[] bVarArr = v0Var.f1904c;
                if (i14 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i14];
                ArrayList arrayList4 = bVar.f1732b;
                a aVar = new a(this);
                int[] iArr = bVar.f1731a;
                int i15 = 0;
                int i16 = 0;
                while (i15 < iArr.length) {
                    c1 c1Var = new c1();
                    int i17 = i15 + 1;
                    c1Var.f1754a = iArr[i15];
                    if (K(2)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i16 + " base fragment #" + iArr[i17]);
                    }
                    c1Var.f1760h = androidx.lifecycle.s.values()[bVar.f1733c[i16]];
                    c1Var.f1761i = androidx.lifecycle.s.values()[bVar.f1734d[i16]];
                    int i18 = i15 + 2;
                    c1Var.f1756c = iArr[i17] != 0;
                    int i19 = iArr[i18];
                    c1Var.f1757d = i19;
                    int i20 = iArr[i15 + 3];
                    c1Var.f1758e = i20;
                    int i21 = i15 + 5;
                    int i22 = iArr[i15 + 4];
                    c1Var.f1759f = i22;
                    i15 += 6;
                    int[] iArr2 = iArr;
                    int i23 = iArr2[i21];
                    c1Var.g = i23;
                    aVar.f1711d = i19;
                    aVar.f1712e = i20;
                    aVar.f1713f = i22;
                    aVar.g = i23;
                    aVar.b(c1Var);
                    i16++;
                    iArr = iArr2;
                }
                aVar.f1714h = bVar.f1735e;
                aVar.j = bVar.f1736f;
                aVar.f1715i = true;
                aVar.f1716k = bVar.f1737h;
                aVar.f1717l = bVar.f1738i;
                aVar.f1718m = bVar.j;
                aVar.f1719n = bVar.f1739k;
                aVar.f1720o = bVar.f1740l;
                aVar.f1721p = bVar.f1741m;
                aVar.f1722q = bVar.f1742n;
                aVar.f1726u = bVar.g;
                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                    String str4 = (String) arrayList4.get(i24);
                    if (str4 != null) {
                        ((c1) aVar.f1710c.get(i24)).f1755b = x0Var.v(str4);
                    }
                }
                aVar.c(1);
                if (K(2)) {
                    StringBuilder sbW = je.u.w(i14, "restoreAllState: back stack #", " (index ");
                    sbW.append(aVar.f1726u);
                    sbW.append("): ");
                    sbW.append(aVar);
                    Log.v("FragmentManager", sbW.toString());
                    PrintWriter printWriter = new PrintWriter(new e1());
                    aVar.i("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1880d.add(aVar);
                i14++;
            }
            i4 = 0;
        } else {
            i4 = 0;
            this.f1880d = new ArrayList();
        }
        this.f1885k.set(v0Var.f1905d);
        String str5 = v0Var.f1906e;
        if (str5 != null) {
            z zVarV2 = x0Var.v(str5);
            this.A = zVarV2;
            r(zVarV2);
        }
        ArrayList arrayList5 = v0Var.f1907f;
        if (arrayList5 != null) {
            for (int i25 = i4; i25 < arrayList5.size(); i25++) {
                this.f1886l.put((String) arrayList5.get(i25), (c) v0Var.g.get(i25));
            }
        }
        this.G = new ArrayDeque(v0Var.f1908h);
    }

    public final Bundle Y() {
        int i4;
        ArrayList arrayList;
        b[] bVarArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        E();
        w();
        z(true);
        this.I = true;
        this.P.g = true;
        a0.x0 x0Var = this.f1879c;
        x0Var.getClass();
        HashMap map = (HashMap) x0Var.f145b;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            b1 b1Var = (b1) it.next();
            if (b1Var != null) {
                z zVar = b1Var.f1747c;
                String str = zVar.f1934f;
                Bundle bundle3 = new Bundle();
                z zVar2 = b1Var.f1747c;
                if (zVar2.f1929a == -1 && (bundle = zVar2.f1930b) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new z0(zVar2));
                if (zVar2.f1929a > 0) {
                    Bundle bundle4 = new Bundle();
                    zVar2.O(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    b1Var.f1745a.w(zVar2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    zVar2.U.r(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleY = zVar2.f1949w.Y();
                    if (!bundleY.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleY);
                    }
                    if (zVar2.H != null) {
                        b1Var.o();
                    }
                    SparseArray<? extends Parcelable> sparseArray = zVar2.f1931c;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = zVar2.f1932d;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = zVar2.g;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                x0Var.K(bundle3, str);
                arrayList2.add(zVar.f1934f);
                if (K(2)) {
                    Log.v("FragmentManager", "Saved state of " + zVar + ": " + zVar.f1930b);
                }
            }
        }
        HashMap map2 = (HashMap) this.f1879c.f146c;
        if (!map2.isEmpty()) {
            a0.x0 x0Var2 = this.f1879c;
            synchronized (((ArrayList) x0Var2.f148e)) {
                try {
                    if (((ArrayList) x0Var2.f148e).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) x0Var2.f148e).size());
                        ArrayList arrayList3 = (ArrayList) x0Var2.f148e;
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList3.get(i10);
                            i10++;
                            z zVar3 = (z) obj;
                            arrayList.add(zVar3.f1934f);
                            if (K(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + zVar3.f1934f + "): " + zVar3);
                            }
                        }
                    }
                } finally {
                }
            }
            int size2 = this.f1880d.size();
            if (size2 > 0) {
                bVarArr = new b[size2];
                for (i4 = 0; i4 < size2; i4++) {
                    bVarArr[i4] = new b((a) this.f1880d.get(i4));
                    if (K(2)) {
                        StringBuilder sbW = je.u.w(i4, "saveAllState: adding back stack #", ": ");
                        sbW.append(this.f1880d.get(i4));
                        Log.v("FragmentManager", sbW.toString());
                    }
                }
            } else {
                bVarArr = null;
            }
            v0 v0Var = new v0();
            v0Var.f1906e = null;
            ArrayList arrayList4 = new ArrayList();
            v0Var.f1907f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            v0Var.g = arrayList5;
            v0Var.f1902a = arrayList2;
            v0Var.f1903b = arrayList;
            v0Var.f1904c = bVarArr;
            v0Var.f1905d = this.f1885k.get();
            z zVar4 = this.A;
            if (zVar4 != null) {
                v0Var.f1906e = zVar4.f1934f;
            }
            arrayList4.addAll(this.f1886l.keySet());
            arrayList5.addAll(this.f1886l.values());
            v0Var.f1908h = new ArrayList(this.G);
            bundle2.putParcelable("state", v0Var);
            for (String str2 : this.f1887m.keySet()) {
                bundle2.putBundle(je.u.t("result_", str2), (Bundle) this.f1887m.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle(je.u.t("fragment_", str3), (Bundle) map2.get(str3));
            }
        } else if (K(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    public final void Z() {
        synchronized (this.f1877a) {
            try {
                if (this.f1877a.size() == 1) {
                    this.f1898x.f1767c.removeCallbacks(this.Q);
                    this.f1898x.f1767c.post(this.Q);
                    i0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final b1 a(z zVar) {
        String str = zVar.O;
        if (str != null) {
            c5.c.c(zVar, str);
        }
        if (K(2)) {
            Log.v("FragmentManager", "add: " + zVar);
        }
        b1 b1VarG = g(zVar);
        zVar.f1947u = this;
        a0.x0 x0Var = this.f1879c;
        x0Var.E(b1VarG);
        if (!zVar.C) {
            x0Var.h(zVar);
            zVar.f1939m = false;
            if (zVar.H == null) {
                zVar.L = false;
            }
            if (L(zVar)) {
                this.H = true;
            }
        }
        return b1VarG;
    }

    public final void a0(z zVar, boolean z3) {
        ViewGroup viewGroupG = G(zVar);
        if (viewGroupG == null || !(viewGroupG instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupG).setDrawDisappearingViewsLast(!z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(d0 d0Var, com.bumptech.glide.e eVar, z zVar) {
        if (this.f1898x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1898x = d0Var;
        this.f1899y = eVar;
        this.f1900z = zVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1891q;
        if (zVar != 0) {
            copyOnWriteArrayList.add(new m0(zVar));
        } else if (d0Var != null) {
            copyOnWriteArrayList.add(d0Var);
        }
        if (this.f1900z != null) {
            i0();
        }
        if (d0Var != null) {
            d.c0 c0VarO = d0Var.f1769e.o();
            this.g = c0VarO;
            d0 d0Var2 = zVar != 0 ? zVar : d0Var;
            c0VarO.getClass();
            i0 i0Var = this.j;
            nk.k.e(i0Var, "onBackPressedCallback");
            androidx.lifecycle.c0 c0VarJ = d0Var2.j();
            if (c0VarJ.f1110d != androidx.lifecycle.s.f1180a) {
                d.y yVar = new d.y(i0Var, new d.z(i0Var, d0Var2));
                ((ArrayList) i0Var.f1821b).add(yVar);
                yVar.c(false);
                a0.x0 x0Var = c0VarO.f21583b;
                x0Var.getClass();
                if (((LinkedHashSet) x0Var.f146c).add(yVar)) {
                    k5.e eVar2 = (k5.e) x0Var.f145b;
                    eVar2.getClass();
                    if (yVar.f21642c != null) {
                        throw new IllegalArgumentException(("Handler '" + yVar + "' is already registered with a dispatcher").toString());
                    }
                    eVar2.f27945e.addFirst(yVar);
                    yVar.f21642c = x0Var;
                    eVar2.b();
                }
                d.b0 b0Var = new d.b0(yVar, i0Var, c0VarO, c0VarJ);
                c0VarJ.a(b0Var);
                ((CopyOnWriteArrayList) i0Var.f1822c).add(b0Var);
            }
        }
        if (zVar != 0) {
            w0 w0Var = zVar.f1947u.P;
            HashMap map = w0Var.f1916c;
            w0 w0Var2 = (w0) map.get(zVar.f1934f);
            if (w0Var2 == null) {
                w0Var2 = new w0(w0Var.f1918e);
                map.put(zVar.f1934f, w0Var2);
            }
            this.P = w0Var2;
        } else if (d0Var != null) {
            this.P = (w0) new androidx.lifecycle.i1(d0Var.f1769e.e(), w0.f1914h, h5.a.f24879b).a(nk.v.a(w0.class));
        } else {
            this.P = new w0(false);
        }
        this.P.g = P();
        this.f1879c.f147d = this.P;
        d0 d0Var3 = this.f1898x;
        if (d0Var3 != null && zVar == 0) {
            yb.i iVarG = d0Var3.g();
            iVarG.P("android:support:fragments", new a0(1, this));
            Bundle bundleL = iVarG.l("android:support:fragments");
            if (bundleL != null) {
                X(bundleL);
            }
        }
        d0 d0Var4 = this.f1898x;
        if (d0Var4 != null) {
            d.i iVar = d0Var4.f1769e.f21610i;
            String strT = je.u.t("FragmentManager:", zVar != 0 ? d.h.w(new StringBuilder(), zVar.f1934f, ":") : "");
            String strS = d.h.s(strT, "StartActivityForResult");
            o0 o0Var = new o0(5);
            n0 n0Var = new n0();
            n0Var.f1843a = this;
            this.D = iVar.d(strS, o0Var, n0Var);
            this.E = iVar.d(d.h.s(strT, "StartIntentSenderForResult"), new o0(0), new p6.i(this));
            this.F = iVar.d(d.h.s(strT, "RequestPermissions"), new o0(3), new o7.c(5, this));
        }
        d0 d0Var5 = this.f1898x;
        if (d0Var5 != null) {
            d0Var5.f1769e.m(this.f1892r);
        }
        d0 d0Var6 = this.f1898x;
        if (d0Var6 != null) {
            i.g gVar = d0Var6.f1769e;
            gVar.getClass();
            h0 h0Var = this.f1893s;
            nk.k.e(h0Var, "listener");
            gVar.f21611k.add(h0Var);
        }
        d0 d0Var7 = this.f1898x;
        if (d0Var7 != null) {
            i.g gVar2 = d0Var7.f1769e;
            gVar2.getClass();
            h0 h0Var2 = this.f1894t;
            nk.k.e(h0Var2, "listener");
            gVar2.f21613m.add(h0Var2);
        }
        d0 d0Var8 = this.f1898x;
        if (d0Var8 != null) {
            i.g gVar3 = d0Var8.f1769e;
            gVar3.getClass();
            h0 h0Var3 = this.f1895u;
            nk.k.e(h0Var3, "listener");
            gVar3.f21614n.add(h0Var3);
        }
        d0 d0Var9 = this.f1898x;
        if (d0Var9 == null || zVar != 0) {
            return;
        }
        i.g gVar4 = d0Var9.f1769e;
        gVar4.getClass();
        j0 j0Var = this.f1896v;
        nk.k.e(j0Var, "provider");
        yb.e eVar3 = gVar4.f21605c;
        ((CopyOnWriteArrayList) eVar3.f37510c).add(j0Var);
        ((Runnable) eVar3.f37509b).run();
    }

    public final void b0(String str, hg.a aVar, y0 y0Var) {
        androidx.lifecycle.c0 c0Var = aVar.f32744a;
        if (c0Var.f1110d == androidx.lifecycle.s.f1180a) {
            return;
        }
        l0 l0Var = new l0(this, str, y0Var, c0Var);
        q0 q0Var = (q0) this.f1888n.put(str, new q0(c0Var, y0Var, l0Var));
        if (q0Var != null) {
            q0Var.f1852a.b(q0Var.f1854c);
        }
        if (K(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + c0Var + " and listener " + y0Var);
        }
        c0Var.a(l0Var);
    }

    public final void c(z zVar) {
        if (K(2)) {
            Log.v("FragmentManager", "attach: " + zVar);
        }
        if (zVar.C) {
            zVar.C = false;
            if (zVar.f1938l) {
                return;
            }
            this.f1879c.h(zVar);
            if (K(2)) {
                Log.v("FragmentManager", "add from attach: " + zVar);
            }
            if (L(zVar)) {
                this.H = true;
            }
        }
    }

    public final void c0(z zVar, androidx.lifecycle.s sVar) {
        if (zVar.equals(this.f1879c.v(zVar.f1934f)) && (zVar.f1948v == null || zVar.f1947u == this)) {
            zVar.P = sVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + zVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void d() {
        this.f1878b = false;
        this.N.clear();
        this.M.clear();
    }

    public final void d0(z zVar) {
        if (zVar != null) {
            if (!zVar.equals(this.f1879c.v(zVar.f1934f)) || (zVar.f1948v != null && zVar.f1947u != this)) {
                throw new IllegalArgumentException("Fragment " + zVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        z zVar2 = this.A;
        this.A = zVar;
        r(zVar2);
        r(this.A);
    }

    public final HashSet e() {
        n nVar;
        HashSet hashSet = new HashSet();
        ArrayList arrayListZ = this.f1879c.z();
        int size = arrayListZ.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListZ.get(i4);
            i4++;
            ViewGroup viewGroup = ((b1) obj).f1747c.G;
            if (viewGroup != null) {
                nk.k.e(I(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof n) {
                    nVar = (n) tag;
                } else {
                    nVar = new n(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, nVar);
                }
                hashSet.add(nVar);
            }
        }
        return hashSet;
    }

    public final void e0(z zVar) {
        ViewGroup viewGroupG = G(zVar);
        if (viewGroupG != null) {
            x xVar = zVar.K;
            if ((xVar == null ? 0 : xVar.f1924e) + (xVar == null ? 0 : xVar.f1923d) + (xVar == null ? 0 : xVar.f1922c) + (xVar == null ? 0 : xVar.f1921b) > 0) {
                if (viewGroupG.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupG.setTag(R.id.visible_removing_fragment_view_tag, zVar);
                }
                z zVar2 = (z) viewGroupG.getTag(R.id.visible_removing_fragment_view_tag);
                x xVar2 = zVar.K;
                boolean z3 = xVar2 != null ? xVar2.f1920a : false;
                if (zVar2.K == null) {
                    return;
                }
                zVar2.m().f1920a = z3;
            }
        }
    }

    public final HashSet f(ArrayList arrayList, int i4, int i10) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i4 < i10) {
            ArrayList arrayList2 = ((a) arrayList.get(i4)).f1710c;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                z zVar = ((c1) obj).f1755b;
                if (zVar != null && (viewGroup = zVar.G) != null) {
                    hashSet.add(n.i(viewGroup, this));
                }
            }
            i4++;
        }
        return hashSet;
    }

    public final b1 g(z zVar) {
        String str = zVar.f1934f;
        a0.x0 x0Var = this.f1879c;
        b1 b1Var = (b1) ((HashMap) x0Var.f145b).get(str);
        if (b1Var != null) {
            return b1Var;
        }
        b1 b1Var2 = new b1(this.f1890p, x0Var, zVar);
        b1Var2.m(this.f1898x.f1766b.getClassLoader());
        b1Var2.f1749e = this.f1897w;
        return b1Var2;
    }

    public final void g0() {
        ArrayList arrayListZ = this.f1879c.z();
        int size = arrayListZ.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListZ.get(i4);
            i4++;
            b1 b1Var = (b1) obj;
            z zVar = b1Var.f1747c;
            if (zVar.I) {
                if (this.f1878b) {
                    this.L = true;
                } else {
                    zVar.I = false;
                    b1Var.k();
                }
            }
        }
    }

    public final void h(z zVar) {
        if (K(2)) {
            Log.v("FragmentManager", "detach: " + zVar);
        }
        if (zVar.C) {
            return;
        }
        zVar.C = true;
        if (zVar.f1938l) {
            if (K(2)) {
                Log.v("FragmentManager", "remove from detach: " + zVar);
            }
            a0.x0 x0Var = this.f1879c;
            synchronized (((ArrayList) x0Var.f148e)) {
                ((ArrayList) x0Var.f148e).remove(zVar);
            }
            zVar.f1938l = false;
            if (L(zVar)) {
                this.H = true;
            }
            e0(zVar);
        }
    }

    public final void h0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new e1());
        d0 d0Var = this.f1898x;
        if (d0Var == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw illegalStateException;
            }
        }
        try {
            d0Var.f1769e.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e10) {
            Log.e("FragmentManager", "Failed dumping state", e10);
            throw illegalStateException;
        }
    }

    public final void i(boolean z3) {
        if (z3 && this.f1898x != null) {
            h0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (z zVar : this.f1879c.B()) {
            if (zVar != null) {
                zVar.F = true;
                if (z3) {
                    zVar.f1949w.i(true);
                }
            }
        }
    }

    public final void i0() {
        synchronized (this.f1877a) {
            try {
                int i4 = 0;
                if (!this.f1877a.isEmpty()) {
                    i0 i0Var = this.j;
                    i0Var.f1820a = true;
                    ArrayList arrayList = (ArrayList) i0Var.f1821b;
                    int size = arrayList.size();
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        ((d.y) obj).c(true);
                    }
                    if (K(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z3 = this.f1880d.size() + (this.f1883h != null ? 1 : 0) > 0 && O(this.f1900z);
                if (K(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z3);
                }
                i0 i0Var2 = this.j;
                i0Var2.f1820a = z3;
                ArrayList arrayList2 = (ArrayList) i0Var2.f1821b;
                int size2 = arrayList2.size();
                while (i4 < size2) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    ((d.y) obj2).c(z3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean j() {
        if (this.f1897w >= 1) {
            for (z zVar : this.f1879c.B()) {
                if (zVar != null) {
                    if (!zVar.B ? zVar.f1949w.j() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean k() {
        if (this.f1897w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (z zVar : this.f1879c.B()) {
            if (zVar != null && N(zVar)) {
                if (!zVar.B ? zVar.f1949w.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(zVar);
                    z3 = true;
                }
            }
        }
        if (this.f1881e != null) {
            for (int i4 = 0; i4 < this.f1881e.size(); i4++) {
                z zVar2 = (z) this.f1881e.get(i4);
                if (arrayList == null || !arrayList.contains(zVar2)) {
                    zVar2.getClass();
                }
            }
        }
        this.f1881e = arrayList;
        return z3;
    }

    public final void l() {
        boolean z3;
        this.K = true;
        z(true);
        w();
        d0 d0Var = this.f1898x;
        a0.x0 x0Var = this.f1879c;
        if (d0Var != null) {
            z3 = ((w0) x0Var.f147d).f1919f;
        } else {
            z3 = a0.g.C(d0Var.f1766b) ? !r1.isChangingConfigurations() : true;
        }
        int i4 = 0;
        if (z3) {
            Iterator it = this.f1886l.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((c) it.next()).f1750a;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((w0) x0Var.f147d).f((String) obj, false);
                }
            }
        }
        u(-1);
        d0 d0Var2 = this.f1898x;
        if (d0Var2 != null) {
            i.g gVar = d0Var2.f1769e;
            gVar.getClass();
            h0 h0Var = this.f1893s;
            nk.k.e(h0Var, "listener");
            gVar.f21611k.remove(h0Var);
        }
        d0 d0Var3 = this.f1898x;
        if (d0Var3 != null) {
            i.g gVar2 = d0Var3.f1769e;
            gVar2.getClass();
            h0 h0Var2 = this.f1892r;
            nk.k.e(h0Var2, "listener");
            gVar2.j.remove(h0Var2);
        }
        d0 d0Var4 = this.f1898x;
        if (d0Var4 != null) {
            i.g gVar3 = d0Var4.f1769e;
            gVar3.getClass();
            h0 h0Var3 = this.f1894t;
            nk.k.e(h0Var3, "listener");
            gVar3.f21613m.remove(h0Var3);
        }
        d0 d0Var5 = this.f1898x;
        if (d0Var5 != null) {
            i.g gVar4 = d0Var5.f1769e;
            gVar4.getClass();
            h0 h0Var4 = this.f1895u;
            nk.k.e(h0Var4, "listener");
            gVar4.f21614n.remove(h0Var4);
        }
        d0 d0Var6 = this.f1898x;
        if ((d0Var6 != null) && this.f1900z == null) {
            i.g gVar5 = d0Var6.f1769e;
            gVar5.getClass();
            j0 j0Var = this.f1896v;
            nk.k.e(j0Var, "provider");
            gVar5.f21605c.s(j0Var);
        }
        this.f1898x = null;
        this.f1899y = null;
        this.f1900z = null;
        if (this.g != null) {
            i0 i0Var = this.j;
            ArrayList arrayList2 = (ArrayList) i0Var.f1821b;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) i0Var.f1822c;
            Iterator it2 = copyOnWriteArrayList.iterator();
            nk.k.d(it2, "iterator(...)");
            while (it2.hasNext()) {
                AutoCloseable autoCloseable = (AutoCloseable) it2.next();
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    a3.a.k((ExecutorService) autoCloseable);
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                } else if (autoCloseable instanceof DrmManagerClient) {
                    ((DrmManagerClient) autoCloseable).release();
                } else {
                    if (!(autoCloseable instanceof ContentProviderClient)) {
                        throw new IllegalArgumentException();
                    }
                    ((ContentProviderClient) autoCloseable).release();
                }
            }
            copyOnWriteArrayList.clear();
            int size2 = arrayList2.size();
            while (i4 < size2) {
                Object obj2 = arrayList2.get(i4);
                i4++;
                ((d.y) obj2).b();
            }
            arrayList2.clear();
            this.g = null;
        }
        f.h hVar = this.D;
        if (hVar != null) {
            hVar.b();
            this.E.b();
            this.F.b();
        }
    }

    public final void m(boolean z3) {
        if (z3 && this.f1898x != null) {
            h0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (z zVar : this.f1879c.B()) {
            if (zVar != null) {
                zVar.F = true;
                if (z3) {
                    zVar.f1949w.m(true);
                }
            }
        }
    }

    public final void n(boolean z3) {
        if (z3 && this.f1898x != null) {
            h0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (z zVar : this.f1879c.B()) {
            if (zVar != null && z3) {
                zVar.f1949w.n(true);
            }
        }
    }

    public final void o() {
        ArrayList arrayListA = this.f1879c.A();
        int size = arrayListA.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListA.get(i4);
            i4++;
            z zVar = (z) obj;
            if (zVar != null) {
                zVar.z();
                zVar.f1949w.o();
            }
        }
    }

    public final boolean p() {
        if (this.f1897w >= 1) {
            for (z zVar : this.f1879c.B()) {
                if (zVar != null) {
                    if (!zVar.B ? zVar.f1949w.p() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.f1897w < 1) {
            return;
        }
        for (z zVar : this.f1879c.B()) {
            if (zVar != null && !zVar.B) {
                zVar.f1949w.q();
            }
        }
    }

    public final void r(z zVar) {
        if (zVar != null) {
            if (zVar.equals(this.f1879c.v(zVar.f1934f))) {
                zVar.f1947u.getClass();
                boolean zO = O(zVar);
                Boolean bool = zVar.f1937k;
                if (bool == null || bool.booleanValue() != zO) {
                    zVar.f1937k = Boolean.valueOf(zO);
                    u0 u0Var = zVar.f1949w;
                    u0Var.i0();
                    u0Var.r(u0Var.A);
                }
            }
        }
    }

    public final void s(boolean z3) {
        if (z3 && this.f1898x != null) {
            h0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (z zVar : this.f1879c.B()) {
            if (zVar != null && z3) {
                zVar.f1949w.s(true);
            }
        }
    }

    public final boolean t() {
        if (this.f1897w < 1) {
            return false;
        }
        boolean z3 = false;
        for (z zVar : this.f1879c.B()) {
            if (zVar != null && N(zVar)) {
                if (!zVar.B ? zVar.f1949w.t() : false) {
                    z3 = true;
                }
            }
        }
        return z3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        z zVar = this.f1900z;
        if (zVar != null) {
            sb2.append(zVar.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f1900z)));
            sb2.append("}");
        } else {
            d0 d0Var = this.f1898x;
            if (d0Var != null) {
                sb2.append(d0Var.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f1898x)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(int i4) {
        try {
            this.f1878b = true;
            for (b1 b1Var : ((HashMap) this.f1879c.f145b).values()) {
                if (b1Var != null) {
                    b1Var.f1749e = i4;
                }
            }
            Q(i4, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((n) it.next()).h();
            }
            this.f1878b = false;
            z(true);
        } catch (Throwable th2) {
            this.f1878b = false;
            throw th2;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strS = d.h.s(str, "    ");
        a0.x0 x0Var = this.f1879c;
        ArrayList arrayList = (ArrayList) x0Var.f148e;
        String strS2 = d.h.s(str, "    ");
        HashMap map = (HashMap) x0Var.f145b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (b1 b1Var : map.values()) {
                printWriter.print(str);
                if (b1Var != null) {
                    z zVar = b1Var.f1747c;
                    printWriter.println(zVar);
                    zVar.l(strS2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i4 = 0; i4 < size2; i4++) {
                z zVar2 = (z) arrayList.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(zVar2.toString());
            }
        }
        ArrayList arrayList2 = this.f1881e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                z zVar3 = (z) this.f1881e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(zVar3.toString());
            }
        }
        int size3 = this.f1880d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size3; i11++) {
                a aVar = (a) this.f1880d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.i(strS, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1885k.get());
        synchronized (this.f1877a) {
            try {
                int size4 = this.f1877a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size4; i12++) {
                        Object obj = (r0) this.f1877a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
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
        printWriter.println(this.f1898x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1899y);
        if (this.f1900z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1900z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1897w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((n) it.next()).h();
        }
    }

    public final void x(r0 r0Var, boolean z3) {
        if (!z3) {
            if (this.f1898x == null) {
                if (!this.K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (P()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1877a) {
            try {
                if (this.f1898x == null) {
                    if (!z3) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1877a.add(r0Var);
                    Z();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void y(boolean z3) {
        if (this.f1878b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1898x == null) {
            if (!this.K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1898x.f1767c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z3 && P()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.M == null) {
            this.M = new ArrayList();
            this.N = new ArrayList();
        }
    }

    public final boolean z(boolean z3) {
        boolean zA;
        a aVar;
        y(z3);
        if (!this.f1884i && (aVar = this.f1883h) != null) {
            aVar.f1725t = false;
            aVar.d();
            if (K(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f1883h + " as part of execPendingActions for actions " + this.f1877a);
            }
            this.f1883h.f(false, false);
            this.f1877a.add(0, this.f1883h);
            ArrayList arrayList = this.f1883h.f1710c;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                z zVar = ((c1) obj).f1755b;
                if (zVar != null) {
                    zVar.f1940n = false;
                }
            }
            this.f1883h = null;
        }
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.M;
            ArrayList arrayList3 = this.N;
            synchronized (this.f1877a) {
                if (this.f1877a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size2 = this.f1877a.size();
                        zA = false;
                        for (int i10 = 0; i10 < size2; i10++) {
                            zA |= ((r0) this.f1877a.get(i10)).a(arrayList2, arrayList3);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                break;
            }
            z10 = true;
            this.f1878b = true;
            try {
                W(this.M, this.N);
            } finally {
                d();
            }
        }
        i0();
        if (this.L) {
            this.L = false;
            g0();
        }
        ((HashMap) this.f1879c.f145b).values().removeAll(Collections.singleton(null));
        return z10;
    }
}
