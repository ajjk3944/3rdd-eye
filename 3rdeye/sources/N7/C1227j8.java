package N7;

import N7.AbstractC1138d8;
import N7.AbstractC1311p8;
import N7.C1168f8;
import org.json.JSONObject;

/* compiled from: DivPivotJsonParser.kt */
/* renamed from: N7.j8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1227j8 implements D7.j<JSONObject, AbstractC1311p8, AbstractC1138d8> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8549a;

    public C1227j8(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8549a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1138d8 a(D7.f context, AbstractC1311p8 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof AbstractC1311p8.a;
        Uc uc = this.f8549a;
        if (z10) {
            ((C1168f8.d) uc.f6538M5.getValue()).getClass();
            return new AbstractC1138d8.a(C1168f8.d.b(context, ((AbstractC1311p8.a) template).f8901a, data));
        }
        if (!(template instanceof AbstractC1311p8.b)) {
            throw new b9.j();
        }
        ((C1283n8) uc.f6569P5.getValue()).getClass();
        return new AbstractC1138d8.b(C1283n8.b(context, ((AbstractC1311p8.b) template).f8902a, data));
    }
}
