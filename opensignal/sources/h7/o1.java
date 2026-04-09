package h7;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o1 extends u3.b {

    /* renamed from: d, reason: collision with root package name */
    public final p1 f10176d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f10177e = new WeakHashMap();

    public o1(p1 p1Var) {
        this.f10176d = p1Var;
    }

    @Override // u3.b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        u3.b bVar = (u3.b) this.f10177e.get(view);
        return bVar != null ? bVar.a(view, accessibilityEvent) : this.f23147a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // u3.b
    public final o2.g b(View view) {
        u3.b bVar = (u3.b) this.f10177e.get(view);
        return bVar != null ? bVar.b(view) : super.b(view);
    }

    @Override // u3.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        u3.b bVar = (u3.b) this.f10177e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // u3.b
    public final void d(View view, v3.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f23838a;
        p1 p1Var = this.f10176d;
        RecyclerView recyclerView = p1Var.f10184d;
        RecyclerView recyclerView2 = p1Var.f10184d;
        boolean zP = recyclerView.P();
        View.AccessibilityDelegate accessibilityDelegate = this.f23147a;
        if (zP || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().W(view, cVar);
        u3.b bVar = (u3.b) this.f10177e.get(view);
        if (bVar != null) {
            bVar.d(view, cVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // u3.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        u3.b bVar = (u3.b) this.f10177e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // u3.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        u3.b bVar = (u3.b) this.f10177e.get(viewGroup);
        return bVar != null ? bVar.f(viewGroup, view, accessibilityEvent) : this.f23147a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // u3.b
    public final boolean g(View view, int i10, Bundle bundle) {
        p1 p1Var = this.f10176d;
        RecyclerView recyclerView = p1Var.f10184d;
        RecyclerView recyclerView2 = p1Var.f10184d;
        if (recyclerView.P() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i10, bundle);
        }
        u3.b bVar = (u3.b) this.f10177e.get(view);
        if (bVar != null) {
            if (bVar.g(view, i10, bundle)) {
                return true;
            }
        } else if (super.g(view, i10, bundle)) {
            return true;
        }
        f1 f1Var = recyclerView2.getLayoutManager().f10274b.f2064g;
        return false;
    }

    @Override // u3.b
    public final void h(View view, int i10) {
        u3.b bVar = (u3.b) this.f10177e.get(view);
        if (bVar != null) {
            bVar.h(view, i10);
        } else {
            super.h(view, i10);
        }
    }

    @Override // u3.b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        u3.b bVar = (u3.b) this.f10177e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
