package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c extends m {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f3885s;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f3886h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f3887i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f3888j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3889k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f3890l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f3891m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f3892n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f3893o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f3894p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f3895q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f3896r = new ArrayList();

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3897a;

        public a(ArrayList arrayList) {
            this.f3897a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f3897a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                j jVar = (j) obj;
                c.this.S(jVar.f3931a, jVar.f3932b, jVar.f3933c, jVar.f3934d, jVar.f3935e);
            }
            this.f3897a.clear();
            c.this.f3891m.remove(this.f3897a);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3899a;

        public b(ArrayList arrayList) {
            this.f3899a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f3899a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                c.this.R((i) obj);
            }
            this.f3899a.clear();
            c.this.f3892n.remove(this.f3899a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    public class RunnableC0039c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3901a;

        public RunnableC0039c(ArrayList arrayList) {
            this.f3901a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f3901a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                c.this.Q((RecyclerView.c0) obj);
            }
            this.f3901a.clear();
            c.this.f3890l.remove(this.f3901a);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.c0 f3903a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3904b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f3905c;

        public d(RecyclerView.c0 c0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3903a = c0Var;
            this.f3904b = viewPropertyAnimator;
            this.f3905c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3904b.setListener(null);
            this.f3905c.setAlpha(1.0f);
            c.this.G(this.f3903a);
            c.this.f3895q.remove(this.f3903a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.H(this.f3903a);
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.c0 f3907a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f3908b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3909c;

        public e(RecyclerView.c0 c0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3907a = c0Var;
            this.f3908b = view;
            this.f3909c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3908b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3909c.setListener(null);
            c.this.A(this.f3907a);
            c.this.f3893o.remove(this.f3907a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.B(this.f3907a);
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.c0 f3911a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f3912b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f3913c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f3914d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3915e;

        public f(RecyclerView.c0 c0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3911a = c0Var;
            this.f3912b = i10;
            this.f3913c = view;
            this.f3914d = i11;
            this.f3915e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f3912b != 0) {
                this.f3913c.setTranslationX(0.0f);
            }
            if (this.f3914d != 0) {
                this.f3913c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3915e.setListener(null);
            c.this.E(this.f3911a);
            c.this.f3894p.remove(this.f3911a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.F(this.f3911a);
        }
    }

    public class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f3917a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3918b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f3919c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3917a = iVar;
            this.f3918b = viewPropertyAnimator;
            this.f3919c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3918b.setListener(null);
            this.f3919c.setAlpha(1.0f);
            this.f3919c.setTranslationX(0.0f);
            this.f3919c.setTranslationY(0.0f);
            c.this.C(this.f3917a.f3925a, true);
            c.this.f3896r.remove(this.f3917a.f3925a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f3917a.f3925a, true);
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f3921a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3922b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f3923c;

        public h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3921a = iVar;
            this.f3922b = viewPropertyAnimator;
            this.f3923c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3922b.setListener(null);
            this.f3923c.setAlpha(1.0f);
            this.f3923c.setTranslationX(0.0f);
            this.f3923c.setTranslationY(0.0f);
            c.this.C(this.f3921a.f3926b, false);
            c.this.f3896r.remove(this.f3921a.f3926b);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f3921a.f3926b, false);
        }
    }

    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.c0 f3931a;

        /* renamed from: b, reason: collision with root package name */
        public int f3932b;

        /* renamed from: c, reason: collision with root package name */
        public int f3933c;

        /* renamed from: d, reason: collision with root package name */
        public int f3934d;

        /* renamed from: e, reason: collision with root package name */
        public int f3935e;

        public j(RecyclerView.c0 c0Var, int i10, int i11, int i12, int i13) {
            this.f3931a = c0Var;
            this.f3932b = i10;
            this.f3933c = i11;
            this.f3934d = i12;
            this.f3935e = i13;
        }
    }

    public void Q(RecyclerView.c0 c0Var) {
        View view = c0Var.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3893o.add(c0Var);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(c0Var, view, viewPropertyAnimatorAnimate)).start();
    }

    public void R(i iVar) {
        RecyclerView.c0 c0Var = iVar.f3925a;
        View view = c0Var == null ? null : c0Var.itemView;
        RecyclerView.c0 c0Var2 = iVar.f3926b;
        View view2 = c0Var2 != null ? c0Var2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f3896r.add(iVar.f3925a);
            duration.translationX(iVar.f3929e - iVar.f3927c);
            duration.translationY(iVar.f3930f - iVar.f3928d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f3896r.add(iVar.f3926b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    public void S(RecyclerView.c0 c0Var, int i10, int i11, int i12, int i13) {
        View view = c0Var.itemView;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3894p.add(c0Var);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new f(c0Var, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    public final void T(RecyclerView.c0 c0Var) {
        View view = c0Var.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3895q.add(c0Var);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(c0Var, viewPropertyAnimatorAnimate, view)).start();
    }

    public void U(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.c0) list.get(size)).itemView.animate().cancel();
        }
    }

    public void V() {
        if (p()) {
            return;
        }
        i();
    }

    public final void W(List list, RecyclerView.c0 c0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (Y(iVar, c0Var) && iVar.f3925a == null && iVar.f3926b == null) {
                list.remove(iVar);
            }
        }
    }

    public final void X(i iVar) {
        RecyclerView.c0 c0Var = iVar.f3925a;
        if (c0Var != null) {
            Y(iVar, c0Var);
        }
        RecyclerView.c0 c0Var2 = iVar.f3926b;
        if (c0Var2 != null) {
            Y(iVar, c0Var2);
        }
    }

    public final boolean Y(i iVar, RecyclerView.c0 c0Var) {
        boolean z10 = false;
        if (iVar.f3926b == c0Var) {
            iVar.f3926b = null;
        } else {
            if (iVar.f3925a != c0Var) {
                return false;
            }
            iVar.f3925a = null;
            z10 = true;
        }
        c0Var.itemView.setAlpha(1.0f);
        c0Var.itemView.setTranslationX(0.0f);
        c0Var.itemView.setTranslationY(0.0f);
        C(c0Var, z10);
        return true;
    }

    public final void Z(RecyclerView.c0 c0Var) {
        if (f3885s == null) {
            f3885s = new ValueAnimator().getInterpolator();
        }
        c0Var.itemView.animate().setInterpolator(f3885s);
        j(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean g(RecyclerView.c0 c0Var, List list) {
        return !list.isEmpty() || super.g(c0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void j(RecyclerView.c0 c0Var) {
        View view = c0Var.itemView;
        view.animate().cancel();
        int size = this.f3888j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f3888j.get(size)).f3931a == c0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(c0Var);
                this.f3888j.remove(size);
            }
        }
        W(this.f3889k, c0Var);
        if (this.f3886h.remove(c0Var)) {
            view.setAlpha(1.0f);
            G(c0Var);
        }
        if (this.f3887i.remove(c0Var)) {
            view.setAlpha(1.0f);
            A(c0Var);
        }
        for (int size2 = this.f3892n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f3892n.get(size2);
            W(arrayList, c0Var);
            if (arrayList.isEmpty()) {
                this.f3892n.remove(size2);
            }
        }
        for (int size3 = this.f3891m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f3891m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).f3931a == c0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(c0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3891m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3890l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f3890l.get(size5);
            if (arrayList3.remove(c0Var)) {
                view.setAlpha(1.0f);
                A(c0Var);
                if (arrayList3.isEmpty()) {
                    this.f3890l.remove(size5);
                }
            }
        }
        this.f3895q.remove(c0Var);
        this.f3893o.remove(c0Var);
        this.f3896r.remove(c0Var);
        this.f3894p.remove(c0Var);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void k() {
        int size = this.f3888j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f3888j.get(size);
            View view = jVar.f3931a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f3931a);
            this.f3888j.remove(size);
        }
        for (int size2 = this.f3886h.size() - 1; size2 >= 0; size2--) {
            G((RecyclerView.c0) this.f3886h.get(size2));
            this.f3886h.remove(size2);
        }
        int size3 = this.f3887i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.c0 c0Var = (RecyclerView.c0) this.f3887i.get(size3);
            c0Var.itemView.setAlpha(1.0f);
            A(c0Var);
            this.f3887i.remove(size3);
        }
        for (int size4 = this.f3889k.size() - 1; size4 >= 0; size4--) {
            X((i) this.f3889k.get(size4));
        }
        this.f3889k.clear();
        if (p()) {
            for (int size5 = this.f3891m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f3891m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f3931a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f3931a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3891m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3890l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f3890l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.c0 c0Var2 = (RecyclerView.c0) arrayList2.get(size8);
                    c0Var2.itemView.setAlpha(1.0f);
                    A(c0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3890l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3892n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f3892n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3892n.remove(arrayList3);
                    }
                }
            }
            U(this.f3895q);
            U(this.f3894p);
            U(this.f3893o);
            U(this.f3896r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean p() {
        return (this.f3887i.isEmpty() && this.f3889k.isEmpty() && this.f3888j.isEmpty() && this.f3886h.isEmpty() && this.f3894p.isEmpty() && this.f3895q.isEmpty() && this.f3893o.isEmpty() && this.f3896r.isEmpty() && this.f3891m.isEmpty() && this.f3890l.isEmpty() && this.f3892n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void u() {
        boolean zIsEmpty = this.f3886h.isEmpty();
        boolean zIsEmpty2 = this.f3888j.isEmpty();
        boolean zIsEmpty3 = this.f3889k.isEmpty();
        boolean zIsEmpty4 = this.f3887i.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        ArrayList arrayList = this.f3886h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            T((RecyclerView.c0) obj);
        }
        this.f3886h.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f3888j);
            this.f3891m.add(arrayList2);
            this.f3888j.clear();
            a aVar = new a(arrayList2);
            if (zIsEmpty) {
                aVar.run();
            } else {
                ViewCompat.c0(((j) arrayList2.get(0)).f3931a.itemView, aVar, o());
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(this.f3889k);
            this.f3892n.add(arrayList3);
            this.f3889k.clear();
            b bVar = new b(arrayList3);
            if (zIsEmpty) {
                bVar.run();
            } else {
                ViewCompat.c0(((i) arrayList3.get(0)).f3925a.itemView, bVar, o());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(this.f3887i);
        this.f3890l.add(arrayList4);
        this.f3887i.clear();
        RunnableC0039c runnableC0039c = new RunnableC0039c(arrayList4);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            runnableC0039c.run();
        } else {
            ViewCompat.c0(((RecyclerView.c0) arrayList4.get(0)).itemView, runnableC0039c, (!zIsEmpty ? o() : 0L) + Math.max(!zIsEmpty2 ? n() : 0L, zIsEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.m
    public boolean w(RecyclerView.c0 c0Var) {
        Z(c0Var);
        c0Var.itemView.setAlpha(0.0f);
        this.f3887i.add(c0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean x(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i10, int i11, int i12, int i13) {
        if (c0Var == c0Var2) {
            return y(c0Var, i10, i11, i12, i13);
        }
        float translationX = c0Var.itemView.getTranslationX();
        float translationY = c0Var.itemView.getTranslationY();
        float alpha = c0Var.itemView.getAlpha();
        Z(c0Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        c0Var.itemView.setTranslationX(translationX);
        c0Var.itemView.setTranslationY(translationY);
        c0Var.itemView.setAlpha(alpha);
        if (c0Var2 != null) {
            Z(c0Var2);
            c0Var2.itemView.setTranslationX(-i14);
            c0Var2.itemView.setTranslationY(-i15);
            c0Var2.itemView.setAlpha(0.0f);
        }
        this.f3889k.add(new i(c0Var, c0Var2, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean y(RecyclerView.c0 c0Var, int i10, int i11, int i12, int i13) {
        View view = c0Var.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) c0Var.itemView.getTranslationY());
        Z(c0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            E(c0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f3888j.add(new j(c0Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean z(RecyclerView.c0 c0Var) {
        Z(c0Var);
        this.f3886h.add(c0Var);
        return true;
    }

    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.c0 f3925a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.c0 f3926b;

        /* renamed from: c, reason: collision with root package name */
        public int f3927c;

        /* renamed from: d, reason: collision with root package name */
        public int f3928d;

        /* renamed from: e, reason: collision with root package name */
        public int f3929e;

        /* renamed from: f, reason: collision with root package name */
        public int f3930f;

        public i(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2) {
            this.f3925a = c0Var;
            this.f3926b = c0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3925a + ", newHolder=" + this.f3926b + ", fromX=" + this.f3927c + ", fromY=" + this.f3928d + ", toX=" + this.f3929e + ", toY=" + this.f3930f + '}';
        }

        public i(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i10, int i11, int i12, int i13) {
            this(c0Var, c0Var2);
            this.f3927c = i10;
            this.f3928d = i11;
            this.f3929e = i12;
            this.f3930f = i13;
        }
    }
}
