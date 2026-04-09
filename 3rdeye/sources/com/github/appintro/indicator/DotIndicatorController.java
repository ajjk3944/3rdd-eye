package com.github.appintro.indicator;

import D0.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.github.appintro.R;
import kotlin.jvm.internal.l;
import z0.C5848a;

/* compiled from: DotIndicatorController.kt */
/* loaded from: classes.dex */
public final class DotIndicatorController extends LinearLayout implements IndicatorController {
    private int currentPosition;
    private int selectedIndicatorColor;
    private int slideCount;
    private int unselectedIndicatorColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotIndicatorController(Context context) {
        super(context);
        l.f(context, "context");
        this.selectedIndicatorColor = C5848a.getColor(context, R.color.appintro_default_selected_color);
        this.unselectedIndicatorColor = C5848a.getColor(context, R.color.appintro_default_unselected_color);
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
        this.slideCount = i;
        int i10 = 0;
        while (i10 < i) {
            i10++;
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(C5848a.getDrawable(getContext(), R.drawable.ic_appintro_indicator));
            ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i == 1) {
                imageView.setVisibility(4);
            }
            addView(imageView, layoutParams);
        }
        selectPosition(0);
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public View newInstance(Context context) {
        l.f(context, "context");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 16;
        setLayoutParams(layoutParams);
        setOrientation(0);
        setGravity(17);
        return this;
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public void selectPosition(int i) {
        this.currentPosition = i;
        int i10 = this.slideCount;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i11 + 1;
            int selectedIndicatorColor = i11 == i ? getSelectedIndicatorColor() : getUnselectedIndicatorColor();
            View childAt = getChildAt(i11);
            if (childAt == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            a.C0009a.g(((ImageView) childAt).getDrawable(), selectedIndicatorColor);
            i11 = i12;
        }
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public void setSelectedIndicatorColor(int i) {
        this.selectedIndicatorColor = i;
        selectPosition(this.currentPosition);
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public void setUnselectedIndicatorColor(int i) {
        this.unselectedIndicatorColor = i;
        selectPosition(this.currentPosition);
    }
}
