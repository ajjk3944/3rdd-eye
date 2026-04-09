package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@Deprecated
/* loaded from: classes3.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: b, reason: collision with root package name */
    private final Rect f37971b;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f37972c;

    /* renamed from: d, reason: collision with root package name */
    private final RectF f37973d;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f37974e;

    public FabTransformationBehavior() {
        this.f37971b = new Rect();
        this.f37972c = new RectF();
        this.f37973d = new RectF();
        this.f37974e = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void g(CoordinatorLayout.e eVar) {
        if (eVar.f30647h == 0) {
            eVar.f30647h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37971b = new Rect();
        this.f37972c = new RectF();
        this.f37973d = new RectF();
        this.f37974e = new int[2];
    }
}
