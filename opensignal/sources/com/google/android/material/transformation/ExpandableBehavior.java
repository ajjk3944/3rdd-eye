package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e3.b;
import java.util.List;
import vd.a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends b {

    /* renamed from: a, reason: collision with root package name */
    public int f5797a = 0;

    public ExpandableBehavior() {
    }

    @Override // e3.b
    public abstract boolean b(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e3.b
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (a) view2;
        boolean z10 = ((FloatingActionButton) obj).K.f10067b;
        if (z10) {
            int i10 = this.f5797a;
            if (i10 != 0 && i10 != 2) {
                return false;
            }
        } else if (this.f5797a != 1) {
            return false;
        }
        this.f5797a = z10 ? 1 : 2;
        s((View) obj, view, z10, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e3.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        a aVar;
        int i11;
        if (!view.isLaidOut()) {
            List listK = coordinatorLayout.k(view);
            int size = listK.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = (View) listK.get(i12);
                if (b(view, view2)) {
                    aVar = (a) view2;
                    break;
                }
                i12++;
            }
            if (aVar != null) {
                boolean z10 = ((FloatingActionButton) aVar).K.f10067b;
                if (!z10 ? this.f5797a == 1 : !((i11 = this.f5797a) != 0 && i11 != 2)) {
                    int i13 = z10 ? 1 : 2;
                    this.f5797a = i13;
                    view.getViewTreeObserver().addOnPreDrawListener(new me.a(this, view, i13, aVar));
                }
            }
        }
        return false;
    }

    public abstract void s(View view, View view2, boolean z10, boolean z11);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
