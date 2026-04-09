package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: b, reason: collision with root package name */
    public boolean f15291b;

    public Guideline(Context context) {
        super(context);
        this.f15291b = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z10) {
        this.f15291b = z10;
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f15291b && bVar.f15240a == i) {
            return;
        }
        bVar.f15240a = i;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f15291b && bVar.f15242b == i) {
            return;
        }
        bVar.f15242b = i;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f15291b && bVar.f15244c == f10) {
            return;
        }
        bVar.f15244c = f10;
        setLayoutParams(bVar);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15291b = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
