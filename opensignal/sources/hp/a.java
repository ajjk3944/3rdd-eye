package hp;

import br.l;
import com.survicate.surveys.entities.models.MatrixAnswer;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.matrix.SurveyPointMatrixSettings;
import com.survicate.surveys.entities.survey.surveyLogic.matrix.SurveyPointMatrixLogic;
import com.survicate.surveys.entities.survey.surveyLogic.matrix.SurveyPointMatrixLogicExtensionsKt;
import dv.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mq.o;
import mq.w;
import un.b;
import wo.e;
import wo.f;

/* loaded from: classes.dex */
public final class a extends f {
    @Override // wo.f
    public final e j(List list) {
        Object next;
        l.e(list, "answers");
        if (list.isEmpty()) {
            throw new IllegalArgumentException("The answers list must contain at least one item, even if it's an empty answer.");
        }
        Map<Long, ? extends Long> mapM33fromRawAnswersyWLOJ_k = MatrixAnswer.INSTANCE.m33fromRawAnswersyWLOJ_k(list);
        SurveyQuestionSurveyPoint surveyQuestionSurveyPoint = (SurveyQuestionSurveyPoint) this.f24574a;
        long id2 = surveyQuestionSurveyPoint.getId();
        this.f24578e.getClass();
        l.e(mapM33fromRawAnswersyWLOJ_k, "answer");
        ArrayList arrayList = new ArrayList(mapM33fromRawAnswersyWLOJ_k.size());
        for (Map.Entry<Long, ? extends Long> entry : mapM33fromRawAnswersyWLOJ_k.entrySet()) {
            arrayList.add(new b(entry.getKey().longValue(), entry.getValue().longValue()));
        }
        this.f24577d.d(new uo.b(id2, w.f16945a, new un.e(id2, arrayList)));
        SurveyQuestionPointSettings settings = surveyQuestionSurveyPoint.getSettings();
        l.c(settings, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.matrix.SurveyPointMatrixSettings");
        List<SurveyPointMatrixLogic> logic = ((SurveyPointMatrixSettings) settings).getLogic();
        this.f24575b.f24558i.getClass();
        l.e(logic, "logics");
        Iterator it = o.M0(logic, new h(17)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (SurveyPointMatrixLogicExtensionsKt.m35isSatisfiedByAGWYiuQ((SurveyPointMatrixLogic) next, mapM33fromRawAnswersyWLOJ_k)) {
                break;
            }
        }
        SurveyPointMatrixLogic surveyPointMatrixLogic = (SurveyPointMatrixLogic) next;
        return new e(list, surveyPointMatrixLogic != null ? Long.valueOf(surveyPointMatrixLogic.getGoTo()) : null, surveyQuestionSurveyPoint.getId());
    }
}
