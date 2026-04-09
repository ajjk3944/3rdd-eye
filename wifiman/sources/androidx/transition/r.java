package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import o.C7010a;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    private static AbstractC4036k f32500a = new C4026a();

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal f32501b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    static ArrayList f32502c = new ArrayList();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        AbstractC4036k f32503a;

        /* renamed from: b, reason: collision with root package name */
        ViewGroup f32504b;

        /* renamed from: androidx.transition.r$a$a, reason: collision with other inner class name */
        class C1132a extends q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C7010a f32505a;

            C1132a(C7010a c7010a) {
                this.f32505a = c7010a;
            }

            @Override // androidx.transition.AbstractC4036k.f
            public void d(AbstractC4036k abstractC4036k) {
                ((ArrayList) this.f32505a.get(a.this.f32504b)).remove(abstractC4036k);
                abstractC4036k.a0(this);
            }
        }

        a(AbstractC4036k abstractC4036k, ViewGroup viewGroup) {
            this.f32503a = abstractC4036k;
            this.f32504b = viewGroup;
        }

        private void a() {
            this.f32504b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f32504b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!r.f32502c.remove(this.f32504b)) {
                return true;
            }
            C7010a c7010aB = r.b();
            ArrayList arrayList = (ArrayList) c7010aB.get(this.f32504b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c7010aB.put(this.f32504b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f32503a);
            this.f32503a.b(new C1132a(c7010aB));
            this.f32503a.m(this.f32504b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC4036k) it.next()).d0(this.f32504b);
                }
            }
            this.f32503a.Z(this.f32504b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            r.f32502c.remove(this.f32504b);
            ArrayList arrayList = (ArrayList) r.b().get(this.f32504b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC4036k) it.next()).d0(this.f32504b);
                }
            }
            this.f32503a.n(true);
        }
    }

    public static void a(ViewGroup viewGroup, AbstractC4036k abstractC4036k) {
        if (f32502c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f32502c.add(viewGroup);
        if (abstractC4036k == null) {
            abstractC4036k = f32500a;
        }
        AbstractC4036k abstractC4036kClone = abstractC4036k.clone();
        d(viewGroup, abstractC4036kClone);
        AbstractC4035j.b(viewGroup, null);
        c(viewGroup, abstractC4036kClone);
    }

    static C7010a b() {
        C7010a c7010a;
        WeakReference weakReference = (WeakReference) f32501b.get();
        if (weakReference != null && (c7010a = (C7010a) weakReference.get()) != null) {
            return c7010a;
        }
        C7010a c7010a2 = new C7010a();
        f32501b.set(new WeakReference(c7010a2));
        return c7010a2;
    }

    private static void c(ViewGroup viewGroup, AbstractC4036k abstractC4036k) {
        if (abstractC4036k == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC4036k, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void d(ViewGroup viewGroup, AbstractC4036k abstractC4036k) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC4036k) it.next()).Y(viewGroup);
            }
        }
        if (abstractC4036k != null) {
            abstractC4036k.m(viewGroup, true);
        }
        AbstractC4035j.a(viewGroup);
    }
}
