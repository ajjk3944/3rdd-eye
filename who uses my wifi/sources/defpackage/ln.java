package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ln extends eo0 {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((wo0) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // defpackage.eo0
    public final boolean a(wo0 wo0Var, wo0 wo0Var2, tg0 tg0Var, tg0 tg0Var2) {
        int i;
        int i2;
        int i3 = tg0Var.a;
        int i4 = tg0Var.b;
        if (wo0Var2.o()) {
            int i5 = tg0Var.a;
            i2 = tg0Var.b;
            i = i5;
        } else {
            i = tg0Var2.a;
            i2 = tg0Var2.b;
        }
        if (wo0Var == wo0Var2) {
            return g(wo0Var, i3, i4, i, i2);
        }
        View view = wo0Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(wo0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = wo0Var2.a;
        l(wo0Var2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        jn jnVar = new jn();
        jnVar.a = wo0Var;
        jnVar.b = wo0Var2;
        jnVar.c = i3;
        jnVar.d = i4;
        jnVar.e = i;
        jnVar.f = i2;
        arrayList.add(jnVar);
        return true;
    }

    @Override // defpackage.eo0
    public final void d(wo0 wo0Var) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        View view = wo0Var.a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((kn) arrayList4.get(size)).a == wo0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(wo0Var);
                arrayList4.remove(size);
            }
        }
        j(this.k, wo0Var);
        if (this.h.remove(wo0Var)) {
            view.setAlpha(1.0f);
            c(wo0Var);
        }
        if (this.i.remove(wo0Var)) {
            view.setAlpha(1.0f);
            c(wo0Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, wo0Var);
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
                if (((kn) arrayList6.get(size4)).a == wo0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(wo0Var);
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
            if (arrayList7.remove(wo0Var)) {
                view.setAlpha(1.0f);
                c(wo0Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(wo0Var);
        this.o.remove(wo0Var);
        this.r.remove(wo0Var);
        this.p.remove(wo0Var);
        i();
    }

    @Override // defpackage.eo0
    public final void e() {
        ArrayList arrayList = this.n;
        ArrayList arrayList2 = this.l;
        ArrayList arrayList3 = this.m;
        ArrayList arrayList4 = this.k;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            kn knVar = (kn) arrayList7.get(size);
            View view = knVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(knVar.a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((wo0) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            wo0 wo0Var = (wo0) arrayList5.get(size3);
            wo0Var.a.setAlpha(1.0f);
            c(wo0Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            jn jnVar = (jn) arrayList4.get(size4);
            wo0 wo0Var2 = jnVar.a;
            if (wo0Var2 != null) {
                k(jnVar, wo0Var2);
            }
            wo0 wo0Var3 = jnVar.b;
            if (wo0Var3 != null) {
                k(jnVar, wo0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    kn knVar2 = (kn) arrayList8.get(size6);
                    View view2 = knVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(knVar2.a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    wo0 wo0Var4 = (wo0) arrayList9.get(size8);
                    wo0Var4.a.setAlpha(1.0f);
                    c(wo0Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    jn jnVar2 = (jn) arrayList10.get(size10);
                    wo0 wo0Var5 = jnVar2.a;
                    if (wo0Var5 != null) {
                        k(jnVar2, wo0Var5);
                    }
                    wo0 wo0Var6 = jnVar2.b;
                    if (wo0Var6 != null) {
                        k(jnVar2, wo0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // defpackage.eo0
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean g(wo0 wo0Var, int i, int i2, int i3, int i4) {
        View view = wo0Var.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) wo0Var.a.getTranslationY());
        l(wo0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(wo0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        kn knVar = new kn();
        knVar.a = wo0Var;
        knVar.b = translationX;
        knVar.c = translationY;
        knVar.d = i3;
        knVar.e = i4;
        arrayList.add(knVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, wo0 wo0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            jn jnVar = (jn) arrayList.get(size);
            if (k(jnVar, wo0Var) && jnVar.a == null && jnVar.b == null) {
                arrayList.remove(jnVar);
            }
        }
    }

    public final boolean k(jn jnVar, wo0 wo0Var) {
        if (jnVar.b == wo0Var) {
            jnVar.b = null;
        } else {
            if (jnVar.a != wo0Var) {
                return false;
            }
            jnVar.a = null;
        }
        View view = wo0Var.a;
        View view2 = wo0Var.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(wo0Var);
        return true;
    }

    public final void l(wo0 wo0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        wo0Var.a.animate().setInterpolator(s);
        d(wo0Var);
    }
}
