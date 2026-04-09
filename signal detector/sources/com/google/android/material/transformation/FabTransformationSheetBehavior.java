package com.google.android.material.transformation;

import V2.h;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b4.C0344i;
import com.apm.insight.R;
import e3.e;
import java.util.HashMap;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public HashMap i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final h D(Context context, boolean z6) {
        int i = z6 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        h hVar = new h(8, false);
        hVar.f3875b = e.b(context, i);
        hVar.f3876c = new C0344i(7);
        return hVar;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void w(View view, View view2, boolean z6, boolean z7) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z6) {
                this.i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z8 = (childAt.getLayoutParams() instanceof E.e) && (((E.e) childAt.getLayoutParams()).f1311a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z8) {
                    if (z6) {
                        this.i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    } else {
                        HashMap map = this.i;
                        if (map != null && map.containsKey(childAt)) {
                            childAt.setImportantForAccessibility(((Integer) this.i.get(childAt)).intValue());
                        }
                    }
                }
            }
            if (!z6) {
                this.i = null;
            }
        }
        super.w(view, view2, z6, z7);
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
