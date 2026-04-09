package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l extends a1 {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f1435s;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f1436h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f1437i;
    public ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f1438k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f1439l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f1440m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1441n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f1442o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f1443p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f1444q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f1445r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((x1) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.a1
    public final boolean a(x1 x1Var, x1 x1Var2, z0 z0Var, z0 z0Var2) {
        int i4;
        int i10;
        int i11 = z0Var.f1563a;
        int i12 = z0Var.f1564b;
        if (x1Var2.shouldIgnore()) {
            int i13 = z0Var.f1563a;
            i10 = z0Var.f1564b;
            i4 = i13;
        } else {
            i4 = z0Var2.f1563a;
            i10 = z0Var2.f1564b;
        }
        if (x1Var == x1Var2) {
            return g(x1Var, i11, i12, i4, i10);
        }
        float translationX = x1Var.itemView.getTranslationX();
        float translationY = x1Var.itemView.getTranslationY();
        float alpha = x1Var.itemView.getAlpha();
        l(x1Var);
        x1Var.itemView.setTranslationX(translationX);
        x1Var.itemView.setTranslationY(translationY);
        x1Var.itemView.setAlpha(alpha);
        l(x1Var2);
        x1Var2.itemView.setTranslationX(-((int) ((i4 - i11) - translationX)));
        x1Var2.itemView.setTranslationY(-((int) ((i10 - i12) - translationY)));
        x1Var2.itemView.setAlpha(0.0f);
        ArrayList arrayList = this.f1438k;
        j jVar = new j();
        jVar.f1411a = x1Var;
        jVar.f1412b = x1Var2;
        jVar.f1413c = i11;
        jVar.f1414d = i12;
        jVar.f1415e = i4;
        jVar.f1416f = i10;
        arrayList.add(jVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.a1
    public final void d(x1 x1Var) {
        ArrayList arrayList = this.f1439l;
        ArrayList arrayList2 = this.f1440m;
        ArrayList arrayList3 = this.f1441n;
        View view = x1Var.itemView;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((k) arrayList4.get(size)).f1422a == x1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(x1Var);
                arrayList4.remove(size);
            }
        }
        j(this.f1438k, x1Var);
        if (this.f1436h.remove(x1Var)) {
            view.setAlpha(1.0f);
            c(x1Var);
        }
        if (this.f1437i.remove(x1Var)) {
            view.setAlpha(1.0f);
            c(x1Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, x1Var);
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
                if (((k) arrayList6.get(size4)).f1422a == x1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(x1Var);
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
            if (arrayList7.remove(x1Var)) {
                view.setAlpha(1.0f);
                c(x1Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f1444q.remove(x1Var);
        this.f1442o.remove(x1Var);
        this.f1445r.remove(x1Var);
        this.f1443p.remove(x1Var);
        i();
    }

    @Override // androidx.recyclerview.widget.a1
    public final void e() {
        ArrayList arrayList = this.f1441n;
        ArrayList arrayList2 = this.f1439l;
        ArrayList arrayList3 = this.f1440m;
        ArrayList arrayList4 = this.f1438k;
        ArrayList arrayList5 = this.f1437i;
        ArrayList arrayList6 = this.f1436h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            k kVar = (k) arrayList7.get(size);
            View view = kVar.f1422a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(kVar.f1422a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((x1) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            x1 x1Var = (x1) arrayList5.get(size3);
            x1Var.itemView.setAlpha(1.0f);
            c(x1Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            j jVar = (j) arrayList4.get(size4);
            x1 x1Var2 = jVar.f1411a;
            if (x1Var2 != null) {
                k(jVar, x1Var2);
            }
            x1 x1Var3 = jVar.f1412b;
            if (x1Var3 != null) {
                k(jVar, x1Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    k kVar2 = (k) arrayList8.get(size6);
                    View view2 = kVar2.f1422a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(kVar2.f1422a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    x1 x1Var4 = (x1) arrayList9.get(size8);
                    x1Var4.itemView.setAlpha(1.0f);
                    c(x1Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    j jVar2 = (j) arrayList10.get(size10);
                    x1 x1Var5 = jVar2.f1411a;
                    if (x1Var5 != null) {
                        k(jVar2, x1Var5);
                    }
                    x1 x1Var6 = jVar2.f1412b;
                    if (x1Var6 != null) {
                        k(jVar2, x1Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            h(this.f1444q);
            h(this.f1443p);
            h(this.f1442o);
            h(this.f1445r);
            ArrayList arrayList11 = this.f1300b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.a1
    public final boolean f() {
        return (this.f1437i.isEmpty() && this.f1438k.isEmpty() && this.j.isEmpty() && this.f1436h.isEmpty() && this.f1443p.isEmpty() && this.f1444q.isEmpty() && this.f1442o.isEmpty() && this.f1445r.isEmpty() && this.f1440m.isEmpty() && this.f1439l.isEmpty() && this.f1441n.isEmpty()) ? false : true;
    }

    public final boolean g(x1 x1Var, int i4, int i10, int i11, int i12) {
        View view = x1Var.itemView;
        int translationX = i4 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) x1Var.itemView.getTranslationY());
        l(x1Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            c(x1Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        ArrayList arrayList = this.j;
        k kVar = new k();
        kVar.f1422a = x1Var;
        kVar.f1423b = translationX;
        kVar.f1424c = translationY;
        kVar.f1425d = i11;
        kVar.f1426e = i12;
        arrayList.add(kVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f1300b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, x1 x1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j jVar = (j) arrayList.get(size);
            if (k(jVar, x1Var) && jVar.f1411a == null && jVar.f1412b == null) {
                arrayList.remove(jVar);
            }
        }
    }

    public final boolean k(j jVar, x1 x1Var) {
        if (jVar.f1412b == x1Var) {
            jVar.f1412b = null;
        } else {
            if (jVar.f1411a != x1Var) {
                return false;
            }
            jVar.f1411a = null;
        }
        x1Var.itemView.setAlpha(1.0f);
        x1Var.itemView.setTranslationX(0.0f);
        x1Var.itemView.setTranslationY(0.0f);
        c(x1Var);
        return true;
    }

    public final void l(x1 x1Var) {
        if (f1435s == null) {
            f1435s = new ValueAnimator().getInterpolator();
        }
        x1Var.itemView.animate().setInterpolator(f1435s);
        d(x1Var);
    }
}
