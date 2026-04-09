package com.survicate.surveys.infrastructure.serialization;

import br.l;
import com.survicate.surveys.entities.survey.SurveyAnswerType;
import com.survicate.surveys.entities.survey.surveyLogic.display.DisplayLogic;
import g4.j;
import java.util.Map;
import kotlin.Metadata;
import nk.c0;
import nk.n;
import nk.q0;
import nk.r;
import nk.w;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bi\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0001\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0001\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/survicate/surveys/infrastructure/serialization/DisplayLogicJsonAdapter;", "Lnk/r;", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/DisplayLogic;", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/TextDisplayLogic;", "textDisplayLogicAdapter", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/DateDisplayLogic;", "dateDisplayLogicAdapter", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/RangeDisplayLogic;", "rangeDisplayLogicAdapter", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/SingleChoiceDisplayLogic;", "singleChoiceDisplayLogicAdapter", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/MultipleChoiceDisplayLogic;", "multipleChoiceDisplayLogicAdapter", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/MatrixDisplayLogic;", "matrixDisplayLogicAdapter", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/FormDisplayLogic;", "formDisplayLogicAdapter", "<init>", "(Lnk/r;Lnk/r;Lnk/r;Lnk/r;Lnk/r;Lnk/r;Lnk/r;)V", "Lnk/w;", "reader", "fromJson", "(Lnk/w;)Lcom/survicate/surveys/entities/survey/surveyLogic/display/DisplayLogic;", "Lnk/c0;", "p0", "p1", "Llq/b0;", "toJson", "(Lnk/c0;Lcom/survicate/surveys/entities/survey/surveyLogic/display/DisplayLogic;)V", "Lnk/r;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DisplayLogicJsonAdapter extends r {
    private final r dateDisplayLogicAdapter;
    private final r formDisplayLogicAdapter;
    private final r matrixDisplayLogicAdapter;
    private final r multipleChoiceDisplayLogicAdapter;
    private final r rangeDisplayLogicAdapter;
    private final r singleChoiceDisplayLogicAdapter;
    private final r textDisplayLogicAdapter;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyAnswerType.values().length];
            try {
                iArr[SurveyAnswerType.SMILEY_SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyAnswerType.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyAnswerType.MULTIPLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SurveyAnswerType.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SurveyAnswerType.DATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SurveyAnswerType.CSAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SurveyAnswerType.NUMERICAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SurveyAnswerType.SHAPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SurveyAnswerType.MATRIX.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SurveyAnswerType.NPS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SurveyAnswerType.FORM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SurveyAnswerType.BUTTON_NEXT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SurveyAnswerType.BUTTON_CLOSE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SurveyAnswerType.BUTTON_LINK.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DisplayLogicJsonAdapter(r rVar, r rVar2, r rVar3, r rVar4, r rVar5, r rVar6, r rVar7) {
        l.e(rVar, "textDisplayLogicAdapter");
        l.e(rVar2, "dateDisplayLogicAdapter");
        l.e(rVar3, "rangeDisplayLogicAdapter");
        l.e(rVar4, "singleChoiceDisplayLogicAdapter");
        l.e(rVar5, "multipleChoiceDisplayLogicAdapter");
        l.e(rVar6, "matrixDisplayLogicAdapter");
        l.e(rVar7, "formDisplayLogicAdapter");
        this.textDisplayLogicAdapter = rVar;
        this.dateDisplayLogicAdapter = rVar2;
        this.rangeDisplayLogicAdapter = rVar3;
        this.singleChoiceDisplayLogicAdapter = rVar4;
        this.multipleChoiceDisplayLogicAdapter = rVar5;
        this.matrixDisplayLogicAdapter = rVar6;
        this.formDisplayLogicAdapter = rVar7;
    }

    @Override // nk.r
    @n
    public DisplayLogic fromJson(w reader) {
        l.e(reader, "reader");
        Object objO0 = reader.o0();
        l.c(objO0, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        Map map = (Map) objO0;
        Object obj = map.get("answer_type");
        l.c(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        SurveyAnswerType surveyAnswerTypeFromString = SurveyAnswerType.INSTANCE.fromString(str);
        switch (surveyAnswerTypeFromString == null ? -1 : WhenMappings.$EnumSwitchMapping$0[surveyAnswerTypeFromString.ordinal()]) {
            case -1:
                throw new bf.n("Unknown answer type: ".concat(str));
            case 0:
            default:
                throw new bf.n();
            case 1:
                return (DisplayLogic) this.rangeDisplayLogicAdapter.fromJsonValue(map);
            case 2:
                return (DisplayLogic) this.singleChoiceDisplayLogicAdapter.fromJsonValue(map);
            case 3:
                return (DisplayLogic) this.multipleChoiceDisplayLogicAdapter.fromJsonValue(map);
            case 4:
                return (DisplayLogic) this.textDisplayLogicAdapter.fromJsonValue(map);
            case j.STRING_FIELD_NUMBER /* 5 */:
                return (DisplayLogic) this.dateDisplayLogicAdapter.fromJsonValue(map);
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return (DisplayLogic) this.rangeDisplayLogicAdapter.fromJsonValue(map);
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return (DisplayLogic) this.rangeDisplayLogicAdapter.fromJsonValue(map);
            case j.BYTES_FIELD_NUMBER /* 8 */:
                return (DisplayLogic) this.rangeDisplayLogicAdapter.fromJsonValue(map);
            case 9:
                return (DisplayLogic) this.matrixDisplayLogicAdapter.fromJsonValue(map);
            case 10:
                return (DisplayLogic) this.rangeDisplayLogicAdapter.fromJsonValue(map);
            case 11:
                return (DisplayLogic) this.formDisplayLogicAdapter.fromJsonValue(map);
            case 12:
                throw new UnsupportedOperationException("Button next is not supported");
            case 13:
                throw new UnsupportedOperationException("Button close is not supported");
            case 14:
                throw new UnsupportedOperationException("Button link is not supported");
        }
    }

    @Override // nk.r
    @q0
    public void toJson(c0 p02, DisplayLogic p12) {
        l.e(p02, "p0");
        throw new UnsupportedOperationException();
    }
}
