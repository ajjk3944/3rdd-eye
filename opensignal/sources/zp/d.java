package zp;

import androidx.lifecycle.o;
import br.l;
import br.n;
import com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextAdapterItem;
import com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextAnswer;
import lq.b0;
import n0.g1;
import n0.p;
import n0.s;
import n0.v;
import y1.h2;
import y1.i2;
import y1.m;

/* loaded from: classes.dex */
public final class d extends n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27497d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f27498g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ lq.e f27499r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, lq.e eVar, int i10) {
        super(1);
        this.f27497d = i10;
        this.f27498g = obj;
        this.f27499r = eVar;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        boolean z10;
        switch (this.f27497d) {
            case 0:
                String str = (String) obj;
                l.e(str, "it");
                MicroSurveyPointTextAnswer microSurveyPointTextAnswer = ((MicroSurveyPointTextAdapterItem) this.f27498g).f6525g;
                microSurveyPointTextAnswer.getClass();
                microSurveyPointTextAnswer.f6527a = str;
                ((qr.g) this.f27499r).c();
                return b0.f15562a;
            default:
                m mVar = (m) obj;
                ar.n nVar = (ar.n) this.f27499r;
                i2 i2Var = (i2) this.f27498g;
                if (!i2Var.f25716g) {
                    o oVarH = mVar.f25741a.h();
                    i2Var.f25718x = nVar;
                    if (i2Var.f25717r == null) {
                        i2Var.f25717r = oVarH;
                        oVarH.V0(i2Var);
                    } else if (oVarH.e1().isAtLeast(androidx.lifecycle.n.CREATED)) {
                        v vVar = i2Var.f25715d;
                        v0.d dVar = new v0.d(new h2(i2Var, nVar, 1), 1330788943, true);
                        s sVar = vVar.f17327a;
                        synchronized (vVar.f17330r) {
                            z10 = true;
                            if (vVar.Q != 1) {
                                z10 = false;
                            }
                            if (z10) {
                                vVar.Q = 0;
                            }
                        }
                        int i10 = vVar.Q;
                        if (i10 != 0) {
                            g1.b(i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
                        }
                        if (z10) {
                            p pVar = vVar.P;
                            pVar.f17277z = 100;
                            pVar.f17276y = true;
                            sVar.a(vVar, dVar);
                            if (pVar.F || pVar.f17277z != 100) {
                                g1.a("Cannot disable reuse from root if it was caused by other groups");
                            }
                            pVar.f17277z = -1;
                            pVar.f17276y = false;
                        } else {
                            sVar.a(vVar, dVar);
                        }
                    }
                }
                return b0.f15562a;
        }
    }
}
