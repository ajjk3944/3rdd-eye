package bp;

import android.os.Bundle;
import android.view.View;
import as.x;
import bq.j;
import bq.o;
import br.l;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import com.survicate.surveys.entities.survey.questions.cta.SurveyCtaSurveyPoint;
import com.survicate.surveys.entities.survey.theme.ColorScheme;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.presentation.cta.micro.MicroSurveyPointCtaView;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import h7.r1;
import kotlin.Metadata;
import on.r;
import on.t;
import wo.f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbp/b;", "Lxo/d;", "<init>", "()V", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b extends xo.d {

    /* renamed from: x0, reason: collision with root package name */
    public wo.d f2844x0;

    public b() {
        super(t.fragment_micro_survey_point_cta);
    }

    @Override // androidx.fragment.app.b
    public final void R() {
        this.f1410c0 = true;
        h0().b(k0().getCurrentUiState(), l0().getId());
    }

    @Override // xo.d
    public final void i0(View view, r1 r1Var, wo.d dVar, ColorScheme colorScheme) {
        MicroColorScheme microColorScheme = (MicroColorScheme) colorScheme;
        l.e(view, "view");
        l.e(r1Var, "viewDependencies");
        l.e(dVar, "displayEngine");
        super.j0(view, r1Var, dVar, microColorScheme);
        this.f2844x0 = dVar;
        Bundle bundleA = h0().a(l0().getId());
        MicroSurveyPointCtaView microSurveyPointCtaViewK0 = k0();
        microSurveyPointCtaViewK0.B.getBackground().setColorFilter(xu.l.l(microColorScheme.getBackground(), k3.a.SRC_IN));
        microSurveyPointCtaViewK0.D.b(microColorScheme);
        microSurveyPointCtaViewK0.E.a(microColorScheme);
        microSurveyPointCtaViewK0.F.b(r1Var, microColorScheme);
        microSurveyPointCtaViewK0.G.b(microColorScheme);
        microSurveyPointCtaViewK0.H.b(microColorScheme);
        MicroSurveyPointCtaView microSurveyPointCtaViewK02 = k0();
        SurveyCtaSurveyPoint surveyCtaSurveyPointL0 = l0();
        o oVarC = g0().c();
        QuestionHeaderBindingData questionHeaderBindingDataA = g0().a();
        j jVarB = g0().b(X());
        wo.d dVar2 = this.f2844x0;
        if (dVar2 == null) {
            l.l("displayEngine");
            throw null;
        }
        boolean z10 = !dVar2.f();
        wo.d dVar3 = this.f2844x0;
        if (dVar3 == null) {
            l.l("displayEngine");
            throw null;
        }
        microSurveyPointCtaViewK02.a(new c(surveyCtaSurveyPointL0, oVarC, questionHeaderBindingDataA, jVarB, z10, dVar3.c()), bundleA);
        MicroSurveyPointCtaView microSurveyPointCtaViewK03 = k0();
        wo.d dVar4 = this.f2844x0;
        if (dVar4 == null) {
            l.l("displayEngine");
            throw null;
        }
        microSurveyPointCtaViewK03.setOnCloseSurveyClick(new a(0, dVar4, wo.d.class, "surveyClosed", "surveyClosed()V", 0, 0));
        k0().setOnSubmitClick(new a(0, this, b.class, "onSubmitClick", "onSubmitClick()V", 0, 1));
        k0().setOnBackClick(new a(0, g0(), f.class, "onBackClick", "onBackClick()V", 0, 2));
        k0().setOnPoweredByClick(new x(5, this));
    }

    public final MicroSurveyPointCtaView k0() {
        View viewFindViewById = Y().findViewById(r.fragment_micro_survey_point_cta_view);
        l.d(viewFindViewById, "findViewById(...)");
        return (MicroSurveyPointCtaView) viewFindViewById;
    }

    public final SurveyCtaSurveyPoint l0() {
        SurveyPoint surveyPoint = g0().f24574a;
        l.c(surveyPoint, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.cta.SurveyCtaSurveyPoint");
        return (SurveyCtaSurveyPoint) surveyPoint;
    }
}
