package com.survicate.surveys.presentation.nps.micro;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import ar.a;
import ar.n;
import bp.d;
import br.l;
import com.google.android.exoplayer2.q;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.models.QuestionValidationState;
import com.survicate.surveys.entities.survey.questions.DisclaimerSettings;
import com.survicate.surveys.entities.survey.questions.DisclaimerSettingsKt;
import com.survicate.surveys.entities.survey.questions.nps.SurveyNpsPointSettings;
import com.survicate.surveys.presentation.widget.MicroDisclaimerView;
import com.survicate.surveys.presentation.widget.MicroSubmitView;
import com.survicate.surveys.presentation.widget.MicroSurveyFooter;
import com.survicate.surveys.presentation.widget.MicroSurveyHeader;
import i4.b;
import io.sentry.android.core.u0;
import ir.f0;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import mp.f;
import mp.g;
import on.r;
import on.t;
import u3.i0;
import u3.z;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001-J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR6\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010 \u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR*\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u0016\u0010,\u001a\u0004\u0018\u00010)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/survicate/surveys/presentation/nps/micro/MicroSurveyPointNpsView;", "Landroid/widget/FrameLayout;", "Lcom/survicate/surveys/entities/models/QuestionValidationState;", "getCurrentValidationState", "()Lcom/survicate/surveys/entities/models/QuestionValidationState;", "Lwo/g;", "getAnswer", "()Lwo/g;", "Landroid/os/Bundle;", "getCurrentUiState", "()Landroid/os/Bundle;", "Lkotlin/Function2;", "", "Llq/b0;", "a", "Lar/n;", "getOnAnswerSelected", "()Lar/n;", "setOnAnswerSelected", "(Lar/n;)V", "onAnswerSelected", "Lkotlin/Function0;", "d", "Lar/a;", "getOnCloseSurveyClick", "()Lar/a;", "setOnCloseSurveyClick", "(Lar/a;)V", "onCloseSurveyClick", "g", "getOnSubmitClick", "setOnSubmitClick", "onSubmitClick", "r", "getOnBackClick", "setOnBackClick", "onBackClick", "x", "getOnPoweredByClick", "setOnPoweredByClick", "onPoweredByClick", "Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "getDisclaimerSettings", "()Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "disclaimerSettings", "mp/f", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointNpsView extends FrameLayout {
    public static final /* synthetic */ int J = 0;
    public final CardView B;
    public final ViewGroup D;
    public final MicroSurveyHeader E;
    public final MicroSurveyPointNpsContentView F;
    public final MicroDisclaimerView G;
    public final MicroSubmitView H;
    public final MicroSurveyFooter I;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public n onAnswerSelected;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public a onCloseSurveyClick;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public a onSubmitClick;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public a onBackClick;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public a onPoweredByClick;

    /* renamed from: y, reason: collision with root package name */
    public f f6468y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurveyPointNpsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        View viewInflate = View.inflate(context, t.view_micro_survey_point_nps, this);
        View viewFindViewById = viewInflate.findViewById(r.view_micro_survey_point_nps_card);
        l.d(viewFindViewById, "findViewById(...)");
        this.B = (CardView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_survey_point_nps_container);
        l.d(viewFindViewById2, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2;
        this.D = viewGroup;
        View viewFindViewById3 = viewInflate.findViewById(r.view_micro_survey_point_nps_wrapper);
        l.d(viewFindViewById3, "findViewById(...)");
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(r.view_micro_survey_point_nps_survey_header);
        l.d(viewFindViewById4, "findViewById(...)");
        MicroSurveyHeader microSurveyHeader = (MicroSurveyHeader) viewFindViewById4;
        this.E = microSurveyHeader;
        View viewFindViewById5 = viewInflate.findViewById(r.view_micro_survey_point_nps_content);
        l.d(viewFindViewById5, "findViewById(...)");
        MicroSurveyPointNpsContentView microSurveyPointNpsContentView = (MicroSurveyPointNpsContentView) viewFindViewById5;
        this.F = microSurveyPointNpsContentView;
        View viewFindViewById6 = viewInflate.findViewById(r.view_micro_survey_point_nps_disclaimer);
        l.d(viewFindViewById6, "findViewById(...)");
        MicroDisclaimerView microDisclaimerView = (MicroDisclaimerView) viewFindViewById6;
        this.G = microDisclaimerView;
        View viewFindViewById7 = viewInflate.findViewById(r.view_micro_survey_point_nps_submit);
        l.d(viewFindViewById7, "findViewById(...)");
        MicroSubmitView microSubmitView = (MicroSubmitView) viewFindViewById7;
        this.H = microSubmitView;
        View viewFindViewById8 = viewInflate.findViewById(r.view_micro_survey_point_nps_footer);
        l.d(viewFindViewById8, "findViewById(...)");
        MicroSurveyFooter microSurveyFooter = (MicroSurveyFooter) viewFindViewById8;
        this.I = microSurveyFooter;
        u0 u0Var = new u0(6);
        WeakHashMap weakHashMap = i0.f23177a;
        z.j(viewGroup, u0Var);
        List listI = e5.I(microDisclaimerView, microSubmitView, microSurveyFooter);
        Resources resources = viewGroup2.getResources();
        l.d(resources, "getResources(...)");
        if (!resources.getBoolean(on.n.isLandscape)) {
            z.j(viewGroup2, new b((View) viewGroup2, listI));
        }
        microSurveyPointNpsContentView.setOnAnswerSelected(new j1.a(4, this));
        microSurveyHeader.setOnCloseButtonListener(new d(this, 5));
        microSubmitView.setOnSubmitClick(new g(this, 0));
        microSubmitView.setOnBackClick(new g(this, 1));
        microSurveyFooter.setOnPoweredByClick(new g(this, 2));
    }

    public static final boolean a(MicroSurveyPointNpsView microSurveyPointNpsView) {
        f fVar = microSurveyPointNpsView.f6468y;
        if (fVar == null) {
            l.l("bindingData");
            throw null;
        }
        if (fVar.f16917f.getAddComment()) {
            return false;
        }
        DisclaimerSettings disclaimerSettings = microSurveyPointNpsView.getDisclaimerSettings();
        return disclaimerSettings == null || !disclaimerSettings.getCheckboxVisible();
    }

    private final DisclaimerSettings getDisclaimerSettings() {
        f fVar = this.f6468y;
        if (fVar != null) {
            return fVar.f16917f.getDisclaimerSettings();
        }
        l.l("bindingData");
        throw null;
    }

    public final void b(f fVar, Bundle bundle) {
        this.f6468y = fVar;
        boolean z10 = !fVar.f16916e;
        CardView cardView = this.B;
        xu.d.b(cardView, z10);
        q qVar = new q(4, z10);
        WeakHashMap weakHashMap = i0.f23177a;
        z.j(cardView, qVar);
        mp.b bVar = fVar.f16912a;
        MicroSurveyPointNpsContentView microSurveyPointNpsContentView = this.F;
        microSurveyPointNpsContentView.b(bVar, bundle);
        microSurveyPointNpsContentView.setOnValidationStateUpdate(new kp.d(0, this, MicroSurveyPointNpsView.class, "updateSubmitState", "updateSubmitState()V", 0, 9));
        this.E.a(fVar.f16913b);
        this.I.setVisibility(fVar.f16915d ? 0 : 8);
        bq.a aVar = new bq.a(getDisclaimerSettings());
        MicroDisclaimerView microDisclaimerView = this.G;
        microDisclaimerView.a(aVar, bundle);
        microDisclaimerView.setVisibility(getDisclaimerSettings() != null ? 0 : 8);
        microDisclaimerView.setOnCheckboxToggle(new kp.d(0, this, MicroSurveyPointNpsView.class, "updateSubmitState", "updateSubmitState()V", 0, 10));
        d();
    }

    public final wo.g c(List list) {
        DisclaimerSettings disclaimerSettings = getDisclaimerSettings();
        return new wo.g(list, disclaimerSettings != null ? DisclaimerSettingsKt.getCheckboxStateToSend(disclaimerSettings, this.G.f6544r.isChecked()) : null);
    }

    public final void d() {
        f fVar = this.f6468y;
        if (fVar == null) {
            l.l("bindingData");
            throw null;
        }
        this.H.setState(f0.k(fVar.f16914c, getCurrentValidationState()));
    }

    public final wo.g getAnswer() {
        return c(this.F.getAnswer());
    }

    public final Bundle getCurrentUiState() {
        return xu.d.T(this.F.getCurrentUiState(), this.G.getCurrentUiState());
    }

    public final QuestionValidationState getCurrentValidationState() {
        f fVar = this.f6468y;
        if (fVar == null) {
            l.l("bindingData");
            throw null;
        }
        SurveyNpsPointSettings surveyNpsPointSettings = fVar.f16917f;
        MicroSurveyPointNpsContentView microSurveyPointNpsContentView = this.F;
        boolean z10 = false;
        boolean z11 = microSurveyPointNpsContentView.getSelectedAnswer() != null;
        boolean zD0 = tt.l.D0(microSurveyPointNpsContentView.getCommentFieldText());
        boolean zIsChecked = this.G.f6544r.isChecked();
        l.e(surveyNpsPointSettings, "pointSettings");
        boolean mandatory = surveyNpsPointSettings.getMandatory();
        boolean z12 = z11 || !mandatory;
        boolean z13 = surveyNpsPointSettings.getAddComment() && z11;
        boolean z14 = (zD0 && (z13 && l.a(surveyNpsPointSettings.isCommentMandatory(), Boolean.TRUE))) ? false : true;
        DisclaimerSettings disclaimerSettings = surveyNpsPointSettings.getDisclaimerSettings();
        boolean z15 = disclaimerSettings == null || zIsChecked || !disclaimerSettings.getCheckboxVisible() || !disclaimerSettings.getCheckboxRequired();
        DisclaimerSettings disclaimerSettings2 = surveyNpsPointSettings.getDisclaimerSettings();
        boolean z16 = disclaimerSettings2 != null && disclaimerSettings2.getCheckboxVisible();
        boolean z17 = z12 && z14 && z15;
        if (mandatory && !z13 && !z16) {
            z10 = true;
        }
        return new QuestionValidationState(z17, z10);
    }

    public final n getOnAnswerSelected() {
        return this.onAnswerSelected;
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

    public final void setOnAnswerSelected(n nVar) {
        this.onAnswerSelected = nVar;
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
