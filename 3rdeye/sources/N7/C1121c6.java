package N7;

import N7.AbstractC1211i6;
import N7.U5;
import org.json.JSONObject;

/* compiled from: DivInputFilterJsonParser.kt */
/* renamed from: N7.c6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1121c6 implements D7.j<JSONObject, AbstractC1211i6, U5> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7972a;

    public C1121c6(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7972a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final U5 a(D7.f context, AbstractC1211i6 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof AbstractC1211i6.b;
        Uc uc = this.f7972a;
        if (z10) {
            ((C1181g6) uc.f6813l4.getValue()).getClass();
            return new U5.b(C1181g6.b(context, ((AbstractC1211i6.b) template).f8405a, data));
        }
        if (!(template instanceof AbstractC1211i6.a)) {
            throw new b9.j();
        }
        ((Y5) uc.f6780i4.getValue()).getClass();
        return new U5.a(Y5.b(context, ((AbstractC1211i6.a) template).f8404a, data));
    }
}
