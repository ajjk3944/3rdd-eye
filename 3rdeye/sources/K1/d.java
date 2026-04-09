package K1;

import C.E;
import C.e0;
import K1.i;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.N;
import java.util.ArrayList;

/* compiled from: FragmentTransitionSupport.java */
/* loaded from: classes.dex */
public class d extends N {

    /* compiled from: FragmentTransitionSupport.java */
    public class a extends i.c {
    }

    /* compiled from: FragmentTransitionSupport.java */
    public class c extends i.c {
    }

    @Override // androidx.fragment.app.N
    public final void a(View view, Object obj) {
        ((i) obj).d(view);
    }

    @Override // androidx.fragment.app.N
    public final void b(ArrayList arrayList, Object obj) {
        i iVar = (i) obj;
        if (iVar == null) {
            return;
        }
        int i = 0;
        if (iVar instanceof n) {
            n nVar = (n) iVar;
            int size = nVar.f3023C.size();
            while (i < size) {
                b(arrayList, (i < 0 || i >= nVar.f3023C.size()) ? null : nVar.f3023C.get(i));
                i++;
            }
            return;
        }
        if (N.h(iVar.f2983f) && N.h(iVar.f2984g)) {
            int size2 = arrayList.size();
            while (i < size2) {
                iVar.d((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.N
    public final void c(ViewGroup viewGroup, Object obj) {
        m.a(viewGroup, (i) obj);
    }

    @Override // androidx.fragment.app.N
    public final boolean e(Object obj) {
        return obj instanceof i;
    }

    @Override // androidx.fragment.app.N
    public final Object f(Object obj) {
        if (obj != null) {
            return ((i) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.N
    public final Object i(Object obj, Object obj2, Object obj3) {
        i iVar = (i) obj;
        i iVar2 = (i) obj2;
        i iVar3 = (i) obj3;
        if (iVar != null && iVar2 != null) {
            n nVar = new n();
            nVar.M(iVar);
            nVar.M(iVar2);
            nVar.O(1);
            iVar = nVar;
        } else if (iVar == null) {
            iVar = iVar2 != null ? iVar2 : null;
        }
        if (iVar3 == null) {
            return iVar;
        }
        n nVar2 = new n();
        if (iVar != null) {
            nVar2.M(iVar);
        }
        nVar2.M(iVar3);
        return nVar2;
    }

    @Override // androidx.fragment.app.N
    public final Object j(Object obj, Object obj2) {
        n nVar = new n();
        if (obj != null) {
            nVar.M((i) obj);
        }
        nVar.M((i) obj2);
        return nVar;
    }

    @Override // androidx.fragment.app.N
    public final void k(Object obj, View view, ArrayList<View> arrayList) {
        ((i) obj).a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.N
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((i) obj).a(new e(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.N
    public final void m(View view, Object obj) {
        if (view != null) {
            N.g(view, new Rect());
            ((i) obj).F(new a());
        }
    }

    @Override // androidx.fragment.app.N
    public final void n(Object obj, Rect rect) {
        ((i) obj).F(new c());
    }

    @Override // androidx.fragment.app.N
    public final void o(Object obj, G0.e eVar, E e4) {
        i iVar = (i) obj;
        eVar.a(new e0(3, iVar, e4));
        iVar.a(new f(e4));
    }

    @Override // androidx.fragment.app.N
    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        n nVar = (n) obj;
        ArrayList<View> arrayList2 = nVar.f2984g;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            N.d(arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(arrayList, nVar);
    }

    @Override // androidx.fragment.app.N
    public final void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        n nVar = (n) obj;
        if (nVar != null) {
            ArrayList<View> arrayList3 = nVar.f2984g;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(nVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.N
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        n nVar = new n();
        nVar.M((i) obj);
        return nVar;
    }

    public final void s(Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        i iVar = (i) obj;
        int i = 0;
        if (iVar instanceof n) {
            n nVar = (n) iVar;
            int size = nVar.f3023C.size();
            while (i < size) {
                s((i < 0 || i >= nVar.f3023C.size()) ? null : nVar.f3023C.get(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (N.h(iVar.f2983f)) {
            ArrayList<View> arrayList3 = iVar.f2984g;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    iVar.d(arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    iVar.B(arrayList.get(size3));
                }
            }
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    public class b implements i.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f2964a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2965b;

        public b(View view, ArrayList arrayList) {
            this.f2964a = view;
            this.f2965b = arrayList;
        }

        @Override // K1.i.d
        public final void a(i iVar) {
            iVar.z(this);
            this.f2964a.setVisibility(8);
            ArrayList arrayList = this.f2965b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((View) arrayList.get(i)).setVisibility(0);
            }
        }

        @Override // K1.i.d
        public final void b(i iVar) {
            iVar.z(this);
            iVar.a(this);
        }

        @Override // K1.i.d
        public final void d(i iVar) {
            iVar.z(this);
            iVar.a(this);
        }

        @Override // K1.i.d
        public final void e(i iVar) {
            a(iVar);
        }

        @Override // K1.i.d
        public final void c(i iVar) {
        }

        @Override // K1.i.d
        public final void f(i iVar) {
        }

        @Override // K1.i.d
        public final void g(i iVar) {
        }
    }
}
