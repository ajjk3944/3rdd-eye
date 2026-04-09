package com.google.android.gms.internal.ads;

import A2.C0131t;
import a0.C0244C;
import a0.C0248b;
import a0.InterfaceC0252f;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import z5.AbstractC3046w;

/* renamed from: com.google.android.gms.internal.ads.ri, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1811ri implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16598a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16599b;

    public /* synthetic */ C1811ri(int i, Object obj) {
        this.f16598a = i;
        this.f16599b = obj;
    }

    public C1492lm a() {
        C1492lm c1492lm = (C1492lm) ((C1283hr) this.f16599b).f14592b;
        Cr.v(c1492lm);
        return c1492lm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        Object sb;
        int i = this.f16598a;
        int i3 = 19;
        int i6 = 2;
        int i7 = 0;
        Object obj = this.f16599b;
        switch (i) {
            case 0:
                return new C1758qi(i7, new C2083wk(((C0540Hh) ((C0901aq) obj).f13232b).a()));
            case 1:
                return (ViewGroup) ((L6) obj).f9620b;
            case 2:
                return ((C0847Zi) obj).a();
            case 3:
                C1271hf c1271hf = (C1271hf) obj;
                return new C1922tl(new C1112ej((InterfaceC0828Yg) ((C1003cj) c1271hf.f14516b).f13663b.f15176e, (C0784Vn) c1271hf.f14517c.c(), ((C2190yj) c1271hf.f14518d).a()), AbstractC0640Nf.f10005a);
            case 4:
                C1808rf c1808rf = (C1808rf) obj;
                C1221gj c1221gj = new C1221gj((InterfaceC0828Yg) ((C1003cj) c1808rf.f16590b).f13663b.f15176e, (Executor) c1808rf.f16591c.c());
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.Pd)).booleanValue()) {
                    C1922tl c1922tl = new C1922tl(c1221gj, AbstractC0640Nf.f10005a);
                    int i8 = RB.f10866c;
                    sb = new SB(c1922tl);
                } else {
                    int i9 = RB.f10866c;
                    sb = C1519mC.f15594j;
                }
                Cr.v(sb);
                return sb;
            case 5:
                return ((C0682Pn) obj).a();
            case 6:
                C2242zh c2242zh = (C2242zh) obj;
                return new C1705pj(new C1485lf(((C0540Hh) c2242zh.f17895b).a(), ((C1113ek) c2242zh.f17896c).a().f13485g));
            case 7:
                return new C1866sj(((C1961uN) obj).c());
            case 8:
                return new C0712Rj(((C2190yj) obj).b());
            case 9:
                return (C0697Ql) obj;
            case 10:
                C1708pm c1708pm = (C1708pm) ((C0731Sl) obj).f11226a.f10691b;
                Cr.v(c1708pm);
                Set setSingleton = c1708pm.f16219d != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
                Cr.v(setSingleton);
                return setSingleton;
            case 11:
                C1546mm c1546mm = (C1546mm) ((C0527Gl) obj).f8437b.c();
                Cr.v(c1546mm);
                JSONObject jSONObject = c1546mm.f15651b;
                if (jSONObject == null) {
                    try {
                        jSONObject = new JSONObject(c1546mm.f15813a.f10804z);
                    } catch (JSONException unused) {
                        return null;
                    }
                }
                return jSONObject;
            case 12:
                BinderC0897am binderC0897am = new BinderC0897am(((C0952bm) obj).f13460b.a());
                C1384jm c1384jm = new C1384jm();
                c1384jm.f14991a = binderC0897am;
                return c1384jm;
            case 13:
                C1492lm c1492lm = (C1492lm) ((C1283hr) obj).f14592b;
                Cr.v(c1492lm);
                return c1492lm;
            case 14:
                return new C2081wi(1, (InterfaceC0828Yg) ((InterfaceC1853sN) obj).c());
            case 15:
                return new C1922tl(new C2081wi(1, (InterfaceC0828Yg) ((InterfaceC1853sN) ((C1811ri) obj).f16599b).c()), AbstractC0640Nf.f10010f);
            case 16:
                C0902ar c0902ar = (C0902ar) obj;
                InterfaceC0252f interfaceC0252f = (InterfaceC0252f) c0902ar.f13234b.c();
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new C0495En(new C1009cp(interfaceC0252f, new Wu(i6, c0623Mf), (C0512Fn) c0902ar.f13235c.c(), new C1285ht(9, (byte) 0)));
            case 17:
                C0623Mf c0623Mf2 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf2);
                C1808rf c1808rf2 = (C1808rf) obj;
                Set setSingleton2 = ((Boolean) C2841s.f23267e.f23270c.a(H9.U5)).booleanValue() ? Collections.singleton(new C1922tl(new C0648Nn((A8) ((InterfaceC2069wN) c1808rf2.f16590b).c(), ((C1961uN) c1808rf2.f16591c).c()), c0623Mf2)) : Collections.EMPTY_SET;
                Cr.v(setSingleton2);
                return setSingleton2;
            case 18:
                C2242zh c2242zh2 = (C2242zh) obj;
                C1603np c1603np = new C1603np(((C0540Hh) c2242zh2.f17895b).a(), (C1593nf) c2242zh2.f17896c.c());
                C0623Mf c0623Mf3 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf3);
                return new C1922tl(c1603np, c0623Mf3);
            case 19:
                C1808rf c1808rf3 = (C1808rf) obj;
                C0514Fp c0514Fp = (C0514Fp) ((InterfaceC2069wN) c1808rf3.f16590b).c();
                C1808rf c1808rf4 = (C1808rf) c1808rf3.f16591c;
                C0648Nn c0648Nn = new C0648Nn(c0514Fp, new C0531Gp(((C1808rf) c1808rf4.f16590b).a(), ((C0489Eh) c1808rf4.f16591c).c()));
                C0623Mf c0623Mf4 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf4);
                return new C1922tl(c0648Nn, c0623Mf4);
            case 20:
                return new Gr(5, (Bundle) ((C1004ck) obj).f13665b.f13215c);
            case 21:
                Cr.v(AbstractC0640Nf.f10005a);
                Cr.v(((C1807re) ((C1013ct) obj).f13693b.f2570c).f16579d);
                return new C0904at();
            case 22:
                Context context = ((C0506Fh) obj).f8158b.f7822b;
                Cr.v(context);
                C0623Mf c0623Mf5 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf5);
                C1611nx c1611nx = C1719px.f16259a;
                return new C0244C(new C1773qx(context), a4.p.l(new C0248b(d5.s.f19824a, null)), new S4.r(19), AbstractC3046w.a(new z5.M(c0623Mf5)));
            case 23:
                My my = (My) ((C1799rN) new C1431kf(((C0909ay) ((Yx) obj).c()).f13268a).f15175d).c();
                Cr.v(my);
                return my;
            case 24:
                K4.e eVar = ((Zx) ((Yx) obj).c()).f12996a;
                C1907tN c1907tN = (C1907tN) eVar.f2238b;
                C1907tN c1907tN2 = (C1907tN) eVar.f2240d;
                C1799rN c1799rNA = C1799rN.a(new V9(c1907tN, c1907tN2, (C1799rN) eVar.f2244h, 10));
                int i10 = 14;
                C1799rN c1799rNA2 = C1799rN.a(new C0902ar(c1907tN, c1799rNA, i10));
                C1799rN c1799rN = (C1799rN) eVar.i;
                C1799rN c1799rN2 = (C1799rN) eVar.f2239c;
                C1907tN c1907tN3 = (C1907tN) eVar.f2241e;
                C1799rN c1799rNA3 = C1799rN.a(new T9(c1799rNA2, c1799rN, c1799rN2, c1907tN3, 11));
                C1799rN c1799rN3 = (C1799rN) eVar.f2249n;
                C1799rN c1799rNA4 = C1799rN.a(new C0901aq(c1799rN3, 28));
                C1799rN c1799rN4 = (C1799rN) eVar.f2236C;
                C1799rN c1799rNA5 = C1799rN.a(new V9(C1799rN.a(new C0131t(C1799rN.a(new V9(c1799rNA4, c1799rN4, c1799rN, 17)), C1799rN.a(new V9(C1799rN.a(new C0922bA(c1799rN3, 0)), c1799rN4, c1799rN, 18)), C1799rN.a(new V9(C1799rN.a(new C0922bA(c1799rN3, 2)), c1799rN4, c1799rN, i3)), C1799rN.a(new V9(C1799rN.a(new C0901aq(c1799rN3, 25)), c1799rN4, c1799rN, i10)), C1799rN.a(new V9(C1799rN.a(new C0901aq(c1799rN3, 26)), c1799rN4, c1799rN, 15)), C1799rN.a(new V9(C1799rN.a(new C0901aq(c1799rN3, 27)), c1799rN4, c1799rN, 16)), C1799rN.a(new C0901aq(c1799rN3, 29)), c1907tN2, c1799rN)), C1799rN.a(new V9(C1799rN.a(new V9(c1907tN, c1799rNA2, c1799rN, 11)), c1907tN2, c1799rN, 20)), c1907tN3, 13));
                C1799rN c1799rNA6 = C1799rN.a(new C0922bA(c1799rN3, 1));
                C1799rN c1799rNA7 = C1799rN.a(AbstractC1114el.f13943L);
                My my2 = (My) C1799rN.a(new T9(C1799rN.a(new C2243zi(c1799rNA3, C1799rN.a(new C1397jz(c1907tN, c1799rNA2, c1799rNA5, c1799rN, c1907tN2, C1799rN.a(new V9(c1799rNA6, c1799rNA7, c1799rN, 12)), c1799rNA, 1)), c1799rNA5, c1799rN, (C1799rN) eVar.f2242f, c1907tN3, 1)), C1799rN.a(new C0660Oi(C1799rN.a(new C0660Oi(c1907tN, C1799rN.a(new V9(c1907tN, c1907tN3, (C1799rN) eVar.f2246k, 9)), c1799rNA, c1799rNA7, c1907tN3, 2)), c1799rNA5, c1799rNA3, c1799rN, c1907tN2, 3)), c1799rNA5, c1907tN3, 9)).c();
                Cr.v(my2);
                return my2;
            default:
                K4.e eVar2 = ((C1018cy) ((Yx) obj).c()).f13699a;
                C1799rN c1799rN5 = (C1799rN) eVar2.f2239c;
                C1799rN c1799rN6 = (C1799rN) eVar2.i;
                C1907tN c1907tN4 = (C1907tN) eVar2.f2241e;
                C1799rN c1799rNA8 = C1799rN.a(new V9(c1799rN5, c1799rN6, c1907tN4, 24));
                C1799rN c1799rNA9 = C1799rN.a(AbstractC0933bL.f13375z);
                C1907tN c1907tN5 = (C1907tN) eVar2.f2238b;
                C1907tN c1907tN6 = (C1907tN) eVar2.f2240d;
                C1799rN c1799rNA10 = C1799rN.a(new C2243zi(c1907tN5, c1907tN6, c1907tN4, (C1799rN) eVar2.f2243g, c1799rN6, c1799rNA9, 3));
                C1799rN c1799rN7 = (C1799rN) eVar2.f2249n;
                C1799rN c1799rNA11 = C1799rN.a(new C0922bA(c1799rN7, 3));
                C1799rN c1799rN8 = (C1799rN) eVar2.f2236C;
                C1799rN c1799rNA12 = C1799rN.a(new T9(C1799rN.a(new V9(c1799rNA11, c1799rN8, c1799rN6, 21)), C1799rN.a(new V9(C1799rN.a(new C0922bA(c1799rN7, 4)), c1799rN8, c1799rN6, 22)), C1799rN.a(new V9(C1799rN.a(new C0922bA(c1799rN7, 5)), c1799rN8, c1799rN6, 23)), c1799rN6, 10));
                My my3 = (My) C1799rN.a(new T9(C1799rN.a(new C2243zi(c1799rNA8, c1799rNA10, c1799rNA12, c1799rN6, (C1799rN) eVar2.f2242f, c1907tN4, 1)), C1799rN.a(new C2243zi(c1799rNA8, c1799rNA12, (C1799rN) eVar2.f2246k, c1799rN6, c1907tN4, c1907tN6, 2)), c1799rNA12, c1907tN4, 9)).c();
                Cr.v(my3);
                return my3;
        }
    }
}
