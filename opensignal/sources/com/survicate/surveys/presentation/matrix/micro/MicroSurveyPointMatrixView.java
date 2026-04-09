package com.survicate.surveys.presentation.matrix.micro;

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
import com.survicate.surveys.entities.survey.questions.question.matrix.SurveyPointMatrixSettings;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.presentation.widget.MicroDisclaimerView;
import com.survicate.surveys.presentation.widget.MicroSubmitView;
import com.survicate.surveys.presentation.widget.MicroSurveyFooter;
import com.survicate.surveys.presentation.widget.MicroSurveyHeader;
import i4.b;
import io.sentry.android.core.u0;
import ip.c;
import ip.f;
import ip.g;
import ir.f0;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import on.n;
import on.r;
import on.t;
import u3.i0;
import u3.z;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001$J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u0016\u0010#\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/survicate/surveys/presentation/matrix/micro/MicroSurveyPointMatrixView;", "Landroid/widget/FrameLayout;", "Lcom/survicate/surveys/entities/models/QuestionValidationState;", "getCurrentValidationState", "()Lcom/survicate/surveys/entities/models/QuestionValidationState;", "Lwo/g;", "getAnswer", "()Lwo/g;", "Landroid/os/Bundle;", "getCurrentUiState", "()Landroid/os/Bundle;", "Lkotlin/Function0;", "Llq/b0;", "a", "Lar/a;", "getOnCloseSurveyClick", "()Lar/a;", "setOnCloseSurveyClick", "(Lar/a;)V", "onCloseSurveyClick", "d", "getOnSubmitClick", "setOnSubmitClick", "onSubmitClick", "g", "getOnBackClick", "setOnBackClick", "onBackClick", "r", "getOnPoweredByClick", "setOnPoweredByClick", "onPoweredByClick", "Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "getDisclaimerSettings", "()Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "disclaimerSettings", "ip/f", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointMatrixView extends FrameLayout {
    public static final /* synthetic */ int I = 0;
    public final ViewGroup B;
    public final MicroSurveyHeader D;
    public final MicroSurveyPointMatrixContentView E;
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
    public f f6437x;

    /* renamed from: y, reason: collision with root package name */
    public final CardView f6438y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurveyPointMatrixView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        View viewInflate = View.inflate(context, t.view_micro_survey_point_matrix, this);
        View viewFindViewById = viewInflate.findViewById(r.view_micro_survey_point_matrix_card);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6438y = (CardView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_survey_point_matrix_container);
        l.d(viewFindViewById2, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2;
        this.B = viewGroup;
        View viewFindViewById3 = viewInflate.findViewById(r.view_micro_survey_point_matrix_wrapper);
        l.d(viewFindViewById3, "findViewById(...)");
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(r.view_micro_survey_point_matrix_survey_header);
        l.d(viewFindViewById4, "findViewById(...)");
        MicroSurveyHeader microSurveyHeader = (MicroSurveyHeader) viewFindViewById4;
        this.D = microSurveyHeader;
        View viewFindViewById5 = viewInflate.findViewById(r.view_micro_survey_point_matrix_content);
        l.d(viewFindViewById5, "findViewById(...)");
        this.E = (MicroSurveyPointMatrixContentView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(r.view_micro_survey_point_matrix_disclaimer);
        l.d(viewFindViewById6, "findViewById(...)");
        MicroDisclaimerView microDisclaimerView = (MicroDisclaimerView) viewFindViewById6;
        this.F = microDisclaimerView;
        View viewFindViewById7 = viewInflate.findViewById(r.view_micro_survey_point_matrix_submit);
        l.d(viewFindViewById7, "findViewById(...)");
        MicroSubmitView microSubmitView = (MicroSubmitView) viewFindViewById7;
        this.G = microSubmitView;
        View viewFindViewById8 = viewInflate.findViewById(r.view_micro_survey_point_matrix_footer);
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
        microSurveyHeader.setOnCloseButtonListener(new d(this, 3));
        microSubmitView.setOnSubmitClick(new g(this, 0));
        microSubmitView.setOnBackClick(new g(this, 1));
        microSurveyFooter.setOnPoweredByClick(new g(this, 2));
    }

    private final DisclaimerSettings getDisclaimerSettings() {
        f fVar = this.f6437x;
        if (fVar != null) {
            return fVar.f12907f.getDisclaimerSettings();
        }
        l.l("bindingData");
        throw null;
    }

    public final void a(f fVar, Bundle bundle) {
        this.f6437x = fVar;
        boolean z10 = !fVar.f12906e;
        CardView cardView = this.f6438y;
        xu.d.b(cardView, z10);
        q qVar = new q(4, z10);
        WeakHashMap weakHashMap = i0.f23177a;
        z.j(cardView, qVar);
        c cVar = fVar.f12902a;
        MicroSurveyPointMatrixContentView microSurveyPointMatrixContentView = this.E;
        microSurveyPointMatrixContentView.a(cVar, bundle);
        microSurveyPointMatrixContentView.setOnValidationStateUpdate(new bp.a(0, this, MicroSurveyPointMatrixView.class, "updateSubmitState", "updateSubmitState()V", 0, 26));
        this.D.a(fVar.f12903b);
        this.H.setVisibility(fVar.f12905d ? 0 : 8);
        bq.a aVar = new bq.a(getDisclaimerSettings());
        MicroDisclaimerView microDisclaimerView = this.F;
        microDisclaimerView.a(aVar, bundle);
        microDisclaimerView.setVisibility(getDisclaimerSettings() != null ? 0 : 8);
        microDisclaimerView.setOnCheckboxToggle(new bp.a(0, this, MicroSurveyPointMatrixView.class, "updateSubmitState", "updateSubmitState()V", 0, 27));
        b();
    }

    public final void b() throws Resources.NotFoundException {
        f fVar = this.f6437x;
        if (fVar == null) {
            l.l("bindingData");
            throw null;
        }
        this.G.setState(f0.k(fVar.f12904c, getCurrentValidationState()));
    }

    public final wo.g getAnswer() {
        List<SurveyAnswer> answer = this.E.getAnswer();
        DisclaimerSettings disclaimerSettings = getDisclaimerSettings();
        return new wo.g(answer, disclaimerSettings != null ? DisclaimerSettingsKt.getCheckboxStateToSend(disclaimerSettings, this.F.f6544r.isChecked()) : null);
    }

    public final Bundle getCurrentUiState() {
        return xu.d.T(this.E.getCurrentUiState(), this.F.getCurrentUiState());
    }

    public final QuestionValidationState getCurrentValidationState() {
        boolean z10;
        boolean z11;
        f fVar = this.f6437x;
        if (fVar == null) {
            l.l("bindingData");
            throw null;
        }
        SurveyPointMatrixSettings surveyPointMatrixSettings = fVar.f12907f;
        List<MicroSurveyPointMatrixAnswerItem> answerItems = this.E.getAnswerItems();
        boolean zIsChecked = this.F.f6544r.isChecked();
        l.e(surveyPointMatrixSettings, "pointSettings");
        l.e(answerItems, "answerItems");
        boolean mandatory = surveyPointMatrixSettings.getMandatory();
        boolean z12 = false;
        if (answerItems.isEmpty()) {
            z10 = true;
        } else {
            Iterator<T> it = answerItems.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((MicroSurveyPointMatrixAnswerItem) it.next()).d() == null) {
                    if (!mandatory) {
                        break;
                    }
                    z10 = false;
                }
            }
            z10 = true;
        }
        if (answerItems.isEmpty()) {
            z11 = true;
        } else {
            for (MicroSurveyPointMatrixAnswerItem microSurveyPointMatrixAnswerItem : answerItems) {
                MicroSurveyPointMatrixColumnItem microSurveyPointMatrixColumnItemD = microSurveyPointMatrixAnswerItem.d();
                if (microSurveyPointMatrixColumnItemD != null && microSurveyPointMatrixAnswerItem.f6421r && tt.l.D0(microSurveyPointMatrixColumnItemD.f6426g) && surveyPointMatrixSettings.isCommentMandatory()) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
        }
        DisclaimerSettings disclaimerSettings = surveyPointMatrixSettings.getDisclaimerSettings();
        boolean z13 = disclaimerSettings == null || zIsChecked || !disclaimerSettings.getCheckboxVisible() || !disclaimerSettings.getCheckboxRequired();
        if (z10 && z11 && z13) {
            z12 = true;
        }
        return new QuestionValidationState(z12, !z10);
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
