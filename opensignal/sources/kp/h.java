package kp;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import ba.m;
import br.l;
import com.survicate.surveys.entities.attributes.MicroSurvicateSelectionType;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.presentation.widget.MicroSurvicateCommentField;
import h7.n1;
import on.r;

/* loaded from: classes.dex */
public final class h extends n1 {

    /* renamed from: u, reason: collision with root package name */
    public final MicroColorScheme f14482u;

    /* renamed from: v, reason: collision with root package name */
    public final MicroSurvicateCommentField f14483v;

    /* renamed from: w, reason: collision with root package name */
    public final CheckBox f14484w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f14485x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View view, MicroColorScheme microColorScheme) throws Resources.NotFoundException {
        super(view);
        l.e(microColorScheme, "colorScheme");
        this.f14482u = microColorScheme;
        View viewFindViewById = view.findViewById(r.item_micro_multiple_comment_field);
        l.d(viewFindViewById, "findViewById(...)");
        MicroSurvicateCommentField microSurvicateCommentField = (MicroSurvicateCommentField) viewFindViewById;
        this.f14483v = microSurvicateCommentField;
        View viewFindViewById2 = view.findViewById(r.item_micro_multiple_checkbox);
        l.d(viewFindViewById2, "findViewById(...)");
        CheckBox checkBox = (CheckBox) viewFindViewById2;
        this.f14484w = checkBox;
        View viewFindViewById3 = view.findViewById(r.item_micro_multiple_answer_text);
        l.d(viewFindViewById3, "findViewById(...)");
        this.f14485x = (TextView) viewFindViewById3;
        checkBox.setBackground(xu.d.n(microColorScheme));
        Context context = view.getContext();
        l.d(context, "getContext(...)");
        checkBox.setButtonDrawable(xu.d.l(context, microColorScheme, MicroSurvicateSelectionType.Checkbox));
        microSurvicateCommentField.c(microColorScheme);
        m.o(view);
    }
}
