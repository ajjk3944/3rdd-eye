package com.google.android.material.progressindicator;

import B3.d;
import B3.e;
import B3.f;
import B3.i;
import B3.k;
import B3.l;
import B3.o;
import B3.u;
import B3.v;
import android.content.Context;
import android.util.AttributeSet;
import com.apm.insight.R;

/* loaded from: classes.dex */
public class CircularProgressIndicator extends d {
    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        l lVar = (l) this.f546a;
        f fVar = new f(lVar);
        setIndeterminateDrawable(v.g(getContext(), lVar, fVar));
        setProgressDrawable(new o(getContext(), lVar, fVar));
        this.f554j = true;
    }

    @Override // B3.d
    public final e a(Context context, AttributeSet attributeSet) {
        return new l(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
    }

    public int getIndeterminateAnimationType() {
        return ((l) this.f546a).f612o;
    }

    public int getIndicatorDirection() {
        return ((l) this.f546a).f615r;
    }

    public int getIndicatorInset() {
        return ((l) this.f546a).f614q;
    }

    public int getIndicatorSize() {
        return ((l) this.f546a).f613p;
    }

    public void setIndeterminateAnimationType(int i) {
        e eVar = this.f546a;
        if (((l) eVar).f612o == i) {
            return;
        }
        if (f() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((l) eVar).f612o = i;
        ((l) eVar).d();
        u kVar = i == 1 ? new k(getContext(), (l) eVar) : new i((l) eVar);
        v indeterminateDrawable = getIndeterminateDrawable();
        indeterminateDrawable.f665C = kVar;
        kVar.f662a = indeterminateDrawable;
        c();
        invalidate();
    }

    public void setIndicatorDirection(int i) {
        ((l) this.f546a).f615r = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        e eVar = this.f546a;
        if (((l) eVar).f614q != i) {
            ((l) eVar).f614q = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        e eVar = this.f546a;
        if (((l) eVar).f613p != iMax) {
            ((l) eVar).f613p = iMax;
            ((l) eVar).d();
            requestLayout();
            invalidate();
        }
    }

    @Override // B3.d
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((l) this.f546a).d();
    }
}
