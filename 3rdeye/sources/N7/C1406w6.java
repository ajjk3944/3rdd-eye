package N7;

import A7.b;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivInputValidatorBaseJsonParser.kt */
/* renamed from: N7.w6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1406w6 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9721a = new b.C0000b(Boolean.FALSE);

    /* compiled from: DivInputValidatorBaseJsonParser.kt */
    /* renamed from: N7.w6$a */
    public static final class a implements D7.h, D7.b {
        public static JSONObject d(D7.f context, C1392v6 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "allow_empty", value.f9621a);
            l7.b.d(context, jSONObject, "label_id", value.f9622b);
            k8.F.y(context, jSONObject, "variable", value.f9623c);
            return jSONObject;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [A7.b] */
        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = C1406w6.f9721a;
            j6.l lVar = l7.e.f43877a;
            ?? B10 = l7.b.b(context, data, "allow_empty", aVar, aVar2, lVar, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            k.g gVar = l7.k.f43898c;
            A8.d dVar = l7.e.f43878b;
            return new C1392v6(c0000b2, l7.b.b(context, data, "label_id", gVar, dVar, lVar, null), (String) k8.F.r(context, data, "variable", dVar, lVar));
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (C1392v6) obj);
        }
    }

    /* compiled from: DivInputValidatorBaseJsonParser.kt */
    /* renamed from: N7.w6$b */
    public static final class b implements D7.h, D7.i {
        public static JSONObject d(D7.f context, C1420x6 value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "allow_empty", value.f9783a);
            l7.c.q(context, jSONObject, "label_id", value.f9784b);
            l7.c.t(context, jSONObject, "variable", value.f9785c);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (C1420x6) obj);
        }

        @Override // D7.i
        public final Z6.b c(D7.f fVar, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            j6.l lVar = l7.e.f43877a;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "allow_empty", aVar, zP, null, aVar2, lVar);
            k.g gVar = l7.k.f43898c;
            A8.d dVar = l7.e.f43878b;
            return new C1420x6(abstractC5371aJ, l7.c.j(fVarW, jSONObject, "label_id", gVar, zP, null, dVar, lVar), l7.c.i(fVarW, jSONObject, "variable", zP, null, dVar));
        }
    }

    /* compiled from: DivInputValidatorBaseJsonParser.kt */
    /* renamed from: N7.w6$c */
    public static final class c implements D7.j<JSONObject, C1420x6, C1392v6> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v1, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1420x6 template = (C1420x6) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = C1406w6.f9721a;
            ?? L7 = l7.d.l(context, template.f9783a, data, "allow_empty", aVar, aVar2, c0000b);
            if (L7 != 0) {
                c0000b = L7;
            }
            return new C1392v6(c0000b, l7.d.j(context, template.f9784b, data, "label_id", l7.k.f43898c), (String) l7.d.g(context, "variable", template.f9785c, data, l7.e.f43878b));
        }
    }
}
