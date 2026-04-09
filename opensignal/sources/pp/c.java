package pp;

import br.n;
import br.w;
import br.x;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.presentation.single.micro.MicroSurveyPointSingleAnswerItem;
import com.survicate.surveys.presentation.single.micro.MicroSurveyPointSingleContentView;
import com.survicate.surveys.presentation.widget.MicroSurvicateCommentField;
import g1.g0;
import h7.n1;
import io.sentry.android.core.u0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import lq.b0;
import mq.f0;
import on.k;
import qm.l;
import qr.j;
import rr.n0;
import ss.o;
import tt.s;
import ur.p0;
import x1.f1;
import x1.i0;
import x1.s0;
import y1.p1;
import zp.i;

/* loaded from: classes.dex */
public final class c extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20606d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f20607g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, Object obj) {
        super(0);
        this.f20606d = i10;
        this.f20607g = obj;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [ar.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, java.util.List] */
    @Override // ar.a
    public final Object c() {
        switch (this.f20606d) {
            case 0:
                d dVar = (d) this.f20607g;
                dVar.g0().g(dVar.l());
                return b0.f15562a;
            case 1:
                return e5.y((l) this.f20607g).f13863a.b().a(null, x.f2918a.b(com.staircase3.opensignal.utils.a.class), null);
            case 2:
                qr.l lVar = (qr.l) this.f20607g;
                or.l lVar2 = lVar.f20994f;
                if (lVar2 == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                j jVar = (j) lVar2.c();
                lVar.f20994f = null;
                return jVar;
            case 3:
                return (at.n) ((n0) this.f20607g).f21694b.a(jt.f.f13843a);
            case 4:
                sp.c cVar = (sp.c) this.f20607g;
                cVar.g0().g(cVar.l());
                return b0.f15562a;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                sr.j jVar2 = (sr.j) this.f20607g;
                return jVar2.f22220a.i(jVar2.f22221b).q();
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                o oVar = ((ss.j) this.f20607g).f22246a;
                o oVar2 = new o();
                Field[] declaredFields = o.class.getDeclaredFields();
                br.l.d(declaredFields, "this::class.java.declaredFields");
                for (Field field : declaredFields) {
                    if ((field.getModifiers() & 8) == 0) {
                        field.setAccessible(true);
                        Object obj = field.get(oVar);
                        ss.n nVar = obj instanceof ss.n ? (ss.n) obj : null;
                        if (nVar != null) {
                            String name = field.getName();
                            br.l.d(name, "field.name");
                            s.n0(name, "is", false);
                            ir.d dVarB = x.f2918a.b(o.class);
                            field.getName();
                            String name2 = field.getName();
                            br.l.d(name2, "field.name");
                            if (name2.length() > 0) {
                                char upperCase = Character.toUpperCase(name2.charAt(0));
                                String strSubstring = name2.substring(1);
                                br.l.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(upperCase);
                                sb2.append(strSubstring);
                            }
                            ((br.e) dVarB).a();
                            field.set(oVar2, new ss.n(nVar.f22248a, oVar2));
                        }
                    }
                }
                oVar2.f(f0.N(oVar2.k(), e5.I(or.n.f19702p, or.n.f19703q)));
                oVar2.f22250a = true;
                return new ss.j(oVar2);
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                js.e eVar = (js.e) this.f20607g;
                List listA = ((k) eVar.f13798g).a();
                ((u0) ((iq.f) eVar.f13800x)).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listA) {
                    Long throttledToMs = ((hq.c) obj2).getThrottledToMs();
                    if (throttledToMs != null && jCurrentTimeMillis >= throttledToMs.longValue()) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    eVar.o0(arrayList, listA);
                }
                return b0.f15562a;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return (List) ((p0) this.f20607g).I.getValue();
            case 9:
                ht.x xVarB = ((ht.p0) this.f20607g).b();
                br.l.d(xVarB, "this@createCapturedIfNeeded.type");
                return xVarB;
            case 10:
                kp.d dVar2 = (kp.d) ((kp.b) this.f20607g).f14468h;
                if (dVar2 != null) {
                    dVar2.c();
                }
                return b0.f15562a;
            case 11:
                MicroSurveyPointSingleContentView microSurveyPointSingleContentView = (MicroSurveyPointSingleContentView) this.f20607g;
                MicroSurveyPointSingleAnswerItem microSurveyPointSingleAnswerItem = microSurveyPointSingleContentView.F;
                if (microSurveyPointSingleAnswerItem != null) {
                    n1 n1VarI = microSurveyPointSingleContentView.f6503x.I(microSurveyPointSingleContentView.f6499a.indexOf(microSurveyPointSingleAnswerItem) + 1);
                    vp.f fVar = n1VarI instanceof vp.f ? (vp.f) n1VarI : null;
                    MicroSurvicateCommentField microSurvicateCommentField = fVar != null ? fVar.f23945v : null;
                    if (microSurvicateCommentField != null && microSurvicateCommentField.isAttachedToWindow()) {
                        microSurvicateCommentField.d();
                    }
                }
                return b0.f15562a;
            case 12:
                vp.c cVar2 = (vp.c) this.f20607g;
                cVar2.g0().g(cVar2.l());
                return b0.f15562a;
            case 13:
                i0 i0VarR = ((x1.f0) this.f20607g).r();
                i0VarR.f24859p.f24976y = true;
                s0 s0Var = i0VarR.f24860q;
                if (s0Var != null) {
                    s0Var.f24929t = true;
                }
                return b0.f15562a;
            case 14:
                ar.k kVar = (ar.k) this.f20607g;
                g0 g0Var = f1.J;
                kVar.a(g0Var);
                g0Var.f9231q = g0Var.k.a(g0Var.f9227m, g0Var.f9229o, g0Var.f9228n);
                return b0.f15562a;
            case 15:
                xp.d dVar3 = (xp.d) this.f20607g;
                dVar3.g0().g(dVar3.l());
                return b0.f15562a;
            case 16:
                ir.d dVarH = ir.f0.H((Class) this.f20607g);
                jv.a aVar = lv.a.f15967b;
                if (aVar == null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                Object objA = aVar.f13863a.b().a(null, dVarH, null);
                if (objA != null) {
                    return objA;
                }
                jv.a aVar2 = lv.a.f15967b;
                if (aVar2 != null) {
                    return aVar2.f13863a.b().a(null, dVarH, null);
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case 17:
                ((p1) this.f20607g).getClass();
                return b0.f15562a;
            case 18:
                ((ar.a) ((w) this.f20607g).f2917a).c();
                return b0.f15562a;
            case 19:
                zo.d dVar4 = (zo.d) this.f20607g;
                dVar4.g0().g(dVar4.l());
                return b0.f15562a;
            default:
                i iVar = (i) this.f20607g;
                iVar.g0().g(iVar.l());
                return b0.f15562a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p1 p1Var, y1.x xVar) {
        super(0);
        this.f20606d = 17;
        this.f20607g = p1Var;
    }
}
