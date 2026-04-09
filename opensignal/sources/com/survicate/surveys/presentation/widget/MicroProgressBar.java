package com.survicate.surveys.presentation.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Guideline;
import br.l;
import c3.f;
import com.google.android.material.datepicker.g;
import com.survicate.surveys.entities.colors.MicroColorControlOpacity;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import java.text.NumberFormat;
import kotlin.Metadata;
import on.r;
import on.t;
import se.b;
import u3.i0;
import vc.e;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/survicate/surveys/presentation/widget/MicroProgressBar;", "Landroid/widget/FrameLayout;", "", "currentProgressInPercents", "Llq/b0;", "setProgressValue", "(D)V", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroProgressBar extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final View f6554a;

    /* renamed from: d, reason: collision with root package name */
    public final Guideline f6555d;

    /* renamed from: g, reason: collision with root package name */
    public final View f6556g;

    /* renamed from: r, reason: collision with root package name */
    public final View f6557r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        View viewInflate = View.inflate(context, t.view_micro_progress_bar, this);
        View viewFindViewById = viewInflate.findViewById(r.view_micro_progress_bar_root);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6554a = viewFindViewById;
        viewFindViewById.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        viewFindViewById.setClipToOutline(true);
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_progress_bar_guideline);
        l.d(viewFindViewById2, "findViewById(...)");
        this.f6555d = (Guideline) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(r.view_micro_progress_bar_background);
        l.d(viewFindViewById3, "findViewById(...)");
        this.f6556g = viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(r.view_micro_progress_bar_progress);
        l.d(viewFindViewById4, "findViewById(...)");
        this.f6557r = viewFindViewById4;
        i0.n(this, new g(6));
    }

    public final void a(MicroColorScheme microColorScheme) {
        l.e(microColorScheme, "colorScheme");
        this.f6557r.setBackgroundColor(microColorScheme.getProgressBar());
        this.f6556g.setBackgroundColor(b.z(microColorScheme.getQuestion(), MicroColorControlOpacity.ProgressBarBackground.getOpacityValue()));
    }

    public final void setProgressValue(double currentProgressInPercents) {
        double dF = e.f(currentProgressInPercents / 100, 0.0d, 1.0d);
        ViewGroup.LayoutParams layoutParams = this.f6555d.getLayoutParams();
        f fVar = layoutParams instanceof f ? (f) layoutParams : null;
        if (fVar != null) {
            fVar.f3155c = (float) dF;
        }
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMaximumFractionDigits(0);
        setContentDescription(percentInstance.format(dF));
    }
}
