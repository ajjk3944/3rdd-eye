package N7;

import N7.C1109b9;
import N7.D2;
import N7.D4;
import N7.F2;
import N7.J2;
import N7.J9;
import org.json.JSONObject;

/* compiled from: DivAppearanceTransitionJsonParser.kt */
/* loaded from: classes.dex */
public final class I2 implements D7.j<JSONObject, J2, F2> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5440a;

    public I2(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5440a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final F2 a(D7.f context, J2 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof J2.c;
        Uc uc = this.f5440a;
        if (z10) {
            return new F2.c(((D2.c) uc.f6916v1.getValue()).a(context, ((J2.c) template).f5566a, data));
        }
        if (template instanceof J2.a) {
            ((D4.d) uc.f6721d3.getValue()).getClass();
            return new F2.a(D4.d.b(context, ((J2.a) template).f5564a, data));
        }
        if (template instanceof J2.b) {
            ((C1109b9.d) uc.f6932w6.getValue()).getClass();
            return new F2.b(C1109b9.d.b(context, ((J2.b) template).f5565a, data));
        }
        if (template instanceof J2.d) {
            return new F2.d(((J9.e) uc.f6655X6.getValue()).a(context, ((J2.d) template).f5567a, data));
        }
        throw new b9.j();
    }
}
