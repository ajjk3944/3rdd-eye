package N7;

import N7.C1180g5;
import N7.Z4;
import l7.k;
import org.json.JSONObject;

/* compiled from: DivFocusJsonParser.kt */
/* renamed from: N7.f5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1165f5 implements D7.j<JSONObject, C1180g5.a, Z4.a> {
    @Override // D7.j
    public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
        C1180g5.a template = (C1180g5.a) bVar;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        k.g gVar = l7.k.f43898c;
        return new Z4.a(l7.d.j(context, template.f8291a, data, "down", gVar), l7.d.j(context, template.f8292b, data, "forward", gVar), l7.d.j(context, template.f8293c, data, "left", gVar), l7.d.j(context, template.f8294d, data, "right", gVar), l7.d.j(context, template.f8295e, data, "up", gVar));
    }
}
