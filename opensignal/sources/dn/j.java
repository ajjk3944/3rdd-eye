package dn;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.RelativeLayout;
import androidx.lifecycle.o0;
import androidx.lifecycle.v;
import bh.m;
import br.l;
import com.google.android.gms.maps.model.LatLng;
import com.staircase3.opensignal.activities.MainActivity;
import com.staircase3.opensignal.osca.domain.model.ResolutionCardInfo;
import com.staircase3.opensignal.viewcontrollers.TabCoverage;
import com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.presentation.csat.micro.MicroSurveyPointCsatContentView;
import lf.t1;
import mq.b0;
import p.l2;
import wt.w;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7415a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7416d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7417g;

    public /* synthetic */ j(Object obj, int i10, Object obj2) {
        this.f7415a = i10;
        this.f7416d = obj;
        this.f7417g = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.lang.Object, lq.h] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        v vVarC;
        int i10 = this.f7415a;
        pq.c cVar = null;
        Object obj = this.f7417g;
        Object obj2 = this.f7416d;
        switch (i10) {
            case 0:
                ResolutionCardInfo resolutionCardInfo = (ResolutionCardInfo) obj;
                bf.a aVar = ((k) obj2).f7418u;
                String str = resolutionCardInfo.f6135g;
                m mVar = resolutionCardInfo.f6136r;
                int i11 = resolutionCardInfo.f6137x;
                i iVar = (i) aVar.f2695d;
                l.e(mVar, "solution");
                an.a aVar2 = (an.a) iVar.M0.getValue();
                String strA = ((bn.e) iVar.N0.getValue()).f2839a.a();
                aVar2.getClass();
                l.e(strA, "entityId");
                mVar.toString();
                aVar2.f882a.d("CATEGORY_OSCA", "osca_recipe_triggered", b0.R(new lq.l("entity_id", strA), new lq.l("connection", aVar2.b()), new lq.l("solution_name", Integer.valueOf(mVar.getId())), new lq.l("result_code", Integer.valueOf(i11))));
                f fVar = iVar.O0;
                if (fVar != null) {
                    fVar.b(str);
                    return;
                }
                return;
            case 1:
                ge.j jVar = (ge.j) obj2;
                jVar.getClass();
                ((View.OnClickListener) obj).onClick(view);
                jVar.a(1);
                return;
            case 2:
                EditText editText = (EditText) obj2;
                bm.d dVar = (bm.d) obj;
                Editable text = editText != null ? editText.getText() : null;
                if (text == null || text.length() == 0) {
                    if (editText != null) {
                        editText.setError(((Context) dVar.f2826d).getString(qk.l.rating_error_tell_us));
                        return;
                    }
                    return;
                }
                ((i.g) dVar.f2828r).dismiss();
                l2 l2Var = (l2) dVar.f2827g;
                String string = text.toString();
                q3.a aVar3 = (q3.a) l2Var.f20100d;
                MainActivity mainActivity = (MainActivity) aVar3.f20680g;
                com.staircase3.opensignal.utils.a aVar4 = (com.staircase3.opensignal.utils.a) mainActivity.f6013n0.getValue();
                aVar4.getClass();
                com.staircase3.opensignal.utils.a.e(aVar4, "rating", "send_message", null, 12);
                try {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{mainActivity.getString(qk.l.contact_mail)});
                    intent.putExtra("android.intent.extra.SUBJECT", mainActivity.getString(qk.l.subject_mail));
                    intent.putExtra("android.intent.extra.TEXT", string);
                    Intent intentCreateChooser = Intent.createChooser(intent, mainActivity.getString(qk.l.chooser_title_mail));
                    if (intentCreateChooser.resolveActivity(mainActivity.getPackageManager()) != null) {
                        ((Context) aVar3.f20679d).startActivity(intentCreateChooser);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    boolean z10 = MainActivity.f5997x0;
                    return;
                }
            case 3:
                ((c7.b) obj2).a(((ip.h) obj).f12911b);
                return;
            case 4:
                sm.a aVar5 = (sm.a) obj;
                mn.a aVar6 = ((sk.b) obj2).f22065c;
                if (aVar6 == null) {
                    l.l("placeClickedListener");
                    throw null;
                }
                TabCoverage tabCoverage = aVar6.f16887a;
                ((AutoCompleteTextView) tabCoverage.f6203x0.f832b.f14398r).setText("");
                ((AutoCompleteTextView) tabCoverage.f6203x0.f832b.f14398r).dismissDropDown();
                kc.f.m(tabCoverage.n(), (RelativeLayout) tabCoverage.f6203x0.f832b.f14397g);
                tabCoverage.j0();
                t1.e(tabCoverage.f6204y0, new LatLng(aVar5.f22106e, aVar5.f22107f), ((el.b) tabCoverage.O0.getValue()).f8205c, null);
                return;
            default:
                mm.d dVar2 = (mm.d) obj2;
                QuestionPointAnswer questionPointAnswer = (QuestionPointAnswer) obj;
                dVar2.r(questionPointAnswer);
                s9.g gVar = (s9.g) dVar2.f16885g;
                if (gVar != null) {
                    MicroSurveyPointCsatContentView microSurveyPointCsatContentView = (MicroSurveyPointCsatContentView) gVar.f21944d;
                    int i12 = MicroSurveyPointCsatContentView.F;
                    zo.b bVar = microSurveyPointCsatContentView.f6380r;
                    if (bVar == null) {
                        l.l("bindingData");
                        throw null;
                    }
                    if (bVar.a() && (vVarC = o0.c(microSurveyPointCsatContentView)) != null) {
                        w.s(o0.d(vVarC), null, null, new cq.h(microSurveyPointCsatContentView, cVar, 13), 3);
                    }
                    ar.a aVar7 = microSurveyPointCsatContentView.onValidationStateUpdate;
                    if (aVar7 != null) {
                        aVar7.c();
                    }
                    SurveyAnswer surveyAnswerC = microSurveyPointCsatContentView.c(questionPointAnswer);
                    ar.k kVar = microSurveyPointCsatContentView.onAnswerSelected;
                    if (kVar != null) {
                        kVar.a(surveyAnswerC);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
