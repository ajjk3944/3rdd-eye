package com.google.android.material.bottomappbar;

import F1.W;
import O3.a;
import O3.i;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import f.AbstractC5487d;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public abstract class BottomAppBar extends Toolbar {

    /* renamed from: n1, reason: collision with root package name */
    private static final int f37025n1 = i.f17145g;

    /* renamed from: o1, reason: collision with root package name */
    private static final int f37026o1 = a.f16984w;

    /* renamed from: p1, reason: collision with root package name */
    private static final int f37027p1 = a.f16950D;

    static /* synthetic */ void T(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ View U(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void W(BottomAppBar bottomAppBar, View view) {
        ((CoordinatorLayout.e) view.getLayoutParams()).f30643d = 17;
        throw null;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: m, reason: collision with root package name */
        private final Rect f37028m;

        /* renamed from: n, reason: collision with root package name */
        private WeakReference f37029n;

        /* renamed from: o, reason: collision with root package name */
        private int f37030o;

        /* renamed from: p, reason: collision with root package name */
        private final View.OnLayoutChangeListener f37031p;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                AbstractC5487d.a(Behavior.this.f37029n.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f37031p = new a();
            this.f37028m = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            AbstractC5487d.a(view);
            return P(coordinatorLayout, null, view2, view3, i10, i11);
        }

        public boolean O(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f37029n = new WeakReference(bottomAppBar);
            View viewU = BottomAppBar.U(bottomAppBar);
            if (viewU != null && !W.Q(viewU)) {
                BottomAppBar.W(bottomAppBar, viewU);
                this.f37030o = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.e) viewU.getLayoutParams())).bottomMargin;
                viewU.addOnLayoutChangeListener(this.f37031p);
                BottomAppBar.T(bottomAppBar);
            }
            coordinatorLayout.G(bottomAppBar, i10);
            return super.l(coordinatorLayout, bottomAppBar, i10);
        }

        public boolean P(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            AbstractC5487d.a(view);
            return O(coordinatorLayout, null, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f37031p = new a();
            this.f37028m = new Rect();
        }
    }
}
