package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import c3.f;

/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1201a;

    public Guideline(Context context) {
        super(context);
        this.f1201a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z10) {
        this.f1201a = z10;
    }

    public void setGuidelineBegin(int i10) {
        f fVar = (f) getLayoutParams();
        if (this.f1201a && fVar.f3151a == i10) {
            return;
        }
        fVar.f3151a = i10;
        setLayoutParams(fVar);
    }

    public void setGuidelineEnd(int i10) {
        f fVar = (f) getLayoutParams();
        if (this.f1201a && fVar.f3153b == i10) {
            return;
        }
        fVar.f3153b = i10;
        setLayoutParams(fVar);
    }

    public void setGuidelinePercent(float f10) {
        f fVar = (f) getLayoutParams();
        if (this.f1201a && fVar.f3155c == f10) {
            return;
        }
        fVar.f3155c = f10;
        setLayoutParams(fVar);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1201a = true;
        super.setVisibility(8);
    }
}
