package com.survicate.surveys.presentation.multiple.micro;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ar.a;
import br.l;
import com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.multiple.SurveyPointMultipleSettings;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import h7.f;
import h7.q0;
import h7.r1;
import ht.g;
import iq.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kp.c;
import kp.d;
import mq.p;
import mq.w;
import on.r;
import on.t;
import on.u;
import u3.i0;
import xo.b;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001#J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\nR*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/survicate/surveys/presentation/multiple/micro/MicroSurveyPointMultipleContentView;", "Landroid/widget/FrameLayout;", "Landroid/os/Bundle;", "savedState", "Llq/b0;", "setupList", "(Landroid/os/Bundle;)V", "", "Lcom/survicate/surveys/infrastructure/network/SurveyAnswer;", "getAnswer", "()Ljava/util/List;", "getCurrentUiState", "()Landroid/os/Bundle;", "Lcom/survicate/surveys/presentation/multiple/micro/MicroSurveyPointMultipleAnswerItem;", "<set-?>", "a", "Ljava/util/List;", "getAnswerItems", "answerItems", "Lkotlin/Function0;", "d", "Lar/a;", "getOnValidationStateUpdate", "()Lar/a;", "setOnValidationStateUpdate", "(Lar/a;)V", "onValidationStateUpdate", "Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;", "getSurveyPoint", "()Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;", "surveyPoint", "Lcom/survicate/surveys/entities/survey/questions/question/multiple/SurveyPointMultipleSettings;", "getSurveyPointSettings", "()Lcom/survicate/surveys/entities/survey/questions/question/multiple/SurveyPointMultipleSettings;", "surveyPointSettings", "kp/c", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointMultipleContentView extends FrameLayout {
    public c B;
    public MicroSurveyPointMultipleAnswerItem D;

    /* renamed from: a, reason: collision with root package name */
    public Object f6445a;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public a onValidationStateUpdate;

    /* renamed from: g, reason: collision with root package name */
    public final RecyclerView f6447g;

    /* renamed from: r, reason: collision with root package name */
    public f f6448r;

    /* renamed from: x, reason: collision with root package name */
    public r1 f6449x;

    /* renamed from: y, reason: collision with root package name */
    public MicroColorScheme f6450y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurveyPointMultipleContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        this.f6445a = w.f16945a;
        View viewFindViewById = View.inflate(context, t.view_micro_survey_point_multiple_content, this).findViewById(r.view_micro_survey_point_multiple_content_recycler);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6447g = (RecyclerView) viewFindViewById;
    }

    private final SurveyQuestionSurveyPoint getSurveyPoint() {
        c cVar = this.B;
        if (cVar != null) {
            return cVar.f14470a;
        }
        l.l("bindingData");
        throw null;
    }

    private final SurveyPointMultipleSettings getSurveyPointSettings() {
        SurveyQuestionPointSettings settings = getSurveyPoint().getSettings();
        l.c(settings, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.multiple.SurveyPointMultipleSettings");
        return (SurveyPointMultipleSettings) settings;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    private final void setupList(Bundle savedState) throws Resources.NotFoundException {
        ArrayList parcelableArrayList = savedState != null ? Build.VERSION.SDK_INT >= 33 ? savedState.getParcelableArrayList("ANSWER_ITEMS", MicroSurveyPointMultipleAnswerItem.class) : savedState.getParcelableArrayList("ANSWER_ITEMS") : null;
        if (parcelableArrayList == null) {
            List<QuestionPointAnswer> listA = xo.f.a(getSurveyPoint());
            String commentLabel = getSurveyPointSettings().getCommentLabel();
            String str = commentLabel == null ? "" : commentLabel;
            c cVar = this.B;
            if (cVar == null) {
                l.l("bindingData");
                throw null;
            }
            String string = cVar.f14472c;
            if (string.length() == 0) {
                string = getResources().getString(u.survicate_input_text_placeholder);
                l.d(string, "getString(...)");
            }
            String str2 = string;
            ArrayList arrayList = new ArrayList(p.a0(listA, 10));
            for (QuestionPointAnswer questionPointAnswer : listA) {
                long id2 = questionPointAnswer.getId();
                String possibleAnswer = questionPointAnswer.getPossibleAnswer();
                arrayList.add(new MicroSurveyPointMultipleAnswerItem(id2, possibleAnswer == null ? "" : possibleAnswer, l.a(questionPointAnswer.getAddingCommentAvailable(), Boolean.TRUE), str, str2, "", false));
            }
            parcelableArrayList = arrayList;
        }
        this.f6445a = parcelableArrayList;
        c cVar2 = this.B;
        if (cVar2 == null) {
            l.l("bindingData");
            throw null;
        }
        QuestionHeaderBindingData questionHeaderBindingData = cVar2.f14471b;
        r1 r1Var = this.f6449x;
        if (r1Var == null) {
            l.l("viewDependencies");
            throw null;
        }
        MicroColorScheme microColorScheme = this.f6450y;
        if (microColorScheme == null) {
            l.l("colorScheme");
            throw null;
        }
        b bVar = new b(questionHeaderBindingData, r1Var, microColorScheme);
        ?? r02 = this.f6445a;
        MicroColorScheme microColorScheme2 = this.f6450y;
        if (microColorScheme2 == null) {
            l.l("colorScheme");
            throw null;
        }
        kp.b bVar2 = new kp.b(r02, microColorScheme2, 0);
        bVar2.f14467g = new c7.b(this, 18, (Object) r02);
        bVar2.f14469i = new j1.a(2, this);
        bVar2.f14468h = new d(0, this, MicroSurveyPointMultipleContentView.class, "updateValidationState", "updateValidationState()V", 0, 0);
        f fVar = new f(new q0[]{bVar, bVar2});
        this.f6448r = fVar;
        RecyclerView recyclerView = this.f6447g;
        recyclerView.setAdapter(fVar);
        recyclerView.setItemAnimator(null);
    }

    public final void a(c cVar, Bundle bundle) throws Resources.NotFoundException {
        this.B = cVar;
        setupList(bundle);
        i0.p(this, new e(this, new g(15, this)));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    public final List<SurveyAnswer> getAnswer() {
        ?? r12 = this.f6445a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : r12) {
            if (((MicroSurveyPointMultipleAnswerItem) obj).B) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MicroSurveyPointMultipleAnswerItem microSurveyPointMultipleAnswerItem = (MicroSurveyPointMultipleAnswerItem) it.next();
            String str = microSurveyPointMultipleAnswerItem.f6444y;
            if (tt.l.D0(str) || !microSurveyPointMultipleAnswerItem.f6441g) {
                str = null;
            }
            SurveyAnswer surveyAnswer = new SurveyAnswer(null, null, null, null, null, 0.0d, null, null, null, null, null, null, 4095, null);
            surveyAnswer.setQuestionAnswerId(Long.valueOf(microSurveyPointMultipleAnswerItem.f6439a));
            surveyAnswer.setAnswer(microSurveyPointMultipleAnswerItem.f6440d);
            surveyAnswer.setComment(str);
            arrayList2.add(surveyAnswer);
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<com.survicate.surveys.presentation.multiple.micro.MicroSurveyPointMultipleAnswerItem>] */
    public final List<MicroSurveyPointMultipleAnswerItem> getAnswerItems() {
        return this.f6445a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final Bundle getCurrentUiState() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("ANSWER_ITEMS", new ArrayList<>((Collection) this.f6445a));
        return bundle;
    }

    public final a getOnValidationStateUpdate() {
        return this.onValidationStateUpdate;
    }

    public final void setOnValidationStateUpdate(a aVar) {
        this.onValidationStateUpdate = aVar;
    }
}
