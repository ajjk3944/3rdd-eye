package k0;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.C0300w;
import androidx.lifecycle.EnumC0292n;
import androidx.lifecycle.a0;
import b4.C0344i;
import c.C0368H;
import c.C0370J;
import c.C0371K;
import c.C0372L;
import c.C0387l;
import c.InterfaceC0378c;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.gms.internal.ads.C2228zK;
import e.C2291h;
import f.C2314a;
import h.AbstractActivityC2349g;
import h0.C2351a;
import h0.C2352b;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l0.AbstractC2632d;
import n0.C2679a;
import o4.AbstractC2763b;
import p0.C2769a;
import u.C2941j;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: A, reason: collision with root package name */
    public C2291h f21490A;

    /* renamed from: B, reason: collision with root package name */
    public C2291h f21491B;

    /* renamed from: C, reason: collision with root package name */
    public C2291h f21492C;

    /* renamed from: D, reason: collision with root package name */
    public ArrayDeque f21493D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f21494E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f21495F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f21496G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f21497H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f21498I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f21499J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f21500K;

    /* renamed from: L, reason: collision with root package name */
    public ArrayList f21501L;
    public M M;

    /* renamed from: N, reason: collision with root package name */
    public final C0.k f21502N;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21504b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f21506d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f21507e;

    /* renamed from: g, reason: collision with root package name */
    public C0371K f21509g;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f21513l;

    /* renamed from: m, reason: collision with root package name */
    public final C2351a f21514m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f21515n;

    /* renamed from: o, reason: collision with root package name */
    public final C f21516o;

    /* renamed from: p, reason: collision with root package name */
    public final C f21517p;

    /* renamed from: q, reason: collision with root package name */
    public final C f21518q;

    /* renamed from: r, reason: collision with root package name */
    public final C f21519r;

    /* renamed from: s, reason: collision with root package name */
    public final D f21520s;

    /* renamed from: t, reason: collision with root package name */
    public int f21521t;

    /* renamed from: u, reason: collision with root package name */
    public x f21522u;

    /* renamed from: v, reason: collision with root package name */
    public I5.b f21523v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC2617v f21524w;

    /* renamed from: x, reason: collision with root package name */
    public AbstractComponentCallbacksC2617v f21525x;

    /* renamed from: y, reason: collision with root package name */
    public final E f21526y;

    /* renamed from: z, reason: collision with root package name */
    public final C0344i f21527z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21503a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final c1.g f21505c = new c1.g(20);

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflaterFactory2C2596A f21508f = new LayoutInflaterFactory2C2596A(this);

    /* renamed from: h, reason: collision with root package name */
    public final C0372L f21510h = new C0372L(1, this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f21511j = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f21512k = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [k0.C] */
    /* JADX WARN: Type inference failed for: r0v13, types: [k0.C] */
    /* JADX WARN: Type inference failed for: r0v14, types: [k0.C] */
    /* JADX WARN: Type inference failed for: r0v15, types: [k0.C] */
    public K() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.f21514m = new C2351a(this);
        this.f21515n = new CopyOnWriteArrayList();
        final int i = 0;
        this.f21516o = new Q.a(this) { // from class: k0.C

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ K f21477b;

            {
                this.f21477b = this;
            }

            @Override // Q.a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        K k6 = this.f21477b;
                        if (k6.J()) {
                            k6.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        K k7 = this.f21477b;
                        if (k7.J() && num.intValue() == 80) {
                            k7.l(false);
                            break;
                        }
                        break;
                    case 2:
                        G.f fVar = (G.f) obj;
                        K k8 = this.f21477b;
                        if (k8.J()) {
                            boolean z6 = fVar.f1477a;
                            k8.m(false);
                            break;
                        }
                        break;
                    default:
                        G.s sVar = (G.s) obj;
                        K k9 = this.f21477b;
                        if (k9.J()) {
                            boolean z7 = sVar.f1508a;
                            k9.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 1;
        this.f21517p = new Q.a(this) { // from class: k0.C

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ K f21477b;

            {
                this.f21477b = this;
            }

            @Override // Q.a
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        K k6 = this.f21477b;
                        if (k6.J()) {
                            k6.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        K k7 = this.f21477b;
                        if (k7.J() && num.intValue() == 80) {
                            k7.l(false);
                            break;
                        }
                        break;
                    case 2:
                        G.f fVar = (G.f) obj;
                        K k8 = this.f21477b;
                        if (k8.J()) {
                            boolean z6 = fVar.f1477a;
                            k8.m(false);
                            break;
                        }
                        break;
                    default:
                        G.s sVar = (G.s) obj;
                        K k9 = this.f21477b;
                        if (k9.J()) {
                            boolean z7 = sVar.f1508a;
                            k9.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i6 = 2;
        this.f21518q = new Q.a(this) { // from class: k0.C

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ K f21477b;

            {
                this.f21477b = this;
            }

            @Override // Q.a
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        K k6 = this.f21477b;
                        if (k6.J()) {
                            k6.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        K k7 = this.f21477b;
                        if (k7.J() && num.intValue() == 80) {
                            k7.l(false);
                            break;
                        }
                        break;
                    case 2:
                        G.f fVar = (G.f) obj;
                        K k8 = this.f21477b;
                        if (k8.J()) {
                            boolean z6 = fVar.f1477a;
                            k8.m(false);
                            break;
                        }
                        break;
                    default:
                        G.s sVar = (G.s) obj;
                        K k9 = this.f21477b;
                        if (k9.J()) {
                            boolean z7 = sVar.f1508a;
                            k9.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i7 = 3;
        this.f21519r = new Q.a(this) { // from class: k0.C

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ K f21477b;

            {
                this.f21477b = this;
            }

            @Override // Q.a
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        K k6 = this.f21477b;
                        if (k6.J()) {
                            k6.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        K k7 = this.f21477b;
                        if (k7.J() && num.intValue() == 80) {
                            k7.l(false);
                            break;
                        }
                        break;
                    case 2:
                        G.f fVar = (G.f) obj;
                        K k8 = this.f21477b;
                        if (k8.J()) {
                            boolean z6 = fVar.f1477a;
                            k8.m(false);
                            break;
                        }
                        break;
                    default:
                        G.s sVar = (G.s) obj;
                        K k9 = this.f21477b;
                        if (k9.J()) {
                            boolean z7 = sVar.f1508a;
                            k9.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f21520s = new D(this);
        this.f21521t = -1;
        this.f21526y = new E(this);
        this.f21527z = new C0344i(19);
        this.f21493D = new ArrayDeque();
        this.f21502N = new C0.k(27, this);
    }

    public static boolean H(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean I(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        abstractComponentCallbacksC2617v.getClass();
        ArrayList arrayListR = abstractComponentCallbacksC2617v.f21686I.f21505c.r();
        int size = arrayListR.size();
        boolean zI = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayListR.get(i);
            i++;
            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v2 = (AbstractComponentCallbacksC2617v) obj;
            if (abstractComponentCallbacksC2617v2 != null) {
                zI = I(abstractComponentCallbacksC2617v2);
            }
            if (zI) {
                return true;
            }
        }
        return false;
    }

    public static boolean K(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        if (abstractComponentCallbacksC2617v == null) {
            return true;
        }
        if (abstractComponentCallbacksC2617v.f21693Q) {
            return abstractComponentCallbacksC2617v.f21684G == null || K(abstractComponentCallbacksC2617v.f21687J);
        }
        return false;
    }

    public static boolean L(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        if (abstractComponentCallbacksC2617v == null) {
            return true;
        }
        K k6 = abstractComponentCallbacksC2617v.f21684G;
        return abstractComponentCallbacksC2617v.equals(k6.f21525x) && L(k6.f21524w);
    }

    public static void b0(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        if (H(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC2617v);
        }
        if (abstractComponentCallbacksC2617v.f21690N) {
            abstractComponentCallbacksC2617v.f21690N = false;
            abstractComponentCallbacksC2617v.f21700X = !abstractComponentCallbacksC2617v.f21700X;
        }
    }

    public final int A(String str, int i, boolean z6) {
        ArrayList arrayList = this.f21506d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z6) {
                return 0;
            }
            return this.f21506d.size() - 1;
        }
        int size = this.f21506d.size() - 1;
        while (size >= 0) {
            C2597a c2597a = (C2597a) this.f21506d.get(size);
            if ((str != null && str.equals(c2597a.i)) || (i >= 0 && i == c2597a.f21603s)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z6) {
            if (size == this.f21506d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C2597a c2597a2 = (C2597a) this.f21506d.get(size - 1);
            if ((str == null || !str.equals(c2597a2.i)) && (i < 0 || i != c2597a2.f21603s)) {
                break;
            }
            size--;
        }
        return size;
    }

    public final AbstractComponentCallbacksC2617v B(int i) {
        c1.g gVar = this.f21505c;
        ArrayList arrayList = (ArrayList) gVar.f5896b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = (AbstractComponentCallbacksC2617v) arrayList.get(size);
            if (abstractComponentCallbacksC2617v != null && abstractComponentCallbacksC2617v.f21688K == i) {
                return abstractComponentCallbacksC2617v;
            }
        }
        for (P p6 : ((HashMap) gVar.f5897c).values()) {
            if (p6 != null) {
                AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v2 = p6.f21558c;
                if (abstractComponentCallbacksC2617v2.f21688K == i) {
                    return abstractComponentCallbacksC2617v2;
                }
            }
        }
        return null;
    }

    public final AbstractComponentCallbacksC2617v C(String str) {
        c1.g gVar = this.f21505c;
        ArrayList arrayList = (ArrayList) gVar.f5896b;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = (AbstractComponentCallbacksC2617v) arrayList.get(size);
                if (abstractComponentCallbacksC2617v != null && str.equals(abstractComponentCallbacksC2617v.M)) {
                    return abstractComponentCallbacksC2617v;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (P p6 : ((HashMap) gVar.f5897c).values()) {
            if (p6 != null) {
                AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v2 = p6.f21558c;
                if (str.equals(abstractComponentCallbacksC2617v2.M)) {
                    return abstractComponentCallbacksC2617v2;
                }
            }
        }
        return null;
    }

    public final ViewGroup D(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        ViewGroup viewGroup = abstractComponentCallbacksC2617v.f21695S;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC2617v.f21689L <= 0 || !this.f21523v.v()) {
            return null;
        }
        View viewU = this.f21523v.u(abstractComponentCallbacksC2617v.f21689L);
        if (viewU instanceof ViewGroup) {
            return (ViewGroup) viewU;
        }
        return null;
    }

    public final E E() {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21524w;
        return abstractComponentCallbacksC2617v != null ? abstractComponentCallbacksC2617v.f21684G.E() : this.f21526y;
    }

    public final C0344i F() {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21524w;
        return abstractComponentCallbacksC2617v != null ? abstractComponentCallbacksC2617v.f21684G.F() : this.f21527z;
    }

    public final void G(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        if (H(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC2617v);
        }
        if (abstractComponentCallbacksC2617v.f21690N) {
            return;
        }
        abstractComponentCallbacksC2617v.f21690N = true;
        abstractComponentCallbacksC2617v.f21700X = true ^ abstractComponentCallbacksC2617v.f21700X;
        a0(abstractComponentCallbacksC2617v);
    }

    public final boolean J() {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21524w;
        if (abstractComponentCallbacksC2617v == null) {
            return true;
        }
        return abstractComponentCallbacksC2617v.v() && this.f21524w.p().J();
    }

    public final boolean M() {
        return this.f21495F || this.f21496G;
    }

    public final void N(int i, boolean z6) {
        x xVar;
        if (this.f21522u == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z6 || i != this.f21521t) {
            this.f21521t = i;
            c1.g gVar = this.f21505c;
            HashMap map = (HashMap) gVar.f5897c;
            ArrayList arrayList = (ArrayList) gVar.f5896b;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                P p6 = (P) map.get(((AbstractComponentCallbacksC2617v) obj).f21710e);
                if (p6 != null) {
                    p6.k();
                }
            }
            for (P p7 : map.values()) {
                if (p7 != null) {
                    p7.k();
                    AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = p7.f21558c;
                    if (abstractComponentCallbacksC2617v.f21721l && !abstractComponentCallbacksC2617v.x()) {
                        if (abstractComponentCallbacksC2617v.f21722m && !((HashMap) gVar.f5898d).containsKey(abstractComponentCallbacksC2617v.f21710e)) {
                            gVar.F(abstractComponentCallbacksC2617v.f21710e, p7.o());
                        }
                        gVar.x(p7);
                    }
                }
            }
            c0();
            if (this.f21494E && (xVar = this.f21522u) != null && this.f21521t == 7) {
                xVar.f21729m.invalidateOptionsMenu();
                this.f21494E = false;
            }
        }
    }

    public final void O() {
        if (this.f21522u == null) {
            return;
        }
        this.f21495F = false;
        this.f21496G = false;
        this.M.f21542g = false;
        for (AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v : this.f21505c.s()) {
            if (abstractComponentCallbacksC2617v != null) {
                abstractComponentCallbacksC2617v.f21686I.O();
            }
        }
    }

    public final boolean P() {
        return Q(-1, 0);
    }

    public final boolean Q(int i, int i3) {
        x(false);
        w(true);
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21525x;
        if (abstractComponentCallbacksC2617v != null && i < 0 && abstractComponentCallbacksC2617v.l().P()) {
            return true;
        }
        boolean zR = R(this.f21499J, this.f21500K, null, i, i3);
        if (zR) {
            this.f21504b = true;
            try {
                T(this.f21499J, this.f21500K);
            } finally {
                d();
            }
        }
        e0();
        if (this.f21498I) {
            this.f21498I = false;
            c0();
        }
        ((HashMap) this.f21505c.f5897c).values().removeAll(Collections.singleton(null));
        return zR;
    }

    public final boolean R(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i3) {
        int iA = A(str, i, (i3 & 1) != 0);
        if (iA < 0) {
            return false;
        }
        for (int size = this.f21506d.size() - 1; size >= iA; size--) {
            arrayList.add((C2597a) this.f21506d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void S(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        if (H(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC2617v + " nesting=" + abstractComponentCallbacksC2617v.f21683F);
        }
        boolean zX = abstractComponentCallbacksC2617v.x();
        if (abstractComponentCallbacksC2617v.f21691O && zX) {
            return;
        }
        c1.g gVar = this.f21505c;
        synchronized (((ArrayList) gVar.f5896b)) {
            ((ArrayList) gVar.f5896b).remove(abstractComponentCallbacksC2617v);
        }
        abstractComponentCallbacksC2617v.f21720k = false;
        if (I(abstractComponentCallbacksC2617v)) {
            this.f21494E = true;
        }
        abstractComponentCallbacksC2617v.f21721l = true;
        a0(abstractComponentCallbacksC2617v);
    }

    public final void T(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i3 = 0;
        while (i < size) {
            if (!((C2597a) arrayList.get(i)).f21600p) {
                if (i3 != i) {
                    z(arrayList, arrayList2, i3, i);
                }
                i3 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((C2597a) arrayList.get(i3)).f21600p) {
                        i3++;
                    }
                }
                z(arrayList, arrayList2, i, i3);
                i = i3 - 1;
            }
            i++;
        }
        if (i3 != size) {
            z(arrayList, arrayList2, i3, size);
        }
    }

    public final void U(Bundle bundle) {
        C2351a c2351a;
        int i;
        Bundle bundle2;
        P p6;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.f21522u.f21726j.getClassLoader());
                this.f21512k.put(str.substring(7), bundle4);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.f21522u.f21726j.getClassLoader());
                map.put(str2.substring(9), bundle3);
            }
        }
        c1.g gVar = this.f21505c;
        HashMap map2 = (HashMap) gVar.f5898d;
        HashMap map3 = (HashMap) gVar.f5897c;
        map2.clear();
        map2.putAll(map);
        L l2 = (L) bundle.getParcelable("state");
        if (l2 == null) {
            return;
        }
        map3.clear();
        ArrayList arrayList = l2.f21528a;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            c2351a = this.f21514m;
            if (i3 >= size) {
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            Bundle bundleF = gVar.F((String) obj, null);
            if (bundleF != null) {
                AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = (AbstractComponentCallbacksC2617v) this.M.f21537b.get(((O) bundleF.getParcelable("state")).f21544b);
                if (abstractComponentCallbacksC2617v != null) {
                    if (H(2)) {
                        i = 2;
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC2617v);
                    } else {
                        i = 2;
                    }
                    p6 = new P(c2351a, gVar, abstractComponentCallbacksC2617v, bundleF);
                    bundle2 = bundleF;
                } else {
                    i = 2;
                    bundle2 = bundleF;
                    p6 = new P(this.f21514m, this.f21505c, this.f21522u.f21726j.getClassLoader(), E(), bundleF);
                }
                AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v2 = p6.f21558c;
                abstractComponentCallbacksC2617v2.f21705b = bundle2;
                abstractComponentCallbacksC2617v2.f21684G = this;
                if (H(i)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC2617v2.f21710e + "): " + abstractComponentCallbacksC2617v2);
                }
                p6.m(this.f21522u.f21726j.getClassLoader());
                gVar.w(p6);
                p6.f21560e = this.f21521t;
            }
        }
        M m6 = this.M;
        m6.getClass();
        ArrayList arrayList2 = new ArrayList(m6.f21537b.values());
        int size2 = arrayList2.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayList2.get(i6);
            i6++;
            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v3 = (AbstractComponentCallbacksC2617v) obj2;
            if (map3.get(abstractComponentCallbacksC2617v3.f21710e) == null) {
                if (H(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC2617v3 + " that was not found in the set of active Fragments " + l2.f21528a);
                }
                this.M.g(abstractComponentCallbacksC2617v3);
                abstractComponentCallbacksC2617v3.f21684G = this;
                P p7 = new P(c2351a, gVar, abstractComponentCallbacksC2617v3);
                p7.f21560e = 1;
                p7.k();
                abstractComponentCallbacksC2617v3.f21721l = true;
                p7.k();
            }
        }
        ArrayList arrayList3 = l2.f21529b;
        ((ArrayList) gVar.f5896b).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i7 = 0;
            while (i7 < size3) {
                Object obj3 = arrayList3.get(i7);
                i7++;
                String str3 = (String) obj3;
                AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617vM = gVar.m(str3);
                if (abstractComponentCallbacksC2617vM == null) {
                    throw new IllegalStateException(A.f.m("No instantiated fragment for (", str3, ")"));
                }
                if (H(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + abstractComponentCallbacksC2617vM);
                }
                gVar.e(abstractComponentCallbacksC2617vM);
            }
        }
        if (l2.f21530c != null) {
            this.f21506d = new ArrayList(l2.f21530c.length);
            int i8 = 0;
            while (true) {
                C2598b[] c2598bArr = l2.f21530c;
                if (i8 >= c2598bArr.length) {
                    break;
                }
                C2598b c2598b = c2598bArr[i8];
                ArrayList arrayList4 = c2598b.f21606b;
                C2597a c2597a = new C2597a(this);
                c2598b.a(c2597a);
                c2597a.f21603s = c2598b.f21611g;
                for (int i9 = 0; i9 < arrayList4.size(); i9++) {
                    String str4 = (String) arrayList4.get(i9);
                    if (str4 != null) {
                        ((Q) c2597a.f21586a.get(i9)).f21562b = gVar.m(str4);
                    }
                }
                c2597a.c(1);
                if (H(2)) {
                    StringBuilder sbP = AbstractC1135f5.p(i8, "restoreAllState: back stack #", " (index ");
                    sbP.append(c2597a.f21603s);
                    sbP.append("): ");
                    sbP.append(c2597a);
                    Log.v("FragmentManager", sbP.toString());
                    PrintWriter printWriter = new PrintWriter(new C2228zK());
                    c2597a.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.f21506d.add(c2597a);
                i8++;
            }
        } else {
            this.f21506d = null;
        }
        this.i.set(l2.f21531d);
        String str5 = l2.f21532e;
        if (str5 != null) {
            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617vM2 = gVar.m(str5);
            this.f21525x = abstractComponentCallbacksC2617vM2;
            q(abstractComponentCallbacksC2617vM2);
        }
        ArrayList arrayList5 = l2.f21533f;
        if (arrayList5 != null) {
            for (int i10 = 0; i10 < arrayList5.size(); i10++) {
                this.f21511j.put((String) arrayList5.get(i10), (C2599c) l2.f21534g.get(i10));
            }
        }
        this.f21493D = new ArrayDeque(l2.f21535h);
    }

    public final Bundle V() {
        int i;
        ArrayList arrayList;
        C2598b[] c2598bArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2605i c2605i = (C2605i) it.next();
            if (c2605i.f21640e) {
                if (H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c2605i.f21640e = false;
                c2605i.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C2605i) it2.next()).e();
        }
        x(true);
        this.f21495F = true;
        this.M.f21542g = true;
        c1.g gVar = this.f21505c;
        gVar.getClass();
        HashMap map = (HashMap) gVar.f5897c;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (P p6 : map.values()) {
            if (p6 != null) {
                AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = p6.f21558c;
                gVar.F(abstractComponentCallbacksC2617v.f21710e, p6.o());
                arrayList2.add(abstractComponentCallbacksC2617v.f21710e);
                if (H(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC2617v + ": " + abstractComponentCallbacksC2617v.f21705b);
                }
            }
        }
        HashMap map2 = (HashMap) this.f21505c.f5898d;
        if (!map2.isEmpty()) {
            c1.g gVar2 = this.f21505c;
            synchronized (((ArrayList) gVar2.f5896b)) {
                try {
                    if (((ArrayList) gVar2.f5896b).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) gVar2.f5896b).size());
                        ArrayList arrayList3 = (ArrayList) gVar2.f5896b;
                        int size2 = arrayList3.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj = arrayList3.get(i3);
                            i3++;
                            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v2 = (AbstractComponentCallbacksC2617v) obj;
                            arrayList.add(abstractComponentCallbacksC2617v2.f21710e);
                            if (H(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC2617v2.f21710e + "): " + abstractComponentCallbacksC2617v2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList4 = this.f21506d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                c2598bArr = null;
            } else {
                c2598bArr = new C2598b[size];
                for (i = 0; i < size; i++) {
                    c2598bArr[i] = new C2598b((C2597a) this.f21506d.get(i));
                    if (H(2)) {
                        StringBuilder sbP = AbstractC1135f5.p(i, "saveAllState: adding back stack #", ": ");
                        sbP.append(this.f21506d.get(i));
                        Log.v("FragmentManager", sbP.toString());
                    }
                }
            }
            L l2 = new L();
            l2.f21532e = null;
            ArrayList arrayList5 = new ArrayList();
            l2.f21533f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            l2.f21534g = arrayList6;
            l2.f21528a = arrayList2;
            l2.f21529b = arrayList;
            l2.f21530c = c2598bArr;
            l2.f21531d = this.i.get();
            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v3 = this.f21525x;
            if (abstractComponentCallbacksC2617v3 != null) {
                l2.f21532e = abstractComponentCallbacksC2617v3.f21710e;
            }
            arrayList5.addAll(this.f21511j.keySet());
            arrayList6.addAll(this.f21511j.values());
            l2.f21535h = new ArrayList(this.f21493D);
            bundle.putParcelable("state", l2);
            for (String str : this.f21512k.keySet()) {
                bundle.putBundle(A.f.l("result_", str), (Bundle) this.f21512k.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(A.f.l("fragment_", str2), (Bundle) map2.get(str2));
            }
        } else if (H(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void W() {
        synchronized (this.f21503a) {
            try {
                if (this.f21503a.size() == 1) {
                    this.f21522u.f21727k.removeCallbacks(this.f21502N);
                    this.f21522u.f21727k.post(this.f21502N);
                    e0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void X(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v, boolean z6) {
        ViewGroup viewGroupD = D(abstractComponentCallbacksC2617v);
        if (viewGroupD == null || !(viewGroupD instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupD).setDrawDisappearingViewsLast(!z6);
    }

    public final void Y(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v, EnumC0292n enumC0292n) {
        if (abstractComponentCallbacksC2617v.equals(this.f21505c.m(abstractComponentCallbacksC2617v.f21710e)) && (abstractComponentCallbacksC2617v.f21685H == null || abstractComponentCallbacksC2617v.f21684G == this)) {
            abstractComponentCallbacksC2617v.f21704a0 = enumC0292n;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC2617v + " is not an active fragment of FragmentManager " + this);
    }

    public final void Z(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        if (abstractComponentCallbacksC2617v != null) {
            if (!abstractComponentCallbacksC2617v.equals(this.f21505c.m(abstractComponentCallbacksC2617v.f21710e)) || (abstractComponentCallbacksC2617v.f21685H != null && abstractComponentCallbacksC2617v.f21684G != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC2617v + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v2 = this.f21525x;
        this.f21525x = abstractComponentCallbacksC2617v;
        q(abstractComponentCallbacksC2617v2);
        q(this.f21525x);
    }

    public final P a(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        String str = abstractComponentCallbacksC2617v.f21702Z;
        if (str != null) {
            AbstractC2632d.c(abstractComponentCallbacksC2617v, str);
        }
        if (H(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC2617v);
        }
        P pF = f(abstractComponentCallbacksC2617v);
        abstractComponentCallbacksC2617v.f21684G = this;
        c1.g gVar = this.f21505c;
        gVar.w(pF);
        if (!abstractComponentCallbacksC2617v.f21691O) {
            gVar.e(abstractComponentCallbacksC2617v);
            abstractComponentCallbacksC2617v.f21721l = false;
            if (abstractComponentCallbacksC2617v.f21696T == null) {
                abstractComponentCallbacksC2617v.f21700X = false;
            }
            if (I(abstractComponentCallbacksC2617v)) {
                this.f21494E = true;
            }
        }
        return pF;
    }

    public final void a0(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        ViewGroup viewGroupD = D(abstractComponentCallbacksC2617v);
        if (viewGroupD != null) {
            C2614s c2614s = abstractComponentCallbacksC2617v.f21699W;
            if ((c2614s == null ? 0 : c2614s.f21672e) + (c2614s == null ? 0 : c2614s.f21671d) + (c2614s == null ? 0 : c2614s.f21670c) + (c2614s == null ? 0 : c2614s.f21669b) > 0) {
                if (viewGroupD.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupD.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC2617v);
                }
                AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v2 = (AbstractComponentCallbacksC2617v) viewGroupD.getTag(R.id.visible_removing_fragment_view_tag);
                C2614s c2614s2 = abstractComponentCallbacksC2617v.f21699W;
                boolean z6 = c2614s2 != null ? c2614s2.f21668a : false;
                if (abstractComponentCallbacksC2617v2.f21699W == null) {
                    return;
                }
                abstractComponentCallbacksC2617v2.g().f21668a = z6;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(x xVar, I5.b bVar, AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        if (this.f21522u != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f21522u = xVar;
        this.f21523v = bVar;
        this.f21524w = abstractComponentCallbacksC2617v;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f21515n;
        if (abstractComponentCallbacksC2617v != 0) {
            copyOnWriteArrayList.add(new F(abstractComponentCallbacksC2617v));
        } else if (xVar != null) {
            copyOnWriteArrayList.add(xVar);
        }
        if (this.f21524w != null) {
            e0();
        }
        if (xVar != null) {
            C0371K c0371kO = xVar.f21729m.o();
            this.f21509g = c0371kO;
            x xVar2 = abstractComponentCallbacksC2617v != 0 ? abstractComponentCallbacksC2617v : xVar;
            c0371kO.getClass();
            C0372L c0372l = this.f21510h;
            q5.i.e(c0372l, "onBackPressedCallback");
            C0300w c0300wJ = xVar2.j();
            if (c0300wJ.f5259d != EnumC0292n.f5243a) {
                c0372l.f5810b.add(new C0368H(c0371kO, c0300wJ, c0372l));
                c0371kO.e();
                c0372l.f5811c = new C0370J(0, c0371kO, C0371K.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 0);
            }
        }
        if (abstractComponentCallbacksC2617v != 0) {
            M m6 = abstractComponentCallbacksC2617v.f21684G.M;
            HashMap map = m6.f21538c;
            M m7 = (M) map.get(abstractComponentCallbacksC2617v.f21710e);
            if (m7 == null) {
                m7 = new M(m6.f21540e);
                map.put(abstractComponentCallbacksC2617v.f21710e, m7);
            }
            this.M = m7;
        } else if (xVar != null) {
            a0 a0VarD = xVar.f21729m.d();
            C2679a c2679a = C2679a.f22142b;
            q5.i.e(c2679a, "defaultCreationExtras");
            V2.e eVar = new V2.e(a0VarD, M.f21536h, c2679a);
            q5.d dVarA = q5.p.a(M.class);
            String strS = com.bumptech.glide.d.s(dVarA);
            if (strS == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.M = (M) eVar.q(dVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strS));
        } else {
            this.M = new M(false);
        }
        this.M.f21542g = M();
        this.f21505c.f5899e = this.M;
        x xVar3 = this.f21522u;
        if (xVar3 != null && abstractComponentCallbacksC2617v == 0) {
            F0.f fVarF = xVar3.f();
            fVarF.f("android:support:fragments", new androidx.lifecycle.M(1, this));
            Bundle bundleC = fVarF.c("android:support:fragments");
            if (bundleC != null) {
                U(bundleC);
            }
        }
        x xVar4 = this.f21522u;
        if (xVar4 != null) {
            C0387l c0387l = xVar4.f21729m.i;
            String strL = A.f.l("FragmentManager:", abstractComponentCallbacksC2617v != 0 ? A.f.p(new StringBuilder(), abstractComponentCallbacksC2617v.f21710e, ":") : "");
            this.f21490A = c0387l.c(AbstractC2763b.e(strL, "StartActivityForResult"), new C2314a(3), new C2352b(4, this));
            this.f21491B = c0387l.c(AbstractC2763b.e(strL, "StartIntentSenderForResult"), new C2314a(5), new d4.h(7, this));
            this.f21492C = c0387l.c(AbstractC2763b.e(strL, "RequestPermissions"), new C2314a(1), new h2.d(this));
        }
        x xVar5 = this.f21522u;
        if (xVar5 != null) {
            xVar5.f21729m.l(this.f21516o);
        }
        x xVar6 = this.f21522u;
        if (xVar6 != null) {
            AbstractActivityC2349g abstractActivityC2349g = xVar6.f21729m;
            abstractActivityC2349g.getClass();
            C c6 = this.f21517p;
            q5.i.e(c6, "listener");
            abstractActivityC2349g.f5863k.add(c6);
        }
        x xVar7 = this.f21522u;
        if (xVar7 != null) {
            AbstractActivityC2349g abstractActivityC2349g2 = xVar7.f21729m;
            abstractActivityC2349g2.getClass();
            C c7 = this.f21518q;
            q5.i.e(c7, "listener");
            abstractActivityC2349g2.f5865m.add(c7);
        }
        x xVar8 = this.f21522u;
        if (xVar8 != null) {
            AbstractActivityC2349g abstractActivityC2349g3 = xVar8.f21729m;
            abstractActivityC2349g3.getClass();
            C c8 = this.f21519r;
            q5.i.e(c8, "listener");
            abstractActivityC2349g3.f5866n.add(c8);
        }
        x xVar9 = this.f21522u;
        if (xVar9 == null || abstractComponentCallbacksC2617v != 0) {
            return;
        }
        AbstractActivityC2349g abstractActivityC2349g4 = xVar9.f21729m;
        abstractActivityC2349g4.getClass();
        D d6 = this.f21520s;
        q5.i.e(d6, "provider");
        V2.e eVar2 = abstractActivityC2349g4.f5856c;
        ((CopyOnWriteArrayList) eVar2.f3869c).add(d6);
        ((Runnable) eVar2.f3868b).run();
    }

    public final void c(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        if (H(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC2617v);
        }
        if (abstractComponentCallbacksC2617v.f21691O) {
            abstractComponentCallbacksC2617v.f21691O = false;
            if (abstractComponentCallbacksC2617v.f21720k) {
                return;
            }
            this.f21505c.e(abstractComponentCallbacksC2617v);
            if (H(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC2617v);
            }
            if (I(abstractComponentCallbacksC2617v)) {
                this.f21494E = true;
            }
        }
    }

    public final void c0() {
        ArrayList arrayListQ = this.f21505c.q();
        int size = arrayListQ.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListQ.get(i);
            i++;
            P p6 = (P) obj;
            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = p6.f21558c;
            if (abstractComponentCallbacksC2617v.f21697U) {
                if (this.f21504b) {
                    this.f21498I = true;
                } else {
                    abstractComponentCallbacksC2617v.f21697U = false;
                    p6.k();
                }
            }
        }
    }

    public final void d() {
        this.f21504b = false;
        this.f21500K.clear();
        this.f21499J.clear();
    }

    public final void d0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C2228zK());
        x xVar = this.f21522u;
        if (xVar == null) {
            try {
                u("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e6) {
                Log.e("FragmentManager", "Failed dumping state", e6);
                throw runtimeException;
            }
        }
        try {
            xVar.f21729m.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e7) {
            Log.e("FragmentManager", "Failed dumping state", e7);
            throw runtimeException;
        }
    }

    public final HashSet e() {
        C2605i c2605i;
        HashSet hashSet = new HashSet();
        ArrayList arrayListQ = this.f21505c.q();
        int size = arrayListQ.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListQ.get(i);
            i++;
            ViewGroup viewGroup = ((P) obj).f21558c.f21695S;
            if (viewGroup != null) {
                q5.i.e(F(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C2605i) {
                    c2605i = (C2605i) tag;
                } else {
                    c2605i = new C2605i(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c2605i);
                }
                hashSet.add(c2605i);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [p5.a, q5.h] */
    /* JADX WARN: Type inference failed for: r1v10, types: [p5.a, q5.h] */
    public final void e0() {
        synchronized (this.f21503a) {
            try {
                if (!this.f21503a.isEmpty()) {
                    C0372L c0372l = this.f21510h;
                    c0372l.f5809a = true;
                    ?? r12 = c0372l.f5811c;
                    if (r12 != 0) {
                        r12.b();
                    }
                    return;
                }
                C0372L c0372l2 = this.f21510h;
                ArrayList arrayList = this.f21506d;
                c0372l2.f5809a = (arrayList != null ? arrayList.size() : 0) > 0 && L(this.f21524w);
                ?? r02 = c0372l2.f5811c;
                if (r02 != 0) {
                    r02.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final P f(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        String str = abstractComponentCallbacksC2617v.f21710e;
        c1.g gVar = this.f21505c;
        P p6 = (P) ((HashMap) gVar.f5897c).get(str);
        if (p6 != null) {
            return p6;
        }
        P p7 = new P(this.f21514m, gVar, abstractComponentCallbacksC2617v);
        p7.m(this.f21522u.f21726j.getClassLoader());
        p7.f21560e = this.f21521t;
        return p7;
    }

    public final void g(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        if (H(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC2617v);
        }
        if (abstractComponentCallbacksC2617v.f21691O) {
            return;
        }
        abstractComponentCallbacksC2617v.f21691O = true;
        if (abstractComponentCallbacksC2617v.f21720k) {
            if (H(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC2617v);
            }
            c1.g gVar = this.f21505c;
            synchronized (((ArrayList) gVar.f5896b)) {
                ((ArrayList) gVar.f5896b).remove(abstractComponentCallbacksC2617v);
            }
            abstractComponentCallbacksC2617v.f21720k = false;
            if (I(abstractComponentCallbacksC2617v)) {
                this.f21494E = true;
            }
            a0(abstractComponentCallbacksC2617v);
        }
    }

    public final void h(boolean z6) {
        if (z6 && this.f21522u != null) {
            d0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v : this.f21505c.s()) {
            if (abstractComponentCallbacksC2617v != null) {
                abstractComponentCallbacksC2617v.f21694R = true;
                if (z6) {
                    abstractComponentCallbacksC2617v.f21686I.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f21521t >= 1) {
            for (AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v : this.f21505c.s()) {
                if (abstractComponentCallbacksC2617v != null) {
                    if (!abstractComponentCallbacksC2617v.f21690N ? abstractComponentCallbacksC2617v.f21686I.i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f21521t < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z6 = false;
        for (AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v : this.f21505c.s()) {
            if (abstractComponentCallbacksC2617v != null && K(abstractComponentCallbacksC2617v)) {
                if (!abstractComponentCallbacksC2617v.f21690N ? abstractComponentCallbacksC2617v.f21686I.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC2617v);
                    z6 = true;
                }
            }
        }
        if (this.f21507e != null) {
            for (int i = 0; i < this.f21507e.size(); i++) {
                AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v2 = (AbstractComponentCallbacksC2617v) this.f21507e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC2617v2)) {
                    abstractComponentCallbacksC2617v2.getClass();
                }
            }
        }
        this.f21507e = arrayList;
        return z6;
    }

    public final void k() {
        boolean z6;
        this.f21497H = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C2605i) it.next()).e();
        }
        x xVar = this.f21522u;
        c1.g gVar = this.f21505c;
        if (xVar != null) {
            z6 = ((M) gVar.f5899e).f21541f;
        } else {
            z6 = A.f.y(xVar.f21726j) ? !r1.isChangingConfigurations() : true;
        }
        if (z6) {
            Iterator it2 = this.f21511j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((C2599c) it2.next()).f21618a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    String str = (String) obj;
                    M m6 = (M) gVar.f5899e;
                    m6.getClass();
                    if (H(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    m6.f(str);
                }
            }
        }
        t(-1);
        x xVar2 = this.f21522u;
        if (xVar2 != null) {
            AbstractActivityC2349g abstractActivityC2349g = xVar2.f21729m;
            abstractActivityC2349g.getClass();
            C c6 = this.f21517p;
            q5.i.e(c6, "listener");
            abstractActivityC2349g.f5863k.remove(c6);
        }
        x xVar3 = this.f21522u;
        if (xVar3 != null) {
            AbstractActivityC2349g abstractActivityC2349g2 = xVar3.f21729m;
            abstractActivityC2349g2.getClass();
            C c7 = this.f21516o;
            q5.i.e(c7, "listener");
            abstractActivityC2349g2.f5862j.remove(c7);
        }
        x xVar4 = this.f21522u;
        if (xVar4 != null) {
            AbstractActivityC2349g abstractActivityC2349g3 = xVar4.f21729m;
            abstractActivityC2349g3.getClass();
            C c8 = this.f21518q;
            q5.i.e(c8, "listener");
            abstractActivityC2349g3.f5865m.remove(c8);
        }
        x xVar5 = this.f21522u;
        if (xVar5 != null) {
            AbstractActivityC2349g abstractActivityC2349g4 = xVar5.f21729m;
            abstractActivityC2349g4.getClass();
            C c9 = this.f21519r;
            q5.i.e(c9, "listener");
            abstractActivityC2349g4.f5866n.remove(c9);
        }
        x xVar6 = this.f21522u;
        if ((xVar6 != null) && this.f21524w == null) {
            AbstractActivityC2349g abstractActivityC2349g5 = xVar6.f21729m;
            abstractActivityC2349g5.getClass();
            D d6 = this.f21520s;
            q5.i.e(d6, "provider");
            V2.e eVar = abstractActivityC2349g5.f5856c;
            ((CopyOnWriteArrayList) eVar.f3869c).remove(d6);
            if (((HashMap) eVar.f3870d).remove(d6) != null) {
                throw new ClassCastException();
            }
            ((Runnable) eVar.f3868b).run();
        }
        this.f21522u = null;
        this.f21523v = null;
        this.f21524w = null;
        if (this.f21509g != null) {
            Iterator it3 = this.f21510h.f5810b.iterator();
            while (it3.hasNext()) {
                ((InterfaceC0378c) it3.next()).cancel();
            }
            this.f21509g = null;
        }
        C2291h c2291h = this.f21490A;
        if (c2291h != null) {
            c2291h.b();
            this.f21491B.b();
            this.f21492C.b();
        }
    }

    public final void l(boolean z6) {
        if (z6 && this.f21522u != null) {
            d0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v : this.f21505c.s()) {
            if (abstractComponentCallbacksC2617v != null) {
                abstractComponentCallbacksC2617v.f21694R = true;
                if (z6) {
                    abstractComponentCallbacksC2617v.f21686I.l(true);
                }
            }
        }
    }

    public final void m(boolean z6) {
        if (z6 && this.f21522u != null) {
            d0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v : this.f21505c.s()) {
            if (abstractComponentCallbacksC2617v != null && z6) {
                abstractComponentCallbacksC2617v.f21686I.m(true);
            }
        }
    }

    public final void n() {
        ArrayList arrayListR = this.f21505c.r();
        int size = arrayListR.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListR.get(i);
            i++;
            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = (AbstractComponentCallbacksC2617v) obj;
            if (abstractComponentCallbacksC2617v != null) {
                abstractComponentCallbacksC2617v.w();
                abstractComponentCallbacksC2617v.f21686I.n();
            }
        }
    }

    public final boolean o() {
        if (this.f21521t >= 1) {
            for (AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v : this.f21505c.s()) {
                if (abstractComponentCallbacksC2617v != null) {
                    if (!abstractComponentCallbacksC2617v.f21690N ? abstractComponentCallbacksC2617v.f21686I.o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f21521t < 1) {
            return;
        }
        for (AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v : this.f21505c.s()) {
            if (abstractComponentCallbacksC2617v != null && !abstractComponentCallbacksC2617v.f21690N) {
                abstractComponentCallbacksC2617v.f21686I.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        if (abstractComponentCallbacksC2617v != null) {
            if (abstractComponentCallbacksC2617v.equals(this.f21505c.m(abstractComponentCallbacksC2617v.f21710e))) {
                abstractComponentCallbacksC2617v.f21684G.getClass();
                boolean zL = L(abstractComponentCallbacksC2617v);
                Boolean bool = abstractComponentCallbacksC2617v.f21719j;
                if (bool == null || bool.booleanValue() != zL) {
                    abstractComponentCallbacksC2617v.f21719j = Boolean.valueOf(zL);
                    K k6 = abstractComponentCallbacksC2617v.f21686I;
                    k6.e0();
                    k6.q(k6.f21525x);
                }
            }
        }
    }

    public final void r(boolean z6) {
        if (z6 && this.f21522u != null) {
            d0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v : this.f21505c.s()) {
            if (abstractComponentCallbacksC2617v != null && z6) {
                abstractComponentCallbacksC2617v.f21686I.r(true);
            }
        }
    }

    public final boolean s() {
        if (this.f21521t < 1) {
            return false;
        }
        boolean z6 = false;
        for (AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v : this.f21505c.s()) {
            if (abstractComponentCallbacksC2617v != null && K(abstractComponentCallbacksC2617v)) {
                if (!abstractComponentCallbacksC2617v.f21690N ? abstractComponentCallbacksC2617v.f21686I.s() : false) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public final void t(int i) {
        try {
            this.f21504b = true;
            for (P p6 : ((HashMap) this.f21505c.f5897c).values()) {
                if (p6 != null) {
                    p6.f21560e = i;
                }
            }
            N(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C2605i) it.next()).e();
            }
            this.f21504b = false;
            x(true);
        } catch (Throwable th) {
            this.f21504b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21524w;
        if (abstractComponentCallbacksC2617v != null) {
            sb.append(abstractComponentCallbacksC2617v.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f21524w)));
            sb.append("}");
        } else {
            x xVar = this.f21522u;
            if (xVar != null) {
                sb.append(xVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f21522u)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String strE = AbstractC2763b.e(str, "    ");
        c1.g gVar = this.f21505c;
        ArrayList arrayList = (ArrayList) gVar.f5896b;
        String strE2 = AbstractC2763b.e(str, "    ");
        HashMap map = (HashMap) gVar.f5897c;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (P p6 : map.values()) {
                printWriter.print(str);
                if (p6 != null) {
                    AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = p6.f21558c;
                    printWriter.println(abstractComponentCallbacksC2617v);
                    abstractComponentCallbacksC2617v.getClass();
                    printWriter.print(strE2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC2617v.f21688K));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC2617v.f21689L));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC2617v.M);
                    printWriter.print(strE2);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC2617v.f21703a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC2617v.f21710e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC2617v.f21683F);
                    printWriter.print(strE2);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC2617v.f21720k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC2617v.f21721l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC2617v.f21723n);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC2617v.f21680C);
                    printWriter.print(strE2);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC2617v.f21690N);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC2617v.f21691O);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC2617v.f21693Q);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strE2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC2617v.f21692P);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC2617v.f21698V);
                    if (abstractComponentCallbacksC2617v.f21684G != null) {
                        printWriter.print(strE2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC2617v.f21684G);
                    }
                    if (abstractComponentCallbacksC2617v.f21685H != null) {
                        printWriter.print(strE2);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC2617v.f21685H);
                    }
                    if (abstractComponentCallbacksC2617v.f21687J != null) {
                        printWriter.print(strE2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC2617v.f21687J);
                    }
                    if (abstractComponentCallbacksC2617v.f21712f != null) {
                        printWriter.print(strE2);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC2617v.f21712f);
                    }
                    if (abstractComponentCallbacksC2617v.f21705b != null) {
                        printWriter.print(strE2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC2617v.f21705b);
                    }
                    if (abstractComponentCallbacksC2617v.f21706c != null) {
                        printWriter.print(strE2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC2617v.f21706c);
                    }
                    if (abstractComponentCallbacksC2617v.f21708d != null) {
                        printWriter.print(strE2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC2617v.f21708d);
                    }
                    Object objM = abstractComponentCallbacksC2617v.f21714g;
                    if (objM == null) {
                        K k6 = abstractComponentCallbacksC2617v.f21684G;
                        objM = (k6 == null || (str2 = abstractComponentCallbacksC2617v.f21716h) == null) ? null : k6.f21505c.m(str2);
                    }
                    if (objM != null) {
                        printWriter.print(strE2);
                        printWriter.print("mTarget=");
                        printWriter.print(objM);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC2617v.i);
                    }
                    printWriter.print(strE2);
                    printWriter.print("mPopDirection=");
                    C2614s c2614s = abstractComponentCallbacksC2617v.f21699W;
                    printWriter.println(c2614s == null ? false : c2614s.f21668a);
                    C2614s c2614s2 = abstractComponentCallbacksC2617v.f21699W;
                    if ((c2614s2 == null ? 0 : c2614s2.f21669b) != 0) {
                        printWriter.print(strE2);
                        printWriter.print("getEnterAnim=");
                        C2614s c2614s3 = abstractComponentCallbacksC2617v.f21699W;
                        printWriter.println(c2614s3 == null ? 0 : c2614s3.f21669b);
                    }
                    C2614s c2614s4 = abstractComponentCallbacksC2617v.f21699W;
                    if ((c2614s4 == null ? 0 : c2614s4.f21670c) != 0) {
                        printWriter.print(strE2);
                        printWriter.print("getExitAnim=");
                        C2614s c2614s5 = abstractComponentCallbacksC2617v.f21699W;
                        printWriter.println(c2614s5 == null ? 0 : c2614s5.f21670c);
                    }
                    C2614s c2614s6 = abstractComponentCallbacksC2617v.f21699W;
                    if ((c2614s6 == null ? 0 : c2614s6.f21671d) != 0) {
                        printWriter.print(strE2);
                        printWriter.print("getPopEnterAnim=");
                        C2614s c2614s7 = abstractComponentCallbacksC2617v.f21699W;
                        printWriter.println(c2614s7 == null ? 0 : c2614s7.f21671d);
                    }
                    C2614s c2614s8 = abstractComponentCallbacksC2617v.f21699W;
                    if ((c2614s8 == null ? 0 : c2614s8.f21672e) != 0) {
                        printWriter.print(strE2);
                        printWriter.print("getPopExitAnim=");
                        C2614s c2614s9 = abstractComponentCallbacksC2617v.f21699W;
                        printWriter.println(c2614s9 == null ? 0 : c2614s9.f21672e);
                    }
                    if (abstractComponentCallbacksC2617v.f21695S != null) {
                        printWriter.print(strE2);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC2617v.f21695S);
                    }
                    if (abstractComponentCallbacksC2617v.f21696T != null) {
                        printWriter.print(strE2);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC2617v.f21696T);
                    }
                    if (abstractComponentCallbacksC2617v.m() != null) {
                        a0 a0VarD = abstractComponentCallbacksC2617v.d();
                        androidx.lifecycle.P p7 = C2769a.f22733c;
                        q5.i.e(a0VarD, "store");
                        C2679a c2679a = C2679a.f22142b;
                        q5.i.e(c2679a, "defaultCreationExtras");
                        V2.e eVar = new V2.e(a0VarD, p7, c2679a);
                        q5.d dVarA = q5.p.a(C2769a.class);
                        String strS = com.bumptech.glide.d.s(dVarA);
                        if (strS == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        C2941j c2941j = ((C2769a) eVar.q(dVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strS))).f22734b;
                        if (c2941j.g() > 0) {
                            printWriter.print(strE2);
                            printWriter.println("Loaders:");
                            if (c2941j.g() > 0) {
                                if (c2941j.h(0) != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(strE2);
                                printWriter.print("  #");
                                printWriter.print(c2941j.e(0));
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(strE2);
                    printWriter.println("Child " + abstractComponentCallbacksC2617v.f21686I + ":");
                    abstractComponentCallbacksC2617v.f21686I.u(AbstractC2763b.e(strE2, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v2 = (AbstractComponentCallbacksC2617v) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC2617v2.toString());
            }
        }
        ArrayList arrayList2 = this.f21507e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v3 = (AbstractComponentCallbacksC2617v) this.f21507e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC2617v3.toString());
            }
        }
        ArrayList arrayList3 = this.f21506d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i6 = 0; i6 < size; i6++) {
                C2597a c2597a = (C2597a) this.f21506d.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(c2597a.toString());
                c2597a.g(strE, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f21503a) {
            try {
                int size4 = this.f21503a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i7 = 0; i7 < size4; i7++) {
                        Object obj = (H) this.f21503a.get(i7);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i7);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f21522u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f21523v);
        if (this.f21524w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f21524w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f21521t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f21495F);
        printWriter.print(" mStopped=");
        printWriter.print(this.f21496G);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f21497H);
        if (this.f21494E) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f21494E);
        }
    }

    public final void v(H h6, boolean z6) {
        if (!z6) {
            if (this.f21522u == null) {
                if (!this.f21497H) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (M()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f21503a) {
            try {
                if (this.f21522u == null) {
                    if (!z6) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f21503a.add(h6);
                    W();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z6) {
        if (this.f21504b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f21522u == null) {
            if (!this.f21497H) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f21522u.f21727k.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z6 && M()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f21499J == null) {
            this.f21499J = new ArrayList();
            this.f21500K = new ArrayList();
        }
    }

    public final boolean x(boolean z6) {
        boolean zA;
        w(z6);
        boolean z7 = false;
        while (true) {
            ArrayList arrayList = this.f21499J;
            ArrayList arrayList2 = this.f21500K;
            synchronized (this.f21503a) {
                if (this.f21503a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f21503a.size();
                        zA = false;
                        for (int i = 0; i < size; i++) {
                            zA |= ((H) this.f21503a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                break;
            }
            z7 = true;
            this.f21504b = true;
            try {
                T(this.f21499J, this.f21500K);
            } finally {
                d();
            }
        }
        e0();
        if (this.f21498I) {
            this.f21498I = false;
            c0();
        }
        ((HashMap) this.f21505c.f5897c).values().removeAll(Collections.singleton(null));
        return z7;
    }

    public final void y(C2597a c2597a, boolean z6) {
        if (z6 && (this.f21522u == null || this.f21497H)) {
            return;
        }
        w(z6);
        c2597a.a(this.f21499J, this.f21500K);
        this.f21504b = true;
        try {
            T(this.f21499J, this.f21500K);
            d();
            e0();
            if (this.f21498I) {
                this.f21498I = false;
                c0();
            }
            ((HashMap) this.f21505c.f5897c).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0230 A[PHI: r15
  0x0230: PHI (r15v44 int) = (r15v43 int), (r15v46 int) binds: [B:104:0x021d, B:108:0x0227] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(java.util.ArrayList r26, java.util.ArrayList r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.K.z(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }
}
