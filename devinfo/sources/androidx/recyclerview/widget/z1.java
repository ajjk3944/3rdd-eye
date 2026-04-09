package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z1 extends e4.b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f1565d;

    /* renamed from: e, reason: collision with root package name */
    public final y1 f1566e;

    public z1(RecyclerView recyclerView) {
        this.f1565d = recyclerView;
        y1 y1Var = this.f1566e;
        if (y1Var != null) {
            this.f1566e = y1Var;
        } else {
            this.f1566e = new y1(this);
        }
    }

    @Override // e4.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f1565d.S()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // e4.b
    public final void d(View view, f4.f fVar) {
        this.f22306a.onInitializeAccessibilityNodeInfo(view, fVar.f23651a);
        RecyclerView recyclerView = this.f1565d;
        if (recyclerView.S() || recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(fVar);
    }

    @Override // e4.b
    public final boolean g(View view, int i4, Bundle bundle) {
        if (super.g(view, i4, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f1565d;
        if (recyclerView.S() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().performAccessibilityAction(i4, bundle);
    }
}
