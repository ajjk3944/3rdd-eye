package qp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import br.l;
import com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer;
import com.survicate.surveys.entities.survey.questions.question.rating.numerical.SurveyPointNumericalSettings;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import h7.n1;
import java.util.List;
import np.e;
import on.t;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20951i;
    public final SurveyPointNumericalSettings j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List list, MicroColorScheme microColorScheme, SurveyPointNumericalSettings surveyPointNumericalSettings, int i10) {
        super(list, microColorScheme);
        this.f20951i = i10;
        switch (i10) {
            case 1:
                l.e(list, "items");
                l.e(microColorScheme, "colorScheme");
                l.e(surveyPointNumericalSettings, "pointSettings");
                super(list, microColorScheme);
                this.j = surveyPointNumericalSettings;
                break;
            default:
                l.e(list, "items");
                l.e(microColorScheme, "colorScheme");
                l.e(surveyPointNumericalSettings, "pointSettings");
                this.j = surveyPointNumericalSettings;
                break;
        }
    }

    @Override // h7.q0
    public final void j(n1 n1Var, int i10) {
        switch (this.f20951i) {
            case 0:
                a aVar = (a) n1Var;
                QuestionPointAnswer questionPointAnswer = (QuestionPointAnswer) this.f18476f.get(i10);
                io.sentry.android.replay.capture.e eVar = (io.sentry.android.replay.capture.e) this.f18478h;
                l.e(questionPointAnswer, "item");
                b bVar = aVar.f20950v;
                boolean zA = l.a((QuestionPointAnswer) bVar.f18477g, questionPointAnswer);
                View view = aVar.f10155a;
                view.setSelected(zA);
                Context context = view.getContext();
                l.d(context, "getContext(...)");
                view.setBackground(vc.e.n(context, bVar.f18475e, zA));
                TextView textView = aVar.f20949u;
                textView.setText(questionPointAnswer.getPossibleAnswer());
                textView.setContentDescription(bVar.s(questionPointAnswer, bVar.j));
                view.setOnClickListener(new hn.c(bVar, questionPointAnswer, eVar, 4));
                break;
            default:
                c cVar = (c) n1Var;
                QuestionPointAnswer questionPointAnswer2 = (QuestionPointAnswer) this.f18476f.get(i10);
                io.sentry.android.replay.capture.e eVar2 = (io.sentry.android.replay.capture.e) this.f18478h;
                l.e(questionPointAnswer2, "item");
                b bVar2 = cVar.f20953v;
                boolean zA2 = l.a((QuestionPointAnswer) bVar2.f18477g, questionPointAnswer2);
                View view2 = cVar.f10155a;
                view2.setSelected(zA2);
                Context context2 = view2.getContext();
                l.d(context2, "getContext(...)");
                view2.setBackground(vc.e.n(context2, bVar2.f18475e, zA2));
                cVar.f20952u.setText(bVar2.s(questionPointAnswer2, bVar2.j));
                view2.setOnClickListener(new hn.c(bVar2, questionPointAnswer2, eVar2, 5));
                break;
        }
    }

    @Override // h7.q0
    public final n1 k(ViewGroup viewGroup, int i10) {
        switch (this.f20951i) {
            case 0:
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(t.item_micro_numerical_horizontal, viewGroup, false);
                l.b(viewInflate);
                return new a(this, viewInflate, this.f18475e);
            default:
                View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(t.item_micro_numerical_vertical, viewGroup, false);
                l.b(viewInflate2);
                return new c(this, viewInflate2, this.f18475e);
        }
    }
}
