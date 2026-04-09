package defpackage;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ga extends ProgressBar {
    public final v60 f;
    public int g;
    public final boolean h;
    public final int i;
    public s4 j;
    public boolean k;
    public int l;
    public boolean m;
    public final ea n;
    public final ea o;
    public final fa p;
    public final fa q;

    public ga(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(um.z(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, R.attr.linearProgressIndicatorStyle);
        this.k = false;
        this.l = 4;
        this.n = new ea(this, 0);
        this.o = new ea(this, 1);
        this.p = new fa(this, 0);
        this.q = new fa(this, 1);
        Context context2 = getContext();
        v60 v60Var = new v60();
        v60Var.e = new int[0];
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        uk2.h(context2, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr = gn0.c;
        uk2.i(context2, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        v60Var.a = ob1.g(context2, typedArrayObtainStyledAttributes, 10, dimensionPixelSize);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null) {
            int i = typedValuePeekValue.type;
            if (i == 5) {
                v60Var.b = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), v60Var.a / 2);
                v60Var.d = false;
            } else if (i == 6) {
                v60Var.c = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                v60Var.d = true;
            }
        }
        v60Var.g = typedArrayObtainStyledAttributes.getInt(6, 0);
        v60Var.h = typedArrayObtainStyledAttributes.getInt(1, 0);
        v60Var.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        int iAbs = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0));
        v60Var.j = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(14, iAbs));
        v60Var.k = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(15, iAbs));
        v60Var.l = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0));
        v60Var.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        v60Var.n = typedArrayObtainStyledAttributes.getFloat(2, 1.0f);
        if (!typedArrayObtainStyledAttributes.hasValue(3)) {
            v60Var.e = new int[]{i41.h(context2, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(3).type != 1) {
            v60Var.e = new int[]{typedArrayObtainStyledAttributes.getColor(3, -1)};
        } else {
            int[] intArray = context2.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(3, -1));
            v60Var.e = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            v60Var.f = typedArrayObtainStyledAttributes.getColor(8, -1);
        } else {
            v60Var.f = v60Var.e[0];
            TypedArray typedArrayObtainStyledAttributes2 = context2.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            v60Var.f = i41.b(v60Var.f, (int) (f * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
        uk2.h(context2, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr2 = gn0.o;
        uk2.i(context2, attributeSet, iArr2, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        v60Var.o = typedArrayObtainStyledAttributes3.getInt(0, 1);
        v60Var.p = typedArrayObtainStyledAttributes3.getInt(1, 0);
        v60Var.r = Math.min(typedArrayObtainStyledAttributes3.getDimensionPixelSize(4, 0), v60Var.a);
        if (typedArrayObtainStyledAttributes3.hasValue(3)) {
            v60Var.s = Integer.valueOf(typedArrayObtainStyledAttributes3.getDimensionPixelSize(3, 0));
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes3.peekValue(2);
        if (typedValuePeekValue2 != null) {
            int i2 = typedValuePeekValue2.type;
            if (i2 == 5) {
                v60Var.t = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue2.data, typedArrayObtainStyledAttributes3.getResources().getDisplayMetrics()), v60Var.a / 2);
                v60Var.v = false;
                v60Var.w = true;
            } else if (i2 == 6) {
                v60Var.u = Math.min(typedValuePeekValue2.getFraction(1.0f, 1.0f), 0.5f);
                v60Var.v = true;
                v60Var.w = true;
            }
        }
        typedArrayObtainStyledAttributes3.recycle();
        v60Var.d();
        v60Var.q = v60Var.p == 1;
        this.f = v60Var;
        uk2.h(context2, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        uk2.i(context2, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        typedArrayObtainStyledAttributes4.getInt(7, -1);
        this.i = Math.min(typedArrayObtainStyledAttributes4.getInt(5, -1), 1000);
        typedArrayObtainStyledAttributes4.recycle();
        this.j = new s4();
        this.h = true;
    }

    private eq getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().s;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().s;
    }

    public void a(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.g = i;
            this.k = true;
            if (getIndeterminateDrawable().isVisible()) {
                s4 s4Var = this.j;
                ContentResolver contentResolver = getContext().getContentResolver();
                s4Var.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().t.n();
                    return;
                }
            }
            this.p.a(getIndeterminateDrawable());
        }
    }

    public final boolean b() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f.h;
    }

    public int[] getIndicatorColor() {
        return this.f.e;
    }

    public int getIndicatorTrackGapSize() {
        return this.f.i;
    }

    public int getShowAnimationBehavior() {
        return this.f.g;
    }

    public int getTrackColor() {
        return this.f.f;
    }

    public int getTrackCornerRadius() {
        return this.f.b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.f.c;
    }

    public int getTrackThickness() {
        return this.f.a;
    }

    public int getWaveAmplitude() {
        return this.f.l;
    }

    public int getWaveSpeed() {
        return this.f.m;
    }

    public int getWavelengthDeterminate() {
        return this.f.j;
    }

    public int getWavelengthIndeterminate() {
        return this.f.k;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().t.m(this.p);
        }
        oo progressDrawable = getProgressDrawable();
        fa faVar = this.q;
        if (progressDrawable != null) {
            oo progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.l == null) {
                progressDrawable2.l = new ArrayList();
            }
            if (!progressDrawable2.l.contains(faVar)) {
                progressDrawable2.l.add(faVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            n20 indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.l == null) {
                indeterminateDrawable.l = new ArrayList();
            }
            if (!indeterminateDrawable.l.contains(faVar)) {
                indeterminateDrawable.l.add(faVar);
            }
        }
        if (b()) {
            if (this.i > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.o);
        removeCallbacks(this.n);
        ((aq) getCurrentDrawable()).d(false, false, false);
        n20 indeterminateDrawable = getIndeterminateDrawable();
        fa faVar = this.q;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().f(faVar);
            getIndeterminateDrawable().t.q();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().f(faVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getCurrentDrawingDelegate().b();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            eq currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), currentDrawingDelegate.a() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.a() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.h) {
            ((aq) getCurrentDrawable()).d(b(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.h) {
            ((aq) getCurrentDrawable()).d(b(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(s4 s4Var) {
        this.j = s4Var;
        if (getProgressDrawable() != null) {
            getProgressDrawable().h = s4Var;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().h = s4Var;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f.h = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            aq aqVar = (aq) getCurrentDrawable();
            if (aqVar != null) {
                aqVar.d(false, false, false);
            }
            super.setIndeterminate(z);
            aq aqVar2 = (aq) getCurrentDrawable();
            if (aqVar2 != null) {
                aqVar2.d(b(), false, false);
            }
            if ((aqVar2 instanceof n20) && b()) {
                ((n20) aqVar2).t.p();
            }
            this.k = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f) {
        v60 v60Var = this.f;
        if (v60Var.n != f) {
            v60Var.n = f;
            getIndeterminateDrawable().t.k();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof n20) {
            ((aq) drawable).d(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            if (this.m) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{i41.h(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f.e = iArr;
        getIndeterminateDrawable().t.k();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        v60 v60Var = this.f;
        if (v60Var.i != i) {
            v60Var.i = i;
            v60Var.d();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        a(i);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (!(drawable instanceof oo)) {
            if (this.m) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            super.setProgressDrawable(drawable);
        } else {
            oo ooVar = (oo) drawable;
            ooVar.d(false, false, false);
            super.setProgressDrawable(ooVar);
            ooVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f.g = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        v60 v60Var = this.f;
        if (v60Var.f != i) {
            v60Var.f = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        v60 v60Var = this.f;
        if (v60Var.b != i) {
            v60Var.b = Math.min(i, v60Var.a / 2);
            v60Var.d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f) {
        v60 v60Var = this.f;
        if (v60Var.c != f) {
            v60Var.c = Math.min(f, 0.5f);
            v60Var.d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        v60 v60Var = this.f;
        if (v60Var.a != i) {
            v60Var.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.l = i;
    }

    public void setWaveAmplitude(int i) {
        v60 v60Var = this.f;
        if (v60Var.l != i) {
            v60Var.l = Math.abs(i);
            requestLayout();
        }
    }

    public void setWaveSpeed(int i) {
        v60 v60Var = this.f;
        v60Var.m = i;
        oo progressDrawable = getProgressDrawable();
        boolean z = v60Var.m != 0;
        ValueAnimator valueAnimator = progressDrawable.y;
        if (z && !valueAnimator.isRunning()) {
            valueAnimator.start();
        } else {
            if (z || !valueAnimator.isRunning()) {
                return;
            }
            valueAnimator.cancel();
        }
    }

    public void setWavelength(int i) {
        setWavelengthDeterminate(i);
        setWavelengthIndeterminate(i);
    }

    public void setWavelengthDeterminate(int i) {
        v60 v60Var = this.f;
        if (v60Var.j != i) {
            v60Var.j = Math.abs(i);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i) {
        v60 v60Var = this.f;
        if (v60Var.k != i) {
            v60Var.k = Math.abs(i);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public n20 getIndeterminateDrawable() {
        return (n20) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public oo getProgressDrawable() {
        return (oo) super.getProgressDrawable();
    }
}
