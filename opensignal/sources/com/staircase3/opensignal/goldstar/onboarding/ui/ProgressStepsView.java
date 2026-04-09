package com.staircase3.opensignal.goldstar.onboarding.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import br.l;
import kotlin.Metadata;
import qk.d;
import qk.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/staircase3/opensignal/goldstar/onboarding/ui/ProgressStepsView;", "Landroid/view/View;", "", "value", "a", "I", "getCurrentStep", "()I", "setCurrentStep", "(I)V", "currentStep", "d", "getTotalSteps", "setTotalSteps", "totalSteps", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressStepsView extends View {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int currentStep;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int totalSteps;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f6068g;

    /* renamed from: r, reason: collision with root package name */
    public final RectF f6069r;

    /* renamed from: x, reason: collision with root package name */
    public final int f6070x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressStepsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        this.f6068g = new Paint(1);
        this.f6069r = new RectF();
        this.f6070x = context.getResources().getDimensionPixelSize(e.keyline_quarter);
        setCurrentStep(0);
        if (isInEditMode()) {
            setTotalSteps(3);
            setCurrentStep(1);
            invalidate();
        }
    }

    public final int getCurrentStep() {
        return this.currentStep;
    }

    public final int getTotalSteps() {
        return this.totalSteps;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        l.e(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        int i10 = this.f6070x;
        float f10 = height - (i10 * 2);
        int i11 = this.totalSteps;
        float f11 = (width - ((i11 - 1) * i10)) / i11;
        int i12 = 0;
        while (i12 < i11) {
            float f12 = i12 * f11;
            if (i12 > 0) {
                f12 += i10 * i12;
            }
            RectF rectF = this.f6069r;
            rectF.set(f12, 0.0f, f12 + f11, f10);
            int color = getContext().getColor(i12 <= this.currentStep ? d.primary_1 : d.secondary_1);
            Paint paint = this.f6068g;
            paint.setColor(color);
            canvas.drawRect(rectF, paint);
            i12++;
        }
    }

    public final void setCurrentStep(int i10) {
        this.currentStep = i10;
        invalidate();
    }

    public final void setTotalSteps(int i10) {
        this.totalSteps = i10;
        invalidate();
    }
}
