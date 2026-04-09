package zp;

import android.content.res.Resources;
import android.view.View;
import br.l;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.presentation.widget.MicroQuestionHeader;
import com.survicate.surveys.presentation.widget.MicroSurvicateTextInput;
import h7.n1;
import h7.r1;
import on.r;

/* loaded from: classes.dex */
public final class e extends n1 {

    /* renamed from: u, reason: collision with root package name */
    public final MicroQuestionHeader f27500u;

    /* renamed from: v, reason: collision with root package name */
    public final MicroSurvicateTextInput f27501v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View view, r1 r1Var, MicroColorScheme microColorScheme) throws Resources.NotFoundException {
        super(view);
        l.e(r1Var, "viewDependencies");
        l.e(microColorScheme, "colorScheme");
        View viewFindViewById = view.findViewById(r.item_micro_text_header);
        l.d(viewFindViewById, "findViewById(...)");
        MicroQuestionHeader microQuestionHeader = (MicroQuestionHeader) viewFindViewById;
        this.f27500u = microQuestionHeader;
        View viewFindViewById2 = view.findViewById(r.item_micro_text_input);
        l.d(viewFindViewById2, "findViewById(...)");
        MicroSurvicateTextInput microSurvicateTextInput = (MicroSurvicateTextInput) viewFindViewById2;
        this.f27501v = microSurvicateTextInput;
        microQuestionHeader.b(r1Var, microColorScheme);
        microSurvicateTextInput.c(microColorScheme);
        microSurvicateTextInput.setInputType(131073);
    }
}
