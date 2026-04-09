package N7;

import A7.b;
import l7.h;
import l7.k;
import org.json.JSONObject;

/* compiled from: DivTextRangeMaskBaseJsonParser.kt */
/* renamed from: N7.ib, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1216ib {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8421a = new b.C0000b(Boolean.TRUE);

    /* compiled from: DivTextRangeMaskBaseJsonParser.kt */
    /* renamed from: N7.ib$a */
    public static final class a implements D7.h, D7.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v1, types: [A7.b] */
        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = C1216ib.f8421a;
            ?? B10 = l7.b.b(context, data, "is_enabled", aVar, aVar2, l7.e.f43877a, c0000b);
            if (B10 != 0) {
                c0000b = B10;
            }
            return new C1201hb(c0000b);
        }

        @Override // D7.h
        public final JSONObject b(D7.f context, Object obj) {
            C1201hb value = (C1201hb) obj;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "is_enabled", value.f8366a);
            return jSONObject;
        }
    }

    /* compiled from: DivTextRangeMaskBaseJsonParser.kt */
    /* renamed from: N7.ib$b */
    public static final class b implements D7.h, D7.i {
        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final JSONObject b(D7.f context, Object obj) {
            C1230jb value = (C1230jb) obj;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "is_enabled", value.f8597a);
            return jSONObject;
        }

        @Override // D7.i
        public final Z6.b c(D7.f fVar, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            return new C1230jb(l7.c.j(T1.B.w(fVar), jSONObject, "is_enabled", l7.k.f43896a, B4.g.p(fVar, "context", jSONObject, "data"), null, l7.h.f43884e, l7.e.f43877a));
        }
    }

    /* compiled from: DivTextRangeMaskBaseJsonParser.kt */
    /* renamed from: N7.ib$c */
    public static final class c implements D7.j<JSONObject, C1230jb, C1201hb> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v1, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1230jb template = (C1230jb) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = C1216ib.f8421a;
            ?? L7 = l7.d.l(context, template.f8597a, data, "is_enabled", aVar, aVar2, c0000b);
            if (L7 != 0) {
                c0000b = L7;
            }
            return new C1201hb(c0000b);
        }
    }
}
