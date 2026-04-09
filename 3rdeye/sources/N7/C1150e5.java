package N7;

import N7.C1180g5;
import l7.k;
import org.json.JSONObject;

/* compiled from: DivFocusJsonParser.kt */
/* renamed from: N7.e5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1150e5 implements D7.h, D7.i {
    public static JSONObject d(D7.f context, C1180g5.a value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.q(context, jSONObject, "down", value.f8291a);
        l7.c.q(context, jSONObject, "forward", value.f8292b);
        l7.c.q(context, jSONObject, "left", value.f8293c);
        l7.c.q(context, jSONObject, "right", value.f8294d);
        l7.c.q(context, jSONObject, "up", value.f8295e);
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return d(fVar, (C1180g5.a) obj);
    }

    @Override // D7.i
    public final Z6.b c(D7.f fVar, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        k.g gVar = l7.k.f43898c;
        A8.d dVar = l7.e.f43878b;
        j6.l lVar = l7.e.f43877a;
        return new C1180g5.a(l7.c.j(fVarW, jSONObject, "down", gVar, zP, null, dVar, lVar), l7.c.j(fVarW, jSONObject, "forward", gVar, zP, null, dVar, lVar), l7.c.j(fVarW, jSONObject, "left", gVar, zP, null, dVar, lVar), l7.c.j(fVarW, jSONObject, "right", gVar, zP, null, dVar, lVar), l7.c.j(fVarW, jSONObject, "up", gVar, zP, null, dVar, lVar));
    }
}
