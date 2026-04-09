package androidx.recyclerview.widget;

import a0.s;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class c extends k {

    /* renamed from: s, reason: collision with root package name */
    private static TimeInterpolator f2099s;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<RecyclerView.d0> f2100h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<RecyclerView.d0> f2101i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<j> f2102j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private ArrayList<i> f2103k = new ArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.d0>> f2104l = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    ArrayList<ArrayList<j>> f2105m = new ArrayList<>();

    /* renamed from: n, reason: collision with root package name */
    ArrayList<ArrayList<i>> f2106n = new ArrayList<>();

    /* renamed from: o, reason: collision with root package name */
    ArrayList<RecyclerView.d0> f2107o = new ArrayList<>();

    /* renamed from: p, reason: collision with root package name */
    ArrayList<RecyclerView.d0> f2108p = new ArrayList<>();

    /* renamed from: q, reason: collision with root package name */
    ArrayList<RecyclerView.d0> f2109q = new ArrayList<>();

    /* renamed from: r, reason: collision with root package name */
    ArrayList<RecyclerView.d0> f2110r = new ArrayList<>();

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f2111b;

        a(ArrayList arrayList) {
            this.f2111b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f2111b.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.S(jVar.f2145a, jVar.f2146b, jVar.f2147c, jVar.f2148d, jVar.f2149e);
            }
            this.f2111b.clear();
            c.this.f2105m.remove(this.f2111b);
        }
    }

    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f2113b;

        b(ArrayList arrayList) {
            this.f2113b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f2113b.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f2113b.clear();
            c.this.f2106n.remove(this.f2113b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    class RunnableC0018c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f2115b;

        RunnableC0018c(ArrayList arrayList) {
            this.f2115b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f2115b.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.d0) it.next());
            }
            this.f2115b.clear();
            c.this.f2104l.remove(this.f2115b);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f2117a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f2118b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f2119c;

        d(RecyclerView.d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2117a = d0Var;
            this.f2118b = viewPropertyAnimator;
            this.f2119c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2118b.setListener(null);
            this.f2119c.setAlpha(1.0f);
            c.this.G(this.f2117a);
            c.this.f2109q.remove(this.f2117a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.H(this.f2117a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f2121a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2122b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f2123c;

        e(RecyclerView.d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2121a = d0Var;
            this.f2122b = view;
            this.f2123c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2122b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2123c.setListener(null);
            c.this.A(this.f2121a);
            c.this.f2107o.remove(this.f2121a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.B(this.f2121a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f2125a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2126b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f2127c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2128d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f2129e;

        f(RecyclerView.d0 d0Var, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2125a = d0Var;
            this.f2126b = i2;
            this.f2127c = view;
            this.f2128d = i3;
            this.f2129e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f2126b != 0) {
                this.f2127c.setTranslationX(0.0f);
            }
            if (this.f2128d != 0) {
                this.f2127c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2129e.setListener(null);
            c.this.E(this.f2125a);
            c.this.f2108p.remove(this.f2125a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.F(this.f2125a);
        }
    }

    class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f2131a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f2132b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f2133c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2131a = iVar;
            this.f2132b = viewPropertyAnimator;
            this.f2133c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2132b.setListener(null);
            this.f2133c.setAlpha(1.0f);
            this.f2133c.setTranslationX(0.0f);
            this.f2133c.setTranslationY(0.0f);
            c.this.C(this.f2131a.f2139a, true);
            c.this.f2110r.remove(this.f2131a.f2139a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f2131a.f2139a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f2135a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f2136b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f2137c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2135a = iVar;
            this.f2136b = viewPropertyAnimator;
            this.f2137c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2136b.setListener(null);
            this.f2137c.setAlpha(1.0f);
            this.f2137c.setTranslationX(0.0f);
            this.f2137c.setTranslationY(0.0f);
            c.this.C(this.f2135a.f2140b, false);
            c.this.f2110r.remove(this.f2135a.f2140b);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f2135a.f2140b, false);
        }
    }

    private static class i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.d0 f2139a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.d0 f2140b;

        /* renamed from: c, reason: collision with root package name */
        public int f2141c;

        /* renamed from: d, reason: collision with root package name */
        public int f2142d;

        /* renamed from: e, reason: collision with root package name */
        public int f2143e;

        /* renamed from: f, reason: collision with root package name */
        public int f2144f;

        private i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            this.f2139a = d0Var;
            this.f2140b = d0Var2;
        }

        i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i2, int i3, int i4, int i5) {
            this(d0Var, d0Var2);
            this.f2141c = i2;
            this.f2142d = i3;
            this.f2143e = i4;
            this.f2144f = i5;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f2139a + ", newHolder=" + this.f2140b + ", fromX=" + this.f2141c + ", fromY=" + this.f2142d + ", toX=" + this.f2143e + ", toY=" + this.f2144f + '}';
        }
    }

    private static class j {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.d0 f2145a;

        /* renamed from: b, reason: collision with root package name */
        public int f2146b;

        /* renamed from: c, reason: collision with root package name */
        public int f2147c;

        /* renamed from: d, reason: collision with root package name */
        public int f2148d;

        /* renamed from: e, reason: collision with root package name */
        public int f2149e;

        j(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5) {
            this.f2145a = d0Var;
            this.f2146b = i2;
            this.f2147c = i3;
            this.f2148d = i4;
            this.f2149e = i5;
        }
    }

    private void T(RecyclerView.d0 d0Var) {
        View view = d0Var.f1965a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f2109q.add(d0Var);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(d0Var, viewPropertyAnimatorAnimate, view)).start();
    }

    private void W(List<i> list, RecyclerView.d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (Y(iVar, d0Var) && iVar.f2139a == null && iVar.f2140b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.d0 d0Var = iVar.f2139a;
        if (d0Var != null) {
            Y(iVar, d0Var);
        }
        RecyclerView.d0 d0Var2 = iVar.f2140b;
        if (d0Var2 != null) {
            Y(iVar, d0Var2);
        }
    }

    private boolean Y(i iVar, RecyclerView.d0 d0Var) {
        boolean z2 = false;
        if (iVar.f2140b == d0Var) {
            iVar.f2140b = null;
        } else {
            if (iVar.f2139a != d0Var) {
                return false;
            }
            iVar.f2139a = null;
            z2 = true;
        }
        d0Var.f1965a.setAlpha(1.0f);
        d0Var.f1965a.setTranslationX(0.0f);
        d0Var.f1965a.setTranslationY(0.0f);
        C(d0Var, z2);
        return true;
    }

    private void Z(RecyclerView.d0 d0Var) {
        if (f2099s == null) {
            f2099s = new ValueAnimator().getInterpolator();
        }
        d0Var.f1965a.animate().setInterpolator(f2099s);
        j(d0Var);
    }

    void Q(RecyclerView.d0 d0Var) {
        View view = d0Var.f1965a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f2107o.add(d0Var);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(d0Var, view, viewPropertyAnimatorAnimate)).start();
    }

    void R(i iVar) {
        RecyclerView.d0 d0Var = iVar.f2139a;
        View view = d0Var == null ? null : d0Var.f1965a;
        RecyclerView.d0 d0Var2 = iVar.f2140b;
        View view2 = d0Var2 != null ? d0Var2.f1965a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f2110r.add(iVar.f2139a);
            duration.translationX(iVar.f2143e - iVar.f2141c);
            duration.translationY(iVar.f2144f - iVar.f2142d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f2110r.add(iVar.f2140b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void S(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5) {
        View view = d0Var.f1965a;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f2108p.add(d0Var);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new f(d0Var, i6, view, i7, viewPropertyAnimatorAnimate)).start();
    }

    void U(List<RecyclerView.d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f1965a.animate().cancel();
        }
    }

    void V() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(RecyclerView.d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.g(d0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(RecyclerView.d0 d0Var) {
        View view = d0Var.f1965a;
        view.animate().cancel();
        int size = this.f2102j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f2102j.get(size).f2145a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(d0Var);
                this.f2102j.remove(size);
            }
        }
        W(this.f2103k, d0Var);
        if (this.f2100h.remove(d0Var)) {
            view.setAlpha(1.0f);
            G(d0Var);
        }
        if (this.f2101i.remove(d0Var)) {
            view.setAlpha(1.0f);
            A(d0Var);
        }
        for (int size2 = this.f2106n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f2106n.get(size2);
            W(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f2106n.remove(size2);
            }
        }
        for (int size3 = this.f2105m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f2105m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f2145a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f2105m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f2104l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.d0> arrayList3 = this.f2104l.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                A(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f2104l.remove(size5);
                }
            }
        }
        this.f2109q.remove(d0Var);
        this.f2107o.remove(d0Var);
        this.f2110r.remove(d0Var);
        this.f2108p.remove(d0Var);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k() {
        int size = this.f2102j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f2102j.get(size);
            View view = jVar.f2145a.f1965a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f2145a);
            this.f2102j.remove(size);
        }
        for (int size2 = this.f2100h.size() - 1; size2 >= 0; size2--) {
            G(this.f2100h.get(size2));
            this.f2100h.remove(size2);
        }
        int size3 = this.f2101i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.d0 d0Var = this.f2101i.get(size3);
            d0Var.f1965a.setAlpha(1.0f);
            A(d0Var);
            this.f2101i.remove(size3);
        }
        for (int size4 = this.f2103k.size() - 1; size4 >= 0; size4--) {
            X(this.f2103k.get(size4));
        }
        this.f2103k.clear();
        if (p()) {
            for (int size5 = this.f2105m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f2105m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f2145a.f1965a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f2145a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f2105m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f2104l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.d0> arrayList2 = this.f2104l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.d0 d0Var2 = arrayList2.get(size8);
                    d0Var2.f1965a.setAlpha(1.0f);
                    A(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f2104l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f2106n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f2106n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f2106n.remove(arrayList3);
                    }
                }
            }
            U(this.f2109q);
            U(this.f2108p);
            U(this.f2107o);
            U(this.f2110r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean p() {
        return (this.f2101i.isEmpty() && this.f2103k.isEmpty() && this.f2102j.isEmpty() && this.f2100h.isEmpty() && this.f2108p.isEmpty() && this.f2109q.isEmpty() && this.f2107o.isEmpty() && this.f2110r.isEmpty() && this.f2105m.isEmpty() && this.f2104l.isEmpty() && this.f2106n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void u() {
        boolean z2 = !this.f2100h.isEmpty();
        boolean z3 = !this.f2102j.isEmpty();
        boolean z4 = !this.f2103k.isEmpty();
        boolean z5 = !this.f2101i.isEmpty();
        if (z2 || z3 || z5 || z4) {
            Iterator<RecyclerView.d0> it = this.f2100h.iterator();
            while (it.hasNext()) {
                T(it.next());
            }
            this.f2100h.clear();
            if (z3) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f2102j);
                this.f2105m.add(arrayList);
                this.f2102j.clear();
                a aVar = new a(arrayList);
                if (z2) {
                    s.M(arrayList.get(0).f2145a.f1965a, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z4) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f2103k);
                this.f2106n.add(arrayList2);
                this.f2103k.clear();
                b bVar = new b(arrayList2);
                if (z2) {
                    s.M(arrayList2.get(0).f2139a.f1965a, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (z5) {
                ArrayList<RecyclerView.d0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f2101i);
                this.f2104l.add(arrayList3);
                this.f2101i.clear();
                RunnableC0018c runnableC0018c = new RunnableC0018c(arrayList3);
                if (z2 || z3 || z4) {
                    s.M(arrayList3.get(0).f1965a, runnableC0018c, (z2 ? o() : 0L) + Math.max(z3 ? n() : 0L, z4 ? m() : 0L));
                } else {
                    runnableC0018c.run();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.k
    public boolean w(RecyclerView.d0 d0Var) {
        Z(d0Var);
        d0Var.f1965a.setAlpha(0.0f);
        this.f2101i.add(d0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.k
    public boolean x(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i2, int i3, int i4, int i5) {
        if (d0Var == d0Var2) {
            return y(d0Var, i2, i3, i4, i5);
        }
        float translationX = d0Var.f1965a.getTranslationX();
        float translationY = d0Var.f1965a.getTranslationY();
        float alpha = d0Var.f1965a.getAlpha();
        Z(d0Var);
        int i6 = (int) ((i4 - i2) - translationX);
        int i7 = (int) ((i5 - i3) - translationY);
        d0Var.f1965a.setTranslationX(translationX);
        d0Var.f1965a.setTranslationY(translationY);
        d0Var.f1965a.setAlpha(alpha);
        if (d0Var2 != null) {
            Z(d0Var2);
            d0Var2.f1965a.setTranslationX(-i6);
            d0Var2.f1965a.setTranslationY(-i7);
            d0Var2.f1965a.setAlpha(0.0f);
        }
        this.f2103k.add(new i(d0Var, d0Var2, i2, i3, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.k
    public boolean y(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5) {
        View view = d0Var.f1965a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) d0Var.f1965a.getTranslationY());
        Z(d0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            E(d0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.f2102j.add(new j(d0Var, translationX, translationY, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.k
    public boolean z(RecyclerView.d0 d0Var) {
        Z(d0Var);
        this.f2100h.add(d0Var);
        return true;
    }
}
