package com.survicate.surveys.presentation.widget;

import am.b;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ar.a;
import br.l;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import kotlin.Metadata;
import on.r;
import on.t;
import vc.e;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/survicate/surveys/presentation/widget/MicroSurveyFooter;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Llq/b0;", "a", "Lar/a;", "getOnPoweredByClick", "()Lar/a;", "setOnPoweredByClick", "(Lar/a;)V", "onPoweredByClick", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyFooter extends FrameLayout {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f6569x = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public a onPoweredByClick;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f6571d;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f6572g;

    /* renamed from: r, reason: collision with root package name */
    public final View f6573r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurveyFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        View viewInflate = View.inflate(context, t.layout_micro_powered_by_survicate, this);
        View viewFindViewById = viewInflate.findViewById(r.layout_micro_powered_by_survicate_label);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6571d = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.layout_micro_powered_by_survicate_image);
        l.d(viewFindViewById2, "findViewById(...)");
        this.f6572g = (ImageView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(r.layout_micro_powered_by_clickable_area);
        l.d(viewFindViewById3, "findViewById(...)");
        this.f6573r = viewFindViewById3;
        viewFindViewById3.setBackground(e.o(context, 0.0f));
        viewFindViewById3.setOnClickListener(new b(3, this));
    }

    public final void a(MicroColorScheme microColorScheme) {
        l.e(microColorScheme, "colorScheme");
        int background = microColorScheme.getBackground();
        int i10 = ((double) (((Color.red(background) * 299) + (Color.green(background) * 597)) + (Color.blue(background) * 114))) / ((double) 1000) > 130.0d ? -16777216 : -1;
        this.f6571d.setTextColor(i10);
        this.f6572g.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    public final a getOnPoweredByClick() {
        return this.onPoweredByClick;
    }

    public final void setOnPoweredByClick(a aVar) {
        this.onPoweredByClick = aVar;
    }
}
