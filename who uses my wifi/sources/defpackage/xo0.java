package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xo0 extends p0 {
    public final yo0 d;
    public final WeakHashMap e = new WeakHashMap();

    public xo0(yo0 yo0Var) {
        this.d = yo0Var;
    }

    @Override // defpackage.p0
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        p0 p0Var = (p0) this.e.get(view);
        return p0Var != null ? p0Var.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.p0
    public final z71 b(View view) {
        p0 p0Var = (p0) this.e.get(view);
        return p0Var != null ? p0Var.b(view) : super.b(view);
    }

    @Override // defpackage.p0
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        p0 p0Var = (p0) this.e.get(view);
        if (p0Var != null) {
            p0Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.p0
    public final void d(View view, a1 a1Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = a1Var.a;
        yo0 yo0Var = this.d;
        RecyclerView recyclerView = yo0Var.d;
        RecyclerView recyclerView2 = yo0Var.d;
        boolean zK = recyclerView.K();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        if (zK || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().W(view, a1Var);
        p0 p0Var = (p0) this.e.get(view);
        if (p0Var != null) {
            p0Var.d(view, a1Var);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // defpackage.p0
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        p0 p0Var = (p0) this.e.get(view);
        if (p0Var != null) {
            p0Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.p0
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        p0 p0Var = (p0) this.e.get(viewGroup);
        return p0Var != null ? p0Var.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.p0
    public final boolean g(View view, int i, Bundle bundle) {
        yo0 yo0Var = this.d;
        RecyclerView recyclerView = yo0Var.d;
        RecyclerView recyclerView2 = yo0Var.d;
        if (recyclerView.K() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        p0 p0Var = (p0) this.e.get(view);
        if (p0Var != null) {
            if (p0Var.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        no0 no0Var = recyclerView2.getLayoutManager().b.g;
        return false;
    }

    @Override // defpackage.p0
    public final void h(View view, int i) {
        p0 p0Var = (p0) this.e.get(view);
        if (p0Var != null) {
            p0Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.p0
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        p0 p0Var = (p0) this.e.get(view);
        if (p0Var != null) {
            p0Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
