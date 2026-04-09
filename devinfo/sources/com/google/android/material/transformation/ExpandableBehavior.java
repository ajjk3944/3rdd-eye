package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import p3.b;
import xc.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends b {

    /* renamed from: a, reason: collision with root package name */
    public int f20679a = 0;

    public ExpandableBehavior() {
    }

    @Override // p3.b
    public abstract boolean f(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p3.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (a) view2;
        boolean z3 = ((FloatingActionButton) obj).f20527o.f30605a;
        if (z3) {
            int i4 = this.f20679a;
            if (i4 != 0 && i4 != 2) {
                return false;
            }
        } else if (this.f20679a != 1) {
            return false;
        }
        this.f20679a = z3 ? 1 : 2;
        w((View) obj, view, z3, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p3.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        a aVar;
        int i10;
        if (!view.isLaidOut()) {
            ArrayList arrayListK = coordinatorLayout.k(view);
            int size = arrayListK.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = (View) arrayListK.get(i11);
                if (f(view, view2)) {
                    aVar = (a) view2;
                    break;
                }
                i11++;
            }
            if (aVar != null) {
                boolean z3 = ((FloatingActionButton) aVar).f20527o.f30605a;
                if (!z3 ? this.f20679a == 1 : !((i10 = this.f20679a) != 0 && i10 != 2)) {
                    int i12 = z3 ? 1 : 2;
                    this.f20679a = i12;
                    view.getViewTreeObserver().addOnPreDrawListener(new od.a(this, view, i12, aVar));
                }
            }
        }
        return false;
    }

    public abstract void w(View view, View view2, boolean z3, boolean z10);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
