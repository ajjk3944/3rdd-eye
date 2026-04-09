package ip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ba.m;
import br.l;
import com.survicate.surveys.entities.attributes.MicroSurvicateSelectionType;
import com.survicate.surveys.entities.colors.MicroColorControlOpacity;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.presentation.matrix.micro.MicroSurveyPointMatrixAnswerItem;
import com.survicate.surveys.presentation.matrix.micro.MicroSurveyPointMatrixColumnItem;
import com.survicate.surveys.presentation.widget.MicroSurvicateCommentField;
import dn.j;
import h7.n1;
import h7.q0;
import java.util.ArrayList;
import mq.b0;
import mq.x;
import on.r;
import on.t;
import on.v;

/* loaded from: classes.dex */
public final class b extends q0 {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f12890d;

    /* renamed from: e, reason: collision with root package name */
    public final MicroColorScheme f12891e;

    /* renamed from: f, reason: collision with root package name */
    public d f12892f;

    /* renamed from: g, reason: collision with root package name */
    public c7.b f12893g;

    /* renamed from: h, reason: collision with root package name */
    public d f12894h;

    /* renamed from: i, reason: collision with root package name */
    public RecyclerView f12895i;
    public as.d j;

    public b(ArrayList arrayList, MicroColorScheme microColorScheme) {
        l.e(microColorScheme, "colorScheme");
        this.f12890d = arrayList;
        this.f12891e = microColorScheme;
    }

    @Override // h7.q0
    public final int b() {
        return this.f12890d.size();
    }

    @Override // h7.q0
    public final void i(RecyclerView recyclerView) {
        this.f12895i = recyclerView;
    }

