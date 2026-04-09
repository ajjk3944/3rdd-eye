package com.survicate.surveys.presentation.nps.micro;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import ar.a;
import ar.k;
import br.l;
import c3.f;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.models.SurvicateNpsAnswerOption;
import com.survicate.surveys.entities.survey.questions.nps.AnswerLayout;
import com.survicate.surveys.entities.survey.questions.nps.SurveyNpsPointSettings;
import com.survicate.surveys.entities.survey.questions.nps.SurveyNpsSurveyPoint;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.presentation.widget.MicroQuestionHeader;
import com.survicate.surveys.presentation.widget.MicroSurvicateCommentField;
import java.util.List;
import kotlin.Metadata;
import mp.b;
import mp.h;
import mq.w;
import np.c;
import np.e;
import np.g;
import np.i;
import on.n;
import on.p;
import on.r;
import on.t;
import on.u;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u00014J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR0\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0013\u0010+\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/survicate/surveys/presentation/nps/micro/MicroSurveyPointNpsContentView;", "Landroid/widget/FrameLayout;", "", "Lcom/survicate/surveys/infrastructure/network/SurveyAnswer;", "getAnswer", "()Ljava/util/List;", "Landroid/os/Bundle;", "getCurrentUiState", "()Landroid/os/Bundle;", "savedState", "Llq/b0;", "setupList", "(Landroid/os/Bundle;)V", "setupAdapter", "Lnp/c;", "getAnswerStyle", "()Lnp/c;", "", "<set-?>", "a", "Ljava/lang/String;", "getCommentFieldText", "()Ljava/lang/String;", "commentFieldText", "Lkotlin/Function0;", "d", "Lar/a;", "getOnValidationStateUpdate", "()Lar/a;", "setOnValidationStateUpdate", "(Lar/a;)V", "onValidationStateUpdate", "Lkotlin/Function1;", "g", "Lar/k;", "getOnAnswerSelected", "()Lar/k;", "setOnAnswerSelected", "(Lar/k;)V", "onAnswerSelected", "Lcom/survicate/surveys/entities/models/SurvicateNpsAnswerOption;", "getSelectedAnswer", "()Lcom/survicate/surveys/entities/models/SurvicateNpsAnswerOption;", "selectedAnswer", "Lcom/survicate/surveys/entities/survey/questions/nps/SurveyNpsSurveyPoint;", "getSurveyPoint", "()Lcom/survicate/surveys/entities/survey/questions/nps/SurveyNpsSurveyPoint;", "surveyPoint", "Lcom/survicate/surveys/entities/survey/questions/nps/SurveyNpsPointSettings;", "getSurveyPointSettings", "()Lcom/survicate/surveys/entities/survey/questions/nps/SurveyNpsPointSettings;", "surveyPointSettings", "mp/b", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointNpsContentView extends FrameLayout {
    public static final /* synthetic */ int H = 0;
    public final RecyclerView B;
    public final TextView D;
    public final TextView E;
    public final MicroSurvicateCommentField F;
    public e G;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public String commentFieldText;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public a onValidationStateUpdate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public k onAnswerSelected;

    /* renamed from: r, reason: collision with root package name */
    public b f6460r;

    /* renamed from: x, reason: collision with root package name */
    public MicroColorScheme f6461x;

    /* renamed from: y, reason: collision with root package name */
    public final MicroQuestionHeader f6462y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurveyPointNpsContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        this.commentFieldText = "";
        View viewInflate = View.inflate(context, t.view_micro_survey_point_nps_content, this);
        View viewFindViewById = viewInflate.findViewById(r.view_micro_survey_point_nps_content_header);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6462y = (MicroQuestionHeader) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_survey_point_nps_content_recycler);
        l.d(viewFindViewById2, "findViewById(...)");
        this.B = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(r.view_micro_question_legend_label_left);
        l.d(viewFindViewById3, "findViewById(...)");
        this.D = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(r.view_micro_question_legend_label_right);
        l.d(viewFindViewById4, "findViewById(...)");
        this.E = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(r.view_micro_survey_point_nps_content_comment_field);
        l.d(viewFindViewById5, "findViewById(...)");
        this.F = (MicroSurvicateCommentField) viewFindViewById5;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.survicate.surveys.presentation.nps.micro.MicroSurveyPointNpsContentView r6, rq.c r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof mp.d
            if (r0 == 0) goto L16
            r0 = r7
            mp.d r0 = (mp.d) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.B = r1
            goto L1b
        L16:
            mp.d r0 = new mp.d
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f16909x
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            lq.b0 r3 = lq.b0.f15562a
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            com.survicate.surveys.presentation.nps.micro.MicroSurveyPointNpsContentView r6 = r0.f16908r
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
            r0.f16908r = r6
            r0.B = r4
            r4 = 250(0xfa, double:1.235E-321)
            java.lang.Object r7 = wt.w.h(r4, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            com.survicate.surveys.presentation.widget.MicroSurvicateCommentField r7 = r6.F
            boolean r0 = r7.isLaidOut()
            if (r0 == 0) goto L6a
            boolean r0 = r7.isLayoutRequested()
            if (r0 != 0) goto L6a
            com.survicate.surveys.presentation.widget.MicroSurvicateCommentField r6 = r6.F
            r6.d()
            return r3
        L6a:
            jd.a r0 = new jd.a
            r1 = 1
            r0.<init>(r1, r6)
            r7.addOnLayoutChangeListener(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.survicate.surveys.presentation.nps.micro.MicroSurveyPointNpsContentView.a(com.survicate.surveys.presentation.nps.micro.MicroSurveyPointNpsContentView, rq.c):java.lang.Object");
    }

    public static SurvicateNpsAnswerOption e(Bundle bundle) {
        Object serializable;
        if (bundle == null || !bundle.containsKey("SELECTED_ANSWER")) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            serializable = bundle.getSerializable("SELECTED_ANSWER", SurvicateNpsAnswerOption.class);
        } else {
            Object serializable2 = bundle.getSerializable("SELECTED_ANSWER");
            serializable = (SurvicateNpsAnswerOption) (serializable2 instanceof SurvicateNpsAnswerOption ? serializable2 : null);
        }
        return (SurvicateNpsAnswerOption) serializable;
    }

    private final c getAnswerStyle() throws Resources.NotFoundException {
        AnswerLayout answersLayout = getSurveyPointSettings().getAnswersLayout();
        if (answersLayout == null) {
            answersLayout = AnswerLayout.Default;
        }
        Resources resources = getResources();
        l.d(resources, "getResources(...)");
        boolean z10 = resources.getBoolean(n.isWideScreen);
        c.Companion.getClass();
        l.e(answersLayout, "layout");
        int i10 = np.a.f18472a[answersLayout.ordinal()];
        if (i10 == 1) {
            return z10 ? c.Horizontal : c.Vertical;
        }
        if (i10 == 2) {
            return z10 ? c.Horizontal : c.PortraitHorizontal;
        }
        throw new bf.n();
    }

    private final SurveyNpsSurveyPoint getSurveyPoint() {
        b bVar = this.f6460r;
        if (bVar != null) {
            return bVar.f16903a;
        }
        l.l("bindingData");
        throw null;
    }

    private final SurveyNpsPointSettings getSurveyPointSettings() {
        return getSurveyPoint().getSettings();
    }

    private final void setupAdapter(Bundle savedState) throws Resources.NotFoundException {
        int i10 = mp.c.f16907a[getAnswerStyle().ordinal()];
        RecyclerView recyclerView = this.B;
        if (i10 == 1) {
            MicroColorScheme microColorScheme = this.f6461x;
            if (microColorScheme == null) {
                l.l("colorScheme");
                throw null;
            }
            this.G = new g(1, getSurveyPointSettings(), microColorScheme);
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, true));
        } else if (i10 == 2) {
            MicroColorScheme microColorScheme2 = this.f6461x;
            if (microColorScheme2 == null) {
                l.l("colorScheme");
                throw null;
            }
            this.G = new g(0, getSurveyPointSettings(), microColorScheme2);
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            recyclerView.i(new xo.a(getResources().getDimensionPixelSize(p.survicate_micro_question_nps_horizontal_item_spacing)));
            recyclerView.setOverScrollMode(2);
        } else if (i10 == 3) {
            Context context = getContext();
            l.d(context, "getContext(...)");
            b bVar = this.f6460r;
            if (bVar == null) {
                l.l("bindingData");
                throw null;
            }
            int i11 = bVar.f16906d;
            Resources resources = context.getResources();
            int dimension = ((int) resources.getDimension(p.survicate_micro_page_padding)) * 2;
            float dimension2 = resources.getDimension(p.survicate_micro_question_nps_portrait_horizontal_item_spacing);
            int iMin = (int) (Math.min((i11 - dimension) - (5 * dimension2), resources.getDimension(p.survicate_micro_question_nps_portrait_horizontal_max_item_size) * 6) / 6);
            mp.a aVar = new mp.a(iMin, (int) dimension2);
            MicroColorScheme microColorScheme3 = this.f6461x;
            if (microColorScheme3 == null) {
                l.l("colorScheme");
                throw null;
            }
            this.G = new i(iMin, getSurveyPointSettings(), microColorScheme3);
            recyclerView.setLayoutManager(new StaggeredGridLayoutManager());
            recyclerView.i(new h(aVar));
            recyclerView.setOverScrollMode(2);
        }
        e eVar = this.G;
        if (eVar == null) {
            l.l("adapter");
            throw null;
        }
        eVar.f18478h = new bq.g(1, this, MicroSurveyPointNpsContentView.class, "onAnswerSelected", "onAnswerSelected(Lcom/survicate/surveys/entities/models/SurvicateNpsAnswerOption;)V", 0, 5);
        SurvicateNpsAnswerOption survicateNpsAnswerOptionE = e(savedState);
        if (survicateNpsAnswerOptionE != null) {
            e eVar2 = this.G;
            if (eVar2 == null) {
                l.l("adapter");
                throw null;
            }
            eVar2.t(survicateNpsAnswerOptionE);
        }
        e eVar3 = this.G;
        if (eVar3 != null) {
            recyclerView.setAdapter(eVar3);
        } else {
            l.l("adapter");
            throw null;
        }
    }

    private final void setupList(Bundle savedState) throws Resources.NotFoundException {
        RecyclerView recyclerView = this.B;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        l.c(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        f fVar = (f) layoutParams;
        boolean z10 = getAnswerStyle() == c.Vertical;
        fVar.W = !z10;
        ((ViewGroup.MarginLayoutParams) fVar).width = z10 ? 0 : -2;
        recyclerView.setLayoutParams(fVar);
        recyclerView.setItemAnimator(null);
        setupAdapter(savedState);
    }

    public final void b(b bVar, Bundle bundle) throws Resources.NotFoundException {
        this.f6460r = bVar;
        this.f6462y.a(bVar.f16904b);
        setupList(bundle);
        c answerStyle = getAnswerStyle();
        Context context = getContext();
        l.d(context, "getContext(...)");
        String textOnTheLeft = getSurveyPointSettings().getTextOnTheLeft();
        if (textOnTheLeft == null) {
            textOnTheLeft = "";
        }
        String leftDescription = answerStyle.getLeftDescription(context, textOnTheLeft);
        TextView textView = this.D;
        l.e(textView, "<this>");
        int i10 = 8;
        textView.setVisibility((leftDescription == null || tt.l.D0(leftDescription)) ? 8 : 0);
        textView.setText(leftDescription);
        MicroColorScheme microColorScheme = this.f6461x;
        if (microColorScheme == null) {
            l.l("colorScheme");
            throw null;
        }
        textView.setTextColor(microColorScheme.getAnswer());
        Context context2 = getContext();
        l.d(context2, "getContext(...)");
        String textOnTheRight = getSurveyPointSettings().getTextOnTheRight();
        if (textOnTheRight == null) {
            textOnTheRight = "";
        }
        String rightDescription = answerStyle.getRightDescription(context2, textOnTheRight);
        TextView textView2 = this.E;
        l.e(textView2, "<this>");
        textView2.setVisibility((rightDescription == null || tt.l.D0(rightDescription)) ? 8 : 0);
        textView2.setText(rightDescription);
        MicroColorScheme microColorScheme2 = this.f6461x;
        if (microColorScheme2 == null) {
            l.l("colorScheme");
            throw null;
        }
        textView2.setTextColor(microColorScheme2.getAnswer());
        String string = bundle != null ? bundle.getString("COMMENT_FIELD_TEXT") : null;
        if (string == null) {
            string = "";
        }
        this.commentFieldText = string;
        String commentLabel = getSurveyPointSettings().getCommentLabel();
        String str = commentLabel != null ? commentLabel : "";
        MicroSurvicateCommentField microSurvicateCommentField = this.F;
        microSurvicateCommentField.setLabel(str);
        b bVar2 = this.f6460r;
        if (bVar2 == null) {
            l.l("bindingData");
            throw null;
        }
        String string2 = bVar2.f16905c;
        if (string2.length() == 0) {
            string2 = getResources().getString(u.survicate_input_text_placeholder);
            l.d(string2, "getString(...)");
        }
        microSurvicateCommentField.setInputHint(string2);
        if (d() && e(bundle) != null) {
            i10 = 0;
        }
        microSurvicateCommentField.setVisibility(i10);
        microSurvicateCommentField.a(this.commentFieldText, new bq.g(1, this, MicroSurveyPointNpsContentView.class, "onCommentChanged", "onCommentChanged(Ljava/lang/String;)V", 0, 4));
    }

    public final SurveyAnswer c(SurvicateNpsAnswerOption survicateNpsAnswerOption) {
        String str = this.commentFieldText;
        if (tt.l.D0(str) || !d()) {
            str = null;
        }
        SurveyAnswer surveyAnswer = new SurveyAnswer(null, null, null, null, null, 0.0d, null, null, null, null, null, null, 4095, null);
        surveyAnswer.setContent(String.valueOf(survicateNpsAnswerOption.getValue()));
        surveyAnswer.setAnswer(String.valueOf(survicateNpsAnswerOption.getValue()));
        surveyAnswer.setAnswerId(Long.valueOf(survicateNpsAnswerOption.getValue()));
        surveyAnswer.setComment(str);
        return surveyAnswer;
    }

    public final boolean d() {
        return getSurveyPoint().getSettings().getAddComment();
    }

    public final List<SurveyAnswer> getAnswer() {
        SurvicateNpsAnswerOption selectedAnswer = getSelectedAnswer();
        return selectedAnswer == null ? w.f16945a : e5.H(c(selectedAnswer));
    }

    public final String getCommentFieldText() {
        return this.commentFieldText;
    }

    public final Bundle getCurrentUiState() {
        Bundle bundle = new Bundle();
        SurvicateNpsAnswerOption selectedAnswer = getSelectedAnswer();
        if (selectedAnswer != null) {
            bundle.putSerializable("SELECTED_ANSWER", selectedAnswer);
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

    public final SurvicateNpsAnswerOption getSelectedAnswer() {
        e eVar = this.G;
        if (eVar != null) {
            return (SurvicateNpsAnswerOption) eVar.f18477g;
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
