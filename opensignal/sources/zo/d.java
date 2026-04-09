package zo;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import bq.j;
import bq.o;
import br.l;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.entities.survey.theme.ColorScheme;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.presentation.csat.micro.MicroSurveyPointCsatContentView;
import com.survicate.surveys.presentation.csat.micro.MicroSurveyPointCsatView;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import h7.r1;
import kotlin.Metadata;
import on.r;
import on.t;
import wo.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzo/d;", "Lxo/d;", "<init>", "()V", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d extends xo.d {

    /* renamed from: x0, reason: collision with root package name */
    public wo.d f27481x0;

    public d() {
        super(t.fragment_micro_survey_point_csat);
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
        this.f27481x0 = dVar;
        h hVarH0 = h0();
        SurveyPoint surveyPoint = g0().f24574a;
        l.c(surveyPoint, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint");
        Bundle bundleA = hVarH0.a(((SurveyQuestionSurveyPoint) surveyPoint).getId());
        MicroSurveyPointCsatView microSurveyPointCsatViewK0 = k0();
        microSurveyPointCsatViewK0.D.getBackground().setColorFilter(xu.l.l(microColorScheme.getBackground(), k3.a.SRC_IN));
        microSurveyPointCsatViewK0.E.b(microColorScheme);
        MicroSurveyPointCsatContentView microSurveyPointCsatContentView = microSurveyPointCsatViewK0.F;
        microSurveyPointCsatContentView.getClass();
        microSurveyPointCsatContentView.f6381x = microColorScheme;
        microSurveyPointCsatContentView.f6382y.b(r1Var, microColorScheme);
        microSurveyPointCsatContentView.D.c(microColorScheme);
        microSurveyPointCsatViewK0.I.a(microColorScheme);
        microSurveyPointCsatViewK0.H.b(microColorScheme);
        microSurveyPointCsatViewK0.G.b(microColorScheme);
        MicroSurveyPointCsatView microSurveyPointCsatViewK02 = k0();
        SurveyPoint surveyPoint2 = g0().f24574a;
        l.c(surveyPoint2, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint");
        SurveyQuestionSurveyPoint surveyQuestionSurveyPoint = (SurveyQuestionSurveyPoint) surveyPoint2;
        QuestionHeaderBindingData questionHeaderBindingDataA = g0().a();
        String inputTextPlaceholder = g0().d().getInputTextPlaceholder();
        if (inputTextPlaceholder == null) {
            inputTextPlaceholder = "";
        }
        b bVar = new b(surveyQuestionSurveyPoint, questionHeaderBindingDataA, inputTextPlaceholder);
        o oVarC = g0().c();
        j jVarB = g0().b(X());
        wo.d dVar2 = this.f27481x0;
        if (dVar2 == null) {
            l.l("displayEngine");
            throw null;
        }
        boolean z10 = !dVar2.f();
        wo.d dVar3 = this.f27481x0;
        if (dVar3 == null) {
            l.l("displayEngine");
            throw null;
        }
        microSurveyPointCsatViewK02.b(new e(bVar, oVarC, jVarB, z10, dVar3.c()), bundleA);
        MicroSurveyPointCsatView microSurveyPointCsatViewK03 = k0();
        microSurveyPointCsatViewK03.setOnAnswerSelected(new gv.a(9, this));
        wo.d dVar4 = this.f27481x0;
        if (dVar4 == null) {
            l.l("displayEngine");
            throw null;
        }
        int i10 = 0;
        int i11 = 0;
        microSurveyPointCsatViewK03.setOnCloseSurveyClick(new xp.c(i11, dVar4, wo.d.class, "surveyClosed", "surveyClosed()V", i10, 5));
        microSurveyPointCsatViewK03.setOnSubmitClick(new xp.c(0, this, d.class, "onSubmitClick", "onSubmitClick()V", 0, 6));
        microSurveyPointCsatViewK03.setOnBackClick(new xp.c(i11, g0(), wo.f.class, "onBackClick", "onBackClick()V", i10, 7));
        microSurveyPointCsatViewK03.setOnPoweredByClick(new pp.c(19, this));
    }

    public final MicroSurveyPointCsatView k0() {
        View viewFindViewById = Y().findViewById(r.fragment_micro_survey_point_csat_view);
        l.d(viewFindViewById, "findViewById(...)");
        return (MicroSurveyPointCsatView) viewFindViewById;
    }
}
