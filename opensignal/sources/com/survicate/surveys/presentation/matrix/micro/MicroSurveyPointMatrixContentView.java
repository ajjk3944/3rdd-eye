package com.survicate.surveys.presentation.matrix.micro;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ar.a;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.matrix.MatrixColumn;
import com.survicate.surveys.entities.survey.questions.question.matrix.SurveyPointMatrixSettings;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.presentation.widget.MicroSurvicateCommentField;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import h7.n1;
import h7.q0;
import h7.r1;
import ip.b;
import ip.c;
import ip.d;
import ip.i;
import iq.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import mq.p;
import mq.w;
import on.r;
import on.t;
import on.u;
import u3.i0;
import xo.f;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001 J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00078F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\n¨\u0006!"}, d2 = {"Lcom/survicate/surveys/presentation/matrix/micro/MicroSurveyPointMatrixContentView;", "Landroid/widget/FrameLayout;", "Landroid/os/Bundle;", "savedState", "Llq/b0;", "setupList", "(Landroid/os/Bundle;)V", "", "Lcom/survicate/surveys/infrastructure/network/SurveyAnswer;", "getAnswer", "()Ljava/util/List;", "getCurrentUiState", "()Landroid/os/Bundle;", "Lkotlin/Function0;", "a", "Lar/a;", "getOnValidationStateUpdate", "()Lar/a;", "setOnValidationStateUpdate", "(Lar/a;)V", "onValidationStateUpdate", "Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;", "getSurveyPoint", "()Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;", "surveyPoint", "Lcom/survicate/surveys/entities/survey/questions/question/matrix/SurveyPointMatrixSettings;", "getSurveyPointSettings", "()Lcom/survicate/surveys/entities/survey/questions/question/matrix/SurveyPointMatrixSettings;", "surveyPointSettings", "Lcom/survicate/surveys/presentation/matrix/micro/MicroSurveyPointMatrixAnswerItem;", "getAnswerItems", "answerItems", "ip/c", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointMatrixContentView extends FrameLayout {
    public static final /* synthetic */ int D = 0;
    public MicroSurveyPointMatrixAnswerItem B;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public a onValidationStateUpdate;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f6428d;

    /* renamed from: g, reason: collision with root package name */
    public r1 f6429g;

    /* renamed from: r, reason: collision with root package name */
    public MicroColorScheme f6430r;

    /* renamed from: x, reason: collision with root package name */
    public c f6431x;

    /* renamed from: y, reason: collision with root package name */
    public b f6432y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurveyPointMatrixContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        View viewFindViewById = View.inflate(context, t.view_micro_survey_point_matrix_content, this).findViewById(r.view_micro_survey_point_matrix_content_recycler);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6428d = (RecyclerView) viewFindViewById;
    }

    private final SurveyQuestionSurveyPoint getSurveyPoint() {
        c cVar = this.f6431x;
        if (cVar != null) {
            return cVar.f12896a;
        }
        l.l("bindingData");
        throw null;
    }

    private final SurveyPointMatrixSettings getSurveyPointSettings() {
        SurveyQuestionPointSettings settings = getSurveyPoint().getSettings();
        l.c(settings, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.matrix.SurveyPointMatrixSettings");
        return (SurveyPointMatrixSettings) settings;
    }

    private final void setupList(Bundle savedState) {
        ArrayList parcelableArrayList = savedState != null ? Build.VERSION.SDK_INT >= 33 ? savedState.getParcelableArrayList("ANSWER_ITEMS", MicroSurveyPointMatrixAnswerItem.class) : savedState.getParcelableArrayList("ANSWER_ITEMS") : null;
        String str = "bindingData";
        if (parcelableArrayList == null) {
            List listA = f.a(getSurveyPoint());
            String commentLabel = getSurveyPointSettings().getCommentLabel();
            c cVar = this.f6431x;
            if (cVar == null) {
                l.l("bindingData");
                throw null;
            }
            String string = cVar.f12898c;
            if (string.length() == 0) {
                string = getContext().getString(u.survicate_input_text_placeholder);
                l.d(string, "getString(...)");
            }
            String str2 = string;
            int i10 = 10;
            ArrayList arrayList = new ArrayList(p.a0(listA, 10));
            int i11 = 0;
            for (Object obj : listA) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    e5.Q();
                    throw null;
                }
                QuestionPointAnswer questionPointAnswer = (QuestionPointAnswer) obj;
                List<MatrixColumn> scale = getSurveyPointSettings().getScale();
                ArrayList arrayList2 = new ArrayList(p.a0(scale, i10));
                for (MatrixColumn matrixColumn : scale) {
                    arrayList2.add(new MicroSurveyPointMatrixColumnItem(matrixColumn.getId(), matrixColumn.getName(), ""));
                    str = str;
                }
                String str3 = str;
                int i13 = i11;
                long id2 = questionPointAnswer.getId();
                String possibleAnswer = questionPointAnswer.getPossibleAnswer();
                if (possibleAnswer == null) {
                    possibleAnswer = "";
                }
                arrayList.add(new MicroSurveyPointMatrixAnswerItem(id2, possibleAnswer, arrayList2, l.a(questionPointAnswer.getAddingCommentAvailable(), Boolean.TRUE), commentLabel, str2, null, i13 == 0));
                i10 = 10;
                i11 = i12;
                str = str3;
            }
            parcelableArrayList = arrayList;
        }
        String str4 = str;
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        MicroColorScheme microColorScheme = this.f6430r;
        if (microColorScheme == null) {
            l.l("colorScheme");
            throw null;
        }
        b bVar = new b(parcelableArrayList, microColorScheme);
        bVar.f12893g = new c7.b(this, 14, linearLayoutManager);
        bVar.f12892f = new d(this, 0);
        bVar.f12894h = new d(this, 1);
        bVar.j = new as.d(27, this);
        this.f6432y = bVar;
        RecyclerView recyclerView = this.f6428d;
        recyclerView.setLayoutManager(linearLayoutManager);
        c cVar2 = this.f6431x;
        if (cVar2 == null) {
            l.l(str4);
            throw null;
        }
        QuestionHeaderBindingData questionHeaderBindingData = cVar2.f12897b;
        r1 r1Var = this.f6429g;
        if (r1Var == null) {
            l.l("viewDependencies");
            throw null;
        }
        MicroColorScheme microColorScheme2 = this.f6430r;
        if (microColorScheme2 == null) {
            l.l("colorScheme");
            throw null;
        }
        xo.b bVar2 = new xo.b(questionHeaderBindingData, r1Var, microColorScheme2);
        b bVar3 = this.f6432y;
        l.b(bVar3);
        recyclerView.setAdapter(new h7.f(new q0[]{bVar2, bVar3}));
        recyclerView.setItemAnimator(null);
    }

    public final void a(c cVar, Bundle bundle) {
        this.f6431x = cVar;
        setupList(bundle);
        i0.p(this, new e(this, new d(this, 2)));
    }

    public final MicroSurvicateCommentField b(MicroSurveyPointMatrixAnswerItem microSurveyPointMatrixAnswerItem) {
        ArrayList arrayList;
        MicroSurveyPointMatrixAnswerItem microSurveyPointMatrixAnswerItem2;
        MicroSurveyPointMatrixColumnItem microSurveyPointMatrixColumnItemD;
        b bVar = this.f6432y;
        if (bVar != null && (arrayList = bVar.f12890d) != null) {
            n1 n1VarI = this.f6428d.I(arrayList.indexOf(microSurveyPointMatrixAnswerItem) + 1);
            i iVar = n1VarI instanceof i ? (i) n1VarI : null;
            if (iVar != null && (microSurveyPointMatrixAnswerItem2 = iVar.f12917v) != null && (microSurveyPointMatrixColumnItemD = microSurveyPointMatrixAnswerItem2.d()) != null) {
                return (MicroSurvicateCommentField) iVar.B.get(microSurveyPointMatrixColumnItemD);
            }
        }
        return null;
    }

    public final List<SurveyAnswer> getAnswer() {
        b bVar = this.f6432y;
        if (bVar != null) {
            ArrayList arrayList = bVar.f12890d;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((MicroSurveyPointMatrixAnswerItem) it.next()).d() != null) {
                    }
                }
            }
            List<MicroSurveyPointMatrixAnswerItem> answerItems = getAnswerItems();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : answerItems) {
                if (((MicroSurveyPointMatrixAnswerItem) obj).d() != null) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(p.a0(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                MicroSurveyPointMatrixAnswerItem microSurveyPointMatrixAnswerItem = (MicroSurveyPointMatrixAnswerItem) it2.next();
                MicroSurveyPointMatrixColumnItem microSurveyPointMatrixColumnItemD = microSurveyPointMatrixAnswerItem.d();
                l.b(microSurveyPointMatrixColumnItemD);
                String str = microSurveyPointMatrixColumnItemD.f6426g;
                if (tt.l.D0(str) || !microSurveyPointMatrixAnswerItem.f6421r) {
                    str = null;
                }
                SurveyAnswer surveyAnswer = new SurveyAnswer(null, null, null, null, null, 0.0d, null, null, null, null, null, null, 4095, null);
                surveyAnswer.setQuestionAnswerId(Long.valueOf(microSurveyPointMatrixAnswerItem.f6418a));
                surveyAnswer.setContent(String.valueOf(microSurveyPointMatrixColumnItemD.f6424a));
                surveyAnswer.setComment(str);
                surveyAnswer.setMatrixGroupName(microSurveyPointMatrixAnswerItem.f6419d);
                surveyAnswer.setMatrixColumnName(microSurveyPointMatrixColumnItemD.f6425d);
                arrayList3.add(surveyAnswer);
            }
            return arrayList3;
        }
        return w.f16945a;
    }

    public final List<MicroSurveyPointMatrixAnswerItem> getAnswerItems() {
        b bVar = this.f6432y;
        ArrayList arrayList = bVar != null ? bVar.f12890d : null;
        return arrayList == null ? w.f16945a : arrayList;
    }

    public final Bundle getCurrentUiState() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("ANSWER_ITEMS", new ArrayList<>(getAnswerItems()));
        return bundle;
    }

    public final a getOnValidationStateUpdate() {
        return this.onValidationStateUpdate;
    }

    public final void setOnValidationStateUpdate(a aVar) {
        this.onValidationStateUpdate = aVar;
    }
}
