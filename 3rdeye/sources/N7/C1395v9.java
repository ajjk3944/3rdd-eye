package N7;

import org.json.JSONObject;

/* compiled from: DivShapeDrawableJsonParser.kt */
/* renamed from: N7.v9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1395v9 implements D7.j<JSONObject, C1409w9, C1353s9> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9638a;

    public C1395v9(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9638a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1353s9 a(D7.f context, C1409w9 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarD = l7.d.d(context, template.f9726a, data, "color", l7.k.f43901f, l7.h.f43881b);
        kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…LOR, STRING_TO_COLOR_INT)");
        Uc uc = this.f9638a;
        return new C1353s9(bVarD, (AbstractC1339r9) l7.d.a(context, template.f9727b, data, "shape", uc.f6591R6, uc.f6570P6), (C1185ga) l7.d.h(context, template.f9728c, data, "stroke", uc.f6457E7, uc.f6435C7));
    }
}
