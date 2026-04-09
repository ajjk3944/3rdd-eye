package N7;

import A7.b;
import c9.C2091l;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* compiled from: DivDimensionJsonParser.kt */
/* renamed from: N7.e4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1149e4 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8158a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final l7.i f8159b;

    /* compiled from: DivDimensionJsonParser.kt */
    /* renamed from: N7.e4$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f8160g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof H9);
        }
    }

    /* compiled from: DivDimensionJsonParser.kt */
    /* renamed from: N7.e4$b */
    public static final class b implements D7.h, D7.b {
        public static JSONObject d(D7.f context, C1134d4 value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.e(context, jSONObject, "unit", value.f8066a, H9.TO_STRING);
            l7.b.d(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f8067b);
            return jSONObject;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [A7.b] */
        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            l7.i iVar = C1149e4.f8159b;
            p9.l<String, H9> lVar = H9.FROM_STRING;
            b.C0000b c0000b = C1149e4.f8158a;
            j6.l lVar2 = l7.e.f43877a;
            ?? B10 = l7.b.b(context, data, "unit", iVar, lVar, lVar2, c0000b);
            if (B10 != 0) {
                c0000b = B10;
            }
            return new C1134d4(c0000b, l7.b.a(context, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43899d, l7.h.f43885f, lVar2));
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (C1134d4) obj);
        }
    }

    /* compiled from: DivDimensionJsonParser.kt */
    /* renamed from: N7.e4$c */
    public static final class c implements D7.h, D7.i {
        public static JSONObject d(D7.f context, C1164f4 value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.p(context, "unit", value.f8191a, jSONObject, H9.TO_STRING);
            l7.c.q(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f8192b);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (C1164f4) obj);
        }

        @Override // D7.i
        public final Z6.b c(D7.f fVar, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            l7.i iVar = C1149e4.f8159b;
            p9.l<String, H9> lVar = H9.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            return new C1164f4(l7.c.j(fVarW, jSONObject, "unit", iVar, zP, null, lVar, lVar2), l7.c.e(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43899d, zP, null, l7.h.f43885f, lVar2));
        }
    }

    /* compiled from: DivDimensionJsonParser.kt */
    /* renamed from: N7.e4$d */
    public static final class d implements D7.j<JSONObject, C1164f4, C1134d4> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v1, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1164f4 template = (C1164f4) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            l7.i iVar = C1149e4.f8159b;
            p9.l<String, H9> lVar = H9.FROM_STRING;
            b.C0000b c0000b = C1149e4.f8158a;
            ?? L7 = l7.d.l(context, template.f8191a, data, "unit", iVar, lVar, c0000b);
            if (L7 != 0) {
                c0000b = L7;
            }
            A7.b bVarD = l7.d.d(context, template.f8192b, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43899d, l7.h.f43885f);
            kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…DOUBLE, NUMBER_TO_DOUBLE)");
            return new C1134d4(c0000b, bVarD);
        }
    }

    static {
        H9 value = H9.DP;
        kotlin.jvm.internal.l.f(value, "value");
        f8158a = new b.C0000b(value);
        Object objM = C2091l.m(H9.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f8160g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f8159b = new l7.i(objM, validator);
    }
}
