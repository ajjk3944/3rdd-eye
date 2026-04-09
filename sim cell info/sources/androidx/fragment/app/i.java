package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import androidx.lifecycle.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
final class i extends androidx.fragment.app.h implements LayoutInflater.Factory2 {
    static boolean I = false;
    static final Interpolator J = new DecelerateInterpolator(2.5f);
    static final Interpolator K = new DecelerateInterpolator(1.5f);
    ArrayList<androidx.fragment.app.a> A;
    ArrayList<Boolean> B;
    ArrayList<Fragment> C;
    ArrayList<l> F;
    private androidx.fragment.app.k G;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<k> f1616d;

    /* renamed from: e, reason: collision with root package name */
    boolean f1617e;

    /* renamed from: i, reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f1621i;

    /* renamed from: j, reason: collision with root package name */
    ArrayList<Fragment> f1622j;

    /* renamed from: k, reason: collision with root package name */
    private OnBackPressedDispatcher f1623k;

    /* renamed from: m, reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f1625m;

    /* renamed from: n, reason: collision with root package name */
    ArrayList<Integer> f1626n;

    /* renamed from: o, reason: collision with root package name */
    ArrayList<h.b> f1627o;

    /* renamed from: r, reason: collision with root package name */
    androidx.fragment.app.g f1630r;

    /* renamed from: s, reason: collision with root package name */
    androidx.fragment.app.d f1631s;

    /* renamed from: t, reason: collision with root package name */
    Fragment f1632t;

    /* renamed from: u, reason: collision with root package name */
    Fragment f1633u;

    /* renamed from: v, reason: collision with root package name */
    boolean f1634v;

    /* renamed from: w, reason: collision with root package name */
    boolean f1635w;

    /* renamed from: x, reason: collision with root package name */
    boolean f1636x;

    /* renamed from: y, reason: collision with root package name */
    boolean f1637y;

    /* renamed from: z, reason: collision with root package name */
    boolean f1638z;

    /* renamed from: f, reason: collision with root package name */
    int f1618f = 0;

    /* renamed from: g, reason: collision with root package name */
    final ArrayList<Fragment> f1619g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    final HashMap<String, Fragment> f1620h = new HashMap<>();

    /* renamed from: l, reason: collision with root package name */
    private final androidx.activity.b f1624l = new a(false);

    /* renamed from: p, reason: collision with root package name */
    private final CopyOnWriteArrayList<C0012i> f1628p = new CopyOnWriteArrayList<>();

    /* renamed from: q, reason: collision with root package name */
    int f1629q = 0;
    Bundle D = null;
    SparseArray<Parcelable> E = null;
    Runnable H = new b();

    class a extends androidx.activity.b {
        a(boolean z2) {
            super(z2);
        }

        @Override // androidx.activity.b
        public void b() {
            i.this.y0();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.h0();
        }
    }

