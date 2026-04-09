package com.survicate.surveys.presentation.text.micro;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import ar.a;
import bp.d;
import br.l;
import com.google.android.exoplayer2.q;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.models.QuestionValidationState;
import com.survicate.surveys.entities.survey.questions.DisclaimerSettings;
import com.survicate.surveys.entities.survey.questions.DisclaimerSettingsKt;
import com.survicate.surveys.entities.survey.questions.question.text.SurveyPointTextSettings;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.presentation.widget.MicroDisclaimerView;
import com.survicate.surveys.presentation.widget.MicroSubmitView;
import com.survicate.surveys.presentation.widget.MicroSurveyFooter;
import com.survicate.surveys.presentation.widget.MicroSurveyHeader;
import h7.f;
import i4.b;
import io.sentry.android.core.u0;
import ir.f0;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import mq.o;
import no.e;
import on.n;
import on.r;
import on.t;
import u3.i0;
import u3.z;
import xp.c;
import zp.g;
import zp.j;
import zp.k;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001)J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u0016\u0010#\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/survicate/surveys/presentation/text/micro/MicroSurveyPointTextView;", "Landroid/widget/FrameLayout;", "Lcom/survicate/surveys/entities/models/QuestionValidationState;", "getCurrentValidationState", "()Lcom/survicate/surveys/entities/models/QuestionValidationState;", "Lwo/g;", "getAnswer", "()Lwo/g;", "Landroid/os/Bundle;", "getCurrentUiState", "()Landroid/os/Bundle;", "Lkotlin/Function0;", "Llq/b0;", "a", "Lar/a;", "getOnCloseSurveyClick", "()Lar/a;", "setOnCloseSurveyClick", "(Lar/a;)V", "onCloseSurveyClick", "d", "getOnSubmitClick", "setOnSubmitClick", "onSubmitClick", "g", "getOnBackClick", "setOnBackClick", "onBackClick", "r", "getOnPoweredByClick", "setOnPoweredByClick", "onPoweredByClick", "Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "getDisclaimerSettings", "()Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "disclaimerSettings", "", "Lcom/survicate/surveys/presentation/text/micro/MicroSurveyPointTextAdapterItem;", "getAnswers", "()Ljava/util/List;", "answers", "zp/j", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointTextView extends FrameLayout {
    public static final /* synthetic */ int I = 0;
    public final ViewGroup B;
    public final MicroSurveyHeader D;
    public final MicroSurveyPointTextContentView E;
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
    public j f6539x;

    /* renamed from: y, reason: collision with root package name */
    public final CardView f6540y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurveyPointTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        View viewInflate = View.inflate(context, t.view_micro_survey_point_text, this);
        View viewFindViewById = viewInflate.findViewById(r.view_micro_survey_point_text_card);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6540y = (CardView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_survey_point_text_container);
        l.d(viewFindViewById2, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2;
        this.B = viewGroup;
        View viewFindViewById3 = viewInflate.findViewById(r.view_micro_survey_point_text_wrapper);
        l.d(viewFindViewById3, "findViewById(...)");
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(r.view_micro_survey_point_text_survey_header);
        l.d(viewFindViewById4, "findViewById(...)");
        MicroSurveyHeader microSurveyHeader = (MicroSurveyHeader) viewFindViewById4;
        this.D = microSurveyHeader;
        View viewFindViewById5 = viewInflate.findViewById(r.view_micro_survey_point_text_content);
        l.d(viewFindViewById5, "findViewById(...)");
        this.E = (MicroSurveyPointTextContentView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(r.view_micro_survey_point_text_disclaimer);
        l.d(viewFindViewById6, "findViewById(...)");
        MicroDisclaimerView microDisclaimerView = (MicroDisclaimerView) viewFindViewById6;
        this.F = microDisclaimerView;
        View viewFindViewById7 = viewInflate.findViewById(r.view_micro_survey_point_text_submit);
        l.d(viewFindViewById7, "findViewById(...)");
        MicroSubmitView microSubmitView = (MicroSubmitView) viewFindViewById7;
        this.G = microSubmitView;
        View viewFindViewById8 = viewInflate.findViewById(r.view_micro_survey_point_text_footer);
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
        microSurveyHeader.setOnCloseButtonListener(new d(this, 11));
        microSubmitView.setOnSubmitClick(new k(this, 0));
        microSubmitView.setOnBackClick(new k(this, 1));
        microSurveyFooter.setOnPoweredByClick(new k(this, 2));
    }

    private final DisclaimerSettings getDisclaimerSettings() {
        j jVar = this.f6539x;
        if (jVar != null) {
            return jVar.f27517f.getDisclaimerSettings();
        }
        l.l("bindingData");
        throw null;
    }

    public final void a(j jVar, Bundle bundle) {
        this.f6539x = jVar;
        boolean z10 = !jVar.f27516e;
        CardView cardView = this.f6540y;
        xu.d.b(cardView, z10);
        q qVar = new q(4, z10);
        WeakHashMap weakHashMap = i0.f23177a;
        z.j(cardView, qVar);
        g gVar = jVar.f27512a;
        MicroSurveyPointTextContentView microSurveyPointTextContentView = this.E;
        microSurveyPointTextContentView.c(gVar, bundle);
        microSurveyPointTextContentView.setOnValidationStateUpdate(new c(0, this, MicroSurveyPointTextView.class, "updateSubmitState", "updateSubmitState()V", 0, 13));
        this.D.a(jVar.f27513b);
        this.H.setVisibility(jVar.f27515d ? 0 : 8);
        bq.a aVar = new bq.a(getDisclaimerSettings());
        MicroDisclaimerView microDisclaimerView = this.F;
        microDisclaimerView.a(aVar, bundle);
        microDisclaimerView.setVisibility(getDisclaimerSettings() != null ? 0 : 8);
        microDisclaimerView.setOnCheckboxToggle(new c(0, this, MicroSurveyPointTextView.class, "updateSubmitState", "updateSubmitState()V", 0, 14));
        c();
    }

    public final void b(boolean z10) {
        MicroSurveyPointTextContentView microSurveyPointTextContentView = this.E;
        RecyclerView recyclerView = microSurveyPointTextContentView.f6532r;
        e eVar = microSurveyPointTextContentView.f6533x;
        if (microSurveyPointTextContentView.d()) {
            if (!z10) {
                f fVar = microSurveyPointTextContentView.f6534y;
                if (fVar == null) {
                    l.l("recyclerAdapter");
                    throw null;
                }
                f fVar2 = microSurveyPointTextContentView.D;
                if (fVar2 == null) {
                    l.l("progressAdapter");
                    throw null;
                }
                fVar.s(fVar2);
                recyclerView.Q();
                RecyclerView recyclerView2 = microSurveyPointTextContentView.f6532r;
                recyclerView2.M.remove(eVar);
                if (recyclerView2.N == eVar) {
                    recyclerView2.N = null;
                    return;
                }
                return;
            }
            f fVar3 = microSurveyPointTextContentView.f6534y;
            if (fVar3 == null) {
                l.l("recyclerAdapter");
                throw null;
            }
            List listR = fVar3.r();
            l.d(listR, "getAdapters(...)");
            f fVar4 = microSurveyPointTextContentView.D;
            if (fVar4 == null) {
                l.l("progressAdapter");
                throw null;
            }
            if (!o.k0(listR, fVar4)) {
                f fVar5 = microSurveyPointTextContentView.f6534y;
                if (fVar5 == null) {
                    l.l("recyclerAdapter");
                    throw null;
                }
                f fVar6 = microSurveyPointTextContentView.D;
                if (fVar6 == null) {
                    l.l("progressAdapter");
                    throw null;
                }
                fVar5.q(fVar6);
                recyclerView.Q();
            }
            recyclerView.clearFocus();
            recyclerView.M.add(eVar);
            microSurveyPointTextContentView.f();
        }
    }

    public final void c() {
        j jVar = this.f6539x;
        if (jVar == null) {
            l.l("bindingData");
            throw null;
        }
        this.G.setState(f0.k(jVar.f27514c, getCurrentValidationState()));
    }

    public final wo.g getAnswer() {
        List<SurveyAnswer> answer = this.E.getAnswer();
        DisclaimerSettings disclaimerSettings = getDisclaimerSettings();
        return new wo.g(answer, disclaimerSettings != null ? DisclaimerSettingsKt.getCheckboxStateToSend(disclaimerSettings, this.F.f6544r.isChecked()) : null);
    }

    public final List<MicroSurveyPointTextAdapterItem> getAnswers() {
        return this.E.getAnswerItems();
    }

    public final Bundle getCurrentUiState() {
        return xu.d.T(this.E.getCurrentUiState(), this.F.getCurrentUiState());
    }

    public final QuestionValidationState getCurrentValidationState() {
        boolean z10;
        j jVar = this.f6539x;
        if (jVar == null) {
            l.l("bindingData");
            throw null;
        }
        SurveyPointTextSettings surveyPointTextSettings = jVar.f27517f;
        List<MicroSurveyPointTextAdapterItem> answerItems = this.E.getAnswerItems();
        if (answerItems == null || !answerItems.isEmpty()) {
            Iterator<T> it = answerItems.iterator();
            while (it.hasNext()) {
                if (tt.l.D0(((MicroSurveyPointTextAdapterItem) it.next()).f6525g.f6527a)) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
        } else {
            z10 = true;
        }
        boolean zIsChecked = this.F.f6544r.isChecked();
        l.e(surveyPointTextSettings, "pointSettings");
        boolean z11 = z10 || !surveyPointTextSettings.getIsMandatory();
        DisclaimerSettings disclaimerSettings = surveyPointTextSettings.getDisclaimerSettings();
        return new QuestionValidationState(z11 && (disclaimerSettings == null || zIsChecked || !disclaimerSettings.getCheckboxVisible() || !disclaimerSettings.getCheckboxRequired()), false);
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
