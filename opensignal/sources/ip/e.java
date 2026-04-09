package ip;

import android.os.Bundle;
import android.view.View;
import bq.j;
import bq.o;
import br.l;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.entities.survey.theme.ColorScheme;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.presentation.matrix.micro.MicroSurveyPointMatrixContentView;
import com.survicate.surveys.presentation.matrix.micro.MicroSurveyPointMatrixView;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import h7.r1;
import kotlin.Metadata;
import on.r;
import on.t;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lip/e;", "Lxo/d;", "<init>", "()V", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e extends xo.d {

    /* renamed from: x0, reason: collision with root package name */
    public wo.d f12901x0;

    public e() {
        super(t.fragment_micro_survey_point_matrix);
    }

    @Override // androidx.fragment.app.b
    public final void R() {
        this.f1410c0 = true;
        Bundle currentUiState = k0().getCurrentUiState();
        wo.h hVarH0 = h0();
        SurveyPoint surveyPoint = g0().f24574a;
        l.c(surveyPoint, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint");
        hVarH0.b(currentUiState, ((SurveyQuestionSurveyPoint) surveyPoint).getId());
    }

    @Override // xo.d
    public final void i0(View view, r1 r1Var, wo.d dVar, ColorScheme colorScheme) {
        MicroColorScheme microColorScheme = (MicroColorScheme) colorScheme;
        l.e(view, "view");
        l.e(r1Var, "viewDependencies");
        l.e(dVar, "displayEngine");
        super.j0(view, r1Var, dVar, microColorScheme);
        this.f12901x0 = dVar;
        wo.h hVarH0 = h0();
        SurveyPoint surveyPoint = g0().f24574a;
        l.c(surveyPoint, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint");
        Bundle bundleA = hVarH0.a(((SurveyQuestionSurveyPoint) surveyPoint).getId());
        MicroSurveyPointMatrixView microSurveyPointMatrixViewK0 = k0();
        microSurveyPointMatrixViewK0.B.getBackground().setColorFilter(xu.l.l(microColorScheme.getBackground(), k3.a.SRC_IN));
        microSurveyPointMatrixViewK0.D.b(microColorScheme);
        microSurveyPointMatrixViewK0.H.a(microColorScheme);
        MicroSurveyPointMatrixContentView microSurveyPointMatrixContentView = microSurveyPointMatrixViewK0.E;
        microSurveyPointMatrixContentView.getClass();
        microSurveyPointMatrixContentView.f6429g = r1Var;
        microSurveyPointMatrixContentView.f6430r = microColorScheme;
        microSurveyPointMatrixViewK0.G.b(microColorScheme);
        microSurveyPointMatrixViewK0.F.b(microColorScheme);
        MicroSurveyPointMatrixView microSurveyPointMatrixViewK02 = k0();
        SurveyPoint surveyPoint2 = g0().f24574a;
        l.c(surveyPoint2, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint");
        SurveyQuestionSurveyPoint surveyQuestionSurveyPoint = (SurveyQuestionSurveyPoint) surveyPoint2;
        QuestionHeaderBindingData questionHeaderBindingDataA = g0().a();
        String inputTextPlaceholder = g0().d().getInputTextPlaceholder();
        if (inputTextPlaceholder == null) {
            inputTextPlaceholder = "";
        }
        c cVar = new c(surveyQuestionSurveyPoint, questionHeaderBindingDataA, inputTextPlaceholder);
        o oVarC = g0().c();
        j jVarB = g0().b(X());
        wo.d dVar2 = this.f12901x0;
        if (dVar2 == null) {
            l.l("displayEngine");
            throw null;
        }
        boolean z10 = !dVar2.f();
        wo.d dVar3 = this.f12901x0;
        if (dVar3 == null) {
            l.l("displayEngine");
            throw null;
        }
        microSurveyPointMatrixViewK02.a(new f(cVar, oVarC, jVarB, z10, dVar3.c()), bundleA);
        MicroSurveyPointMatrixView microSurveyPointMatrixViewK03 = k0();
        wo.d dVar4 = this.f12901x0;
        if (dVar4 == null) {
            l.l("displayEngine");
            throw null;
        }
        int i10 = 0;
        int i11 = 0;
        microSurveyPointMatrixViewK03.setOnCloseSurveyClick(new bp.a(i11, dVar4, wo.d.class, "surveyClosed", "surveyClosed()V", i10, 23));
        microSurveyPointMatrixViewK03.setOnSubmitClick(new bp.a(0, this, e.class, "onSubmitClick", "onSubmitClick()V", 0, 24));
        microSurveyPointMatrixViewK03.setOnBackClick(new bp.a(i11, g0(), wo.f.class, "onBackClick", "onBackClick()V", i10, 25));
        microSurveyPointMatrixViewK03.setOnPoweredByClick(new ht.g(10, this));
    }

    public final MicroSurveyPointMatrixView k0() {
        View viewFindViewById = Y().findViewById(r.fragment_micro_survey_point_matrix_view);
        l.d(viewFindViewById, "findViewById(...)");
        return (MicroSurveyPointMatrixView) viewFindViewById;
    }
}
