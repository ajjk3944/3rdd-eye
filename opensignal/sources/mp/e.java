package mp;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import bq.j;
import bq.o;
import br.l;
import com.google.android.gms.internal.measurement.b4;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import com.survicate.surveys.entities.survey.questions.nps.SurveyNpsSurveyPoint;
import com.survicate.surveys.entities.survey.theme.ColorScheme;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.presentation.nps.micro.MicroSurveyPointNpsContentView;
import com.survicate.surveys.presentation.nps.micro.MicroSurveyPointNpsView;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import h7.r1;
import kotlin.Metadata;
import on.r;
import on.t;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmp/e;", "Lxo/d;", "<init>", "()V", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e extends xo.d {

    /* renamed from: x0, reason: collision with root package name */
    public wo.d f16911x0;

    public e() {
        super(t.fragment_micro_survey_point_nps);
    }

    @Override // androidx.fragment.app.b
    public final void R() {
        this.f1410c0 = true;
        Bundle currentUiState = k0().getCurrentUiState();
        wo.h hVarH0 = h0();
        SurveyPoint surveyPoint = g0().f24574a;
        l.c(surveyPoint, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.nps.SurveyNpsSurveyPoint");
        hVarH0.b(currentUiState, ((SurveyNpsSurveyPoint) surveyPoint).getId());
    }

    @Override // xo.d
    public final void i0(View view, r1 r1Var, wo.d dVar, ColorScheme colorScheme) throws Resources.NotFoundException {
        MicroColorScheme microColorScheme = (MicroColorScheme) colorScheme;
        l.e(view, "view");
        l.e(r1Var, "viewDependencies");
        l.e(dVar, "displayEngine");
        super.j0(view, r1Var, dVar, microColorScheme);
        this.f16911x0 = dVar;
        wo.h hVarH0 = h0();
        SurveyPoint surveyPoint = g0().f24574a;
        l.c(surveyPoint, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.nps.SurveyNpsSurveyPoint");
        Bundle bundleA = hVarH0.a(((SurveyNpsSurveyPoint) surveyPoint).getId());
        MicroSurveyPointNpsView microSurveyPointNpsViewK0 = k0();
        microSurveyPointNpsViewK0.D.getBackground().setColorFilter(xu.l.l(microColorScheme.getBackground(), k3.a.SRC_IN));
        microSurveyPointNpsViewK0.E.b(microColorScheme);
        microSurveyPointNpsViewK0.I.a(microColorScheme);
        MicroSurveyPointNpsContentView microSurveyPointNpsContentView = microSurveyPointNpsViewK0.F;
        microSurveyPointNpsContentView.getClass();
        microSurveyPointNpsContentView.f6461x = microColorScheme;
        microSurveyPointNpsContentView.f6462y.b(r1Var, microColorScheme);
        microSurveyPointNpsContentView.F.c(microColorScheme);
        microSurveyPointNpsViewK0.H.b(microColorScheme);
        microSurveyPointNpsViewK0.G.b(microColorScheme);
        MicroSurveyPointNpsView microSurveyPointNpsViewK02 = k0();
        SurveyPoint surveyPoint2 = g0().f24574a;
        l.c(surveyPoint2, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.nps.SurveyNpsSurveyPoint");
        SurveyNpsSurveyPoint surveyNpsSurveyPoint = (SurveyNpsSurveyPoint) surveyPoint2;
        QuestionHeaderBindingData questionHeaderBindingDataA = g0().a();
        String inputTextPlaceholder = g0().d().getInputTextPlaceholder();
        if (inputTextPlaceholder == null) {
            inputTextPlaceholder = "";
        }
        WindowManager windowManager = W().getWindowManager();
        l.d(windowManager, "getWindowManager(...)");
        b bVar = new b(surveyNpsSurveyPoint, questionHeaderBindingDataA, inputTextPlaceholder, b4.G(windowManager));
        o oVarC = g0().c();
        j jVarB = g0().b(X());
        wo.d dVar2 = this.f16911x0;
        if (dVar2 == null) {
            l.l("displayEngine");
            throw null;
        }
        boolean z10 = !dVar2.f();
        wo.d dVar3 = this.f16911x0;
        if (dVar3 == null) {
            l.l("displayEngine");
            throw null;
        }
        microSurveyPointNpsViewK02.b(new f(bVar, oVarC, jVarB, z10, dVar3.c()), bundleA);
        MicroSurveyPointNpsView microSurveyPointNpsViewK03 = k0();
        microSurveyPointNpsViewK03.setOnAnswerSelected(new gv.a(1, this));
        wo.d dVar4 = this.f16911x0;
        if (dVar4 == null) {
            l.l("displayEngine");
            throw null;
        }
        int i10 = 0;
        int i11 = 0;
        microSurveyPointNpsViewK03.setOnCloseSurveyClick(new kp.d(i11, dVar4, wo.d.class, "surveyClosed", "surveyClosed()V", i10, 6));
        microSurveyPointNpsViewK03.setOnSubmitClick(new kp.d(0, this, e.class, "onSubmitClick", "onSubmitClick()V", 0, 7));
        microSurveyPointNpsViewK03.setOnBackClick(new kp.d(i11, g0(), wo.f.class, "onBackClick", "onBackClick()V", i10, 8));
        microSurveyPointNpsViewK03.setOnPoweredByClick(new ht.g(26, this));
    }

    public final MicroSurveyPointNpsView k0() {
        View viewFindViewById = Y().findViewById(r.fragment_micro_survey_point_nps_view);
        l.d(viewFindViewById, "findViewById(...)");
        return (MicroSurveyPointNpsView) viewFindViewById;
    }
}
