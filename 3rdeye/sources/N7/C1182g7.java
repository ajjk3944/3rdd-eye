package N7;

import org.json.JSONObject;

/* compiled from: DivNinePatchBackgroundJsonParser.kt */
/* renamed from: N7.g7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1182g7 implements D7.j<JSONObject, C1197h7, C1137d7> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8296a;

    public C1182g7(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8296a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1137d7 a(D7.f context, C1197h7 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarD = l7.d.d(context, template.f8353a, data, "image_url", l7.k.f43900e, l7.h.f43883d);
        kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…E_HELPER_URI, ANY_TO_URI)");
        Uc uc = this.f8296a;
        return new C1137d7(bVarD, (C1085a0) l7.d.a(context, template.f8354b, data, "insets", uc.f6470G, uc.f6449E));
    }
}
