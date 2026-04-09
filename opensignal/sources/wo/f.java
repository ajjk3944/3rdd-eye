package wo;

import android.content.Intent;
import android.net.Uri;
import bq.o;
import br.l;
import com.survicate.surveys.entities.models.SurveyPointDisplayRequest;
import com.survicate.surveys.entities.survey.Survey;
import com.survicate.surveys.entities.survey.SurveyMessages;
import com.survicate.surveys.entities.survey.SurveySettings;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import com.survicate.surveys.entities.survey.questions.cta.SurveyCtaSurveyPoint;
import com.survicate.surveys.entities.survey.theme.Theme;
import com.survicate.surveys.entities.survey.theme.ThemeSettings;
import com.survicate.surveys.infrastructure.network.ai.FollowUpQuestionRepository;
import com.survicate.surveys.infrastructure.network.image.SurvicateImageLoader;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import com.survicate.surveys.presentation.widget.SurveyPointImageBindingData;
import h7.r1;
import i.j;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final SurveyPoint f24574a;

    /* renamed from: b, reason: collision with root package name */
    public final d f24575b;

    /* renamed from: c, reason: collision with root package name */
    public final sm.f f24576c;

    /* renamed from: d, reason: collision with root package name */
    public final i5.c f24577d;

    /* renamed from: e, reason: collision with root package name */
    public final cg.e f24578e;

    /* renamed from: f, reason: collision with root package name */
    public final FollowUpQuestionRepository f24579f;

    /* renamed from: g, reason: collision with root package name */
    public final r1 f24580g;

    public f(SurveyPoint surveyPoint, d dVar) {
        l.e(surveyPoint, "surveyPoint");
        l.e(dVar, "displayEngine");
        this.f24574a = surveyPoint;
        this.f24575b = dVar;
        this.f24576c = dVar.f24556g;
        this.f24577d = dVar.f24554e;
        this.f24578e = dVar.f24555f;
        this.f24579f = dVar.j;
        this.f24580g = dVar.f24557h;
    }

    public final QuestionHeaderBindingData a() {
        d dVar = this.f24575b;
        om.f fVar = dVar.f24553d;
        SurveyPoint surveyPoint = this.f24574a;
        String strS = fVar.s(surveyPoint.getDescription());
        String strS2 = dVar.f24553d.s(surveyPoint.getContent());
        String answerRequiredText = d().getAnswerRequiredText();
        if (strS == null) {
            strS = "";
        }
        return new QuestionHeaderBindingData(strS, strS2 == null ? "" : strS2, answerRequiredText == null ? "" : answerRequiredText, (!surveyPoint.isMandatory() || (surveyPoint instanceof SurveyCtaSurveyPoint) || l.a(surveyPoint.getAnswerType(), "date")) ? false : true, new SurveyPointImageBindingData(surveyPoint.getSurveyPointImage()));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final bq.j b(android.content.Context r12) {
        /*
            r11 = this;
            com.survicate.surveys.entities.survey.SurveyMessages r0 = r11.d()
            java.lang.String r1 = r0.getNavigationBackText()
            int r2 = on.u.survicate_navigation_button_back
            java.lang.String r2 = r12.getString(r2)
            java.lang.String r3 = "getString(...)"
            br.l.d(r2, r3)
            java.lang.String r5 = xu.l.B(r1, r2)
            java.lang.String r1 = "surveyPoint"
            com.survicate.surveys.entities.survey.questions.SurveyPoint r2 = r11.f24574a
            br.l.e(r2, r1)
            boolean r1 = r2 instanceof com.survicate.surveys.entities.survey.questions.cta.SurveyCtaSurveyPoint
            r4 = 1
            if (r1 == 0) goto L72
            r1 = r2
            com.survicate.surveys.entities.survey.questions.cta.SurveyCtaSurveyPoint r1 = (com.survicate.surveys.entities.survey.questions.cta.SurveyCtaSurveyPoint) r1
            java.lang.String r0 = r0.getSubmitText()
            com.survicate.surveys.entities.survey.questions.cta.CtaSettings r3 = r1.getCtaSettings()
            boolean r6 = r3 instanceof com.survicate.surveys.entities.survey.questions.cta.ButtonNextCtaSettings
            if (r6 == 0) goto L39
            int r3 = on.u.survicate_cta_button_next
            java.lang.String r12 = r12.getString(r3)
            goto L4a
        L39:
            boolean r3 = r3 instanceof com.survicate.surveys.entities.survey.questions.cta.ButtonCloseCtaSettings
            if (r3 == 0) goto L44
            int r3 = on.u.survicate_cta_button_close
            java.lang.String r12 = r12.getString(r3)
            goto L4a
        L44:
            int r3 = on.u.survicate_cta_button_link
            java.lang.String r12 = r12.getString(r3)
        L4a:
            br.l.b(r12)
            com.survicate.surveys.entities.survey.questions.cta.CtaSettings r1 = r1.getCtaSettings()
            if (r1 == 0) goto L58
            java.lang.String r1 = r1.getButtonText()
            goto L59
        L58:
            r1 = 0
        L59:
            if (r1 == 0) goto L65
            boolean r3 = tt.l.D0(r1)
            r3 = r3 ^ r4
            if (r3 != r4) goto L65
            r6 = r1
        L63:
            r12 = r4
            goto L84
        L65:
            if (r0 == 0) goto L70
            boolean r1 = tt.l.D0(r0)
            r1 = r1 ^ r4
            if (r1 != r4) goto L70
        L6e:
            r6 = r0
            goto L63
        L70:
            r6 = r12
            goto L63
        L72:
            java.lang.String r0 = r0.getSubmitText()
            int r1 = on.u.survicate_button_submit
            java.lang.String r12 = r12.getString(r1)
            br.l.d(r12, r3)
            java.lang.String r0 = xu.l.B(r0, r12)
            goto L6e
        L84:
            bq.j r4 = new bq.j
            wo.d r0 = r11.f24575b
            com.survicate.surveys.entities.survey.Survey r1 = r0.f24562o
            r3 = 0
            if (r1 != 0) goto L8f
            r7 = r3
            goto L98
        L8f:
            com.survicate.surveys.entities.survey.SurveySettings r1 = r1.getSettings()
            boolean r1 = r1.getNavigationEnabled()
            r7 = r1
        L98:
            r0.getClass()
            java.lang.String r1 = "question"
            br.l.e(r2, r1)
            com.survicate.surveys.entities.survey.Survey r1 = r0.f24562o
            if (r1 != 0) goto La5
            goto Lb1
        La5:
            java.util.List r1 = r1.getPoints()
            int r1 = r1.indexOf(r2)
            if (r1 != 0) goto Lb1
            r8 = r12
            goto Lb2
        Lb1:
            r8 = r3
        Lb2:
            boolean r9 = r11.e()
            boolean r0 = r0.f()
            r10 = r0 ^ 1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.f.b(android.content.Context):bq.j");
    }

    public final o c() {
        ThemeSettings themeSettingsEmpty;
        double d6;
        SurveySettings settings;
        Theme theme;
        d dVar = this.f24575b;
        Survey survey = dVar.f24562o;
        if (survey == null || (theme = survey.getTheme()) == null || (themeSettingsEmpty = theme.getSettings()) == null) {
            themeSettingsEmpty = ThemeSettings.INSTANCE.empty();
        }
        SurvicateImageLoader survicateImageLoader = (SurvicateImageLoader) dVar.f24557h.f10199d;
        Survey survey2 = dVar.f24562o;
        boolean z10 = false;
        if (survey2 != null && (settings = survey2.getSettings()) != null && settings.getShowProgressBar()) {
            z10 = true;
        }
        SurveyPoint surveyPoint = this.f24574a;
        l.e(surveyPoint, "surveyPoint");
        Survey survey3 = dVar.f24562o;
        if (survey3 == null) {
            d6 = 0.0d;
        } else {
            on.e eVar = dVar.f24551b;
            int answerCount = survey3.getAnswerCount();
            int maxPath = surveyPoint.getMaxPath();
            eVar.getClass();
            d6 = (answerCount / (answerCount + maxPath)) * 100;
        }
        return new o(themeSettingsEmpty, survicateImageLoader, z10, d6);
    }

    public final SurveyMessages d() {
        SurveySettings settings;
        SurveyMessages messages;
        Survey survey = this.f24575b.f24562o;
        return (survey == null || (settings = survey.getSettings()) == null || (messages = settings.getMessages()) == null) ? new SurveyMessages() : messages;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Set] */
    public final boolean e() {
        d dVar = this.f24575b;
        dVar.getClass();
        SurveyPoint surveyPoint = this.f24574a;
        l.e(surveyPoint, "question");
        Survey survey = dVar.f24562o;
        if (survey == null || survey.getPoints().indexOf(surveyPoint) != 0) {
            return false;
        }
        dVar.getClass();
        l.e(surveyPoint, "surveyPoint");
        return !dVar.f24566s.contains(Long.valueOf(surveyPoint.getId()));
    }

    public final void f() {
        d dVar = this.f24575b;
        Stack stack = dVar.f24564q;
        Survey survey = dVar.f24562o;
        if (survey != null && stack.size() > 1) {
            survey.decrementAnswerCount();
            dVar.f24567t = true;
            stack.pop();
            SurveyPoint surveyPoint = (SurveyPoint) stack.peek();
            l.b(surveyPoint);
            dVar.f24561n.g(new SurveyPointDisplayRequest(surveyPoint, true));
        }
    }

    public final void g(j jVar) {
        Survey survey;
        if (jVar == null || (survey = this.f24575b.f24562o) == null) {
            return;
        }
        String id2 = survey.getId();
        this.f24576c.getClass();
        l.e(id2, "surveyId");
        String str = "https://survicate.com/create-your-mobile-survey/?utm_source=Survey+branding&utm_medium=MobileSurvey&utm_content=respondent.survicate.com" + "&utm_term=".concat(id2);
        l.d(str, "toString(...)");
        if (Pattern.compile("https?://(www\\.)?[-a-zA-Z0-9@:%._+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%_+.~#?&/=]*)").matcher(str).matches()) {
            try {
                jVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (Exception unused) {
            }
        }
    }

    public final void h(g gVar) {
        l.e(gVar, "viewAnswer");
        d dVar = this.f24575b;
        Survey survey = dVar.f24562o;
        if (survey == null) {
            return;
        }
        dVar.d(new on.a(j(gVar.f24581a), this.f24574a, survey, gVar.f24582b));
    }

    public final void i(g gVar, boolean z10) {
        Survey survey;
        l.e(gVar, "viewAnswer");
        if (z10) {
            SurveyPoint surveyPoint = this.f24574a;
            if (surveyPoint.isMandatory()) {
                d dVar = this.f24575b;
                Survey survey2 = dVar.f24562o;
                if ((!(survey2 == null ? false : survey2.getSettings().getNavigationEnabled()) || e()) && (survey = dVar.f24562o) != null) {
                    dVar.d(new on.a(j(gVar.f24581a), surveyPoint, survey, gVar.f24582b));
                }
            }
        }
    }

    public abstract e j(List list);
}
