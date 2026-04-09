package zp;

import br.l;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final SurveyQuestionSurveyPoint f27503a;

    /* renamed from: b, reason: collision with root package name */
    public final QuestionHeaderBindingData f27504b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27505c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f27506d;

    public g(SurveyQuestionSurveyPoint surveyQuestionSurveyPoint, QuestionHeaderBindingData questionHeaderBindingData, String str, Integer num) {
        this.f27503a = surveyQuestionSurveyPoint;
        this.f27504b = questionHeaderBindingData;
        this.f27505c = str;
        this.f27506d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f27503a.equals(gVar.f27503a) && this.f27504b.equals(gVar.f27504b) && this.f27505c.equals(gVar.f27505c) && l.a(this.f27506d, gVar.f27506d);
    }

    public final int hashCode() {
        int iG = c7.a.g(this.f27505c, (this.f27504b.hashCode() + (this.f27503a.hashCode() * 31)) * 31, 31);
        Integer num = this.f27506d;
        return (iG + (num == null ? 0 : num.hashCode())) * 31;
    }

    public final String toString() {
        return "BindingData(surveyPoint=" + this.f27503a + ", questionHeaderBindingData=" + this.f27504b + ", textPlaceholder=" + this.f27505c + ", followUpLimit=" + this.f27506d + ", followUpLimitReachedNotification=null)";
    }
}
