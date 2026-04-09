package com.survicate.surveys.infrastructure.serialization;

import br.l;
import com.survicate.surveys.entities.survey.questions.cta.SurveyCtaSurveyPoint;
import java.util.Map;
import kotlin.Metadata;
import nk.c0;
import nk.n;
import nk.q0;
import nk.r;
import nk.w;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0014\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0012\u0018\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0013\u001a\u00020\rH\u0082\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 ¨\u0006\""}, d2 = {"Lcom/survicate/surveys/infrastructure/serialization/SurveyCtaSurveyPointJsonAdapter;", "Lnk/r;", "Lcom/survicate/surveys/entities/survey/questions/cta/SurveyCtaSurveyPoint;", "Lcom/survicate/surveys/entities/survey/questions/cta/ButtonLinkCtaSettings;", "buttonLinkAdapter", "Lcom/survicate/surveys/entities/survey/questions/cta/ButtonNextCtaSettings;", "buttonNextAdapter", "Lcom/survicate/surveys/entities/survey/questions/cta/ButtonCloseCtaSettings;", "buttonCloseAdapter", "<init>", "(Lnk/r;Lnk/r;Lnk/r;)V", "", "rawPoint", "", "answerType", "Lcom/survicate/surveys/entities/survey/questions/cta/CtaSettings;", "parsePointSettings", "(Ljava/util/Map;Ljava/lang/String;)Lcom/survicate/surveys/entities/survey/questions/cta/CtaSettings;", "T", "key", "parseOrThrow", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Object;", "Lnk/w;", "reader", "fromJson", "(Lnk/w;)Lcom/survicate/surveys/entities/survey/questions/cta/SurveyCtaSurveyPoint;", "Lnk/c0;", "writer", "value", "Llq/b0;", "toJson", "(Lnk/c0;Lcom/survicate/surveys/entities/survey/questions/cta/SurveyCtaSurveyPoint;)V", "Lnk/r;", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurveyCtaSurveyPointJsonAdapter extends r {
    private static final String ANSWER_TYPE_KEY = "answer_type";
    private static final String CONTENT_KEY = "content";
    private static final String DESCRIPTION_KEY = "description";
    private static final String ID_KEY = "id";
    private static final String MAX_PATH_KEY = "max_path";
    private static final String SETTINGS = "settings";
    private static final String TYPE_KEY = "type";
    private final r buttonCloseAdapter;
    private final r buttonLinkAdapter;
    private final r buttonNextAdapter;

    public SurveyCtaSurveyPointJsonAdapter(r rVar, r rVar2, r rVar3) {
        l.e(rVar, "buttonLinkAdapter");
        l.e(rVar2, "buttonNextAdapter");
        l.e(rVar3, "buttonCloseAdapter");
        this.buttonLinkAdapter = rVar;
        this.buttonNextAdapter = rVar2;
        this.buttonCloseAdapter = rVar3;
    }

    private final <T> T parseOrThrow(Map<?, ?> map, String str) {
        map.get(str);
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.survicate.surveys.entities.survey.questions.cta.CtaSettings parsePointSettings(java.util.Map<?, ?> r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "settings"
            java.lang.Object r3 = r3.get(r0)
            boolean r0 = r3 instanceof java.util.Map
            if (r0 == 0) goto Ld
            java.util.Map r3 = (java.util.Map) r3
            goto Le
        Ld:
            r3 = 0
        Le:
            if (r3 == 0) goto L6c
            int r0 = r4.hashCode()
            r1 = -1759645465(0xffffffff971df0e7, float:-5.1033498E-25)
            if (r0 == r1) goto L45
            r1 = -1759589408(0xffffffff971ecbe0, float:-5.130988E-25)
            if (r0 == r1) goto L34
            r1 = 1277344427(0x4c22baab, float:4.2658476E7)
            if (r0 != r1) goto L60
            java.lang.String r0 = "button_close"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L60
            nk.r r4 = r2.buttonCloseAdapter
            java.lang.Object r3 = r4.fromJsonValue(r3)
            com.survicate.surveys.entities.survey.questions.cta.CtaSettings r3 = (com.survicate.surveys.entities.survey.questions.cta.CtaSettings) r3
            goto L55
        L34:
            java.lang.String r0 = "button_next"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L60
            nk.r r4 = r2.buttonNextAdapter
            java.lang.Object r3 = r4.fromJsonValue(r3)
            com.survicate.surveys.entities.survey.questions.cta.CtaSettings r3 = (com.survicate.surveys.entities.survey.questions.cta.CtaSettings) r3
            goto L55
        L45:
            java.lang.String r0 = "button_link"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L60
            nk.r r4 = r2.buttonLinkAdapter
            java.lang.Object r3 = r4.fromJsonValue(r3)
            com.survicate.surveys.entities.survey.questions.cta.CtaSettings r3 = (com.survicate.surveys.entities.survey.questions.cta.CtaSettings) r3
        L55:
            if (r3 == 0) goto L58
            return r3
        L58:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Required value was null."
            r3.<init>(r4)
            throw r3
        L60:
            bf.n r3 = new bf.n
            java.lang.String r0 = "Unsupported answer type: "
            java.lang.String r4 = r0.concat(r4)
            r3.<init>(r4)
            throw r3
        L6c:
            bf.n r3 = new bf.n
            java.lang.String r4 = "Point settings should be an object"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.survicate.surveys.infrastructure.serialization.SurveyCtaSurveyPointJsonAdapter.parsePointSettings(java.util.Map, java.lang.String):com.survicate.surveys.entities.survey.questions.cta.CtaSettings");
    }

    @Override // nk.r
    @n
    public SurveyCtaSurveyPoint fromJson(w reader) {
        l.e(reader, "reader");
        Object objO0 = reader.o0();
        Map<?, ?> map = objO0 instanceof Map ? (Map) objO0 : null;
        if (map == null) {
            throw new bf.n("CTA survey point should be an object");
        }
        Object obj = map.get(ID_KEY);
        if (!(obj instanceof Number)) {
            obj = null;
        }
        Number number = (Number) obj;
        if (number == null) {
            throw new bf.n("Field id is missing or has wrong type");
        }
        long jLongValue = number.longValue();
        Object obj2 = map.get(TYPE_KEY);
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str = (String) obj2;
        if (str == null) {
            throw new bf.n("Field type is missing or has wrong type");
        }
        Object obj3 = map.get(CONTENT_KEY);
        String str2 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = map.get(DESCRIPTION_KEY);
        String str3 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = map.get(MAX_PATH_KEY);
        if (!(obj5 instanceof Number)) {
            obj5 = null;
        }
        Number number2 = (Number) obj5;
        if (number2 == null) {
            throw new bf.n("Field max_path is missing or has wrong type");
        }
        int iIntValue = number2.intValue();
        Object obj6 = map.get(ANSWER_TYPE_KEY);
        String str4 = (String) (obj6 instanceof String ? obj6 : null);
        if (str4 != null) {
            return new SurveyCtaSurveyPoint(jLongValue, str, str2, str3, iIntValue, str4, parsePointSettings(map, str4));
        }
        throw new bf.n("Field answer_type is missing or has wrong type");
    }

    @Override // nk.r
    @q0
    public void toJson(c0 writer, SurveyCtaSurveyPoint value) {
        l.e(writer, "writer");
        throw new UnsupportedOperationException();
    }
}
