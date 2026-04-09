package s9;

import a5.d0;
import android.content.ClipData;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.o0;
import androidx.lifecycle.v;
import ar.k;
import ar.n;
import com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.presentation.shape.micro.MicroSurveyPointShapeContentView;
import cq.h;
import io.sentry.android.core.e0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m9.i;
import mq.o;
import oh.p;
import p.l2;
import p.r;
import u3.i0;
import wt.w;
import x0.l;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements u9.b, eg.a, u5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21943a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21944d;

    public /* synthetic */ g(int i10, Object obj) {
        this.f21943a = i10;
        this.f21944d = obj;
    }

    public void a() {
        n nVar = (n) this.f21944d;
        synchronized (l.f24717c) {
            l.f24722h = o.B0((List) l.f24722h, nVar);
        }
    }

    @Override // u5.d
    public long b(long j) {
        return d0.i((j * r0.f23303e) / 1000000, 0L, ((u5.o) this.f21944d).j - 1);
    }

    public boolean c(o2.g gVar, int i10, Bundle bundle) {
        u3.c l2Var;
        r rVar = (r) this.f21944d;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                ((w3.f) gVar.f18754d).c();
                Parcelable parcelable = (Parcelable) ((w3.f) gVar.f18754d).n();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e4) {
                e0.q("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e4);
                return false;
            }
        }
        w3.f fVar = (w3.f) gVar.f18754d;
        ClipData clipData = new ClipData(fVar.getDescription(), new ClipData.Item(fVar.a()));
        if (i11 >= 31) {
            l2Var = new l2(clipData, 2);
        } else {
            u3.d dVar = new u3.d();
            dVar.f23150d = clipData;
            dVar.f23151g = 2;
            l2Var = dVar;
        }
        l2Var.a(fVar.j());
        l2Var.setExtras(bundle);
        return i0.j(rVar, l2Var.build()) == null;
    }

    public void d(QuestionPointAnswer questionPointAnswer) {
        v vVarC;
        MicroSurveyPointShapeContentView microSurveyPointShapeContentView = (MicroSurveyPointShapeContentView) this.f21944d;
        int i10 = MicroSurveyPointShapeContentView.H;
        sp.a aVar = microSurveyPointShapeContentView.f6484r;
        pq.c cVar = null;
        if (aVar == null) {
            br.l.l("bindingData");
            throw null;
        }
        if (aVar.a() && (vVarC = o0.c(microSurveyPointShapeContentView)) != null) {
            w.s(o0.d(vVarC), null, null, new h(microSurveyPointShapeContentView, cVar, 7), 3);
        }
        ar.a aVar2 = microSurveyPointShapeContentView.onValidationStateUpdate;
        if (aVar2 != null) {
            aVar2.c();
        }
        SurveyAnswer surveyAnswerC = microSurveyPointShapeContentView.c(questionPointAnswer);
        k kVar = microSurveyPointShapeContentView.onAnswerSelected;
        if (kVar != null) {
            kVar.a(surveyAnswerC);
        }
    }

    @Override // u9.b
    public Object g() {
        switch (this.f21943a) {
            case 0:
                t9.h hVar = (t9.h) ((t9.c) ((al.b) this.f21944d).f817i);
                SQLiteDatabase sQLiteDatabaseB = hVar.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    sQLiteDatabaseB.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseB.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar.f22680d.e()).execute();
                    sQLiteDatabaseB.setTransactionSuccessful();
                    sQLiteDatabaseB.endTransaction();
                    return null;
                } catch (Throwable th2) {
                    sQLiteDatabaseB.endTransaction();
                    throw th2;
                }
            default:
                js.e eVar = (js.e) this.f21944d;
                Iterator it = ((Iterable) ((t9.h) ((t9.d) eVar.f13799r)).h(new p5.b(12))).iterator();
                while (it.hasNext()) {
                    ((qm.c) eVar.f13800x).O((i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // eg.a
    public void k(eg.b bVar) {
        switch (this.f21943a) {
            case 3:
                AtomicReference atomicReference = (AtomicReference) ((p) this.f21944d).f19481d;
                if (bVar.get() != null) {
                    throw new ClassCastException();
                }
                atomicReference.set(null);
                return;
            default:
                AtomicReference atomicReference2 = (AtomicReference) ((o2.g) this.f21944d).f18754d;
                if (bVar.get() != null) {
                    throw new ClassCastException();
                }
                atomicReference2.set(null);
                return;
        }
    }
}
