package androidx.recyclerview.widget;

import F1.W;
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
public class c extends n {

    /* renamed from: s, reason: collision with root package name */
    private static TimeInterpolator f32119s;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f32120h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f32121i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f32122j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private ArrayList f32123k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    ArrayList f32124l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    ArrayList f32125m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    ArrayList f32126n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    ArrayList f32127o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    ArrayList f32128p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    ArrayList f32129q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    ArrayList f32130r = new ArrayList();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f32131a;

        a(ArrayList arrayList) {
            this.f32131a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f32131a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.S(jVar.f32165a, jVar.f32166b, jVar.f32167c, jVar.f32168d, jVar.f32169e);
            }
            this.f32131a.clear();
            c.this.f32125m.remove(this.f32131a);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f32133a;

        b(ArrayList arrayList) {
            this.f32133a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f32133a.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f32133a.clear();
            c.this.f32126n.remove(this.f32133a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    class RunnableC1119c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f32135a;

        RunnableC1119c(ArrayList arrayList) {
            this.f32135a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f32135a.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.C) it.next());
            }
            this.f32135a.clear();
            c.this.f32124l.remove(this.f32135a);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.C f32137a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f32138b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f32139c;

        d(RecyclerView.C c10, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f32137a = c10;
            this.f32138b = viewPropertyAnimator;
            this.f32139c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f32138b.setListener(null);
            this.f32139c.setAlpha(1.0f);
            c.this.G(this.f32137a);
            c.this.f32129q.remove(this.f32137a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.H(this.f32137a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.C f32141a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f32142b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f32143c;

        e(RecyclerView.C c10, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f32141a = c10;
            this.f32142b = view;
            this.f32143c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f32142b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f32143c.setListener(null);
            c.this.A(this.f32141a);
            c.this.f32127o.remove(this.f32141a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.B(this.f32141a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.C f32145a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f32146b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f32147c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f32148d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f32149e;

        f(RecyclerView.C c10, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f32145a = c10;
            this.f32146b = i10;
            this.f32147c = view;
            this.f32148d = i11;
            this.f32149e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f32146b != 0) {
                this.f32147c.setTranslationX(0.0f);
            }
            if (this.f32148d != 0) {
                this.f32147c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f32149e.setListener(null);
            c.this.E(this.f32145a);
            c.this.f32128p.remove(this.f32145a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.F(this.f32145a);
        }
    }

    class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f32151a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f32152b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f32153c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f32151a = iVar;
            this.f32152b = viewPropertyAnimator;
            this.f32153c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f32152b.setListener(null);
            this.f32153c.setAlpha(1.0f);
            this.f32153c.setTranslationX(0.0f);
            this.f32153c.setTranslationY(0.0f);
            c.this.C(this.f32151a.f32159a, true);
            c.this.f32130r.remove(this.f32151a.f32159a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f32151a.f32159a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f32155a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f32156b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f32157c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f32155a = iVar;
            this.f32156b = viewPropertyAnimator;
            this.f32157c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f32156b.setListener(null);
            this.f32157c.setAlpha(1.0f);
            this.f32157c.setTranslationX(0.0f);
            this.f32157c.setTranslationY(0.0f);
            c.this.C(this.f32155a.f32160b, false);
            c.this.f32130r.remove(this.f32155a.f32160b);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f32155a.f32160b, false);
        }
    }

    private static class j {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.C f32165a;

        /* renamed from: b, reason: collision with root package name */
        public int f32166b;

        /* renamed from: c, reason: collision with root package name */
        public int f32167c;

        /* renamed from: d, reason: collision with root package name */
        public int f32168d;

        /* renamed from: e, reason: collision with root package name */
        public int f32169e;

        j(RecyclerView.C c10, int i10, int i11, int i12, int i13) {
            this.f32165a = c10;
            this.f32166b = i10;
            this.f32167c = i11;
            this.f32168d = i12;
            this.f32169e = i13;
        }
    }

    private void T(RecyclerView.C c10) {
        View view = c10.f31934a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f32129q.add(c10);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(c10, viewPropertyAnimatorAnimate, view)).start();
    }

    private void W(List list, RecyclerView.C c10) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (Y(iVar, c10) && iVar.f32159a == null && iVar.f32160b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.C c10 = iVar.f32159a;
        if (c10 != null) {
            Y(iVar, c10);
        }
        RecyclerView.C c11 = iVar.f32160b;
        if (c11 != null) {
            Y(iVar, c11);
        }
    }

    private boolean Y(i iVar, RecyclerView.C c10) {
        boolean z10 = false;
        if (iVar.f32160b == c10) {
            iVar.f32160b = null;
        } else {
            if (iVar.f32159a != c10) {
                return false;
            }
            iVar.f32159a = null;
            z10 = true;
        }
        c10.f31934a.setAlpha(1.0f);
        c10.f31934a.setTranslationX(0.0f);
        c10.f31934a.setTranslationY(0.0f);
        C(c10, z10);
        return true;
    }

    private void Z(RecyclerView.C c10) {
        if (f32119s == null) {
            f32119s = new ValueAnimator().getInterpolator();
        }
        c10.f31934a.animate().setInterpolator(f32119s);
        j(c10);
    }

    void Q(RecyclerView.C c10) {
        View view = c10.f31934a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f32127o.add(c10);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(c10, view, viewPropertyAnimatorAnimate)).start();
    }

    void R(i iVar) {
        RecyclerView.C c10 = iVar.f32159a;
        View view = c10 == null ? null : c10.f31934a;
        RecyclerView.C c11 = iVar.f32160b;
        View view2 = c11 != null ? c11.f31934a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f32130r.add(iVar.f32159a);
            duration.translationX(iVar.f32163e - iVar.f32161c);
            duration.translationY(iVar.f32164f - iVar.f32162d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f32130r.add(iVar.f32160b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void S(RecyclerView.C c10, int i10, int i11, int i12, int i13) {
        View view = c10.f31934a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f32128p.add(c10);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new f(c10, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    void U(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.C) list.get(size)).f31934a.animate().cancel();
        }
    }

    void V() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(RecyclerView.C c10, List list) {
        return !list.isEmpty() || super.g(c10, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(RecyclerView.C c10) {
        View view = c10.f31934a;
        view.animate().cancel();
        int size = this.f32122j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f32122j.get(size)).f32165a == c10) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(c10);
                this.f32122j.remove(size);
            }
        }
        W(this.f32123k, c10);
        if (this.f32120h.remove(c10)) {
            view.setAlpha(1.0f);
            G(c10);
        }
        if (this.f32121i.remove(c10)) {
            view.setAlpha(1.0f);
            A(c10);
        }
        for (int size2 = this.f32126n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f32126n.get(size2);
            W(arrayList, c10);
            if (arrayList.isEmpty()) {
                this.f32126n.remove(size2);
            }
        }
        for (int size3 = this.f32125m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f32125m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).f32165a == c10) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(c10);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f32125m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f32124l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f32124l.get(size5);
            if (arrayList3.remove(c10)) {
                view.setAlpha(1.0f);
                A(c10);
                if (arrayList3.isEmpty()) {
                    this.f32124l.remove(size5);
                }
            }
        }
        this.f32129q.remove(c10);
        this.f32127o.remove(c10);
        this.f32130r.remove(c10);
        this.f32128p.remove(c10);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k() {
        int size = this.f32122j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f32122j.get(size);
            View view = jVar.f32165a.f31934a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f32165a);
            this.f32122j.remove(size);
        }
        for (int size2 = this.f32120h.size() - 1; size2 >= 0; size2--) {
            G((RecyclerView.C) this.f32120h.get(size2));
            this.f32120h.remove(size2);
        }
        int size3 = this.f32121i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C c10 = (RecyclerView.C) this.f32121i.get(size3);
            c10.f31934a.setAlpha(1.0f);
            A(c10);
            this.f32121i.remove(size3);
        }
        for (int size4 = this.f32123k.size() - 1; size4 >= 0; size4--) {
            X((i) this.f32123k.get(size4));
        }
        this.f32123k.clear();
        if (p()) {
            for (int size5 = this.f32125m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f32125m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f32165a.f31934a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f32165a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f32125m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f32124l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f32124l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C c11 = (RecyclerView.C) arrayList2.get(size8);
                    c11.f31934a.setAlpha(1.0f);
                    A(c11);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f32124l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f32126n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f32126n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f32126n.remove(arrayList3);
                    }
                }
            }
            U(this.f32129q);
            U(this.f32128p);
            U(this.f32127o);
            U(this.f32130r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean p() {
        return (this.f32121i.isEmpty() && this.f32123k.isEmpty() && this.f32122j.isEmpty() && this.f32120h.isEmpty() && this.f32128p.isEmpty() && this.f32129q.isEmpty() && this.f32127o.isEmpty() && this.f32130r.isEmpty() && this.f32125m.isEmpty() && this.f32124l.isEmpty() && this.f32126n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void u() {
        boolean zIsEmpty = this.f32120h.isEmpty();
        boolean zIsEmpty2 = this.f32122j.isEmpty();
        boolean zIsEmpty3 = this.f32123k.isEmpty();
        boolean zIsEmpty4 = this.f32121i.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator it = this.f32120h.iterator();
        while (it.hasNext()) {
            T((RecyclerView.C) it.next());
        }
        this.f32120h.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f32122j);
            this.f32125m.add(arrayList);
            this.f32122j.clear();
            a aVar = new a(arrayList);
            if (zIsEmpty) {
                aVar.run();
            } else {
                W.f0(((j) arrayList.get(0)).f32165a.f31934a, aVar, o());
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f32123k);
            this.f32126n.add(arrayList2);
            this.f32123k.clear();
            b bVar = new b(arrayList2);
            if (zIsEmpty) {
                bVar.run();
            } else {
                W.f0(((i) arrayList2.get(0)).f32159a.f31934a, bVar, o());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.f32121i);
        this.f32124l.add(arrayList3);
        this.f32121i.clear();
        RunnableC1119c runnableC1119c = new RunnableC1119c(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            runnableC1119c.run();
        } else {
            W.f0(((RecyclerView.C) arrayList3.get(0)).f31934a, runnableC1119c, (!zIsEmpty ? o() : 0L) + Math.max(!zIsEmpty2 ? n() : 0L, zIsEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.n
    public boolean w(RecyclerView.C c10) {
        Z(c10);
        c10.f31934a.setAlpha(0.0f);
        this.f32121i.add(c10);
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean x(RecyclerView.C c10, RecyclerView.C c11, int i10, int i11, int i12, int i13) {
        if (c10 == c11) {
            return y(c10, i10, i11, i12, i13);
        }
        float translationX = c10.f31934a.getTranslationX();
        float translationY = c10.f31934a.getTranslationY();
        float alpha = c10.f31934a.getAlpha();
        Z(c10);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        c10.f31934a.setTranslationX(translationX);
        c10.f31934a.setTranslationY(translationY);
        c10.f31934a.setAlpha(alpha);
        if (c11 != null) {
            Z(c11);
            c11.f31934a.setTranslationX(-i14);
            c11.f31934a.setTranslationY(-i15);
            c11.f31934a.setAlpha(0.0f);
        }
        this.f32123k.add(new i(c10, c11, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean y(RecyclerView.C c10, int i10, int i11, int i12, int i13) {
        View view = c10.f31934a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) c10.f31934a.getTranslationY());
        Z(c10);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            E(c10);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f32122j.add(new j(c10, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean z(RecyclerView.C c10) {
        Z(c10);
        this.f32120h.add(c10);
        return true;
    }

    private static class i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.C f32159a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.C f32160b;

        /* renamed from: c, reason: collision with root package name */
        public int f32161c;

        /* renamed from: d, reason: collision with root package name */
        public int f32162d;

        /* renamed from: e, reason: collision with root package name */
        public int f32163e;

        /* renamed from: f, reason: collision with root package name */
        public int f32164f;

        private i(RecyclerView.C c10, RecyclerView.C c11) {
            this.f32159a = c10;
            this.f32160b = c11;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f32159a + ", newHolder=" + this.f32160b + ", fromX=" + this.f32161c + ", fromY=" + this.f32162d + ", toX=" + this.f32163e + ", toY=" + this.f32164f + '}';
        }

        i(RecyclerView.C c10, RecyclerView.C c11, int i10, int i11, int i12, int i13) {
            this(c10, c11);
            this.f32161c = i10;
            this.f32162d = i11;
            this.f32163e = i12;
            this.f32164f = i13;
        }
    }
}
