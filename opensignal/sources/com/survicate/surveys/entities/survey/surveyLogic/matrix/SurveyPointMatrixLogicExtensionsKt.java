package com.survicate.surveys.entities.survey.surveyLogic.matrix;

import bf.n;
import br.l;
import com.survicate.surveys.entities.models.MatrixAnswer;
import com.survicate.surveys.entities.survey.surveyLogic.SurveyLogicOperator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import mq.o;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a!\u0010\n\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\n\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"combineResults", "", "acc", "current", "operator", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "evaluateCondition", "Lcom/survicate/surveys/entities/survey/surveyLogic/matrix/SurveyLogicMatrixGroup;", "columnValue", "", "isSatisfiedBy", "answer", "Lcom/survicate/surveys/entities/models/MatrixAnswer;", "isSatisfiedBy-AGWYiuQ", "(Lcom/survicate/surveys/entities/survey/surveyLogic/matrix/SurveyLogicMatrixGroup;Ljava/util/Map;)Z", "Lcom/survicate/surveys/entities/survey/surveyLogic/matrix/SurveyPointMatrixLogic;", "(Lcom/survicate/surveys/entities/survey/surveyLogic/matrix/SurveyPointMatrixLogic;Ljava/util/Map;)Z", "survicate-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurveyPointMatrixLogicExtensionsKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SurveyLogicOperator.values().length];
            try {
                iArr[SurveyLogicOperator.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyLogicOperator.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SurveyLogicMatrixCondition.values().length];
            try {
                iArr2[SurveyLogicMatrixCondition.IS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SurveyLogicMatrixCondition.IS_NOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SurveyLogicMatrixCondition.IS_BETWEEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SurveyLogicMatrixCondition.HAS_ANY_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final boolean combineResults(boolean z10, boolean z11, SurveyLogicOperator surveyLogicOperator) {
        int i10 = surveyLogicOperator == null ? -1 : WhenMappings.$EnumSwitchMapping$0[surveyLogicOperator.ordinal()];
        if (i10 == 1) {
            return z10 && z11;
        }
        if (i10 != 2) {
            return false;
        }
        return z10 || z11;
    }

    private static final boolean evaluateCondition(SurveyLogicMatrixGroup surveyLogicMatrixGroup, long j) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[surveyLogicMatrixGroup.getCondition().ordinal()];
        if (i10 == 1) {
            List<Long> values = surveyLogicMatrixGroup.getValues();
            if (values != null && values.isEmpty()) {
                return false;
            }
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                if (((Number) it.next()).longValue() == j) {
                    return true;
                }
            }
            return false;
        }
        if (i10 == 2) {
            List<Long> values2 = surveyLogicMatrixGroup.getValues();
            if (values2 != null && values2.isEmpty()) {
                return true;
            }
            Iterator<T> it2 = values2.iterator();
            while (it2.hasNext()) {
                if (((Number) it2.next()).longValue() == j) {
                    return false;
                }
            }
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return true;
            }
            throw new n();
        }
        if (surveyLogicMatrixGroup.getValues().size() == 2) {
            long jLongValue = surveyLogicMatrixGroup.getValues().get(0).longValue();
            if (j <= surveyLogicMatrixGroup.getValues().get(1).longValue() && jLongValue <= j) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isSatisfiedBy-AGWYiuQ, reason: not valid java name */
    public static final boolean m35isSatisfiedByAGWYiuQ(SurveyPointMatrixLogic surveyPointMatrixLogic, Map<Long, ? extends Long> map) {
        l.e(surveyPointMatrixLogic, "$this$isSatisfiedBy");
        l.e(map, "answer");
        SurveyLogicOperator groupOperator = surveyPointMatrixLogic.getGroupOperator();
        int i10 = groupOperator == null ? -1 : WhenMappings.$EnumSwitchMapping$0[groupOperator.ordinal()];
        if (i10 == -1) {
            if (surveyPointMatrixLogic.getGroups().size() == 1) {
                return m34isSatisfiedByAGWYiuQ((SurveyLogicMatrixGroup) o.r0(surveyPointMatrixLogic.getGroups()), map);
            }
            return false;
        }
        if (i10 == 1) {
            List<SurveyLogicMatrixGroup> groups = surveyPointMatrixLogic.getGroups();
            if (groups != null && groups.isEmpty()) {
                return true;
            }
            Iterator<T> it = groups.iterator();
            while (it.hasNext()) {
                if (!m34isSatisfiedByAGWYiuQ((SurveyLogicMatrixGroup) it.next(), map)) {
                    return false;
                }
            }
            return true;
        }
        if (i10 != 2) {
            throw new n();
        }
        List<SurveyLogicMatrixGroup> groups2 = surveyPointMatrixLogic.getGroups();
        if (groups2 != null && groups2.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = groups2.iterator();
        while (it2.hasNext()) {
            if (m34isSatisfiedByAGWYiuQ((SurveyLogicMatrixGroup) it2.next(), map)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isSatisfiedBy-AGWYiuQ, reason: not valid java name */
    private static final boolean m34isSatisfiedByAGWYiuQ(SurveyLogicMatrixGroup surveyLogicMatrixGroup, Map<Long, ? extends Long> map) {
        if (surveyLogicMatrixGroup.getCondition() == SurveyLogicMatrixCondition.HAS_ANY_VALUE) {
            return true;
        }
        List<Long> answerIds = surveyLogicMatrixGroup.getAnswerIds();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = answerIds.iterator();
        while (it.hasNext()) {
            Long lM28getColumnValueimpl = MatrixAnswer.m28getColumnValueimpl(map, ((Number) it.next()).longValue());
            Boolean boolValueOf = lM28getColumnValueimpl != null ? Boolean.valueOf(evaluateCondition(surveyLogicMatrixGroup, lM28getColumnValueimpl.longValue())) : null;
            if (boolValueOf != null) {
                arrayList.add(boolValueOf);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            while (it2.hasNext()) {
                next = Boolean.valueOf(combineResults(((Boolean) next).booleanValue(), ((Boolean) it2.next()).booleanValue(), surveyLogicMatrixGroup.getAnswerIdOperator()));
            }
            return ((Boolean) next).booleanValue();
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
