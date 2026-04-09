package androidx.transition;

import A1.e;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.transition.AbstractC4036k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.transition.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4030e extends androidx.fragment.app.H {

    /* renamed from: androidx.transition.e$a */
    class a extends AbstractC4036k.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f32427a;

        a(Rect rect) {
            this.f32427a = rect;
        }
    }

    /* renamed from: androidx.transition.e$b */
    class b implements AbstractC4036k.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f32429a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f32430b;

        b(View view, ArrayList arrayList) {
            this.f32429a = view;
            this.f32430b = arrayList;
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void a(AbstractC4036k abstractC4036k) {
            abstractC4036k.a0(this);
            abstractC4036k.b(this);
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void b(AbstractC4036k abstractC4036k) {
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void d(AbstractC4036k abstractC4036k) {
            abstractC4036k.a0(this);
            this.f32429a.setVisibility(8);
            int size = this.f32430b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f32430b.get(i10)).setVisibility(0);
            }
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void e(AbstractC4036k abstractC4036k) {
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void g(AbstractC4036k abstractC4036k) {
        }
    }

    /* renamed from: androidx.transition.e$c */
    class c extends q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f32432a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f32433b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f32434c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f32435d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f32436e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f32437f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f32432a = obj;
            this.f32433b = arrayList;
            this.f32434c = obj2;
            this.f32435d = arrayList2;
            this.f32436e = obj3;
            this.f32437f = arrayList3;
        }

        @Override // androidx.transition.q, androidx.transition.AbstractC4036k.f
        public void a(AbstractC4036k abstractC4036k) {
            Object obj = this.f32432a;
            if (obj != null) {
                C4030e.this.y(obj, this.f32433b, null);
            }
            Object obj2 = this.f32434c;
            if (obj2 != null) {
                C4030e.this.y(obj2, this.f32435d, null);
            }
            Object obj3 = this.f32436e;
            if (obj3 != null) {
                C4030e.this.y(obj3, this.f32437f, null);
            }
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void d(AbstractC4036k abstractC4036k) {
            abstractC4036k.a0(this);
        }
    }

    /* renamed from: androidx.transition.e$d */
    class d implements AbstractC4036k.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f32439a;

        d(Runnable runnable) {
            this.f32439a = runnable;
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void a(AbstractC4036k abstractC4036k) {
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void b(AbstractC4036k abstractC4036k) {
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void d(AbstractC4036k abstractC4036k) {
            this.f32439a.run();
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void e(AbstractC4036k abstractC4036k) {
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void g(AbstractC4036k abstractC4036k) {
        }
    }

    /* renamed from: androidx.transition.e$e, reason: collision with other inner class name */
    class C1131e extends AbstractC4036k.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f32441a;

        C1131e(Rect rect) {
            this.f32441a = rect;
        }
    }

    private static boolean w(AbstractC4036k abstractC4036k) {
        return (androidx.fragment.app.H.i(abstractC4036k.G()) && androidx.fragment.app.H.i(abstractC4036k.H()) && androidx.fragment.app.H.i(abstractC4036k.I())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(Runnable runnable, AbstractC4036k abstractC4036k, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            abstractC4036k.cancel();
            runnable2.run();
        }
    }

    @Override // androidx.fragment.app.H
    public void a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC4036k) obj).c(view);
        }
    }

    @Override // androidx.fragment.app.H
    public void b(Object obj, ArrayList arrayList) {
        AbstractC4036k abstractC4036k = (AbstractC4036k) obj;
        if (abstractC4036k == null) {
            return;
        }
        int i10 = 0;
        if (abstractC4036k instanceof t) {
            t tVar = (t) abstractC4036k;
            int iU0 = tVar.u0();
            while (i10 < iU0) {
                b(tVar.t0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (w(abstractC4036k) || !androidx.fragment.app.H.i(abstractC4036k.K())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            abstractC4036k.c((View) arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.H
    public void c(ViewGroup viewGroup, Object obj) {
        r.a(viewGroup, (AbstractC4036k) obj);
    }

    @Override // androidx.fragment.app.H
    public boolean e(Object obj) {
        return obj instanceof AbstractC4036k;
    }

    @Override // androidx.fragment.app.H
    public Object f(Object obj) {
        if (obj != null) {
            return ((AbstractC4036k) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.H
    public Object j(Object obj, Object obj2, Object obj3) {
        AbstractC4036k abstractC4036kZ0 = (AbstractC4036k) obj;
        AbstractC4036k abstractC4036k = (AbstractC4036k) obj2;
        AbstractC4036k abstractC4036k2 = (AbstractC4036k) obj3;
        if (abstractC4036kZ0 != null && abstractC4036k != null) {
            abstractC4036kZ0 = new t().r0(abstractC4036kZ0).r0(abstractC4036k).z0(1);
        } else if (abstractC4036kZ0 == null) {
            abstractC4036kZ0 = abstractC4036k != null ? abstractC4036k : null;
        }
        if (abstractC4036k2 == null) {
            return abstractC4036kZ0;
        }
        t tVar = new t();
        if (abstractC4036kZ0 != null) {
            tVar.r0(abstractC4036kZ0);
        }
        tVar.r0(abstractC4036k2);
        return tVar;
    }

    @Override // androidx.fragment.app.H
    public Object k(Object obj, Object obj2, Object obj3) {
        t tVar = new t();
        if (obj != null) {
            tVar.r0((AbstractC4036k) obj);
        }
        if (obj2 != null) {
            tVar.r0((AbstractC4036k) obj2);
        }
        if (obj3 != null) {
            tVar.r0((AbstractC4036k) obj3);
        }
        return tVar;
    }

    @Override // androidx.fragment.app.H
    public void m(Object obj, View view, ArrayList arrayList) {
        ((AbstractC4036k) obj).b(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.H
    public void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((AbstractC4036k) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.H
    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC4036k) obj).h0(new C1131e(rect));
        }
    }

    @Override // androidx.fragment.app.H
    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((AbstractC4036k) obj).h0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.H
    public void q(Fragment fragment, Object obj, A1.e eVar, Runnable runnable) {
        z(fragment, obj, eVar, null, runnable);
    }

    @Override // androidx.fragment.app.H
    public void s(Object obj, View view, ArrayList arrayList) {
        t tVar = (t) obj;
        List listK = tVar.K();
        listK.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.fragment.app.H.d(listK, (View) arrayList.get(i10));
        }
        listK.add(view);
        arrayList.add(view);
        b(tVar, arrayList);
    }

    @Override // androidx.fragment.app.H
    public void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        t tVar = (t) obj;
        if (tVar != null) {
            tVar.K().clear();
            tVar.K().addAll(arrayList2);
            y(tVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.H
    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        t tVar = new t();
        tVar.r0((AbstractC4036k) obj);
        return tVar;
    }

    public void y(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC4036k abstractC4036k = (AbstractC4036k) obj;
        int i10 = 0;
        if (abstractC4036k instanceof t) {
            t tVar = (t) abstractC4036k;
            int iU0 = tVar.u0();
            while (i10 < iU0) {
                y(tVar.t0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (w(abstractC4036k)) {
            return;
        }
        List listK = abstractC4036k.K();
        if (listK.size() == arrayList.size() && listK.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                abstractC4036k.c((View) arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC4036k.c0((View) arrayList.get(size2));
            }
        }
    }

    public void z(Fragment fragment, Object obj, A1.e eVar, final Runnable runnable, final Runnable runnable2) {
        final AbstractC4036k abstractC4036k = (AbstractC4036k) obj;
        eVar.b(new e.a() { // from class: androidx.transition.d
            @Override // A1.e.a
            public final void onCancel() {
                C4030e.x(runnable, abstractC4036k, runnable2);
            }
        });
        abstractC4036k.b(new d(runnable2));
    }
}
