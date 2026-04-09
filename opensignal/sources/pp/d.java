package pp;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import bq.j;
import bq.o;
import br.l;
import com.google.android.gms.internal.measurement.b4;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.entities.survey.theme.ColorScheme;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.presentation.numerical.micro.MicroSurveyPointNumericalContentView;
import com.survicate.surveys.presentation.numerical.micro.MicroSurveyPointNumericalView;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import h7.r1;
import kotlin.Metadata;
import on.r;
import on.t;
import wo.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpp/d;", "Lxo/d;", "<init>", "()V", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d extends xo.d {

    /* renamed from: x0, reason: collision with root package name */
    public wo.d f20608x0;

    public d() {
        super(t.fragment_micro_survey_point_numerical);
    }

    @Override // androidx.fragment.app.b
    public final void R() {
        this.f1410c0 = true;
        Bundle currentUiState = k0().getCurrentUiState();
        h hVarH0 = h0();
        SurveyPoint surveyPoint = g0().f24574a;
        l.c(surveyPoint, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint");
        hVarH0.b(currentUiState, ((SurveyQuestionSurveyPoint) surveyPoint).getId());
    }

    @Override // xo.d
    public final void i0(View view, r1 r1Var, wo.d dVar, ColorScheme colorScheme) throws Resources.NotFoundException {
        MicroColorScheme microColorScheme = (MicroColorScheme) colorScheme;
        l.e(view, "view");
        l.e(r1Var, "viewDependencies");
        l.e(dVar, "displayEngine");
        super.j0(view, r1Var, dVar, microColorScheme);
        this.f20608x0 = dVar;
        h hVarH0 = h0();
        SurveyPoint surveyPoint = g0().f24574a;
        l.c(surveyPoint, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint");
        Bundle bundleA = hVarH0.a(((SurveyQuestionSurveyPoint) surveyPoint).getId());
        MicroSurveyPointNumericalView microSurveyPointNumericalViewK0 = k0();
        microSurveyPointNumericalViewK0.D.getBackground().setColorFilter(xu.l.l(microColorScheme.getBackground(), k3.a.SRC_IN));
        microSurveyPointNumericalViewK0.E.b(microColorScheme);
        microSurveyPointNumericalViewK0.I.a(microColorScheme);
        MicroSurveyPointNumericalContentView microSurveyPointNumericalContentView = microSurveyPointNumericalViewK0.F;
        microSurveyPointNumericalContentView.getClass();
        microSurveyPointNumericalContentView.f6473x = microColorScheme;
        microSurveyPointNumericalContentView.f6474y.b(r1Var, microColorScheme);
        microSurveyPointNumericalContentView.D.setTextColor(microColorScheme.getAnswer());
        microSurveyPointNumericalContentView.E.setTextColor(microColorScheme.getAnswer());
        microSurveyPointNumericalContentView.F.c(microColorScheme);
        microSurveyPointNumericalViewK0.H.b(microColorScheme);
        microSurveyPointNumericalViewK0.G.b(microColorScheme);
        MicroSurveyPointNumericalView microSurveyPointNumericalViewK02 = k0();
        SurveyPoint surveyPoint2 = g0().f24574a;
        l.c(surveyPoint2, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint");
        SurveyQuestionSurveyPoint surveyQuestionSurveyPoint = (SurveyQuestionSurveyPoint) surveyPoint2;
        QuestionHeaderBindingData questionHeaderBindingDataA = g0().a();
        String inputTextPlaceholder = g0().d().getInputTextPlaceholder();
        if (inputTextPlaceholder == null) {
            inputTextPlaceholder = "";
        }
        WindowManager windowManager = W().getWindowManager();
        l.d(windowManager, "getWindowManager(...)");
        a aVar = new a(surveyQuestionSurveyPoint, questionHeaderBindingDataA, inputTextPlaceholder, b4.G(windowManager));
        o oVarC = g0().c();
        j jVarB = g0().b(X());
        wo.d dVar2 = this.f20608x0;
        if (dVar2 == null) {
            l.l("displayEngine");
            throw null;
        }
        boolean z10 = !dVar2.f();
        wo.d dVar3 = this.f20608x0;
        if (dVar3 == null) {
            l.l("displayEngine");
            throw null;
        }
        microSurveyPointNumericalViewK02.b(new e(aVar, oVarC, jVarB, z10, dVar3.c()), bundleA);
        MicroSurveyPointNumericalView microSurveyPointNumericalViewK03 = k0();
        microSurveyPointNumericalViewK03.setOnAnswerSelected(new gv.a(2, this));
        wo.d dVar4 = this.f20608x0;
        if (dVar4 == null) {
            l.l("displayEngine");
            throw null;
        }
        int i10 = 0;
        int i11 = 0;
        microSurveyPointNumericalViewK03.setOnCloseSurveyClick(new kp.d(i11, dVar4, wo.d.class, "surveyClosed", "surveyClosed()V", i10, 11));
        int i12 = 0;
        microSurveyPointNumericalViewK03.setOnSubmitClick(new kp.d(i12, this, d.class, "onSubmitClick", "onSubmitClick()V", 0, 12));
        microSurveyPointNumericalViewK03.setOnBackClick(new kp.d(i11, g0(), wo.f.class, "onBackClick", "onBackClick()V", i10, 13));
        microSurveyPointNumericalViewK03.setOnPoweredByClick(new c(i12, this));
    }

    public final MicroSurveyPointNumericalView k0() {
        View viewFindViewById = Y().findViewById(r.fragment_micro_survey_point_numerical_view);
        l.d(viewFindViewById, "findViewById(...)");
        return (MicroSurveyPointNumericalView) viewFindViewById;
    }
}
