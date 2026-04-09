package zp;

import android.os.Bundle;
import android.view.View;
import bq.o;
import br.l;
import com.survicate.surveys.entities.survey.Survey;
import com.survicate.surveys.entities.survey.SurveySettings;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.entities.survey.theme.ColorScheme;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextContentView;
import com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextView;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import h7.r1;
import kotlin.Metadata;
import on.r;
import on.t;
import wt.z;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzp/i;", "Lxo/d;", "<init>", "()V", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i extends xo.d {

    /* renamed from: x0, reason: collision with root package name */
    public wo.d f27510x0;

    /* renamed from: y0, reason: collision with root package name */
    public z f27511y0;

    public i() {
        super(t.fragment_micro_survey_point_text);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k0(zp.i r4, rq.c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof zp.h
            if (r0 == 0) goto L16
            r0 = r5
            zp.h r0 = (zp.h) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.B = r1
            goto L1b
        L16:
            zp.h r0 = new zp.h
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f27508x
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            zp.i r4 = r0.f27507r
            lf.t1.G(r5)
            goto L57
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            lf.t1.G(r5)
            com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextView r5 = r4.l0()
            r5.b(r3)
            wo.f r5 = r4.g0()
            yp.e r5 = (yp.e) r5
            com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextView r2 = r4.l0()
            java.util.List r2 = r2.getAnswers()
            r0.f27507r = r4
            r0.B = r3
            java.lang.Object r5 = r5.k(r2, r0)
            if (r5 != r1) goto L57
            return r1
        L57:
            yp.c r5 = (yp.c) r5
            com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextView r0 = r4.l0()
            r1 = 0
            r0.b(r1)
            yp.a r0 = yp.a.f26410a
            boolean r0 = br.l.a(r5, r0)
            if (r0 == 0) goto L79
            wo.f r5 = r4.g0()
            com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextView r4 = r4.l0()
            wo.g r4 = r4.getAnswer()
            r5.h(r4)
            goto L92
        L79:
            boolean r0 = r5 instanceof yp.b
            if (r0 == 0) goto L92
            com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextView r4 = r4.l0()
            yp.b r5 = (yp.b) r5
            java.lang.String r5 = r5.f26411a
            java.lang.String r0 = "question"
            br.l.e(r5, r0)
            com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextContentView r0 = r4.E
            r0.a(r5)
            r4.c()
        L92:
            lq.b0 r4 = lq.b0.f15562a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zp.i.k0(zp.i, rq.c):java.lang.Object");
    }

    @Override // androidx.fragment.app.b
    public final void R() {
        this.f1410c0 = true;
        Bundle currentUiState = l0().getCurrentUiState();
        wo.h hVarH0 = h0();
        SurveyPoint surveyPoint = g0().f24574a;
        l.c(surveyPoint, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint");
        hVarH0.b(currentUiState, ((SurveyQuestionSurveyPoint) surveyPoint).getId());
    }

    @Override // xo.d
    public final void i0(View view, r1 r1Var, wo.d dVar, ColorScheme colorScheme) {
        SurveySettings settings;
        MicroColorScheme microColorScheme = (MicroColorScheme) colorScheme;
        l.e(view, "view");
        l.e(r1Var, "viewDependencies");
        l.e(dVar, "displayEngine");
        super.j0(view, r1Var, dVar, microColorScheme);
        this.f27510x0 = dVar;
        wo.h hVarH0 = h0();
        SurveyPoint surveyPoint = g0().f24574a;
        l.c(surveyPoint, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint");
        Bundle bundleA = hVarH0.a(((SurveyQuestionSurveyPoint) surveyPoint).getId());
        MicroSurveyPointTextView microSurveyPointTextViewL0 = l0();
        microSurveyPointTextViewL0.B.getBackground().setColorFilter(xu.l.l(microColorScheme.getBackground(), k3.a.SRC_IN));
        microSurveyPointTextViewL0.D.b(microColorScheme);
        microSurveyPointTextViewL0.H.a(microColorScheme);
        MicroSurveyPointTextContentView microSurveyPointTextContentView = microSurveyPointTextViewL0.E;
        microSurveyPointTextContentView.getClass();
        microSurveyPointTextContentView.F = r1Var;
        microSurveyPointTextContentView.G = microColorScheme;
        microSurveyPointTextViewL0.G.b(microColorScheme);
        microSurveyPointTextViewL0.F.b(microColorScheme);
        MicroSurveyPointTextView microSurveyPointTextViewL02 = l0();
        SurveyPoint surveyPoint2 = g0().f24574a;
        l.c(surveyPoint2, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint");
        SurveyQuestionSurveyPoint surveyQuestionSurveyPoint = (SurveyQuestionSurveyPoint) surveyPoint2;
        QuestionHeaderBindingData questionHeaderBindingDataA = g0().a();
        String inputTextPlaceholder = g0().d().getInputTextPlaceholder();
        if (inputTextPlaceholder == null) {
            inputTextPlaceholder = "";
        }
        Survey survey = ((yp.e) g0()).f24575b.f24562o;
        g gVar = new g(surveyQuestionSurveyPoint, questionHeaderBindingDataA, inputTextPlaceholder, (survey == null || (settings = survey.getSettings()) == null) ? null : settings.getFollowupLimit());
        o oVarC = g0().c();
        bq.j jVarB = g0().b(X());
        wo.d dVar2 = this.f27510x0;
        if (dVar2 == null) {
            l.l("displayEngine");
            throw null;
        }
        boolean z10 = !dVar2.f();
        wo.d dVar3 = this.f27510x0;
        if (dVar3 == null) {
            l.l("displayEngine");
            throw null;
        }
        microSurveyPointTextViewL02.a(new j(gVar, oVarC, jVarB, z10, dVar3.c()), bundleA);
        MicroSurveyPointTextView microSurveyPointTextViewL03 = l0();
        wo.d dVar4 = this.f27510x0;
        if (dVar4 == null) {
            l.l("displayEngine");
            throw null;
        }
        int i10 = 0;
        microSurveyPointTextViewL03.setOnCloseSurveyClick(new xp.c(i10, dVar4, wo.d.class, "surveyClosed", "surveyClosed()V", 0, 10));
        microSurveyPointTextViewL03.setOnSubmitClick(new xp.c(0, this, i.class, "onSubmitClick", "onSubmitClick()V", 0, 11));
        microSurveyPointTextViewL03.setOnBackClick(new xp.c(0, g0(), wo.f.class, "onBackClick", "onBackClick()V", i10, 12));
        microSurveyPointTextViewL03.setOnPoweredByClick(new pp.c(20, this));
    }

    public final MicroSurveyPointTextView l0() {
        View viewFindViewById = Y().findViewById(r.fragment_micro_survey_point_text_view);
        l.d(viewFindViewById, "findViewById(...)");
        return (MicroSurveyPointTextView) viewFindViewById;
    }
}
