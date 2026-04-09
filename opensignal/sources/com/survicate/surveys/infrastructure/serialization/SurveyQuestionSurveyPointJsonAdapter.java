package com.survicate.surveys.infrastructure.serialization;

import bf.n;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import mq.p;
import nk.c0;
import nk.q0;
import nk.r;
import nk.w;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00017B\u0093\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0001\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0001\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0001\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\u000e\u0010\u001a\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u000e\u0010\u001a\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020!2\u000e\u0010\u001a\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0019H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u001e2\u000e\u0010\u001a\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0019H\u0002¢\u0006\u0004\b$\u0010 J%\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030%2\u000e\u0010\u001a\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0019H\u0002¢\u0006\u0004\b&\u0010'J'\u0010*\u001a\u00020)2\u000e\u0010\u001a\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00192\u0006\u0010(\u001a\u00020\u001eH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H\u0017¢\u0006\u0004\b.\u0010/J!\u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\b\u00102\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b4\u00105R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00106R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00106R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00106R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00106R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00106R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00106R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00106R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00106R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00106R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00106¨\u00068"}, d2 = {"Lcom/survicate/surveys/infrastructure/serialization/SurveyQuestionSurveyPointJsonAdapter;", "Lnk/r;", "Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;", "Lcom/survicate/surveys/entities/survey/questions/question/QuestionPointAnswer;", "questionPointAnswerAdapter", "Lcom/survicate/surveys/entities/survey/questions/question/matrix/SurveyPointMatrixSettings;", "matrixSettingsAdapter", "Lcom/survicate/surveys/entities/survey/questions/question/date/SurveyPointDateSettings;", "dateSettingsAdapter", "Lcom/survicate/surveys/entities/survey/questions/question/multiple/SurveyPointMultipleSettings;", "multipleSettingsAdapter", "Lcom/survicate/surveys/entities/survey/questions/question/rating/csat/SurveyPointCsatSettings;", "csatSettingsAdapter", "Lcom/survicate/surveys/entities/survey/questions/question/rating/numerical/SurveyPointNumericalSettings;", "numericalSettingsAdapter", "Lcom/survicate/surveys/entities/survey/questions/question/rating/shape/SurveyPointShapeSettings;", "shapeSettingsAdapter", "Lcom/survicate/surveys/entities/survey/questions/question/single/SurveyPointSingleSettings;", "singleSettingsAdapter", "Lcom/survicate/surveys/entities/survey/questions/question/smileyScale/SurveyPointSmileyScaleSettings;", "smileyScaleSettingsAdapter", "Lcom/survicate/surveys/entities/survey/questions/question/text/SurveyPointTextSettings;", "textSettingsAdapter", "<init>", "(Lnk/r;Lnk/r;Lnk/r;Lnk/r;Lnk/r;Lnk/r;Lnk/r;Lnk/r;Lnk/r;Lnk/r;)V", "", "rawPoint", "", "parseId", "(Ljava/util/Map;)J", "", "parseType", "(Ljava/util/Map;)Ljava/lang/String;", "", "parseMaxPath", "(Ljava/util/Map;)I", "parseAnswerType", "", "parseAnswerList", "(Ljava/util/Map;)Ljava/util/List;", "answerType", "Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionPointSettings;", "parsePointSettings", "(Ljava/util/Map;Ljava/lang/String;)Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionPointSettings;", "Lnk/w;", "reader", "fromJson", "(Lnk/w;)Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;", "Lnk/c0;", "writer", "value", "Llq/b0;", "toJson", "(Lnk/c0;Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;)V", "Lnk/r;", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurveyQuestionSurveyPointJsonAdapter extends r {
    private static final String ANSWERS_KEY = "answers";
    private static final String ANSWER_TYPE_KEY = "answer_type";
    private static final String CONTENT_KEY = "content";
    private static final String DESCRIPTION_KEY = "description";
    private static final String ID_KEY = "id";
    private static final String MAX_PATH_KEY = "max_path";
    private static final String SETTINGS = "settings";
    private static final String TYPE_KEY = "type";
    private final r csatSettingsAdapter;
    private final r dateSettingsAdapter;
    private final r matrixSettingsAdapter;
    private final r multipleSettingsAdapter;
    private final r numericalSettingsAdapter;
    private final r questionPointAnswerAdapter;
    private final r shapeSettingsAdapter;
    private final r singleSettingsAdapter;
    private final r smileyScaleSettingsAdapter;
    private final r textSettingsAdapter;
    private static final List<String> supportedAnswerTypes = e5.I("smiley_scale", "single", "multiple", "text", "date", "csat", "numerical_scale", "rating", "matrix");

    public SurveyQuestionSurveyPointJsonAdapter(r rVar, r rVar2, r rVar3, r rVar4, r rVar5, r rVar6, r rVar7, r rVar8, r rVar9, r rVar10) {
        l.e(rVar, "questionPointAnswerAdapter");
        l.e(rVar2, "matrixSettingsAdapter");
        l.e(rVar3, "dateSettingsAdapter");
        l.e(rVar4, "multipleSettingsAdapter");
        l.e(rVar5, "csatSettingsAdapter");
        l.e(rVar6, "numericalSettingsAdapter");
        l.e(rVar7, "shapeSettingsAdapter");
        l.e(rVar8, "singleSettingsAdapter");
        l.e(rVar9, "smileyScaleSettingsAdapter");
        l.e(rVar10, "textSettingsAdapter");
        this.questionPointAnswerAdapter = rVar;
        this.matrixSettingsAdapter = rVar2;
        this.dateSettingsAdapter = rVar3;
        this.multipleSettingsAdapter = rVar4;
        this.csatSettingsAdapter = rVar5;
        this.numericalSettingsAdapter = rVar6;
        this.shapeSettingsAdapter = rVar7;
        this.singleSettingsAdapter = rVar8;
        this.smileyScaleSettingsAdapter = rVar9;
        this.textSettingsAdapter = rVar10;
    }

    private final List<QuestionPointAnswer> parseAnswerList(Map<?, ?> rawPoint) {
        Object obj = rawPoint.get(ANSWERS_KEY);
        List list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            throw new n("Answer list is missing");
        }
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            QuestionPointAnswer questionPointAnswer = (QuestionPointAnswer) this.questionPointAnswerAdapter.fromJsonValue(it.next());
            if (questionPointAnswer == null) {
                throw new n("Point answer should be non-null");
            }
            arrayList.add(questionPointAnswer);
        }
        return arrayList;
    }

    private final String parseAnswerType(Map<?, ?> rawPoint) {
        Object obj = rawPoint.get(ANSWER_TYPE_KEY);
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            throw new n("Answer type is missing");
        }
        if (supportedAnswerTypes.contains(str)) {
            return str;
        }
        throw new n("Unsupported answer type: ".concat(str));
    }

    private final long parseId(Map<?, ?> rawPoint) {
        Object obj = rawPoint.get(ID_KEY);
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return number.longValue();
        }
        throw new n("Point ID is missing");
    }

    private final int parseMaxPath(Map<?, ?> rawPoint) {
        Object obj = rawPoint.get(MAX_PATH_KEY);
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return number.intValue();
        }
        throw new n("Missing max path");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings parsePointSettings(java.util.Map<?, ?> r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "settings"
            java.lang.Object r2 = r2.get(r0)
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto Ld
            java.util.Map r2 = (java.util.Map) r2
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 == 0) goto Lca
            int r0 = r3.hashCode()
            switch(r0) {
                case -1710937533: goto La3;
                case -1081239615: goto L92;
                case -938102371: goto L81;
                case -902265784: goto L70;
                case 3062947: goto L5f;
                case 3076014: goto L4e;
                case 3556653: goto L3d;
                case 653829648: goto L2b;
                case 1047773692: goto L19;
                default: goto L17;
            }
        L17:
            goto Lbe
        L19:
            java.lang.String r0 = "smiley_scale"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lbe
            nk.r r3 = r1.smileyScaleSettingsAdapter
            java.lang.Object r2 = r3.fromJsonValue(r2)
            com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings r2 = (com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings) r2
            goto Lb3
        L2b:
            java.lang.String r0 = "multiple"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lbe
            nk.r r3 = r1.multipleSettingsAdapter
            java.lang.Object r2 = r3.fromJsonValue(r2)
            com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings r2 = (com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings) r2
            goto Lb3
        L3d:
            java.lang.String r0 = "text"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lbe
            nk.r r3 = r1.textSettingsAdapter
            java.lang.Object r2 = r3.fromJsonValue(r2)
            com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings r2 = (com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings) r2
            goto Lb3
        L4e:
            java.lang.String r0 = "date"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lbe
            nk.r r3 = r1.dateSettingsAdapter
            java.lang.Object r2 = r3.fromJsonValue(r2)
            com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings r2 = (com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings) r2
            goto Lb3
        L5f:
            java.lang.String r0 = "csat"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lbe
            nk.r r3 = r1.csatSettingsAdapter
            java.lang.Object r2 = r3.fromJsonValue(r2)
            com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings r2 = (com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings) r2
            goto Lb3
        L70:
            java.lang.String r0 = "single"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lbe
            nk.r r3 = r1.singleSettingsAdapter
            java.lang.Object r2 = r3.fromJsonValue(r2)
            com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings r2 = (com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings) r2
            goto Lb3
        L81:
            java.lang.String r0 = "rating"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lbe
            nk.r r3 = r1.shapeSettingsAdapter
            java.lang.Object r2 = r3.fromJsonValue(r2)
            com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings r2 = (com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings) r2
            goto Lb3
        L92:
            java.lang.String r0 = "matrix"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lbe
            nk.r r3 = r1.matrixSettingsAdapter
            java.lang.Object r2 = r3.fromJsonValue(r2)
            com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings r2 = (com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings) r2
            goto Lb3
        La3:
            java.lang.String r0 = "numerical_scale"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lbe
            nk.r r3 = r1.numericalSettingsAdapter
            java.lang.Object r2 = r3.fromJsonValue(r2)
            com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings r2 = (com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings) r2
        Lb3:
            if (r2 == 0) goto Lb6
            return r2
        Lb6:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Required value was null."
            r2.<init>(r3)
            throw r2
        Lbe:
            bf.n r2 = new bf.n
            java.lang.String r0 = "Unsupported answer type: "
            java.lang.String r3 = r0.concat(r3)
            r2.<init>(r3)
            throw r2
        Lca:
            bf.n r2 = new bf.n
            java.lang.String r3 = "Point settings should be an object"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.survicate.surveys.infrastructure.serialization.SurveyQuestionSurveyPointJsonAdapter.parsePointSettings(java.util.Map, java.lang.String):com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings");
    }

    private final String parseType(Map<?, ?> rawPoint) {
        Object obj = rawPoint.get(TYPE_KEY);
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            return str;
        }
        throw new n("Point type is missing");
    }

    @Override // nk.r
    @nk.n
    public SurveyQuestionSurveyPoint fromJson(w reader) {
        l.e(reader, "reader");
        Object objO0 = reader.o0();
        Map<?, ?> map = objO0 instanceof Map ? (Map) objO0 : null;
        if (map == null) {
            throw new n("Question point should be an object");
        }
        long id2 = parseId(map);
        String type = parseType(map);
        Object obj = map.get(CONTENT_KEY);
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get(DESCRIPTION_KEY);
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        int maxPath = parseMaxPath(map);
        String answerType = parseAnswerType(map);
        return new SurveyQuestionSurveyPoint(id2, type, str, str2, maxPath, answerType, parseAnswerList(map), parsePointSettings(map, answerType));
    }

    @Override // nk.r
    @q0
    public void toJson(c0 writer, SurveyQuestionSurveyPoint value) {
        l.e(writer, "writer");
        throw new UnsupportedOperationException();
    }
}
