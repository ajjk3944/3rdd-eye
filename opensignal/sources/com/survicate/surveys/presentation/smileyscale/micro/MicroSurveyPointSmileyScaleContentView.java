package com.survicate.surveys.presentation.smileyscale.micro;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ar.a;
import ar.k;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.smileyScale.SurveyPointSmileyScaleSettings;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.presentation.widget.MicroQuestionHeader;
import com.survicate.surveys.presentation.widget.MicroSurvicateCommentField;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import mq.w;
import on.r;
import on.t;
import vc.e;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001/J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR(\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0015\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR0\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/survicate/surveys/presentation/smileyscale/micro/MicroSurveyPointSmileyScaleContentView;", "Landroid/widget/FrameLayout;", "", "Lcom/survicate/surveys/infrastructure/network/SurveyAnswer;", "getAnswer", "()Ljava/util/List;", "Landroid/os/Bundle;", "getCurrentUiState", "()Landroid/os/Bundle;", "Lcom/survicate/surveys/entities/survey/questions/question/QuestionPointAnswer;", "<set-?>", "a", "Lcom/survicate/surveys/entities/survey/questions/question/QuestionPointAnswer;", "getSelectedAnswer", "()Lcom/survicate/surveys/entities/survey/questions/question/QuestionPointAnswer;", "selectedAnswer", "", "d", "Ljava/lang/String;", "getCommentFieldText", "()Ljava/lang/String;", "commentFieldText", "Lkotlin/Function0;", "Llq/b0;", "g", "Lar/a;", "getOnValidationStateUpdate", "()Lar/a;", "setOnValidationStateUpdate", "(Lar/a;)V", "onValidationStateUpdate", "Lkotlin/Function1;", "r", "Lar/k;", "getOnAnswerSelected", "()Lar/k;", "setOnAnswerSelected", "(Lar/k;)V", "onAnswerSelected", "Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;", "getSurveyPoint", "()Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;", "surveyPoint", "Lcom/survicate/surveys/entities/survey/questions/question/smileyScale/SurveyPointSmileyScaleSettings;", "getSurveyPointSettings", "()Lcom/survicate/surveys/entities/survey/questions/question/smileyScale/SurveyPointSmileyScaleSettings;", "surveyPointSettings", "xp/a", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointSmileyScaleContentView extends FrameLayout {
    public static final /* synthetic */ int K = 0;
    public final ImageView B;
    public final ImageView D;
    public final ImageView E;
    public final ImageView F;
    public final TextView G;
    public final TextView H;
    public final MicroSurvicateCommentField I;
    public final List J;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public QuestionPointAnswer selectedAnswer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public String commentFieldText;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public a onValidationStateUpdate;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public k onAnswerSelected;

    /* renamed from: x, reason: collision with root package name */
    public xp.a f6515x;

    /* renamed from: y, reason: collision with root package name */
    public final MicroQuestionHeader f6516y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurveyPointSmileyScaleContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        this.commentFieldText = "";
        View viewInflate = View.inflate(context, t.view_micro_survey_point_smiley_content, this);
        View viewFindViewById = viewInflate.findViewById(r.view_micro_survey_point_smiley_content_container);
        l.d(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_survey_point_smiley_content_header);
        l.d(viewFindViewById2, "findViewById(...)");
        this.f6516y = (MicroQuestionHeader) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(r.view_micro_survey_point_smiley_content_extremely_unhappy);
        l.d(viewFindViewById3, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById3;
        this.B = imageView;
        View viewFindViewById4 = viewInflate.findViewById(r.view_micro_survey_point_smiley_content_unhappy);
        l.d(viewFindViewById4, "findViewById(...)");
        ImageView imageView2 = (ImageView) viewFindViewById4;
        this.D = imageView2;
        View viewFindViewById5 = viewInflate.findViewById(r.view_micro_survey_point_smiley_content_neutral);
        l.d(viewFindViewById5, "findViewById(...)");
        View viewFindViewById6 = viewInflate.findViewById(r.view_micro_survey_point_smiley_content_happy);
        l.d(viewFindViewById6, "findViewById(...)");
        ImageView imageView3 = (ImageView) viewFindViewById6;
        this.E = imageView3;
        View viewFindViewById7 = viewInflate.findViewById(r.view_micro_survey_point_smiley_content_extremely_happy);
        l.d(viewFindViewById7, "findViewById(...)");
        ImageView imageView4 = (ImageView) viewFindViewById7;
        this.F = imageView4;
        View viewFindViewById8 = viewInflate.findViewById(r.view_micro_question_legend_label_left);
        l.d(viewFindViewById8, "findViewById(...)");
        this.G = (TextView) viewFindViewById8;
        View viewFindViewById9 = viewInflate.findViewById(r.view_micro_question_legend_label_right);
        l.d(viewFindViewById9, "findViewById(...)");
        this.H = (TextView) viewFindViewById9;
        View viewFindViewById10 = viewInflate.findViewById(r.view_micro_survey_point_smiley_content_comment_field);
        l.d(viewFindViewById10, "findViewById(...)");
        this.I = (MicroSurvicateCommentField) viewFindViewById10;
        List listI = e5.I(new lq.l(imageView, "Extremely unsatisfied"), new lq.l(imageView2, "Unsatisfied"), new lq.l((ImageView) viewFindViewById5, "Neutral"), new lq.l(imageView3, "Happy"), new lq.l(imageView4, "Extremely happy"));
        this.J = listI;
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            ImageView imageView5 = (ImageView) ((lq.l) it.next()).f15571a;
            Context context2 = getContext();
            l.d(context2, "getContext(...)");
            imageView5.setBackground(e.o(context2, 0.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.survicate.surveys.presentation.smileyscale.micro.MicroSurveyPointSmileyScaleContentView r6, rq.c r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof xp.b
            if (r0 == 0) goto L16
            r0 = r7
            xp.b r0 = (xp.b) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.B = r1
            goto L1b
        L16:
            xp.b r0 = new xp.b
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f25461x
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            lq.b0 r3 = lq.b0.f15562a
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            com.survicate.surveys.presentation.smileyscale.micro.MicroSurveyPointSmileyScaleContentView r6 = r0.f25460r
            lf.t1.G(r7)
            goto L56
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            lf.t1.G(r7)
            android.content.Context r7 = r6.getContext()
            java.lang.String r2 = "getContext(...)"
            br.l.d(r7, r2)
            boolean r7 = xu.d.S(r7)
            if (r7 == 0) goto L49
            return r3
        L49:
            r0.f25460r = r6
            r0.B = r4
            r4 = 250(0xfa, double:1.235E-321)
            java.lang.Object r7 = wt.w.h(r4, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            com.survicate.surveys.presentation.widget.MicroSurvicateCommentField r7 = r6.I
            boolean r0 = r7.isLaidOut()
            if (r0 == 0) goto L6a
            boolean r0 = r7.isLayoutRequested()
            if (r0 != 0) goto L6a
            com.survicate.surveys.presentation.widget.MicroSurvicateCommentField r6 = r6.I
            r6.d()
            return r3
        L6a:
            jd.a r0 = new jd.a
            r1 = 4
            r0.<init>(r1, r6)
            r7.addOnLayoutChangeListener(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.survicate.surveys.presentation.smileyscale.micro.MicroSurveyPointSmileyScaleContentView.a(com.survicate.surveys.presentation.smileyscale.micro.MicroSurveyPointSmileyScaleContentView, rq.c):java.lang.Object");
    }

    private final SurveyQuestionSurveyPoint getSurveyPoint() {
        xp.a aVar = this.f6515x;
        if (aVar != null) {
            return aVar.f25457a;
        }
        l.l("bindingData");
        throw null;
    }

    private final SurveyPointSmileyScaleSettings getSurveyPointSettings() {
        SurveyQuestionPointSettings settings = getSurveyPoint().getSettings();
        l.c(settings, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.smileyScale.SurveyPointSmileyScaleSettings");
        return (SurveyPointSmileyScaleSettings) settings;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(xp.a r17, android.os.Bundle r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.survicate.surveys.presentation.smileyscale.micro.MicroSurveyPointSmileyScaleContentView.b(xp.a, android.os.Bundle):void");
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
            xp.a r2 = r0.f6515x
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
            java.lang.String r3 = r19.getPossibleAnswer()
            r2.setContent(r3)
            java.lang.String r3 = r19.getPossibleAnswer()
            r2.setAnswer(r3)
            r2.setComment(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.survicate.surveys.presentation.smileyscale.micro.MicroSurveyPointSmileyScaleContentView.c(com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer):com.survicate.surveys.infrastructure.network.SurveyAnswer");
    }

    public final void d(QuestionPointAnswer questionPointAnswer) {
        Object next;
        Object next2;
        QuestionPointAnswer questionPointAnswer2 = this.selectedAnswer;
        List list = this.J;
        if (questionPointAnswer2 != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it.next();
                    if (l.a(((lq.l) next2).f15572d, questionPointAnswer2.getPossibleAnswer())) {
                        break;
                    }
                }
            }
            lq.l lVar = (lq.l) next2;
            ImageView imageView = lVar != null ? (ImageView) lVar.f15571a : null;
            if (imageView != null) {
                imageView.setScaleX(1.0f);
                imageView.setScaleY(1.0f);
            }
            if (imageView != null) {
                imageView.setSelected(false);
            }
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (l.a(((lq.l) next).f15572d, questionPointAnswer.getPossibleAnswer())) {
                    break;
                }
            }
        }
        lq.l lVar2 = (lq.l) next;
        ImageView imageView2 = lVar2 != null ? (ImageView) lVar2.f15571a : null;
        if (imageView2 != null) {
            imageView2.setScaleX(1.2f);
            imageView2.setScaleY(1.2f);
        }
        if (imageView2 != null) {
            imageView2.setSelected(true);
        }
        this.selectedAnswer = questionPointAnswer;
    }

    public final List<SurveyAnswer> getAnswer() {
        QuestionPointAnswer questionPointAnswer = this.selectedAnswer;
        return questionPointAnswer == null ? w.f16945a : e5.H(c(questionPointAnswer));
    }

    public final String getCommentFieldText() {
        return this.commentFieldText;
    }

    public final Bundle getCurrentUiState() {
        Bundle bundle = new Bundle();
        QuestionPointAnswer questionPointAnswer = this.selectedAnswer;
        if (questionPointAnswer != null) {
            bundle.putLong("SELECTED_ANSWER_ID", questionPointAnswer.getId());
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
        return this.selectedAnswer;
    }

    public final void setOnAnswerSelected(k kVar) {
        this.onAnswerSelected = kVar;
    }

    public final void setOnValidationStateUpdate(a aVar) {
        this.onValidationStateUpdate = aVar;
    }
}
