package sp;

import br.l;
import com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SurveyQuestionSurveyPoint f22193a;

    /* renamed from: b, reason: collision with root package name */
    public final QuestionHeaderBindingData f22194b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22195c;

    public a(SurveyQuestionSurveyPoint surveyQuestionSurveyPoint, QuestionHeaderBindingData questionHeaderBindingData, String str) {
        this.f22193a = surveyQuestionSurveyPoint;
        this.f22194b = questionHeaderBindingData;
        this.f22195c = str;
    }

    public final boolean a() {
        List<QuestionPointAnswer> answers = this.f22193a.getAnswers();
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
        return l.a(this.f22193a, aVar.f22193a) && l.a(this.f22194b, aVar.f22194b) && l.a(this.f22195c, aVar.f22195c);
    }

    public final int hashCode() {
        return this.f22195c.hashCode() + ((this.f22194b.hashCode() + (this.f22193a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingData(surveyPoint=");
        sb2.append(this.f22193a);
        sb2.append(", questionHeaderBindingData=");
        sb2.append(this.f22194b);
        sb2.append(", commentHint=");
        return h0.b.r(sb2, this.f22195c, ')');
    }
}
