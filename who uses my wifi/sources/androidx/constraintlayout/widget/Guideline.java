package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ci;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class Guideline extends View {
    public boolean f;

    public Guideline(Context context) {
        super(context);
        this.f = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f = z;
    }

    public void setGuidelineBegin(int i) {
        ci ciVar = (ci) getLayoutParams();
        if (this.f && ciVar.a == i) {
            return;
        }
        ciVar.a = i;
        setLayoutParams(ciVar);
    }

    public void setGuidelineEnd(int i) {
        ci ciVar = (ci) getLayoutParams();
        if (this.f && ciVar.b == i) {
            return;
        }
        ciVar.b = i;
        setLayoutParams(ciVar);
    }

    public void setGuidelinePercent(float f) {
        ci ciVar = (ci) getLayoutParams();
        if (this.f && ciVar.c == f) {
            return;
        }
        ciVar.c = f;
        setLayoutParams(ciVar);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
