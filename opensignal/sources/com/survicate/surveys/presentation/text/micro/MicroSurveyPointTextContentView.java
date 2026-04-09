package com.survicate.surveys.presentation.text.micro;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ar.a;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.text.SurveyPointTextSettings;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.infrastructure.network.SurveyAnswerFollowUp;
import com.survicate.surveys.presentation.widget.MicroSurvicateTextInput;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import h7.f;
import h7.n1;
import h7.r1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import mm.d;
import mq.o;
import mq.p;
import mq.w;
import no.e;
import on.r;
import on.t;
import on.u;
import zp.b;
import zp.c;
import zp.g;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001#J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\nR*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/survicate/surveys/presentation/text/micro/MicroSurveyPointTextContentView;", "Landroid/widget/FrameLayout;", "Landroid/os/Bundle;", "savedState", "Llq/b0;", "setupList", "(Landroid/os/Bundle;)V", "", "Lcom/survicate/surveys/infrastructure/network/SurveyAnswer;", "getAnswer", "()Ljava/util/List;", "getCurrentUiState", "()Landroid/os/Bundle;", "Lcom/survicate/surveys/presentation/text/micro/MicroSurveyPointTextAdapterItem;", "<set-?>", "a", "Ljava/util/List;", "getAnswerItems", "answerItems", "Lkotlin/Function0;", "g", "Lar/a;", "getOnValidationStateUpdate", "()Lar/a;", "setOnValidationStateUpdate", "(Lar/a;)V", "onValidationStateUpdate", "Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;", "getSurveyPoint", "()Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;", "surveyPoint", "Lcom/survicate/surveys/entities/survey/questions/question/text/SurveyPointTextSettings;", "getSurveyPointSettings", "()Lcom/survicate/surveys/entities/survey/questions/question/text/SurveyPointTextSettings;", "surveyPointSettings", "zp/g", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointTextContentView extends FrameLayout {
    public static final /* synthetic */ int I = 0;
    public d B;
    public f D;
    public f E;
    public r1 F;
    public MicroColorScheme G;
    public g H;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public List answerItems;

    /* renamed from: d, reason: collision with root package name */
    public Integer f6530d;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public a onValidationStateUpdate;

    /* renamed from: r, reason: collision with root package name */
    public final RecyclerView f6532r;

    /* renamed from: x, reason: collision with root package name */
    public final e f6533x;

    /* renamed from: y, reason: collision with root package name */
    public f f6534y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurveyPointTextContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        this.answerItems = w.f16945a;
        this.f6533x = new e();
        View viewFindViewById = View.inflate(context, t.view_micro_survey_point_text_content, this).findViewById(r.view_micro_survey_point_text_content_recycler);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6532r = (RecyclerView) viewFindViewById;
    }

    private final SurveyQuestionSurveyPoint getSurveyPoint() {
        g gVar = this.H;
        if (gVar != null) {
            return gVar.f27503a;
        }
        l.l("bindingData");
        throw null;
    }

    private final SurveyPointTextSettings getSurveyPointSettings() {
        SurveyQuestionPointSettings settings = getSurveyPoint().getSettings();
        l.c(settings, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.text.SurveyPointTextSettings");
        return (SurveyPointTextSettings) settings;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setupList(android.os.Bundle r15) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextContentView.setupList(android.os.Bundle):void");
    }

    public final void a(String str) {
        l.e(str, "question");
        if (d()) {
            g gVar = this.H;
            if (gVar == null) {
                l.l("bindingData");
                throw null;
            }
            QuestionHeaderBindingData questionHeaderBindingData = gVar.f27504b;
            String str2 = questionHeaderBindingData.f6599g;
            boolean z10 = questionHeaderBindingData.f6600r;
            l.e(str2, "answerRequiredLabel");
            QuestionHeaderBindingData questionHeaderBindingData2 = new QuestionHeaderBindingData("", str, str2, z10, null);
            g gVar2 = this.H;
            if (gVar2 == null) {
                l.l("bindingData");
                throw null;
            }
            String string = gVar2.f27505c;
            if (string.length() == 0) {
                string = getContext().getString(u.survicate_input_text_placeholder);
                l.d(string, "getString(...)");
            }
            MicroSurveyPointTextAnswer microSurveyPointTextAnswer = new MicroSurveyPointTextAnswer("", string);
            Integer followUpQuestionCount = getSurveyPointSettings().getFollowUpQuestionCount();
            ArrayList arrayListF0 = o.F0(this.answerItems, new MicroSurveyPointTextAdapterItem(questionHeaderBindingData2, microSurveyPointTextAnswer, (!e() || followUpQuestionCount == null || this.answerItems.size() >= followUpQuestionCount.intValue()) ? 0 : 1000));
            this.answerItems = arrayListF0;
            d dVar = this.B;
            if (dVar == null) {
                l.l("itemsAdapter");
                throw null;
            }
            dVar.q(arrayListF0);
            this.f6530d = this.f6530d != null ? Integer.valueOf(r10.intValue() - 1) : null;
            b();
            this.f6532r.Q();
            f();
        }
    }

    public final void b() {
        if (e()) {
            Integer num = this.f6530d;
            if (num == null || num.intValue() <= 0) {
                f fVar = this.f6534y;
                if (fVar == null) {
                    l.l("recyclerAdapter");
                    throw null;
                }
                List listR = fVar.r();
                l.d(listR, "getAdapters(...)");
                f fVar2 = this.E;
                if (fVar2 == null) {
                    l.l("notificationAdapter");
                    throw null;
                }
                if (o.k0(listR, fVar2)) {
                    f fVar3 = this.f6534y;
                    if (fVar3 == null) {
                        l.l("recyclerAdapter");
                        throw null;
                    }
                    f fVar4 = this.E;
                    if (fVar4 == null) {
                        l.l("notificationAdapter");
                        throw null;
                    }
                    fVar3.s(fVar4);
                }
                f fVar5 = this.f6534y;
                if (fVar5 == null) {
                    l.l("recyclerAdapter");
                    throw null;
                }
                f fVar6 = this.E;
                if (fVar6 != null) {
                    fVar5.q(fVar6);
                } else {
                    l.l("notificationAdapter");
                    throw null;
                }
            }
        }
    }

    public final void c(g gVar, Bundle bundle) throws Resources.NotFoundException {
        this.H = gVar;
        setupList(bundle);
        RecyclerView recyclerView = this.f6532r;
        ArrayList arrayList = recyclerView.M;
        e eVar = this.f6533x;
        arrayList.remove(eVar);
        if (recyclerView.N == eVar) {
            recyclerView.N = null;
        }
    }

    public final boolean d() {
        if (!e()) {
            return false;
        }
        Integer followUpQuestionCount = getSurveyPointSettings().getFollowUpQuestionCount();
        if (followUpQuestionCount != null) {
            if (this.answerItems.size() == followUpQuestionCount.intValue() + 1) {
                return false;
            }
        }
        List list = this.answerItems;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (tt.l.D0(((MicroSurveyPointTextAdapterItem) it.next()).f6525g.f6527a)) {
                    return false;
                }
            }
        }
        Integer num = this.f6530d;
        return num != null && num.intValue() > 0;
    }

    public final boolean e() {
        Integer followUpQuestionCount;
        g gVar = this.H;
        if (gVar != null) {
            return (gVar.f27506d == null || getSurveyPointSettings().getFollowUpQuestionCount() == null || (followUpQuestionCount = getSurveyPointSettings().getFollowUpQuestionCount()) == null || followUpQuestionCount.intValue() <= 0) ? false : true;
        }
        l.l("bindingData");
        throw null;
    }

    public final void f() {
        Context context = getContext();
        l.d(context, "getContext(...)");
        if (xu.d.S(context)) {
            return;
        }
        RecyclerView recyclerView = this.f6532r;
        if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new jd.a(6, this));
            return;
        }
        n1 n1VarI = recyclerView.I(recyclerView.getChildCount() - 1);
        if (n1VarI instanceof zp.e) {
            MicroSurvicateTextInput microSurvicateTextInput = ((zp.e) n1VarI).f27501v;
            microSurvicateTextInput.getClass();
            Rect rect = new Rect();
            microSurvicateTextInput.getDrawingRect(rect);
            microSurvicateTextInput.requestRectangleOnScreen(rect, false);
            return;
        }
        if (n1VarI instanceof b) {
            Rect rect2 = new Rect();
            View view = ((b) n1VarI).f10155a;
            view.getDrawingRect(rect2);
            view.requestRectangleOnScreen(rect2, false);
            return;
        }
        if (n1VarI instanceof c) {
            Rect rect3 = new Rect();
            View view2 = ((c) n1VarI).f10155a;
            view2.getDrawingRect(rect3);
            view2.requestRectangleOnScreen(rect3, false);
        }
    }

    public final List<SurveyAnswer> getAnswer() {
        MicroSurveyPointTextAdapterItem microSurveyPointTextAdapterItem = (MicroSurveyPointTextAdapterItem) o.t0(this.answerItems);
        if (microSurveyPointTextAdapterItem != null) {
            MicroSurveyPointTextAnswer microSurveyPointTextAnswer = microSurveyPointTextAdapterItem.f6525g;
            if (!tt.l.D0(microSurveyPointTextAnswer.f6527a)) {
                ArrayList arrayList = null;
                SurveyAnswer surveyAnswer = new SurveyAnswer(null, null, null, null, null, 0.0d, null, null, null, null, null, null, 4095, null);
                surveyAnswer.setContent(microSurveyPointTextAnswer.f6527a);
                surveyAnswer.setAnswer(microSurveyPointTextAnswer.f6527a);
                List list = this.answerItems;
                if (list.isEmpty() || !e()) {
                    list = null;
                }
                if (list != null) {
                    List<MicroSurveyPointTextAdapterItem> listM0 = o.m0(1, list);
                    ArrayList arrayList2 = new ArrayList(p.a0(listM0, 10));
                    for (MicroSurveyPointTextAdapterItem microSurveyPointTextAdapterItem2 : listM0) {
                        arrayList2.add(new SurveyAnswerFollowUp(microSurveyPointTextAdapterItem2.f6524d.f6598d, microSurveyPointTextAdapterItem2.f6525g.f6527a));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (((SurveyAnswerFollowUp) next).getAnswer() != null && (!tt.l.D0(r7))) {
                            arrayList3.add(next);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        arrayList = arrayList3;
                    }
                }
                surveyAnswer.setFollowUp(arrayList);
                return e5.H(surveyAnswer);
            }
        }
        return w.f16945a;
    }

    public final List<MicroSurveyPointTextAdapterItem> getAnswerItems() {
        return this.answerItems;
    }

    public final Bundle getCurrentUiState() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("ANSWER_ITEMS", new ArrayList<>(this.answerItems));
        Integer num = this.f6530d;
        if (num != null) {
            bundle.putInt("FOLLOW_UP_LIMIT", num.intValue());
        }
        return bundle;
    }

    public final a getOnValidationStateUpdate() {
        return this.onValidationStateUpdate;
    }

    public final void setOnValidationStateUpdate(a aVar) {
        this.onValidationStateUpdate = aVar;
    }
}
