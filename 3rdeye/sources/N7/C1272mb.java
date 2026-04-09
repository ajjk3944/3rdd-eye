package N7;

import N7.AbstractC1186gb;
import N7.AbstractC1369tb;
import N7.C1300ob;
import N7.C1341rb;
import org.json.JSONObject;

/* compiled from: DivTextRangeMaskJsonParser.kt */
/* renamed from: N7.mb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1272mb implements D7.j<JSONObject, AbstractC1369tb, AbstractC1186gb> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8776a;

    public C1272mb(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8776a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1186gb a(D7.f context, AbstractC1369tb template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof AbstractC1369tb.a;
        Uc uc = this.f8776a;
        if (z10) {
            return new AbstractC1186gb.a(((C1300ob.c) uc.f6773h8.getValue()).a(context, ((AbstractC1369tb.a) template).f9337a, data));
        }
        if (!(template instanceof AbstractC1369tb.b)) {
            throw new b9.j();
        }
        ((C1341rb.c) uc.f6806k8.getValue()).getClass();
        return new AbstractC1186gb.b(C1341rb.c.b(context, ((AbstractC1369tb.b) template).f9338a, data));
    }
}
