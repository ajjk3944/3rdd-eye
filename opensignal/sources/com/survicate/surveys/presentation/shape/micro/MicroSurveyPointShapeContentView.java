package com.survicate.surveys.presentation.shape.micro;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ar.a;
import ar.k;
import br.l;
import c3.f;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.rating.shape.SurveyPointShapeSettings;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.presentation.widget.MicroQuestionHeader;
import com.survicate.surveys.presentation.widget.MicroSurvicateCommentField;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import mq.w;
import on.n;
import on.p;
import on.r;
import on.t;
import on.u;
import s9.g;
import tp.b;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u00011J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\fR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR0\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0013\u0010(\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/survicate/surveys/presentation/shape/micro/MicroSurveyPointShapeContentView;", "Landroid/widget/FrameLayout;", "", "Lcom/survicate/surveys/infrastructure/network/SurveyAnswer;", "getAnswer", "()Ljava/util/List;", "Landroid/os/Bundle;", "getCurrentUiState", "()Landroid/os/Bundle;", "savedState", "Llq/b0;", "setupList", "(Landroid/os/Bundle;)V", "setupAdapter", "", "<set-?>", "a", "Ljava/lang/String;", "getCommentFieldText", "()Ljava/lang/String;", "commentFieldText", "Lkotlin/Function0;", "d", "Lar/a;", "getOnValidationStateUpdate", "()Lar/a;", "setOnValidationStateUpdate", "(Lar/a;)V", "onValidationStateUpdate", "Lkotlin/Function1;", "g", "Lar/k;", "getOnAnswerSelected", "()Lar/k;", "setOnAnswerSelected", "(Lar/k;)V", "onAnswerSelected", "Lcom/survicate/surveys/entities/survey/questions/question/QuestionPointAnswer;", "getSelectedAnswer", "()Lcom/survicate/surveys/entities/survey/questions/question/QuestionPointAnswer;", "selectedAnswer", "Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;", "getSurveyPoint", "()Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;", "surveyPoint", "Lcom/survicate/surveys/entities/survey/questions/question/rating/shape/SurveyPointShapeSettings;", "getSurveyPointSettings", "()Lcom/survicate/surveys/entities/survey/questions/question/rating/shape/SurveyPointShapeSettings;", "surveyPointSettings", "sp/a", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointShapeContentView extends FrameLayout {
    public static final /* synthetic */ int H = 0;
    public final RecyclerView B;
    public final TextView D;
    public final TextView E;
    public final MicroSurvicateCommentField F;
    public b G;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public String commentFieldText;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public a onValidationStateUpdate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public k onAnswerSelected;

    /* renamed from: r, reason: collision with root package name */
    public sp.a f6484r;

    /* renamed from: x, reason: collision with root package name */
    public MicroColorScheme f6485x;

    /* renamed from: y, reason: collision with root package name */
    public final MicroQuestionHeader f6486y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurveyPointShapeContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        this.commentFieldText = "";
        View viewInflate = View.inflate(context, t.view_micro_survey_point_shape_content, this);
        View viewFindViewById = viewInflate.findViewById(r.view_micro_survey_point_shape_content_header);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6486y = (MicroQuestionHeader) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_survey_point_shape_content_recycler);
        l.d(viewFindViewById2, "findViewById(...)");
        this.B = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(r.view_micro_question_legend_label_left);
        l.d(viewFindViewById3, "findViewById(...)");
        this.D = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(r.view_micro_question_legend_label_right);
        l.d(viewFindViewById4, "findViewById(...)");
        this.E = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(r.view_micro_survey_point_shape_content_comment_field);
        l.d(viewFindViewById5, "findViewById(...)");
        this.F = (MicroSurvicateCommentField) viewFindViewById5;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.survicate.surveys.presentation.shape.micro.MicroSurveyPointShapeContentView r6, rq.c r7) {
        /*
            boolean r0 = r7 instanceof sp.b
            if (r0 == 0) goto L13
            r0 = r7
            sp.b r0 = (sp.b) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            sp.b r0 = new sp.b
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f22197x
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            lq.b0 r3 = lq.b0.f15562a
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            com.survicate.surveys.presentation.shape.micro.MicroSurveyPointShapeContentView r6 = r0.f22196r
            lf.t1.G(r7)
            goto L53
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            lf.t1.G(r7)
            android.content.Context r7 = r6.getContext()
            java.lang.String r2 = "getContext(...)"
            br.l.d(r7, r2)
            boolean r7 = xu.d.S(r7)
            if (r7 == 0) goto L46
            return r3
        L46:
            r0.f22196r = r6
            r0.B = r4
            r4 = 250(0xfa, double:1.235E-321)
            java.lang.Object r7 = wt.w.h(r4, r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            com.survicate.surveys.presentation.widget.MicroSurvicateCommentField r7 = r6.F
            boolean r0 = r7.isLaidOut()
            if (r0 == 0) goto L67
            boolean r0 = r7.isLayoutRequested()
            if (r0 != 0) goto L67
            com.survicate.surveys.presentation.widget.MicroSurvicateCommentField r6 = r6.F
            r6.d()
            return r3
        L67:
            jd.a r0 = new jd.a
            r1 = 3
            r0.<init>(r1, r6)
            r7.addOnLayoutChangeListener(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.survicate.surveys.presentation.shape.micro.MicroSurveyPointShapeContentView.a(com.survicate.surveys.presentation.shape.micro.MicroSurveyPointShapeContentView, rq.c):java.lang.Object");
    }

    private final SurveyQuestionSurveyPoint getSurveyPoint() {
        sp.a aVar = this.f6484r;
        if (aVar != null) {
            return aVar.f22193a;
        }
        l.l("bindingData");
        throw null;
    }

    private final SurveyPointShapeSettings getSurveyPointSettings() {
        SurveyQuestionPointSettings settings = getSurveyPoint().getSettings();
        l.c(settings, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.rating.shape.SurveyPointShapeSettings");
        return (SurveyPointShapeSettings) settings;
    }

    private final void setupAdapter(Bundle savedState) {
        boolean zE = e();
        RecyclerView recyclerView = this.B;
        if (zE) {
            List<QuestionPointAnswer> answers = getSurveyPoint().getAnswers();
            MicroColorScheme microColorScheme = this.f6485x;
            if (microColorScheme == null) {
                l.l("colorScheme");
                throw null;
            }
            this.G = new b(answers, microColorScheme, getSurveyPointSettings());
        } else {
            List<QuestionPointAnswer> answers2 = getSurveyPoint().getAnswers();
            MicroColorScheme microColorScheme2 = this.f6485x;
            if (microColorScheme2 == null) {
                l.l("colorScheme");
                throw null;
            }
            this.G = new b(answers2, microColorScheme2, getSurveyPointSettings().getShape(), getSurveyPointSettings());
            recyclerView.i(new xo.a(getResources().getDimensionPixelSize(p.survicate_micro_question_shape_horizontal_item_spacing)));
            recyclerView.setOverScrollMode(2);
        }
        b bVar = this.G;
        if (bVar == null) {
            l.l("adapter");
            throw null;
        }
        bVar.f22944g = new g(2, this);
        bVar.f22945h = d(savedState);
        bVar.f10189a.d(0, bVar.f22941d.size());
        b bVar2 = this.G;
        if (bVar2 != null) {
            recyclerView.setAdapter(bVar2);
        } else {
            l.l("adapter");
            throw null;
        }
    }

    private final void setupList(Bundle savedState) {
        RecyclerView recyclerView = this.B;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        l.c(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        f fVar = (f) layoutParams;
        boolean zE = e();
        fVar.W = !zE;
        ((ViewGroup.MarginLayoutParams) fVar).width = zE ? 0 : -2;
        recyclerView.setLayoutParams(fVar);
        boolean zE2 = e();
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(zE2 ? 1 : 0, zE2));
        recyclerView.setItemAnimator(null);
        setupAdapter(savedState);
    }

    public final void b(sp.a aVar, Bundle bundle) throws Resources.NotFoundException {
        this.f6484r = aVar;
        this.f6486y.a(aVar.f22194b);
        setupList(bundle);
        String leftText = getSurveyPointSettings().getLeftText();
        if (leftText == null) {
            leftText = "";
        }
        TextView textView = this.D;
        textView.setText(leftText);
        int i10 = 8;
        textView.setVisibility((e() || tt.l.D0(leftText)) ? 8 : 0);
        String rightText = getSurveyPointSettings().getRightText();
        if (rightText == null) {
            rightText = "";
        }
        TextView textView2 = this.E;
        textView2.setText(rightText);
        textView2.setVisibility((e() || tt.l.D0(rightText)) ? 8 : 0);
        String string = bundle != null ? bundle.getString("COMMENT_FIELD_TEXT") : null;
        if (string == null) {
            string = "";
        }
        this.commentFieldText = string;
        String commentLabel = getSurveyPointSettings().getCommentLabel();
        String str = commentLabel != null ? commentLabel : "";
        MicroSurvicateCommentField microSurvicateCommentField = this.F;
        microSurvicateCommentField.setLabel(str);
        sp.a aVar2 = this.f6484r;
        if (aVar2 == null) {
            l.l("bindingData");
            throw null;
        }
        String string2 = aVar2.f22195c;
        if (string2.length() == 0) {
            string2 = getResources().getString(u.survicate_input_text_placeholder);
            l.d(string2, "getString(...)");
        }
        microSurvicateCommentField.setInputHint(string2);
        sp.a aVar3 = this.f6484r;
        if (aVar3 == null) {
            l.l("bindingData");
            throw null;
        }
        if (aVar3.a() && d(bundle) != null) {
            i10 = 0;
        }
        microSurvicateCommentField.setVisibility(i10);
        microSurvicateCommentField.a(this.commentFieldText, new bq.g(1, this, MicroSurveyPointShapeContentView.class, "onCommentChanged", "onCommentChanged(Ljava/lang/String;)V", 0, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.survicate.surveys.infrastructure.network.SurveyAnswer c(com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.String r1 = r0.commentFieldText
            boolean r2 = tt.l.D0(r1)
            r3 = 0
            if (r2 != 0) goto L1c
            sp.a r2 = r0.f6484r
            if (r2 == 0) goto L16
            boolean r2 = r2.a()
            if (r2 == 0) goto L1c
            goto L1d
        L16:
            java.lang.String r1 = "bindingData"
            br.l.l(r1)
            throw r3
        L1c:
            r1 = r3
        L1d:
            com.survicate.surveys.infrastructure.network.SurveyAnswer r2 = new com.survicate.surveys.infrastructure.network.SurveyAnswer
            r16 = 4095(0xfff, float:5.738E-42)
            r17 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17)
            long r3 = r19.getId()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.setQuestionAnswerId(r3)
            r2.setComment(r1)
            java.lang.String r1 = r19.getPossibleAnswer()
            r2.setAnswer(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.survicate.surveys.presentation.shape.micro.MicroSurveyPointShapeContentView.c(com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer):com.survicate.surveys.infrastructure.network.SurveyAnswer");
    }

    public final QuestionPointAnswer d(Bundle bundle) {
        Object obj = null;
        if (bundle == null || !bundle.containsKey("SELECTED_ANSWER_ID")) {
            return null;
        }
        long j = bundle.getLong("SELECTED_ANSWER_ID");
        Iterator<T> it = getSurveyPoint().getAnswers().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((QuestionPointAnswer) next).getId() == j) {
                obj = next;
                break;
            }
        }
        return (QuestionPointAnswer) obj;
    }

    public final boolean e() {
        if (getSurveyPoint().getAnswers().size() <= 5) {
            return false;
        }
        Resources resources = getResources();
        l.d(resources, "getResources(...)");
        return !resources.getBoolean(n.isWideScreen);
    }

    public final List<SurveyAnswer> getAnswer() {
        QuestionPointAnswer selectedAnswer = getSelectedAnswer();
        return selectedAnswer == null ? w.f16945a : e5.H(c(selectedAnswer));
    }

    public final String getCommentFieldText() {
        return this.commentFieldText;
    }

    public final Bundle getCurrentUiState() {
        Bundle bundle = new Bundle();
        QuestionPointAnswer selectedAnswer = getSelectedAnswer();
        if (selectedAnswer != null) {
            bundle.putLong("SELECTED_ANSWER_ID", selectedAnswer.getId());
        }
        bundle.putString("COMMENT_FIELD_TEXT", this.commentFieldText);
        return bundle;
    }

    public final k getOnAnswerSelected() {
        return this.onAnswerSelected;
    }

    public final a getOnValidationStateUpdate() {
        return this.onValidationStateUpdate;
    }

    public final QuestionPointAnswer getSelectedAnswer() {
        b bVar = this.G;
        if (bVar != null) {
            return bVar.f22945h;
        }
        l.l("adapter");
        throw null;
    }

    public final void setOnAnswerSelected(k kVar) {
        this.onAnswerSelected = kVar;
    }

    public final void setOnValidationStateUpdate(a aVar) {
        this.onValidationStateUpdate = aVar;
    }
}
