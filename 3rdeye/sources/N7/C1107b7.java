package N7;

import org.json.JSONObject;

/* compiled from: DivNeighbourPageSizeJsonParser.kt */
/* renamed from: N7.b7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1107b7 implements D7.j<JSONObject, C1122c7, Y6> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7934a;

    public C1107b7(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7934a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Y6 a(D7.f context, C1122c7 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        Uc uc = this.f7934a;
        return new Y6((W4) l7.d.a(context, template.f7973a, data, "neighbour_page_width", uc.f6918v3, uc.f6897t3));
    }
}
