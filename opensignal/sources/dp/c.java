package dp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import as.x;
import bq.j;
import bq.o;
import br.l;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.entities.survey.theme.ColorScheme;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.presentation.date.micro.MicroSurveyPointDateContentView;
import com.survicate.surveys.presentation.date.micro.MicroSurveyPointDateView;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import com.survicate.surveys.utils.SurvicateLocalDate;
import h7.r1;
import java.util.Calendar;
import kotlin.Metadata;
import on.r;
import on.t;
import wo.f;
import wo.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldp/c;", "Lxo/d;", "<init>", "()V", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c extends xo.d {

    /* renamed from: x0, reason: collision with root package name */
    public wo.d f7426x0;

    public c() {
        super(t.fragment_micro_survey_point_date);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.os.Parcelable] */
    @Override // androidx.fragment.app.b
    public final void A(int i10, int i11, Intent intent) {
        SurvicateLocalDate survicateLocalDate;
        super.A(i10, i11, intent);
        if (i10 == 100 && i11 == -1) {
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    survicateLocalDate = (Parcelable) intent.getParcelableExtra("selected_date", SurvicateLocalDate.class);
                } else {
                    ?? parcelableExtra = intent.getParcelableExtra("selected_date");
                    survicateLocalDate = parcelableExtra instanceof SurvicateLocalDate ? parcelableExtra : null;
                }
                survicateLocalDate = (SurvicateLocalDate) survicateLocalDate;
            }
            if (survicateLocalDate != null) {
                MicroSurveyPointDateContentView microSurveyPointDateContentView = k0().F;
                microSurveyPointDateContentView.getClass();
                microSurveyPointDateContentView.selectedDate = survicateLocalDate;
                microSurveyPointDateContentView.b();
            }
        }
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
        this.f7426x0 = dVar;
        h hVarH0 = h0();
        SurveyPoint surveyPoint = g0().f24574a;
        l.c(surveyPoint, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint");
        Bundle bundleA = hVarH0.a(((SurveyQuestionSurveyPoint) surveyPoint).getId());
        MicroSurveyPointDateView microSurveyPointDateViewK0 = k0();
        MicroSurveyPointDateContentView microSurveyPointDateContentView = microSurveyPointDateViewK0.F;
        microSurveyPointDateContentView.getClass();
        microSurveyPointDateContentView.f6400y.b(r1Var, microColorScheme);
        View view2 = microSurveyPointDateContentView.B;
        Context context = microSurveyPointDateContentView.getContext();
        l.d(context, "getContext(...)");
        view2.setBackground(vc.e.n(context, microColorScheme, false));
        microSurveyPointDateContentView.D.setTextColor(microColorScheme.getAnswer());
        microSurveyPointDateContentView.E.setTextColor(microColorScheme.getAnswer());
        microSurveyPointDateContentView.F.setTextColor(microColorScheme.getAnswer());
        microSurveyPointDateContentView.G.setTextColor(microColorScheme.getAnswer());
        microSurveyPointDateContentView.H.setTextColor(microColorScheme.getAnswer());
        microSurveyPointDateContentView.I.c(microColorScheme);
        microSurveyPointDateViewK0.D.getBackground().setColorFilter(xu.l.l(microColorScheme.getBackground(), k3.a.SRC_IN));
        microSurveyPointDateViewK0.E.b(microColorScheme);
        microSurveyPointDateViewK0.I.a(microColorScheme);
        microSurveyPointDateViewK0.H.b(microColorScheme);
        microSurveyPointDateViewK0.G.b(microColorScheme);
        MicroSurveyPointDateView microSurveyPointDateViewK02 = k0();
        SurveyPoint surveyPoint2 = g0().f24574a;
        l.c(surveyPoint2, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint");
        SurveyQuestionSurveyPoint surveyQuestionSurveyPoint = (SurveyQuestionSurveyPoint) surveyPoint2;
        QuestionHeaderBindingData questionHeaderBindingDataA = g0().a();
        String inputTextPlaceholder = g0().d().getInputTextPlaceholder();
        if (inputTextPlaceholder == null) {
            inputTextPlaceholder = "";
        }
        Calendar calendar = Calendar.getInstance();
        l.d(calendar, "getInstance(...)");
        b bVar = new b(surveyQuestionSurveyPoint, questionHeaderBindingDataA, inputTextPlaceholder, new SurvicateLocalDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5)));
        o oVarC = g0().c();
        j jVarB = g0().b(X());
        wo.d dVar2 = this.f7426x0;
        if (dVar2 == null) {
            l.l("displayEngine");
            throw null;
        }
        boolean z10 = !dVar2.f();
        wo.d dVar3 = this.f7426x0;
        if (dVar3 == null) {
            l.l("displayEngine");
            throw null;
        }
        microSurveyPointDateViewK02.a(new d(bVar, oVarC, jVarB, z10, dVar3.c()), bundleA);
        MicroSurveyPointDateView microSurveyPointDateViewK03 = k0();
        microSurveyPointDateViewK03.setOnSelectDateClick(new bp.a(0, this, c.class, "showDatePicker", "showDatePicker()V", 0, 11));
        wo.d dVar4 = this.f7426x0;
        if (dVar4 == null) {
            l.l("displayEngine");
            throw null;
        }
        microSurveyPointDateViewK03.setOnCloseSurveyClick(new bp.a(0, dVar4, wo.d.class, "surveyClosed", "surveyClosed()V", 0, 12));
        microSurveyPointDateViewK03.setOnSubmitClick(new bp.a(0, this, c.class, "onSubmitClick", "onSubmitClick()V", 0, 13));
        microSurveyPointDateViewK03.setOnBackClick(new bp.a(0, g0(), f.class, "onBackClick", "onBackClick()V", 0, 14));
        microSurveyPointDateViewK03.setOnPoweredByClick(new x(11, this));
    }

    public final MicroSurveyPointDateView k0() {
        View viewFindViewById = Y().findViewById(r.fragment_micro_survey_point_date_view);
        l.d(viewFindViewById, "findViewById(...)");
        return (MicroSurveyPointDateView) viewFindViewById;
    }
}
