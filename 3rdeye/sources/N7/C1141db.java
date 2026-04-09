package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivTextRangeBorderJsonParser.kt */
/* renamed from: N7.db, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1141db {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final G8 f8130a = new G8(12);

    /* compiled from: DivTextRangeBorderJsonParser.kt */
    /* renamed from: N7.db$a */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8131a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8131a = component;
        }

        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            return new C1126cb(l7.b.b(context, data, "corner_radius", l7.k.f43897b, l7.h.f43886g, C1141db.f8130a, null), (C1185ga) k8.F.q(context, data, "stroke", this.f8131a.f6435C7));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1126cb value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "corner_radius", value.f8023a);
            k8.F.z(context, jSONObject, "stroke", value.f8024b, this.f8131a.f6435C7);
            return jSONObject;
        }
    }

    /* compiled from: DivTextRangeBorderJsonParser.kt */
    /* renamed from: N7.db$b */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8132a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8132a = component;
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
            return new C1156eb(l7.c.j(fVarW, jSONObject, "corner_radius", l7.k.f43897b, zP, null, l7.h.f43886g, C1141db.f8130a), l7.c.h(fVarW, jSONObject, "stroke", zP, null, this.f8132a.f6446D7));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1156eb value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "corner_radius", value.f8173a);
            l7.c.u(context, jSONObject, "stroke", value.f8174b, this.f8132a.f6446D7);
            return jSONObject;
        }
    }

    /* compiled from: DivTextRangeBorderJsonParser.kt */
    /* renamed from: N7.db$c */
    public static final class c implements D7.j<JSONObject, C1156eb, C1126cb> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8133a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8133a = component;
        }

        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1156eb template = (C1156eb) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarM = l7.d.m(context, template.f8173a, data, "corner_radius", l7.k.f43897b, l7.h.f43886g, C1141db.f8130a);
            Uc uc = this.f8133a;
            return new C1126cb(bVarM, (C1185ga) l7.d.h(context, template.f8174b, data, "stroke", uc.f6457E7, uc.f6435C7));
        }
    }
}
