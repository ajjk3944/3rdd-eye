package zo;

import ar.k;
import br.l;
import br.n;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.presentation.csat.micro.MicroSurveyPointCsatView;
import ht.x;
import java.util.List;
import lq.b0;
import ur.q0;

/* loaded from: classes.dex */
public final class f extends n implements k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27488d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f27489g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, Object obj) {
        super(1);
        this.f27488d = i10;
        this.f27489g = obj;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        int i10 = this.f27488d;
        Object obj2 = this.f27489g;
        switch (i10) {
            case 0:
                SurveyAnswer surveyAnswer = (SurveyAnswer) obj;
                l.e(surveyAnswer, "answer");
                MicroSurveyPointCsatView microSurveyPointCsatView = (MicroSurveyPointCsatView) obj2;
                List listH = e5.H(surveyAnswer);
                int i11 = MicroSurveyPointCsatView.J;
                wo.g gVarC = microSurveyPointCsatView.c(listH);
                ar.n onAnswerSelected = microSurveyPointCsatView.getOnAnswerSelected();
                if (onAnswerSelected != null) {
                    onAnswerSelected.w(gVarC, Boolean.valueOf(MicroSurveyPointCsatView.a(microSurveyPointCsatView)));
                }
                return b0.f15562a;
            default:
                rr.d dVar = (rr.d) obj;
                l.e(dVar, "it");
                x type = ((q0) dVar.Y().get(((q0) obj2).B)).getType();
                l.d(type, "it.valueParameters[p.index].type");
                return type;
        }
    }
}
