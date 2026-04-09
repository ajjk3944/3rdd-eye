package N7;

import N7.AbstractC1111bb;
import N7.C1306p3;
import N7.Xa;
import org.json.JSONObject;

/* compiled from: DivTextRangeBackgroundJsonParser.kt */
/* renamed from: N7.ab, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1096ab implements D7.j<JSONObject, AbstractC1111bb, Xa> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7901a;

    public C1096ab(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7901a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Xa a(D7.f context, AbstractC1111bb template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof AbstractC1111bb.b;
        Uc uc = this.f7901a;
        if (z10) {
            ((V9) uc.f6794j7.getValue()).getClass();
            return new Xa.b(V9.b(context, ((AbstractC1111bb.b) template).f7949a, data));
        }
        if (template instanceof AbstractC1111bb.a) {
            return new Xa.a(((C1306p3.c) uc.f6672Z1.getValue()).a(context, ((AbstractC1111bb.a) template).f7948a, data));
        }
        throw new b9.j();
    }
}
