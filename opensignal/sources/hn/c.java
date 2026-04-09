package hn;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.lifecycle.o0;
import androidx.lifecycle.v;
import ar.k;
import bm.d;
import br.l;
import com.staircase3.opensignal.activities.MainActivity;
import com.staircase3.opensignal.utils.q;
import com.survicate.surveys.entities.models.SurvicateNpsAnswerOption;
import com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.presentation.smileyscale.micro.MicroSurveyPointSmileyScaleContentView;
import dn.j;
import i.g;
import io.sentry.android.replay.capture.e;
import java.util.HashMap;
import np.i;
import p.l2;
import qk.h;
import wt.w;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10858a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10859d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f10860g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f10861r;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i10) {
        this.f10858a = i10;
        this.f10859d = obj;
        this.f10860g = obj2;
        this.f10861r = obj3;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, lq.h] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        v vVarC;
        int i10 = this.f10858a;
        pq.c cVar = null;
        Object obj = this.f10861r;
        Object obj2 = this.f10860g;
        Object obj3 = this.f10859d;
        switch (i10) {
            case 0:
                TextView textView = (TextView) obj2;
                io.sentry.internal.debugmeta.c cVar2 = (io.sentry.internal.debugmeta.c) obj;
                float rating = ((RatingBar) obj3).getRating();
                if (rating == 0.0f) {
                    textView.setVisibility(0);
                    return;
                }
                AlertDialog alertDialog = (AlertDialog) cVar2.f12354g;
                q3.a aVar = (q3.a) cVar2.f12353d;
                alertDialog.dismiss();
                MainActivity mainActivity = (MainActivity) aVar.f20680g;
                ?? r32 = mainActivity.f6013n0;
                Context context = (Context) aVar.f20679d;
                ((com.staircase3.opensignal.utils.a) r32.getValue()).b((long) rating, "rating", "rate", "stars");
                q.a(mainActivity.f6017r0.f10852a).putBoolean("has_rated", true).apply();
                mainActivity.f6019t0.set(true);
                if (rating >= 5.0f) {
                    com.staircase3.opensignal.utils.a aVar2 = (com.staircase3.opensignal.utils.a) r32.getValue();
                    aVar2.getClass();
                    com.staircase3.opensignal.utils.a.e(aVar2, "rating", "go_to_google_play", null, 12);
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.staircase3.opensignal")));
                    return;
                }
                d dVar = new d(context, new l2(9, aVar));
                g gVar = (g) dVar.f2828r;
                gVar.show();
                EditText editText = (EditText) gVar.findViewById(h.message);
                Button button = (Button) gVar.findViewById(h.skipButton);
                Button button2 = (Button) gVar.findViewById(h.sendButton);
                if (button != null) {
                    button.setOnClickListener(new am.b(8, dVar));
                }
                if (button2 != null) {
                    button2.setOnClickListener(new j(editText, 2, dVar));
                }
                com.staircase3.opensignal.utils.a aVar3 = (com.staircase3.opensignal.utils.a) r32.getValue();
                aVar3.getClass();
                com.staircase3.opensignal.utils.a.e(aVar3, "rating", "show_let_us_know", null, 12);
                return;
            case 1:
                np.g gVar2 = (np.g) obj3;
                SurvicateNpsAnswerOption survicateNpsAnswerOption = (SurvicateNpsAnswerOption) obj2;
                k kVar = (k) obj;
                l.e(gVar2, "this$0");
                l.e(survicateNpsAnswerOption, "$item");
                gVar2.t(survicateNpsAnswerOption);
                if (kVar != null) {
                    kVar.a(survicateNpsAnswerOption);
                    return;
                }
                return;
            case 2:
                i iVar = (i) obj3;
                SurvicateNpsAnswerOption survicateNpsAnswerOption2 = (SurvicateNpsAnswerOption) obj2;
                k kVar2 = (k) obj;
                l.e(iVar, "this$0");
                l.e(survicateNpsAnswerOption2, "$item");
                iVar.t(survicateNpsAnswerOption2);
                if (kVar2 != null) {
                    kVar2.a(survicateNpsAnswerOption2);
                    return;
                }
                return;
            case 3:
                np.g gVar3 = (np.g) obj3;
                SurvicateNpsAnswerOption survicateNpsAnswerOption3 = (SurvicateNpsAnswerOption) obj2;
                k kVar3 = (k) obj;
                l.e(gVar3, "this$0");
                l.e(survicateNpsAnswerOption3, "$item");
                gVar3.t(survicateNpsAnswerOption3);
                if (kVar3 != null) {
                    kVar3.a(survicateNpsAnswerOption3);
                    return;
                }
                return;
            case 4:
                qp.b bVar = (qp.b) obj3;
                QuestionPointAnswer questionPointAnswer = (QuestionPointAnswer) obj2;
                e eVar = (e) obj;
                l.e(bVar, "this$0");
                l.e(questionPointAnswer, "$item");
                bVar.u(questionPointAnswer);
                if (eVar != null) {
                    eVar.d(questionPointAnswer);
                    return;
                }
                return;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                qp.b bVar2 = (qp.b) obj3;
                QuestionPointAnswer questionPointAnswer2 = (QuestionPointAnswer) obj2;
                e eVar2 = (e) obj;
                l.e(bVar2, "this$0");
                l.e(questionPointAnswer2, "$item");
                bVar2.u(questionPointAnswer2);
                if (eVar2 != null) {
                    eVar2.d(questionPointAnswer2);
                    return;
                }
                return;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                tp.b bVar3 = (tp.b) obj3;
                QuestionPointAnswer questionPointAnswer3 = (QuestionPointAnswer) obj2;
                s9.g gVar4 = (s9.g) obj;
                bVar3.f22945h = questionPointAnswer3;
                bVar3.f10189a.d(0, bVar3.f22941d.size());
                if (gVar4 != null) {
                    gVar4.d(questionPointAnswer3);
                    return;
                }
                return;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                tp.b bVar4 = (tp.b) obj3;
                QuestionPointAnswer questionPointAnswer4 = (QuestionPointAnswer) obj2;
                s9.g gVar5 = (s9.g) obj;
                bVar4.f22945h = questionPointAnswer4;
                bVar4.f10189a.d(0, bVar4.f22941d.size());
                if (gVar5 != null) {
                    gVar5.d(questionPointAnswer4);
                    return;
                }
                return;
            default:
                String str = (String) obj2;
                MicroSurveyPointSmileyScaleContentView microSurveyPointSmileyScaleContentView = (MicroSurveyPointSmileyScaleContentView) obj;
                int i11 = MicroSurveyPointSmileyScaleContentView.K;
                l.e(str, "$smileyScaleType");
                l.e(microSurveyPointSmileyScaleContentView, "this$0");
                QuestionPointAnswer questionPointAnswer5 = (QuestionPointAnswer) ((HashMap) obj3).get(str);
                if (questionPointAnswer5 != null) {
                    microSurveyPointSmileyScaleContentView.d(questionPointAnswer5);
                    xp.a aVar4 = microSurveyPointSmileyScaleContentView.f6515x;
                    if (aVar4 == null) {
                        l.l("bindingData");
                        throw null;
                    }
                    if (aVar4.a() && (vVarC = o0.c(microSurveyPointSmileyScaleContentView)) != null) {
                        w.s(o0.d(vVarC), null, null, new cq.h(microSurveyPointSmileyScaleContentView, cVar, 10), 3);
                    }
                    ar.a aVar5 = microSurveyPointSmileyScaleContentView.onValidationStateUpdate;
                    if (aVar5 != null) {
                        aVar5.c();
                    }
                    SurveyAnswer surveyAnswerC = microSurveyPointSmileyScaleContentView.c(questionPointAnswer5);
                    k kVar4 = microSurveyPointSmileyScaleContentView.onAnswerSelected;
                    if (kVar4 != null) {
                        kVar4.a(surveyAnswerC);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
