package N7;

import N7.C1364t6;
import N7.T5;
import org.json.JSONObject;

/* compiled from: DivInputJsonParser.kt */
/* renamed from: N7.s6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1350s6 implements D7.j<JSONObject, C1364t6.a, T5.d> {
    @Override // D7.j
    public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
        C1364t6.a template = (C1364t6.a) bVar;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarD = l7.d.d(context, template.f9333a, data, "color", l7.k.f43901f, l7.h.f43881b);
        kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…LOR, STRING_TO_COLOR_INT)");
        return new T5.d(bVarD);
    }
}
