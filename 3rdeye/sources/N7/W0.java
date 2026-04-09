package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import l7.k;
import org.json.JSONObject;

/* compiled from: DivActionDictSetValueJsonParser.kt */
/* loaded from: classes.dex */
public final class W0 implements D7.j<JSONObject, X0, T0> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7607a;

    public W0(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7607a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final T0 a(D7.f context, X0 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        k.g gVar = l7.k.f43898c;
        A7.b bVarC = l7.d.c(context, template.f7682a, data, "key", gVar);
        kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…key\", TYPE_HELPER_STRING)");
        Uc uc = this.f7607a;
        Yb yb = (Yb) l7.d.h(context, template.f7683b, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, uc.f6691a9, uc.f6668Y8);
        A7.b bVarC2 = l7.d.c(context, template.f7684c, data, "variable_name", gVar);
        kotlin.jvm.internal.l.e(bVarC2, "resolveExpression(contex…ame\", TYPE_HELPER_STRING)");
        return new T0(bVarC, bVarC2, yb);
    }
}
