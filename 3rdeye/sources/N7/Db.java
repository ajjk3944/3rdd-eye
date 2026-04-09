package N7;

import N7.Ab;
import N7.Ob;
import org.json.JSONObject;

/* compiled from: DivTooltipModeJsonParser.kt */
/* loaded from: classes.dex */
public final class Db implements D7.j<JSONObject, Ob, Ab> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5120a;

    public Db(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5120a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Ab a(D7.f context, Ob template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof Ob.b;
        Uc uc = this.f5120a;
        if (z10) {
            ((Mb) uc.L8.getValue()).getClass();
            kotlin.jvm.internal.l.f(((Ob.b) template).f5997a, "template");
            return new Ab.b(new Jb());
        }
        if (!(template instanceof Ob.a)) {
            throw new b9.j();
        }
        ((Hb) uc.f6499I8.getValue()).getClass();
        kotlin.jvm.internal.l.f(((Ob.a) template).f5996a, "template");
        return new Ab.a(new Eb());
    }
}
