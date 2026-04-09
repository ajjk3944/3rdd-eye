package xo;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import br.l;
import com.survicate.surveys.SurveyActivity;
import com.survicate.surveys.entities.survey.Survey;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import com.survicate.surveys.entities.survey.theme.ColorScheme;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.entities.survey.theme.Theme;
import h7.r1;
import wo.h;

/* loaded from: classes.dex */
public abstract class d extends androidx.fragment.app.b {

    /* renamed from: w0, reason: collision with root package name */
    public wo.f f25456w0;

    public d(int i10) {
        this.f1428r0 = i10;
    }

    @Override // androidx.fragment.app.b
    public final void S(View view, Bundle bundle) {
        Parcelable parcelable;
        Theme theme;
        l.e(view, "view");
        Bundle bundle2 = this.B;
        if (bundle2 == null) {
            throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
        }
        ColorScheme colorScheme = null;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) bundle2.getParcelable("SURVEY_POINT", SurveyPoint.class);
        } else {
            Parcelable parcelable2 = bundle2.getParcelable("SURVEY_POINT");
            if (!(parcelable2 instanceof SurveyPoint)) {
                parcelable2 = null;
            }
            parcelable = (SurveyPoint) parcelable2;
        }
        SurveyPoint surveyPoint = (SurveyPoint) parcelable;
        if (surveyPoint == null) {
            throw new IllegalStateException("SurveyPoint argument is missing.");
        }
        wo.d dVar = ((SurveyActivity) W()).T;
        if (dVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        wo.f displayer = surveyPoint.getDisplayer(dVar);
        l.e(displayer, "<set-?>");
        this.f25456w0 = displayer;
        Survey survey = dVar.f24562o;
        if (survey != null && (theme = survey.getTheme()) != null) {
            colorScheme = theme.getColorScheme();
        }
        r1 r1Var = g0().f24580g;
        l.c(colorScheme, "null cannot be cast to non-null type T of com.survicate.surveys.presentation.base.SurveyPointFragment");
        i0(view, r1Var, dVar, colorScheme);
    }

    public final wo.f g0() {
        wo.f fVar = this.f25456w0;
        if (fVar != null) {
            return fVar;
        }
        l.l("pointDisplayer");
        throw null;
    }

    public final h h0() {
        h hVar = ((SurveyActivity) W()).U;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("SurveyViewModel is not initialized");
    }

    public abstract void i0(View view, r1 r1Var, wo.d dVar, ColorScheme colorScheme);

    public void j0(View view, r1 r1Var, wo.d dVar, MicroColorScheme microColorScheme) {
        l.e(view, "view");
        l.e(r1Var, "viewDependencies");
        l.e(dVar, "displayEngine");
        l.e(microColorScheme, "colorScheme");
        int answer = !dVar.c() ? 0 : microColorScheme.getAnswer();
        Window window = W().getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(answer);
    }
}
