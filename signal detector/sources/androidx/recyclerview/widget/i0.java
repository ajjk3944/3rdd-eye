package androidx.recyclerview.widget;

import R.C0175b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public class i0 extends C0175b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f5493d;

    /* renamed from: e, reason: collision with root package name */
    public final h0 f5494e;

    public i0(RecyclerView recyclerView) {
        this.f5493d = recyclerView;
        h0 h0Var = this.f5494e;
        if (h0Var != null) {
            this.f5494e = h0Var;
        } else {
            this.f5494e = new h0(this);
        }
    }

    @Override // R.C0175b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f5493d.M()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // R.C0175b
    public void d(View view, S.d dVar) {
        this.f3302a.onInitializeAccessibilityNodeInfo(view, dVar.f3446a);
        RecyclerView recyclerView = this.f5493d;
        if (recyclerView.M() || recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(dVar);
    }

    @Override // R.C0175b
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f5493d;
        if (recyclerView.M() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
    }
}
