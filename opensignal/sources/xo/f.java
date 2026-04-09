package xo;

import br.l;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.matrix.SurveyPointMatrixSettings;
import com.survicate.surveys.entities.survey.questions.question.multiple.SurveyPointMultipleSettings;
import com.survicate.surveys.entities.survey.questions.question.single.SurveyPointSingleSettings;
import java.util.ArrayList;
import java.util.List;
import mq.o;

/* loaded from: classes.dex */
public final class f {
    public static List a(SurveyQuestionSurveyPoint surveyQuestionSurveyPoint) {
        Boolean boolValueOf;
        e eVar = e.E;
        l.e(surveyQuestionSurveyPoint, "point");
        SurveyQuestionPointSettings settings = surveyQuestionSurveyPoint.getSettings();
        if (settings == null) {
            return surveyQuestionSurveyPoint.getAnswers();
        }
        if (surveyQuestionSurveyPoint.getAnswers().isEmpty()) {
            return surveyQuestionSurveyPoint.getAnswers();
        }
        Boolean boolValueOf2 = Boolean.FALSE;
        if (settings instanceof SurveyPointSingleSettings) {
            SurveyPointSingleSettings surveyPointSingleSettings = (SurveyPointSingleSettings) settings;
            Boolean randomizeAnswers = surveyPointSingleSettings.getRandomizeAnswers();
            boolValueOf = surveyPointSingleSettings.getRandomizeExceptLast();
            boolValueOf2 = randomizeAnswers;
        } else {
            boolValueOf = boolValueOf2;
        }
        if (settings instanceof SurveyPointMultipleSettings) {
            SurveyPointMultipleSettings surveyPointMultipleSettings = (SurveyPointMultipleSettings) settings;
            Boolean randomizeAnswers2 = surveyPointMultipleSettings.getRandomizeAnswers();
            boolValueOf = surveyPointMultipleSettings.getRandomizeExceptLast();
            boolValueOf2 = randomizeAnswers2;
        }
        if (settings instanceof SurveyPointMatrixSettings) {
            SurveyPointMatrixSettings surveyPointMatrixSettings = (SurveyPointMatrixSettings) settings;
            boolValueOf2 = Boolean.valueOf(surveyPointMatrixSettings.getRandomizeAnswers());
            boolValueOf = Boolean.valueOf(surveyPointMatrixSettings.getRandomizeExceptLast());
        }
        Boolean bool = Boolean.TRUE;
        if (!l.a(boolValueOf2, bool)) {
            return surveyQuestionSurveyPoint.getAnswers();
        }
        ArrayList arrayList = new ArrayList(surveyQuestionSurveyPoint.getAnswers());
        if (l.a(boolValueOf, bool)) {
            arrayList.remove(e5.z(arrayList));
        }
        eVar.a(arrayList);
        if (l.a(boolValueOf, bool)) {
            arrayList.add(o.z0(surveyQuestionSurveyPoint.getAnswers()));
        }
        return arrayList;
    }
}
