package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y1 extends e4.b {

    /* renamed from: d, reason: collision with root package name */
    public final z1 f1556d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f1557e = new WeakHashMap();

    public y1(z1 z1Var) {
        this.f1556d = z1Var;
    }

    @Override // e4.b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        e4.b bVar = (e4.b) this.f1557e.get(view);
        return bVar != null ? bVar.a(view, accessibilityEvent) : this.f22306a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // e4.b
    public final jf.c b(View view) {
        e4.b bVar = (e4.b) this.f1557e.get(view);
        return bVar != null ? bVar.b(view) : super.b(view);
    }

    @Override // e4.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        e4.b bVar = (e4.b) this.f1557e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // e4.b
    public final void d(View view, f4.f fVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f23651a;
        z1 z1Var = this.f1556d;
        RecyclerView recyclerView = z1Var.f1565d;
        RecyclerView recyclerView2 = z1Var.f1565d;
        boolean zS = recyclerView.S();
        View.AccessibilityDelegate accessibilityDelegate = this.f22306a;
        if (zS || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, fVar);
        e4.b bVar = (e4.b) this.f1557e.get(view);
        if (bVar != null) {
            bVar.d(view, fVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // e4.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        e4.b bVar = (e4.b) this.f1557e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // e4.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        e4.b bVar = (e4.b) this.f1557e.get(viewGroup);
        return bVar != null ? bVar.f(viewGroup, view, accessibilityEvent) : this.f22306a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // e4.b
    public final boolean g(View view, int i4, Bundle bundle) {
        z1 z1Var = this.f1556d;
        RecyclerView recyclerView = z1Var.f1565d;
        RecyclerView recyclerView2 = z1Var.f1565d;
        if (recyclerView.S() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i4, bundle);
        }
        e4.b bVar = (e4.b) this.f1557e.get(view);
        if (bVar != null) {
            if (bVar.g(view, i4, bundle)) {
                return true;
            }
        } else if (super.g(view, i4, bundle)) {
            return true;
        }
        return recyclerView2.getLayoutManager().performAccessibilityActionForItem(view, i4, bundle);
    }

    @Override // e4.b
    public final void h(View view, int i4) {
        e4.b bVar = (e4.b) this.f1557e.get(view);
        if (bVar != null) {
            bVar.h(view, i4);
        } else {
            super.h(view, i4);
        }
    }

    @Override // e4.b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        e4.b bVar = (e4.b) this.f1557e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
