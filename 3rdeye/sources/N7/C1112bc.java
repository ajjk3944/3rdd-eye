package N7;

import N7.AbstractC1127cc;
import N7.Yb;
import org.json.JSONObject;

/* compiled from: DivTypedValueJsonParser.kt */
/* renamed from: N7.bc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1112bc implements D7.j<JSONObject, AbstractC1127cc, Yb> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7950a;

    public C1112bc(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7950a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Yb a(D7.f context, AbstractC1127cc template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof AbstractC1127cc.g;
        Uc uc = this.f7950a;
        if (z10) {
            ((rd) uc.f6680Z9.getValue()).getClass();
            return new Yb.g(rd.b(context, ((AbstractC1127cc.g) template).f8032a, data));
        }
        if (template instanceof AbstractC1127cc.e) {
            ((Nc) uc.f6489H9.getValue()).getClass();
            return new Yb.e(Nc.b(context, ((AbstractC1127cc.e) template).f8030a, data));
        }
        if (template instanceof AbstractC1127cc.f) {
            ((Yc) uc.f6551N9.getValue()).getClass();
            return new Yb.f(Yc.b(context, ((AbstractC1127cc.f) template).f8031a, data));
        }
        if (template instanceof AbstractC1127cc.c) {
            ((C1413x) uc.f6839o.getValue()).getClass();
            return new Yb.c(C1413x.b(context, ((AbstractC1127cc.c) template).f8028a, data));
        }
        if (template instanceof AbstractC1127cc.b) {
            ((C1274n) uc.i.getValue()).getClass();
            return new Yb.b(C1274n.b(context, ((AbstractC1127cc.b) template).f8027a, data));
        }
        if (template instanceof AbstractC1127cc.h) {
            ((Bd) uc.f6751fa.getValue()).getClass();
            return new Yb.h(Bd.b(context, ((AbstractC1127cc.h) template).f8033a, data));
        }
        if (template instanceof AbstractC1127cc.d) {
            ((S) uc.f6405A.getValue()).getClass();
            return new Yb.d(S.b(context, ((AbstractC1127cc.d) template).f8029a, data));
        }
        if (!(template instanceof AbstractC1127cc.a)) {
            throw new b9.j();
        }
        ((C1129d) uc.f6705c.getValue()).getClass();
        return new Yb.a(C1129d.b(context, ((AbstractC1127cc.a) template).f8026a, data));
    }
}
