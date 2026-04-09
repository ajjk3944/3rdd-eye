package com.survicate.surveys.presentation.form.micro;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import ar.a;
import bp.d;
import br.l;
import com.google.android.exoplayer2.q;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.models.QuestionValidationState;
import com.survicate.surveys.entities.survey.questions.DisclaimerSettings;
import com.survicate.surveys.entities.survey.questions.DisclaimerSettingsKt;
import com.survicate.surveys.entities.survey.questions.form.SurveyFormPointSettings;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.presentation.widget.MicroDisclaimerView;
import com.survicate.surveys.presentation.widget.MicroSubmitView;
import com.survicate.surveys.presentation.widget.MicroSurveyFooter;
import com.survicate.surveys.presentation.widget.MicroSurveyHeader;
import gp.e;
import gp.f;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001$J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u0016\u0010#\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/survicate/surveys/presentation/form/micro/MicroSurveyPointFormView;", "Landroid/widget/FrameLayout;", "Lcom/survicate/surveys/entities/models/QuestionValidationState;", "getInitialValidationState", "()Lcom/survicate/surveys/entities/models/QuestionValidationState;", "Lwo/g;", "getAnswer", "()Lwo/g;", "Landroid/os/Bundle;", "getCurrentUiState", "()Landroid/os/Bundle;", "Lkotlin/Function0;", "Llq/b0;", "a", "Lar/a;", "getOnCloseSurveyClick", "()Lar/a;", "setOnCloseSurveyClick", "(Lar/a;)V", "onCloseSurveyClick", "d", "getOnSubmitClick", "setOnSubmitClick", "onSubmitClick", "g", "getOnBackClick", "setOnBackClick", "onBackClick", "r", "getOnPoweredByClick", "setOnPoweredByClick", "onPoweredByClick", "Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "getDisclaimerSettings", "()Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "disclaimerSettings", "gp/e", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointFormView extends FrameLayout {
    public static final /* synthetic */ int I = 0;
    public final ViewGroup B;
    public final MicroSurveyHeader D;
    public final MicroSurveyPointFormContentView E;
    public final MicroDisclaimerView F;
    public final MicroSubmitView G;
    public final MicroSurveyFooter H;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public a onCloseSurveyClick;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public a onSubmitClick;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public a onBackClick;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public a onPoweredByClick;

    /* renamed from: x, reason: collision with root package name */
    public e f6416x;

    /* renamed from: y, reason: collision with root package name */
    public final CardView f6417y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurveyPointFormView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        View viewInflate = View.inflate(context, t.view_micro_survey_point_form, this);
        View viewFindViewById = viewInflate.findViewById(r.view_micro_survey_point_form_card);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6417y = (CardView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_survey_point_form_container);
        l.d(viewFindViewById2, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2;
        this.B = viewGroup;
        View viewFindViewById3 = viewInflate.findViewById(r.view_micro_survey_point_form_wrapper);
        l.d(viewFindViewById3, "findViewById(...)");
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(r.view_micro_survey_point_form_survey_header);
        l.d(viewFindViewById4, "findViewById(...)");
        MicroSurveyHeader microSurveyHeader = (MicroSurveyHeader) viewFindViewById4;
        this.D = microSurveyHeader;
        View viewFindViewById5 = viewInflate.findViewById(r.view_micro_survey_point_form_content);
        l.d(viewFindViewById5, "findViewById(...)");
        this.E = (MicroSurveyPointFormContentView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(r.view_micro_survey_point_form_disclaimer);
        l.d(viewFindViewById6, "findViewById(...)");
        MicroDisclaimerView microDisclaimerView = (MicroDisclaimerView) viewFindViewById6;
        this.F = microDisclaimerView;
        View viewFindViewById7 = viewInflate.findViewById(r.view_micro_survey_point_form_submit);
        l.d(viewFindViewById7, "findViewById(...)");
        MicroSubmitView microSubmitView = (MicroSubmitView) viewFindViewById7;
        this.G = microSubmitView;
        View viewFindViewById8 = viewInflate.findViewById(r.view_micro_survey_point_form_footer);
        l.d(viewFindViewById8, "findViewById(...)");
        MicroSurveyFooter microSurveyFooter = (MicroSurveyFooter) viewFindViewById8;
        this.H = microSurveyFooter;
        u0 u0Var = new u0(6);
        WeakHashMap weakHashMap = i0.f23177a;
        z.j(viewGroup, u0Var);
        List listI = e5.I(microDisclaimerView, microSubmitView, microSurveyFooter);
        Resources resources = viewGroup2.getResources();
        l.d(resources, "getResources(...)");
        if (!resources.getBoolean(n.isLandscape)) {
            z.j(viewGroup2, new b((View) viewGroup2, listI));
        }
        microSurveyHeader.setOnCloseButtonListener(new d(this, 2));
        microSubmitView.setOnSubmitClick(new f(this, 0));
        microSubmitView.setOnBackClick(new f(this, 1));
        microSurveyFooter.setOnPoweredByClick(new f(this, 2));
    }

    private final DisclaimerSettings getDisclaimerSettings() {
        e eVar = this.f6416x;
        if (eVar != null) {
            return eVar.f9639f.getDisclaimerSettings();
        }
        l.l("bindingData");
        throw null;
    }

    private final QuestionValidationState getInitialValidationState() {
        e eVar = this.f6416x;
        if (eVar == null) {
            l.l("bindingData");
            throw null;
        }
        SurveyFormPointSettings surveyFormPointSettings = eVar.f9639f;
        boolean zC = this.E.c();
        boolean zIsChecked = this.F.f6544r.isChecked();
        l.e(surveyFormPointSettings, "pointSettings");
        DisclaimerSettings disclaimerSettings = surveyFormPointSettings.getDisclaimerSettings();
        return new QuestionValidationState(zC && (disclaimerSettings == null || zIsChecked || !disclaimerSettings.getCheckboxVisible() || !disclaimerSettings.getCheckboxRequired()), false);
    }

    public final void a(e eVar, Bundle bundle) {
        this.f6416x = eVar;
        boolean z10 = !eVar.f9638e;
        CardView cardView = this.f6417y;
        xu.d.b(cardView, z10);
        q qVar = new q(4, z10);
        WeakHashMap weakHashMap = i0.f23177a;
        z.j(cardView, qVar);
        gp.a aVar = eVar.f9634a;
        MicroSurveyPointFormContentView microSurveyPointFormContentView = this.E;
        microSurveyPointFormContentView.a(aVar, bundle);
        microSurveyPointFormContentView.setOnInitialValidationStateUpdate(new bp.a(0, this, MicroSurveyPointFormView.class, "updateSubmitState", "updateSubmitState()V", 0, 21));
        this.D.a(eVar.f9635b);
        this.H.setVisibility(eVar.f9637d ? 0 : 8);
        bq.a aVar2 = new bq.a(getDisclaimerSettings());
        MicroDisclaimerView microDisclaimerView = this.F;
        microDisclaimerView.a(aVar2, bundle);
        microDisclaimerView.setVisibility(getDisclaimerSettings() != null ? 0 : 8);
        microDisclaimerView.setOnCheckboxToggle(new bp.a(0, this, MicroSurveyPointFormView.class, "updateSubmitState", "updateSubmitState()V", 0, 22));
        b();
    }

    public final void b() throws Resources.NotFoundException {
        e eVar = this.f6416x;
        if (eVar == null) {
            l.l("bindingData");
            throw null;
        }
        this.G.setState(f0.k(eVar.f9636c, getInitialValidationState()));
    }

    public final boolean c() {
        if (!this.E.b()) {
            return false;
        }
        DisclaimerSettings disclaimerSettings = getDisclaimerSettings();
        return disclaimerSettings == null || this.F.f6544r.isChecked() || !disclaimerSettings.getCheckboxVisible() || !disclaimerSettings.getCheckboxRequired();
    }

    public final g getAnswer() {
        List<SurveyAnswer> answer = this.E.getAnswer();
        DisclaimerSettings disclaimerSettings = getDisclaimerSettings();
        return new g(answer, disclaimerSettings != null ? DisclaimerSettingsKt.getCheckboxStateToSend(disclaimerSettings, this.F.f6544r.isChecked()) : null);
    }

    public final Bundle getCurrentUiState() {
        return xu.d.T(this.E.getCurrentUiState(), this.F.getCurrentUiState());
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
