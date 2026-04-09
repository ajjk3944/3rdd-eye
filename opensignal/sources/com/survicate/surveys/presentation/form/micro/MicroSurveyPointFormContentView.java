package com.survicate.surveys.presentation.form.micro;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ar.a;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.survey.questions.form.SurveyFormField;
import com.survicate.surveys.entities.survey.questions.form.SurveyFormSurveyPoint;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.entities.views.AnswerableView;
import com.survicate.surveys.entities.views.InitialValidationView;
import com.survicate.surveys.entities.views.InputValidationView;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.presentation.widget.MicroQuestionHeader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import mq.b0;
import mq.o;
import mq.p;
import on.r;
import on.t;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0016J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/survicate/surveys/presentation/form/micro/MicroSurveyPointFormContentView;", "Landroid/widget/FrameLayout;", "", "Lcom/survicate/surveys/infrastructure/network/SurveyAnswer;", "getAnswer", "()Ljava/util/List;", "Landroid/os/Bundle;", "getCurrentUiState", "()Landroid/os/Bundle;", "Lkotlin/Function0;", "Llq/b0;", "a", "Lar/a;", "getOnInitialValidationStateUpdate", "()Lar/a;", "setOnInitialValidationStateUpdate", "(Lar/a;)V", "onInitialValidationStateUpdate", "Lcom/survicate/surveys/entities/survey/questions/form/SurveyFormSurveyPoint;", "getSurveyPoint", "()Lcom/survicate/surveys/entities/survey/questions/form/SurveyFormSurveyPoint;", "surveyPoint", "gp/a", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointFormContentView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public a onInitialValidationStateUpdate;

    /* renamed from: d, reason: collision with root package name */
    public gp.a f6408d;

    /* renamed from: g, reason: collision with root package name */
    public MicroColorScheme f6409g;

    /* renamed from: r, reason: collision with root package name */
    public final MicroQuestionHeader f6410r;

    /* renamed from: x, reason: collision with root package name */
    public final LinearLayout f6411x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroSurveyPointFormContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        View viewInflate = View.inflate(context, t.view_micro_survey_point_form_content, this);
        View viewFindViewById = viewInflate.findViewById(r.view_micro_survey_point_form_content_header);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6410r = (MicroQuestionHeader) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_survey_point_form_content_container);
        l.d(viewFindViewById2, "findViewById(...)");
        this.f6411x = (LinearLayout) viewFindViewById2;
    }

    private final SurveyFormSurveyPoint getSurveyPoint() {
        gp.a aVar = this.f6408d;
        if (aVar != null) {
            return aVar.f9630a;
        }
        l.l("bindingData");
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [i4.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View, com.survicate.surveys.presentation.widget.MicroSurvicateTextInput] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(gp.a r18, android.os.Bundle r19) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.survicate.surveys.presentation.form.micro.MicroSurveyPointFormContentView.a(gp.a, android.os.Bundle):void");
    }

    public final boolean b() {
        List<SurveyFormField> fields = getSurveyPoint().getFields();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : fields) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                e5.Q();
                throw null;
            }
            View childAt = this.f6411x.getChildAt(i10);
            if (childAt != null) {
                arrayList.add(childAt);
            }
            i10 = i11;
        }
        ArrayList arrayListO0 = o.o0(arrayList, InputValidationView.class);
        if (arrayListO0.isEmpty()) {
            return true;
        }
        Iterator it = arrayListO0.iterator();
        while (it.hasNext()) {
            if (!((InputValidationView) it.next()).validate()) {
                return false;
            }
        }
        return true;
    }

    public final boolean c() {
        List<SurveyFormField> fields = getSurveyPoint().getFields();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : fields) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                e5.Q();
                throw null;
            }
            View childAt = this.f6411x.getChildAt(i10);
            if (childAt != null) {
                arrayList.add(childAt);
            }
            i10 = i11;
        }
        ArrayList arrayListO0 = o.o0(arrayList, InitialValidationView.class);
        if (arrayListO0.isEmpty()) {
            return true;
        }
        Iterator it = arrayListO0.iterator();
        while (it.hasNext()) {
            if (!((InitialValidationView) it.next()).isInitiallyValid()) {
                return false;
            }
        }
        return true;
    }

    public final List<SurveyAnswer> getAnswer() {
        ArrayList arrayList = new ArrayList();
        int size = getSurveyPoint().getFields().size();
        for (int i10 = 0; i10 < size; i10++) {
            SurveyFormField surveyFormField = getSurveyPoint().getFields().get(i10);
            KeyEvent.Callback childAt = this.f6411x.getChildAt(i10);
            if (childAt instanceof AnswerableView) {
                SurveyAnswer surveyAnswer = new SurveyAnswer(null, null, null, null, null, 0.0d, null, null, null, null, null, null, 4095, null);
                surveyAnswer.setAnswerType(surveyFormField.getFieldType());
                surveyAnswer.setContent(((AnswerableView) childAt).getAnswer());
                surveyAnswer.setAnswerId(Long.valueOf(surveyFormField.getId()));
                arrayList.add(surveyAnswer);
            }
        }
        return arrayList;
    }

    public final Bundle getCurrentUiState() {
        Bundle bundle = new Bundle();
        List<SurveyAnswer> answer = getAnswer();
        int iP = b0.P(p.a0(answer, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
        for (SurveyAnswer surveyAnswer : answer) {
            Long answerId = surveyAnswer.getAnswerId();
            l.b(answerId);
            String content = surveyAnswer.getContent();
            if (content == null) {
                content = "";
            }
            linkedHashMap.put(answerId, content);
        }
        bundle.putSerializable("SAVED_INPUTS", new HashMap(linkedHashMap));
        return bundle;
    }

    public final a getOnInitialValidationStateUpdate() {
        return this.onInitialValidationStateUpdate;
    }

    public final void setOnInitialValidationStateUpdate(a aVar) {
        this.onInitialValidationStateUpdate = aVar;
    }
}
