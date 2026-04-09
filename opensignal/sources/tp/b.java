package tp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import br.l;
import com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer;
import com.survicate.surveys.entities.survey.questions.question.rating.shape.SurveyPointShapeSettings;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import h7.n1;
import h7.q0;
import java.util.List;
import mq.o;
import on.t;
import s9.g;

/* loaded from: classes.dex */
public final class b extends q0 {

    /* renamed from: d, reason: collision with root package name */
    public final List f22941d;

    /* renamed from: e, reason: collision with root package name */
    public final MicroColorScheme f22942e;

    /* renamed from: f, reason: collision with root package name */
    public final String f22943f;

    /* renamed from: g, reason: collision with root package name */
    public g f22944g;

    /* renamed from: h, reason: collision with root package name */
    public QuestionPointAnswer f22945h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f22946i;
    public Drawable j;
    public final /* synthetic */ int k;

    /* renamed from: l, reason: collision with root package name */
    public final SurveyPointShapeSettings f22947l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(List list, MicroColorScheme microColorScheme, SurveyPointShapeSettings surveyPointShapeSettings) {
        this(list, microColorScheme, surveyPointShapeSettings.getShape());
        this.k = 1;
        l.e(list, "items");
        l.e(microColorScheme, "colorScheme");
        l.e(surveyPointShapeSettings, "pointSettings");
        this.f22947l = surveyPointShapeSettings;
    }

    @Override // h7.q0
    public final int b() {
        return this.f22941d.size();
    }

    @Override // h7.q0
    public final void j(n1 n1Var, int i10) {
        switch (this.k) {
            case 0:
                QuestionPointAnswer questionPointAnswer = (QuestionPointAnswer) this.f22941d.get(i10);
                a aVar = (a) n1Var;
                g gVar = this.f22944g;
                TextView textView = aVar.f22939v;
                View view = aVar.f10155a;
                l.e(questionPointAnswer, "item");
                b bVar = aVar.f22940w;
                QuestionPointAnswer questionPointAnswer2 = bVar.f22945h;
                List list = bVar.f22941d;
                view.setSelected(questionPointAnswer2 != null && questionPointAnswer2.getId() == questionPointAnswer.getId());
                boolean z10 = list.indexOf(questionPointAnswer) <= list.indexOf(bVar.f22945h);
                ImageView imageView = aVar.f22938u;
                Context context = view.getContext();
                l.d(context, "getContext(...)");
                imageView.setBackground(bVar.r(context, z10));
                textView.setText(questionPointAnswer.getPossibleAnswer());
                textView.setContentDescription(bVar.q(questionPointAnswer, bVar.f22947l));
                view.setOnClickListener(new hn.c(bVar, questionPointAnswer, gVar, 6));
                break;
            default:
                QuestionPointAnswer questionPointAnswer3 = (QuestionPointAnswer) this.f22941d.get(i10);
                c cVar = (c) n1Var;
                g gVar2 = this.f22944g;
                View view2 = cVar.f10155a;
                l.e(questionPointAnswer3, "item");
                b bVar2 = cVar.f22950w;
                QuestionPointAnswer questionPointAnswer4 = bVar2.f22945h;
                List list2 = bVar2.f22941d;
                view2.setSelected(questionPointAnswer4 != null && questionPointAnswer4.getId() == questionPointAnswer3.getId());
                boolean z11 = list2.indexOf(questionPointAnswer3) <= list2.indexOf(bVar2.f22945h);
                ImageView imageView2 = cVar.f22948u;
                Context context2 = view2.getContext();
                l.d(context2, "getContext(...)");
                imageView2.setBackground(bVar2.r(context2, z11));
                cVar.f22949v.setText(bVar2.q(questionPointAnswer3, bVar2.f22947l));
                view2.setOnClickListener(new hn.c(bVar2, questionPointAnswer3, gVar2, 7));
                break;
        }
    }

    @Override // h7.q0
    public final n1 k(ViewGroup viewGroup, int i10) {
        switch (this.k) {
            case 0:
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(t.item_micro_shape_horizontal, viewGroup, false);
                l.b(viewInflate);
                return new a(this, viewInflate, this.f22942e);
            default:
                View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(t.item_micro_shape_vertical, viewGroup, false);
                l.b(viewInflate2);
                return new c(this, viewInflate2, this.f22942e);
        }
    }

