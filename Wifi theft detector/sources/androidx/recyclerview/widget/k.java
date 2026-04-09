package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.ViewCompat;
import java.util.Map;
import java.util.WeakHashMap;
import s0.x;
import s0.y;

/* loaded from: classes.dex */
public class k extends androidx.core.view.a {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f3998d;

    /* renamed from: e, reason: collision with root package name */
    public final a f3999e;

    public static class a extends androidx.core.view.a {

        /* renamed from: d, reason: collision with root package name */
        public final k f4000d;

        /* renamed from: e, reason: collision with root package name */
        public Map f4001e = new WeakHashMap();

        public a(k kVar) {
            this.f4000d = kVar;
        }

        @Override // androidx.core.view.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f4001e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public y b(View view) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f4001e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f4001e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public void g(View view, x xVar) {
            if (this.f4000d.o() || this.f4000d.f3998d.getLayoutManager() == null) {
                super.g(view, xVar);
                return;
            }
            this.f4000d.f3998d.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, xVar);
            androidx.core.view.a aVar = (androidx.core.view.a) this.f4001e.get(view);
            if (aVar != null) {
                aVar.g(view, xVar);
            } else {
                super.g(view, xVar);
            }
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f4001e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f4001e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (this.f4000d.o() || this.f4000d.f3998d.getLayoutManager() == null) {
                return super.j(view, i10, bundle);
            }
            androidx.core.view.a aVar = (androidx.core.view.a) this.f4001e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i10, bundle)) {
                    return true;
                }
            } else if (super.j(view, i10, bundle)) {
                return true;
            }
            return this.f4000d.f3998d.getLayoutManager().performAccessibilityActionForItem(view, i10, bundle);
        }

        @Override // androidx.core.view.a
        public void l(View view, int i10) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f4001e.get(view);
            if (aVar != null) {
                aVar.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        @Override // androidx.core.view.a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f4001e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        public androidx.core.view.a n(View view) {
            return (androidx.core.view.a) this.f4001e.remove(view);
        }

        public void o(View view) {
            androidx.core.view.a aVarK = ViewCompat.k(view);
            if (aVarK == null || aVarK == this) {
                return;
            }
            this.f4001e.put(view, aVarK);
        }
    }

    public k(RecyclerView recyclerView) {
        this.f3998d = recyclerView;
        androidx.core.view.a aVarN = n();
        if (aVarN == null || !(aVarN instanceof a)) {
            this.f3999e = new a(this);
        } else {
            this.f3999e = (a) aVarN;
        }
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public void g(View view, x xVar) {
        super.g(view, xVar);
        if (o() || this.f3998d.getLayoutManager() == null) {
            return;
        }
        this.f3998d.getLayoutManager().onInitializeAccessibilityNodeInfo(xVar);
    }

    @Override // androidx.core.view.a
    public boolean j(View view, int i10, Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (o() || this.f3998d.getLayoutManager() == null) {
            return false;
        }
        return this.f3998d.getLayoutManager().performAccessibilityAction(i10, bundle);
    }

    public androidx.core.view.a n() {
        return this.f3999e;
    }

    public boolean o() {
        return this.f3998d.w0();
    }
}
