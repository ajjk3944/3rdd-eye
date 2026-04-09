package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.lt;
import defpackage.mt;
import defpackage.vj;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends vj {
    public int a = 0;

    public ExpandableBehavior() {
    }

    @Override // defpackage.vj
    public abstract boolean f(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vj
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (mt) view2;
        boolean z = ((FloatingActionButton) obj).t.f;
        if (z) {
            int i = this.a;
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (this.a != 1) {
            return false;
        }
        this.a = z ? 1 : 2;
        w((View) obj, view, z, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vj
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        mt mtVar;
        int i2;
        if (!view.isLaidOut()) {
            ArrayList arrayListK = coordinatorLayout.k(view);
            int size = arrayListK.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    mtVar = null;
                    break;
                }
                View view2 = (View) arrayListK.get(i3);
                if (f(view, view2)) {
                    mtVar = (mt) view2;
                    break;
                }
                i3++;
            }
            if (mtVar != null) {
                boolean z = ((FloatingActionButton) mtVar).t.f;
                if (!z ? this.a == 1 : !((i2 = this.a) != 0 && i2 != 2)) {
                    int i4 = z ? 1 : 2;
                    this.a = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new lt(this, view, i4, mtVar));
                }
            }
        }
        return false;
    }

    public abstract void w(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
