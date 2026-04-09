package androidx.recyclerview.widget;

import F1.C2736a;
import F1.W;
import G1.t;
import G1.u;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class l extends C2736a {

    /* renamed from: d, reason: collision with root package name */
    final RecyclerView f32245d;

    /* renamed from: e, reason: collision with root package name */
    private final a f32246e;

    public static class a extends C2736a {

        /* renamed from: d, reason: collision with root package name */
        final l f32247d;

        /* renamed from: e, reason: collision with root package name */
        private Map f32248e = new WeakHashMap();

        public a(l lVar) {
            this.f32247d = lVar;
        }

        @Override // F1.C2736a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            C2736a c2736a = (C2736a) this.f32248e.get(view);
            return c2736a != null ? c2736a.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // F1.C2736a
        public u b(View view) {
            C2736a c2736a = (C2736a) this.f32248e.get(view);
            return c2736a != null ? c2736a.b(view) : super.b(view);
        }

        @Override // F1.C2736a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            C2736a c2736a = (C2736a) this.f32248e.get(view);
            if (c2736a != null) {
                c2736a.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // F1.C2736a
        public void g(View view, t tVar) {
            if (this.f32247d.o() || this.f32247d.f32245d.getLayoutManager() == null) {
                super.g(view, tVar);
                return;
            }
            this.f32247d.f32245d.getLayoutManager().S0(view, tVar);
            C2736a c2736a = (C2736a) this.f32248e.get(view);
            if (c2736a != null) {
                c2736a.g(view, tVar);
            } else {
                super.g(view, tVar);
            }
        }

        @Override // F1.C2736a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            C2736a c2736a = (C2736a) this.f32248e.get(view);
            if (c2736a != null) {
                c2736a.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // F1.C2736a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C2736a c2736a = (C2736a) this.f32248e.get(viewGroup);
            return c2736a != null ? c2736a.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // F1.C2736a
        public boolean j(View view, int i10, Bundle bundle) {
            if (this.f32247d.o() || this.f32247d.f32245d.getLayoutManager() == null) {
                return super.j(view, i10, bundle);
            }
            C2736a c2736a = (C2736a) this.f32248e.get(view);
            if (c2736a != null) {
                if (c2736a.j(view, i10, bundle)) {
                    return true;
                }
            } else if (super.j(view, i10, bundle)) {
                return true;
            }
            return this.f32247d.f32245d.getLayoutManager().m1(view, i10, bundle);
        }

        @Override // F1.C2736a
        public void l(View view, int i10) {
            C2736a c2736a = (C2736a) this.f32248e.get(view);
            if (c2736a != null) {
                c2736a.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        @Override // F1.C2736a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            C2736a c2736a = (C2736a) this.f32248e.get(view);
            if (c2736a != null) {
                c2736a.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        C2736a n(View view) {
            return (C2736a) this.f32248e.remove(view);
        }

        void o(View view) {
            C2736a c2736aL = W.l(view);
            if (c2736aL == null || c2736aL == this) {
                return;
            }
            this.f32248e.put(view, c2736aL);
        }
    }

    public l(RecyclerView recyclerView) {
        this.f32245d = recyclerView;
        C2736a c2736aN = n();
        if (c2736aN == null || !(c2736aN instanceof a)) {
            this.f32246e = new a(this);
        } else {
            this.f32246e = (a) c2736aN;
        }
    }

    @Override // F1.C2736a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().O0(accessibilityEvent);
        }
    }

    @Override // F1.C2736a
    public void g(View view, t tVar) {
        super.g(view, tVar);
        if (o() || this.f32245d.getLayoutManager() == null) {
            return;
        }
        this.f32245d.getLayoutManager().Q0(tVar);
    }

    @Override // F1.C2736a
    public boolean j(View view, int i10, Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (o() || this.f32245d.getLayoutManager() == null) {
            return false;
        }
        return this.f32245d.getLayoutManager().k1(i10, bundle);
    }

    public C2736a n() {
        return this.f32246e;
    }

    boolean o() {
        return this.f32245d.l0();
    }
}
