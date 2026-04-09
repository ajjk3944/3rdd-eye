package N7;

import N7.Z4;
import l7.k;
import org.json.JSONObject;

/* compiled from: DivFocusJsonParser.kt */
/* renamed from: N7.d5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1135d5 implements D7.h, D7.b {
    public static JSONObject d(D7.f context, Z4.a value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.b.d(context, jSONObject, "down", value.f7851a);
        l7.b.d(context, jSONObject, "forward", value.f7852b);
        l7.b.d(context, jSONObject, "left", value.f7853c);
        l7.b.d(context, jSONObject, "right", value.f7854d);
        l7.b.d(context, jSONObject, "up", value.f7855e);
        return jSONObject;
    }

    @Override // D7.b
    public final Object a(D7.f context, JSONObject data) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        k.g gVar = l7.k.f43898c;
        A8.d dVar = l7.e.f43878b;
        j6.l lVar = l7.e.f43877a;
        return new Z4.a(l7.b.b(context, data, "down", gVar, dVar, lVar, null), l7.b.b(context, data, "forward", gVar, dVar, lVar, null), l7.b.b(context, data, "left", gVar, dVar, lVar, null), l7.b.b(context, data, "right", gVar, dVar, lVar, null), l7.b.b(context, data, "up", gVar, dVar, lVar, null));
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return d(fVar, (Z4.a) obj);
    }
}
