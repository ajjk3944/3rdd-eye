package androidx.recyclerview.widget;

import L0.C0770a;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* loaded from: classes.dex */
public class D extends C0770a {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f16370d;

    /* renamed from: e, reason: collision with root package name */
    public final a f16371e;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    public static class a extends C0770a {

        /* renamed from: d, reason: collision with root package name */
        public final D f16372d;

        /* renamed from: e, reason: collision with root package name */
        public final WeakHashMap f16373e = new WeakHashMap();

        public a(D d10) {
            this.f16372d = d10;
        }

        @Override // L0.C0770a
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            C0770a c0770a = (C0770a) this.f16373e.get(view);
            return c0770a != null ? c0770a.a(view, accessibilityEvent) : this.f3883a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // L0.C0770a
        public final M0.h b(View view) {
            C0770a c0770a = (C0770a) this.f16373e.get(view);
            return c0770a != null ? c0770a.b(view) : super.b(view);
        }

        @Override // L0.C0770a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            C0770a c0770a = (C0770a) this.f16373e.get(view);
            if (c0770a != null) {
                c0770a.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        @Override // L0.C0770a
        public void d(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) M0.g gVar) {
            D d10 = this.f16372d;
            boolean zHasPendingAdapterUpdates = d10.f16370d.hasPendingAdapterUpdates();
            View.AccessibilityDelegate accessibilityDelegate = this.f3883a;
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4122a;
            if (!zHasPendingAdapterUpdates) {
                RecyclerView recyclerView = d10.f16370d;
                if (recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().r0(view, gVar);
                    C0770a c0770a = (C0770a) this.f16373e.get(view);
                    if (c0770a != null) {
                        c0770a.d(view, gVar);
                        return;
                    } else {
                        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                        return;
                    }
                }
            }
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }

        @Override // L0.C0770a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            C0770a c0770a = (C0770a) this.f16373e.get(view);
            if (c0770a != null) {
                c0770a.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        @Override // L0.C0770a
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0770a c0770a = (C0770a) this.f16373e.get(viewGroup);
            return c0770a != null ? c0770a.f(viewGroup, view, accessibilityEvent) : this.f3883a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // L0.C0770a
        public final boolean g(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            D d10 = this.f16372d;
            if (!d10.f16370d.hasPendingAdapterUpdates()) {
                RecyclerView recyclerView = d10.f16370d;
                if (recyclerView.getLayoutManager() != null) {
                    C0770a c0770a = (C0770a) this.f16373e.get(view);
                    if (c0770a != null) {
                        if (c0770a.g(view, i, bundle)) {
                            return true;
                        }
                    } else if (super.g(view, i, bundle)) {
                        return true;
                    }
                    RecyclerView.w wVar = recyclerView.getLayoutManager().f16499b.mRecycler;
                    return false;
                }
            }
            return super.g(view, i, bundle);
        }

        @Override // L0.C0770a
        public final void h(View view, int i) {
            C0770a c0770a = (C0770a) this.f16373e.get(view);
            if (c0770a != null) {
                c0770a.h(view, i);
            } else {
                super.h(view, i);
            }
        }

        @Override // L0.C0770a
        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            C0770a c0770a = (C0770a) this.f16373e.get(view);
            if (c0770a != null) {
                c0770a.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public D(RecyclerView recyclerView) {
        this.f16370d = recyclerView;
        C0770a c0770aJ = j();
        if (c0770aJ == null || !(c0770aJ instanceof a)) {
            this.f16371e = new a(this);
        } else {
            this.f16371e = (a) c0770aJ;
        }
    }

    @Override // L0.C0770a
    public final void c(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f16370d.hasPendingAdapterUpdates()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().p0(accessibilityEvent);
        }
    }

    @Override // L0.C0770a
    public void d(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) M0.g gVar) {
        this.f3883a.onInitializeAccessibilityNodeInfo(view, gVar.f4122a);
        RecyclerView recyclerView = this.f16370d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return;
        }
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f16499b;
        layoutManager.q0(recyclerView2.mRecycler, recyclerView2.mState, gVar);
    }

    @Override // L0.C0770a
    public boolean g(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f16370d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f16499b;
        return layoutManager.D0(recyclerView2.mRecycler, recyclerView2.mState, i, bundle);
    }

    public C0770a j() {
        return this.f16371e;
    }
}
