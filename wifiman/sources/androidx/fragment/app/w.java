package androidx.fragment.app;

import F1.InterfaceC2779w;
import F1.InterfaceC2784z;
import V1.b;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import c.AbstractC4137F;
import c.C4138G;
import c.InterfaceC4141J;
import f.AbstractC5486c;
import f.AbstractC5487d;
import f.AbstractC5488e;
import f.C5484a;
import f.C5490g;
import f.InterfaceC5485b;
import f.InterfaceC5489f;
import g.AbstractC5837a;
import g.C5838b;
import g.C5839c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import q2.C7416d;
import q2.InterfaceC7418f;
import t1.InterfaceC8022b;
import t1.InterfaceC8023c;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: S, reason: collision with root package name */
    private static boolean f31482S = false;

    /* renamed from: D, reason: collision with root package name */
    private AbstractC5486c f31486D;

    /* renamed from: E, reason: collision with root package name */
    private AbstractC5486c f31487E;

    /* renamed from: F, reason: collision with root package name */
    private AbstractC5486c f31488F;

    /* renamed from: H, reason: collision with root package name */
    private boolean f31490H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f31491I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f31492J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f31493K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f31494L;

    /* renamed from: M, reason: collision with root package name */
    private ArrayList f31495M;

    /* renamed from: N, reason: collision with root package name */
    private ArrayList f31496N;

    /* renamed from: O, reason: collision with root package name */
    private ArrayList f31497O;

    /* renamed from: P, reason: collision with root package name */
    private z f31498P;

    /* renamed from: Q, reason: collision with root package name */
    private b.c f31499Q;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31502b;

    /* renamed from: d, reason: collision with root package name */
    ArrayList f31504d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f31505e;

    /* renamed from: g, reason: collision with root package name */
    private C4138G f31507g;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f31513m;

    /* renamed from: v, reason: collision with root package name */
    private o f31522v;

    /* renamed from: w, reason: collision with root package name */
    private AbstractC4001l f31523w;

    /* renamed from: x, reason: collision with root package name */
    private Fragment f31524x;

    /* renamed from: y, reason: collision with root package name */
    Fragment f31525y;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f31501a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final D f31503c = new D();

    /* renamed from: f, reason: collision with root package name */
    private final p f31506f = new p(this);

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC4137F f31508h = new b(false);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f31509i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    private final Map f31510j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    private final Map f31511k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    private final Map f31512l = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    private final q f31514n = new q(this);

    /* renamed from: o, reason: collision with root package name */
    private final CopyOnWriteArrayList f31515o = new CopyOnWriteArrayList();

    /* renamed from: p, reason: collision with root package name */
    private final E1.a f31516p = new E1.a() { // from class: androidx.fragment.app.r
        @Override // E1.a
        public final void accept(Object obj) {
            this.f31473a.N0((Configuration) obj);
        }
    };

    /* renamed from: q, reason: collision with root package name */
    private final E1.a f31517q = new E1.a() { // from class: androidx.fragment.app.s
        @Override // E1.a
        public final void accept(Object obj) {
            this.f31474a.O0((Integer) obj);
        }
    };

    /* renamed from: r, reason: collision with root package name */
    private final E1.a f31518r = new E1.a() { // from class: androidx.fragment.app.t
        @Override // E1.a
        public final void accept(Object obj) {
            this.f31479a.P0((s1.h) obj);
        }
    };

    /* renamed from: s, reason: collision with root package name */
    private final E1.a f31519s = new E1.a() { // from class: androidx.fragment.app.u
        @Override // E1.a
        public final void accept(Object obj) {
            this.f31480a.Q0((s1.r) obj);
        }
    };

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC2784z f31520t = new c();

    /* renamed from: u, reason: collision with root package name */
    int f31521u = -1;

    /* renamed from: z, reason: collision with root package name */
    private n f31526z = null;

    /* renamed from: A, reason: collision with root package name */
    private n f31483A = new d();

    /* renamed from: B, reason: collision with root package name */
    private L f31484B = null;

    /* renamed from: C, reason: collision with root package name */
    private L f31485C = new e();

    /* renamed from: G, reason: collision with root package name */
    ArrayDeque f31489G = new ArrayDeque();

    /* renamed from: R, reason: collision with root package name */
    private Runnable f31500R = new f();

    class a implements InterfaceC5485b {
        a() {
        }

        @Override // f.InterfaceC5485b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            k kVar = (k) w.this.f31489G.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = kVar.f31537a;
            int i11 = kVar.f31538b;
            Fragment fragmentI = w.this.f31503c.i(str);
            if (fragmentI != null) {
                fragmentI.I0(i11, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    class b extends AbstractC4137F {
        b(boolean z10) {
            super(z10);
        }

        @Override // c.AbstractC4137F
        public void d() {
            w.this.A0();
        }
    }

    class c implements InterfaceC2784z {
        c() {
        }

        @Override // F1.InterfaceC2784z
        public boolean a(MenuItem menuItem) {
            return w.this.H(menuItem);
        }

        @Override // F1.InterfaceC2784z
        public void b(Menu menu) {
            w.this.I(menu);
        }

        @Override // F1.InterfaceC2784z
        public void c(Menu menu, MenuInflater menuInflater) {
            w.this.A(menu, menuInflater);
        }

        @Override // F1.InterfaceC2784z
        public void d(Menu menu) {
            w.this.M(menu);
        }
    }

    class d extends n {
        d() {
        }

        @Override // androidx.fragment.app.n
        public Fragment a(ClassLoader classLoader, String str) {
            return w.this.r0().c(w.this.r0().g(), str, null);
        }
    }

    class e implements L {
        e() {
        }

        @Override // androidx.fragment.app.L
        public K a(ViewGroup viewGroup) {
            return new C3993d(viewGroup);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.Y(true);
        }
    }

    class g implements A {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f31533a;

        g(Fragment fragment) {
            this.f31533a = fragment;
        }

        @Override // androidx.fragment.app.A
        public void a(w wVar, Fragment fragment) {
            this.f31533a.m0(fragment);
        }
    }

    class h implements InterfaceC5485b {
        h() {
        }

        @Override // f.InterfaceC5485b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5484a c5484a) {
            k kVar = (k) w.this.f31489G.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = kVar.f31537a;
            int i10 = kVar.f31538b;
            Fragment fragmentI = w.this.f31503c.i(str);
            if (fragmentI != null) {
                fragmentI.j0(i10, c5484a.b(), c5484a.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    class i implements InterfaceC5485b {
        i() {
        }

        @Override // f.InterfaceC5485b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5484a c5484a) {
            k kVar = (k) w.this.f31489G.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = kVar.f31537a;
            int i10 = kVar.f31538b;
            Fragment fragmentI = w.this.f31503c.i(str);
            if (fragmentI != null) {
                fragmentI.j0(i10, c5484a.b(), c5484a.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    static class j extends AbstractC5837a {
        j() {
        }

        @Override // g.AbstractC5837a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, C5490g c5490g) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentA = c5490g.a();
            if (intentA != null && (bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentA.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    c5490g = new C5490g.a(c5490g.d()).b(null).c(c5490g.c(), c5490g.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c5490g);
            if (w.E0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // g.AbstractC5837a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C5484a c(int i10, Intent intent) {
            return new C5484a(i10, intent);
        }
    }

    interface l {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    private class m implements l {

        /* renamed from: a, reason: collision with root package name */
        final String f31539a;

        /* renamed from: b, reason: collision with root package name */
        final int f31540b;

        /* renamed from: c, reason: collision with root package name */
        final int f31541c;

        m(String str, int i10, int i11) {
            this.f31539a = str;
            this.f31540b = i10;
            this.f31541c = i11;
        }

        @Override // androidx.fragment.app.w.l
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = w.this.f31525y;
            if (fragment == null || this.f31540b >= 0 || this.f31539a != null || !fragment.r().X0()) {
                return w.this.a1(arrayList, arrayList2, this.f31539a, this.f31540b, this.f31541c);
            }
            return false;
        }
    }

    public static boolean E0(int i10) {
        return f31482S || Log.isLoggable("FragmentManager", i10);
    }

    private boolean F0(Fragment fragment) {
        return (fragment.f31226E && fragment.f31227F) || fragment.f31270v.n();
    }

    private boolean G0() {
        Fragment fragment = this.f31524x;
        if (fragment == null) {
            return true;
        }
        return fragment.a0() && this.f31524x.G().G0();
    }

    private void J(Fragment fragment) {
        if (fragment == null || !fragment.equals(c0(fragment.f31241f))) {
            return;
        }
        fragment.h1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0(Configuration configuration) {
        if (G0()) {
            x(configuration, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O0(Integer num) {
        if (G0() && num.intValue() == 80) {
            D(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0(s1.h hVar) {
        if (G0()) {
            E(hVar.a(), false);
        }
    }

    private void Q(int i10) {
        try {
            this.f31502b = true;
            this.f31503c.d(i10);
            S0(i10, false);
            Iterator it = r().iterator();
            while (it.hasNext()) {
                ((K) it.next()).j();
            }
            this.f31502b = false;
            Y(true);
        } catch (Throwable th2) {
            this.f31502b = false;
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0(s1.r rVar) {
        if (G0()) {
            L(rVar.a(), false);
        }
    }

    private void T() {
        if (this.f31494L) {
            this.f31494L = false;
            n1();
        }
    }

    private void V() {
        Iterator it = r().iterator();
        while (it.hasNext()) {
            ((K) it.next()).j();
        }
    }

    private void X(boolean z10) {
        if (this.f31502b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f31522v == null) {
            if (!this.f31493K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f31522v.h().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            o();
        }
        if (this.f31495M == null) {
            this.f31495M = new ArrayList();
            this.f31496N = new ArrayList();
        }
    }

    private boolean Z0(String str, int i10, int i11) {
        Y(false);
        X(true);
        Fragment fragment = this.f31525y;
        if (fragment != null && i10 < 0 && str == null && fragment.r().X0()) {
            return true;
        }
        boolean zA1 = a1(this.f31495M, this.f31496N, str, i10, i11);
        if (zA1) {
            this.f31502b = true;
            try {
                c1(this.f31495M, this.f31496N);
            } finally {
                p();
            }
        }
        p1();
        T();
        this.f31503c.b();
        return zA1;
    }

    private static void a0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        while (i10 < i11) {
            C3990a c3990a = (C3990a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                c3990a.q(-1);
                c3990a.v();
            } else {
                c3990a.q(1);
                c3990a.u();
            }
            i10++;
        }
    }

    private void b0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z10 = ((C3990a) arrayList.get(i10)).f31208r;
        ArrayList arrayList3 = this.f31497O;
        if (arrayList3 == null) {
            this.f31497O = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f31497O.addAll(this.f31503c.o());
        Fragment fragmentV0 = v0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            C3990a c3990a = (C3990a) arrayList.get(i12);
            fragmentV0 = !((Boolean) arrayList2.get(i12)).booleanValue() ? c3990a.w(this.f31497O, fragmentV0) : c3990a.z(this.f31497O, fragmentV0);
            z11 = z11 || c3990a.f31199i;
        }
        this.f31497O.clear();
        if (!z10 && this.f31521u >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                Iterator it = ((C3990a) arrayList.get(i13)).f31193c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = ((E.a) it.next()).f31211b;
                    if (fragment != null && fragment.f31268t != null) {
                        this.f31503c.r(t(fragment));
                    }
                }
            }
        }
        a0(arrayList, arrayList2, i10, i11);
        boolean zBooleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
        for (int i14 = i10; i14 < i11; i14++) {
            C3990a c3990a2 = (C3990a) arrayList.get(i14);
            if (zBooleanValue) {
                for (int size = c3990a2.f31193c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = ((E.a) c3990a2.f31193c.get(size)).f31211b;
                    if (fragment2 != null) {
                        t(fragment2).m();
                    }
                }
            } else {
                Iterator it2 = c3990a2.f31193c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = ((E.a) it2.next()).f31211b;
                    if (fragment3 != null) {
                        t(fragment3).m();
                    }
                }
            }
        }
        S0(this.f31521u, true);
        for (K k10 : s(arrayList, i10, i11)) {
            k10.r(zBooleanValue);
            k10.p();
            k10.g();
        }
        while (i10 < i11) {
            C3990a c3990a3 = (C3990a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue() && c3990a3.f31358v >= 0) {
                c3990a3.f31358v = -1;
            }
            c3990a3.y();
            i10++;
        }
        if (z11) {
            d1();
        }
    }

    private void c1(ArrayList arrayList, ArrayList arrayList2) {
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
            if (!((C3990a) arrayList.get(i10)).f31208r) {
                if (i11 != i10) {
                    b0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((C3990a) arrayList.get(i11)).f31208r) {
                        i11++;
                    }
                }
                b0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            b0(arrayList, arrayList2, i11, size);
        }
    }

    private int d0(String str, int i10, boolean z10) {
        ArrayList arrayList = this.f31504d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f31504d.size() - 1;
        }
        int size = this.f31504d.size() - 1;
        while (size >= 0) {
            C3990a c3990a = (C3990a) this.f31504d.get(size);
            if ((str != null && str.equals(c3990a.x())) || (i10 >= 0 && i10 == c3990a.f31358v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f31504d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C3990a c3990a2 = (C3990a) this.f31504d.get(size - 1);
            if ((str == null || !str.equals(c3990a2.x())) && (i10 < 0 || i10 != c3990a2.f31358v)) {
                return size;
            }
            size--;
        }
        return size;
    }

    private void d1() {
        ArrayList arrayList = this.f31513m;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        AbstractC5487d.a(this.f31513m.get(0));
        throw null;
    }

    static int f1(int i10) {
        int i11 = 4097;
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 != 8194) {
            i11 = 8197;
            if (i10 == 8197) {
                return 4100;
            }
            if (i10 == 4099) {
                return 4099;
            }
            if (i10 != 4100) {
                return 0;
            }
        }
        return i11;
    }

    static w h0(View view) {
        AbstractActivityC3999j abstractActivityC3999j;
        Fragment fragmentI0 = i0(view);
        if (fragmentI0 != null) {
            if (fragmentI0.a0()) {
                return fragmentI0.r();
            }
            throw new IllegalStateException("The Fragment " + fragmentI0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                abstractActivityC3999j = null;
                break;
            }
            if (context instanceof AbstractActivityC3999j) {
                abstractActivityC3999j = (AbstractActivityC3999j) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (abstractActivityC3999j != null) {
            return abstractActivityC3999j.v0();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    private static Fragment i0(View view) {
        while (view != null) {
            Fragment fragmentY0 = y0(view);
            if (fragmentY0 != null) {
                return fragmentY0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void j0() {
        Iterator it = r().iterator();
        while (it.hasNext()) {
            ((K) it.next()).k();
        }
    }

    private boolean k0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f31501a) {
            if (this.f31501a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f31501a.size();
                boolean zA = false;
                for (int i10 = 0; i10 < size; i10++) {
                    zA |= ((l) this.f31501a.get(i10)).a(arrayList, arrayList2);
                }
                return zA;
            } finally {
                this.f31501a.clear();
                this.f31522v.h().removeCallbacks(this.f31500R);
            }
        }
    }

    private void l1(Fragment fragment) {
        ViewGroup viewGroupO0 = o0(fragment);
        if (viewGroupO0 == null || fragment.u() + fragment.x() + fragment.I() + fragment.J() <= 0) {
            return;
        }
        int i10 = U1.b.f22126c;
        if (viewGroupO0.getTag(i10) == null) {
            viewGroupO0.setTag(i10, fragment);
        }
        ((Fragment) viewGroupO0.getTag(i10)).y1(fragment.H());
    }

    private z m0(Fragment fragment) {
        return this.f31498P.c0(fragment);
    }

    private void n1() {
        Iterator it = this.f31503c.k().iterator();
        while (it.hasNext()) {
            V0((C) it.next());
        }
    }

    private void o() {
        if (L0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private ViewGroup o0(Fragment fragment) {
        ViewGroup viewGroup = fragment.f31229H;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f31273y > 0 && this.f31523w.e()) {
            View viewD = this.f31523w.d(fragment.f31273y);
            if (viewD instanceof ViewGroup) {
                return (ViewGroup) viewD;
            }
        }
        return null;
    }

    private void o1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new J("FragmentManager"));
        o oVar = this.f31522v;
        if (oVar != null) {
            try {
                oVar.i("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            U("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    private void p() {
        this.f31502b = false;
        this.f31496N.clear();
        this.f31495M.clear();
    }

    private void p1() {
        synchronized (this.f31501a) {
            try {
                if (this.f31501a.isEmpty()) {
                    this.f31508h.j(l0() > 0 && J0(this.f31524x));
                } else {
                    this.f31508h.j(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void q() {
        o oVar = this.f31522v;
        if (oVar instanceof S ? this.f31503c.p().g0() : oVar.g() instanceof Activity ? !((Activity) this.f31522v.g()).isChangingConfigurations() : true) {
            Iterator it = this.f31510j.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C3992c) it.next()).f31374a.iterator();
                while (it2.hasNext()) {
                    this.f31503c.p().Z((String) it2.next());
                }
            }
        }
    }

    private Set r() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f31503c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C) it.next()).k().f31229H;
            if (viewGroup != null) {
                hashSet.add(K.o(viewGroup, w0()));
            }
        }
        return hashSet;
    }

    private Set s(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator it = ((C3990a) arrayList.get(i10)).f31193c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((E.a) it.next()).f31211b;
                if (fragment != null && (viewGroup = fragment.f31229H) != null) {
                    hashSet.add(K.n(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    static Fragment y0(View view) {
        Object tag = view.getTag(U1.b.f22124a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    boolean A(Menu menu, MenuInflater menuInflater) {
        if (this.f31521u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f31503c.o()) {
            if (fragment != null && I0(fragment) && fragment.U0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f31505e != null) {
            for (int i10 = 0; i10 < this.f31505e.size(); i10++) {
                Fragment fragment2 = (Fragment) this.f31505e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.u0();
                }
            }
        }
        this.f31505e = arrayList;
        return z10;
    }

    void A0() {
        Y(true);
        if (this.f31508h.g()) {
            X0();
        } else {
            this.f31507g.l();
        }
    }

    void B() {
        this.f31493K = true;
        Y(true);
        V();
        q();
        Q(-1);
        Object obj = this.f31522v;
        if (obj instanceof InterfaceC8023c) {
            ((InterfaceC8023c) obj).D(this.f31517q);
        }
        Object obj2 = this.f31522v;
        if (obj2 instanceof InterfaceC8022b) {
            ((InterfaceC8022b) obj2).u(this.f31516p);
        }
        Object obj3 = this.f31522v;
        if (obj3 instanceof s1.o) {
            ((s1.o) obj3).j(this.f31518r);
        }
        Object obj4 = this.f31522v;
        if (obj4 instanceof s1.p) {
            ((s1.p) obj4).x(this.f31519s);
        }
        Object obj5 = this.f31522v;
        if (obj5 instanceof InterfaceC2779w) {
            ((InterfaceC2779w) obj5).N(this.f31520t);
        }
        this.f31522v = null;
        this.f31523w = null;
        this.f31524x = null;
        if (this.f31507g != null) {
            this.f31508h.h();
            this.f31507g = null;
        }
        AbstractC5486c abstractC5486c = this.f31486D;
        if (abstractC5486c != null) {
            abstractC5486c.c();
            this.f31487E.c();
            this.f31488F.c();
        }
    }

    void B0(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.f31222A) {
            return;
        }
        fragment.f31222A = true;
        fragment.f31235Z = true ^ fragment.f31235Z;
        l1(fragment);
    }

    void C() {
        Q(1);
    }

    void C0(Fragment fragment) {
        if (fragment.f31253l && F0(fragment)) {
            this.f31490H = true;
        }
    }

    void D(boolean z10) {
        if (z10 && (this.f31522v instanceof InterfaceC8023c)) {
            o1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f31503c.o()) {
            if (fragment != null) {
                fragment.a1();
                if (z10) {
                    fragment.f31270v.D(true);
                }
            }
        }
    }

    public boolean D0() {
        return this.f31493K;
    }

    void E(boolean z10, boolean z11) {
        if (z11 && (this.f31522v instanceof s1.o)) {
            o1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f31503c.o()) {
            if (fragment != null) {
                fragment.b1(z10);
                if (z11) {
                    fragment.f31270v.E(z10, true);
                }
            }
        }
    }

    void F(Fragment fragment) {
        Iterator it = this.f31515o.iterator();
        while (it.hasNext()) {
            ((A) it.next()).a(this, fragment);
        }
    }

    void G() {
        for (Fragment fragment : this.f31503c.l()) {
            if (fragment != null) {
                fragment.y0(fragment.b0());
                fragment.f31270v.G();
            }
        }
    }

    boolean H(MenuItem menuItem) {
        if (this.f31521u < 1) {
            return false;
        }
        for (Fragment fragment : this.f31503c.o()) {
            if (fragment != null && fragment.c1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean H0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.b0();
    }

    void I(Menu menu) {
        if (this.f31521u < 1) {
            return;
        }
        for (Fragment fragment : this.f31503c.o()) {
            if (fragment != null) {
                fragment.d1(menu);
            }
        }
    }

    boolean I0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.d0();
    }

    boolean J0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        w wVar = fragment.f31268t;
        return fragment.equals(wVar.v0()) && J0(wVar.f31524x);
    }

    void K() {
        Q(5);
    }

    boolean K0(int i10) {
        return this.f31521u >= i10;
    }

    void L(boolean z10, boolean z11) {
        if (z11 && (this.f31522v instanceof s1.p)) {
            o1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f31503c.o()) {
            if (fragment != null) {
                fragment.f1(z10);
                if (z11) {
                    fragment.f31270v.L(z10, true);
                }
            }
        }
    }

    public boolean L0() {
        return this.f31491I || this.f31492J;
    }

    boolean M(Menu menu) {
        boolean z10 = false;
        if (this.f31521u < 1) {
            return false;
        }
        for (Fragment fragment : this.f31503c.o()) {
            if (fragment != null && I0(fragment) && fragment.g1(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    void N() {
        p1();
        J(this.f31525y);
    }

    void O() {
        this.f31491I = false;
        this.f31492J = false;
        this.f31498P.i0(false);
        Q(7);
    }

    void P() {
        this.f31491I = false;
        this.f31492J = false;
        this.f31498P.i0(false);
        Q(5);
    }

    void R() {
        this.f31492J = true;
        this.f31498P.i0(true);
        Q(4);
    }

    void R0(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (this.f31486D == null) {
            this.f31522v.n(fragment, intent, i10, bundle);
            return;
        }
        this.f31489G.addLast(new k(fragment.f31241f, i10));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f31486D.a(intent);
    }

    void S() {
        Q(2);
    }

    void S0(int i10, boolean z10) {
        o oVar;
        if (this.f31522v == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f31521u) {
            this.f31521u = i10;
            this.f31503c.t();
            n1();
            if (this.f31490H && (oVar = this.f31522v) != null && this.f31521u == 7) {
                oVar.p();
                this.f31490H = false;
            }
        }
    }

    void T0() {
        if (this.f31522v == null) {
            return;
        }
        this.f31491I = false;
        this.f31492J = false;
        this.f31498P.i0(false);
        for (Fragment fragment : this.f31503c.o()) {
            if (fragment != null) {
                fragment.h0();
            }
        }
    }

    public void U(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f31503c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f31505e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                Fragment fragment = (Fragment) this.f31505e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList arrayList2 = this.f31504d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                C3990a c3990a = (C3990a) this.f31504d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c3990a.toString());
                c3990a.s(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f31509i.get());
        synchronized (this.f31501a) {
            try {
                int size3 = this.f31501a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        l lVar = (l) this.f31501a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(lVar);
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
        printWriter.println(this.f31522v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f31523w);
        if (this.f31524x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f31524x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f31521u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f31491I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f31492J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f31493K);
        if (this.f31490H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f31490H);
        }
    }

    void U0(FragmentContainerView fragmentContainerView) {
        View view;
        for (C c10 : this.f31503c.k()) {
            Fragment fragmentK = c10.k();
            if (fragmentK.f31273y == fragmentContainerView.getId() && (view = fragmentK.f31230I) != null && view.getParent() == null) {
                fragmentK.f31229H = fragmentContainerView;
                c10.b();
            }
        }
    }

    void V0(C c10) {
        Fragment fragmentK = c10.k();
        if (fragmentK.f31231J) {
            if (this.f31502b) {
                this.f31494L = true;
            } else {
                fragmentK.f31231J = false;
                c10.m();
            }
        }
    }

    void W(l lVar, boolean z10) {
        if (!z10) {
            if (this.f31522v == null) {
                if (!this.f31493K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            o();
        }
        synchronized (this.f31501a) {
            try {
                if (this.f31522v == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f31501a.add(lVar);
                    h1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void W0(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            W(new m(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public boolean X0() {
        return Z0(null, -1, 0);
    }

    boolean Y(boolean z10) {
        X(z10);
        boolean z11 = false;
        while (k0(this.f31495M, this.f31496N)) {
            z11 = true;
            this.f31502b = true;
            try {
                c1(this.f31495M, this.f31496N);
            } finally {
                p();
            }
        }
        p1();
        T();
        this.f31503c.b();
        return z11;
    }

    public boolean Y0(int i10, int i11) {
        if (i10 >= 0) {
            return Z0(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    void Z(l lVar, boolean z10) {
        if (z10 && (this.f31522v == null || this.f31493K)) {
            return;
        }
        X(z10);
        if (lVar.a(this.f31495M, this.f31496N)) {
            this.f31502b = true;
            try {
                c1(this.f31495M, this.f31496N);
            } finally {
                p();
            }
        }
        p1();
        T();
        this.f31503c.b();
    }

    boolean a1(ArrayList arrayList, ArrayList arrayList2, String str, int i10, int i11) {
        int iD0 = d0(str, i10, (i11 & 1) != 0);
        if (iD0 < 0) {
            return false;
        }
        for (int size = this.f31504d.size() - 1; size >= iD0; size--) {
            arrayList.add((C3990a) this.f31504d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    void b1(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f31267s);
        }
        boolean zC0 = fragment.c0();
        if (fragment.f31223B && zC0) {
            return;
        }
        this.f31503c.u(fragment);
        if (F0(fragment)) {
            this.f31490H = true;
        }
        fragment.f31255m = true;
        l1(fragment);
    }

    Fragment c0(String str) {
        return this.f31503c.f(str);
    }

    public Fragment e0(int i10) {
        return this.f31503c.g(i10);
    }

    void e1(Parcelable parcelable) {
        C c10;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f31522v.g().getClassLoader());
                this.f31511k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f31522v.g().getClassLoader());
                arrayList.add((B) bundle.getParcelable("state"));
            }
        }
        this.f31503c.x(arrayList);
        y yVar = (y) bundle3.getParcelable("state");
        if (yVar == null) {
            return;
        }
        this.f31503c.v();
        Iterator it = yVar.f31543a.iterator();
        while (it.hasNext()) {
            B B10 = this.f31503c.B((String) it.next(), null);
            if (B10 != null) {
                Fragment fragmentB0 = this.f31498P.b0(B10.f31167b);
                if (fragmentB0 != null) {
                    if (E0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentB0);
                    }
                    c10 = new C(this.f31514n, this.f31503c, fragmentB0, B10);
                } else {
                    c10 = new C(this.f31514n, this.f31503c, this.f31522v.g().getClassLoader(), p0(), B10);
                }
                Fragment fragmentK = c10.k();
                fragmentK.f31268t = this;
                if (E0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentK.f31241f + "): " + fragmentK);
                }
                c10.o(this.f31522v.g().getClassLoader());
                this.f31503c.r(c10);
                c10.t(this.f31521u);
            }
        }
        for (Fragment fragment : this.f31498P.e0()) {
            if (!this.f31503c.c(fragment.f31241f)) {
                if (E0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + yVar.f31543a);
                }
                this.f31498P.h0(fragment);
                fragment.f31268t = this;
                C c11 = new C(this.f31514n, this.f31503c, fragment);
                c11.t(1);
                c11.m();
                fragment.f31255m = true;
                c11.m();
            }
        }
        this.f31503c.w(yVar.f31544b);
        if (yVar.f31545c != null) {
            this.f31504d = new ArrayList(yVar.f31545c.length);
            int i10 = 0;
            while (true) {
                C3991b[] c3991bArr = yVar.f31545c;
                if (i10 >= c3991bArr.length) {
                    break;
                }
                C3990a c3990aB = c3991bArr[i10].b(this);
                if (E0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + c3990aB.f31358v + "): " + c3990aB);
                    PrintWriter printWriter = new PrintWriter(new J("FragmentManager"));
                    c3990aB.t("  ", printWriter, false);
                    printWriter.close();
                }
                this.f31504d.add(c3990aB);
                i10++;
            }
        } else {
            this.f31504d = null;
        }
        this.f31509i.set(yVar.f31546d);
        String str3 = yVar.f31547e;
        if (str3 != null) {
            Fragment fragmentC0 = c0(str3);
            this.f31525y = fragmentC0;
            J(fragmentC0);
        }
        ArrayList arrayList2 = yVar.f31548f;
        if (arrayList2 != null) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                this.f31510j.put((String) arrayList2.get(i11), (C3992c) yVar.f31549g.get(i11));
            }
        }
        this.f31489G = new ArrayDeque(yVar.f31550h);
    }

    public Fragment f0(String str) {
        return this.f31503c.h(str);
    }

    void g(C3990a c3990a) {
        if (this.f31504d == null) {
            this.f31504d = new ArrayList();
        }
        this.f31504d.add(c3990a);
    }

    Fragment g0(String str) {
        return this.f31503c.i(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g1, reason: merged with bridge method [inline-methods] */
    public Bundle M0() {
        C3991b[] c3991bArr;
        int size;
        Bundle bundle = new Bundle();
        j0();
        V();
        Y(true);
        this.f31491I = true;
        this.f31498P.i0(true);
        ArrayList arrayListY = this.f31503c.y();
        ArrayList arrayListM = this.f31503c.m();
        if (!arrayListM.isEmpty()) {
            ArrayList arrayListZ = this.f31503c.z();
            ArrayList arrayList = this.f31504d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                c3991bArr = null;
            } else {
                c3991bArr = new C3991b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    c3991bArr[i10] = new C3991b((C3990a) this.f31504d.get(i10));
                    if (E0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f31504d.get(i10));
                    }
                }
            }
            y yVar = new y();
            yVar.f31543a = arrayListY;
            yVar.f31544b = arrayListZ;
            yVar.f31545c = c3991bArr;
            yVar.f31546d = this.f31509i.get();
            Fragment fragment = this.f31525y;
            if (fragment != null) {
                yVar.f31547e = fragment.f31241f;
            }
            yVar.f31548f.addAll(this.f31510j.keySet());
            yVar.f31549g.addAll(this.f31510j.values());
            yVar.f31550h = new ArrayList(this.f31489G);
            bundle.putParcelable("state", yVar);
            for (String str : this.f31511k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f31511k.get(str));
            }
            Iterator it = arrayListM.iterator();
            while (it.hasNext()) {
                B b10 = (B) it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", b10);
                bundle.putBundle("fragment_" + b10.f31167b, bundle2);
            }
        } else if (E0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    C h(Fragment fragment) {
        String str = fragment.f31246h1;
        if (str != null) {
            V1.b.f(fragment, str);
        }
        if (E0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C cT = t(fragment);
        fragment.f31268t = this;
        this.f31503c.r(cT);
        if (!fragment.f31223B) {
            this.f31503c.a(fragment);
            fragment.f31255m = false;
            if (fragment.f31230I == null) {
                fragment.f31235Z = false;
            }
            if (F0(fragment)) {
                this.f31490H = true;
            }
        }
        return cT;
    }

    void h1() {
        synchronized (this.f31501a) {
            try {
                if (this.f31501a.size() == 1) {
                    this.f31522v.h().removeCallbacks(this.f31500R);
                    this.f31522v.h().post(this.f31500R);
                    p1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i(A a10) {
        this.f31515o.add(a10);
    }

    void i1(Fragment fragment, boolean z10) {
        ViewGroup viewGroupO0 = o0(fragment);
        if (viewGroupO0 == null || !(viewGroupO0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupO0).setDrawDisappearingViewsLast(!z10);
    }

    int j() {
        return this.f31509i.getAndIncrement();
    }

    void j1(Fragment fragment, AbstractC4013k.b bVar) {
        if (fragment.equals(c0(fragment.f31241f)) && (fragment.f31269u == null || fragment.f31268t == this)) {
            fragment.f31248i1 = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void k(o oVar, AbstractC4001l abstractC4001l, Fragment fragment) {
        String str;
        if (this.f31522v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f31522v = oVar;
        this.f31523w = abstractC4001l;
        this.f31524x = fragment;
        if (fragment != null) {
            i(new g(fragment));
        } else if (oVar instanceof A) {
            i((A) oVar);
        }
        if (this.f31524x != null) {
            p1();
        }
        if (oVar instanceof InterfaceC4141J) {
            InterfaceC4141J interfaceC4141J = (InterfaceC4141J) oVar;
            C4138G c4138gB = interfaceC4141J.b();
            this.f31507g = c4138gB;
            InterfaceC4017o interfaceC4017o = interfaceC4141J;
            if (fragment != null) {
                interfaceC4017o = fragment;
            }
            c4138gB.h(interfaceC4017o, this.f31508h);
        }
        if (fragment != null) {
            this.f31498P = fragment.f31268t.m0(fragment);
        } else if (oVar instanceof S) {
            this.f31498P = z.d0(((S) oVar).o());
        } else {
            this.f31498P = new z(false);
        }
        this.f31498P.i0(L0());
        this.f31503c.A(this.f31498P);
        Object obj = this.f31522v;
        if ((obj instanceof InterfaceC7418f) && fragment == null) {
            C7416d c7416dT = ((InterfaceC7418f) obj).t();
            c7416dT.h("android:support:fragments", new C7416d.c() { // from class: androidx.fragment.app.v
                @Override // q2.C7416d.c
                public final Bundle a() {
                    return this.f31481a.M0();
                }
            });
            Bundle bundleB = c7416dT.b("android:support:fragments");
            if (bundleB != null) {
                e1(bundleB);
            }
        }
        Object obj2 = this.f31522v;
        if (obj2 instanceof InterfaceC5489f) {
            AbstractC5488e abstractC5488eL = ((InterfaceC5489f) obj2).l();
            if (fragment != null) {
                str = fragment.f31241f + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f31486D = abstractC5488eL.k(str2 + "StartActivityForResult", new C5839c(), new h());
            this.f31487E = abstractC5488eL.k(str2 + "StartIntentSenderForResult", new j(), new i());
            this.f31488F = abstractC5488eL.k(str2 + "RequestPermissions", new C5838b(), new a());
        }
        Object obj3 = this.f31522v;
        if (obj3 instanceof InterfaceC8022b) {
            ((InterfaceC8022b) obj3).z(this.f31516p);
        }
        Object obj4 = this.f31522v;
        if (obj4 instanceof InterfaceC8023c) {
            ((InterfaceC8023c) obj4).E(this.f31517q);
        }
        Object obj5 = this.f31522v;
        if (obj5 instanceof s1.o) {
            ((s1.o) obj5).L(this.f31518r);
        }
        Object obj6 = this.f31522v;
        if (obj6 instanceof s1.p) {
            ((s1.p) obj6).G(this.f31519s);
        }
        Object obj7 = this.f31522v;
        if ((obj7 instanceof InterfaceC2779w) && fragment == null) {
            ((InterfaceC2779w) obj7).r(this.f31520t);
        }
    }

    void k1(Fragment fragment) {
        if (fragment == null || (fragment.equals(c0(fragment.f31241f)) && (fragment.f31269u == null || fragment.f31268t == this))) {
            Fragment fragment2 = this.f31525y;
            this.f31525y = fragment;
            J(fragment2);
            J(this.f31525y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void l(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f31223B) {
            fragment.f31223B = false;
            if (fragment.f31253l) {
                return;
            }
            this.f31503c.a(fragment);
            if (E0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (F0(fragment)) {
                this.f31490H = true;
            }
        }
    }

    public int l0() {
        ArrayList arrayList = this.f31504d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public E m() {
        return new C3990a(this);
    }

    void m1(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f31222A) {
            fragment.f31222A = false;
            fragment.f31235Z = !fragment.f31235Z;
        }
    }

    boolean n() {
        boolean zF0 = false;
        for (Fragment fragment : this.f31503c.l()) {
            if (fragment != null) {
                zF0 = F0(fragment);
            }
            if (zF0) {
                return true;
            }
        }
        return false;
    }

    AbstractC4001l n0() {
        return this.f31523w;
    }

    public n p0() {
        n nVar = this.f31526z;
        if (nVar != null) {
            return nVar;
        }
        Fragment fragment = this.f31524x;
        return fragment != null ? fragment.f31268t.p0() : this.f31483A;
    }

    public List q0() {
        return this.f31503c.o();
    }

    public o r0() {
        return this.f31522v;
    }

    LayoutInflater.Factory2 s0() {
        return this.f31506f;
    }

    C t(Fragment fragment) {
        C cN = this.f31503c.n(fragment.f31241f);
        if (cN != null) {
            return cN;
        }
        C c10 = new C(this.f31514n, this.f31503c, fragment);
        c10.o(this.f31522v.g().getClassLoader());
        c10.t(this.f31521u);
        return c10;
    }

    q t0() {
        return this.f31514n;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f31524x;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f31524x)));
            sb2.append("}");
        } else {
            o oVar = this.f31522v;
            if (oVar != null) {
                sb2.append(oVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f31522v)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    void u(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.f31223B) {
            return;
        }
        fragment.f31223B = true;
        if (fragment.f31253l) {
            if (E0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f31503c.u(fragment);
            if (F0(fragment)) {
                this.f31490H = true;
            }
            l1(fragment);
        }
    }

    Fragment u0() {
        return this.f31524x;
    }

    void v() {
        this.f31491I = false;
        this.f31492J = false;
        this.f31498P.i0(false);
        Q(4);
    }

    public Fragment v0() {
        return this.f31525y;
    }

    void w() {
        this.f31491I = false;
        this.f31492J = false;
        this.f31498P.i0(false);
        Q(0);
    }

    L w0() {
        L l10 = this.f31484B;
        if (l10 != null) {
            return l10;
        }
        Fragment fragment = this.f31524x;
        return fragment != null ? fragment.f31268t.w0() : this.f31485C;
    }

    void x(Configuration configuration, boolean z10) {
        if (z10 && (this.f31522v instanceof InterfaceC8022b)) {
            o1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f31503c.o()) {
            if (fragment != null) {
                fragment.R0(configuration);
                if (z10) {
                    fragment.f31270v.x(configuration, true);
                }
            }
        }
    }

    public b.c x0() {
        return this.f31499Q;
    }

    boolean y(MenuItem menuItem) {
        if (this.f31521u < 1) {
            return false;
        }
        for (Fragment fragment : this.f31503c.o()) {
            if (fragment != null && fragment.S0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void z() {
        this.f31491I = false;
        this.f31492J = false;
        this.f31498P.i0(false);
        Q(1);
    }

    Q z0(Fragment fragment) {
        return this.f31498P.f0(fragment);
    }

    static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        String f31537a;

        /* renamed from: b, reason: collision with root package name */
        int f31538b;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public k[] newArray(int i10) {
                return new k[i10];
            }
        }

        k(String str, int i10) {
            this.f31537a = str;
            this.f31538b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f31537a);
            parcel.writeInt(this.f31538b);
        }

        k(Parcel parcel) {
            this.f31537a = parcel.readString();
            this.f31538b = parcel.readInt();
        }
    }
}
