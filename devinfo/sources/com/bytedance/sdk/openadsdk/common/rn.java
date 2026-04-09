package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class rn extends View {
    private final ouw ouw;
    private View vt;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        View ouw(Context context);
    }

    public rn(Context context, ouw ouwVar) {
        super(context);
        this.ouw = ouwVar;
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setVisibility(int i4) {
        ouw ouwVar;
        View view = this.vt;
        if (view != null) {
            view.setVisibility(i4);
            return;
        }
        super.setVisibility(i4);
        if ((i4 == 0 || i4 == 4) && this.vt == null && (ouwVar = this.ouw) != null) {
            this.vt = ouwVar.ouw(getContext());
            ViewParent parent = getParent();
            View view2 = this.vt;
            ViewGroup viewGroup = (ViewGroup) parent;
            int iIndexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(view2, iIndexOfChild, layoutParams);
            } else {
                viewGroup.addView(view2, iIndexOfChild);
            }
        }
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }
}
