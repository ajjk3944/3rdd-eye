package xo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import br.l;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.presentation.widget.MicroQuestionHeader;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import h7.n1;
import h7.q0;
import h7.r1;
import on.t;

/* loaded from: classes.dex */
public final class b extends q0 {

    /* renamed from: d, reason: collision with root package name */
    public final QuestionHeaderBindingData f25452d;

    /* renamed from: e, reason: collision with root package name */
    public final r1 f25453e;

    /* renamed from: f, reason: collision with root package name */
    public final MicroColorScheme f25454f;

    public b(QuestionHeaderBindingData questionHeaderBindingData, r1 r1Var, MicroColorScheme microColorScheme) {
        l.e(r1Var, "viewDependencies");
        l.e(microColorScheme, "colorScheme");
        this.f25452d = questionHeaderBindingData;
        this.f25453e = r1Var;
        this.f25454f = microColorScheme;
    }

    @Override // h7.q0
    public final int b() {
        return 1;
    }

    @Override // h7.q0
    public final void j(n1 n1Var, int i10) {
        QuestionHeaderBindingData questionHeaderBindingData = this.f25452d;
        l.e(questionHeaderBindingData, "data");
        ((c) n1Var).f25455u.a(questionHeaderBindingData);
    }

    @Override // h7.q0
    public final n1 k(ViewGroup viewGroup, int i10) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(t.item_micro_question_header, viewGroup, false);
        l.c(viewInflate, "null cannot be cast to non-null type com.survicate.surveys.presentation.widget.MicroQuestionHeader");
        return new c((MicroQuestionHeader) viewInflate, this.f25453e, this.f25454f);
    }
}
