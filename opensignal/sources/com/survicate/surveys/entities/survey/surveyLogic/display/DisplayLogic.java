package com.survicate.surveys.entities.survey.surveyLogic.display;

import android.os.Parcelable;
import br.g;
import com.survicate.surveys.entities.survey.SurveyAnswerType;
import com.survicate.surveys.entities.survey.surveyLogic.SurveyLogicOperator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/display/DisplayLogic;", "Landroid/os/Parcelable;", "()V", "answerType", "Lcom/survicate/surveys/entities/survey/SurveyAnswerType;", "getAnswerType", "()Lcom/survicate/surveys/entities/survey/SurveyAnswerType;", "groupOperator", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "getGroupOperator", "()Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "pointId", "", "getPointId", "()J", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/DateDisplayLogic;", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/FormDisplayLogic;", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/MatrixDisplayLogic;", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/MultipleChoiceDisplayLogic;", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/RangeDisplayLogic;", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/SingleChoiceDisplayLogic;", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/TextDisplayLogic;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class DisplayLogic implements Parcelable {
    public /* synthetic */ DisplayLogic(g gVar) {
        this();
    }

    public abstract SurveyAnswerType getAnswerType();

    public abstract SurveyLogicOperator getGroupOperator();

    public abstract long getPointId();

    private DisplayLogic() {
    }
}
