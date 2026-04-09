package vp;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import ba.m;
import br.l;
import com.survicate.surveys.entities.attributes.MicroSurvicateSelectionType;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.presentation.widget.MicroSurvicateCommentField;
import h7.n1;
import on.r;

/* loaded from: classes.dex */
public final class f extends n1 {

    /* renamed from: u, reason: collision with root package name */
    public final MicroColorScheme f23944u;

    /* renamed from: v, reason: collision with root package name */
    public final MicroSurvicateCommentField f23945v;

    /* renamed from: w, reason: collision with root package name */
    public final RadioButton f23946w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f23947x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View view, MicroColorScheme microColorScheme) throws Resources.NotFoundException {
        super(view);
        l.e(microColorScheme, "colorScheme");
        this.f23944u = microColorScheme;
        View viewFindViewById = view.findViewById(r.item_micro_single_comment_field);
        l.d(viewFindViewById, "findViewById(...)");
        MicroSurvicateCommentField microSurvicateCommentField = (MicroSurvicateCommentField) viewFindViewById;
        this.f23945v = microSurvicateCommentField;
        View viewFindViewById2 = view.findViewById(r.item_micro_single_radio_button);
        l.d(viewFindViewById2, "findViewById(...)");
        RadioButton radioButton = (RadioButton) viewFindViewById2;
        this.f23946w = radioButton;
        View viewFindViewById3 = view.findViewById(r.item_micro_single_answer_text);
        l.d(viewFindViewById3, "findViewById(...)");
        this.f23947x = (TextView) viewFindViewById3;
        radioButton.setBackground(xu.d.n(microColorScheme));
        Context context = view.getContext();
        l.d(context, "getContext(...)");
        radioButton.setButtonDrawable(xu.d.l(context, microColorScheme, MicroSurvicateSelectionType.Radio));
        microSurvicateCommentField.c(microColorScheme);
        m.o(view);
    }
}
