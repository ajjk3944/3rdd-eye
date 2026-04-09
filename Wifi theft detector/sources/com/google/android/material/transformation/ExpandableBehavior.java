package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c {

    /* renamed from: a, reason: collision with root package name */
    public int f11493a;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f11494a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f11495b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y4.a f11496c;

        public a(View view, int i10, y4.a aVar) {
            this.f11494a = view;
            this.f11495b = i10;
            this.f11496c = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f11494a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f11493a == this.f11495b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                y4.a aVar = this.f11496c;
                expandableBehavior.L((View) aVar, this.f11494a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f11493a = 0;
    }

    public final boolean J(boolean z10) {
        if (!z10) {
            return this.f11493a == 1;
        }
        int i10 = this.f11493a;
        return i10 == 0 || i10 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y4.a K(CoordinatorLayout coordinatorLayout, View view) {
        List listR = coordinatorLayout.r(view);
        int size = listR.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) listR.get(i10);
            if (i(coordinatorLayout, view, view2)) {
                return (y4.a) view2;
            }
        }
        return null;
    }

    public abstract boolean L(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean i(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        y4.a aVar = (y4.a) view2;
        if (!J(aVar.a())) {
            return false;
        }
        this.f11493a = aVar.a() ? 1 : 2;
        return L((View) aVar, view, aVar.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        y4.a aVarK;
        if (view.isLaidOut() || (aVarK = K(coordinatorLayout, view)) == null || !J(aVarK.a())) {
            return false;
        }
        int i11 = aVarK.a() ? 1 : 2;
        this.f11493a = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, aVarK));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11493a = 0;
    }
}
