package np;

import br.l;
import com.survicate.surveys.entities.models.SurvicateNpsAnswerOption;
import com.survicate.surveys.entities.survey.questions.nps.SurveyNpsPointSettings;
import com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer;
import com.survicate.surveys.entities.survey.questions.question.rating.numerical.SurveyPointNumericalSettings;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import h7.q0;
import java.util.List;
import mq.o;

/* loaded from: classes.dex */
public abstract class e extends q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18474d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final MicroColorScheme f18475e;

    /* renamed from: f, reason: collision with root package name */
    public final List f18476f;

    /* renamed from: g, reason: collision with root package name */
    public Object f18477g;

    /* renamed from: h, reason: collision with root package name */
    public Object f18478h;

    public e(MicroColorScheme microColorScheme) {
        l.e(microColorScheme, "colorScheme");
        this.f18475e = microColorScheme;
        this.f18476f = SurvicateNpsAnswerOption.getEntries();
    }

    public static String r(SurvicateNpsAnswerOption survicateNpsAnswerOption, SurveyNpsPointSettings surveyNpsPointSettings) {
        String str;
        String strG;
        String textOnTheRight;
        String strG2;
        l.e(surveyNpsPointSettings, "settings");
        String strValueOf = String.valueOf(survicateNpsAnswerOption.getValue());
        int i10 = d.f18473a[survicateNpsAnswerOption.ordinal()];
        if (i10 == 1) {
            String textOnTheLeft = surveyNpsPointSettings.getTextOnTheLeft();
            if (textOnTheLeft != null) {
                str = tt.l.D0(textOnTheLeft) ? null : textOnTheLeft;
                if (str != null && (strG = w.g.g(strValueOf, " - ", str)) != null) {
                    return strG;
                }
            }
        } else if (i10 == 2 && (textOnTheRight = surveyNpsPointSettings.getTextOnTheRight()) != null) {
            str = tt.l.D0(textOnTheRight) ? null : textOnTheRight;
            if (str != null && (strG2 = w.g.g(strValueOf, " - ", str)) != null) {
                return strG2;
            }
        }
        return strValueOf;
    }

    @Override // h7.q0
    public final int b() {
        switch (this.f18474d) {
            case 0:
                return q().size();
            default:
                return this.f18476f.size();
        }
    }

    public List q() {
        return (sq.a) this.f18476f;
    }

    public String s(QuestionPointAnswer questionPointAnswer, SurveyPointNumericalSettings surveyPointNumericalSettings) {
        String rightText;
        String str;
        String strG;
        String strG2;
        l.e(surveyPointNumericalSettings, "settings");
        String possibleAnswer = questionPointAnswer.getPossibleAnswer();
        if (possibleAnswer == null) {
            possibleAnswer = "";
        }
        long id2 = questionPointAnswer.getId();
        List list = this.f18476f;
        QuestionPointAnswer questionPointAnswer2 = (QuestionPointAnswer) o.t0(list);
        if (questionPointAnswer2 == null || id2 != questionPointAnswer2.getId()) {
            QuestionPointAnswer questionPointAnswer3 = (QuestionPointAnswer) o.A0(list);
            if (questionPointAnswer3 != null && id2 == questionPointAnswer3.getId() && (rightText = surveyPointNumericalSettings.getRightText()) != null) {
                str = tt.l.D0(rightText) ? null : rightText;
                if (str != null && (strG = w.g.g(possibleAnswer, " - ", str)) != null) {
                    return strG;
                }
            }
        } else {
            String leftText = surveyPointNumericalSettings.getLeftText();
            if (leftText != null) {
                str = tt.l.D0(leftText) ? null : leftText;
                if (str != null && (strG2 = w.g.g(possibleAnswer, " - ", str)) != null) {
                    return strG2;
                }
            }
        }
        return possibleAnswer;
    }

    public void t(SurvicateNpsAnswerOption survicateNpsAnswerOption) {
        SurvicateNpsAnswerOption survicateNpsAnswerOption2 = (SurvicateNpsAnswerOption) this.f18477g;
        Integer numValueOf = survicateNpsAnswerOption2 != null ? Integer.valueOf(q().indexOf(survicateNpsAnswerOption2)) : null;
        this.f18477g = survicateNpsAnswerOption;
        if (numValueOf != null) {
            e(numValueOf.intValue());
        }
        e(q().indexOf(survicateNpsAnswerOption));
    }

    public void u(QuestionPointAnswer questionPointAnswer) {
        QuestionPointAnswer questionPointAnswer2 = (QuestionPointAnswer) this.f18477g;
        List list = this.f18476f;
        Integer numValueOf = questionPointAnswer2 != null ? Integer.valueOf(list.indexOf(questionPointAnswer2)) : null;
        this.f18477g = questionPointAnswer;
        if (numValueOf != null) {
            e(numValueOf.intValue());
        }
        e(list.indexOf(questionPointAnswer));
    }

    public e(List list, MicroColorScheme microColorScheme) {
        l.e(list, "items");
        l.e(microColorScheme, "colorScheme");
        this.f18476f = list;
        this.f18475e = microColorScheme;
    }
}