    public final String q(QuestionPointAnswer questionPointAnswer, SurveyPointShapeSettings surveyPointShapeSettings) {
        String rightText;
        String str;
        String strG;
        String strG2;
        l.e(surveyPointShapeSettings, "settings");
        String possibleAnswer = questionPointAnswer.getPossibleAnswer();
        if (possibleAnswer == null) {
            possibleAnswer = "";
        }
        long id2 = questionPointAnswer.getId();
        List list = this.f22941d;
        QuestionPointAnswer questionPointAnswer2 = (QuestionPointAnswer) o.t0(list);
        if (questionPointAnswer2 == null || id2 != questionPointAnswer2.getId()) {
            QuestionPointAnswer questionPointAnswer3 = (QuestionPointAnswer) o.A0(list);
            if (questionPointAnswer3 != null && id2 == questionPointAnswer3.getId() && (rightText = surveyPointShapeSettings.getRightText()) != null) {
                str = tt.l.D0(rightText) ? null : rightText;
                if (str != null && (strG = w.g.g(possibleAnswer, " - ", str)) != null) {
                    return strG;
                }
            }
        } else {
            String leftText = surveyPointShapeSettings.getLeftText();
            if (leftText != null) {
                str = tt.l.D0(leftText) ? null : leftText;
                if (str != null && (strG2 = w.g.g(possibleAnswer, " - ", str)) != null) {
                    return strG2;
                }
            }
        }
        return possibleAnswer;
    }

    public final Drawable r(Context context, boolean z10) {
        if (z10) {
            Drawable drawable = this.f22946i;
            if (drawable != null) {
                return drawable;
            }
            Drawable drawableS = s(context, true);
            this.f22946i = drawableS;
            return drawableS;
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            return drawable2;
        }
        Drawable drawableS2 = s(context, false);
        this.j = drawableS2;
        return drawableS2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable s(android.content.Context r5, boolean r6) {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r1 = r4.f22943f
            if (r1 == 0) goto L48
            int r2 = r1.hashCode()
            r3 = -1221256979(0xffffffffb73518ed, float:-1.0794244E-5)
            if (r2 == r3) goto L38
            r3 = -874346147(0xffffffffcbe2895d, float:-2.9692602E7)
            if (r2 == r3) goto L29
            r3 = 109757537(0x68ac461, float:5.2198383E-35)
            if (r2 == r3) goto L19
            goto L48
        L19:
            java.lang.String r2 = "stars"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L22
            goto L48
        L22:
            int r1 = on.q.ic_micro_star
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r1)
            goto L49
        L29:
            java.lang.String r2 = "thumbs"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L48
            int r1 = on.q.ic_micro_thumb
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r1)
            goto L49
        L38:
            java.lang.String r2 = "hearts"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L41
            goto L48
        L41:
            int r1 = on.q.ic_micro_heart
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r1)
            goto L49
        L48:
            r5 = r0
        L49:
            if (r5 != 0) goto L4c
            return r0
        L4c:
            if (r6 == 0) goto L55
            com.survicate.surveys.entities.colors.MicroColorControlOpacity r6 = com.survicate.surveys.entities.colors.MicroColorControlOpacity.ShapeSelected
            float r6 = r6.getOpacityValue()
            goto L5b
        L55:
            com.survicate.surveys.entities.colors.MicroColorControlOpacity r6 = com.survicate.surveys.entities.colors.MicroColorControlOpacity.ShapeNotSelected
            float r6 = r6.getOpacityValue()
        L5b:
            com.survicate.surveys.entities.survey.theme.MicroColorScheme r0 = r4.f22942e
            int r0 = r0.getAnswer()
            int r6 = se.b.z(r0, r6)
            k3.a r0 = k3.a.SRC_IN
            android.graphics.ColorFilter r6 = xu.l.l(r6, r0)
            android.graphics.drawable.Drawable r5 = r5.mutate()
            java.lang.String r0 = "mutate(...)"
            br.l.d(r5, r0)
            r5.setColorFilter(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tp.b.s(android.content.Context, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(List list, MicroColorScheme microColorScheme, String str, SurveyPointShapeSettings surveyPointShapeSettings) {
        this(list, microColorScheme, str);
        this.k = 0;
        l.e(list, "items");
        l.e(microColorScheme, "colorScheme");
        l.e(surveyPointShapeSettings, "pointSettings");
        this.f22947l = surveyPointShapeSettings;
    }

    public b(List list, MicroColorScheme microColorScheme, String str) {
        l.e(list, "items");
        l.e(microColorScheme, "colorScheme");
        this.f22941d = list;
        this.f22942e = microColorScheme;
        this.f22943f = str;
    }
}
