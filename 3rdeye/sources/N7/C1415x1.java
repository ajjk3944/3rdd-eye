package N7;

import N7.AbstractC1373u1;
import N7.AbstractC1429y1;
import N7.C1188gd;
import N7.Ic;
import org.json.JSONObject;

/* compiled from: DivActionScrollDestinationJsonParser.kt */
/* renamed from: N7.x1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1415x1 implements D7.j<JSONObject, AbstractC1429y1, AbstractC1373u1> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9744a;

    public C1415x1(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9744a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1373u1 a(D7.f context, AbstractC1429y1 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof AbstractC1429y1.c;
        Uc uc = this.f9744a;
        if (z10) {
            ((C1188gd.c) uc.f6616T9.getValue()).getClass();
            return new AbstractC1373u1.c(C1188gd.c.b(context, ((AbstractC1429y1.c) template).f9810a, data));
        }
        if (template instanceof AbstractC1429y1.b) {
            ((Ic.c) uc.f6459E9.getValue()).getClass();
            return new AbstractC1373u1.b(Ic.c.b(context, ((AbstractC1429y1.b) template).f9809a, data));
        }
        if (template instanceof AbstractC1429y1.d) {
            ((md) uc.f6648W9.getValue()).getClass();
            kotlin.jvm.internal.l.f(((AbstractC1429y1.d) template).f9811a, "template");
            return new AbstractC1373u1.d(new jd());
        }
        if (!(template instanceof AbstractC1429y1.a)) {
            throw new b9.j();
        }
        ((Fc) uc.f6426B9.getValue()).getClass();
        kotlin.jvm.internal.l.f(((AbstractC1429y1.a) template).f9808a, "template");
        return new AbstractC1373u1.a(new Cc());
    }
}
