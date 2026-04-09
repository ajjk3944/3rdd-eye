package zo;

import br.l;
import com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final SurveyQuestionSurveyPoint f27475a;

    /* renamed from: b, reason: collision with root package name */
    public final QuestionHeaderBindingData f27476b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27477c;

    public b(SurveyQuestionSurveyPoint surveyQuestionSurveyPoint, QuestionHeaderBindingData questionHeaderBindingData, String str) {
        this.f27475a = surveyQuestionSurveyPoint;
        this.f27476b = questionHeaderBindingData;
        this.f27477c = str;
    }

    public final boolean a() {
        List<QuestionPointAnswer> answers = this.f27475a.getAnswers();
        if (answers != null && answers.isEmpty()) {
            return false;
        }
        Iterator<T> it = answers.iterator();
        while (it.hasNext()) {
            if (l.a(((QuestionPointAnswer) it.next()).getAddingCommentAvailable(), Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f27475a, bVar.f27475a) && l.a(this.f27476b, bVar.f27476b) && l.a(this.f27477c, bVar.f27477c);
    }

    public final int hashCode() {
        return this.f27477c.hashCode() + ((this.f27476b.hashCode() + (this.f27475a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingData(surveyPoint=");
        sb2.append(this.f27475a);
        sb2.append(", questionHeaderBindingData=");
        sb2.append(this.f27476b);
        sb2.append(", commentHint=");
        return h0.b.r(sb2, this.f27477c, ')');
    }
}
