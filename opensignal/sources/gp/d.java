package gp;

import android.os.Bundle;
import android.view.View;
import as.x;
import bq.j;
import bq.o;
import br.l;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import com.survicate.surveys.entities.survey.questions.form.SurveyFormSurveyPoint;
import com.survicate.surveys.entities.survey.theme.ColorScheme;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.presentation.form.micro.MicroSurveyPointFormContentView;
import com.survicate.surveys.presentation.form.micro.MicroSurveyPointFormView;
import h7.r1;
import kotlin.Metadata;
import on.r;
import on.t;
import wo.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgp/d;", "Lxo/d;", "<init>", "()V", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d extends xo.d {

    /* renamed from: x0, reason: collision with root package name */
    public wo.d f9633x0;

    public d() {
        super(t.fragment_micro_survey_point_form);
    }

    @Override // androidx.fragment.app.b
    public final void R() {
        this.f1410c0 = true;
        Bundle currentUiState = k0().getCurrentUiState();
        h hVarH0 = h0();
        SurveyPoint surveyPoint = g0().f24574a;
        l.c(surveyPoint, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.form.SurveyFormSurveyPoint");
        hVarH0.b(currentUiState, ((SurveyFormSurveyPoint) surveyPoint).getId());
    }

    @Override // xo.d
    public final void i0(View view, r1 r1Var, wo.d dVar, ColorScheme colorScheme) {
        MicroColorScheme microColorScheme = (MicroColorScheme) colorScheme;
        l.e(view, "view");
        l.e(r1Var, "viewDependencies");
        l.e(dVar, "displayEngine");
        super.j0(view, r1Var, dVar, microColorScheme);
        this.f9633x0 = dVar;
        h hVarH0 = h0();
        SurveyPoint surveyPoint = g0().f24574a;
        l.c(surveyPoint, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.form.SurveyFormSurveyPoint");
        Bundle bundleA = hVarH0.a(((SurveyFormSurveyPoint) surveyPoint).getId());
        MicroSurveyPointFormView microSurveyPointFormViewK0 = k0();
        microSurveyPointFormViewK0.B.getBackground().setColorFilter(xu.l.l(microColorScheme.getBackground(), k3.a.SRC_IN));
        microSurveyPointFormViewK0.D.b(microColorScheme);
        MicroSurveyPointFormContentView microSurveyPointFormContentView = microSurveyPointFormViewK0.E;
        microSurveyPointFormContentView.getClass();
        microSurveyPointFormContentView.f6409g = microColorScheme;
        microSurveyPointFormContentView.f6410r.b(r1Var, microColorScheme);
        microSurveyPointFormViewK0.H.a(microColorScheme);
        microSurveyPointFormViewK0.G.b(microColorScheme);
        microSurveyPointFormViewK0.F.b(microColorScheme);
        MicroSurveyPointFormView microSurveyPointFormViewK02 = k0();
        SurveyPoint surveyPoint2 = g0().f24574a;
        l.c(surveyPoint2, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.form.SurveyFormSurveyPoint");
        a aVar = new a((SurveyFormSurveyPoint) surveyPoint2, g0().a());
        o oVarC = g0().c();
        j jVarB = g0().b(X());
        wo.d dVar2 = this.f9633x0;
        if (dVar2 == null) {
            l.l("displayEngine");
            throw null;
        }
        boolean z10 = !dVar2.f();
        wo.d dVar3 = this.f9633x0;
        if (dVar3 == null) {
            l.l("displayEngine");
            throw null;
        }
        microSurveyPointFormViewK02.a(new e(aVar, oVarC, jVarB, z10, dVar3.c()), bundleA);
        MicroSurveyPointFormView microSurveyPointFormViewK03 = k0();
        wo.d dVar4 = this.f9633x0;
        if (dVar4 == null) {
            l.l("displayEngine");
            throw null;
        }
        int i10 = 0;
        int i11 = 0;
        microSurveyPointFormViewK03.setOnCloseSurveyClick(new bp.a(i11, dVar4, wo.d.class, "surveyClosed", "surveyClosed()V", i10, 18));
        microSurveyPointFormViewK03.setOnSubmitClick(new bp.a(0, this, d.class, "onSubmitClick", "onSubmitClick()V", 0, 19));
        microSurveyPointFormViewK03.setOnBackClick(new bp.a(i11, g0(), wo.f.class, "onBackClick", "onBackClick()V", i10, 20));
        microSurveyPointFormViewK03.setOnPoweredByClick(new x(27, this));
    }

    public final MicroSurveyPointFormView k0() {
        View viewFindViewById = Y().findViewById(r.fragment_micro_survey_point_form_view);
        l.d(viewFindViewById, "findViewById(...)");
        return (MicroSurveyPointFormView) viewFindViewById;
    }
}
