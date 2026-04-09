package h7;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n extends v0 {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f10142s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10143g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f10144h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f10145i;
    public ArrayList j;
    public ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f10146l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f10147m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f10148n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f10149o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f10150p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f10151q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f10152r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((n1) arrayList.get(size)).f10155a.animate().cancel();
        }
    }

    @Override // h7.v0
    public final boolean a(n1 n1Var, n1 n1Var2, androidx.media3.common.i0 i0Var, androidx.media3.common.i0 i0Var2) {
        int i10;
        int i11;
        int i12 = i0Var.f1699a;
        int i13 = i0Var.f1700b;
        if (n1Var2.o()) {
            int i14 = i0Var.f1699a;
            i11 = i0Var.f1700b;
            i10 = i14;
        } else {
            i10 = i0Var2.f1699a;
            i11 = i0Var2.f1700b;
        }
        if (n1Var == n1Var2) {
            return g(n1Var, i12, i13, i10, i11);
        }
        View view = n1Var.f10155a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(n1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = n1Var2.f10155a;
        l(n1Var2);
        view2.setTranslationX(-((int) ((i10 - i12) - translationX)));
        view2.setTranslationY(-((int) ((i11 - i13) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        l lVar = new l();
        lVar.f10119a = n1Var;
        lVar.f10120b = n1Var2;
        lVar.f10121c = i12;
        lVar.f10122d = i13;
        lVar.f10123e = i10;
        lVar.f10124f = i11;
        arrayList.add(lVar);
        return true;
    }

    @Override // h7.v0
    public final void d(n1 n1Var) {
        ArrayList arrayList = this.f10146l;
        ArrayList arrayList2 = this.f10147m;
        ArrayList arrayList3 = this.f10148n;
        View view = n1Var.f10155a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((m) arrayList4.get(size)).f10129a == n1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(n1Var);
                arrayList4.remove(size);
            }
        }
        j(this.k, n1Var);
        if (this.f10144h.remove(n1Var)) {
            view.setAlpha(1.0f);
            c(n1Var);
        }
        if (this.f10145i.remove(n1Var)) {
            view.setAlpha(1.0f);
            c(n1Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, n1Var);
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
                if (((m) arrayList6.get(size4)).f10129a == n1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(n1Var);
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
            if (arrayList7.remove(n1Var)) {
                view.setAlpha(1.0f);
                c(n1Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f10151q.remove(n1Var);
        this.f10149o.remove(n1Var);
        this.f10152r.remove(n1Var);
        this.f10150p.remove(n1Var);
        i();
    }

    @Override // h7.v0
    public final void e() {
        ArrayList arrayList = this.f10148n;
        ArrayList arrayList2 = this.f10146l;
        ArrayList arrayList3 = this.f10147m;
        ArrayList arrayList4 = this.k;
        ArrayList arrayList5 = this.f10145i;
        ArrayList arrayList6 = this.f10144h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            m mVar = (m) arrayList7.get(size);
            View view = mVar.f10129a.f10155a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(mVar.f10129a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((n1) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            n1 n1Var = (n1) arrayList5.get(size3);
            n1Var.f10155a.setAlpha(1.0f);
            c(n1Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            l lVar = (l) arrayList4.get(size4);
            n1 n1Var2 = lVar.f10119a;
            if (n1Var2 != null) {
                k(lVar, n1Var2);
            }
            n1 n1Var3 = lVar.f10120b;
            if (n1Var3 != null) {
                k(lVar, n1Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    m mVar2 = (m) arrayList8.get(size6);
                    View view2 = mVar2.f10129a.f10155a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(mVar2.f10129a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    n1 n1Var4 = (n1) arrayList9.get(size8);
                    n1Var4.f10155a.setAlpha(1.0f);
                    c(n1Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    l lVar2 = (l) arrayList10.get(size10);
                    n1 n1Var5 = lVar2.f10119a;
                    if (n1Var5 != null) {
                        k(lVar2, n1Var5);
                    }
                    n1 n1Var6 = lVar2.f10120b;
                    if (n1Var6 != null) {
                        k(lVar2, n1Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            h(this.f10151q);
            h(this.f10150p);
            h(this.f10149o);
            h(this.f10152r);
            ArrayList arrayList11 = this.f10219b;
            if (arrayList11.size() > 0) {
                throw h0.b.e(0, arrayList11);
            }
            arrayList11.clear();
        }
    }

    @Override // h7.v0
    public final boolean f() {
        return (this.f10145i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.f10144h.isEmpty() && this.f10150p.isEmpty() && this.f10151q.isEmpty() && this.f10149o.isEmpty() && this.f10152r.isEmpty() && this.f10147m.isEmpty() && this.f10146l.isEmpty() && this.f10148n.isEmpty()) ? false : true;
    }

    public final boolean g(n1 n1Var, int i10, int i11, int i12, int i13) {
        View view = n1Var.f10155a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) n1Var.f10155a.getTranslationY());
        l(n1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            c(n1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        ArrayList arrayList = this.j;
        m mVar = new m();
        mVar.f10129a = n1Var;
        mVar.f10130b = translationX;
        mVar.f10131c = translationY;
        mVar.f10132d = i12;
        mVar.f10133e = i13;
        arrayList.add(mVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f10219b;
        if (arrayList.size() > 0) {
            throw h0.b.e(0, arrayList);
        }
        arrayList.clear();
    }

    public final void j(ArrayList arrayList, n1 n1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            l lVar = (l) arrayList.get(size);
            if (k(lVar, n1Var) && lVar.f10119a == null && lVar.f10120b == null) {
                arrayList.remove(lVar);
            }
        }
    }

    public final boolean k(l lVar, n1 n1Var) {
        if (lVar.f10120b == n1Var) {
            lVar.f10120b = null;
        } else {
            if (lVar.f10119a != n1Var) {
                return false;
            }
            lVar.f10119a = null;
        }
        View view = n1Var.f10155a;
        View view2 = n1Var.f10155a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(n1Var);
        return true;
    }

    public final void l(n1 n1Var) {
        if (f10142s == null) {
            f10142s = new ValueAnimator().getInterpolator();
        }
        n1Var.f10155a.animate().setInterpolator(f10142s);
        d(n1Var);
    }
}
