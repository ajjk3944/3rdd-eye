package androidx.recyclerview.widget;

import R.C0187n;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313j extends L {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f5495s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5496g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f5497h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f5498j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f5499k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f5500l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f5501m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f5502n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f5503o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f5504p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f5505q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f5506r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((g0) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final boolean a(g0 g0Var, g0 g0Var2, C0187n c0187n, C0187n c0187n2) {
        int i;
        int i3;
        int i6 = c0187n.f3349a;
        int i7 = c0187n.f3350b;
        if (g0Var2.shouldIgnore()) {
            int i8 = c0187n.f3349a;
            i3 = c0187n.f3350b;
            i = i8;
        } else {
            i = c0187n2.f3349a;
            i3 = c0187n2.f3350b;
        }
        if (g0Var == g0Var2) {
            return g(g0Var, i6, i7, i, i3);
        }
        float translationX = g0Var.itemView.getTranslationX();
        float translationY = g0Var.itemView.getTranslationY();
        float alpha = g0Var.itemView.getAlpha();
        l(g0Var);
        g0Var.itemView.setTranslationX(translationX);
        g0Var.itemView.setTranslationY(translationY);
        g0Var.itemView.setAlpha(alpha);
        l(g0Var2);
        g0Var2.itemView.setTranslationX(-((int) ((i - i6) - translationX)));
        g0Var2.itemView.setTranslationY(-((int) ((i3 - i7) - translationY)));
        g0Var2.itemView.setAlpha(0.0f);
        ArrayList arrayList = this.f5499k;
        C0311h c0311h = new C0311h();
        c0311h.f5479a = g0Var;
        c0311h.f5480b = g0Var2;
        c0311h.f5481c = i6;
        c0311h.f5482d = i7;
        c0311h.f5483e = i;
        c0311h.f5484f = i3;
        arrayList.add(c0311h);
        return true;
    }

    @Override // androidx.recyclerview.widget.L
    public final void d(g0 g0Var) {
        ArrayList arrayList = this.f5500l;
        ArrayList arrayList2 = this.f5501m;
        ArrayList arrayList3 = this.f5502n;
        View view = g0Var.itemView;
        view.animate().cancel();
        ArrayList arrayList4 = this.f5498j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0312i) arrayList4.get(size)).f5488a == g0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(g0Var);
                arrayList4.remove(size);
            }
        }
        j(this.f5499k, g0Var);
        if (this.f5497h.remove(g0Var)) {
            view.setAlpha(1.0f);
            c(g0Var);
        }
        if (this.i.remove(g0Var)) {
            view.setAlpha(1.0f);
            c(g0Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, g0Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0312i) arrayList6.get(size4)).f5488a == g0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(g0Var);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(g0Var)) {
                view.setAlpha(1.0f);
                c(g0Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f5505q.remove(g0Var);
        this.f5503o.remove(g0Var);
        this.f5506r.remove(g0Var);
        this.f5504p.remove(g0Var);
        i();
    }

    @Override // androidx.recyclerview.widget.L
    public final void e() {
        ArrayList arrayList = this.f5502n;
        ArrayList arrayList2 = this.f5500l;
        ArrayList arrayList3 = this.f5501m;
        ArrayList arrayList4 = this.f5499k;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.f5497h;
        ArrayList arrayList7 = this.f5498j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0312i c0312i = (C0312i) arrayList7.get(size);
            View view = c0312i.f5488a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c0312i.f5488a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((g0) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            g0 g0Var = (g0) arrayList5.get(size3);
            g0Var.itemView.setAlpha(1.0f);
            c(g0Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0311h c0311h = (C0311h) arrayList4.get(size4);
            g0 g0Var2 = c0311h.f5479a;
            if (g0Var2 != null) {
                k(c0311h, g0Var2);
            }
            g0 g0Var3 = c0311h.f5480b;
            if (g0Var3 != null) {
                k(c0311h, g0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    C0312i c0312i2 = (C0312i) arrayList8.get(size6);
                    View view2 = c0312i2.f5488a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c0312i2.f5488a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    g0 g0Var4 = (g0) arrayList9.get(size8);
                    g0Var4.itemView.setAlpha(1.0f);
                    c(g0Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0311h c0311h2 = (C0311h) arrayList10.get(size10);
                    g0 g0Var5 = c0311h2.f5479a;
                    if (g0Var5 != null) {
                        k(c0311h2, g0Var5);
                    }
                    g0 g0Var6 = c0311h2.f5480b;
                    if (g0Var6 != null) {
                        k(c0311h2, g0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            h(this.f5505q);
            h(this.f5504p);
            h(this.f5503o);
            h(this.f5506r);
            ArrayList arrayList11 = this.f5293b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final boolean f() {
        return (this.i.isEmpty() && this.f5499k.isEmpty() && this.f5498j.isEmpty() && this.f5497h.isEmpty() && this.f5504p.isEmpty() && this.f5505q.isEmpty() && this.f5503o.isEmpty() && this.f5506r.isEmpty() && this.f5501m.isEmpty() && this.f5500l.isEmpty() && this.f5502n.isEmpty()) ? false : true;
    }

    public final boolean g(g0 g0Var, int i, int i3, int i6, int i7) {
        View view = g0Var.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i3 + ((int) g0Var.itemView.getTranslationY());
        l(g0Var);
        int i8 = i6 - translationX;
        int i9 = i7 - translationY;
        if (i8 == 0 && i9 == 0) {
            c(g0Var);
            return false;
        }
        if (i8 != 0) {
            view.setTranslationX(-i8);
        }
        if (i9 != 0) {
            view.setTranslationY(-i9);
        }
        ArrayList arrayList = this.f5498j;
        C0312i c0312i = new C0312i();
        c0312i.f5488a = g0Var;
        c0312i.f5489b = translationX;
        c0312i.f5490c = translationY;
        c0312i.f5491d = i6;
        c0312i.f5492e = i7;
        arrayList.add(c0312i);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f5293b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, g0 g0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0311h c0311h = (C0311h) arrayList.get(size);
            if (k(c0311h, g0Var) && c0311h.f5479a == null && c0311h.f5480b == null) {
                arrayList.remove(c0311h);
            }
        }
    }

    public final boolean k(C0311h c0311h, g0 g0Var) {
        if (c0311h.f5480b == g0Var) {
            c0311h.f5480b = null;
        } else {
            if (c0311h.f5479a != g0Var) {
                return false;
            }
            c0311h.f5479a = null;
        }
        g0Var.itemView.setAlpha(1.0f);
        g0Var.itemView.setTranslationX(0.0f);
        g0Var.itemView.setTranslationY(0.0f);
        c(g0Var);
        return true;
    }

    public final void l(g0 g0Var) {
        if (f5495s == null) {
            f5495s = new ValueAnimator().getInterpolator();
        }
        g0Var.itemView.animate().setInterpolator(f5495s);
        d(g0Var);
    }
}
