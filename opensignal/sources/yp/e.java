package yp;

import bf.n;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.text.SurveyPointTextSettings;
import com.survicate.surveys.entities.survey.surveyLogic.SurveyLogicOperator;
import com.survicate.surveys.entities.survey.surveyLogic.text.SurveyLogicTextCondition;
import com.survicate.surveys.entities.survey.surveyLogic.text.SurveyPointTextLogic;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import dv.h;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import mq.o;
import un.i;
import wo.f;

/* loaded from: classes.dex */
public final class e extends f {
    @Override // wo.f
    public final wo.e j(List list) {
        Object next;
        l.e(list, "answers");
        if (list.size() != 1) {
            throw new IllegalArgumentException("The answers list must contain exactly one item, even if it's an empty fallback answer.");
        }
        String content = ((SurveyAnswer) o.r0(list)).getContent();
        SurveyQuestionSurveyPoint surveyQuestionSurveyPoint = (SurveyQuestionSurveyPoint) this.f24574a;
        long id2 = surveyQuestionSurveyPoint.getId();
        String str = content == null ? "" : content;
        this.f24578e.getClass();
        this.f24577d.d(new uo.b(id2, e5.H(str), new i(id2, str)));
        SurveyQuestionPointSettings settings = surveyQuestionSurveyPoint.getSettings();
        l.c(settings, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.text.SurveyPointTextSettings");
        List<SurveyPointTextLogic> logic = ((SurveyPointTextSettings) settings).getLogic();
        this.f24575b.f24558i.getClass();
        l.e(logic, "logics");
        Iterator it = o.M0(logic, new h(21)).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            SurveyPointTextLogic surveyPointTextLogic = (SurveyPointTextLogic) next;
            SurveyLogicTextCondition condition = surveyPointTextLogic.getCondition();
            if (condition != null) {
                int i10 = qn.a.f20940b[condition.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                if (content == null || tt.l.D0(content)) {
                                    break;
                                }
                            } else {
                                if (i10 != 5) {
                                    throw new n();
                                }
                            }
                        } else {
                            if (content != null && (!tt.l.D0(content))) {
                                break;
                            }
                        }
                    } else {
                        SurveyLogicOperator operator = surveyPointTextLogic.getOperator();
                        int i11 = operator == null ? -1 : qn.a.f20939a[operator.ordinal()];
                        if (i11 == -1) {
                            continue;
                        } else {
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    throw new n();
                                }
                                List<String> values = surveyPointTextLogic.getValues();
                                if (values != null && values.isEmpty()) {
                                    break;
                                }
                                for (String str2 : values) {
                                    if (content != null) {
                                        Locale locale = Locale.ROOT;
                                        String lowerCase = content.toLowerCase(locale);
                                        l.d(lowerCase, "toLowerCase(...)");
                                        String lowerCase2 = str2.toLowerCase(locale);
                                        l.d(lowerCase2, "toLowerCase(...)");
                                        if (!tt.l.q0(lowerCase, lowerCase2, false)) {
                                        }
                                    }
                                }
                                break loop0;
                            }
                            List<String> values2 = surveyPointTextLogic.getValues();
                            if (values2 == null || !values2.isEmpty()) {
                                for (String str3 : values2) {
                                    if (content != null) {
                                        Locale locale2 = Locale.ROOT;
                                        String lowerCase3 = content.toLowerCase(locale2);
                                        l.d(lowerCase3, "toLowerCase(...)");
                                        String lowerCase4 = str3.toLowerCase(locale2);
                                        l.d(lowerCase4, "toLowerCase(...)");
                                        if (!tt.l.q0(lowerCase3, lowerCase4, false)) {
                                            break loop0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    SurveyLogicOperator operator2 = surveyPointTextLogic.getOperator();
                    int i12 = operator2 == null ? -1 : qn.a.f20939a[operator2.ordinal()];
                    if (i12 == -1) {
                        continue;
                    } else {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                throw new n();
                            }
                            List<String> values3 = surveyPointTextLogic.getValues();
                            if (values3 != null && values3.isEmpty()) {
                                break;
                            }
                            for (String str4 : values3) {
                                if (content != null) {
                                    Locale locale3 = Locale.ROOT;
                                    String lowerCase5 = content.toLowerCase(locale3);
                                    l.d(lowerCase5, "toLowerCase(...)");
                                    String lowerCase6 = str4.toLowerCase(locale3);
                                    l.d(lowerCase6, "toLowerCase(...)");
                                    if (tt.l.q0(lowerCase5, lowerCase6, false)) {
                                    }
                                }
                            }
                            break loop0;
                        }
                        List<String> values4 = surveyPointTextLogic.getValues();
                        if (values4 == null || !values4.isEmpty()) {
                            for (String str5 : values4) {
                                if (content != null) {
                                    Locale locale4 = Locale.ROOT;
                                    String lowerCase7 = content.toLowerCase(locale4);
                                    l.d(lowerCase7, "toLowerCase(...)");
                                    String lowerCase8 = str5.toLowerCase(locale4);
                                    l.d(lowerCase8, "toLowerCase(...)");
                                    if (tt.l.q0(lowerCase7, lowerCase8, false)) {
                                        break loop0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        SurveyPointTextLogic surveyPointTextLogic2 = (SurveyPointTextLogic) next;
        return new wo.e(list, surveyPointTextLogic2 != null ? Long.valueOf(surveyPointTextLogic2.getGoTo()) : null, surveyQuestionSurveyPoint.getId());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.util.List r5, rq.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof yp.d
            if (r0 == 0) goto L13
            r0 = r6
            yp.d r0 = (yp.d) r0
            int r1 = r0.f26414y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26414y = r1
            goto L18
        L13:
            yp.d r0 = new yp.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f26412r
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.f26414y
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            lf.t1.G(r6)
            goto L6c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            lf.t1.G(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r2 = 10
            int r2 = mq.p.a0(r5, r2)
            r6.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L41:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r5.next()
            com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextAdapterItem r2 = (com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextAdapterItem) r2
            com.survicate.surveys.infrastructure.network.ai.FollowUpDialog r2 = com.survicate.surveys.infrastructure.network.ai.FollowUpQuestionRequestBodyKt.toFollowUpDialog(r2)
            r6.add(r2)
            goto L41
        L55:
            wo.d r5 = r4.f24575b
            com.survicate.surveys.entities.survey.Survey r5 = r5.f24562o
            if (r5 == 0) goto L60
            java.lang.String r5 = r5.getLanguageCode()
            goto L61
        L60:
            r5 = 0
        L61:
            r0.f26414y = r3
            com.survicate.surveys.infrastructure.network.ai.FollowUpQuestionRepository r2 = r4.f24579f
            java.lang.Object r6 = r2.requestFollowUpQuestion(r6, r5, r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L7d
            boolean r5 = tt.l.D0(r6)
            if (r5 == 0) goto L77
            goto L7d
        L77:
            yp.b r5 = new yp.b
            r5.<init>(r6)
            return r5
        L7d:
            yp.a r5 = yp.a.f26410a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yp.e.k(java.util.List, rq.c):java.lang.Object");
    }
}
