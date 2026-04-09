package N7;

import A7.b;
import l7.h;
import l7.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionSetStateJsonParser.kt */
/* loaded from: classes.dex */
public final class D1 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5055a = new b.C0000b(Boolean.TRUE);

    /* compiled from: DivActionSetStateJsonParser.kt */
    public static final class a implements D7.h, D7.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [A7.b] */
        public static C1 d(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.g gVar = l7.k.f43898c;
            A8.d dVar = l7.e.f43878b;
            j6.l lVar = l7.e.f43877a;
            A7.b bVarA = l7.b.a(context, data, "state_id", gVar, dVar, lVar);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = D1.f5055a;
            ?? B10 = l7.b.b(context, data, "temporary", aVar, aVar2, lVar, c0000b);
            if (B10 != 0) {
                c0000b = B10;
            }
            return new C1(bVarA, c0000b);
        }

        public static JSONObject e(D7.f context, C1 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "state_id", value.f5007a);
            l7.b.d(context, jSONObject, "temporary", value.f5008b);
            k8.F.y(context, jSONObject, "type", "set_state");
            return jSONObject;
        }

        @Override // D7.b
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return d(fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (C1) obj);
        }
    }

    /* compiled from: DivActionSetStateJsonParser.kt */
    public static final class b implements D7.h, D7.i {
        public static E1 d(D7.f fVar, E1 e12, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            return new E1(l7.c.d(fVarW, jSONObject, "state_id", l7.k.f43898c, zP, e12 != null ? e12.f5127a : null), l7.c.j(fVarW, jSONObject, "temporary", l7.k.f43896a, zP, e12 != null ? e12.f5128b : null, l7.h.f43884e, l7.e.f43877a));
        }

        public static JSONObject e(D7.f context, E1 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "state_id", value.f5127a);
            l7.c.q(context, jSONObject, "temporary", value.f5128b);
            k8.F.y(context, jSONObject, "type", "set_state");
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (E1) obj);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }
    }

    /* compiled from: DivActionSetStateJsonParser.kt */
    public static final class c implements D7.j<JSONObject, E1, C1> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v1, types: [A7.b] */
        public static C1 b(D7.f context, E1 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarC = l7.d.c(context, template.f5127a, data, "state_id", l7.k.f43898c);
            kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…_id\", TYPE_HELPER_STRING)");
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = D1.f5055a;
            ?? L7 = l7.d.l(context, template.f5128b, data, "temporary", aVar, aVar2, c0000b);
            if (L7 != 0) {
                c0000b = L7;
            }
            return new C1(bVarC, c0000b);
        }

        @Override // D7.j
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
            return b(fVar, (E1) bVar, jSONObject);
        }
    }
}
