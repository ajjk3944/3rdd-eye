package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import n3.d;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f870a;

    public Guideline(Context context) {
        super(context);
        this.f870a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z3) {
        this.f870a = z3;
    }

    public void setGuidelineBegin(int i4) {
        d dVar = (d) getLayoutParams();
        if (this.f870a && dVar.f29579a == i4) {
            return;
        }
        dVar.f29579a = i4;
        setLayoutParams(dVar);
    }

    public void setGuidelineEnd(int i4) {
        d dVar = (d) getLayoutParams();
        if (this.f870a && dVar.f29581b == i4) {
            return;
        }
        dVar.f29581b = i4;
        setLayoutParams(dVar);
    }

    public void setGuidelinePercent(float f10) {
        d dVar = (d) getLayoutParams();
        if (this.f870a && dVar.f29583c == f10) {
            return;
        }
        dVar.f29583c = f10;
        setLayoutParams(dVar);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f870a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
    }
}
