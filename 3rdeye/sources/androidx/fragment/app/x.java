package androidx.fragment.app;

import D1.c;
import L0.InterfaceC0778i;
import L0.InterfaceC0783n;
import N7.C1154e9;
import N7.G8;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.B;
import androidx.fragment.app.H;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.InterfaceC1790x;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import c.AbstractC2021s;
import c.C2023u;
import c.InterfaceC2005c;
import c.InterfaceC2025w;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import e.AbstractC4294e;
import e.C4290a;
import e.C4297h;
import e.C4299j;
import e.InterfaceC4291b;
import e.InterfaceC4298i;
import f.AbstractC4328a;
import f.C4329b;
import g0.C4356c;
import g1.C4368b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j1.AbstractC5165a;
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
import z0.InterfaceC5850c;
import z0.InterfaceC5851d;

/* compiled from: FragmentManager.java */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: A, reason: collision with root package name */
    public C4297h f15962A;

    /* renamed from: B, reason: collision with root package name */
    public C4297h f15963B;

    /* renamed from: C, reason: collision with root package name */
    public C4297h f15964C;

    /* renamed from: E, reason: collision with root package name */
    public boolean f15966E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f15967F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f15968G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f15969H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f15970I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList<C1748a> f15971J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList<Boolean> f15972K;

    /* renamed from: L, reason: collision with root package name */
    public ArrayList<ComponentCallbacksC1759l> f15973L;

    /* renamed from: M, reason: collision with root package name */
    public B f15974M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15977b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<C1748a> f15979d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<ComponentCallbacksC1759l> f15980e;

    /* renamed from: g, reason: collision with root package name */
    public C2023u f15982g;

    /* renamed from: q, reason: collision with root package name */
    public final E.x f15991q;

    /* renamed from: r, reason: collision with root package name */
    public final E.y f15992r;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC1766t<?> f15995u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractC1764q f15996v;

    /* renamed from: w, reason: collision with root package name */
    public ComponentCallbacksC1759l f15997w;

    /* renamed from: x, reason: collision with root package name */
    public ComponentCallbacksC1759l f15998x;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<n> f15976a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final G f15978c = new G();

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflaterFactory2C1767u f15981f = new LayoutInflaterFactory2C1767u(this);

    /* renamed from: h, reason: collision with root package name */
    public final b f15983h = new b();
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map<String, C1750c> f15984j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map<String, Bundle> f15985k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    public final Map<String, m> f15986l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    public final v f15987m = new v(this);

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList<C> f15988n = new CopyOnWriteArrayList<>();

    /* renamed from: o, reason: collision with root package name */
    public final E.j f15989o = new E.j(this, 4);

    /* renamed from: p, reason: collision with root package name */
    public final E.k f15990p = new E.k(this, 3);

    /* renamed from: s, reason: collision with root package name */
    public final c f15993s = new c();

    /* renamed from: t, reason: collision with root package name */
    public int f15994t = -1;

    /* renamed from: y, reason: collision with root package name */
    public final d f15999y = new d();

    /* renamed from: z, reason: collision with root package name */
    public final e f16000z = new e();

    /* renamed from: D, reason: collision with root package name */
    public ArrayDeque<l> f15965D = new ArrayDeque<>();

    /* renamed from: N, reason: collision with root package name */
    public final f f15975N = new f();

    /* compiled from: FragmentManager.java */
    public class a implements InterfaceC4291b<Map<String, Boolean>> {
        public a() {
        }

        @Override // e.InterfaceC4291b
        @SuppressLint({"SyntheticAccessor"})
        public final void onActivityResult(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            x xVar = x.this;
            l lVarPollFirst = xVar.f15965D.pollFirst();
            if (lVarPollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            G g10 = xVar.f15978c;
            String str = lVarPollFirst.f16009b;
            ComponentCallbacksC1759l componentCallbacksC1759lC = g10.c(str);
            if (componentCallbacksC1759lC != null) {
                componentCallbacksC1759lC.onRequestPermissionsResult(lVarPollFirst.f16010c, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    /* compiled from: FragmentManager.java */
    public class b extends AbstractC2021s {
        public b() {
            super(false);
        }

        @Override // c.AbstractC2021s
        public final void a() {
            x xVar = x.this;
            xVar.x(true);
            if (xVar.f15983h.f18304a) {
                xVar.M();
            } else {
                xVar.f15982g.d();
            }
        }
    }

    /* compiled from: FragmentManager.java */
    public class c implements InterfaceC0783n {
        public c() {
        }

        @Override // L0.InterfaceC0783n
        public final boolean a(MenuItem menuItem) {
            return x.this.o(menuItem);
        }

        @Override // L0.InterfaceC0783n
        public final void b(Menu menu) {
            x.this.p(menu);
        }

        @Override // L0.InterfaceC0783n
        public final void c(Menu menu, MenuInflater menuInflater) {
            x.this.j(menu, menuInflater);
        }

        @Override // L0.InterfaceC0783n
        public final void d(Menu menu) {
            x.this.s(menu);
        }
    }

    /* compiled from: FragmentManager.java */
    public class d extends C1765s {
        public d() {
        }

        @Override // androidx.fragment.app.C1765s
        public final ComponentCallbacksC1759l a(String str) {
            return ComponentCallbacksC1759l.instantiate(x.this.f15995u.f15952c, str, null);
        }
    }

    /* compiled from: FragmentManager.java */
    public class e implements T {
    }

    /* compiled from: FragmentManager.java */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            x.this.x(true);
        }
    }

    /* compiled from: FragmentManager.java */
    public class g implements C {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacksC1759l f16006b;

        public g(ComponentCallbacksC1759l componentCallbacksC1759l) {
            this.f16006b = componentCallbacksC1759l;
        }

        @Override // androidx.fragment.app.C
        public final void a(ComponentCallbacksC1759l componentCallbacksC1759l) {
            this.f16006b.onAttachFragment(componentCallbacksC1759l);
        }
    }

    /* compiled from: FragmentManager.java */
    public class h implements InterfaceC4291b<C4290a> {
        public h() {
        }

        @Override // e.InterfaceC4291b
        public final void onActivityResult(C4290a c4290a) {
            C4290a c4290a2 = c4290a;
            x xVar = x.this;
            l lVarPollLast = xVar.f15965D.pollLast();
            if (lVarPollLast == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            G g10 = xVar.f15978c;
            String str = lVarPollLast.f16009b;
            ComponentCallbacksC1759l componentCallbacksC1759lC = g10.c(str);
            if (componentCallbacksC1759lC != null) {
                componentCallbacksC1759lC.onActivityResult(lVarPollLast.f16010c, c4290a2.f37602b, c4290a2.f37603c);
            } else {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            }
        }
    }

    /* compiled from: FragmentManager.java */
    public class i implements InterfaceC4291b<C4290a> {
        public i() {
        }

        @Override // e.InterfaceC4291b
        public final void onActivityResult(C4290a c4290a) {
            C4290a c4290a2 = c4290a;
            x xVar = x.this;
            l lVarPollFirst = xVar.f15965D.pollFirst();
            if (lVarPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            G g10 = xVar.f15978c;
            String str = lVarPollFirst.f16009b;
            ComponentCallbacksC1759l componentCallbacksC1759lC = g10.c(str);
            if (componentCallbacksC1759lC != null) {
                componentCallbacksC1759lC.onActivityResult(lVarPollFirst.f16010c, c4290a2.f37602b, c4290a2.f37603c);
            } else {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
            }
        }
    }

    /* compiled from: FragmentManager.java */
    public static class j extends AbstractC4328a<C4299j, C4290a> {
        @Override // f.AbstractC4328a
        public final Intent a(Context context, C4299j c4299j) {
            Bundle bundleExtra;
            C4299j c4299j2 = c4299j;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = c4299j2.f37627c;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSender intentSender = c4299j2.f37626b;
                    kotlin.jvm.internal.l.f(intentSender, "intentSender");
                    c4299j2 = new C4299j(intentSender, null, c4299j2.f37628d, c4299j2.f37629e);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c4299j2);
            if (x.G(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // f.AbstractC4328a
        public final C4290a c(int i, Intent intent) {
            return new C4290a(i, intent);
        }
    }

    /* compiled from: FragmentManager.java */
    public static abstract class k {
        public abstract void a(x xVar, ComponentCallbacksC1759l componentCallbacksC1759l);
    }

    /* compiled from: FragmentManager.java */
    @SuppressLint({"BanParcelableUsage"})
    public static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public String f16009b;

        /* renamed from: c, reason: collision with root package name */
        public int f16010c;

        /* compiled from: FragmentManager.java */
        public class a implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            public final l createFromParcel(Parcel parcel) {
                l lVar = new l();
                lVar.f16009b = parcel.readString();
                lVar.f16010c = parcel.readInt();
                return lVar;
            }

            @Override // android.os.Parcelable.Creator
            public final l[] newArray(int i) {
                return new l[i];
            }
        }

        public l(String str, int i) {
            this.f16009b = str;
            this.f16010c = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f16009b);
            parcel.writeInt(this.f16010c);
        }
    }

    /* compiled from: FragmentManager.java */
    public static class m {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC1781n f16011a;

        /* renamed from: b, reason: collision with root package name */
        public final B4.f f16012b;

        /* renamed from: c, reason: collision with root package name */
        public final y f16013c;

        public m(AbstractC1781n abstractC1781n, B4.f fVar, y yVar) {
            this.f16011a = abstractC1781n;
            this.f16012b = fVar;
            this.f16013c = yVar;
        }
    }

    /* compiled from: FragmentManager.java */
    public interface n {
        boolean a(ArrayList<C1748a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* compiled from: FragmentManager.java */
    public class o implements n {

        /* renamed from: a, reason: collision with root package name */
        public final int f16014a;

        public o(int i) {
            this.f16014a = i;
        }

        @Override // androidx.fragment.app.x.n
        public final boolean a(ArrayList<C1748a> arrayList, ArrayList<Boolean> arrayList2) {
            x xVar = x.this;
            ComponentCallbacksC1759l componentCallbacksC1759l = xVar.f15998x;
            int i = this.f16014a;
            if (componentCallbacksC1759l == null || i >= 0 || !componentCallbacksC1759l.getChildFragmentManager().N(-1, 0)) {
                return xVar.O(arrayList, arrayList2, i, 1);
            }
            return false;
        }
    }

    public x() {
        int i10 = 2;
        this.f15991q = new E.x(this, i10);
        this.f15992r = new E.y(this, i10);
    }

    public static boolean G(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    public static boolean H(ComponentCallbacksC1759l componentCallbacksC1759l) {
        if (componentCallbacksC1759l.mHasMenu && componentCallbacksC1759l.mMenuVisible) {
            return true;
        }
        Iterator it = componentCallbacksC1759l.mChildFragmentManager.f15978c.e().iterator();
        boolean zH = false;
        while (it.hasNext()) {
            ComponentCallbacksC1759l componentCallbacksC1759l2 = (ComponentCallbacksC1759l) it.next();
            if (componentCallbacksC1759l2 != null) {
                zH = H(componentCallbacksC1759l2);
            }
            if (zH) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(ComponentCallbacksC1759l componentCallbacksC1759l) {
        if (componentCallbacksC1759l == null) {
            return true;
        }
        x xVar = componentCallbacksC1759l.mFragmentManager;
        return componentCallbacksC1759l.equals(xVar.f15998x) && J(xVar.f15997w);
    }

    public static void Z(ComponentCallbacksC1759l componentCallbacksC1759l) {
        if (G(2)) {
            Log.v("FragmentManager", "show: " + componentCallbacksC1759l);
        }
        if (componentCallbacksC1759l.mHidden) {
            componentCallbacksC1759l.mHidden = false;
            componentCallbacksC1759l.mHiddenChanged = !componentCallbacksC1759l.mHiddenChanged;
        }
    }

    public final ComponentCallbacksC1759l A(int i10) {
        G g10 = this.f15978c;
        ArrayList<ComponentCallbacksC1759l> arrayList = g10.f15780a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ComponentCallbacksC1759l componentCallbacksC1759l = arrayList.get(size);
            if (componentCallbacksC1759l != null && componentCallbacksC1759l.mFragmentId == i10) {
                return componentCallbacksC1759l;
            }
        }
        for (F f10 : g10.f15781b.values()) {
            if (f10 != null) {
                ComponentCallbacksC1759l componentCallbacksC1759l2 = f10.f15771c;
                if (componentCallbacksC1759l2.mFragmentId == i10) {
                    return componentCallbacksC1759l2;
                }
            }
        }
        return null;
    }

    public final ComponentCallbacksC1759l B(String str) {
        G g10 = this.f15978c;
        if (str != null) {
            ArrayList<ComponentCallbacksC1759l> arrayList = g10.f15780a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ComponentCallbacksC1759l componentCallbacksC1759l = arrayList.get(size);
                if (componentCallbacksC1759l != null && str.equals(componentCallbacksC1759l.mTag)) {
                    return componentCallbacksC1759l;
                }
            }
        }
        if (str == null) {
            g10.getClass();
            return null;
        }
        for (F f10 : g10.f15781b.values()) {
            if (f10 != null) {
                ComponentCallbacksC1759l componentCallbacksC1759l2 = f10.f15771c;
                if (str.equals(componentCallbacksC1759l2.mTag)) {
                    return componentCallbacksC1759l2;
                }
            }
        }
        return null;
    }

    public final ViewGroup C(ComponentCallbacksC1759l componentCallbacksC1759l) {
        ViewGroup viewGroup = componentCallbacksC1759l.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (componentCallbacksC1759l.mContainerId <= 0 || !this.f15996v.c()) {
            return null;
        }
        View viewB = this.f15996v.b(componentCallbacksC1759l.mContainerId);
        if (viewB instanceof ViewGroup) {
            return (ViewGroup) viewB;
        }
        return null;
    }

    public final C1765s D() {
        ComponentCallbacksC1759l componentCallbacksC1759l = this.f15997w;
        return componentCallbacksC1759l != null ? componentCallbacksC1759l.mFragmentManager.D() : this.f15999y;
    }

    public final T E() {
        ComponentCallbacksC1759l componentCallbacksC1759l = this.f15997w;
        return componentCallbacksC1759l != null ? componentCallbacksC1759l.mFragmentManager.E() : this.f16000z;
    }

    public final void F(ComponentCallbacksC1759l componentCallbacksC1759l) {
        if (G(2)) {
            Log.v("FragmentManager", "hide: " + componentCallbacksC1759l);
        }
        if (componentCallbacksC1759l.mHidden) {
            return;
        }
        componentCallbacksC1759l.mHidden = true;
        componentCallbacksC1759l.mHiddenChanged = true ^ componentCallbacksC1759l.mHiddenChanged;
        Y(componentCallbacksC1759l);
    }

    public final boolean I() {
        ComponentCallbacksC1759l componentCallbacksC1759l = this.f15997w;
        if (componentCallbacksC1759l == null) {
            return true;
        }
        return componentCallbacksC1759l.isAdded() && this.f15997w.getParentFragmentManager().I();
    }

    public final void K(int i10, boolean z10) {
        HashMap<String, F> map;
        AbstractC1766t<?> abstractC1766t;
        if (this.f15995u == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f15994t) {
            this.f15994t = i10;
            G g10 = this.f15978c;
            Iterator<ComponentCallbacksC1759l> it = g10.f15780a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = g10.f15781b;
                if (!zHasNext) {
                    break;
                }
                F f10 = map.get(it.next().mWho);
                if (f10 != null) {
                    f10.k();
                }
            }
            for (F f11 : map.values()) {
                if (f11 != null) {
                    f11.k();
                    ComponentCallbacksC1759l componentCallbacksC1759l = f11.f15771c;
                    if (componentCallbacksC1759l.mRemoving && !componentCallbacksC1759l.isInBackStack()) {
                        if (componentCallbacksC1759l.mBeingSaved && !g10.f15782c.containsKey(componentCallbacksC1759l.mWho)) {
                            g10.i(f11.n(), componentCallbacksC1759l.mWho);
                        }
                        g10.h(f11);
                    }
                }
            }
            Iterator it2 = g10.d().iterator();
            while (it2.hasNext()) {
                F f12 = (F) it2.next();
                ComponentCallbacksC1759l componentCallbacksC1759l2 = f12.f15771c;
                if (componentCallbacksC1759l2.mDeferStart) {
                    if (this.f15977b) {
                        this.f15970I = true;
                    } else {
                        componentCallbacksC1759l2.mDeferStart = false;
                        f12.k();
                    }
                }
            }
            if (this.f15966E && (abstractC1766t = this.f15995u) != null && this.f15994t == 7) {
                abstractC1766t.h();
                this.f15966E = false;
            }
        }
    }

    public final void L() {
        if (this.f15995u == null) {
            return;
        }
        this.f15967F = false;
        this.f15968G = false;
        this.f15974M.f15755g = false;
        for (ComponentCallbacksC1759l componentCallbacksC1759l : this.f15978c.f()) {
            if (componentCallbacksC1759l != null) {
                componentCallbacksC1759l.noteStateNotSaved();
            }
        }
    }

    public final boolean M() {
        return N(-1, 0);
    }

    public final boolean N(int i10, int i11) {
        x(false);
        w(true);
        ComponentCallbacksC1759l componentCallbacksC1759l = this.f15998x;
        if (componentCallbacksC1759l != null && i10 < 0 && componentCallbacksC1759l.getChildFragmentManager().M()) {
            return true;
        }
        boolean zO = O(this.f15971J, this.f15972K, i10, i11);
        if (zO) {
            this.f15977b = true;
            try {
                Q(this.f15971J, this.f15972K);
            } finally {
                d();
            }
        }
        b0();
        boolean z10 = this.f15970I;
        G g10 = this.f15978c;
        if (z10) {
            this.f15970I = false;
            Iterator it = g10.d().iterator();
            while (it.hasNext()) {
                F f10 = (F) it.next();
                ComponentCallbacksC1759l componentCallbacksC1759l2 = f10.f15771c;
                if (componentCallbacksC1759l2.mDeferStart) {
                    if (this.f15977b) {
                        this.f15970I = true;
                    } else {
                        componentCallbacksC1759l2.mDeferStart = false;
                        f10.k();
                    }
                }
            }
        }
        g10.f15781b.values().removeAll(Collections.singleton(null));
        return zO;
    }

    public final boolean O(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z10 = (i11 & 1) != 0;
        ArrayList<C1748a> arrayList3 = this.f15979d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i10 < 0) {
                size = z10 ? 0 : this.f15979d.size() - 1;
            } else {
                int size2 = this.f15979d.size() - 1;
                while (size2 >= 0) {
                    C1748a c1748a = this.f15979d.get(size2);
                    if (i10 >= 0 && i10 == c1748a.f15851s) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z10) {
                    size = size2;
                    while (size > 0) {
                        C1748a c1748a2 = this.f15979d.get(size - 1);
                        if (i10 < 0 || i10 != c1748a2.f15851s) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f15979d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f15979d.size() - 1; size3 >= size; size3--) {
            arrayList.add(this.f15979d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void P(ComponentCallbacksC1759l componentCallbacksC1759l) {
        if (G(2)) {
            Log.v("FragmentManager", "remove: " + componentCallbacksC1759l + " nesting=" + componentCallbacksC1759l.mBackStackNesting);
        }
        boolean zIsInBackStack = componentCallbacksC1759l.isInBackStack();
        if (componentCallbacksC1759l.mDetached && zIsInBackStack) {
            return;
        }
        G g10 = this.f15978c;
        synchronized (g10.f15780a) {
            g10.f15780a.remove(componentCallbacksC1759l);
        }
        componentCallbacksC1759l.mAdded = false;
        if (H(componentCallbacksC1759l)) {
            this.f15966E = true;
        }
        componentCallbacksC1759l.mRemoving = true;
        Y(componentCallbacksC1759l);
    }

    public final void Q(ArrayList<C1748a> arrayList, ArrayList<Boolean> arrayList2) {
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
            if (!arrayList.get(i10).f15798p) {
                if (i11 != i10) {
                    z(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f15798p) {
                        i11++;
                    }
                }
                z(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            z(arrayList, arrayList2, i11, size);
        }
    }

    public final void R(Bundle bundle) {
        int i10;
        v vVar;
        int i11;
        F f10;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f15995u.f15952c.getClassLoader());
                this.f15985k.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f15995u.f15952c.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        G g10 = this.f15978c;
        HashMap<String, Bundle> map2 = g10.f15782c;
        map2.clear();
        map2.putAll(map);
        A a10 = (A) bundle.getParcelable("state");
        if (a10 == null) {
            return;
        }
        HashMap<String, F> map3 = g10.f15781b;
        map3.clear();
        Iterator<String> it = a10.f15742b.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i10 = 2;
            vVar = this.f15987m;
            if (!zHasNext) {
                break;
            }
            Bundle bundleI = g10.i(null, it.next());
            if (bundleI != null) {
                ComponentCallbacksC1759l componentCallbacksC1759l = this.f15974M.f15750b.get(((E) bundleI.getParcelable("state")).f15757c);
                if (componentCallbacksC1759l != null) {
                    if (G(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + componentCallbacksC1759l);
                    }
                    f10 = new F(vVar, g10, componentCallbacksC1759l, bundleI);
                } else {
                    f10 = new F(this.f15987m, this.f15978c, this.f15995u.f15952c.getClassLoader(), D(), bundleI);
                }
                ComponentCallbacksC1759l componentCallbacksC1759l2 = f10.f15771c;
                componentCallbacksC1759l2.mSavedFragmentState = bundleI;
                componentCallbacksC1759l2.mFragmentManager = this;
                if (G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + componentCallbacksC1759l2.mWho + "): " + componentCallbacksC1759l2);
                }
                f10.l(this.f15995u.f15952c.getClassLoader());
                g10.g(f10);
                f10.f15773e = this.f15994t;
            }
        }
        B b10 = this.f15974M;
        b10.getClass();
        Iterator it2 = new ArrayList(b10.f15750b.values()).iterator();
        while (it2.hasNext()) {
            ComponentCallbacksC1759l componentCallbacksC1759l3 = (ComponentCallbacksC1759l) it2.next();
            if (map3.get(componentCallbacksC1759l3.mWho) == null) {
                if (G(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + componentCallbacksC1759l3 + " that was not found in the set of active Fragments " + a10.f15742b);
                }
                this.f15974M.i(componentCallbacksC1759l3);
                componentCallbacksC1759l3.mFragmentManager = this;
                F f11 = new F(vVar, g10, componentCallbacksC1759l3);
                f11.f15773e = 1;
                f11.k();
                componentCallbacksC1759l3.mRemoving = true;
                f11.k();
            }
        }
        ArrayList<String> arrayList = a10.f15743c;
        g10.f15780a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                ComponentCallbacksC1759l componentCallbacksC1759lB = g10.b(str3);
                if (componentCallbacksC1759lB == null) {
                    throw new IllegalStateException(C1154e9.i("No instantiated fragment for (", str3, ")"));
                }
                if (G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + componentCallbacksC1759lB);
                }
                g10.a(componentCallbacksC1759lB);
            }
        }
        if (a10.f15744d != null) {
            this.f15979d = new ArrayList<>(a10.f15744d.length);
            int i12 = 0;
            while (true) {
                C1749b[] c1749bArr = a10.f15744d;
                if (i12 >= c1749bArr.length) {
                    break;
                }
                C1749b c1749b = c1749bArr[i12];
                c1749b.getClass();
                C1748a c1748a = new C1748a(this);
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int[] iArr = c1749b.f15852b;
                    if (i13 >= iArr.length) {
                        break;
                    }
                    H.a aVar = new H.a();
                    int i15 = i13 + 1;
                    int i16 = i10;
                    aVar.f15799a = iArr[i13];
                    if (G(i16)) {
                        Log.v("FragmentManager", "Instantiate " + c1748a + " op #" + i14 + " base fragment #" + iArr[i15]);
                    }
                    aVar.f15806h = AbstractC1781n.b.values()[c1749b.f15854d[i14]];
                    aVar.i = AbstractC1781n.b.values()[c1749b.f15855e[i14]];
                    int i17 = i13 + 2;
                    aVar.f15801c = iArr[i15] != 0;
                    int i18 = iArr[i17];
                    aVar.f15802d = i18;
                    int i19 = iArr[i13 + 3];
                    aVar.f15803e = i19;
                    int i20 = i13 + 5;
                    int i21 = iArr[i13 + 4];
                    aVar.f15804f = i21;
                    i13 += 6;
                    int i22 = iArr[i20];
                    aVar.f15805g = i22;
                    c1748a.f15785b = i18;
                    c1748a.f15786c = i19;
                    c1748a.f15787d = i21;
                    c1748a.f15788e = i22;
                    c1748a.b(aVar);
                    i14++;
                    i10 = i16;
                }
                int i23 = i10;
                c1748a.f15789f = c1749b.f15856f;
                c1748a.i = c1749b.f15857g;
                c1748a.f15790g = true;
                c1748a.f15792j = c1749b.i;
                c1748a.f15793k = c1749b.f15859j;
                c1748a.f15794l = c1749b.f15860k;
                c1748a.f15795m = c1749b.f15861l;
                c1748a.f15796n = c1749b.f15862m;
                c1748a.f15797o = c1749b.f15863n;
                c1748a.f15798p = c1749b.f15864o;
                c1748a.f15851s = c1749b.f15858h;
                int i24 = 0;
                while (true) {
                    ArrayList<String> arrayList2 = c1749b.f15853c;
                    if (i24 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = arrayList2.get(i24);
                    if (str4 != null) {
                        c1748a.f15784a.get(i24).f15800b = g10.b(str4);
                    }
                    i24++;
                }
                c1748a.f(1);
                if (G(i23)) {
                    StringBuilder sbJ = C4356c.j(i12, "restoreAllState: back stack #", " (index ");
                    sbJ.append(c1748a.f15851s);
                    sbJ.append("): ");
                    sbJ.append(c1748a);
                    Log.v("FragmentManager", sbJ.toString());
                    PrintWriter printWriter = new PrintWriter(new P());
                    c1748a.h("  ", printWriter, false);
                    printWriter.close();
                }
                this.f15979d.add(c1748a);
                i12++;
                i10 = i23;
            }
            i11 = 0;
        } else {
            i11 = 0;
            this.f15979d = null;
        }
        this.i.set(a10.f15745e);
        String str5 = a10.f15746f;
        if (str5 != null) {
            ComponentCallbacksC1759l componentCallbacksC1759lB2 = g10.b(str5);
            this.f15998x = componentCallbacksC1759lB2;
            q(componentCallbacksC1759lB2);
        }
        ArrayList<String> arrayList3 = a10.f15747g;
        if (arrayList3 != null) {
            for (int i25 = i11; i25 < arrayList3.size(); i25++) {
                this.f15984j.put(arrayList3.get(i25), a10.f15748h.get(i25));
            }
        }
        this.f15965D = new ArrayDeque<>(a10.i);
    }

    public final Bundle S() {
        int i10;
        C1749b[] c1749bArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            S s10 = (S) it.next();
            if (s10.f15837e) {
                if (G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                s10.f15837e = false;
                s10.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((S) it2.next()).e();
        }
        x(true);
        this.f15967F = true;
        this.f15974M.f15755g = true;
        G g10 = this.f15978c;
        g10.getClass();
        HashMap<String, F> map = g10.f15781b;
        ArrayList<String> arrayList2 = new ArrayList<>(map.size());
        for (F f10 : map.values()) {
            if (f10 != null) {
                ComponentCallbacksC1759l componentCallbacksC1759l = f10.f15771c;
                g10.i(f10.n(), componentCallbacksC1759l.mWho);
                arrayList2.add(componentCallbacksC1759l.mWho);
                if (G(2)) {
                    Log.v("FragmentManager", "Saved state of " + componentCallbacksC1759l + ": " + componentCallbacksC1759l.mSavedFragmentState);
                }
            }
        }
        HashMap<String, Bundle> map2 = this.f15978c.f15782c;
        if (!map2.isEmpty()) {
            G g11 = this.f15978c;
            synchronized (g11.f15780a) {
                try {
                    c1749bArr = null;
                    if (g11.f15780a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList<>(g11.f15780a.size());
                        Iterator<ComponentCallbacksC1759l> it3 = g11.f15780a.iterator();
                        while (it3.hasNext()) {
                            ComponentCallbacksC1759l next = it3.next();
                            arrayList.add(next.mWho);
                            if (G(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList<C1748a> arrayList3 = this.f15979d;
            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                c1749bArr = new C1749b[size];
                for (i10 = 0; i10 < size; i10++) {
                    c1749bArr[i10] = new C1749b(this.f15979d.get(i10));
                    if (G(2)) {
                        StringBuilder sbJ = C4356c.j(i10, "saveAllState: adding back stack #", ": ");
                        sbJ.append(this.f15979d.get(i10));
                        Log.v("FragmentManager", sbJ.toString());
                    }
                }
            }
            A a10 = new A();
            a10.f15742b = arrayList2;
            a10.f15743c = arrayList;
            a10.f15744d = c1749bArr;
            a10.f15745e = this.i.get();
            ComponentCallbacksC1759l componentCallbacksC1759l2 = this.f15998x;
            if (componentCallbacksC1759l2 != null) {
                a10.f15746f = componentCallbacksC1759l2.mWho;
            }
            a10.f15747g.addAll(this.f15984j.keySet());
            a10.f15748h.addAll(this.f15984j.values());
            a10.i = new ArrayList<>(this.f15965D);
            bundle.putParcelable("state", a10);
            for (String str : this.f15985k.keySet()) {
                bundle.putBundle(androidx.work.s.d("result_", str), this.f15985k.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(androidx.work.s.d("fragment_", str2), map2.get(str2));
            }
        } else if (G(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void T() {
        synchronized (this.f15976a) {
            try {
                if (this.f15976a.size() == 1) {
                    this.f15995u.f15953d.removeCallbacks(this.f15975N);
                    this.f15995u.f15953d.post(this.f15975N);
                    b0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void U(ComponentCallbacksC1759l componentCallbacksC1759l, boolean z10) {
        ViewGroup viewGroupC = C(componentCallbacksC1759l);
        if (viewGroupC == null || !(viewGroupC instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupC).setDrawDisappearingViewsLast(!z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(android.os.Bundle r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.x$m> r0 = r4.f15986l
            java.lang.String r1 = "REQUEST_ACCOUNT_DELETE"
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.x$m r0 = (androidx.fragment.app.x.m) r0
            if (r0 == 0) goto L20
            androidx.lifecycle.n$b r2 = androidx.lifecycle.AbstractC1781n.b.STARTED
            androidx.lifecycle.n r3 = r0.f16011a
            androidx.lifecycle.n$b r3 = r3.getCurrentState()
            boolean r2 = r3.isAtLeast(r2)
            if (r2 == 0) goto L20
            B4.f r0 = r0.f16012b
            r0.f(r5)
            goto L25
        L20:
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r4.f15985k
            r0.put(r1, r5)
        L25:
            r0 = 2
            boolean r0 = G(r0)
            if (r0 == 0) goto L3f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Setting fragment result with key REQUEST_ACCOUNT_DELETE and result "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r5)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.x.V(android.os.Bundle):void");
    }

    public final void W(ComponentCallbacksC1759l componentCallbacksC1759l, AbstractC1781n.b bVar) {
        if (componentCallbacksC1759l.equals(this.f15978c.b(componentCallbacksC1759l.mWho)) && (componentCallbacksC1759l.mHost == null || componentCallbacksC1759l.mFragmentManager == this)) {
            componentCallbacksC1759l.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC1759l + " is not an active fragment of FragmentManager " + this);
    }

    public final void X(ComponentCallbacksC1759l componentCallbacksC1759l) {
        if (componentCallbacksC1759l != null) {
            if (!componentCallbacksC1759l.equals(this.f15978c.b(componentCallbacksC1759l.mWho)) || (componentCallbacksC1759l.mHost != null && componentCallbacksC1759l.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + componentCallbacksC1759l + " is not an active fragment of FragmentManager " + this);
            }
        }
        ComponentCallbacksC1759l componentCallbacksC1759l2 = this.f15998x;
        this.f15998x = componentCallbacksC1759l;
        q(componentCallbacksC1759l2);
        q(this.f15998x);
    }

    public final void Y(ComponentCallbacksC1759l componentCallbacksC1759l) {
        ViewGroup viewGroupC = C(componentCallbacksC1759l);
        if (viewGroupC != null) {
            if (componentCallbacksC1759l.getPopExitAnim() + componentCallbacksC1759l.getPopEnterAnim() + componentCallbacksC1759l.getExitAnim() + componentCallbacksC1759l.getEnterAnim() > 0) {
                if (viewGroupC.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupC.setTag(R.id.visible_removing_fragment_view_tag, componentCallbacksC1759l);
                }
                ((ComponentCallbacksC1759l) viewGroupC.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(componentCallbacksC1759l.getPopDirection());
            }
        }
    }

    public final F a(ComponentCallbacksC1759l componentCallbacksC1759l) {
        String str = componentCallbacksC1759l.mPreviousWho;
        if (str != null) {
            C4368b.c(componentCallbacksC1759l, str);
        }
        if (G(2)) {
            Log.v("FragmentManager", "add: " + componentCallbacksC1759l);
        }
        F f10 = f(componentCallbacksC1759l);
        componentCallbacksC1759l.mFragmentManager = this;
        G g10 = this.f15978c;
        g10.g(f10);
        if (!componentCallbacksC1759l.mDetached) {
            g10.a(componentCallbacksC1759l);
            componentCallbacksC1759l.mRemoving = false;
            if (componentCallbacksC1759l.mView == null) {
                componentCallbacksC1759l.mHiddenChanged = false;
            }
            if (H(componentCallbacksC1759l)) {
                this.f15966E = true;
            }
        }
        return f10;
    }

    public final void a0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new P());
        AbstractC1766t<?> abstractC1766t = this.f15995u;
        if (abstractC1766t != null) {
            try {
                abstractC1766t.d(printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e4) {
                Log.e("FragmentManager", "Failed dumping state", e4);
                throw illegalStateException;
            }
        }
        try {
            u("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e10) {
            Log.e("FragmentManager", "Failed dumping state", e10);
            throw illegalStateException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    public final void b(AbstractC1766t<?> abstractC1766t, AbstractC1764q abstractC1764q, ComponentCallbacksC1759l componentCallbacksC1759l) {
        if (this.f15995u != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f15995u = abstractC1766t;
        this.f15996v = abstractC1764q;
        this.f15997w = componentCallbacksC1759l;
        CopyOnWriteArrayList<C> copyOnWriteArrayList = this.f15988n;
        if (componentCallbacksC1759l != null) {
            copyOnWriteArrayList.add(new g(componentCallbacksC1759l));
        } else if (abstractC1766t instanceof C) {
            copyOnWriteArrayList.add((C) abstractC1766t);
        }
        if (this.f15997w != null) {
            b0();
        }
        if (abstractC1766t instanceof InterfaceC2025w) {
            InterfaceC2025w interfaceC2025w = (InterfaceC2025w) abstractC1766t;
            C2023u onBackPressedDispatcher = interfaceC2025w.getOnBackPressedDispatcher();
            this.f15982g = onBackPressedDispatcher;
            InterfaceC1790x interfaceC1790x = interfaceC2025w;
            if (componentCallbacksC1759l != null) {
                interfaceC1790x = componentCallbacksC1759l;
            }
            onBackPressedDispatcher.a(interfaceC1790x, this.f15983h);
        }
        if (componentCallbacksC1759l != null) {
            B b10 = componentCallbacksC1759l.mFragmentManager.f15974M;
            HashMap<String, B> map = b10.f15751c;
            B b11 = map.get(componentCallbacksC1759l.mWho);
            if (b11 == null) {
                b11 = new B(b10.f15753e);
                map.put(componentCallbacksC1759l.mWho, b11);
            }
            this.f15974M = b11;
        } else if (abstractC1766t instanceof j0) {
            i0 store = ((j0) abstractC1766t).getViewModelStore();
            B.a aVar = B.f15749h;
            kotlin.jvm.internal.l.f(store, "store");
            AbstractC5165a.C0471a defaultCreationExtras = AbstractC5165a.C0471a.f42677b;
            kotlin.jvm.internal.l.f(defaultCreationExtras, "defaultCreationExtras");
            N5.c cVar = new N5.c(store, aVar, defaultCreationExtras);
            kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.x.a(B.class);
            String strA = eVarA.a();
            if (strA == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f15974M = (B) cVar.f(eVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strA));
        } else {
            this.f15974M = new B(false);
        }
        B b12 = this.f15974M;
        b12.f15755g = this.f15967F || this.f15968G;
        this.f15978c.f15783d = b12;
        Object obj = this.f15995u;
        if ((obj instanceof D1.e) && componentCallbacksC1759l == null) {
            D1.c savedStateRegistry = ((D1.e) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new c.b() { // from class: androidx.fragment.app.w
                @Override // D1.c.b
                public final Bundle a() {
                    return this.f15961a.S();
                }
            });
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                R(bundleA);
            }
        }
        Object obj2 = this.f15995u;
        if (obj2 instanceof InterfaceC4298i) {
            AbstractC4294e activityResultRegistry = ((InterfaceC4298i) obj2).getActivityResultRegistry();
            String strD = androidx.work.s.d("FragmentManager:", componentCallbacksC1759l != null ? B4.f.c(new StringBuilder(), componentCallbacksC1759l.mWho, StringUtils.PROCESS_POSTFIX_DELIMITER) : "");
            this.f15962A = activityResultRegistry.d(G8.s(strD, "StartActivityForResult"), new f.d(), new h());
            this.f15963B = activityResultRegistry.d(G8.s(strD, "StartIntentSenderForResult"), new j(), new i());
            this.f15964C = activityResultRegistry.d(G8.s(strD, "RequestPermissions"), new C4329b(), new a());
        }
        Object obj3 = this.f15995u;
        if (obj3 instanceof InterfaceC5850c) {
            ((InterfaceC5850c) obj3).addOnConfigurationChangedListener(this.f15989o);
        }
        Object obj4 = this.f15995u;
        if (obj4 instanceof InterfaceC5851d) {
            ((InterfaceC5851d) obj4).addOnTrimMemoryListener(this.f15990p);
        }
        Object obj5 = this.f15995u;
        if (obj5 instanceof y0.t) {
            ((y0.t) obj5).addOnMultiWindowModeChangedListener(this.f15991q);
        }
        Object obj6 = this.f15995u;
        if (obj6 instanceof y0.u) {
            ((y0.u) obj6).addOnPictureInPictureModeChangedListener(this.f15992r);
        }
        Object obj7 = this.f15995u;
        if ((obj7 instanceof InterfaceC0778i) && componentCallbacksC1759l == null) {
            ((InterfaceC0778i) obj7).addMenuProvider(this.f15993s);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.k, p9.a] */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlin.jvm.internal.k, p9.a] */
    public final void b0() {
        synchronized (this.f15976a) {
            try {
                if (!this.f15976a.isEmpty()) {
                    b bVar = this.f15983h;
                    bVar.f18304a = true;
                    ?? r12 = bVar.f18306c;
                    if (r12 != 0) {
                        r12.invoke();
                    }
                    return;
                }
                b bVar2 = this.f15983h;
                ArrayList<C1748a> arrayList = this.f15979d;
                bVar2.f18304a = (arrayList != null ? arrayList.size() : 0) > 0 && J(this.f15997w);
                ?? r02 = bVar2.f18306c;
                if (r02 != 0) {
                    r02.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(ComponentCallbacksC1759l componentCallbacksC1759l) {
        if (G(2)) {
            Log.v("FragmentManager", "attach: " + componentCallbacksC1759l);
        }
        if (componentCallbacksC1759l.mDetached) {
            componentCallbacksC1759l.mDetached = false;
            if (componentCallbacksC1759l.mAdded) {
                return;
            }
            this.f15978c.a(componentCallbacksC1759l);
            if (G(2)) {
                Log.v("FragmentManager", "add from attach: " + componentCallbacksC1759l);
            }
            if (H(componentCallbacksC1759l)) {
                this.f15966E = true;
            }
        }
    }

    public final void d() {
        this.f15977b = false;
        this.f15972K.clear();
        this.f15971J.clear();
    }

    public final HashSet e() {
        Object c1754g;
        HashSet hashSet = new HashSet();
        Iterator it = this.f15978c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((F) it.next()).f15771c.mContainer;
            if (viewGroup != null) {
                T factory = E();
                kotlin.jvm.internal.l.f(factory, "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof S) {
                    c1754g = (S) tag;
                } else {
                    c1754g = new C1754g(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c1754g);
                }
                hashSet.add(c1754g);
            }
        }
        return hashSet;
    }

    public final F f(ComponentCallbacksC1759l componentCallbacksC1759l) {
        String str = componentCallbacksC1759l.mWho;
        G g10 = this.f15978c;
        F f10 = g10.f15781b.get(str);
        if (f10 != null) {
            return f10;
        }
        F f11 = new F(this.f15987m, g10, componentCallbacksC1759l);
        f11.l(this.f15995u.f15952c.getClassLoader());
        f11.f15773e = this.f15994t;
        return f11;
    }

    public final void g(ComponentCallbacksC1759l componentCallbacksC1759l) {
        if (G(2)) {
            Log.v("FragmentManager", "detach: " + componentCallbacksC1759l);
        }
        if (componentCallbacksC1759l.mDetached) {
            return;
        }
        componentCallbacksC1759l.mDetached = true;
        if (componentCallbacksC1759l.mAdded) {
            if (G(2)) {
                Log.v("FragmentManager", "remove from detach: " + componentCallbacksC1759l);
            }
            G g10 = this.f15978c;
            synchronized (g10.f15780a) {
                g10.f15780a.remove(componentCallbacksC1759l);
            }
            componentCallbacksC1759l.mAdded = false;
            if (H(componentCallbacksC1759l)) {
                this.f15966E = true;
            }
            Y(componentCallbacksC1759l);
        }
    }

    public final void h(boolean z10, Configuration configuration) {
        if (z10 && (this.f15995u instanceof InterfaceC5850c)) {
            a0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC1759l componentCallbacksC1759l : this.f15978c.f()) {
            if (componentCallbacksC1759l != null) {
                componentCallbacksC1759l.performConfigurationChanged(configuration);
                if (z10) {
                    componentCallbacksC1759l.mChildFragmentManager.h(true, configuration);
                }
            }
        }
    }

    public final boolean i(MenuItem menuItem) {
        if (this.f15994t < 1) {
            return false;
        }
        for (ComponentCallbacksC1759l componentCallbacksC1759l : this.f15978c.f()) {
            if (componentCallbacksC1759l != null && componentCallbacksC1759l.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(Menu menu, MenuInflater menuInflater) {
        if (this.f15994t < 1) {
            return false;
        }
        ArrayList<ComponentCallbacksC1759l> arrayList = null;
        boolean z10 = false;
        for (ComponentCallbacksC1759l componentCallbacksC1759l : this.f15978c.f()) {
            if (componentCallbacksC1759l != null && componentCallbacksC1759l.isMenuVisible() && componentCallbacksC1759l.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(componentCallbacksC1759l);
                z10 = true;
            }
        }
        if (this.f15980e != null) {
            for (int i10 = 0; i10 < this.f15980e.size(); i10++) {
                ComponentCallbacksC1759l componentCallbacksC1759l2 = this.f15980e.get(i10);
                if (arrayList == null || !arrayList.contains(componentCallbacksC1759l2)) {
                    componentCallbacksC1759l2.onDestroyOptionsMenu();
                }
            }
        }
        this.f15980e = arrayList;
        return z10;
    }

    public final void k() {
        boolean zIsChangingConfigurations = true;
        this.f15969H = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((S) it.next()).e();
        }
        AbstractC1766t<?> abstractC1766t = this.f15995u;
        boolean z10 = abstractC1766t instanceof j0;
        G g10 = this.f15978c;
        if (z10) {
            zIsChangingConfigurations = g10.f15783d.f15754f;
        } else {
            ActivityC1762o activityC1762o = abstractC1766t.f15952c;
            if (androidx.work.s.n(activityC1762o)) {
                zIsChangingConfigurations = true ^ activityC1762o.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator<C1750c> it2 = this.f15984j.values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = it2.next().f15865b.iterator();
                while (it3.hasNext()) {
                    g10.f15783d.g((String) it3.next(), false);
                }
            }
        }
        t(-1);
        Object obj = this.f15995u;
        if (obj instanceof InterfaceC5851d) {
            ((InterfaceC5851d) obj).removeOnTrimMemoryListener(this.f15990p);
        }
        Object obj2 = this.f15995u;
        if (obj2 instanceof InterfaceC5850c) {
            ((InterfaceC5850c) obj2).removeOnConfigurationChangedListener(this.f15989o);
        }
        Object obj3 = this.f15995u;
        if (obj3 instanceof y0.t) {
            ((y0.t) obj3).removeOnMultiWindowModeChangedListener(this.f15991q);
        }
        Object obj4 = this.f15995u;
        if (obj4 instanceof y0.u) {
            ((y0.u) obj4).removeOnPictureInPictureModeChangedListener(this.f15992r);
        }
        Object obj5 = this.f15995u;
        if ((obj5 instanceof InterfaceC0778i) && this.f15997w == null) {
            ((InterfaceC0778i) obj5).removeMenuProvider(this.f15993s);
        }
        this.f15995u = null;
        this.f15996v = null;
        this.f15997w = null;
        if (this.f15982g != null) {
            Iterator<InterfaceC2005c> it4 = this.f15983h.f18305b.iterator();
            while (it4.hasNext()) {
                it4.next().cancel();
            }
            this.f15982g = null;
        }
        C4297h c4297h = this.f15962A;
        if (c4297h != null) {
            c4297h.d();
            this.f15963B.d();
            this.f15964C.d();
        }
    }

    public final void l(boolean z10) {
        if (z10 && (this.f15995u instanceof InterfaceC5851d)) {
            a0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (ComponentCallbacksC1759l componentCallbacksC1759l : this.f15978c.f()) {
            if (componentCallbacksC1759l != null) {
                componentCallbacksC1759l.performLowMemory();
                if (z10) {
                    componentCallbacksC1759l.mChildFragmentManager.l(true);
                }
            }
        }
    }

    public final void m(boolean z10, boolean z11) {
        if (z11 && (this.f15995u instanceof y0.t)) {
            a0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC1759l componentCallbacksC1759l : this.f15978c.f()) {
            if (componentCallbacksC1759l != null) {
                componentCallbacksC1759l.performMultiWindowModeChanged(z10);
                if (z11) {
                    componentCallbacksC1759l.mChildFragmentManager.m(z10, true);
                }
            }
        }
    }

    public final void n() {
        Iterator it = this.f15978c.e().iterator();
        while (it.hasNext()) {
            ComponentCallbacksC1759l componentCallbacksC1759l = (ComponentCallbacksC1759l) it.next();
            if (componentCallbacksC1759l != null) {
                componentCallbacksC1759l.onHiddenChanged(componentCallbacksC1759l.isHidden());
                componentCallbacksC1759l.mChildFragmentManager.n();
            }
        }
    }

    public final boolean o(MenuItem menuItem) {
        if (this.f15994t < 1) {
            return false;
        }
        for (ComponentCallbacksC1759l componentCallbacksC1759l : this.f15978c.f()) {
            if (componentCallbacksC1759l != null && componentCallbacksC1759l.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void p(Menu menu) {
        if (this.f15994t < 1) {
            return;
        }
        for (ComponentCallbacksC1759l componentCallbacksC1759l : this.f15978c.f()) {
            if (componentCallbacksC1759l != null) {
                componentCallbacksC1759l.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void q(ComponentCallbacksC1759l componentCallbacksC1759l) {
        if (componentCallbacksC1759l != null) {
            if (componentCallbacksC1759l.equals(this.f15978c.b(componentCallbacksC1759l.mWho))) {
                componentCallbacksC1759l.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void r(boolean z10, boolean z11) {
        if (z11 && (this.f15995u instanceof y0.u)) {
            a0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC1759l componentCallbacksC1759l : this.f15978c.f()) {
            if (componentCallbacksC1759l != null) {
                componentCallbacksC1759l.performPictureInPictureModeChanged(z10);
                if (z11) {
                    componentCallbacksC1759l.mChildFragmentManager.r(z10, true);
                }
            }
        }
    }

    public final boolean s(Menu menu) {
        boolean z10 = false;
        if (this.f15994t < 1) {
            return false;
        }
        for (ComponentCallbacksC1759l componentCallbacksC1759l : this.f15978c.f()) {
            if (componentCallbacksC1759l != null && componentCallbacksC1759l.isMenuVisible() && componentCallbacksC1759l.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void t(int i10) {
        try {
            this.f15977b = true;
            for (F f10 : this.f15978c.f15781b.values()) {
                if (f10 != null) {
                    f10.f15773e = i10;
                }
            }
            K(i10, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((S) it.next()).e();
            }
            this.f15977b = false;
            x(true);
        } catch (Throwable th) {
            this.f15977b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ComponentCallbacksC1759l componentCallbacksC1759l = this.f15997w;
        if (componentCallbacksC1759l != null) {
            sb.append(componentCallbacksC1759l.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f15997w)));
            sb.append("}");
        } else {
            AbstractC1766t<?> abstractC1766t = this.f15995u;
            if (abstractC1766t != null) {
                sb.append(abstractC1766t.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f15995u)));
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
        String strS = G8.s(str, "    ");
        G g10 = this.f15978c;
        g10.getClass();
        String str2 = str + "    ";
        HashMap<String, F> map = g10.f15781b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (F f10 : map.values()) {
                printWriter.print(str);
                if (f10 != null) {
                    ComponentCallbacksC1759l componentCallbacksC1759l = f10.f15771c;
                    printWriter.println(componentCallbacksC1759l);
                    componentCallbacksC1759l.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList<ComponentCallbacksC1759l> arrayList = g10.f15780a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                ComponentCallbacksC1759l componentCallbacksC1759l2 = arrayList.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC1759l2.toString());
            }
        }
        ArrayList<ComponentCallbacksC1759l> arrayList2 = this.f15980e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                ComponentCallbacksC1759l componentCallbacksC1759l3 = this.f15980e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC1759l3.toString());
            }
        }
        ArrayList<C1748a> arrayList3 = this.f15979d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                C1748a c1748a = this.f15979d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(c1748a.toString());
                c1748a.h(strS, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f15976a) {
            try {
                int size4 = this.f15976a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size4; i13++) {
                        Object obj = (n) this.f15976a.get(i13);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
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
        printWriter.println(this.f15995u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f15996v);
        if (this.f15997w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f15997w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f15994t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f15967F);
        printWriter.print(" mStopped=");
        printWriter.print(this.f15968G);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f15969H);
        if (this.f15966E) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f15966E);
        }
    }

    public final void v(n nVar, boolean z10) {
        if (!z10) {
            if (this.f15995u == null) {
                if (!this.f15969H) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f15967F || this.f15968G) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f15976a) {
            try {
                if (this.f15995u == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f15976a.add(nVar);
                    T();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z10) {
        if (this.f15977b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f15995u == null) {
            if (!this.f15969H) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f15995u.f15953d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10 && (this.f15967F || this.f15968G)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f15971J == null) {
            this.f15971J = new ArrayList<>();
            this.f15972K = new ArrayList<>();
        }
    }

    public final boolean x(boolean z10) {
        boolean zA;
        w(z10);
        boolean z11 = false;
        while (true) {
            ArrayList<C1748a> arrayList = this.f15971J;
            ArrayList<Boolean> arrayList2 = this.f15972K;
            synchronized (this.f15976a) {
                if (this.f15976a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f15976a.size();
                        zA = false;
                        for (int i10 = 0; i10 < size; i10++) {
                            zA |= this.f15976a.get(i10).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                break;
            }
            this.f15977b = true;
            try {
                Q(this.f15971J, this.f15972K);
                d();
                z11 = true;
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        b0();
        if (this.f15970I) {
            this.f15970I = false;
            Iterator it = this.f15978c.d().iterator();
            while (it.hasNext()) {
                F f10 = (F) it.next();
                ComponentCallbacksC1759l componentCallbacksC1759l = f10.f15771c;
                if (componentCallbacksC1759l.mDeferStart) {
                    if (this.f15977b) {
                        this.f15970I = true;
                    } else {
                        componentCallbacksC1759l.mDeferStart = false;
                        f10.k();
                    }
                }
            }
        }
        this.f15978c.f15781b.values().removeAll(Collections.singleton(null));
        return z11;
    }

    public final void y(C1748a c1748a, boolean z10) {
        if (z10 && (this.f15995u == null || this.f15969H)) {
            return;
        }
        w(z10);
        c1748a.a(this.f15971J, this.f15972K);
        this.f15977b = true;
        try {
            Q(this.f15971J, this.f15972K);
            d();
            b0();
            boolean z11 = this.f15970I;
            G g10 = this.f15978c;
            if (z11) {
                this.f15970I = false;
                Iterator it = g10.d().iterator();
                while (it.hasNext()) {
                    F f10 = (F) it.next();
                    ComponentCallbacksC1759l componentCallbacksC1759l = f10.f15771c;
                    if (componentCallbacksC1759l.mDeferStart) {
                        if (this.f15977b) {
                            this.f15970I = true;
                        } else {
                            componentCallbacksC1759l.mDeferStart = false;
                            f10.k();
                        }
                    }
                }
            }
            g10.f15781b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0225 A[PHI: r13
  0x0225: PHI (r13v9 int) = (r13v8 int), (r13v10 int) binds: [B:102:0x0215, B:107:0x0221] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(java.util.ArrayList<androidx.fragment.app.C1748a> r24, java.util.ArrayList<java.lang.Boolean> r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.x.z(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }
}
