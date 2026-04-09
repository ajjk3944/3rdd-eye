package com.google.android.material.progressindicator;

import B3.A;
import B3.B;
import B3.d;
import B3.e;
import B3.o;
import B3.s;
import B3.v;
import B3.w;
import B3.y;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import com.apm.insight.R;
import d3.AbstractC2266a;
import j$.util.Objects;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public class LinearProgressIndicator extends d {
    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        B b5 = (B) this.f546a;
        w wVar = new w(b5);
        wVar.f668f = 300.0f;
        wVar.f676o = new Pair(new s(), new s());
        Context context2 = getContext();
        setIndeterminateDrawable(new v(context2, b5, wVar, b5.f532o == 0 ? new y(b5) : new A(context2, b5)));
        setProgressDrawable(new o(getContext(), b5, wVar));
        this.f554j = true;
    }

    @Override // B3.d
    public final e a(Context context, AttributeSet attributeSet) {
        B b5 = new B(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        AbstractC2993B.a(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr = AbstractC2266a.f19763r;
        AbstractC2993B.b(context, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        b5.f532o = typedArrayObtainStyledAttributes.getInt(0, 1);
        b5.f533p = typedArrayObtainStyledAttributes.getInt(1, 0);
        b5.f535r = Math.min(typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0), b5.f559a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            b5.f536s = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(2);
        if (typedValuePeekValue != null) {
            int i = typedValuePeekValue.type;
            if (i == 5) {
                b5.f537t = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), b5.f559a / 2);
                b5.f539v = false;
                b5.f540w = true;
            } else if (i == 6) {
                b5.f538u = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                b5.f539v = true;
                b5.f540w = true;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        b5.d();
        b5.f534q = b5.f533p == 1;
        return b5;
    }

    @Override // B3.d
    public final void d(int i) {
        e eVar = this.f546a;
        if (eVar != null && ((B) eVar).f532o == 0 && isIndeterminate()) {
            return;
        }
        super.d(i);
    }

    public int getIndeterminateAnimationType() {
        return ((B) this.f546a).f532o;
    }

    public int getIndicatorDirection() {
        return ((B) this.f546a).f533p;
    }

    public int getTrackInnerCornerRadius() {
        return ((B) this.f546a).f537t;
    }

    public Integer getTrackStopIndicatorPadding() {
        return ((B) this.f546a).f536s;
    }

    public int getTrackStopIndicatorSize() {
        return ((B) this.f546a).f535r;
    }

    @Override // B3.d, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        super.onLayout(z6, i, i3, i6, i7);
        e eVar = this.f546a;
        B b5 = (B) eVar;
        boolean z7 = true;
        if (((B) eVar).f533p != 1 && ((getLayoutDirection() != 1 || ((B) eVar).f533p != 2) && (getLayoutDirection() != 0 || ((B) eVar).f533p != 3))) {
            z7 = false;
        }
        b5.f534q = z7;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i3, int i6, int i7) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i3 - (getPaddingBottom() + getPaddingTop());
        v indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        o progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        e eVar = this.f546a;
        if (((B) eVar).f532o == i) {
            return;
        }
        if (f() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((B) eVar).f532o = i;
        ((B) eVar).d();
        if (i == 0) {
            v indeterminateDrawable = getIndeterminateDrawable();
            y yVar = new y((B) eVar);
            indeterminateDrawable.f665C = yVar;
            yVar.f662a = indeterminateDrawable;
        } else {
            v indeterminateDrawable2 = getIndeterminateDrawable();
            A a6 = new A(getContext(), (B) eVar);
            indeterminateDrawable2.f665C = a6;
            a6.f662a = indeterminateDrawable2;
        }
        c();
        invalidate();
    }

    @Override // B3.d
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((B) this.f546a).d();
    }

    public void setIndicatorDirection(int i) {
        e eVar = this.f546a;
        ((B) eVar).f533p = i;
        B b5 = (B) eVar;
        boolean z6 = true;
        if (i != 1 && ((getLayoutDirection() != 1 || ((B) eVar).f533p != 2) && (getLayoutDirection() != 0 || i != 3))) {
            z6 = false;
        }
        b5.f534q = z6;
        invalidate();
    }

    @Override // B3.d
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((B) this.f546a).d();
        invalidate();
    }

    public void setTrackInnerCornerRadius(int i) {
        e eVar = this.f546a;
        if (((B) eVar).f537t != i) {
            ((B) eVar).f537t = Math.round(Math.min(i, ((B) eVar).f559a / 2.0f));
            ((B) eVar).f539v = false;
            ((B) eVar).f540w = true;
            ((B) eVar).d();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f2) {
        e eVar = this.f546a;
        if (((B) eVar).f538u != f2) {
            ((B) eVar).f538u = Math.min(f2, 0.5f);
            ((B) eVar).f539v = true;
            ((B) eVar).f540w = true;
            ((B) eVar).d();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(Integer num) {
        e eVar = this.f546a;
        if (Objects.equals(((B) eVar).f536s, num)) {
            return;
        }
        ((B) eVar).f536s = num;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        e eVar = this.f546a;
        if (((B) eVar).f535r != i) {
            ((B) eVar).f535r = Math.min(i, ((B) eVar).f559a);
            ((B) eVar).d();
            invalidate();
        }
    }
}
