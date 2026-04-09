package com.survicate.surveys.presentation.multiple.micro;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import ar.a;
import bp.d;
import br.l;
import com.google.android.exoplayer2.q;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.survey.questions.DisclaimerSettings;
import com.survicate.surveys.entities.survey.questions.DisclaimerSettingsKt;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.presentation.widget.MicroDisclaimerView;
import com.survicate.surveys.presentation.widget.MicroSubmitView;
import com.survicate.surveys.presentation.widget.MicroSurveyFooter;
import com.survicate.surveys.presentation.widget.MicroSurveyHeader;
import i4.b;
import io.sentry.android.core.u0;
import ir.f0;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kp.c;
import kp.f;
import kp.g;
import on.n;
import on.r;
import on.t;
import u3.i0;
import u3.z;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001$J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u0016\u0010#\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/survicate/surveys/presentation/multiple/micro/MicroSurveyPointMultipleView;", "Landroid/widget/FrameLayout;", "Lcom/survicate/surveys/entities/models/QuestionValidationState;", "getCurrentValidationState", "()Lcom/survicate/surveys/entities/models/QuestionValidationState;", "Lwo/g;", "getAnswer", "()Lwo/g;", "Landroid/os/Bundle;", "getCurrentUiState", "()Landroid/os/Bundle;", "Lkotlin/Function0;", "Llq/b0;", "a", "Lar/a;", "getOnCloseSurveyClick", "()Lar/a;", "setOnCloseSurveyClick", "(Lar/a;)V", "onCloseSurveyClick", "d", "getOnSubmitClick", "setOnSubmitClick", "onSubmitClick", "g", "getOnBackClick", "setOnBackClick", "onBackClick", "r", "getOnPoweredByClick", "setOnPoweredByClick", "onPoweredByClick", "Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "getDisclaimerSettings", "()Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "disclaimerSettings", "kp/f", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointMultipleView extends FrameLayout {
    public static final /* synthetic */ int I = 0;
    public final ViewGroup B;
    public final MicroSurveyHeader D;
    public final MicroSurveyPointMultipleContentView E;
    public final MicroDisclaimerView F;
    public final MicroSubmitView G;
    public final MicroSurveyFooter H;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public a onCloseSurveyClick;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public a onSubmitClick;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public a onBackClick;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public a onPoweredByClick;

    /* renamed from: x, reason: collision with root package name */
    public f f6455x;

    /* renamed from: y, reason: collision with root package name */
    public final CardView f6456y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurveyPointMultipleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        View viewInflate = View.inflate(context, t.view_micro_survey_point_multiple, this);
        View viewFindViewById = viewInflate.findViewById(r.view_micro_survey_point_multiple_card);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6456y = (CardView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_survey_point_multiple_container);
        l.d(viewFindViewById2, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2;
        this.B = viewGroup;
        View viewFindViewById3 = viewInflate.findViewById(r.view_micro_survey_point_multiple_wrapper);
        l.d(viewFindViewById3, "findViewById(...)");
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(r.view_micro_survey_point_multiple_survey_header);
        l.d(viewFindViewById4, "findViewById(...)");
        MicroSurveyHeader microSurveyHeader = (MicroSurveyHeader) viewFindViewById4;
        this.D = microSurveyHeader;
        View viewFindViewById5 = viewInflate.findViewById(r.view_micro_survey_point_multiple_content);
        l.d(viewFindViewById5, "findViewById(...)");
        this.E = (MicroSurveyPointMultipleContentView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(r.view_micro_survey_point_multiple_disclaimer);
        l.d(viewFindViewById6, "findViewById(...)");
        MicroDisclaimerView microDisclaimerView = (MicroDisclaimerView) viewFindViewById6;
        this.F = microDisclaimerView;
        View viewFindViewById7 = viewInflate.findViewById(r.view_micro_survey_point_multiple_submit);
        l.d(viewFindViewById7, "findViewById(...)");
        MicroSubmitView microSubmitView = (MicroSubmitView) viewFindViewById7;
        this.G = microSubmitView;
        View viewFindViewById8 = viewInflate.findViewById(r.view_micro_survey_point_multiple_footer);
        l.d(viewFindViewById8, "findViewById(...)");
        MicroSurveyFooter microSurveyFooter = (MicroSurveyFooter) viewFindViewById8;
        this.H = microSurveyFooter;
        u0 u0Var = new u0(6);
        WeakHashMap weakHashMap = i0.f23177a;
        z.j(viewGroup, u0Var);
        List listI = e5.I(microDisclaimerView, microSubmitView, microSurveyFooter);
        Resources resources = viewGroup2.getResources();
        l.d(resources, "getResources(...)");
        if (!resources.getBoolean(n.isLandscape)) {
            z.j(viewGroup2, new b((View) viewGroup2, listI));
        }
        microSurveyHeader.setOnCloseButtonListener(new d(this, 4));
        microSubmitView.setOnSubmitClick(new g(this, 0));
        microSubmitView.setOnBackClick(new g(this, 1));
        microSurveyFooter.setOnPoweredByClick(new g(this, 2));
    }

    private final DisclaimerSettings getDisclaimerSettings() {
        f fVar = this.f6455x;
        if (fVar != null) {
            return fVar.f14479f.getDisclaimerSettings();
        }
        l.l("bindingData");
        throw null;
    }

    public final void a(f fVar, Bundle bundle) {
        this.f6455x = fVar;
        boolean z10 = !fVar.f14478e;
        CardView cardView = this.f6456y;
        xu.d.b(cardView, z10);
        q qVar = new q(4, z10);
        WeakHashMap weakHashMap = i0.f23177a;
        z.j(cardView, qVar);
        c cVar = fVar.f14474a;
        MicroSurveyPointMultipleContentView microSurveyPointMultipleContentView = this.E;
        microSurveyPointMultipleContentView.a(cVar, bundle);
        microSurveyPointMultipleContentView.setOnValidationStateUpdate(new kp.d(0, this, MicroSurveyPointMultipleView.class, "updateSubmitState", "updateSubmitState()V", 0, 4));
        this.D.a(fVar.f14475b);
        this.H.setVisibility(fVar.f14477d ? 0 : 8);
        bq.a aVar = new bq.a(getDisclaimerSettings());
        MicroDisclaimerView microDisclaimerView = this.F;
        microDisclaimerView.a(aVar, bundle);
        microDisclaimerView.setVisibility(getDisclaimerSettings() != null ? 0 : 8);
        microDisclaimerView.setOnCheckboxToggle(new kp.d(0, this, MicroSurveyPointMultipleView.class, "updateSubmitState", "updateSubmitState()V", 0, 5));
        b();
    }

    public final void b() {
        f fVar = this.f6455x;
        if (fVar == null) {
            l.l("bindingData");
            throw null;
        }
        this.G.setState(f0.k(fVar.f14476c, getCurrentValidationState()));
    }

    public final wo.g getAnswer() {
        List<SurveyAnswer> answer = this.E.getAnswer();
        DisclaimerSettings disclaimerSettings = getDisclaimerSettings();
        return new wo.g(answer, disclaimerSettings != null ? DisclaimerSettingsKt.getCheckboxStateToSend(disclaimerSettings, this.F.f6544r.isChecked()) : null);
    }

    public final Bundle getCurrentUiState() {
        return xu.d.T(this.E.getCurrentUiState(), this.F.getCurrentUiState());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042 A[EDGE_INSN: B:54:0x0042->B:14:0x0042 BREAK  A[LOOP:0: B:8:0x002f->B:55:?]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.survicate.surveys.entities.models.QuestionValidationState getCurrentValidationState() {
        /*
            r8 = this;
            kp.f r0 = r8.f6455x
            if (r0 == 0) goto La2
            com.survicate.surveys.entities.survey.questions.question.multiple.SurveyPointMultipleSettings r0 = r0.f14479f
            com.survicate.surveys.presentation.multiple.micro.MicroSurveyPointMultipleContentView r1 = r8.E
            java.util.List r1 = r1.getAnswerItems()
            com.survicate.surveys.presentation.widget.MicroDisclaimerView r2 = r8.F
            android.widget.CheckBox r2 = r2.f6544r
            boolean r2 = r2.isChecked()
            java.lang.String r3 = "pointSettings"
            br.l.e(r0, r3)
            java.lang.String r3 = "answerItems"
            br.l.e(r1, r3)
            boolean r3 = r0.getIsMandatory()
            boolean r4 = r1.isEmpty()
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L2b
            goto L40
        L2b:
            java.util.Iterator r4 = r1.iterator()
        L2f:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L40
            java.lang.Object r7 = r4.next()
            com.survicate.surveys.presentation.multiple.micro.MicroSurveyPointMultipleAnswerItem r7 = (com.survicate.surveys.presentation.multiple.micro.MicroSurveyPointMultipleAnswerItem) r7
            boolean r7 = r7.B
            if (r7 == 0) goto L2f
            goto L42
        L40:
            if (r3 != 0) goto L44
        L42:
            r3 = r6
            goto L45
        L44:
            r3 = r5
        L45:
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L4d
        L4b:
            r1 = r6
            goto L7c
        L4d:
            java.util.Iterator r1 = r1.iterator()
        L51:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r1.next()
            com.survicate.surveys.presentation.multiple.micro.MicroSurveyPointMultipleAnswerItem r4 = (com.survicate.surveys.presentation.multiple.micro.MicroSurveyPointMultipleAnswerItem) r4
            boolean r7 = r4.B
            if (r7 == 0) goto L51
            boolean r7 = r4.f6441g
            if (r7 != 0) goto L66
            goto L51
        L66:
            java.lang.String r4 = r4.f6444y
            boolean r4 = tt.l.D0(r4)
            if (r4 == 0) goto L51
            java.lang.Boolean r4 = r0.isCommentMandatory()
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            boolean r4 = br.l.a(r4, r7)
            if (r4 == 0) goto L7b
            goto L51
        L7b:
            r1 = r5
        L7c:
            com.survicate.surveys.entities.survey.questions.DisclaimerSettings r0 = r0.getDisclaimerSettings()
            if (r0 != 0) goto L84
        L82:
            r0 = r6
            goto L94
        L84:
            if (r2 != 0) goto L82
            boolean r2 = r0.getCheckboxVisible()
            if (r2 == 0) goto L82
            boolean r0 = r0.getCheckboxRequired()
            if (r0 != 0) goto L93
            goto L82
        L93:
            r0 = r5
        L94:
            com.survicate.surveys.entities.models.QuestionValidationState r2 = new com.survicate.surveys.entities.models.QuestionValidationState
            if (r3 == 0) goto L9d
            if (r1 == 0) goto L9d
            if (r0 == 0) goto L9d
            goto L9e
        L9d:
            r6 = r5
        L9e:
            r2.<init>(r6, r5)
            return r2
        La2:
            java.lang.String r0 = "bindingData"
            br.l.l(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.survicate.surveys.presentation.multiple.micro.MicroSurveyPointMultipleView.getCurrentValidationState():com.survicate.surveys.entities.models.QuestionValidationState");
    }

    public final a getOnBackClick() {
        return this.onBackClick;
    }

    public final a getOnCloseSurveyClick() {
        return this.onCloseSurveyClick;
    }

    public final a getOnPoweredByClick() {
        return this.onPoweredByClick;
    }

    public final a getOnSubmitClick() {
        return this.onSubmitClick;
    }

    public final void setOnBackClick(a aVar) {
        this.onBackClick = aVar;
    }

    public final void setOnCloseSurveyClick(a aVar) {
        this.onCloseSurveyClick = aVar;
    }

    public final void setOnPoweredByClick(a aVar) {
        this.onPoweredByClick = aVar;
    }

    public final void setOnSubmitClick(a aVar) {
        this.onSubmitClick = aVar;
    }
}
