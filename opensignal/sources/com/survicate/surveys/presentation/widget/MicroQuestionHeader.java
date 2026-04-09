package com.survicate.surveys.presentation.widget;

import a.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bq.c;
import bq.g;
import br.l;
import c3.p;
import com.survicate.surveys.entities.survey.questions.SurveyPointImage;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.infrastructure.network.image.SurvicateImageLoader;
import h7.r1;
import kotlin.Metadata;
import on.m;
import on.r;
import on.t;
import on.u;
import vc.e;
import xu.d;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/survicate/surveys/presentation/widget/MicroQuestionHeader;", "Landroid/widget/FrameLayout;", "", "getDefaultAnswerRequiredLabel", "()Ljava/lang/String;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroQuestionHeader extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f6558a;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f6559d;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f6560g;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f6561r;

    /* renamed from: x, reason: collision with root package name */
    public final MicroSurveyPointImage f6562x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroQuestionHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        View viewInflate = View.inflate(context, t.view_micro_question_header, this);
        View viewFindViewById = viewInflate.findViewById(r.view_micro_question_header_root);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6558a = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_question_header_introduction);
        l.d(viewFindViewById2, "findViewById(...)");
        this.f6559d = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(r.view_micro_question_header_title);
        l.d(viewFindViewById3, "findViewById(...)");
        this.f6560g = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(r.view_micro_question_header_answer_required_label);
        l.d(viewFindViewById4, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById4;
        this.f6561r = textView;
        View viewFindViewById5 = viewInflate.findViewById(r.view_micro_question_header_image);
        l.d(viewFindViewById5, "findViewById(...)");
        this.f6562x = (MicroSurveyPointImage) viewFindViewById5;
        textView.setFocusable(d.S(context));
    }

    private final String getDefaultAnswerRequiredLabel() {
        String string = getContext().getString(u.survicate_answer_required_label);
        l.d(string, "getString(...)");
        return string;
    }

    public final void a(QuestionHeaderBindingData questionHeaderBindingData) {
        l.e(questionHeaderBindingData, "data");
        SurveyPointImageBindingData surveyPointImageBindingData = questionHeaderBindingData.f6601x;
        String str = questionHeaderBindingData.f6597a;
        TextView textView = this.f6559d;
        a.A(textView, str);
        String str2 = questionHeaderBindingData.f6598d;
        TextView textView2 = this.f6560g;
        a.A(textView2, str2);
        boolean z10 = questionHeaderBindingData.f6600r;
        int i10 = z10 ? 0 : 8;
        TextView textView3 = this.f6561r;
        textView3.setVisibility(i10);
        if (z10) {
            String defaultAnswerRequiredLabel = questionHeaderBindingData.f6599g;
            if (defaultAnswerRequiredLabel.length() == 0) {
                defaultAnswerRequiredLabel = getDefaultAnswerRequiredLabel();
            }
            textView3.setText(defaultAnswerRequiredLabel);
        }
        int i11 = (surveyPointImageBindingData != null ? surveyPointImageBindingData.f6602a : null) != null ? 0 : 8;
        MicroSurveyPointImage microSurveyPointImage = this.f6562x;
        microSurveyPointImage.setVisibility(i11);
        if ((surveyPointImageBindingData != null ? surveyPointImageBindingData.f6602a : null) != null) {
            int i12 = c.f2861a[surveyPointImageBindingData.f6602a.getPosition().ordinal()];
            ConstraintLayout constraintLayout = this.f6558a;
            if (i12 == 1) {
                p pVar = new p();
                pVar.c(constraintLayout);
                microSurveyPointImage.setPadding(0, getResources().getDimensionPixelSize(on.p.survicate_micro_space_xs), 0, getResources().getDimensionPixelSize(on.p.survicate_micro_space_md));
                pVar.d(microSurveyPointImage.getId(), 3, constraintLayout.getId(), 3);
                pVar.d(microSurveyPointImage.getId(), 4, textView.getId(), 3);
                pVar.d(textView.getId(), 3, microSurveyPointImage.getId(), 4);
                pVar.d(textView2.getId(), 4, textView3.getId(), 3);
                pVar.d(textView3.getId(), 3, textView2.getId(), 4);
                pVar.a(constraintLayout);
                constraintLayout.setConstraintSet(null);
                constraintLayout.requestLayout();
            } else if (i12 == 2) {
                p pVar2 = new p();
                pVar2.c(constraintLayout);
                microSurveyPointImage.setPadding(0, getResources().getDimensionPixelSize(on.p.survicate_micro_space_xxxl), 0, getResources().getDimensionPixelSize(on.p.survicate_micro_space_xs));
                pVar2.d(microSurveyPointImage.getId(), 3, textView2.getId(), 4);
                pVar2.d(microSurveyPointImage.getId(), 4, textView3.getId(), 3);
                pVar2.d(textView.getId(), 3, constraintLayout.getId(), 3);
                pVar2.d(textView2.getId(), 4, microSurveyPointImage.getId(), 3);
                pVar2.d(textView3.getId(), 3, microSurveyPointImage.getId(), 4);
                pVar2.a(constraintLayout);
                constraintLayout.setConstraintSet(null);
                constraintLayout.requestLayout();
            }
            ImageView imageView = microSurveyPointImage.f6580d;
            ViewGroup viewGroup = microSurveyPointImage.f6582r;
            SurveyPointImage surveyPointImage = surveyPointImageBindingData.f6602a;
            if (surveyPointImage == null) {
                return;
            }
            viewGroup.startAnimation(AnimationUtils.loadAnimation(microSurveyPointImage.getContext(), m.survicate_rotate));
            viewGroup.setVisibility(0);
            microSurveyPointImage.f6581g.setText(surveyPointImage.getImage().getDescription());
            imageView.setContentDescription(surveyPointImage.getImage().getDescription());
            String url = surveyPointImage.getImage().getUrl();
            r1 r1Var = microSurveyPointImage.f6584y;
            if (r1Var != null) {
                ((SurvicateImageLoader) r1Var.f10199d).loadSurveyPointImage(microSurveyPointImage.getContext(), imageView, url, new g(1, microSurveyPointImage, MicroSurveyPointImage.class, "onLoadingComplete", "onLoadingComplete(Z)V", 0, 0));
            } else {
                l.l("viewDependencies");
                throw null;
            }
        }
    }

    public final void b(r1 r1Var, MicroColorScheme microColorScheme) {
        l.e(r1Var, "viewDependencies");
        l.e(microColorScheme, "colorScheme");
        MicroSurveyPointImage microSurveyPointImage = this.f6562x;
        microSurveyPointImage.getClass();
        microSurveyPointImage.f6584y = r1Var;
        microSurveyPointImage.f6581g.setTextColor(microColorScheme.getQuestion());
        ProgressBar progressBar = microSurveyPointImage.f6583x;
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(microColorScheme.getProgressBar()));
        progressBar.setIndeterminateTintMode(PorterDuff.Mode.SRC_IN);
        Context context = getContext();
        l.d(context, "getContext(...)");
        StateListDrawable stateListDrawableO = e.o(context, 0.0f);
        TextView textView = this.f6559d;
        textView.setBackground(stateListDrawableO);
        int question = microColorScheme.getQuestion();
        textView.setTextColor(question);
        textView.setLinkTextColor(question);
        Context context2 = getContext();
        l.d(context2, "getContext(...)");
        StateListDrawable stateListDrawableO2 = e.o(context2, 0.0f);
        TextView textView2 = this.f6560g;
        textView2.setBackground(stateListDrawableO2);
        int question2 = microColorScheme.getQuestion();
        textView2.setTextColor(question2);
        textView2.setLinkTextColor(question2);
        this.f6561r.setTextColor(microColorScheme.getQuestion());
    }
}
