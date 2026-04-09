package sp;

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
import com.survicate.surveys.presentation.shape.micro.MicroSurveyPointShapeContentView;
import com.survicate.surveys.presentation.shape.micro.MicroSurveyPointShapeView;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import h7.r1;
import kotlin.Metadata;
import on.r;
import on.t;
import wo.f;
import wo.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsp/c;", "Lxo/d;", "<init>", "()V", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c extends xo.d {

    /* renamed from: x0, reason: collision with root package name */
    public wo.d f22199x0;

    public c() {
        super(t.fragment_micro_survey_point_shape);
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
        this.f22199x0 = dVar;
        h hVarH0 = h0();
        SurveyPoint surveyPoint = g0().f24574a;
        l.c(surveyPoint, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint");
        Bundle bundleA = hVarH0.a(((SurveyQuestionSurveyPoint) surveyPoint).getId());
        MicroSurveyPointShapeView microSurveyPointShapeViewK0 = k0();
        microSurveyPointShapeViewK0.D.getBackground().setColorFilter(xu.l.l(microColorScheme.getBackground(), k3.a.SRC_IN));
        microSurveyPointShapeViewK0.E.b(microColorScheme);
        microSurveyPointShapeViewK0.I.a(microColorScheme);
        MicroSurveyPointShapeContentView microSurveyPointShapeContentView = microSurveyPointShapeViewK0.F;
        microSurveyPointShapeContentView.getClass();
        microSurveyPointShapeContentView.f6485x = microColorScheme;
        microSurveyPointShapeContentView.f6486y.b(r1Var, microColorScheme);
        microSurveyPointShapeContentView.D.setTextColor(microColorScheme.getAnswer());
        microSurveyPointShapeContentView.E.setTextColor(microColorScheme.getAnswer());
        microSurveyPointShapeContentView.F.c(microColorScheme);
        microSurveyPointShapeViewK0.H.b(microColorScheme);
        microSurveyPointShapeViewK0.G.b(microColorScheme);
        MicroSurveyPointShapeView microSurveyPointShapeViewK02 = k0();
        SurveyPoint surveyPoint2 = g0().f24574a;
        l.c(surveyPoint2, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint");
        SurveyQuestionSurveyPoint surveyQuestionSurveyPoint = (SurveyQuestionSurveyPoint) surveyPoint2;
        QuestionHeaderBindingData questionHeaderBindingDataA = g0().a();
        String inputTextPlaceholder = g0().d().getInputTextPlaceholder();
        if (inputTextPlaceholder == null) {
            inputTextPlaceholder = "";
        }
        a aVar = new a(surveyQuestionSurveyPoint, questionHeaderBindingDataA, inputTextPlaceholder);
        o oVarC = g0().c();
        j jVarB = g0().b(X());
        wo.d dVar2 = this.f22199x0;
        if (dVar2 == null) {
            l.l("displayEngine");
            throw null;
        }
        boolean z10 = !dVar2.f();
        wo.d dVar3 = this.f22199x0;
        if (dVar3 == null) {
            l.l("displayEngine");
            throw null;
        }
        microSurveyPointShapeViewK02.b(new d(aVar, oVarC, jVarB, z10, dVar3.c()), bundleA);
        MicroSurveyPointShapeView microSurveyPointShapeViewK03 = k0();
        microSurveyPointShapeViewK03.setOnAnswerSelected(new gv.a(3, this));
        wo.d dVar4 = this.f22199x0;
        if (dVar4 == null) {
            l.l("displayEngine");
            throw null;
        }
        int i10 = 0;
        int i11 = 0;
        microSurveyPointShapeViewK03.setOnCloseSurveyClick(new kp.d(i11, dVar4, wo.d.class, "surveyClosed", "surveyClosed()V", i10, 16));
        microSurveyPointShapeViewK03.setOnSubmitClick(new kp.d(0, this, c.class, "onSubmitClick", "onSubmitClick()V", 0, 17));
        microSurveyPointShapeViewK03.setOnBackClick(new kp.d(i11, g0(), f.class, "onBackClick", "onBackClick()V", i10, 18));
        microSurveyPointShapeViewK03.setOnPoweredByClick(new pp.c(4, this));
    }

    public final MicroSurveyPointShapeView k0() {
        View viewFindViewById = Y().findViewById(r.fragment_micro_survey_point_shape_view);
        l.d(viewFindViewById, "findViewById(...)");
        return (MicroSurveyPointShapeView) viewFindViewById;
    }
}
