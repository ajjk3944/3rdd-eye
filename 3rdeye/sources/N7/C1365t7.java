package N7;

import org.json.JSONObject;

/* compiled from: DivPageSizeJsonParser.kt */
/* renamed from: N7.t7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1365t7 implements D7.j<JSONObject, C1379u7, C1324q7> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9334a;

    public C1365t7(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9334a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1324q7 a(D7.f context, C1379u7 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        Uc uc = this.f9334a;
        return new C1324q7((V7) l7.d.a(context, template.f9426a, data, "page_width", uc.f6476G5, uc.f6455E5));
    }
}
