package N7;

import A7.b;
import N7.C1175g0;
import c9.C2091l;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionJsonParser.kt */
/* renamed from: N7.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1276n1 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8778a = new b.C0000b(Boolean.TRUE);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final l7.i f8779b;

    /* compiled from: DivActionJsonParser.kt */
    /* renamed from: N7.n1$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f8780g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof C1175g0.b);
        }
    }

    /* compiled from: DivActionJsonParser.kt */
    /* renamed from: N7.n1$b */
    public static final class b implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8781a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8781a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v5, types: [A7.b] */
        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f8781a;
            C1223j4 c1223j4 = (C1223j4) k8.F.q(context, data, "download_callbacks", uc.f6566P2);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = C1276n1.f8778a;
            j6.l lVar = l7.e.f43877a;
            ?? B10 = l7.b.b(context, data, "is_enabled", aVar, aVar2, lVar, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            k.g gVar = l7.k.f43898c;
            A8.d dVar = l7.e.f43878b;
            A7.b bVarA = l7.b.a(context, data, "log_id", gVar, dVar, lVar);
            k.h hVar = l7.k.f43900e;
            h.b bVar = l7.h.f43883d;
            return new C1175g0(c1223j4, c0000b2, bVarA, l7.b.b(context, data, "log_url", hVar, bVar, lVar, null), k8.F.s(context, data, "menu_items", uc.f6799k1), (JSONObject) k8.F.r(context, data, "payload", dVar, lVar), l7.b.b(context, data, "referer", hVar, bVar, lVar, null), (String) k8.F.r(context, data, "scope_id", dVar, lVar), l7.b.b(context, data, "target", C1276n1.f8779b, C1175g0.b.FROM_STRING, lVar, null), (AbstractC1192h2) k8.F.q(context, data, "typed", uc.f6695b1), l7.b.b(context, data, ImagesContract.URL, hVar, bVar, lVar, null));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1175g0 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f8781a;
            k8.F.z(context, jSONObject, "download_callbacks", value.f8253a, uc.f6566P2);
            l7.b.d(context, jSONObject, "is_enabled", value.f8254b);
            l7.b.d(context, jSONObject, "log_id", value.f8255c);
            h.g gVar = l7.h.f43882c;
            l7.b.e(context, jSONObject, "log_url", value.f8256d, gVar);
            k8.F.B(context, jSONObject, "menu_items", value.f8257e, uc.f6799k1);
            k8.F.y(context, jSONObject, "payload", value.f8258f);
            l7.b.e(context, jSONObject, "referer", value.f8259g, gVar);
            k8.F.y(context, jSONObject, "scope_id", value.f8260h);
            l7.b.e(context, jSONObject, "target", value.i, C1175g0.b.TO_STRING);
            k8.F.z(context, jSONObject, "typed", value.f8261j, uc.f6695b1);
            l7.b.e(context, jSONObject, ImagesContract.URL, value.f8262k, gVar);
            return jSONObject;
        }
    }

    /* compiled from: DivActionJsonParser.kt */
    /* renamed from: N7.n1$c */
    public static final class c implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8782a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8782a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final Z6.b c(D7.f fVar, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            Uc uc = this.f8782a;
            AbstractC5371a abstractC5371aH = l7.c.h(fVarW, jSONObject, "download_callbacks", zP, null, uc.f6577Q2);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            j6.l lVar = l7.e.f43877a;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "is_enabled", aVar, zP, null, aVar2, lVar);
            AbstractC5371a abstractC5371aD = l7.c.d(fVarW, jSONObject, "log_id", l7.k.f43898c, zP, null);
            k.h hVar = l7.k.f43900e;
            h.b bVar = l7.h.f43883d;
            AbstractC5371a abstractC5371aJ2 = l7.c.j(fVarW, jSONObject, "log_url", hVar, zP, null, bVar, lVar);
            AbstractC5371a abstractC5371aK = l7.c.k(fVarW, jSONObject, "menu_items", zP, null, uc.f6810l1);
            A8.d dVar = l7.e.f43878b;
            return new C1132d2(abstractC5371aH, abstractC5371aJ, abstractC5371aD, abstractC5371aJ2, abstractC5371aK, l7.c.i(fVarW, jSONObject, "payload", zP, null, dVar), l7.c.j(fVarW, jSONObject, "referer", hVar, zP, null, bVar, lVar), l7.c.i(fVarW, jSONObject, "scope_id", zP, null, dVar), l7.c.j(fVarW, jSONObject, "target", C1276n1.f8779b, zP, null, C1175g0.b.FROM_STRING, lVar), l7.c.h(fVarW, jSONObject, "typed", zP, null, uc.f6707c1), l7.c.j(fVarW, jSONObject, ImagesContract.URL, hVar, zP, null, bVar, lVar));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1132d2 value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f8782a;
            l7.c.u(context, jSONObject, "download_callbacks", value.f8050a, uc.f6577Q2);
            l7.c.q(context, jSONObject, "is_enabled", value.f8051b);
            l7.c.q(context, jSONObject, "log_id", value.f8052c);
            h.g gVar = l7.h.f43882c;
            l7.c.p(context, "log_url", value.f8053d, jSONObject, gVar);
            l7.c.v(context, jSONObject, "menu_items", value.f8054e, uc.f6810l1);
            l7.c.t(context, jSONObject, "payload", value.f8055f);
            l7.c.p(context, "referer", value.f8056g, jSONObject, gVar);
            l7.c.t(context, jSONObject, "scope_id", value.f8057h);
            l7.c.p(context, "target", value.i, jSONObject, C1175g0.b.TO_STRING);
            l7.c.u(context, jSONObject, "typed", value.f8058j, uc.f6707c1);
            l7.c.p(context, ImagesContract.URL, value.f8059k, jSONObject, gVar);
            return jSONObject;
        }
    }

    /* compiled from: DivActionJsonParser.kt */
    /* renamed from: N7.n1$d */
    public static final class d implements D7.j<JSONObject, C1132d2, C1175g0> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8783a;

        public d(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8783a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v6, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1132d2 template = (C1132d2) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f8783a;
            C1223j4 c1223j4 = (C1223j4) l7.d.h(context, template.f8050a, data, "download_callbacks", uc.f6587R2, uc.f6566P2);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = C1276n1.f8778a;
            ?? L7 = l7.d.l(context, template.f8051b, data, "is_enabled", aVar, aVar2, c0000b);
            if (L7 != 0) {
                c0000b = L7;
            }
            A7.b bVarC = l7.d.c(context, template.f8052c, data, "log_id", l7.k.f43898c);
            kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…_id\", TYPE_HELPER_STRING)");
            k.h hVar = l7.k.f43900e;
            h.b bVar2 = l7.h.f43883d;
            A7.b bVarK = l7.d.k(context, template.f8053d, data, "log_url", hVar, bVar2);
            List listQ = l7.d.q(context, template.f8054e, data, "menu_items", uc.f6820m1, uc.f6799k1);
            AbstractC5371a<JSONObject> abstractC5371a = template.f8055f;
            A8.d dVar = l7.e.f43878b;
            return new C1175g0(c1223j4, c0000b, bVarC, bVarK, listQ, (JSONObject) l7.d.g(context, "payload", abstractC5371a, data, dVar), l7.d.k(context, template.f8056g, data, "referer", hVar, bVar2), (String) l7.d.g(context, "scope_id", template.f8057h, data, dVar), l7.d.k(context, template.i, data, "target", C1276n1.f8779b, C1175g0.b.FROM_STRING), (AbstractC1192h2) l7.d.h(context, template.f8058j, data, "typed", uc.f6719d1, uc.f6695b1), l7.d.k(context, template.f8059k, data, ImagesContract.URL, hVar, bVar2));
        }
    }

    static {
        Object objM = C2091l.m(C1175g0.b.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f8780g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f8779b = new l7.i(objM, validator);
    }
}
