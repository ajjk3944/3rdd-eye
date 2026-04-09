package np;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import br.l;
import com.survicate.surveys.entities.models.SurvicateNpsAnswerOption;
import com.survicate.surveys.entities.survey.questions.nps.SurveyNpsPointSettings;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import h7.n1;
import on.t;

/* loaded from: classes.dex */
public final class g extends e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18481i;
    public final SurveyNpsPointSettings j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i10, SurveyNpsPointSettings surveyNpsPointSettings, MicroColorScheme microColorScheme) {
        super(microColorScheme);
        this.f18481i = i10;
        switch (i10) {
            case 1:
                l.e(microColorScheme, "colorScheme");
                l.e(surveyNpsPointSettings, "pointSettings");
                super(microColorScheme);
                this.j = surveyNpsPointSettings;
                break;
            default:
                l.e(microColorScheme, "colorScheme");
                l.e(surveyNpsPointSettings, "pointSettings");
                this.j = surveyNpsPointSettings;
                break;
        }
    }

    @Override // h7.q0
    public final void j(n1 n1Var, int i10) {
        switch (this.f18481i) {
            case 0:
                f fVar = (f) n1Var;
                SurvicateNpsAnswerOption survicateNpsAnswerOption = (SurvicateNpsAnswerOption) ((sq.b) ((sq.a) this.f18476f)).get(i10);
                bq.g gVar = (bq.g) this.f18478h;
                TextView textView = fVar.f18479u;
                View view = fVar.f10155a;
                l.e(survicateNpsAnswerOption, "item");
                g gVar2 = fVar.f18480v;
                boolean z10 = ((SurvicateNpsAnswerOption) gVar2.f18477g) == survicateNpsAnswerOption;
                view.setSelected(z10);
                Context context = view.getContext();
                l.d(context, "getContext(...)");
                view.setBackground(vc.e.n(context, gVar2.f18475e, z10));
                textView.setText(String.valueOf(survicateNpsAnswerOption.getValue()));
                textView.setContentDescription(e.r(survicateNpsAnswerOption, gVar2.j));
                view.setOnClickListener(new hn.c(gVar2, survicateNpsAnswerOption, gVar, 1));
                break;
            default:
                j jVar = (j) n1Var;
                SurvicateNpsAnswerOption survicateNpsAnswerOption2 = (SurvicateNpsAnswerOption) ((sq.b) ((sq.a) this.f18476f)).get(i10);
                bq.g gVar3 = (bq.g) this.f18478h;
                View view2 = jVar.f10155a;
                l.e(survicateNpsAnswerOption2, "item");
                g gVar4 = jVar.f18486v;
                boolean z11 = ((SurvicateNpsAnswerOption) gVar4.f18477g) == survicateNpsAnswerOption2;
                view2.setSelected(z11);
                Context context2 = view2.getContext();
                l.d(context2, "getContext(...)");
                view2.setBackground(vc.e.n(context2, gVar4.f18475e, z11));
                jVar.f18485u.setText(e.r(survicateNpsAnswerOption2, gVar4.j));
                view2.setOnClickListener(new hn.c(gVar4, survicateNpsAnswerOption2, gVar3, 3));
                break;
        }
    }

    @Override // h7.q0
    public final n1 k(ViewGroup viewGroup, int i10) {
        switch (this.f18481i) {
            case 0:
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(t.item_micro_nps_horizontal, viewGroup, false);
                l.b(viewInflate);
                return new f(this, viewInflate, this.f18475e);
            default:
                View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(t.item_micro_nps_vertical, viewGroup, false);
                l.b(viewInflate2);
                return new j(this, viewInflate2, this.f18475e);
        }
    }
}
