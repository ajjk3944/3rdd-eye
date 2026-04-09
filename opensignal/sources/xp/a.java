package xp;

import br.l;
import com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SurveyQuestionSurveyPoint f25457a;

    /* renamed from: b, reason: collision with root package name */
    public final QuestionHeaderBindingData f25458b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25459c;

    public a(SurveyQuestionSurveyPoint surveyQuestionSurveyPoint, QuestionHeaderBindingData questionHeaderBindingData, String str) {
        this.f25457a = surveyQuestionSurveyPoint;
        this.f25458b = questionHeaderBindingData;
        this.f25459c = str;
    }

    public final boolean a() {
        List<QuestionPointAnswer> answers = this.f25457a.getAnswers();
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f25457a, aVar.f25457a) && l.a(this.f25458b, aVar.f25458b) && l.a(this.f25459c, aVar.f25459c);
    }

    public final int hashCode() {
        return this.f25459c.hashCode() + ((this.f25458b.hashCode() + (this.f25457a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingData(surveyPoint=");
        sb2.append(this.f25457a);
        sb2.append(", questionHeaderBindingData=");
        sb2.append(this.f25458b);
        sb2.append(", commentHint=");
        return h0.b.r(sb2, this.f25459c, ')');
    }
}
