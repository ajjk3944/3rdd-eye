package kp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import br.k;
import br.l;
import br.n;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.presentation.multiple.micro.MicroSurveyPointMultipleAnswerItem;
import com.survicate.surveys.presentation.single.micro.MicroSurveyPointSingleAnswerItem;
import com.survicate.surveys.presentation.widget.MicroSurvicateCommentField;
import h7.n1;
import h7.q0;
import java.util.List;
import on.t;
import on.u;
import on.v;

/* loaded from: classes.dex */
public final class b extends q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14464d;

    /* renamed from: e, reason: collision with root package name */
    public final List f14465e;

    /* renamed from: f, reason: collision with root package name */
    public final MicroColorScheme f14466f;

    /* renamed from: g, reason: collision with root package name */
    public Object f14467g;

    /* renamed from: h, reason: collision with root package name */
    public k f14468h;

    /* renamed from: i, reason: collision with root package name */
    public n f14469i;

    public b(List list, MicroColorScheme microColorScheme, int i10) {
        this.f14464d = i10;
        switch (i10) {
            case 1:
                l.e(list, "items");
                l.e(microColorScheme, "colorScheme");
                this.f14465e = list;
                this.f14466f = microColorScheme;
                break;
            default:
                l.e(list, "items");
                l.e(microColorScheme, "colorScheme");
                this.f14465e = list;
                this.f14466f = microColorScheme;
                break;
        }
    }

    @Override // h7.q0
    public final int b() {
        switch (this.f14464d) {
        }
        return this.f14465e.size();
    }

    @Override // h7.q0
    public final void j(n1 n1Var, int i10) {
        switch (this.f14464d) {
            case 0:
                h hVar = (h) n1Var;
                MicroSurveyPointMultipleAnswerItem microSurveyPointMultipleAnswerItem = (MicroSurveyPointMultipleAnswerItem) this.f14465e.get(i10);
                a aVar = new a(this, microSurveyPointMultipleAnswerItem, 0);
                ht.g gVar = new ht.g(14, this);
                a aVar2 = new a(this, microSurveyPointMultipleAnswerItem, 1);
                l.e(microSurveyPointMultipleAnswerItem, "answerItem");
                View view = hVar.f10155a;
                Context context = view.getContext();
                l.d(context, "getContext(...)");
                MicroColorScheme microColorScheme = hVar.f14482u;
                view.setBackground(vc.e.n(context, microColorScheme, microSurveyPointMultipleAnswerItem.B));
                view.setOnClickListener(new am.b(15, aVar));
                boolean z10 = microSurveyPointMultipleAnswerItem.B;
                TextView textView = hVar.f14485x;
                textView.setTextAppearance(z10 ? v.Widget_Survicate_QuestionOption_Text_Micro_Selected : v.Widget_Survicate_QuestionOption_Text_Micro);
                textView.setTextColor(microColorScheme.getAnswer());
                textView.setText(microSurveyPointMultipleAnswerItem.f6440d);
                hVar.f14484w.setChecked(microSurveyPointMultipleAnswerItem.B);
                MicroSurvicateCommentField microSurvicateCommentField = hVar.f14483v;
                microSurvicateCommentField.setLabel(microSurveyPointMultipleAnswerItem.f6442r);
                microSurvicateCommentField.setInputHint(microSurveyPointMultipleAnswerItem.f6443x);
                microSurvicateCommentField.a(microSurveyPointMultipleAnswerItem.f6444y, new c7.b(microSurveyPointMultipleAnswerItem, 19, gVar));
                microSurvicateCommentField.setVisibility((microSurveyPointMultipleAnswerItem.B && microSurveyPointMultipleAnswerItem.f6441g) ? 0 : 8);
                microSurvicateCommentField.setOnInputFocus(aVar2);
                break;
            default:
                vp.f fVar = (vp.f) n1Var;
                MicroSurveyPointSingleAnswerItem microSurveyPointSingleAnswerItem = (MicroSurveyPointSingleAnswerItem) this.f14465e.get(i10);
                vp.a aVar3 = new vp.a(this, microSurveyPointSingleAnswerItem, 0);
                pp.c cVar = new pp.c(10, this);
                vp.a aVar4 = new vp.a(this, microSurveyPointSingleAnswerItem, 1);
                l.e(microSurveyPointSingleAnswerItem, "answerItem");
                String str = microSurveyPointSingleAnswerItem.f6497x;
                boolean z11 = microSurveyPointSingleAnswerItem.f6495g;
                View view2 = fVar.f10155a;
                Context context2 = view2.getContext();
                l.d(context2, "getContext(...)");
                MicroColorScheme microColorScheme2 = fVar.f23944u;
                boolean z12 = microSurveyPointSingleAnswerItem.D;
                String str2 = microSurveyPointSingleAnswerItem.f6494d;
                view2.setBackground(vc.e.n(context2, microColorScheme2, z12));
                view2.setOnClickListener(new am.b(24, aVar3));
                boolean z13 = microSurveyPointSingleAnswerItem.D;
                TextView textView2 = fVar.f23947x;
                textView2.setTextAppearance(z13 ? v.Widget_Survicate_QuestionOption_Text_Micro_Selected : v.Widget_Survicate_QuestionOption_Text_Micro);
                textView2.setTextColor(microColorScheme2.getAnswer());
                textView2.setText(str2);
                Context context3 = view2.getContext();
                l.d(context3, "getContext(...)");
                textView2.setContentDescription((microSurveyPointSingleAnswerItem.D && z11 && microSurveyPointSingleAnswerItem.f6496r && tt.l.D0(str)) ? context3.getString(u.survicate_micro_comment_required_content_description, str2) : null);
                fVar.f23946w.setChecked(microSurveyPointSingleAnswerItem.D);
                MicroSurvicateCommentField microSurvicateCommentField2 = fVar.f23945v;
                microSurvicateCommentField2.setLabel(str);
                microSurvicateCommentField2.setInputHint(microSurveyPointSingleAnswerItem.f6498y);
                microSurvicateCommentField2.a(microSurveyPointSingleAnswerItem.B, new c7.b(microSurveyPointSingleAnswerItem, 23, cVar));
                microSurvicateCommentField2.setVisibility((microSurveyPointSingleAnswerItem.D && z11) ? 0 : 8);
                microSurvicateCommentField2.setOnInputFocus(aVar4);
                break;
        }
    }

    @Override // h7.q0
    public final n1 k(ViewGroup viewGroup, int i10) {
        switch (this.f14464d) {
            case 0:
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(t.item_micro_multiple, viewGroup, false);
                l.b(viewInflate);
                return new h(viewInflate, this.f14466f);
            default:
                View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(t.item_micro_single, viewGroup, false);
                l.b(viewInflate2);
                return new vp.f(viewInflate2, this.f14466f);
        }
    }
}
