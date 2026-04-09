package N7;

import java.util.List;
import n7.AbstractC5371a;
import org.json.JSONObject;

/* compiled from: DivDownloadCallbacksJsonParser.kt */
/* renamed from: N7.m4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1265m4 implements D7.j<JSONObject, C1279n4, C1223j4> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8756a;

    public C1265m4(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8756a = component;
    }

    @Override // D7.j
    public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
        C1279n4 template = (C1279n4) bVar;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        Uc uc = this.f8756a;
        b9.p pVar = uc.f6789j1;
        AbstractC5371a<List<C1132d2>> abstractC5371a = template.f8789a;
        b9.p pVar2 = uc.f6766h1;
        return new C1223j4(l7.d.q(context, abstractC5371a, data, "on_fail_actions", pVar, pVar2), l7.d.q(context, template.f8790b, data, "on_success_actions", uc.f6789j1, pVar2));
    }
}
