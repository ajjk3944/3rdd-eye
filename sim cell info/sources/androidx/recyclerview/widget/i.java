package androidx.recyclerview.widget;

import a0.s;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class i extends a0.a {

    /* renamed from: d, reason: collision with root package name */
    final RecyclerView f2209d;

    /* renamed from: e, reason: collision with root package name */
    private final a f2210e;

    public static class a extends a0.a {

        /* renamed from: d, reason: collision with root package name */
        final i f2211d;

        /* renamed from: e, reason: collision with root package name */
        private Map<View, a0.a> f2212e = new WeakHashMap();

        public a(i iVar) {
            this.f2211d = iVar;
        }

        @Override // a0.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            a0.a aVar = this.f2212e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // a0.a
        public b0.d b(View view) {
            a0.a aVar = this.f2212e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // a0.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            a0.a aVar = this.f2212e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // a0.a
        public void g(View view, b0.c cVar) {
            if (!this.f2211d.o() && this.f2211d.f2209d.getLayoutManager() != null) {
                this.f2211d.f2209d.getLayoutManager().M0(view, cVar);
                a0.a aVar = this.f2212e.get(view);
                if (aVar != null) {
                    aVar.g(view, cVar);
                    return;
                }
            }
            super.g(view, cVar);
        }

        @Override // a0.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            a0.a aVar = this.f2212e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // a0.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            a0.a aVar = this.f2212e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // a0.a
        public boolean j(View view, int i2, Bundle bundle) {
            if (this.f2211d.o() || this.f2211d.f2209d.getLayoutManager() == null) {
                return super.j(view, i2, bundle);
            }
            a0.a aVar = this.f2212e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i2, bundle)) {
                    return true;
                }
            } else if (super.j(view, i2, bundle)) {
                return true;
            }
            return this.f2211d.f2209d.getLayoutManager().f1(view, i2, bundle);
        }

        @Override // a0.a
        public void l(View view, int i2) {
            a0.a aVar = this.f2212e.get(view);
            if (aVar != null) {
                aVar.l(view, i2);
            } else {
                super.l(view, i2);
            }
        }

        @Override // a0.a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            a0.a aVar = this.f2212e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        a0.a n(View view) {
            return this.f2212e.remove(view);
        }

        void o(View view) {
            a0.a aVarH = s.h(view);
            if (aVarH == null || aVarH == this) {
                return;
            }
            this.f2212e.put(view, aVarH);
        }
    }

    public i(RecyclerView recyclerView) {
        this.f2209d = recyclerView;
        a0.a aVarN = n();
        this.f2210e = (aVarN == null || !(aVarN instanceof a)) ? new a(this) : (a) aVarN;
    }

    @Override // a0.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().I0(accessibilityEvent);
        }
    }

    @Override // a0.a
    public void g(View view, b0.c cVar) {
        super.g(view, cVar);
        if (o() || this.f2209d.getLayoutManager() == null) {
            return;
        }
        this.f2209d.getLayoutManager().L0(cVar);
    }

    @Override // a0.a
    public boolean j(View view, int i2, Bundle bundle) {
        if (super.j(view, i2, bundle)) {
            return true;
        }
        if (o() || this.f2209d.getLayoutManager() == null) {
            return false;
        }
        return this.f2209d.getLayoutManager().d1(i2, bundle);
    }

    public a0.a n() {
        return this.f2210e;
    }

    boolean o() {
        return this.f2209d.j0();
    }
}
