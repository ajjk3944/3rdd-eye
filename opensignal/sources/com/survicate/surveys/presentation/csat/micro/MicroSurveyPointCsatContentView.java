package com.survicate.surveys.presentation.csat.micro;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ar.a;
import ar.k;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.rating.csat.SurveyPointCsatSettings;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.presentation.widget.MicroQuestionHeader;
import com.survicate.surveys.presentation.widget.MicroSurvicateCommentField;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import mm.d;
import mq.w;
import on.r;
import on.t;
import on.u;
import s9.g;
import zo.b;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u00011J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\fR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR0\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0013\u0010(\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/survicate/surveys/presentation/csat/micro/MicroSurveyPointCsatContentView;", "Landroid/widget/FrameLayout;", "", "Lcom/survicate/surveys/infrastructure/network/SurveyAnswer;", "getAnswer", "()Ljava/util/List;", "Landroid/os/Bundle;", "getCurrentUiState", "()Landroid/os/Bundle;", "savedState", "Llq/b0;", "setupList", "(Landroid/os/Bundle;)V", "setupAdapter", "", "<set-?>", "a", "Ljava/lang/String;", "getCommentFieldText", "()Ljava/lang/String;", "commentFieldText", "Lkotlin/Function0;", "d", "Lar/a;", "getOnValidationStateUpdate", "()Lar/a;", "setOnValidationStateUpdate", "(Lar/a;)V", "onValidationStateUpdate", "Lkotlin/Function1;", "g", "Lar/k;", "getOnAnswerSelected", "()Lar/k;", "setOnAnswerSelected", "(Lar/k;)V", "onAnswerSelected", "Lcom/survicate/surveys/entities/survey/questions/question/QuestionPointAnswer;", "getSelectedAnswer", "()Lcom/survicate/surveys/entities/survey/questions/question/QuestionPointAnswer;", "selectedAnswer", "Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;", "getSurveyPoint", "()Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;", "surveyPoint", "Lcom/survicate/surveys/entities/survey/questions/question/rating/csat/SurveyPointCsatSettings;", "getSurveyPointSettings", "()Lcom/survicate/surveys/entities/survey/questions/question/rating/csat/SurveyPointCsatSettings;", "surveyPointSettings", "zo/b", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointCsatContentView extends FrameLayout {
    public static final /* synthetic */ int F = 0;
    public final RecyclerView B;
    public final MicroSurvicateCommentField D;
    public d E;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public String commentFieldText;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public a onValidationStateUpdate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public k onAnswerSelected;

    /* renamed from: r, reason: collision with root package name */
    public b f6380r;

    /* renamed from: x, reason: collision with root package name */
    public MicroColorScheme f6381x;

    /* renamed from: y, reason: collision with root package name */
    public final MicroQuestionHeader f6382y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurveyPointCsatContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        this.commentFieldText = "";
        View viewInflate = View.inflate(context, t.view_micro_survey_point_csat_content, this);
        View viewFindViewById = viewInflate.findViewById(r.view_micro_survey_point_csat_content_header);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6382y = (MicroQuestionHeader) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_survey_point_csat_content_recycler);
        l.d(viewFindViewById2, "findViewById(...)");
        this.B = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(r.view_micro_survey_point_csat_content_comment_field);
        l.d(viewFindViewById3, "findViewById(...)");
        this.D = (MicroSurvicateCommentField) viewFindViewById3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.survicate.surveys.presentation.csat.micro.MicroSurveyPointCsatContentView r6, rq.c r7) {
        /*
            boolean r0 = r7 instanceof zo.c
            if (r0 == 0) goto L13
            r0 = r7
            zo.c r0 = (zo.c) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            zo.c r0 = new zo.c
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f27479x
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            lq.b0 r3 = lq.b0.f15562a
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            com.survicate.surveys.presentation.csat.micro.MicroSurveyPointCsatContentView r6 = r0.f27478r
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
            r0.f27478r = r6
            r0.B = r4
            r4 = 250(0xfa, double:1.235E-321)
            java.lang.Object r7 = wt.w.h(r4, r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            com.survicate.surveys.presentation.widget.MicroSurvicateCommentField r7 = r6.D
            boolean r0 = r7.isLaidOut()
            if (r0 == 0) goto L67
            boolean r0 = r7.isLayoutRequested()
            if (r0 != 0) goto L67
            com.survicate.surveys.presentation.widget.MicroSurvicateCommentField r6 = r6.D
            r6.d()
            return r3
        L67:
            jd.a r0 = new jd.a
            r1 = 5
            r0.<init>(r1, r6)
            r7.addOnLayoutChangeListener(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.survicate.surveys.presentation.csat.micro.MicroSurveyPointCsatContentView.a(com.survicate.surveys.presentation.csat.micro.MicroSurveyPointCsatContentView, rq.c):java.lang.Object");
    }

    private final SurveyQuestionSurveyPoint getSurveyPoint() {
        b bVar = this.f6380r;
        if (bVar != null) {
            return bVar.f27475a;
        }
        l.l("bindingData");
        throw null;
    }

    private final SurveyPointCsatSettings getSurveyPointSettings() {
        SurveyQuestionPointSettings settings = getSurveyPoint().getSettings();
        l.c(settings, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.rating.csat.SurveyPointCsatSettings");
        return (SurveyPointCsatSettings) settings;
    }

    private final void setupAdapter(Bundle savedState) {
        List<QuestionPointAnswer> answers = getSurveyPoint().getAnswers();
        MicroColorScheme microColorScheme = this.f6381x;
        if (microColorScheme == null) {
            l.l("colorScheme");
            throw null;
        }
        d dVar = new d(answers, microColorScheme);
        this.E = dVar;
        dVar.f16885g = new g(9, this);
        QuestionPointAnswer questionPointAnswerD = d(savedState);
        if (questionPointAnswerD != null) {
            d dVar2 = this.E;
            if (dVar2 == null) {
                l.l("adapter");
                throw null;
            }
            dVar2.r(questionPointAnswerD);
        }
        d dVar3 = this.E;
        if (dVar3 != null) {
            this.B.setAdapter(dVar3);
        } else {
            l.l("adapter");
            throw null;
        }
    }

    private final void setupList(Bundle savedState) {
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, true);
        RecyclerView recyclerView = this.B;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(null);
        setupAdapter(savedState);
    }

    public final void b(b bVar, Bundle bundle) throws Resources.NotFoundException {
        this.f6380r = bVar;
        this.f6382y.a(bVar.f27476b);
        setupList(bundle);
        String string = bundle != null ? bundle.getString("COMMENT_FIELD_TEXT") : null;
        if (string == null) {
            string = "";
        }
        this.commentFieldText = string;
        String commentLabel = getSurveyPointSettings().getCommentLabel();
        String str = commentLabel != null ? commentLabel : "";
        MicroSurvicateCommentField microSurvicateCommentField = this.D;
        microSurvicateCommentField.setLabel(str);
        b bVar2 = this.f6380r;
        if (bVar2 == null) {
            l.l("bindingData");
            throw null;
        }
        String string2 = bVar2.f27477c;
        if (string2.length() == 0) {
            string2 = getResources().getString(u.survicate_input_text_placeholder);
            l.d(string2, "getString(...)");
        }
        microSurvicateCommentField.setInputHint(string2);
        b bVar3 = this.f6380r;
        if (bVar3 == null) {
            l.l("bindingData");
            throw null;
        }
        microSurvicateCommentField.setVisibility((!bVar3.a() || d(bundle) == null) ? 8 : 0);
        microSurvicateCommentField.a(this.commentFieldText, new bq.g(1, this, MicroSurveyPointCsatContentView.class, "onCommentChanged", "onCommentChanged(Ljava/lang/String;)V", 0, 12));
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
            zo.b r2 = r0.f6380r
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
            r2.setAnswer(r3)
            r2.setComment(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.survicate.surveys.presentation.csat.micro.MicroSurveyPointCsatContentView.c(com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer):com.survicate.surveys.infrastructure.network.SurveyAnswer");
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
        d dVar = this.E;
        if (dVar != null) {
            return (QuestionPointAnswer) dVar.f16884f;
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