    class c implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f1641a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f1642b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() throws Resources.NotFoundException {
                if (c.this.f1642b.l() != null) {
                    c.this.f1642b.d1(null);
                    c cVar = c.this;
                    i iVar = i.this;
                    Fragment fragment = cVar.f1642b;
                    iVar.O0(fragment, fragment.H(), 0, 0, false);
                }
            }
        }

        c(ViewGroup viewGroup, Fragment fragment) {
            this.f1641a = viewGroup;
            this.f1642b = fragment;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f1641a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f1645a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1646b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f1647c;

        d(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f1645a = viewGroup;
            this.f1646b = view;
            this.f1647c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
            this.f1645a.endViewTransition(this.f1646b);
            Animator animatorM = this.f1647c.m();
            this.f1647c.e1(null);
            if (animatorM == null || this.f1645a.indexOfChild(this.f1646b) >= 0) {
                return;
            }
            i iVar = i.this;
            Fragment fragment = this.f1647c;
            iVar.O0(fragment, fragment.H(), 0, 0, false);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f1649a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1650b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f1651c;

        e(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f1649a = viewGroup;
            this.f1650b = view;
            this.f1651c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1649a.endViewTransition(this.f1650b);
            animator.removeListener(this);
            Fragment fragment = this.f1651c;
            View view = fragment.H;
            if (view == null || !fragment.f1554z) {
                return;
            }
            view.setVisibility(8);
        }
    }

    class f extends androidx.fragment.app.f {
        f() {
        }

        @Override // androidx.fragment.app.f
        public Fragment a(ClassLoader classLoader, String str) {
            androidx.fragment.app.g gVar = i.this.f1630r;
            return gVar.b(gVar.i(), str, null);
        }
    }

    private static class g {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f1654a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f1655b;

        g(Animator animator) {
            this.f1654a = null;
            this.f1655b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        g(Animation animation) {
            this.f1654a = animation;
            this.f1655b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    private static class h extends AnimationSet implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final ViewGroup f1656b;

        /* renamed from: c, reason: collision with root package name */
        private final View f1657c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f1658d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f1659e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f1660f;

        h(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1660f = true;
            this.f1656b = viewGroup;
            this.f1657c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation) {
            this.f1660f = true;
            if (this.f1658d) {
                return !this.f1659e;
            }
            if (!super.getTransformation(j2, transformation)) {
                this.f1658d = true;
                a0.q.a(this.f1656b, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation, float f2) {
            this.f1660f = true;
            if (this.f1658d) {
                return !this.f1659e;
            }
            if (!super.getTransformation(j2, transformation, f2)) {
                this.f1658d = true;
                a0.q.a(this.f1656b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1658d || !this.f1660f) {
                this.f1656b.endViewTransition(this.f1657c);
                this.f1659e = true;
            } else {
                this.f1660f = false;
                this.f1656b.post(this);
            }
        }
    }

    /* renamed from: androidx.fragment.app.i$i, reason: collision with other inner class name */
    private static final class C0012i {

        /* renamed from: a, reason: collision with root package name */
        final h.a f1661a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f1662b;
    }

    static class j {

        /* renamed from: a, reason: collision with root package name */
        public static final int[] f1663a = {R.attr.name, R.attr.id, R.attr.tag};
    }

    interface k {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    static class l implements Fragment.f {

        /* renamed from: a, reason: collision with root package name */
        final boolean f1664a;

        /* renamed from: b, reason: collision with root package name */
        final androidx.fragment.app.a f1665b;

        /* renamed from: c, reason: collision with root package name */
        private int f1666c;

        l(androidx.fragment.app.a aVar, boolean z2) {
            this.f1664a = z2;
            this.f1665b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.f
        public void a() {
            int i2 = this.f1666c - 1;
            this.f1666c = i2;
            if (i2 != 0) {
                return;
            }
            this.f1665b.f1578s.e1();
        }

        @Override // androidx.fragment.app.Fragment.f
        public void b() {
            this.f1666c++;
        }

        public void c() throws Resources.NotFoundException {
            androidx.fragment.app.a aVar = this.f1665b;
            aVar.f1578s.s(aVar, this.f1664a, false, false);
        }

        public void d() throws Resources.NotFoundException {
            boolean z2 = this.f1666c > 0;
            i iVar = this.f1665b.f1578s;
            int size = iVar.f1619g.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = iVar.f1619g.get(i2);
                fragment.k1(null);
                if (z2 && fragment.R()) {
                    fragment.n1();
                }
            }
            androidx.fragment.app.a aVar = this.f1665b;
            aVar.f1578s.s(aVar, this.f1664a, !z2, true);
        }

        public boolean e() {
            return this.f1666c == 0;
        }
    }

    i() {
    }

    private boolean B0(Fragment fragment) {
        return (fragment.D && fragment.E) || fragment.f1549u.p();
    }

    static g H0(float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(K);
        alphaAnimation.setDuration(220L);
        return new g(alphaAnimation);
    }

    static g J0(float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(J);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(K);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new g(animationSet);
    }

    private void K0(k.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragmentI = bVar.i(i2);
            if (!fragmentI.f1540l) {
                View viewA1 = fragmentI.a1();
                fragmentI.P = viewA1.getAlpha();
                viewA1.setAlpha(0.0f);
            }
        }
    }

    private boolean R0(String str, int i2, int i3) {
        h0();
        f0(true);
        Fragment fragment = this.f1633u;
        if (fragment != null && i2 < 0 && str == null && fragment.o().f()) {
            return true;
        }
        boolean zS0 = S0(this.A, this.B, str, i2, i3);
        if (zS0) {
            this.f1617e = true;
            try {
                W0(this.A, this.B);
            } finally {
                r();
            }
        }
        m1();
        d0();
        o();
        return zS0;
    }

    private int T0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, k.b<Fragment> bVar) throws Resources.NotFoundException {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            androidx.fragment.app.a aVar = arrayList.get(i5);
            boolean zBooleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.t() && !aVar.r(arrayList, i5 + 1, i3)) {
                if (this.F == null) {
                    this.F = new ArrayList<>();
                }
                l lVar = new l(aVar, zBooleanValue);
                this.F.add(lVar);
                aVar.v(lVar);
                if (zBooleanValue) {
                    aVar.m();
                } else {
                    aVar.n(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                h(bVar);
            }
        }
        return i4;
    }

    private void U(Fragment fragment) {
        if (fragment == null || this.f1620h.get(fragment.f1534f) != fragment) {
            return;
        }
        fragment.T0();
    }

    private void W0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) throws Resources.NotFoundException {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        l0(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).f1713q) {
                if (i3 != i2) {
                    k0(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).f1713q) {
                        i3++;
                    }
                }
                k0(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            k0(arrayList, arrayList2, i3, size);
        }
    }

    public static int a1(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void b0(int i2) {
        try {
            this.f1617e = true;
            M0(i2, false);
            this.f1617e = false;
            h0();
        } catch (Throwable th) {
            this.f1617e = false;
            throw th;
        }
    }

    private void e0() throws Resources.NotFoundException {
        for (Fragment fragment : this.f1620h.values()) {
            if (fragment != null) {
                if (fragment.l() != null) {
                    int iH = fragment.H();
                    View viewL = fragment.l();
                    Animation animation = viewL.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        viewL.clearAnimation();
                    }
                    fragment.d1(null);
                    O0(fragment, iH, 0, 0, false);
                } else if (fragment.m() != null) {
                    fragment.m().end();
                }
            }
        }
    }

    private void f0(boolean z2) {
        if (this.f1617e) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1630r == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.f1630r.j().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2) {
            q();
        }
        if (this.A == null) {
            this.A = new ArrayList<>();
            this.B = new ArrayList<>();
        }
        this.f1617e = true;
        try {
            l0(null, null);
        } finally {
            this.f1617e = false;
        }
    }

    private void h(k.b<Fragment> bVar) throws Resources.NotFoundException {
        int i2 = this.f1629q;
        if (i2 < 1) {
            return;
        }
        int iMin = Math.min(i2, 3);
        int size = this.f1619g.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.f1619g.get(i3);
            if (fragment.f1530b < iMin) {
                O0(fragment, iMin, fragment.x(), fragment.y(), false);
                if (fragment.H != null && !fragment.f1554z && fragment.N) {
                    bVar.add(fragment);
                }
            }
        }
    }

    private static void j0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            androidx.fragment.app.a aVar = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                aVar.j(-1);
                aVar.n(i2 == i3 + (-1));
            } else {
                aVar.j(1);
                aVar.m();
            }
            i2++;
        }
    }

    private void k0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) throws Resources.NotFoundException {
        int i4;
        int i5;
        int i6 = i2;
        boolean z2 = arrayList.get(i6).f1713q;
        ArrayList<Fragment> arrayList3 = this.C;
        if (arrayList3 == null) {
            this.C = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.C.addAll(this.f1619g);
        Fragment fragmentW0 = w0();
        boolean z3 = false;
        for (int i7 = i6; i7 < i3; i7++) {
            androidx.fragment.app.a aVar = arrayList.get(i7);
            fragmentW0 = !arrayList2.get(i7).booleanValue() ? aVar.o(this.C, fragmentW0) : aVar.w(this.C, fragmentW0);
            z3 = z3 || aVar.f1704h;
        }
        this.C.clear();
        if (!z2) {
            o.B(this, arrayList, arrayList2, i2, i3, false);
        }
        j0(arrayList, arrayList2, i2, i3);
        if (z2) {
            k.b<Fragment> bVar = new k.b<>();
            h(bVar);
            int iT0 = T0(arrayList, arrayList2, i2, i3, bVar);
            K0(bVar);
            i4 = iT0;
        } else {
            i4 = i3;
        }
        if (i4 != i6 && z2) {
            o.B(this, arrayList, arrayList2, i2, i4, true);
            M0(this.f1629q, true);
        }
        while (i6 < i3) {
            androidx.fragment.app.a aVar2 = arrayList.get(i6);
            if (arrayList2.get(i6).booleanValue() && (i5 = aVar2.f1580u) >= 0) {
                q0(i5);
                aVar2.f1580u = -1;
            }
            aVar2.u();
            i6++;
        }
        if (z3) {
            Y0();
        }
    }

    private void k1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new z.b("FragmentManager"));
        androidx.fragment.app.g gVar = this.f1630r;
        try {
            if (gVar != null) {
                gVar.l("  ", null, printWriter, new String[0]);
            } else {
                b("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    private void l(Fragment fragment, g gVar, int i2) {
        View view = fragment.H;
        ViewGroup viewGroup = fragment.G;
        viewGroup.startViewTransition(view);
        fragment.l1(i2);
        if (gVar.f1654a != null) {
            h hVar = new h(gVar.f1654a, viewGroup, view);
            fragment.d1(fragment.H);
            hVar.setAnimationListener(new c(viewGroup, fragment));
            fragment.H.startAnimation(hVar);
            return;
        }
        Animator animator = gVar.f1655b;
        fragment.e1(animator);
        animator.addListener(new d(viewGroup, view, fragment));
        animator.setTarget(fragment.H);
        animator.start();
    }

    private void l0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) throws Resources.NotFoundException {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<l> arrayList3 = this.F;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            l lVar = this.F.get(i2);
            if (arrayList == null || lVar.f1664a || (iIndexOf2 = arrayList.indexOf(lVar.f1665b)) == -1 || !arrayList2.get(iIndexOf2).booleanValue()) {
                if (lVar.e() || (arrayList != null && lVar.f1665b.r(arrayList, 0, arrayList.size()))) {
                    this.F.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || lVar.f1664a || (iIndexOf = arrayList.indexOf(lVar.f1665b)) == -1 || !arrayList2.get(iIndexOf).booleanValue()) {
                        lVar.d();
                    }
                }
                i2++;
            } else {
                this.F.remove(i2);
                i2--;
                size--;
            }
            lVar.c();
            i2++;
        }
    }

    public static int l1(int i2, boolean z2) {
        if (i2 == 4097) {
            return z2 ? 1 : 2;
        }
        if (i2 == 4099) {
            return z2 ? 5 : 6;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z2 ? 3 : 4;
    }

    private void m1() {
        ArrayList<k> arrayList = this.f1616d;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f1624l.f(s0() > 0 && C0(this.f1632t));
        } else {
            this.f1624l.f(true);
        }
    }

    private void o() {
        this.f1620h.values().removeAll(Collections.singleton(null));
    }

    private Fragment o0(Fragment fragment) {
        ViewGroup viewGroup = fragment.G;
        View view = fragment.H;
        if (viewGroup != null && view != null) {
            for (int iIndexOf = this.f1619g.indexOf(fragment) - 1; iIndexOf >= 0; iIndexOf--) {
                Fragment fragment2 = this.f1619g.get(iIndexOf);
                if (fragment2.G == viewGroup && fragment2.H != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private void p0() throws Resources.NotFoundException {
        if (this.F != null) {
            while (!this.F.isEmpty()) {
                this.F.remove(0).d();
            }
        }
    }

    private void q() {
        if (E0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void r() {
        this.f1617e = false;
        this.B.clear();
        this.A.clear();
    }

    private boolean r0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            ArrayList<k> arrayList3 = this.f1616d;
            if (arrayList3 != null && arrayList3.size() != 0) {
                int size = this.f1616d.size();
                boolean zA = false;
                for (int i2 = 0; i2 < size; i2++) {
                    zA |= this.f1616d.get(i2).a(arrayList, arrayList2);
                }
                this.f1616d.clear();
                this.f1630r.j().removeCallbacks(this.H);
                return zA;
            }
            return false;
        }
    }

    public void A() {
        this.f1637y = true;
        h0();
        b0(0);
        this.f1630r = null;
        this.f1631s = null;
        this.f1632t = null;
        if (this.f1623k != null) {
            this.f1624l.d();
            this.f1623k = null;
        }
    }

    public boolean A0() {
        return this.f1637y;
    }

    public void B() {
        b0(1);
    }

    public void C() {
        for (int i2 = 0; i2 < this.f1619g.size(); i2++) {
            Fragment fragment = this.f1619g.get(i2);
            if (fragment != null) {
                fragment.M0();
            }
        }
    }

    boolean C0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        i iVar = fragment.f1547s;
        return fragment == iVar.w0() && C0(iVar.f1632t);
    }

    public void D(boolean z2) {
        for (int size = this.f1619g.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1619g.get(size);
            if (fragment != null) {
                fragment.N0(z2);
            }
        }
    }

    boolean D0(int i2) {
        return this.f1629q >= i2;
    }

    void E(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.f1632t;
        if (fragment2 != null) {
            androidx.fragment.app.h hVarU = fragment2.u();
            if (hVarU instanceof i) {
                ((i) hVarU).E(fragment, bundle, true);
            }
        }
        Iterator<C0012i> it = this.f1628p.iterator();
        while (it.hasNext()) {
            C0012i next = it.next();
            if (!z2 || next.f1662b) {
                h.a aVar = next.f1661a;
                throw null;
            }
        }
    }

    public boolean E0() {
        return this.f1635w || this.f1636x;
    }

    void F(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.f1632t;
        if (fragment2 != null) {
            androidx.fragment.app.h hVarU = fragment2.u();
            if (hVarU instanceof i) {
                ((i) hVarU).F(fragment, context, true);
            }
        }
        Iterator<C0012i> it = this.f1628p.iterator();
        while (it.hasNext()) {
            C0012i next = it.next();
            if (!z2 || next.f1662b) {
                h.a aVar = next.f1661a;
                throw null;
            }
        }
    }

    g F0(Fragment fragment, int i2, boolean z2, int i3) throws Resources.NotFoundException {
        int iL1;
        int iX = fragment.x();
        boolean z3 = false;
        fragment.i1(0);
        ViewGroup viewGroup = fragment.G;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation animationB0 = fragment.b0(i2, z2, iX);
        if (animationB0 != null) {
            return new g(animationB0);
        }
        Animator animatorC0 = fragment.c0(i2, z2, iX);
        if (animatorC0 != null) {
            return new g(animatorC0);
        }
        if (iX != 0) {
            boolean zEquals = "anim".equals(this.f1630r.i().getResources().getResourceTypeName(iX));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f1630r.i(), iX);
                    if (animationLoadAnimation != null) {
                        return new g(animationLoadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this.f1630r.i(), iX);
                    if (animatorLoadAnimator != null) {
                        return new g(animatorLoadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (zEquals) {
                        throw e3;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(this.f1630r.i(), iX);
                    if (animationLoadAnimation2 != null) {
                        return new g(animationLoadAnimation2);
                    }
                }
            }
        }
        if (i2 == 0 || (iL1 = l1(i2, z2)) < 0) {
            return null;
        }
        switch (iL1) {
            case 1:
                return J0(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return J0(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return J0(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return J0(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return H0(0.0f, 1.0f);
            case 6:
                return H0(1.0f, 0.0f);
            default:
                if (i3 == 0 && this.f1630r.p()) {
                    this.f1630r.o();
                }
                return null;
        }
    }

    void G(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.f1632t;
        if (fragment2 != null) {
            androidx.fragment.app.h hVarU = fragment2.u();
            if (hVarU instanceof i) {
                ((i) hVarU).G(fragment, bundle, true);
            }
        }
        Iterator<C0012i> it = this.f1628p.iterator();
        while (it.hasNext()) {
            C0012i next = it.next();
            if (!z2 || next.f1662b) {
                h.a aVar = next.f1661a;
                throw null;
            }
        }
    }

    void G0(Fragment fragment) {
        if (this.f1620h.get(fragment.f1534f) != null) {
            return;
        }
        this.f1620h.put(fragment.f1534f, fragment);
        if (fragment.C) {
            if (fragment.B) {
                k(fragment);
            } else {
                X0(fragment);
            }
            fragment.C = false;
        }
        if (I) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    void H(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f1632t;
        if (fragment2 != null) {
            androidx.fragment.app.h hVarU = fragment2.u();
            if (hVarU instanceof i) {
                ((i) hVarU).H(fragment, true);
            }
        }
        Iterator<C0012i> it = this.f1628p.iterator();
        while (it.hasNext()) {
            C0012i next = it.next();
            if (!z2 || next.f1662b) {
                h.a aVar = next.f1661a;
                throw null;
            }
        }
    }

    void I(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f1632t;
        if (fragment2 != null) {
            androidx.fragment.app.h hVarU = fragment2.u();
            if (hVarU instanceof i) {
                ((i) hVarU).I(fragment, true);
            }
        }
        Iterator<C0012i> it = this.f1628p.iterator();
        while (it.hasNext()) {
            C0012i next = it.next();
            if (!z2 || next.f1662b) {
                h.a aVar = next.f1661a;
                throw null;
            }
        }
    }

    void I0(Fragment fragment) {
        if (this.f1620h.get(fragment.f1534f) == null) {
            return;
        }
        if (I) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
        for (Fragment fragment2 : this.f1620h.values()) {
            if (fragment2 != null && fragment.f1534f.equals(fragment2.f1537i)) {
                fragment2.f1536h = fragment;
                fragment2.f1537i = null;
            }
        }
        this.f1620h.put(fragment.f1534f, null);
        X0(fragment);
        String str = fragment.f1537i;
        if (str != null) {
            fragment.f1536h = this.f1620h.get(str);
        }
        fragment.L();
    }

    void J(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f1632t;
        if (fragment2 != null) {
            androidx.fragment.app.h hVarU = fragment2.u();
            if (hVarU instanceof i) {
                ((i) hVarU).J(fragment, true);
            }
        }
        Iterator<C0012i> it = this.f1628p.iterator();
        while (it.hasNext()) {
            C0012i next = it.next();
            if (!z2 || next.f1662b) {
                h.a aVar = next.f1661a;
                throw null;
            }
        }
    }

    void K(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.f1632t;
        if (fragment2 != null) {
            androidx.fragment.app.h hVarU = fragment2.u();
            if (hVarU instanceof i) {
                ((i) hVarU).K(fragment, context, true);
            }
        }
        Iterator<C0012i> it = this.f1628p.iterator();
        while (it.hasNext()) {
            C0012i next = it.next();
            if (!z2 || next.f1662b) {
                h.a aVar = next.f1661a;
                throw null;
            }
        }
    }

    void L(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.f1632t;
        if (fragment2 != null) {
            androidx.fragment.app.h hVarU = fragment2.u();
            if (hVarU instanceof i) {
                ((i) hVarU).L(fragment, bundle, true);
            }
        }
        Iterator<C0012i> it = this.f1628p.iterator();
        while (it.hasNext()) {
            C0012i next = it.next();
            if (!z2 || next.f1662b) {
                h.a aVar = next.f1661a;
                throw null;
            }
        }
    }

    void L0(Fragment fragment) throws Resources.NotFoundException {
        if (fragment == null) {
            return;
        }
        if (!this.f1620h.containsKey(fragment.f1534f)) {
            if (I) {
                Log.v("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f1629q + "since it is not added to " + this);
                return;
            }
            return;
        }
        int iMin = this.f1629q;
        if (fragment.f1541m) {
            iMin = fragment.Q() ? Math.min(iMin, 1) : Math.min(iMin, 0);
        }
        O0(fragment, iMin, fragment.y(), fragment.z(), false);
        if (fragment.H != null) {
            Fragment fragmentO0 = o0(fragment);
            if (fragmentO0 != null) {
                View view = fragmentO0.H;
                ViewGroup viewGroup = fragment.G;
                int iIndexOfChild = viewGroup.indexOfChild(view);
                int iIndexOfChild2 = viewGroup.indexOfChild(fragment.H);
                if (iIndexOfChild2 < iIndexOfChild) {
                    viewGroup.removeViewAt(iIndexOfChild2);
                    viewGroup.addView(fragment.H, iIndexOfChild);
                }
            }
            if (fragment.N && fragment.G != null) {
                float f2 = fragment.P;
                if (f2 > 0.0f) {
                    fragment.H.setAlpha(f2);
                }
                fragment.P = 0.0f;
                fragment.N = false;
                g gVarF0 = F0(fragment, fragment.y(), true, fragment.z());
                if (gVarF0 != null) {
                    Animation animation = gVarF0.f1654a;
                    if (animation != null) {
                        fragment.H.startAnimation(animation);
                    } else {
                        gVarF0.f1655b.setTarget(fragment.H);
                        gVarF0.f1655b.start();
                    }
                }
            }
        }
        if (fragment.O) {
            t(fragment);
        }
    }

    void M(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f1632t;
        if (fragment2 != null) {
            androidx.fragment.app.h hVarU = fragment2.u();
            if (hVarU instanceof i) {
                ((i) hVarU).M(fragment, true);
            }
        }
        Iterator<C0012i> it = this.f1628p.iterator();
        while (it.hasNext()) {
            C0012i next = it.next();
            if (!z2 || next.f1662b) {
                h.a aVar = next.f1661a;
                throw null;
            }
        }
    }

    void M0(int i2, boolean z2) throws Resources.NotFoundException {
        androidx.fragment.app.g gVar;
        if (this.f1630r == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i2 != this.f1629q) {
            this.f1629q = i2;
            int size = this.f1619g.size();
            for (int i3 = 0; i3 < size; i3++) {
                L0(this.f1619g.get(i3));
            }
            for (Fragment fragment : this.f1620h.values()) {
                if (fragment != null && (fragment.f1541m || fragment.A)) {
                    if (!fragment.N) {
                        L0(fragment);
                    }
                }
            }
            j1();
            if (this.f1634v && (gVar = this.f1630r) != null && this.f1629q == 4) {
                gVar.r();
                this.f1634v = false;
            }
        }
    }

    void N(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.f1632t;
        if (fragment2 != null) {
            androidx.fragment.app.h hVarU = fragment2.u();
            if (hVarU instanceof i) {
                ((i) hVarU).N(fragment, bundle, true);
            }
        }
        Iterator<C0012i> it = this.f1628p.iterator();
        while (it.hasNext()) {
            C0012i next = it.next();
            if (!z2 || next.f1662b) {
                h.a aVar = next.f1661a;
                throw null;
            }
        }
    }

    void N0(Fragment fragment) throws Resources.NotFoundException {
        O0(fragment, this.f1629q, 0, 0, false);
    }

    void O(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f1632t;
        if (fragment2 != null) {
            androidx.fragment.app.h hVarU = fragment2.u();
            if (hVarU instanceof i) {
                ((i) hVarU).O(fragment, true);
            }
        }
        Iterator<C0012i> it = this.f1628p.iterator();
        while (it.hasNext()) {
            C0012i next = it.next();
            if (!z2 || next.f1662b) {
                h.a aVar = next.f1661a;
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:272:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void O0(androidx.fragment.app.Fragment r19, int r20, int r21, int r22, boolean r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.i.O0(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    void P(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f1632t;
        if (fragment2 != null) {
            androidx.fragment.app.h hVarU = fragment2.u();
            if (hVarU instanceof i) {
                ((i) hVarU).P(fragment, true);
            }
        }
        Iterator<C0012i> it = this.f1628p.iterator();
        while (it.hasNext()) {
            C0012i next = it.next();
            if (!z2 || next.f1662b) {
                h.a aVar = next.f1661a;
                throw null;
            }
        }
    }

    public void P0() {
        this.f1635w = false;
        this.f1636x = false;
        int size = this.f1619g.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f1619g.get(i2);
            if (fragment != null) {
                fragment.T();
            }
        }
    }

    void Q(Fragment fragment, View view, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.f1632t;
        if (fragment2 != null) {
            androidx.fragment.app.h hVarU = fragment2.u();
            if (hVarU instanceof i) {
                ((i) hVarU).Q(fragment, view, bundle, true);
            }
        }
        Iterator<C0012i> it = this.f1628p.iterator();
        while (it.hasNext()) {
            C0012i next = it.next();
            if (!z2 || next.f1662b) {
                h.a aVar = next.f1661a;
                throw null;
            }
        }
    }

    public void Q0(Fragment fragment) {
        if (fragment.J) {
            if (this.f1617e) {
                this.f1638z = true;
            } else {
                fragment.J = false;
                O0(fragment, this.f1629q, 0, 0, false);
            }
        }
    }

    void R(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f1632t;
        if (fragment2 != null) {
            androidx.fragment.app.h hVarU = fragment2.u();
            if (hVarU instanceof i) {
                ((i) hVarU).R(fragment, true);
            }
        }
        Iterator<C0012i> it = this.f1628p.iterator();
        while (it.hasNext()) {
            C0012i next = it.next();
            if (!z2 || next.f1662b) {
                h.a aVar = next.f1661a;
                throw null;
            }
        }
    }

    public boolean S(MenuItem menuItem) {
        if (this.f1629q < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f1619g.size(); i2++) {
            Fragment fragment = this.f1619g.get(i2);
            if (fragment != null && fragment.O0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean S0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f1621i;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1621i.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.f1621i.get(size2);
                    if ((str != null && str.equals(aVar.p())) || (i2 >= 0 && i2 == aVar.f1580u)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.f1621i.get(size2);
                        if (str == null || !str.equals(aVar2.p())) {
                            if (i2 < 0 || i2 != aVar2.f1580u) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.f1621i.size() - 1) {
                return false;
            }
            for (int size3 = this.f1621i.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f1621i.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void T(Menu menu) {
        if (this.f1629q < 1) {
            return;
        }
        for (int i2 = 0; i2 < this.f1619g.size(); i2++) {
            Fragment fragment = this.f1619g.get(i2);
            if (fragment != null) {
                fragment.P0(menu);
            }
        }
    }

    public void U0(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f1547s != this) {
            k1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.f1534f);
    }

    public void V() {
        b0(3);
    }

    public void V0(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f1546r);
        }
        boolean z2 = !fragment.Q();
        if (!fragment.A || z2) {
            synchronized (this.f1619g) {
                this.f1619g.remove(fragment);
            }
            if (B0(fragment)) {
                this.f1634v = true;
            }
            fragment.f1540l = false;
            fragment.f1541m = true;
        }
    }

    public void W(boolean z2) {
        for (int size = this.f1619g.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1619g.get(size);
            if (fragment != null) {
                fragment.R0(z2);
            }
        }
    }

    public boolean X(Menu menu) {
        if (this.f1629q < 1) {
            return false;
        }
        boolean z2 = false;
        for (int i2 = 0; i2 < this.f1619g.size(); i2++) {
            Fragment fragment = this.f1619g.get(i2);
            if (fragment != null && fragment.S0(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    void X0(Fragment fragment) {
        if (E0()) {
            if (I) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.G.k(fragment) && I) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    void Y() {
        m1();
        U(this.f1633u);
    }

    void Y0() {
        if (this.f1627o != null) {
            for (int i2 = 0; i2 < this.f1627o.size(); i2++) {
                this.f1627o.get(i2).a();
            }
        }
    }

    public void Z() {
        this.f1635w = false;
        this.f1636x = false;
        b0(4);
    }

    void Z0(Parcelable parcelable) {
        m next;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.j jVar = (androidx.fragment.app.j) parcelable;
        if (jVar.f1667b == null) {
            return;
        }
        for (Fragment fragment : this.G.h()) {
            if (I) {
                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
            }
            Iterator<m> it = jVar.f1667b.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (next.f1684c.equals(fragment.f1534f)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next == null) {
                if (I) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + jVar.f1667b);
                }
                O0(fragment, 1, 0, 0, false);
                fragment.f1541m = true;
                O0(fragment, 0, 0, 0, false);
            } else {
                next.f1696o = fragment;
                fragment.f1532d = null;
                fragment.f1546r = 0;
                fragment.f1543o = false;
                fragment.f1540l = false;
                Fragment fragment2 = fragment.f1536h;
                fragment.f1537i = fragment2 != null ? fragment2.f1534f : null;
                fragment.f1536h = null;
                Bundle bundle = next.f1695n;
                if (bundle != null) {
                    bundle.setClassLoader(this.f1630r.i().getClassLoader());
                    fragment.f1532d = next.f1695n.getSparseParcelableArray("android:view_state");
                    fragment.f1531c = next.f1695n;
                }
            }
        }
        this.f1620h.clear();
        Iterator<m> it2 = jVar.f1667b.iterator();
        while (it2.hasNext()) {
            m next2 = it2.next();
            if (next2 != null) {
                Fragment fragmentA = next2.a(this.f1630r.i().getClassLoader(), d());
                fragmentA.f1547s = this;
                if (I) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentA.f1534f + "): " + fragmentA);
                }
                this.f1620h.put(fragmentA.f1534f, fragmentA);
                next2.f1696o = null;
            }
        }
        this.f1619g.clear();
        ArrayList<String> arrayList = jVar.f1668c;
        if (arrayList != null) {
            Iterator<String> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String next3 = it3.next();
                Fragment fragment3 = this.f1620h.get(next3);
                if (fragment3 == null) {
                    k1(new IllegalStateException("No instantiated fragment for (" + next3 + ")"));
                }
                fragment3.f1540l = true;
                if (I) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + next3 + "): " + fragment3);
                }
                if (this.f1619g.contains(fragment3)) {
                    throw new IllegalStateException("Already added " + fragment3);
                }
                synchronized (this.f1619g) {
                    this.f1619g.add(fragment3);
                }
            }
        }
        if (jVar.f1669d != null) {
            this.f1621i = new ArrayList<>(jVar.f1669d.length);
            int i2 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = jVar.f1669d;
                if (i2 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarA = bVarArr[i2].a(this);
                if (I) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + aVarA.f1580u + "): " + aVarA);
                    PrintWriter printWriter = new PrintWriter(new z.b("FragmentManager"));
                    aVarA.l("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1621i.add(aVarA);
                int i3 = aVarA.f1580u;
                if (i3 >= 0) {
                    f1(i3, aVarA);
                }
                i2++;
            }
        } else {
            this.f1621i = null;
        }
        String str = jVar.f1670e;
        if (str != null) {
            Fragment fragment4 = this.f1620h.get(str);
            this.f1633u = fragment4;
            U(fragment4);
        }
        this.f1618f = jVar.f1671f;
    }

    @Override // androidx.fragment.app.h
    public n a() {
        return new androidx.fragment.app.a(this);
    }

    public void a0() {
        this.f1635w = false;
        this.f1636x = false;
        b0(3);
    }

    @Override // androidx.fragment.app.h
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String str2 = str + "    ";
        if (!this.f1620h.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.f1620h.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.f(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.f1619g.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size5; i2++) {
                Fragment fragment2 = this.f1619g.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f1622j;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                Fragment fragment3 = this.f1622j.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f1621i;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                androidx.fragment.app.a aVar = this.f1621i.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.k(str2, printWriter);
            }
        }
        synchronized (this) {
            ArrayList<androidx.fragment.app.a> arrayList3 = this.f1625m;
            if (arrayList3 != null && (size2 = arrayList3.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    Object obj = (androidx.fragment.app.a) this.f1625m.get(i5);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            ArrayList<Integer> arrayList4 = this.f1626n;
            if (arrayList4 != null && arrayList4.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f1626n.toArray()));
            }
        }
        ArrayList<k> arrayList5 = this.f1616d;
        if (arrayList5 != null && (size = arrayList5.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                Object obj2 = (k) this.f1616d.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1630r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1631s);
        if (this.f1632t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1632t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1629q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1635w);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1636x);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1637y);
        if (this.f1634v) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1634v);
        }
    }

    Parcelable b1() {
        ArrayList<String> arrayList;
        int size;
        p0();
        e0();
        h0();
        this.f1635w = true;
        androidx.fragment.app.b[] bVarArr = null;
        if (this.f1620h.isEmpty()) {
            return null;
        }
        ArrayList<m> arrayList2 = new ArrayList<>(this.f1620h.size());
        boolean z2 = false;
        for (Fragment fragment : this.f1620h.values()) {
            if (fragment != null) {
                if (fragment.f1547s != this) {
                    k1(new IllegalStateException("Failure saving state: active " + fragment + " was removed from the FragmentManager"));
                }
                m mVar = new m(fragment);
                arrayList2.add(mVar);
                if (fragment.f1530b <= 0 || mVar.f1695n != null) {
                    mVar.f1695n = fragment.f1531c;
                } else {
                    mVar.f1695n = c1(fragment);
                    String str = fragment.f1537i;
                    if (str != null) {
                        Fragment fragment2 = this.f1620h.get(str);
                        if (fragment2 == null) {
                            k1(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.f1537i));
                        }
                        if (mVar.f1695n == null) {
                            mVar.f1695n = new Bundle();
                        }
                        U0(mVar.f1695n, "android:target_state", fragment2);
                        int i2 = fragment.f1538j;
                        if (i2 != 0) {
                            mVar.f1695n.putInt("android:target_req_state", i2);
                        }
                    }
                }
                if (I) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + mVar.f1695n);
                }
                z2 = true;
            }
        }
        if (!z2) {
            if (I) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.f1619g.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it = this.f1619g.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f1534f);
                if (next.f1547s != this) {
                    k1(new IllegalStateException("Failure saving state: active " + next + " was removed from the FragmentManager"));
                }
                if (I) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f1534f + "): " + next);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f1621i;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i3 = 0; i3 < size; i3++) {
                bVarArr[i3] = new androidx.fragment.app.b(this.f1621i.get(i3));
                if (I) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.f1621i.get(i3));
                }
            }
        }
        androidx.fragment.app.j jVar = new androidx.fragment.app.j();
        jVar.f1667b = arrayList2;
        jVar.f1668c = arrayList;
        jVar.f1669d = bVarArr;
        Fragment fragment3 = this.f1633u;
        if (fragment3 != null) {
            jVar.f1670e = fragment3.f1534f;
        }
        jVar.f1671f = this.f1618f;
        return jVar;
    }

    @Override // androidx.fragment.app.h
    public Fragment c(String str) {
        if (str != null) {
            for (int size = this.f1619g.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f1619g.get(size);
                if (fragment != null && str.equals(fragment.f1553y)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (Fragment fragment2 : this.f1620h.values()) {
            if (fragment2 != null && str.equals(fragment2.f1553y)) {
                return fragment2;
            }
        }
        return null;
    }

    public void c0() {
        this.f1636x = true;
        b0(2);
    }

    Bundle c1(Fragment fragment) {
        if (this.D == null) {
            this.D = new Bundle();
        }
        fragment.V0(this.D);
        N(fragment, this.D, false);
        Bundle bundle = null;
        if (!this.D.isEmpty()) {
            Bundle bundle2 = this.D;
            this.D = null;
            bundle = bundle2;
        }
        if (fragment.H != null) {
            d1(fragment);
        }
        if (fragment.f1532d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f1532d);
        }
        if (!fragment.K) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.K);
        }
        return bundle;
    }

    @Override // androidx.fragment.app.h
    public androidx.fragment.app.f d() {
        if (super.d() == androidx.fragment.app.h.f1614c) {
            Fragment fragment = this.f1632t;
            if (fragment != null) {
                return fragment.f1547s.d();
            }
            g(new f());
        }
        return super.d();
    }

    void d0() {
        if (this.f1638z) {
            this.f1638z = false;
            j1();
        }
    }

    void d1(Fragment fragment) {
        if (fragment.I == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.E;
        if (sparseArray == null) {
            this.E = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        fragment.I.saveHierarchyState(this.E);
        if (this.E.size() > 0) {
            fragment.f1532d = this.E;
            this.E = null;
        }
    }

    @Override // androidx.fragment.app.h
    public List<Fragment> e() {
        List<Fragment> list;
        if (this.f1619g.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1619g) {
            list = (List) this.f1619g.clone();
        }
        return list;
    }

    void e1() {
        synchronized (this) {
            ArrayList<l> arrayList = this.F;
            boolean z2 = false;
            boolean z3 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            ArrayList<k> arrayList2 = this.f1616d;
            if (arrayList2 != null && arrayList2.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.f1630r.j().removeCallbacks(this.H);
                this.f1630r.j().post(this.H);
                m1();
            }
        }
    }

    @Override // androidx.fragment.app.h
    public boolean f() {
        q();
        return R0(null, -1, 0);
    }

    public void f1(int i2, androidx.fragment.app.a aVar) {
        synchronized (this) {
            if (this.f1625m == null) {
                this.f1625m = new ArrayList<>();
            }
            int size = this.f1625m.size();
            if (i2 < size) {
                if (I) {
                    Log.v("FragmentManager", "Setting back stack index " + i2 + " to " + aVar);
                }
                this.f1625m.set(i2, aVar);
            } else {
                while (size < i2) {
                    this.f1625m.add(null);
                    if (this.f1626n == null) {
                        this.f1626n = new ArrayList<>();
                    }
                    if (I) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f1626n.add(Integer.valueOf(size));
                    size++;
                }
                if (I) {
                    Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + aVar);
                }
                this.f1625m.add(aVar);
            }
        }
    }

    void g0(Fragment fragment) {
        if (!fragment.f1542n || fragment.f1545q) {
            return;
        }
        fragment.H0(fragment.L0(fragment.f1531c), null, fragment.f1531c);
        View view = fragment.H;
        if (view == null) {
            fragment.I = null;
            return;
        }
        fragment.I = view;
        view.setSaveFromParentEnabled(false);
        if (fragment.f1554z) {
            fragment.H.setVisibility(8);
        }
        fragment.z0(fragment.H, fragment.f1531c);
        Q(fragment, fragment.H, fragment.f1531c, false);
    }

    public void g1(Fragment fragment, d.b bVar) {
        if (this.f1620h.get(fragment.f1534f) == fragment && (fragment.f1548t == null || fragment.u() == this)) {
            fragment.S = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public boolean h0() {
        f0(true);
        boolean z2 = false;
        while (r0(this.A, this.B)) {
            this.f1617e = true;
            try {
                W0(this.A, this.B);
                r();
                z2 = true;
            } catch (Throwable th) {
                r();
                throw th;
            }
        }
        m1();
        d0();
        o();
        return z2;
    }

    public void h1(Fragment fragment) {
        if (fragment == null || (this.f1620h.get(fragment.f1534f) == fragment && (fragment.f1548t == null || fragment.u() == this))) {
            Fragment fragment2 = this.f1633u;
            this.f1633u = fragment;
            U(fragment2);
            U(this.f1633u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void i(androidx.fragment.app.a aVar) {
        if (this.f1621i == null) {
            this.f1621i = new ArrayList<>();
        }
        this.f1621i.add(aVar);
    }

    public void i0(k kVar, boolean z2) {
        if (z2 && (this.f1630r == null || this.f1637y)) {
            return;
        }
        f0(z2);
        if (kVar.a(this.A, this.B)) {
            this.f1617e = true;
            try {
                W0(this.A, this.B);
            } finally {
                r();
            }
        }
        m1();
        d0();
        o();
    }

    public void i1(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f1554z) {
            fragment.f1554z = false;
            fragment.O = !fragment.O;
        }
    }

    public void j(Fragment fragment, boolean z2) throws Resources.NotFoundException {
        if (I) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        G0(fragment);
        if (fragment.A) {
            return;
        }
        if (this.f1619g.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f1619g) {
            this.f1619g.add(fragment);
        }
        fragment.f1540l = true;
        fragment.f1541m = false;
        if (fragment.H == null) {
            fragment.O = false;
        }
        if (B0(fragment)) {
            this.f1634v = true;
        }
        if (z2) {
            N0(fragment);
        }
    }

    void j1() {
        for (Fragment fragment : this.f1620h.values()) {
            if (fragment != null) {
                Q0(fragment);
            }
        }
    }

    void k(Fragment fragment) {
        if (E0()) {
            if (I) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.G.d(fragment) && I) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m(androidx.fragment.app.g gVar, androidx.fragment.app.d dVar, Fragment fragment) {
        if (this.f1630r != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1630r = gVar;
        this.f1631s = dVar;
        this.f1632t = fragment;
        if (fragment != null) {
            m1();
        }
        if (gVar instanceof androidx.activity.c) {
            androidx.activity.c cVar = (androidx.activity.c) gVar;
            OnBackPressedDispatcher onBackPressedDispatcherC = cVar.c();
            this.f1623k = onBackPressedDispatcherC;
            androidx.lifecycle.g gVar2 = cVar;
            if (fragment != null) {
                gVar2 = fragment;
            }
            onBackPressedDispatcherC.a(gVar2, this.f1624l);
        }
        this.G = fragment != null ? fragment.f1547s.t0(fragment) : gVar instanceof androidx.lifecycle.s ? androidx.fragment.app.k.g(((androidx.lifecycle.s) gVar).e()) : new androidx.fragment.app.k(false);
    }

    public Fragment m0(int i2) {
        for (int size = this.f1619g.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1619g.get(size);
            if (fragment != null && fragment.f1551w == i2) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.f1620h.values()) {
            if (fragment2 != null && fragment2.f1551w == i2) {
                return fragment2;
            }
        }
        return null;
    }

    public void n(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.A) {
            fragment.A = false;
            if (fragment.f1540l) {
                return;
            }
            if (this.f1619g.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            if (I) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            synchronized (this.f1619g) {
                this.f1619g.add(fragment);
            }
            fragment.f1540l = true;
            if (B0(fragment)) {
                this.f1634v = true;
            }
        }
    }

    public Fragment n0(String str) {
        Fragment fragmentH;
        for (Fragment fragment : this.f1620h.values()) {
            if (fragment != null && (fragmentH = fragment.h(str)) != null) {
                return fragmentH;
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f1663a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (str2 == null || !androidx.fragment.app.f.b(context.getClassLoader(), str2)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        Fragment fragmentM0 = resourceId != -1 ? m0(resourceId) : null;
        if (fragmentM0 == null && string != null) {
            fragmentM0 = c(string);
        }
        if (fragmentM0 == null && id != -1) {
            fragmentM0 = m0(id);
        }
        if (I) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + fragmentM0);
        }
        if (fragmentM0 == null) {
            fragmentM0 = d().a(context.getClassLoader(), str2);
            fragmentM0.f1542n = true;
            fragmentM0.f1551w = resourceId != 0 ? resourceId : id;
            fragmentM0.f1552x = id;
            fragmentM0.f1553y = string;
            fragmentM0.f1543o = true;
            fragmentM0.f1547s = this;
            androidx.fragment.app.g gVar = this.f1630r;
            fragmentM0.f1548t = gVar;
            fragmentM0.m0(gVar.i(), attributeSet, fragmentM0.f1531c);
            j(fragmentM0, true);
        } else {
            if (fragmentM0.f1543o) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
            }
            fragmentM0.f1543o = true;
            androidx.fragment.app.g gVar2 = this.f1630r;
            fragmentM0.f1548t = gVar2;
            fragmentM0.m0(gVar2.i(), attributeSet, fragmentM0.f1531c);
        }
        Fragment fragment = fragmentM0;
        if (this.f1629q >= 1 || !fragment.f1542n) {
            N0(fragment);
        } else {
            O0(fragment, 1, 0, 0, false);
        }
        View view2 = fragment.H;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.H.getTag() == null) {
                fragment.H.setTag(string);
            }
            return fragment.H;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    boolean p() {
        boolean zB0 = false;
        for (Fragment fragment : this.f1620h.values()) {
            if (fragment != null) {
                zB0 = B0(fragment);
            }
            if (zB0) {
                return true;
            }
        }
        return false;
    }

    public void q0(int i2) {
        synchronized (this) {
            this.f1625m.set(i2, null);
            if (this.f1626n == null) {
                this.f1626n = new ArrayList<>();
            }
            if (I) {
                Log.v("FragmentManager", "Freeing back stack index " + i2);
            }
            this.f1626n.add(Integer.valueOf(i2));
        }
    }

    void s(androidx.fragment.app.a aVar, boolean z2, boolean z3, boolean z4) throws Resources.NotFoundException {
        if (z2) {
            aVar.n(z4);
        } else {
            aVar.m();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            o.B(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z4) {
            M0(this.f1629q, true);
        }
        for (Fragment fragment : this.f1620h.values()) {
            if (fragment != null && fragment.H != null && fragment.N && aVar.q(fragment.f1552x)) {
                float f2 = fragment.P;
                if (f2 > 0.0f) {
                    fragment.H.setAlpha(f2);
                }
                if (z4) {
                    fragment.P = 0.0f;
                } else {
                    fragment.P = -1.0f;
                    fragment.N = false;
                }
            }
        }
    }

    public int s0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f1621i;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void t(Fragment fragment) throws Resources.NotFoundException {
        Animator animator;
        if (fragment.H != null) {
            g gVarF0 = F0(fragment, fragment.y(), !fragment.f1554z, fragment.z());
            if (gVarF0 == null || (animator = gVarF0.f1655b) == null) {
                if (gVarF0 != null) {
                    fragment.H.startAnimation(gVarF0.f1654a);
                    gVarF0.f1654a.start();
                }
                fragment.H.setVisibility((!fragment.f1554z || fragment.P()) ? 0 : 8);
                if (fragment.P()) {
                    fragment.g1(false);
                }
            } else {
                animator.setTarget(fragment.H);
                if (!fragment.f1554z) {
                    fragment.H.setVisibility(0);
                } else if (fragment.P()) {
                    fragment.g1(false);
                } else {
                    ViewGroup viewGroup = fragment.G;
                    View view = fragment.H;
                    viewGroup.startViewTransition(view);
                    gVarF0.f1655b.addListener(new e(viewGroup, view, fragment));
                }
                gVarF0.f1655b.start();
            }
        }
        if (fragment.f1540l && B0(fragment)) {
            this.f1634v = true;
        }
        fragment.O = false;
        fragment.k0(fragment.f1554z);
    }

    androidx.fragment.app.k t0(Fragment fragment) {
        return this.G.f(fragment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f1632t;
        if (obj == null) {
            obj = this.f1630r;
        }
        z.a.a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    public void u(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.A) {
            return;
        }
        fragment.A = true;
        if (fragment.f1540l) {
            if (I) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            synchronized (this.f1619g) {
                this.f1619g.remove(fragment);
            }
            if (B0(fragment)) {
                this.f1634v = true;
            }
            fragment.f1540l = false;
        }
    }

    public Fragment u0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = this.f1620h.get(string);
        if (fragment == null) {
            k1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragment;
    }

    public void v() {
        this.f1635w = false;
        this.f1636x = false;
        b0(2);
    }

    LayoutInflater.Factory2 v0() {
        return this;
    }

    public void w(Configuration configuration) {
        for (int i2 = 0; i2 < this.f1619g.size(); i2++) {
            Fragment fragment = this.f1619g.get(i2);
            if (fragment != null) {
                fragment.D0(configuration);
            }
        }
    }

    public Fragment w0() {
        return this.f1633u;
    }

    public boolean x(MenuItem menuItem) {
        if (this.f1629q < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f1619g.size(); i2++) {
            Fragment fragment = this.f1619g.get(i2);
            if (fragment != null && fragment.E0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    androidx.lifecycle.r x0(Fragment fragment) {
        return this.G.i(fragment);
    }

    public void y() {
        this.f1635w = false;
        this.f1636x = false;
        b0(1);
    }

    void y0() {
        h0();
        if (this.f1624l.c()) {
            f();
        } else {
            this.f1623k.c();
        }
    }

    public boolean z(Menu menu, MenuInflater menuInflater) {
        if (this.f1629q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < this.f1619g.size(); i2++) {
            Fragment fragment = this.f1619g.get(i2);
            if (fragment != null && fragment.G0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z2 = true;
            }
        }
        if (this.f1622j != null) {
            for (int i3 = 0; i3 < this.f1622j.size(); i3++) {
                Fragment fragment2 = this.f1622j.get(i3);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.g0();
                }
            }
        }
        this.f1622j = arrayList;
        return z2;
    }

    public void z0(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.f1554z) {
            return;
        }
        fragment.f1554z = true;
        fragment.O = true ^ fragment.O;
    }
}
