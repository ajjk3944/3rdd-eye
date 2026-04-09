package N7;

import A7.b;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivTextRangeMaskSolidJsonParser.kt */
/* renamed from: N7.rb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1341rb {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9082a = new b.C0000b(Boolean.TRUE);

    /* compiled from: DivTextRangeMaskSolidJsonParser.kt */
    /* renamed from: N7.rb$a */
    public static final class a implements D7.h, D7.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [A7.b] */
        public static C1328qb d(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.b bVar = l7.k.f43901f;
            h.f fVar = l7.h.f43881b;
            j6.l lVar = l7.e.f43877a;
            A7.b bVarA = l7.b.a(context, data, "color", bVar, fVar, lVar);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = C1341rb.f9082a;
            ?? B10 = l7.b.b(context, data, "is_enabled", aVar, aVar2, lVar, c0000b);
            if (B10 != 0) {
                c0000b = B10;
            }
            return new C1328qb(bVarA, c0000b);
        }

        public static JSONObject e(D7.f context, C1328qb value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.e(context, jSONObject, "color", value.f9000a, l7.h.f43880a);
            l7.b.d(context, jSONObject, "is_enabled", value.f9001b);
            k8.F.y(context, jSONObject, "type", "solid");
            return jSONObject;
        }

        @Override // D7.b
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return d(fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (C1328qb) obj);
        }
    }

    /* compiled from: DivTextRangeMaskSolidJsonParser.kt */
    /* renamed from: N7.rb$b */
    public static final class b implements D7.h, D7.i {
        public static C1355sb d(D7.f fVar, C1355sb c1355sb, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            k.b bVar = l7.k.f43901f;
            AbstractC5371a<A7.b<Integer>> abstractC5371a = c1355sb != null ? c1355sb.f9191a : null;
            h.f fVar2 = l7.h.f43881b;
            j6.l lVar = l7.e.f43877a;
            return new C1355sb(l7.c.e(fVarW, jSONObject, "color", bVar, zP, abstractC5371a, fVar2, lVar), l7.c.j(fVarW, jSONObject, "is_enabled", l7.k.f43896a, zP, c1355sb != null ? c1355sb.f9192b : null, l7.h.f43884e, lVar));
        }

        public static JSONObject e(D7.f context, C1355sb value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.p(context, "color", value.f9191a, jSONObject, l7.h.f43880a);
            l7.c.q(context, jSONObject, "is_enabled", value.f9192b);
            k8.F.y(context, jSONObject, "type", "solid");
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (C1355sb) obj);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }
    }

    /* compiled from: DivTextRangeMaskSolidJsonParser.kt */
    /* renamed from: N7.rb$c */
    public static final class c implements D7.j<JSONObject, C1355sb, C1328qb> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v1, types: [A7.b] */
        public static C1328qb b(D7.f context, C1355sb template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarD = l7.d.d(context, template.f9191a, data, "color", l7.k.f43901f, l7.h.f43881b);
            kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…LOR, STRING_TO_COLOR_INT)");
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = C1341rb.f9082a;
            ?? L7 = l7.d.l(context, template.f9192b, data, "is_enabled", aVar, aVar2, c0000b);
            if (L7 != 0) {
                c0000b = L7;
            }
            return new C1328qb(bVarD, c0000b);
        }

        @Override // D7.j
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
            return b(fVar, (C1355sb) bVar, jSONObject);
        }
    }
}
