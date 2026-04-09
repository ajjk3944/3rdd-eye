package kp;

import android.os.Bundle;
import android.view.View;
import bq.j;
import bq.o;
import br.l;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.entities.survey.theme.ColorScheme;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.presentation.multiple.micro.MicroSurveyPointMultipleContentView;
import com.survicate.surveys.presentation.multiple.micro.MicroSurveyPointMultipleView;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import h7.r1;
import kotlin.Metadata;
import on.r;
import on.t;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkp/e;", "Lxo/d;", "<init>", "()V", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e extends xo.d {

    /* renamed from: x0, reason: collision with root package name */
    public wo.d f14473x0;

    public e() {
        super(t.fragment_micro_survey_point_multiple);
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
        this.f14473x0 = dVar;
        wo.h hVarH0 = h0();
        SurveyPoint surveyPoint = g0().f24574a;
        l.c(surveyPoint, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint");
        Bundle bundleA = hVarH0.a(((SurveyQuestionSurveyPoint) surveyPoint).getId());
        MicroSurveyPointMultipleView microSurveyPointMultipleViewK0 = k0();
        microSurveyPointMultipleViewK0.B.getBackground().setColorFilter(xu.l.l(microColorScheme.getBackground(), k3.a.SRC_IN));
        microSurveyPointMultipleViewK0.D.b(microColorScheme);
        MicroSurveyPointMultipleContentView microSurveyPointMultipleContentView = microSurveyPointMultipleViewK0.E;
        microSurveyPointMultipleContentView.getClass();
        microSurveyPointMultipleContentView.f6449x = r1Var;
        microSurveyPointMultipleContentView.f6450y = microColorScheme;
        microSurveyPointMultipleViewK0.H.a(microColorScheme);
        microSurveyPointMultipleViewK0.G.b(microColorScheme);
        microSurveyPointMultipleViewK0.F.b(microColorScheme);
        MicroSurveyPointMultipleView microSurveyPointMultipleViewK02 = k0();
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
        wo.d dVar2 = this.f14473x0;
        if (dVar2 == null) {
            l.l("displayEngine");
            throw null;
        }
        boolean z10 = !dVar2.f();
        wo.d dVar3 = this.f14473x0;
        if (dVar3 == null) {
            l.l("displayEngine");
            throw null;
        }
        microSurveyPointMultipleViewK02.a(new f(cVar, oVarC, jVarB, z10, dVar3.c()), bundleA);
        MicroSurveyPointMultipleView microSurveyPointMultipleViewK03 = k0();
        wo.d dVar4 = this.f14473x0;
        if (dVar4 == null) {
            l.l("displayEngine");
            throw null;
        }
        int i10 = 0;
        int i11 = 0;
        microSurveyPointMultipleViewK03.setOnCloseSurveyClick(new d(i11, dVar4, wo.d.class, "surveyClosed", "surveyClosed()V", i10, 1));
        microSurveyPointMultipleViewK03.setOnSubmitClick(new d(0, this, e.class, "onSubmitClick", "onSubmitClick()V", 0, 2));
        microSurveyPointMultipleViewK03.setOnBackClick(new d(i11, g0(), wo.f.class, "onBackClick", "onBackClick()V", i10, 3));
        microSurveyPointMultipleViewK03.setOnPoweredByClick(new ht.g(16, this));
    }

    public final MicroSurveyPointMultipleView k0() {
        View viewFindViewById = Y().findViewById(r.fragment_micro_survey_point_multiple_view);
        l.d(viewFindViewById, "findViewById(...)");
        return (MicroSurveyPointMultipleView) viewFindViewById;
    }
}
