package com.survicate.surveys.presentation.single.micro;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import ar.a;
import ar.n;
import br.l;
import com.google.android.exoplayer2.q;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.survey.questions.DisclaimerSettings;
import com.survicate.surveys.entities.survey.questions.DisclaimerSettingsKt;
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
import on.r;
import on.t;
import u3.i0;
import u3.z;
import vp.d;
import vp.e;
import wo.g;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001-J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR6\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010 \u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR*\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u0016\u0010,\u001a\u0004\u0018\u00010)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/survicate/surveys/presentation/single/micro/MicroSurveyPointSingleView;", "Landroid/widget/FrameLayout;", "Lcom/survicate/surveys/entities/models/QuestionValidationState;", "getCurrentValidationState", "()Lcom/survicate/surveys/entities/models/QuestionValidationState;", "Lwo/g;", "getAnswer", "()Lwo/g;", "Landroid/os/Bundle;", "getCurrentUiState", "()Landroid/os/Bundle;", "Lkotlin/Function2;", "", "Llq/b0;", "a", "Lar/n;", "getOnAnswerSelected", "()Lar/n;", "setOnAnswerSelected", "(Lar/n;)V", "onAnswerSelected", "Lkotlin/Function0;", "d", "Lar/a;", "getOnCloseSurveyClick", "()Lar/a;", "setOnCloseSurveyClick", "(Lar/a;)V", "onCloseSurveyClick", "g", "getOnSubmitClick", "setOnSubmitClick", "onSubmitClick", "r", "getOnBackClick", "setOnBackClick", "onBackClick", "x", "getOnPoweredByClick", "setOnPoweredByClick", "onPoweredByClick", "Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "getDisclaimerSettings", "()Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "disclaimerSettings", "vp/d", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointSingleView extends FrameLayout {
    public static final /* synthetic */ int J = 0;
    public final CardView B;
    public final ViewGroup D;
    public final MicroSurveyHeader E;
    public final MicroSurveyPointSingleContentView F;
    public final MicroDisclaimerView G;
    public final MicroSubmitView H;
    public final MicroSurveyFooter I;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public n onAnswerSelected;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public a onCloseSurveyClick;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public a onSubmitClick;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public a onBackClick;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public a onPoweredByClick;

    /* renamed from: y, reason: collision with root package name */
    public d f6510y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurveyPointSingleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        View viewInflate = View.inflate(context, t.view_micro_survey_point_single, this);
        View viewFindViewById = viewInflate.findViewById(r.view_micro_survey_point_single_card);
        l.d(viewFindViewById, "findViewById(...)");
        this.B = (CardView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_survey_point_single_container);
        l.d(viewFindViewById2, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2;
        this.D = viewGroup;
        View viewFindViewById3 = viewInflate.findViewById(r.view_micro_survey_point_single_wrapper);
        l.d(viewFindViewById3, "findViewById(...)");
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(r.view_micro_survey_point_single_survey_header);
        l.d(viewFindViewById4, "findViewById(...)");
        MicroSurveyHeader microSurveyHeader = (MicroSurveyHeader) viewFindViewById4;
        this.E = microSurveyHeader;
        View viewFindViewById5 = viewInflate.findViewById(r.view_micro_survey_point_single_content);
        l.d(viewFindViewById5, "findViewById(...)");
        MicroSurveyPointSingleContentView microSurveyPointSingleContentView = (MicroSurveyPointSingleContentView) viewFindViewById5;
        this.F = microSurveyPointSingleContentView;
        View viewFindViewById6 = viewInflate.findViewById(r.view_micro_survey_point_single_disclaimer);
        l.d(viewFindViewById6, "findViewById(...)");
        MicroDisclaimerView microDisclaimerView = (MicroDisclaimerView) viewFindViewById6;
        this.G = microDisclaimerView;
        View viewFindViewById7 = viewInflate.findViewById(r.view_micro_survey_point_single_submit);
        l.d(viewFindViewById7, "findViewById(...)");
        MicroSubmitView microSubmitView = (MicroSubmitView) viewFindViewById7;
        this.H = microSubmitView;
        View viewFindViewById8 = viewInflate.findViewById(r.view_micro_survey_point_single_footer);
        l.d(viewFindViewById8, "findViewById(...)");
        MicroSurveyFooter microSurveyFooter = (MicroSurveyFooter) viewFindViewById8;
        this.I = microSurveyFooter;
        u0 u0Var = new u0(6);
        WeakHashMap weakHashMap = i0.f23177a;
        z.j(viewGroup, u0Var);
        List listI = e5.I(microDisclaimerView, microSubmitView, microSurveyFooter);
        Resources resources = viewGroup2.getResources();
        l.d(resources, "getResources(...)");
        if (!resources.getBoolean(on.n.isLandscape)) {
            z.j(viewGroup2, new b((View) viewGroup2, listI));
        }
        microSurveyPointSingleContentView.setOnAnswerSelected(new j1.a(15, this));
        microSurveyHeader.setOnCloseButtonListener(new bp.d(this, 8));
        microSubmitView.setOnSubmitClick(new e(this, 0));
        microSubmitView.setOnBackClick(new e(this, 1));
        microSurveyFooter.setOnPoweredByClick(new e(this, 2));
    }

    public static final boolean a(MicroSurveyPointSingleView microSurveyPointSingleView) {
        if (microSurveyPointSingleView.F.getWasAnswerWithCommentSelectedFirst()) {
            return false;
        }
        DisclaimerSettings disclaimerSettings = microSurveyPointSingleView.getDisclaimerSettings();
        return disclaimerSettings == null || !disclaimerSettings.getCheckboxVisible();
    }

    private final DisclaimerSettings getDisclaimerSettings() {
        d dVar = this.f6510y;
        if (dVar != null) {
            return dVar.f23941f.getDisclaimerSettings();
        }
        l.l("bindingData");
        throw null;
    }

    public final void b(d dVar, Bundle bundle) {
        this.f6510y = dVar;
        boolean z10 = !dVar.f23940e;
        CardView cardView = this.B;
        xu.d.b(cardView, z10);
        q qVar = new q(4, z10);
        WeakHashMap weakHashMap = i0.f23177a;
        z.j(cardView, qVar);
        vp.b bVar = dVar.f23936a;
        MicroSurveyPointSingleContentView microSurveyPointSingleContentView = this.F;
        microSurveyPointSingleContentView.a(bVar, bundle);
        microSurveyPointSingleContentView.setOnValidationStateUpdate(new kp.d(0, this, MicroSurveyPointSingleView.class, "updateSubmitState", "updateSubmitState()V", 0, 25));
        this.E.a(dVar.f23937b);
        this.I.setVisibility(dVar.f23939d ? 0 : 8);
        bq.a aVar = new bq.a(getDisclaimerSettings());
        MicroDisclaimerView microDisclaimerView = this.G;
        microDisclaimerView.a(aVar, bundle);
        microDisclaimerView.setVisibility(getDisclaimerSettings() != null ? 0 : 8);
        microDisclaimerView.setOnCheckboxToggle(new kp.d(0, this, MicroSurveyPointSingleView.class, "updateSubmitState", "updateSubmitState()V", 0, 26));
        d();
    }

    public final g c(List list) {
        DisclaimerSettings disclaimerSettings = getDisclaimerSettings();
        return new g(list, disclaimerSettings != null ? DisclaimerSettingsKt.getCheckboxStateToSend(disclaimerSettings, this.G.f6544r.isChecked()) : null);
    }

    public final void d() {
        d dVar = this.f6510y;
        if (dVar == null) {
            l.l("bindingData");
            throw null;
        }
        this.H.setState(f0.k(dVar.f23938c, getCurrentValidationState()));
    }

    public final g getAnswer() {
        return c(this.F.getAnswer());
    }

    public final Bundle getCurrentUiState() {
        return xu.d.T(this.F.getCurrentUiState(), this.G.getCurrentUiState());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[EDGE_INSN: B:65:0x0046->B:14:0x0046 BREAK  A[LOOP:0: B:8:0x0033->B:66:?]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.survicate.surveys.entities.models.QuestionValidationState getCurrentValidationState() {
        /*
            r10 = this;
            vp.d r0 = r10.f6510y
            if (r0 == 0) goto Lbe
            com.survicate.surveys.entities.survey.questions.question.single.SurveyPointSingleSettings r0 = r0.f23941f
            com.survicate.surveys.presentation.single.micro.MicroSurveyPointSingleContentView r1 = r10.F
            java.util.List r2 = r1.getAnswerItems()
            boolean r1 = r1.getWasAnswerWithCommentSelectedFirst()
            com.survicate.surveys.presentation.widget.MicroDisclaimerView r3 = r10.G
            android.widget.CheckBox r3 = r3.f6544r
            boolean r3 = r3.isChecked()
            java.lang.String r4 = "pointSettings"
            br.l.e(r0, r4)
            java.lang.String r4 = "answerItems"
            br.l.e(r2, r4)
            boolean r4 = r0.getIsMandatory()
            boolean r5 = r2.isEmpty()
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L2f
            goto L44
        L2f:
            java.util.Iterator r5 = r2.iterator()
        L33:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L44
            java.lang.Object r8 = r5.next()
            com.survicate.surveys.presentation.single.micro.MicroSurveyPointSingleAnswerItem r8 = (com.survicate.surveys.presentation.single.micro.MicroSurveyPointSingleAnswerItem) r8
            boolean r8 = r8.D
            if (r8 == 0) goto L33
            goto L46
        L44:
            if (r4 != 0) goto L48
        L46:
            r5 = r6
            goto L49
        L48:
            r5 = r7
        L49:
            boolean r8 = r2.isEmpty()
            if (r8 == 0) goto L51
        L4f:
            r2 = r6
            goto L80
        L51:
            java.util.Iterator r2 = r2.iterator()
        L55:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L4f
            java.lang.Object r8 = r2.next()
            com.survicate.surveys.presentation.single.micro.MicroSurveyPointSingleAnswerItem r8 = (com.survicate.surveys.presentation.single.micro.MicroSurveyPointSingleAnswerItem) r8
            boolean r9 = r8.D
            if (r9 == 0) goto L55
            boolean r9 = r8.f6495g
            if (r9 != 0) goto L6a
            goto L55
        L6a:
            java.lang.String r8 = r8.B
            boolean r8 = tt.l.D0(r8)
            if (r8 == 0) goto L55
            java.lang.Boolean r8 = r0.isCommentMandatory()
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            boolean r8 = br.l.a(r8, r9)
            if (r8 == 0) goto L7f
            goto L55
        L7f:
            r2 = r7
        L80:
            com.survicate.surveys.entities.survey.questions.DisclaimerSettings r8 = r0.getDisclaimerSettings()
            if (r8 != 0) goto L88
        L86:
            r3 = r6
            goto L98
        L88:
            if (r3 != 0) goto L86
            boolean r3 = r8.getCheckboxVisible()
            if (r3 == 0) goto L86
            boolean r3 = r8.getCheckboxRequired()
            if (r3 != 0) goto L97
            goto L86
        L97:
            r3 = r7
        L98:
            com.survicate.surveys.entities.survey.questions.DisclaimerSettings r0 = r0.getDisclaimerSettings()
            if (r0 == 0) goto La6
            boolean r0 = r0.getCheckboxVisible()
            if (r0 != r6) goto La6
            r0 = r6
            goto La7
        La6:
            r0 = r7
        La7:
            com.survicate.surveys.entities.models.QuestionValidationState r8 = new com.survicate.surveys.entities.models.QuestionValidationState
            if (r5 == 0) goto Lb1
            if (r2 == 0) goto Lb1
            if (r3 == 0) goto Lb1
            r2 = r6
            goto Lb2
        Lb1:
            r2 = r7
        Lb2:
            if (r4 == 0) goto Lb9
            if (r1 != 0) goto Lb9
            if (r0 != 0) goto Lb9
            goto Lba
        Lb9:
            r6 = r7
        Lba:
            r8.<init>(r2, r6)
            return r8
        Lbe:
            java.lang.String r0 = "bindingData"
            br.l.l(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.survicate.surveys.presentation.single.micro.MicroSurveyPointSingleView.getCurrentValidationState():com.survicate.surveys.entities.models.QuestionValidationState");
    }

    public final n getOnAnswerSelected() {
        return this.onAnswerSelected;
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

    public final void setOnAnswerSelected(n nVar) {
        this.onAnswerSelected = nVar;
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
