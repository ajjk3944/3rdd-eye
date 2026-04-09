package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import y1.g;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static Transition f4236a = new y1.a();

    /* renamed from: b, reason: collision with root package name */
    public static ThreadLocal f4237b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static ArrayList f4238c = new ArrayList();

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public Transition f4239a;

        /* renamed from: b, reason: collision with root package name */
        public ViewGroup f4240b;

        /* renamed from: androidx.transition.e$a$a, reason: collision with other inner class name */
        public class C0049a extends d {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r.a f4241a;

            public C0049a(r.a aVar) {
                this.f4241a = aVar;
            }

            @Override // androidx.transition.Transition.f
            public void e(Transition transition) {
                ((ArrayList) this.f4241a.get(a.this.f4240b)).remove(transition);
                transition.R(this);
            }
        }

        public a(Transition transition, ViewGroup viewGroup) {
            this.f4239a = transition;
            this.f4240b = viewGroup;
        }

        public final void a() {
            this.f4240b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f4240b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!e.f4238c.remove(this.f4240b)) {
                return true;
            }
            r.a aVarB = e.b();
            ArrayList arrayList = (ArrayList) aVarB.get(this.f4240b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                aVarB.put(this.f4240b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f4239a);
            this.f4239a.a(new C0049a(aVarB));
            int i10 = 0;
            this.f4239a.j(this.f4240b, false);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Transition) obj).T(this.f4240b);
                }
            }
            this.f4239a.Q(this.f4240b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            e.f4238c.remove(this.f4240b);
            ArrayList arrayList = (ArrayList) e.b().get(this.f4240b);
            if (arrayList != null && arrayList.size() > 0) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((Transition) obj).T(this.f4240b);
                }
            }
            this.f4239a.k(true);
        }
    }

    public static void a(ViewGroup viewGroup, Transition transition) {
        if (f4238c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f4238c.add(viewGroup);
        if (transition == null) {
            transition = f4236a;
        }
        Transition transitionClone = transition.clone();
        d(viewGroup, transitionClone);
        g.b(viewGroup, null);
        c(viewGroup, transitionClone);
    }

    public static r.a b() {
        r.a aVar;
        WeakReference weakReference = (WeakReference) f4237b.get();
        if (weakReference != null && (aVar = (r.a) weakReference.get()) != null) {
            return aVar;
        }
        r.a aVar2 = new r.a();
        f4237b.set(new WeakReference(aVar2));
        return aVar2;
    }

    public static void c(ViewGroup viewGroup, Transition transition) {
        if (transition == null || viewGroup == null) {
            return;
        }
        a aVar = new a(transition, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static void d(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Transition) obj).P(viewGroup);
            }
        }
        if (transition != null) {
            transition.j(viewGroup, true);
        }
        g.a(viewGroup);
    }
}
