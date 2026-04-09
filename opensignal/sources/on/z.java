package on;

import com.survicate.surveys.infrastructure.network.SurveyAnswer;

/* loaded from: classes.dex */
public final class z extends br.n implements ar.k {

    /* renamed from: g, reason: collision with root package name */
    public static final z f19657g = new z(1, 0);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i10, int i11) {
        super(i10);
        this.f19658d = i11;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f19658d) {
            case 0:
                SurveyAnswer surveyAnswer = (SurveyAnswer) obj;
                br.l.e(surveyAnswer, "answer");
                return w.g.g(surveyAnswer.getAnswerType(), ": ", surveyAnswer.getContent());
            case 1:
                SurveyAnswer surveyAnswer2 = (SurveyAnswer) obj;
                br.l.e(surveyAnswer2, "answer");
                String comment = surveyAnswer2.getComment();
                StringBuilder sb2 = new StringBuilder();
                String answer = surveyAnswer2.getAnswer();
                if (answer == null) {
                    answer = "";
                }
                sb2.append(answer);
                sb2.append(comment != null ? ": ".concat(comment) : "");
                return sb2.toString();
            default:
                SurveyAnswer surveyAnswer3 = (SurveyAnswer) obj;
                br.l.e(surveyAnswer3, "answer");
                String comment2 = surveyAnswer3.getComment();
                String strG = comment2 != null ? h0.b.g(')', " (", comment2) : null;
                if (strG == null) {
                    strG = "";
                }
                return surveyAnswer3.getMatrixGroupName() + ": " + surveyAnswer3.getMatrixColumnName() + strG;
        }
    }
}
