package com.survicate.surveys.entities.models;

import br.g;
import br.l;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import mq.b0;
import mq.o;
import mq.p;
import mq.x;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0087@\u0018\u0000 !2\u00020\u0001:\u0001!B8\b\u0016\u0012*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0002\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007B\u001e\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\tJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 \u0088\u0001\u0005\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/survicate/surveys/entities/models/MatrixAnswer;", "", "", "Llq/l;", "", "answerToColumnIds", "constructor-impl", "([Llq/l;)Ljava/util/Map;", "", "(Ljava/util/Map;)Ljava/util/Map;", "answerId", "getColumnValue-impl", "(Ljava/util/Map;J)Ljava/lang/Long;", "getColumnValue", "", "hasColumnValueFor-impl", "(Ljava/util/Map;J)Z", "hasColumnValueFor", "", "toString-impl", "(Ljava/util/Map;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/util/Map;)I", "hashCode", "other", "equals-impl", "(Ljava/util/Map;Ljava/lang/Object;)Z", "equals", "Ljava/util/Map;", "getAnswerToColumnIds", "()Ljava/util/Map;", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MatrixAnswer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<Long, Long> answerToColumnIds;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/survicate/surveys/entities/models/MatrixAnswer$Companion;", "", "()V", "fromRawAnswers", "Lcom/survicate/surveys/entities/models/MatrixAnswer;", "surveyAnswers", "", "Lcom/survicate/surveys/infrastructure/network/SurveyAnswer;", "fromRawAnswers-yWLOJ_k", "(Ljava/util/List;)Ljava/util/Map;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* renamed from: fromRawAnswers-yWLOJ_k, reason: not valid java name */
        public final Map<Long, ? extends Long> m33fromRawAnswersyWLOJ_k(List<SurveyAnswer> surveyAnswers) {
            l.e(surveyAnswers, "surveyAnswers");
            SurveyAnswer surveyAnswer = (SurveyAnswer) o.t0(surveyAnswers);
            if ((surveyAnswer != null ? surveyAnswer.getContent() : null) == null) {
                return MatrixAnswer.m24constructorimpl(x.f16946a);
            }
            int iP = b0.P(p.a0(surveyAnswers, 10));
            if (iP < 16) {
                iP = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
            for (SurveyAnswer surveyAnswer2 : surveyAnswers) {
                Long questionAnswerId = surveyAnswer2.getQuestionAnswerId();
                l.b(questionAnswerId);
                String content = surveyAnswer2.getContent();
                l.b(content);
                linkedHashMap.put(questionAnswerId, Long.valueOf(Long.parseLong(content)));
            }
            return MatrixAnswer.m24constructorimpl(linkedHashMap);
        }

        private Companion() {
        }
    }

    private /* synthetic */ MatrixAnswer(Map map) {
        this.answerToColumnIds = map;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MatrixAnswer m23boximpl(Map map) {
        return new MatrixAnswer(map);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Map<Long, ? extends Long> m24constructorimpl(Map<Long, Long> map) {
        l.e(map, "answerToColumnIds");
        return map;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26equalsimpl(Map<Long, ? extends Long> map, Object obj) {
        return (obj instanceof MatrixAnswer) && l.a(map, ((MatrixAnswer) obj).getAnswerToColumnIds());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27equalsimpl0(Map<Long, ? extends Long> map, Map<Long, ? extends Long> map2) {
        return l.a(map, map2);
    }

    /* renamed from: getColumnValue-impl, reason: not valid java name */
    public static final Long m28getColumnValueimpl(Map<Long, ? extends Long> map, long j) {
        return map.get(Long.valueOf(j));
    }

    /* renamed from: hasColumnValueFor-impl, reason: not valid java name */
    public static final boolean m29hasColumnValueForimpl(Map<Long, ? extends Long> map, long j) {
        return m28getColumnValueimpl(map, j) != null;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30hashCodeimpl(Map<Long, ? extends Long> map) {
        return map.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31toStringimpl(Map<Long, ? extends Long> map) {
        return "MatrixAnswer(answerToColumnIds=" + map + ')';
    }

    public boolean equals(Object obj) {
        return m26equalsimpl(this.answerToColumnIds, obj);
    }

    public final Map<Long, Long> getAnswerToColumnIds() {
        return this.answerToColumnIds;
    }

    public int hashCode() {
        return m30hashCodeimpl(this.answerToColumnIds);
    }

    public String toString() {
        return m31toStringimpl(this.answerToColumnIds);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Map getAnswerToColumnIds() {
        return this.answerToColumnIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Map<Long, ? extends Long> m25constructorimpl(lq.l... lVarArr) {
        x xVarQ;
        l.e(lVarArr, "answerToColumnIds");
        int length = lVarArr.length;
        if (length == 0) {
            xVarQ = x.f16946a;
        } else if (length != 1) {
            ?? linkedHashMap = new LinkedHashMap(b0.P(lVarArr.length));
            b0.U(linkedHashMap, lVarArr);
            xVarQ = linkedHashMap;
        } else {
            xVarQ = b0.Q(lVarArr[0]);
        }
        return m24constructorimpl(xVarQ);
    }
}
