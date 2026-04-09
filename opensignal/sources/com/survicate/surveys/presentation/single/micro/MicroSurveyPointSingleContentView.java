package com.survicate.surveys.presentation.single.micro;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ar.a;
import ar.k;
import bq.g;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.single.SurveyPointSingleSettings;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import h7.f;
import h7.q0;
import h7.r1;
import iq.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kp.d;
import mq.p;
import mq.w;
import on.r;
import on.t;
import on.u;
import pp.c;
import u3.i0;
import vp.b;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u00011J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fR0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0005R*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R0\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010(\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/survicate/surveys/presentation/single/micro/MicroSurveyPointSingleContentView;", "Landroid/widget/FrameLayout;", "", "Lcom/survicate/surveys/infrastructure/network/SurveyAnswer;", "getAnswer", "()Ljava/util/List;", "Landroid/os/Bundle;", "getCurrentUiState", "()Landroid/os/Bundle;", "savedState", "Llq/b0;", "setupList", "(Landroid/os/Bundle;)V", "Lcom/survicate/surveys/presentation/single/micro/MicroSurveyPointSingleAnswerItem;", "<set-?>", "a", "Ljava/util/List;", "getAnswerItems", "answerItems", "Lkotlin/Function0;", "d", "Lar/a;", "getOnValidationStateUpdate", "()Lar/a;", "setOnValidationStateUpdate", "(Lar/a;)V", "onValidationStateUpdate", "Lkotlin/Function1;", "g", "Lar/k;", "getOnAnswerSelected", "()Lar/k;", "setOnAnswerSelected", "(Lar/k;)V", "onAnswerSelected", "", "r", "Z", "getWasAnswerWithCommentSelectedFirst", "()Z", "wasAnswerWithCommentSelectedFirst", "Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;", "getSurveyPoint", "()Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;", "surveyPoint", "Lcom/survicate/surveys/entities/survey/questions/question/single/SurveyPointSingleSettings;", "getSurveyPointSettings", "()Lcom/survicate/surveys/entities/survey/questions/question/single/SurveyPointSingleSettings;", "surveyPointSettings", "vp/b", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointSingleContentView extends FrameLayout {
    public static final /* synthetic */ int G = 0;
    public r1 B;
    public MicroColorScheme D;
    public b E;
    public MicroSurveyPointSingleAnswerItem F;

    /* renamed from: a, reason: collision with root package name */
    public Object f6499a;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public a onValidationStateUpdate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public k onAnswerSelected;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean wasAnswerWithCommentSelectedFirst;

    /* renamed from: x, reason: collision with root package name */
    public final RecyclerView f6503x;

    /* renamed from: y, reason: collision with root package name */
    public f f6504y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurveyPointSingleContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        this.f6499a = w.f16945a;
        View viewFindViewById = View.inflate(context, t.view_micro_survey_point_single_content, this).findViewById(r.view_micro_survey_point_single_content_recycler);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6503x = (RecyclerView) viewFindViewById;
    }

    public static SurveyAnswer b(MicroSurveyPointSingleAnswerItem microSurveyPointSingleAnswerItem) {
        String str = microSurveyPointSingleAnswerItem.B;
        if (tt.l.D0(str) || !microSurveyPointSingleAnswerItem.f6495g) {
            str = null;
        }
        SurveyAnswer surveyAnswer = new SurveyAnswer(null, null, null, null, null, 0.0d, null, null, null, null, null, null, 4095, null);
        surveyAnswer.setQuestionAnswerId(Long.valueOf(microSurveyPointSingleAnswerItem.f6493a));
        surveyAnswer.setAnswer(microSurveyPointSingleAnswerItem.f6494d);
        surveyAnswer.setComment(str);
        return surveyAnswer;
    }

    private final SurveyQuestionSurveyPoint getSurveyPoint() {
        b bVar = this.E;
        if (bVar != null) {
            return bVar.f23932a;
        }
        l.l("bindingData");
        throw null;
    }

    private final SurveyPointSingleSettings getSurveyPointSettings() {
        SurveyQuestionPointSettings settings = getSurveyPoint().getSettings();
        l.c(settings, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.single.SurveyPointSingleSettings");
        return (SurveyPointSingleSettings) settings;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    private final void setupList(Bundle savedState) throws Resources.NotFoundException {
        ArrayList parcelableArrayList = savedState != null ? Build.VERSION.SDK_INT >= 33 ? savedState.getParcelableArrayList("ANSWER_ITEMS", MicroSurveyPointSingleAnswerItem.class) : savedState.getParcelableArrayList("ANSWER_ITEMS") : null;
        if (parcelableArrayList == null) {
            List<QuestionPointAnswer> listA = xo.f.a(getSurveyPoint());
            String commentLabel = getSurveyPointSettings().getCommentLabel();
            String str = commentLabel == null ? "" : commentLabel;
            b bVar = this.E;
            if (bVar == null) {
                l.l("bindingData");
                throw null;
            }
            String string = bVar.f23934c;
            if (string.length() == 0) {
                string = getResources().getString(u.survicate_input_text_placeholder);
                l.d(string, "getString(...)");
            }
            String str2 = string;
            ArrayList arrayList = new ArrayList(p.a0(listA, 10));
            for (QuestionPointAnswer questionPointAnswer : listA) {
                long id2 = questionPointAnswer.getId();
                String possibleAnswer = questionPointAnswer.getPossibleAnswer();
                String str3 = possibleAnswer == null ? "" : possibleAnswer;
                boolean zA = l.a(questionPointAnswer.getAddingCommentAvailable(), Boolean.TRUE);
                Boolean boolIsCommentMandatory = getSurveyPointSettings().isCommentMandatory();
                arrayList.add(new MicroSurveyPointSingleAnswerItem(id2, str3, zA, boolIsCommentMandatory != null ? boolIsCommentMandatory.booleanValue() : false, str, str2, "", false));
            }
            parcelableArrayList = arrayList;
        }
        this.f6499a = parcelableArrayList;
        this.wasAnswerWithCommentSelectedFirst = savedState != null ? savedState.getBoolean("WAS_ANSWER_WITH_COMMENT_SELECTED_FIRST") : false;
        b bVar2 = this.E;
        if (bVar2 == null) {
            l.l("bindingData");
            throw null;
        }
        QuestionHeaderBindingData questionHeaderBindingData = bVar2.f23933b;
        r1 r1Var = this.B;
        if (r1Var == null) {
            l.l("viewDependencies");
            throw null;
        }
        MicroColorScheme microColorScheme = this.D;
        if (microColorScheme == null) {
            l.l("colorScheme");
            throw null;
        }
        xo.b bVar3 = new xo.b(questionHeaderBindingData, r1Var, microColorScheme);
        ?? r02 = this.f6499a;
        MicroColorScheme microColorScheme2 = this.D;
        if (microColorScheme2 == null) {
            l.l("colorScheme");
            throw null;
        }
        kp.b bVar4 = new kp.b(r02, microColorScheme2, 1);
        bVar4.f14467g = new g(1, this, MicroSurveyPointSingleContentView.class, "onAnswerItemClick", "onAnswerItemClick(Lcom/survicate/surveys/presentation/single/micro/MicroSurveyPointSingleAnswerItem;)V", 0, 8);
        bVar4.f14469i = new j1.a(14, this);
        bVar4.f14468h = new d(0, this, MicroSurveyPointSingleContentView.class, "updateValidationState", "updateValidationState()V", 0, 21);
        f fVar = new f(new q0[]{bVar3, bVar4});
        this.f6504y = fVar;
        RecyclerView recyclerView = this.f6503x;
        recyclerView.setAdapter(fVar);
        recyclerView.setItemAnimator(null);
    }

    public final void a(b bVar, Bundle bundle) throws Resources.NotFoundException {
        this.E = bVar;
        setupList(bundle);
        i0.p(this, new e(this, new c(11, this)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public final List<SurveyAnswer> getAnswer() {
        Object next;
        Iterator it = this.f6499a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((MicroSurveyPointSingleAnswerItem) next).D) {
                break;
            }
        }
        MicroSurveyPointSingleAnswerItem microSurveyPointSingleAnswerItem = (MicroSurveyPointSingleAnswerItem) next;
        return microSurveyPointSingleAnswerItem == null ? w.f16945a : e5.H(b(microSurveyPointSingleAnswerItem));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<com.survicate.surveys.presentation.single.micro.MicroSurveyPointSingleAnswerItem>] */
    public final List<MicroSurveyPointSingleAnswerItem> getAnswerItems() {
        return this.f6499a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final Bundle getCurrentUiState() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("ANSWER_ITEMS", new ArrayList<>((Collection) this.f6499a));
        bundle.putBoolean("WAS_ANSWER_WITH_COMMENT_SELECTED_FIRST", this.wasAnswerWithCommentSelectedFirst);
        return bundle;
    }

    public final k getOnAnswerSelected() {
        return this.onAnswerSelected;
    }

    public final a getOnValidationStateUpdate() {
        return this.onValidationStateUpdate;
    }

    public final boolean getWasAnswerWithCommentSelectedFirst() {
        return this.wasAnswerWithCommentSelectedFirst;
    }

    public final void setOnAnswerSelected(k kVar) {
        this.onAnswerSelected = kVar;
    }

    public final void setOnValidationStateUpdate(a aVar) {
        this.onValidationStateUpdate = aVar;
    }
}
