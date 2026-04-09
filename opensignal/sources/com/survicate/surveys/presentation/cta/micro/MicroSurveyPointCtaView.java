package com.survicate.surveys.presentation.cta.micro;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import ar.a;
import bp.c;
import bp.d;
import bp.e;
import br.l;
import com.google.android.exoplayer2.q;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.models.QuestionValidationState;
import com.survicate.surveys.entities.survey.questions.DisclaimerSettings;
import com.survicate.surveys.entities.survey.questions.DisclaimerSettingsKt;
import com.survicate.surveys.entities.survey.questions.cta.CtaSettings;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.presentation.widget.MicroDisclaimerView;
import com.survicate.surveys.presentation.widget.MicroQuestionHeader;
import com.survicate.surveys.presentation.widget.MicroSubmitView;
import com.survicate.surveys.presentation.widget.MicroSurveyFooter;
import com.survicate.surveys.presentation.widget.MicroSurveyHeader;
import io.sentry.android.core.u0;
import ir.f0;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import on.r;
import on.t;
import u3.i0;
import u3.z;
import wo.g;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001$J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u0016\u0010#\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/survicate/surveys/presentation/cta/micro/MicroSurveyPointCtaView;", "Landroid/widget/FrameLayout;", "Lcom/survicate/surveys/entities/models/QuestionValidationState;", "getCurrentValidationState", "()Lcom/survicate/surveys/entities/models/QuestionValidationState;", "Lwo/g;", "getAnswer", "()Lwo/g;", "Landroid/os/Bundle;", "getCurrentUiState", "()Landroid/os/Bundle;", "Lkotlin/Function0;", "Llq/b0;", "a", "Lar/a;", "getOnCloseSurveyClick", "()Lar/a;", "setOnCloseSurveyClick", "(Lar/a;)V", "onCloseSurveyClick", "d", "getOnSubmitClick", "setOnSubmitClick", "onSubmitClick", "g", "getOnBackClick", "setOnBackClick", "onBackClick", "r", "getOnPoweredByClick", "setOnPoweredByClick", "onPoweredByClick", "Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "getDisclaimerSettings", "()Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "disclaimerSettings", "bp/c", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointCtaView extends FrameLayout {
    public static final /* synthetic */ int I = 0;
    public final ViewGroup B;
    public final MicroSurveyHeader D;
    public final MicroSurveyFooter E;
    public final MicroQuestionHeader F;
    public final MicroSubmitView G;
    public final MicroDisclaimerView H;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public a onCloseSurveyClick;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public a onSubmitClick;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public a onBackClick;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public a onPoweredByClick;

    /* renamed from: x, reason: collision with root package name */
    public c f6393x;

    /* renamed from: y, reason: collision with root package name */
    public final CardView f6394y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurveyPointCtaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        View viewInflate = View.inflate(context, t.view_micro_survey_point_cta, this);
        View viewFindViewById = viewInflate.findViewById(r.view_micro_survey_point_cta_card);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6394y = (CardView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_survey_point_cta_container);
        l.d(viewFindViewById2, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2;
        this.B = viewGroup;
        View viewFindViewById3 = viewInflate.findViewById(r.view_micro_survey_point_cta_survey_header);
        l.d(viewFindViewById3, "findViewById(...)");
        MicroSurveyHeader microSurveyHeader = (MicroSurveyHeader) viewFindViewById3;
        this.D = microSurveyHeader;
        View viewFindViewById4 = viewInflate.findViewById(r.view_micro_survey_point_cta_question_header);
        l.d(viewFindViewById4, "findViewById(...)");
        this.F = (MicroQuestionHeader) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(r.view_micro_survey_point_cta_disclaimer);
        l.d(viewFindViewById5, "findViewById(...)");
        this.H = (MicroDisclaimerView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(r.view_micro_survey_point_cta_submit);
        l.d(viewFindViewById6, "findViewById(...)");
        MicroSubmitView microSubmitView = (MicroSubmitView) viewFindViewById6;
        this.G = microSubmitView;
        View viewFindViewById7 = viewInflate.findViewById(r.view_micro_survey_point_cta_footer);
        l.d(viewFindViewById7, "findViewById(...)");
        MicroSurveyFooter microSurveyFooter = (MicroSurveyFooter) viewFindViewById7;
        this.E = microSurveyFooter;
        u0 u0Var = new u0(6);
        WeakHashMap weakHashMap = i0.f23177a;
        z.j(viewGroup, u0Var);
        microSurveyHeader.setOnCloseButtonListener(new d(this, 0));
        microSurveyFooter.setOnPoweredByClick(new e(this, 0));
        microSubmitView.setOnSubmitClick(new e(this, 1));
        microSubmitView.setOnBackClick(new e(this, 2));
    }

    private final DisclaimerSettings getDisclaimerSettings() {
        c cVar = this.f6393x;
        if (cVar != null) {
            return cVar.f2851g.getDisclaimerSettings();
        }
        l.l("bindingData");
        throw null;
    }

    public final void a(c cVar, Bundle bundle) {
        this.f6393x = cVar;
        boolean z10 = !cVar.f2850f;
        CardView cardView = this.f6394y;
        xu.d.b(cardView, z10);
        q qVar = new q(4, z10);
        WeakHashMap weakHashMap = i0.f23177a;
        z.j(cardView, qVar);
        this.D.a(cVar.f2846b);
        this.E.setVisibility(cVar.f2849e ? 0 : 8);
        this.F.a(cVar.f2847c);
        bq.a aVar = new bq.a(getDisclaimerSettings());
        MicroDisclaimerView microDisclaimerView = this.H;
        microDisclaimerView.a(aVar, bundle);
        microDisclaimerView.setVisibility(getDisclaimerSettings() != null ? 0 : 8);
        microDisclaimerView.setOnCheckboxToggle(new bp.a(0, this, MicroSurveyPointCtaView.class, "updateSubmitState", "updateSubmitState()V", 0, 3));
        c cVar2 = this.f6393x;
        if (cVar2 != null) {
            this.G.setState(f0.k(cVar2.f2848d, getCurrentValidationState()));
        } else {
            l.l("bindingData");
            throw null;
        }
    }

    public final g getAnswer() {
        SurveyAnswer surveyAnswer = new SurveyAnswer(null, null, null, null, null, 0.0d, null, null, null, null, null, null, 4095, null);
        surveyAnswer.setCtaSuccess(Boolean.TRUE);
        List listH = e5.H(surveyAnswer);
        DisclaimerSettings disclaimerSettings = getDisclaimerSettings();
        return new g(listH, disclaimerSettings != null ? DisclaimerSettingsKt.getCheckboxStateToSend(disclaimerSettings, this.H.f6544r.isChecked()) : null);
    }

    public final Bundle getCurrentUiState() {
        return this.H.getCurrentUiState();
    }

    public final QuestionValidationState getCurrentValidationState() {
        c cVar = this.f6393x;
        if (cVar == null) {
            l.l("bindingData");
            throw null;
        }
        CtaSettings ctaSettings = cVar.f2851g;
        boolean zIsChecked = this.H.f6544r.isChecked();
        l.e(ctaSettings, "pointSettings");
        DisclaimerSettings disclaimerSettings = ctaSettings.getDisclaimerSettings();
        boolean z10 = true;
        if (disclaimerSettings != null && !zIsChecked && disclaimerSettings.getCheckboxVisible() && disclaimerSettings.getCheckboxRequired()) {
            z10 = false;
        }
        return new QuestionValidationState(z10, false);
    }

    public final a getOnBackClick() {
        return this.onBackClick;
    }

    public final a getOnCloseSurveyClick() {
        return this.onCloseSurveyClick;
    }

    public final a getOnPoweredByClick() {
        return this.onPoweredByClick;
    }

    public final a getOnSubmitClick() {
        return this.onSubmitClick;
    }

    public final void setOnBackClick(a aVar) {
        this.onBackClick = aVar;
    }

    public final void setOnCloseSurveyClick(a aVar) {
        this.onCloseSurveyClick = aVar;
    }

    public final void setOnPoweredByClick(a aVar) {
        this.onPoweredByClick = aVar;
    }

    public final void setOnSubmitClick(a aVar) {
        this.onSubmitClick = aVar;
    }
}
