package com.github.appintro.indicator;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.github.appintro.internal.LayoutUtil;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: ProgressIndicatorController.kt */
/* loaded from: classes.dex */
public final class ProgressIndicatorController extends ProgressBar implements IndicatorController {
    private int selectedIndicatorColor;
    private int unselectedIndicatorColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorController(Context context) {
        this(context, null, 0, 6, null);
        l.f(context, "context");
    }

    private final boolean isRtl() {
        Context context = getContext();
        l.e(context, "this.context");
        return LayoutUtil.isRtl(context);
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public int getSelectedIndicatorColor() {
        return this.selectedIndicatorColor;
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public int getUnselectedIndicatorColor() {
        return this.unselectedIndicatorColor;
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public void initialize(int i) {
        setMax(i);
        if (isRtl()) {
            setScaleX(-1.0f);
        }
        if (i == 1) {
            setVisibility(4);
        }
        selectPosition(0);
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public ProgressIndicatorController newInstance(Context context) {
        l.f(context, "context");
        return this;
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public void selectPosition(int i) {
        setProgress(isRtl() ? getMax() - i : i + 1);
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public void setSelectedIndicatorColor(int i) {
        this.selectedIndicatorColor = i;
        getProgressDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public void setUnselectedIndicatorColor(int i) {
        this.unselectedIndicatorColor = i;
        getIndeterminateDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorController(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        l.f(context, "context");
    }

    public /* synthetic */ ProgressIndicatorController(Context context, AttributeSet attributeSet, int i, int i10, g gVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R.attr.progressBarStyleHorizontal : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorController(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.selectedIndicatorColor = 1;
        this.unselectedIndicatorColor = 1;
    }
}