    @Override // h7.q0
    public final void j(n1 n1Var, int i10) throws Resources.NotFoundException {
        String str;
        View view;
        View viewInflate;
        String str2;
        i iVar = (i) n1Var;
        MicroSurveyPointMatrixAnswerItem microSurveyPointMatrixAnswerItem = (MicroSurveyPointMatrixAnswerItem) this.f12890d.get(i10);
        a aVar = new a(this, microSurveyPointMatrixAnswerItem, 0);
        c7.b bVar = new c7.b(this, 13, microSurveyPointMatrixAnswerItem);
        ht.g gVar = new ht.g(9, this);
        a aVar2 = new a(this, microSurveyPointMatrixAnswerItem, 1);
        View view2 = iVar.f12918w;
        l.e(microSurveyPointMatrixAnswerItem, "answerItem");
        iVar.f12917v = microSurveyPointMatrixAnswerItem;
        TextView textView = iVar.f12919x;
        textView.setText(microSurveyPointMatrixAnswerItem.f6419d);
        boolean z10 = microSurveyPointMatrixAnswerItem.D;
        textView.setMaxLines(z10 ? Integer.MAX_VALUE : 1);
        textView.setEllipsize(z10 ? null : TextUtils.TruncateAt.END);
        MicroColorScheme microColorScheme = iVar.f12916u;
        textView.setTextColor(microColorScheme.getAnswer());
        TextView textView2 = iVar.f12920y;
        MicroSurveyPointMatrixColumnItem microSurveyPointMatrixColumnItemD = microSurveyPointMatrixAnswerItem.d();
        if (microSurveyPointMatrixColumnItemD == null || (str = microSurveyPointMatrixColumnItemD.f6425d) == null) {
            str = "";
        }
        textView2.setText(str);
        boolean z11 = microSurveyPointMatrixAnswerItem.D;
        textView2.setMaxLines(z11 ? Integer.MAX_VALUE : 1);
        textView2.setEllipsize(z11 ? null : TextUtils.TruncateAt.END);
        textView2.setVisibility(microSurveyPointMatrixAnswerItem.d() != null ? 0 : 8);
        iVar.f12921z.setRotation(microSurveyPointMatrixAnswerItem.D ? 90.0f : 270.0f);
        view2.setOnClickListener(new am.b(10, aVar));
        View view3 = iVar.f10155a;
        LinearLayout linearLayout = iVar.A;
        iVar.B = x.f16946a;
        boolean z12 = microSurveyPointMatrixAnswerItem.D;
        ArrayList arrayList = microSurveyPointMatrixAnswerItem.f6420g;
        if (z12) {
            linearLayout.setVisibility(0);
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                MicroSurveyPointMatrixColumnItem microSurveyPointMatrixColumnItem = (MicroSurveyPointMatrixColumnItem) arrayList.get(i11);
                if (i11 < linearLayout.getChildCount()) {
                    viewInflate = linearLayout.getChildAt(i11);
                    view = view3;
                } else {
                    view = view3;
                    viewInflate = LayoutInflater.from(view3.getContext()).inflate(t.item_micro_matrix_column, (ViewGroup) linearLayout, false);
                    linearLayout.addView(viewInflate);
                }
                View view4 = viewInflate;
                l.b(view4);
                boolean zA = l.a(microSurveyPointMatrixAnswerItem.d(), microSurveyPointMatrixColumnItem);
                boolean z13 = microSurveyPointMatrixAnswerItem.f6421r;
                String str3 = microSurveyPointMatrixAnswerItem.f6422x;
                String str4 = microSurveyPointMatrixAnswerItem.f6423y;
                h hVar = new h(view4, microSurveyPointMatrixColumnItem, zA, z13, str3, str4);
                TextView textView3 = textView;
                LinearLayout linearLayout2 = linearLayout;
                String str5 = microSurveyPointMatrixColumnItem.f6425d;
                ArrayList arrayList2 = arrayList;
                int i12 = size;
                c7.b bVar2 = new c7.b(microSurveyPointMatrixColumnItem, 15, gVar);
                View viewFindViewById = view4.findViewById(r.item_micro_matrix_column_radio_button);
                ht.g gVar2 = gVar;
                l.d(viewFindViewById, "findViewById(...)");
                RadioButton radioButton = (RadioButton) viewFindViewById;
                int i13 = i11;
                View viewFindViewById2 = view4.findViewById(r.item_micro_matrix_column_name);
                l.d(viewFindViewById2, "findViewById(...)");
                TextView textView4 = (TextView) viewFindViewById2;
                View view5 = view2;
                View viewFindViewById3 = view4.findViewById(r.item_micro_matrix_comment_field);
                l.d(viewFindViewById3, "findViewById(...)");
                MicroSurvicateCommentField microSurvicateCommentField = (MicroSurvicateCommentField) viewFindViewById3;
                MicroSurveyPointMatrixAnswerItem microSurveyPointMatrixAnswerItem2 = microSurveyPointMatrixAnswerItem;
                iVar.B = b0.T(iVar.B, new lq.l(microSurveyPointMatrixColumnItem, microSurvicateCommentField));
                view4.setSelected(zA);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str5);
                sb2.append(": ");
                sb2.append(textView3.getText());
                if (z13 && zA && !tt.l.D0(str3)) {
                    sb2.append(". ");
                    str2 = str3;
                    sb2.append(str2);
                } else {
                    str2 = str3;
                }
                String string = sb2.toString();
                i iVar2 = iVar;
                l.d(string, "toString(...)");
                view4.setContentDescription(string);
                m.o(view4);
                Context context = view.getContext();
                l.d(context, "getContext(...)");
                view4.setBackground(vc.e.n(context, microColorScheme, zA));
                a aVar3 = aVar2;
                view4.setOnClickListener(new j(bVar, 3, hVar));
                textView4.setTextAppearance(zA ? v.Widget_Survicate_QuestionOption_Text_Micro_Selected : v.Widget_Survicate_QuestionOption_Text_Micro);
                textView4.setTextColor(microColorScheme.getAnswer());
                textView4.setText(str5);
                int iZ = se.b.z(microColorScheme.getAnswer(), MicroColorControlOpacity.Pressed.getOpacityValue());
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iZ);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                k3.a aVar4 = k3.a.SRC_ATOP;
                gradientDrawable.setColorFilter(xu.l.l(iZ, aVar4));
                radioButton.setBackground(new RippleDrawable(colorStateListValueOf, null, gradientDrawable));
                Context context2 = view.getContext();
                l.d(context2, "getContext(...)");
                MicroSurvicateSelectionType microSurvicateSelectionType = MicroSurvicateSelectionType.Radio;
                l.e(microSurvicateSelectionType, "selectionType");
                Drawable drawable = context2.getDrawable(microSurvicateSelectionType.getDrawableRes());
                if (drawable != null) {
                    drawable.setColorFilter(xu.l.l(microColorScheme.getAnswer(), aVar4));
                } else {
                    drawable = null;
                }
                radioButton.setButtonDrawable(drawable);
                radioButton.setChecked(zA);
                microSurvicateCommentField.setVisibility((z13 && zA) ? 0 : 8);
                microSurvicateCommentField.c(microColorScheme);
                microSurvicateCommentField.setLabel(str2);
                microSurvicateCommentField.setInputHint(str4);
                microSurvicateCommentField.a(microSurveyPointMatrixColumnItem.f6426g, bVar2);
                microSurvicateCommentField.setOnInputFocus(aVar3);
                aVar2 = aVar3;
                i11 = i13 + 1;
                textView = textView3;
                linearLayout = linearLayout2;
                arrayList = arrayList2;
                size = i12;
                iVar = iVar2;
                gVar = gVar2;
                view3 = view;
                view2 = view5;
                microSurveyPointMatrixAnswerItem = microSurveyPointMatrixAnswerItem2;
            }
        } else {
            linearLayout.setVisibility(8);
        }
        view2.setTag(r.survicate_accessibility_state_expanded, Boolean.valueOf(microSurveyPointMatrixAnswerItem.D));
    }

    @Override // h7.q0
    public final n1 k(ViewGroup viewGroup, int i10) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(t.item_micro_matrix_answer, viewGroup, false);
        l.b(viewInflate);
        return new i(viewInflate, this.f12891e);
    }

    @Override // h7.q0
    public final void l(RecyclerView recyclerView) {
        this.f12895i = null;
    }

    public final void q(MicroSurveyPointMatrixAnswerItem microSurveyPointMatrixAnswerItem) {
        RecyclerView recyclerView = this.f12895i;
        if (recyclerView == null) {
            return;
        }
        Context context = recyclerView.getContext();
        l.d(context, "getContext(...)");
        if (xu.d.S(context)) {
            return;
        }
        n1 n1VarI = recyclerView.I(this.f12890d.indexOf(microSurveyPointMatrixAnswerItem) + 1);
        i iVar = n1VarI instanceof i ? (i) n1VarI : null;
        if (iVar == null) {
            return;
        }
        iVar.f10155a.findViewById(r.item_micro_matrix_answer_header).requestFocus();
    }
}
