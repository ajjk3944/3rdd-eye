package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e3.b;
import e3.e;
import ed.l;

/* loaded from: classes.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends b {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    @Override // e3.b
    public final /* synthetic */ boolean a(Rect rect, View view) {
        throw new ClassCastException();
    }

    @Override // e3.b
    public final void c(e eVar) {
        if (eVar.f7778h == 0) {
            eVar.f7778h = 80;
        }
    }

    @Override // e3.b
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // e3.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        throw new ClassCastException();
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.ExtendedFloatingActionButton_Behavior_Layout);
        typedArrayObtainStyledAttributes.getBoolean(l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
        typedArrayObtainStyledAttributes.getBoolean(l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
