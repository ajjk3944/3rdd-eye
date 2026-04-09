package androidx.recyclerview.widget;

import N7.H7;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class o extends F {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f16663s;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList<RecyclerView.F> f16664h;
    public ArrayList<RecyclerView.F> i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList<b> f16665j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList<a> f16666k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.F>> f16667l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList<ArrayList<b>> f16668m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList<ArrayList<a>> f16669n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList<RecyclerView.F> f16670o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList<RecyclerView.F> f16671p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList<RecyclerView.F> f16672q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList<RecyclerView.F> f16673r;

    /* compiled from: DefaultItemAnimator.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.F f16674a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.F f16675b;

        /* renamed from: c, reason: collision with root package name */
        public int f16676c;

        /* renamed from: d, reason: collision with root package name */
        public int f16677d;

        /* renamed from: e, reason: collision with root package name */
        public int f16678e;

        /* renamed from: f, reason: collision with root package name */
        public int f16679f;

        @SuppressLint({"UnknownNullness"})
        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.f16674a);
            sb.append(", newHolder=");
            sb.append(this.f16675b);
            sb.append(", fromX=");
            sb.append(this.f16676c);
            sb.append(", fromY=");
            sb.append(this.f16677d);
            sb.append(", toX=");
            sb.append(this.f16678e);
            sb.append(", toY=");
            return H7.p(sb, this.f16679f, '}');
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.F f16680a;

        /* renamed from: b, reason: collision with root package name */
        public int f16681b;

        /* renamed from: c, reason: collision with root package name */
        public int f16682c;

        /* renamed from: d, reason: collision with root package name */
        public int f16683d;

        /* renamed from: e, reason: collision with root package name */
        public int f16684e;
    }

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((RecyclerView.F) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void d(RecyclerView.F f10) {
        View view = f10.itemView;
        view.animate().cancel();
        ArrayList<b> arrayList = this.f16665j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (arrayList.get(size).f16680a == f10) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(f10);
                arrayList.remove(size);
            }
        }
        j(this.f16666k, f10);
        if (this.f16664h.remove(f10)) {
            view.setAlpha(1.0f);
            c(f10);
        }
        if (this.i.remove(f10)) {
            view.setAlpha(1.0f);
            c(f10);
        }
        ArrayList<ArrayList<a>> arrayList2 = this.f16669n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList<a> arrayList3 = arrayList2.get(size2);
            j(arrayList3, f10);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<b>> arrayList4 = this.f16668m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList<b> arrayList5 = arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList5.get(size4).f16680a == f10) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(f10);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.F>> arrayList6 = this.f16667l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.F> arrayList7 = arrayList6.get(size5);
            if (arrayList7.remove(f10)) {
                view.setAlpha(1.0f);
                c(f10);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f16672q.remove(f10);
        this.f16670o.remove(f10);
        this.f16673r.remove(f10);
        this.f16671p.remove(f10);
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void e() {
        ArrayList<b> arrayList = this.f16665j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = arrayList.get(size);
            View view = bVar.f16680a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(bVar.f16680a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.F> arrayList2 = this.f16664h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.F> arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.F f10 = arrayList3.get(size3);
            f10.itemView.setAlpha(1.0f);
            c(f10);
            arrayList3.remove(size3);
        }
        ArrayList<a> arrayList4 = this.f16666k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            a aVar = arrayList4.get(size4);
            RecyclerView.F f11 = aVar.f16674a;
            if (f11 != null) {
                k(aVar, f11);
            }
            RecyclerView.F f12 = aVar.f16675b;
            if (f12 != null) {
                k(aVar, f12);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList<ArrayList<b>> arrayList5 = this.f16668m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList<b> arrayList6 = arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    b bVar2 = arrayList6.get(size6);
                    View view2 = bVar2.f16680a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(bVar2.f16680a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList<ArrayList<RecyclerView.F>> arrayList7 = this.f16667l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.F> arrayList8 = arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.F f13 = arrayList8.get(size8);
                    f13.itemView.setAlpha(1.0f);
                    c(f13);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList<ArrayList<a>> arrayList9 = this.f16669n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList<a> arrayList10 = arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    a aVar2 = arrayList10.get(size10);
                    RecyclerView.F f14 = aVar2.f16674a;
                    if (f14 != null) {
                        k(aVar2, f14);
                    }
                    RecyclerView.F f15 = aVar2.f16675b;
                    if (f15 != null) {
                        k(aVar2, f15);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f16672q);
            h(this.f16671p);
            h(this.f16670o);
            h(this.f16673r);
            ArrayList<RecyclerView.m.a> arrayList11 = this.f16490b;
            int size11 = arrayList11.size();
            for (int i = 0; i < size11; i++) {
                arrayList11.get(i).a();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean f() {
        return (this.i.isEmpty() && this.f16666k.isEmpty() && this.f16665j.isEmpty() && this.f16664h.isEmpty() && this.f16671p.isEmpty() && this.f16672q.isEmpty() && this.f16670o.isEmpty() && this.f16673r.isEmpty() && this.f16668m.isEmpty() && this.f16667l.isEmpty() && this.f16669n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.F
    @SuppressLint({"UnknownNullness"})
    public final boolean g(RecyclerView.F f10, int i, int i10, int i11, int i12) {
        View view = f10.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i10 + ((int) f10.itemView.getTranslationY());
        l(f10);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            c(f10);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        ArrayList<b> arrayList = this.f16665j;
        b bVar = new b();
        bVar.f16680a = f10;
        bVar.f16681b = translationX;
        bVar.f16682c = translationY;
        bVar.f16683d = i11;
        bVar.f16684e = i12;
        arrayList.add(bVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList<RecyclerView.m.a> arrayList = this.f16490b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
        arrayList.clear();
    }

    public final void j(ArrayList arrayList, RecyclerView.F f10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (k(aVar, f10) && aVar.f16674a == null && aVar.f16675b == null) {
                arrayList.remove(aVar);
            }
        }
    }

    public final boolean k(a aVar, RecyclerView.F f10) {
        if (aVar.f16675b == f10) {
            aVar.f16675b = null;
        } else {
            if (aVar.f16674a != f10) {
                return false;
            }
            aVar.f16674a = null;
        }
        f10.itemView.setAlpha(1.0f);
        f10.itemView.setTranslationX(0.0f);
        f10.itemView.setTranslationY(0.0f);
        c(f10);
        return true;
    }

    public final void l(RecyclerView.F f10) {
        if (f16663s == null) {
            f16663s = new ValueAnimator().getInterpolator();
        }
        f10.itemView.animate().setInterpolator(f16663s);
        d(f10);
    }
}
