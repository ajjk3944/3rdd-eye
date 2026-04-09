package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c0;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;
import n0.c;
import y1.h;

/* loaded from: classes.dex */
public class c extends c0 {

    public class a extends Transition.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f4220a;

        public a(Rect rect) {
            this.f4220a = rect;
        }
    }

    public class b implements Transition.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f4222a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4223b;

        public b(View view, ArrayList arrayList) {
            this.f4222a = view;
            this.f4223b = arrayList;
        }

        @Override // androidx.transition.Transition.f
        public void a(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public void b(Transition transition) {
            transition.R(this);
            transition.a(this);
        }

        @Override // androidx.transition.Transition.f
        public void c(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public /* synthetic */ void d(Transition transition, boolean z10) {
            h.a(this, transition, z10);
        }

        @Override // androidx.transition.Transition.f
        public void e(Transition transition) {
            transition.R(this);
            this.f4222a.setVisibility(8);
            int size = this.f4223b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f4223b.get(i10)).setVisibility(0);
            }
        }

        @Override // androidx.transition.Transition.f
        public void f(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public /* synthetic */ void g(Transition transition, boolean z10) {
            h.b(this, transition, z10);
        }
    }

    /* renamed from: androidx.transition.c$c, reason: collision with other inner class name */
    public class C0048c extends androidx.transition.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f4225a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4226b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f4227c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4228d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f4229e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4230f;

        public C0048c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f4225a = obj;
            this.f4226b = arrayList;
            this.f4227c = obj2;
            this.f4228d = arrayList2;
            this.f4229e = obj3;
            this.f4230f = arrayList3;
        }

        @Override // androidx.transition.d, androidx.transition.Transition.f
        public void b(Transition transition) {
            Object obj = this.f4225a;
            if (obj != null) {
                c.this.x(obj, this.f4226b, null);
            }
            Object obj2 = this.f4227c;
            if (obj2 != null) {
                c.this.x(obj2, this.f4228d, null);
            }
            Object obj3 = this.f4229e;
            if (obj3 != null) {
                c.this.x(obj3, this.f4230f, null);
            }
        }

        @Override // androidx.transition.Transition.f
        public void e(Transition transition) {
            transition.R(this);
        }
    }

    public class d implements Transition.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f4232a;

        public d(Runnable runnable) {
            this.f4232a = runnable;
        }

        @Override // androidx.transition.Transition.f
        public void a(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public void b(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public void c(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public /* synthetic */ void d(Transition transition, boolean z10) {
            h.a(this, transition, z10);
        }

        @Override // androidx.transition.Transition.f
        public void e(Transition transition) {
            this.f4232a.run();
        }

        @Override // androidx.transition.Transition.f
        public void f(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public /* synthetic */ void g(Transition transition, boolean z10) {
            h.b(this, transition, z10);
        }
    }

    public class e extends Transition.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f4234a;

        public e(Rect rect) {
            this.f4234a = rect;
        }
    }

    public static /* synthetic */ void v(Runnable runnable, Transition transition, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            transition.cancel();
            runnable2.run();
        }
    }

    public static boolean w(Transition transition) {
        return (c0.i(transition.z()) && c0.i(transition.A()) && c0.i(transition.B())) ? false : true;
    }

    @Override // androidx.fragment.app.c0
    public void a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.c0
    public void b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i10 = 0;
        if (transition instanceof f) {
            f fVar = (f) transition;
            int iJ0 = fVar.j0();
            while (i10 < iJ0) {
                b(fVar.i0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (w(transition) || !c0.i(transition.C())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            transition.b((View) arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.c0
    public void c(ViewGroup viewGroup, Object obj) {
        androidx.transition.e.a(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.c0
    public boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.c0
    public Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.c0
    public Object j(Object obj, Object obj2, Object obj3) {
        Transition transitionO0 = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (transitionO0 != null && transition != null) {
            transitionO0 = new f().g0(transitionO0).g0(transition).o0(1);
        } else if (transitionO0 == null) {
            transitionO0 = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return transitionO0;
        }
        f fVar = new f();
        if (transitionO0 != null) {
            fVar.g0(transitionO0);
        }
        fVar.g0(transition2);
        return fVar;
    }

    @Override // androidx.fragment.app.c0
    public Object k(Object obj, Object obj2, Object obj3) {
        f fVar = new f();
        if (obj != null) {
            fVar.g0((Transition) obj);
        }
        if (obj2 != null) {
            fVar.g0((Transition) obj2);
        }
        if (obj3 != null) {
            fVar.g0((Transition) obj3);
        }
        return fVar;
    }

    @Override // androidx.fragment.app.c0
    public void m(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.c0
    public void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).a(new C0048c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.c0
    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).X(new e(rect));
        }
    }

    @Override // androidx.fragment.app.c0
    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((Transition) obj).X(new a(rect));
        }
    }

    @Override // androidx.fragment.app.c0
    public void q(Fragment fragment, Object obj, n0.c cVar, Runnable runnable) {
        y(fragment, obj, cVar, null, runnable);
    }

    @Override // androidx.fragment.app.c0
    public void s(Object obj, View view, ArrayList arrayList) {
        f fVar = (f) obj;
        List listC = fVar.C();
        listC.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0.d(listC, (View) arrayList.get(i10));
        }
        listC.add(view);
        arrayList.add(view);
        b(fVar, arrayList);
    }

    @Override // androidx.fragment.app.c0
    public void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        f fVar = (f) obj;
        if (fVar != null) {
            fVar.C().clear();
            fVar.C().addAll(arrayList2);
            x(fVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.c0
    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        f fVar = new f();
        fVar.g0((Transition) obj);
        return fVar;
    }

    public void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Transition transition = (Transition) obj;
        int i10 = 0;
        if (transition instanceof f) {
            f fVar = (f) transition;
            int iJ0 = fVar.j0();
            while (i10 < iJ0) {
                x(fVar.i0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (w(transition)) {
            return;
        }
        List listC = transition.C();
        if (listC.size() == arrayList.size() && listC.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                transition.b((View) arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.S((View) arrayList.get(size2));
            }
        }
    }

    public void y(Fragment fragment, Object obj, n0.c cVar, final Runnable runnable, final Runnable runnable2) {
        final Transition transition = (Transition) obj;
        cVar.b(new c.a() { // from class: y1.b
            @Override // n0.c.a
            public final void onCancel() {
                androidx.transition.c.v(runnable, transition, runnable2);
            }
        });
        transition.a(new d(runnable2));
    }
}
