package xo;

import br.l;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.presentation.widget.MicroQuestionHeader;
import h7.n1;
import h7.r1;

/* loaded from: classes.dex */
public final class c extends n1 {

    /* renamed from: u, reason: collision with root package name */
    public final MicroQuestionHeader f25455u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(MicroQuestionHeader microQuestionHeader, r1 r1Var, MicroColorScheme microColorScheme) {
        super(microQuestionHeader);
        l.e(r1Var, "viewDependencies");
        l.e(microColorScheme, "colorScheme");
        this.f25455u = microQuestionHeader;
        microQuestionHeader.b(r1Var, microColorScheme);
    }
}
