package com.survicate.surveys.presentation.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import br.l;
import h7.r1;
import kotlin.Metadata;
import on.r;
import on.t;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/survicate/surveys/presentation/widget/MicroSurveyPointImage;", "Landroid/widget/FrameLayout;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointImage extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f6579a;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f6580d;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f6581g;

    /* renamed from: r, reason: collision with root package name */
    public final ViewGroup f6582r;

    /* renamed from: x, reason: collision with root package name */
    public final ProgressBar f6583x;

    /* renamed from: y, reason: collision with root package name */
    public r1 f6584y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurveyPointImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        View viewInflate = View.inflate(context, t.view_micro_survey_point_image, this);
        View viewFindViewById = viewInflate.findViewById(r.micro_survey_point_image_root);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6579a = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.micro_survey_point_image);
        l.d(viewFindViewById2, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById2;
        this.f6580d = imageView;
        View viewFindViewById3 = viewInflate.findViewById(r.micro_survey_point_image_description);
        l.d(viewFindViewById3, "findViewById(...)");
        this.f6581g = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(r.micro_survey_point_image_progress_container);
        l.d(viewFindViewById4, "findViewById(...)");
        this.f6582r = (ViewGroup) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(r.micro_survey_point_image_progress);
        l.d(viewFindViewById5, "findViewById(...)");
        this.f6583x = (ProgressBar) viewFindViewById5;
        imageView.setClipToOutline(true);
    }
}
