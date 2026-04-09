package N7;

import A7.b;
import N7.S4;
import N7.V4;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONObject;

/* compiled from: DivFixedLengthInputMaskJsonParser.kt */
/* loaded from: classes.dex */
public final class U4 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.d f6384a = new b.d("_");

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final B4.g f6385b = new B4.g(18);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final B4.h f6386c = new B4.h(17);

    /* compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class a implements D7.h, D7.b {
        public static JSONObject d(D7.f context, S4.a value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "key", value.f6201a);
            l7.b.d(context, jSONObject, "placeholder", value.f6202b);
            l7.b.d(context, jSONObject, "regex", value.f6203c);
            return jSONObject;
        }

        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.g gVar = l7.k.f43898c;
            B4.g gVar2 = U4.f6385b;
            A8.d dVar = l7.e.f43878b;
            A7.b bVarA = l7.b.a(context, data, "key", gVar, dVar, gVar2);
            B4.h hVar = U4.f6386c;
            b.d dVar2 = U4.f6384a;
            A7.b bVarB = l7.b.b(context, data, "placeholder", gVar, dVar, hVar, dVar2);
            if (bVarB == null) {
                bVarB = dVar2;
            }
            return new S4.a(bVarA, bVarB, l7.b.b(context, data, "regex", gVar, dVar, l7.e.f43877a, null));
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (S4.a) obj);
        }
    }

    /* compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class b implements D7.h, D7.i {
        public static JSONObject d(D7.f context, V4.a value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "key", value.f7568a);
            l7.c.q(context, jSONObject, "placeholder", value.f7569b);
            l7.c.q(context, jSONObject, "regex", value.f7570c);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (V4.a) obj);
        }

        @Override // D7.i
        public final Z6.b c(D7.f fVar, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            k.g gVar = l7.k.f43898c;
            B4.g gVar2 = U4.f6385b;
            A8.d dVar = l7.e.f43878b;
            return new V4.a(l7.c.e(fVarW, jSONObject, "key", gVar, zP, null, dVar, gVar2), l7.c.j(fVarW, jSONObject, "placeholder", gVar, zP, null, dVar, U4.f6386c), l7.c.j(fVarW, jSONObject, "regex", gVar, zP, null, dVar, l7.e.f43877a));
        }
    }

    /* compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class c implements D7.j<JSONObject, V4.a, S4.a> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v11, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r14v5, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r14v8, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            D7.f fVar;
            JSONObject jSONObject;
            A7.b bVarA;
            b.d dVarB;
            V4.a template = (V4.a) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.g gVar = l7.k.f43898c;
            B4.g gVar2 = U4.f6385b;
            AbstractC5371a<A7.b<String>> abstractC5371a = template.f7568a;
            A8.d dVar = l7.e.f43878b;
            if (abstractC5371a.f44399b && data.has("key")) {
                fVar = context;
                jSONObject = data;
                bVarA = l7.b.a(fVar, jSONObject, "key", gVar, dVar, gVar2);
            } else {
                fVar = context;
                jSONObject = data;
                int i = abstractC5371a.f44398a;
                if (i == 2) {
                    bVarA = (A7.b) ((AbstractC5371a.d) abstractC5371a).f44403c;
                } else {
                    if (i != 3) {
                        throw z7.e.g("key", jSONObject);
                    }
                    bVarA = l7.b.a(fVar, jSONObject, ((AbstractC5371a.c) abstractC5371a).f44402c, gVar, dVar, gVar2);
                }
            }
            kotlin.jvm.internal.l.e(bVarA, "resolveExpression(contex…ER_STRING, KEY_VALIDATOR)");
            B4.h hVar = U4.f6386c;
            b.d dVar2 = U4.f6384a;
            AbstractC5371a<A7.b<String>> abstractC5371a2 = template.f7569b;
            if (abstractC5371a2.f44399b && jSONObject.has("placeholder")) {
                dVarB = l7.b.b(fVar, jSONObject, "placeholder", gVar, dVar, hVar, dVar2);
            } else {
                int i10 = abstractC5371a2.f44398a;
                dVarB = i10 == 2 ? (A7.b) ((AbstractC5371a.d) abstractC5371a2).f44403c : i10 == 3 ? l7.b.b(fVar, jSONObject, ((AbstractC5371a.c) abstractC5371a2).f44402c, gVar, dVar, hVar, dVar2) : null;
            }
            if (dVarB != null) {
                dVar2 = dVarB;
            }
            return new S4.a(bVarA, dVar2, l7.d.j(fVar, template.f7570c, jSONObject, "regex", gVar));
        }
    }
}
