package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class cf extends View {
    private final emc emc;
    private View ypw;

    public interface emc {
        View emc(Context context);
    }

    public cf(Context context, emc emcVar) {
        super(context);
        this.emc = emcVar;
        emc();
    }

    private void emc() {
        setVisibility(8);
        setWillNotDraw(true);
    }

    private View ypw() {
        emc emcVar;
        if (this.ypw == null && (emcVar = this.emc) != null) {
            this.ypw = emcVar.emc(getContext());
            emc(this.ypw, (ViewGroup) getParent());
        }
        return this.ypw;
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        View view = this.ypw;
        if (view != null) {
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            ypw();
        }
    }

    private void emc(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }
}
