package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import defpackage.dq;
import defpackage.e6;
import defpackage.ga;
import defpackage.m60;
import defpackage.n20;
import defpackage.n60;
import defpackage.oo;
import defpackage.p60;
import defpackage.v60;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class LinearProgressIndicator extends ga {
    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        v60 v60Var = this.f;
        m60 m60Var = new m60(v60Var);
        m60Var.f = 300.0f;
        m60Var.o = new Pair(new dq(), new dq());
        Context context2 = getContext();
        e6 n60Var = v60Var.o == 0 ? new n60(v60Var) : new p60(context2, v60Var);
        n20 n20Var = new n20(context2, v60Var);
        n20Var.s = m60Var;
        n20Var.t = n60Var;
        n60Var.a = n20Var;
        setIndeterminateDrawable(n20Var);
        setProgressDrawable(new oo(getContext(), v60Var, m60Var));
        this.m = true;
    }

    @Override // defpackage.ga
    public final void a(int i) {
        v60 v60Var = this.f;
        if (v60Var != null && v60Var.o == 0 && isIndeterminate()) {
            return;
        }
        super.a(i);
    }

    public int getIndeterminateAnimationType() {
        return this.f.o;
    }

    public int getIndicatorDirection() {
        return this.f.p;
    }

    public int getTrackInnerCornerRadius() {
        return this.f.t;
    }

    public Integer getTrackStopIndicatorPadding() {
        return this.f.s;
    }

    public int getTrackStopIndicatorSize() {
        return this.f.r;
    }

    @Override // defpackage.ga, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        v60 v60Var = this.f;
        boolean z2 = true;
        if (v60Var.p != 1 && ((getLayoutDirection() != 1 || v60Var.p != 2) && (getLayoutDirection() != 0 || v60Var.p != 3))) {
            z2 = false;
        }
        v60Var.q = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        n20 indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        oo progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        v60 v60Var = this.f;
        if (v60Var.o == i) {
            return;
        }
        if (b() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        v60Var.o = i;
        v60Var.d();
        if (i == 0) {
            n20 indeterminateDrawable = getIndeterminateDrawable();
            n60 n60Var = new n60(v60Var);
            indeterminateDrawable.t = n60Var;
            n60Var.a = indeterminateDrawable;
        } else {
            n20 indeterminateDrawable2 = getIndeterminateDrawable();
            p60 p60Var = new p60(getContext(), v60Var);
            indeterminateDrawable2.t = p60Var;
            p60Var.a = indeterminateDrawable2;
        }
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().t.m(this.p);
        }
        invalidate();
    }

    @Override // defpackage.ga
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        this.f.d();
    }

    public void setIndicatorDirection(int i) {
        v60 v60Var = this.f;
        v60Var.p = i;
        boolean z = true;
        if (i != 1 && ((getLayoutDirection() != 1 || v60Var.p != 2) && (getLayoutDirection() != 0 || i != 3))) {
            z = false;
        }
        v60Var.q = z;
        invalidate();
    }

    @Override // defpackage.ga
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        this.f.d();
        invalidate();
    }

    public void setTrackInnerCornerRadius(int i) {
        v60 v60Var = this.f;
        if (v60Var.t != i) {
            v60Var.t = Math.round(Math.min(i, v60Var.a / 2.0f));
            v60Var.v = false;
            v60Var.w = true;
            v60Var.d();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f) {
        v60 v60Var = this.f;
        if (v60Var.u != f) {
            v60Var.u = Math.min(f, 0.5f);
            v60Var.v = true;
            v60Var.w = true;
            v60Var.d();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(Integer num) {
        v60 v60Var = this.f;
        if (Objects.equals(v60Var.s, num)) {
            return;
        }
        v60Var.s = num;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        v60 v60Var = this.f;
        if (v60Var.r != i) {
            v60Var.r = Math.min(i, v60Var.a);
            v60Var.d();
            invalidate();
        }
    }
}
