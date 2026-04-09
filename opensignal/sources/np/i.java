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
import java.util.List;
import on.t;

/* loaded from: classes.dex */
public final class i extends e {

    /* renamed from: i, reason: collision with root package name */
    public final int f18484i;
    public final SurveyNpsPointSettings j;
    public final List k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i10, SurveyNpsPointSettings surveyNpsPointSettings, MicroColorScheme microColorScheme) {
        super(microColorScheme);
        l.e(microColorScheme, "colorScheme");
        l.e(surveyNpsPointSettings, "pointSettings");
        this.f18484i = i10;
        this.j = surveyNpsPointSettings;
        this.k = SurvicateNpsAnswerOption.INSTANCE.getPortraitHorizontalAnswers();
    }

    @Override // h7.q0
    public final void j(n1 n1Var, int i10) {
        h hVar = (h) n1Var;
        SurvicateNpsAnswerOption survicateNpsAnswerOption = (SurvicateNpsAnswerOption) this.k.get(i10);
        bq.g gVar = (bq.g) this.f18478h;
        TextView textView = hVar.f18482u;
        View view = hVar.f10155a;
        l.e(survicateNpsAnswerOption, "item");
        i iVar = hVar.f18483v;
        boolean z10 = ((SurvicateNpsAnswerOption) iVar.f18477g) == survicateNpsAnswerOption;
        view.setSelected(z10);
        Context context = view.getContext();
        l.d(context, "getContext(...)");
        view.setBackground(vc.e.n(context, iVar.f18475e, z10));
        textView.setText(String.valueOf(survicateNpsAnswerOption.getValue()));
        textView.setContentDescription(e.r(survicateNpsAnswerOption, iVar.j));
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i11 = iVar.f18484i;
        layoutParams.width = i11;
        layoutParams.height = i11;
        textView.setLayoutParams(layoutParams);
        view.setOnClickListener(new hn.c(iVar, survicateNpsAnswerOption, gVar, 2));
    }

    @Override // h7.q0
    public final n1 k(ViewGroup viewGroup, int i10) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(t.item_micro_nps_portrait_horizontal, viewGroup, false);
        l.b(viewInflate);
        return new h(this, viewInflate, this.f18475e);
    }

    @Override // np.e
    public final List q() {
        return this.k;
    }
}
