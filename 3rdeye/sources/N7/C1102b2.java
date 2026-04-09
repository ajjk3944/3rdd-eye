package N7;

import A7.b;
import N7.C1117c2;
import N7.U1;
import c9.C2091l;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionSubmitJsonParser.kt */
/* renamed from: N7.b2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1102b2 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7915a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final l7.i f7916b;

    /* compiled from: DivActionSubmitJsonParser.kt */
    /* renamed from: N7.b2$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f7917g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof U1.a.b);
        }
    }

    /* compiled from: DivActionSubmitJsonParser.kt */
    /* renamed from: N7.b2$b */
    public static final class b implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7918a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7918a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v5, types: [A7.b] */
        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            List listS = k8.F.s(context, data, "headers", this.f7918a.f6628V0);
            l7.i iVar = C1102b2.f7916b;
            p9.l<String, U1.a.b> lVar = U1.a.b.FROM_STRING;
            b.C0000b c0000b = C1102b2.f7915a;
            j6.l lVar2 = l7.e.f43877a;
            ?? B10 = l7.b.b(context, data, "method", iVar, lVar, lVar2, c0000b);
            if (B10 != 0) {
                c0000b = B10;
            }
            return new U1.a(listS, c0000b, l7.b.a(context, data, ImagesContract.URL, l7.k.f43900e, l7.h.f43883d, lVar2));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, U1.a value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.B(context, jSONObject, "headers", value.f6363a, this.f7918a.f6628V0);
            l7.b.e(context, jSONObject, "method", value.f6364b, U1.a.b.TO_STRING);
            l7.b.e(context, jSONObject, ImagesContract.URL, value.f6365c, l7.h.f43882c);
            return jSONObject;
        }
    }

    /* compiled from: DivActionSubmitJsonParser.kt */
    /* renamed from: N7.b2$c */
    public static final class c implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7919a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7919a = component;
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
            AbstractC5371a abstractC5371aK = l7.c.k(fVarW, jSONObject, "headers", zP, null, this.f7919a.f6639W0);
            l7.i iVar = C1102b2.f7916b;
            p9.l<String, U1.a.b> lVar = U1.a.b.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            return new C1117c2.a(abstractC5371aK, l7.c.j(fVarW, jSONObject, "method", iVar, zP, null, lVar, lVar2), l7.c.e(fVarW, jSONObject, ImagesContract.URL, l7.k.f43900e, zP, null, l7.h.f43883d, lVar2));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1117c2.a value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.v(context, jSONObject, "headers", value.f7962a, this.f7919a.f6639W0);
            l7.c.p(context, "method", value.f7963b, jSONObject, U1.a.b.TO_STRING);
            l7.c.p(context, ImagesContract.URL, value.f7964c, jSONObject, l7.h.f43882c);
            return jSONObject;
        }
    }

    /* compiled from: DivActionSubmitJsonParser.kt */
    /* renamed from: N7.b2$d */
    public static final class d implements D7.j<JSONObject, C1117c2.a, U1.a> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7920a;

        public d(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7920a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v1, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1117c2.a template = (C1117c2.a) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f7920a;
            List listQ = l7.d.q(context, template.f7962a, data, "headers", uc.f6650X0, uc.f6628V0);
            l7.i iVar = C1102b2.f7916b;
            p9.l<String, U1.a.b> lVar = U1.a.b.FROM_STRING;
            b.C0000b c0000b = C1102b2.f7915a;
            ?? L7 = l7.d.l(context, template.f7963b, data, "method", iVar, lVar, c0000b);
            if (L7 != 0) {
                c0000b = L7;
            }
            A7.b bVarD = l7.d.d(context, template.f7964c, data, ImagesContract.URL, l7.k.f43900e, l7.h.f43883d);
            kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…E_HELPER_URI, ANY_TO_URI)");
            return new U1.a(listQ, c0000b, bVarD);
        }
    }

    static {
        U1.a.b value = U1.a.b.POST;
        kotlin.jvm.internal.l.f(value, "value");
        f7915a = new b.C0000b(value);
        Object objM = C2091l.m(U1.a.b.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f7917g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f7916b = new l7.i(objM, validator);
    }
}
