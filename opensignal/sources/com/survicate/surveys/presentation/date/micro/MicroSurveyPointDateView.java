package com.survicate.surveys.presentation.date.micro;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import ar.a;
import br.l;
import com.google.android.exoplayer2.q;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.models.QuestionValidationState;
import com.survicate.surveys.entities.survey.questions.DisclaimerSettings;
import com.survicate.surveys.entities.survey.questions.DisclaimerSettingsKt;
import com.survicate.surveys.entities.survey.questions.question.date.SurveyPointDateSettings;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.presentation.widget.MicroDisclaimerView;
import com.survicate.surveys.presentation.widget.MicroSubmitView;
import com.survicate.surveys.presentation.widget.MicroSurveyFooter;
import com.survicate.surveys.presentation.widget.MicroSurveyHeader;
import com.survicate.surveys.utils.SurvicateLocalDate;
import dp.d;
import dp.e;
import i4.b;
import io.sentry.android.core.u0;
import ir.f0;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import on.n;
import on.r;
import on.t;
import u3.i0;
import u3.z;
import wo.g;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001,J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R*\u0010#\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\u0016\u0010'\u001a\u0004\u0018\u00010$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/survicate/surveys/presentation/date/micro/MicroSurveyPointDateView;", "Landroid/widget/FrameLayout;", "Lcom/survicate/surveys/entities/models/QuestionValidationState;", "getCurrentValidationState", "()Lcom/survicate/surveys/entities/models/QuestionValidationState;", "Lwo/g;", "getAnswer", "()Lwo/g;", "Landroid/os/Bundle;", "getCurrentUiState", "()Landroid/os/Bundle;", "Lkotlin/Function0;", "Llq/b0;", "a", "Lar/a;", "getOnSelectDateClick", "()Lar/a;", "setOnSelectDateClick", "(Lar/a;)V", "onSelectDateClick", "d", "getOnCloseSurveyClick", "setOnCloseSurveyClick", "onCloseSurveyClick", "g", "getOnSubmitClick", "setOnSubmitClick", "onSubmitClick", "r", "getOnBackClick", "setOnBackClick", "onBackClick", "x", "getOnPoweredByClick", "setOnPoweredByClick", "onPoweredByClick", "Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "getDisclaimerSettings", "()Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "disclaimerSettings", "Lcom/survicate/surveys/utils/SurvicateLocalDate;", "getSelectedDate", "()Lcom/survicate/surveys/utils/SurvicateLocalDate;", "selectedDate", "dp/d", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointDateView extends FrameLayout {
    public static final /* synthetic */ int J = 0;
    public final CardView B;
    public final ViewGroup D;
    public final MicroSurveyHeader E;
    public final MicroSurveyPointDateContentView F;
    public final MicroDisclaimerView G;
    public final MicroSubmitView H;
    public final MicroSurveyFooter I;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public a onSelectDateClick;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public a onCloseSurveyClick;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public a onSubmitClick;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public a onBackClick;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public a onPoweredByClick;

    /* renamed from: y, reason: collision with root package name */
    public d f6406y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurveyPointDateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        View viewInflate = View.inflate(context, t.view_micro_survey_point_date, this);
        View viewFindViewById = viewInflate.findViewById(r.view_micro_survey_point_date_card);
        l.d(viewFindViewById, "findViewById(...)");
        this.B = (CardView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_survey_point_date_container);
        l.d(viewFindViewById2, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2;
        this.D = viewGroup;
        View viewFindViewById3 = viewInflate.findViewById(r.view_micro_survey_point_date_wrapper);
        l.d(viewFindViewById3, "findViewById(...)");
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(r.view_micro_survey_point_date_survey_header);
        l.d(viewFindViewById4, "findViewById(...)");
        MicroSurveyHeader microSurveyHeader = (MicroSurveyHeader) viewFindViewById4;
        this.E = microSurveyHeader;
        View viewFindViewById5 = viewInflate.findViewById(r.view_micro_survey_point_date_content);
        l.d(viewFindViewById5, "findViewById(...)");
        MicroSurveyPointDateContentView microSurveyPointDateContentView = (MicroSurveyPointDateContentView) viewFindViewById5;
        this.F = microSurveyPointDateContentView;
        View viewFindViewById6 = viewInflate.findViewById(r.view_micro_survey_point_date_disclaimer);
        l.d(viewFindViewById6, "findViewById(...)");
        MicroDisclaimerView microDisclaimerView = (MicroDisclaimerView) viewFindViewById6;
        this.G = microDisclaimerView;
        View viewFindViewById7 = viewInflate.findViewById(r.view_micro_survey_point_date_submit);
        l.d(viewFindViewById7, "findViewById(...)");
        MicroSubmitView microSubmitView = (MicroSubmitView) viewFindViewById7;
        this.H = microSubmitView;
        View viewFindViewById8 = viewInflate.findViewById(r.view_micro_survey_point_date_footer);
        l.d(viewFindViewById8, "findViewById(...)");
        MicroSurveyFooter microSurveyFooter = (MicroSurveyFooter) viewFindViewById8;
        this.I = microSurveyFooter;
        u0 u0Var = new u0(6);
        WeakHashMap weakHashMap = i0.f23177a;
        z.j(viewGroup, u0Var);
        List listI = e5.I(microDisclaimerView, microSubmitView, microSurveyFooter);
        Resources resources = viewGroup2.getResources();
        l.d(resources, "getResources(...)");
        if (!resources.getBoolean(n.isLandscape)) {
            z.j(viewGroup2, new b((View) viewGroup2, listI));
        }
        microSurveyHeader.setOnCloseButtonListener(new bp.d(this, 1));
        microSurveyPointDateContentView.setOnSelectDateClick(new e(this, 0));
        microSubmitView.setOnSubmitClick(new e(this, 1));
        microSubmitView.setOnBackClick(new e(this, 2));
        microSurveyFooter.setOnPoweredByClick(new e(this, 3));
    }

    private final DisclaimerSettings getDisclaimerSettings() {
        d dVar = this.f6406y;
        if (dVar != null) {
            return dVar.f7432f.getDisclaimerSettings();
        }
        l.l("bindingData");
        throw null;
    }

    public final void a(d dVar, Bundle bundle) {
        this.f6406y = dVar;
        boolean z10 = !dVar.f7431e;
        CardView cardView = this.B;
        xu.d.b(cardView, z10);
        q qVar = new q(4, z10);
        WeakHashMap weakHashMap = i0.f23177a;
        z.j(cardView, qVar);
        dp.b bVar = dVar.f7427a;
        MicroSurveyPointDateContentView microSurveyPointDateContentView = this.F;
        microSurveyPointDateContentView.a(bVar, bundle);
        microSurveyPointDateContentView.setOnValidationStateUpdate(new bp.a(0, this, MicroSurveyPointDateView.class, "updateSubmitState", "updateSubmitState()V", 0, 15));
        this.E.a(dVar.f7428b);
        this.I.setVisibility(dVar.f7430d ? 0 : 8);
        bq.a aVar = new bq.a(getDisclaimerSettings());
        MicroDisclaimerView microDisclaimerView = this.G;
        microDisclaimerView.a(aVar, bundle);
        microDisclaimerView.setVisibility(getDisclaimerSettings() != null ? 0 : 8);
        microDisclaimerView.setOnCheckboxToggle(new bp.a(0, this, MicroSurveyPointDateView.class, "updateSubmitState", "updateSubmitState()V", 0, 16));
        b();
    }

    public final void b() throws Resources.NotFoundException {
        d dVar = this.f6406y;
        if (dVar == null) {
            l.l("bindingData");
            throw null;
        }
        this.H.setState(f0.k(dVar.f7429c, getCurrentValidationState()));
    }

    public final g getAnswer() {
        List<SurveyAnswer> answer = this.F.getAnswer();
        DisclaimerSettings disclaimerSettings = getDisclaimerSettings();
        return new g(answer, disclaimerSettings != null ? DisclaimerSettingsKt.getCheckboxStateToSend(disclaimerSettings, this.G.f6544r.isChecked()) : null);
    }

    public final Bundle getCurrentUiState() {
        return xu.d.T(this.F.getCurrentUiState(), this.G.getCurrentUiState());
    }

    public final QuestionValidationState getCurrentValidationState() {
        d dVar = this.f6406y;
        if (dVar == null) {
            l.l("bindingData");
            throw null;
        }
        SurveyPointDateSettings surveyPointDateSettings = dVar.f7432f;
        boolean zD0 = tt.l.D0(this.F.getCommentFieldText());
        boolean zIsChecked = this.G.f6544r.isChecked();
        l.e(surveyPointDateSettings, "pointSettings");
        boolean z10 = (zD0 && (surveyPointDateSettings.getAddComment() && l.a(surveyPointDateSettings.isCommentMandatory(), Boolean.TRUE))) ? false : true;
        DisclaimerSettings disclaimerSettings = surveyPointDateSettings.getDisclaimerSettings();
        return new QuestionValidationState(z10 && (disclaimerSettings == null || zIsChecked || !disclaimerSettings.getCheckboxVisible() || !disclaimerSettings.getCheckboxRequired()), false);
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

    public final a getOnSelectDateClick() {
        return this.onSelectDateClick;
    }

    public final a getOnSubmitClick() {
        return this.onSubmitClick;
    }

    public final SurvicateLocalDate getSelectedDate() {
        return this.F.getSelectedDate();
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

    public final void setOnSelectDateClick(a aVar) {
        this.onSelectDateClick = aVar;
    }

    public final void setOnSubmitClick(a aVar) {
        this.onSubmitClick = aVar;
    }
}
