package Q6;

import E.u;
import H6.C0675l;
import N7.C1098ad;
import N7.C1159f;
import N7.C1302p;
import N7.C1441z;
import N7.Dd;
import N7.Pc;
import N7.U;
import N7.U3;
import N7.td;
import Z6.d;
import b9.C1992A;
import b9.x;
import c9.C2097r;
import c9.C2099t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: ErrorVisualMonitor.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final d f11327a;

    /* renamed from: b, reason: collision with root package name */
    public final C0675l f11328b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11329c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f11330d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f11331e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f11332f;

    /* renamed from: g, reason: collision with root package name */
    public b f11333g;

    /* renamed from: h, reason: collision with root package name */
    public final a f11334h;
    public j i;

    /* compiled from: ErrorVisualMonitor.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.p<List<? extends Throwable>, List<? extends Throwable>, C1992A> {
        public a() {
            super(2);
        }

        @Override // p9.p
        public final C1992A invoke(List<? extends Throwable> list, List<? extends Throwable> list2) {
            List<? extends Throwable> errors = list;
            List<? extends Throwable> warnings = list2;
            kotlin.jvm.internal.l.f(errors, "errors");
            kotlin.jvm.internal.l.f(warnings, "warnings");
            g gVar = g.this;
            if (gVar.f11329c) {
                ArrayList arrayList = gVar.f11331e;
                arrayList.clear();
                arrayList.addAll(C2097r.A0(errors));
                ArrayList arrayList2 = gVar.f11332f;
                arrayList2.clear();
                arrayList2.addAll(C2097r.A0(warnings));
                gVar.b(j.a(gVar.i, false, arrayList.size(), arrayList2.size(), androidx.work.s.d("Last 25 errors:\n", C2097r.u0(C2097r.D0(25, arrayList), "\n", null, null, f.f11326g, 30)), androidx.work.s.d("Last 25 warnings:\n", C2097r.u0(C2097r.D0(25, arrayList2), "\n", null, null, h.f11336g, 30)), 1));
            }
            return C1992A.f18074a;
        }
    }

    public g(d dVar, C0675l div2View, boolean z10) {
        kotlin.jvm.internal.l.f(div2View, "div2View");
        this.f11327a = dVar;
        this.f11328b = div2View;
        this.f11329c = z10;
        this.f11330d = new LinkedHashSet();
        this.f11331e = new ArrayList();
        this.f11332f = new ArrayList();
        this.f11334h = new a();
        this.i = new j(0);
    }

    public final String a(boolean z10) throws JSONException {
        InterfaceC5868a dd;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = this.f11331e;
        if (arrayList.size() > 0) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", u.k(th));
                jSONObject2.put("stacktrace", x.b(th));
                if (th instanceof z7.d) {
                    z7.d dVar = (z7.d) th;
                    jSONObject2.put("reason", dVar.f48476b);
                    I9.g gVar = dVar.f48477c;
                    jSONObject2.put("json_source", gVar != null ? gVar.O() : null);
                    jSONObject2.put("json_summary", dVar.f48478d);
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("errors", jSONArray);
        }
        ArrayList arrayList2 = this.f11332f;
        if (arrayList2.size() > 0) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Throwable th2 = (Throwable) it2.next();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("warning_message", th2.getMessage());
                jSONObject3.put("stacktrace", x.b(th2));
                jSONArray2.put(jSONObject3);
            }
            jSONObject.put("warnings", jSONArray2);
        }
        if (z10) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("templates", new JSONObject());
            C0675l c0675l = this.f11328b;
            U3 divData = c0675l.getDivData();
            jSONObject4.put("card", divData != null ? divData.i() : null);
            JSONArray jSONArray3 = new JSONArray();
            Collection<Z6.d> collectionValues = c0675l.getDiv2Component$div_release().n().f46085a.values();
            kotlin.jvm.internal.l.e(collectionValues, "variables.values");
            Iterator it3 = C2097r.y0(C2099t.f18581b, collectionValues).iterator();
            while (it3.hasNext()) {
                Z6.d dVar2 = (Z6.d) it3.next();
                dVar2.getClass();
                if (dVar2 instanceof d.a) {
                    dd = new C1159f(((d.a) dVar2).f14035b, ((d.a) dVar2).f14036c);
                } else if (dVar2 instanceof d.b) {
                    dd = new C1302p(((d.b) dVar2).f14037b, ((d.b) dVar2).f14038c);
                } else if (dVar2 instanceof d.c) {
                    dd = new C1441z(((d.c) dVar2).f14039b, ((d.c) dVar2).f14040c);
                } else if (dVar2 instanceof d.C0207d) {
                    dd = new U(((d.C0207d) dVar2).f14041b, ((d.C0207d) dVar2).f14042c);
                } else if (dVar2 instanceof d.e) {
                    dd = new C1098ad(((d.e) dVar2).f14043b, ((d.e) dVar2).f14044c);
                } else if (dVar2 instanceof d.f) {
                    dd = new Pc(((d.f) dVar2).f14045b, ((d.f) dVar2).f14046c);
                } else if (dVar2 instanceof d.g) {
                    dd = new td(((d.g) dVar2).f14047b, ((d.g) dVar2).f14048c);
                } else {
                    if (!(dVar2 instanceof d.h)) {
                        throw new b9.j();
                    }
                    dd = new Dd(((d.h) dVar2).f14049b, ((d.h) dVar2).f14050c);
                }
                jSONArray3.put(dd.i());
            }
            jSONObject4.put("variables", jSONArray3);
            jSONObject.put("card", jSONObject4);
        }
        String string = jSONObject.toString(4);
        kotlin.jvm.internal.l.e(string, "results.toString(/*indentSpaces*/ 4)");
        return string;
    }

    public final void b(j jVar) {
        this.i = jVar;
        Iterator it = this.f11330d.iterator();
        while (it.hasNext()) {
            ((p9.l) it.next()).invoke(jVar);
        }
    }
}
