package com.survicate.surveys.infrastructure.serialization;

import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import com.survicate.surveys.entities.survey.questions.cta.SurveyCtaSurveyPoint;
import com.survicate.surveys.entities.survey.questions.form.SurveyFormSurveyPoint;
import com.survicate.surveys.entities.survey.questions.nps.SurveyNpsSurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import nk.c0;
import nk.n;
import nk.q0;
import nk.r;
import nk.w;

/* loaded from: classes.dex */
public class SurveyPointResponseJsonAdapter extends r {
    private static final String TYPE_KEY = "type";
    private final r ctaPointResponseJsonAdapter;
    private final r formResponseAdapter;
    private final r npsPointResponseJsonAdapter;
    private final r questionResponseAdapter;

    public SurveyPointResponseJsonAdapter(r rVar, r rVar2, r rVar3, r rVar4) {
        this.formResponseAdapter = rVar;
        this.questionResponseAdapter = rVar2;
        this.npsPointResponseJsonAdapter = rVar3;
        this.ctaPointResponseJsonAdapter = rVar4;
    }

    @Override // nk.r
    @n
    public List<SurveyPoint> fromJson(w wVar) throws IOException {
        Map map;
        SurveyPoint surveyPoint;
        wVar.b();
        ArrayList arrayList = new ArrayList();
        while (wVar.w()) {
            map = (Map) wVar.o0();
            String str = (String) map.get(TYPE_KEY);
            str.getClass();
            switch (str) {
                case "SurveyCta":
                    surveyPoint = (SurveyPoint) this.ctaPointResponseJsonAdapter.fromJsonValue(map);
                    break;
                case "SurveyNps":
                    surveyPoint = (SurveyPoint) this.npsPointResponseJsonAdapter.fromJsonValue(map);
                    break;
                case "SurveyForm":
                    surveyPoint = (SurveyPoint) this.formResponseAdapter.fromJsonValue(map);
                    break;
                case "SurveyQuestion":
                    surveyPoint = (SurveyPoint) this.questionResponseAdapter.fromJsonValue(map);
                    break;
                default:
                    surveyPoint = null;
                    break;
            }
            if (surveyPoint != null) {
                arrayList.add(surveyPoint);
            }
        }
        wVar.h();
        return arrayList;
    }

    @Override // nk.r
    @q0
    public void toJson(c0 c0Var, List<SurveyPoint> list) throws IOException {
        if (list == null) {
            return;
        }
        c0Var.b();
        for (SurveyPoint surveyPoint : list) {
            String type = surveyPoint.getType();
            type.getClass();
            switch (type) {
                case "SurveyCta":
                    this.ctaPointResponseJsonAdapter.toJson(c0Var, (SurveyCtaSurveyPoint) surveyPoint);
                    break;
                case "SurveyNps":
                    this.npsPointResponseJsonAdapter.toJson(c0Var, (SurveyNpsSurveyPoint) surveyPoint);
                    break;
                case "SurveyForm":
                    this.formResponseAdapter.toJson(c0Var, (SurveyFormSurveyPoint) surveyPoint);
                    break;
                case "SurveyQuestion":
                    this.questionResponseAdapter.toJson(c0Var, (SurveyQuestionSurveyPoint) surveyPoint);
                    break;
            }
        }
        c0Var.i();
    }
}
