package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* compiled from: DivActionSetVariableJsonParser.kt */
/* loaded from: classes.dex */
public final class N1 implements D7.j<JSONObject, O1, K1> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5885a;

    public N1(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5885a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final K1 a(D7.f context, O1 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        Uc uc = this.f5885a;
        Yb yb = (Yb) l7.d.a(context, template.f5946a, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, uc.f6691a9, uc.f6668Y8);
        A7.b bVarC = l7.d.c(context, template.f5947b, data, "variable_name", l7.k.f43898c);
        kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…ame\", TYPE_HELPER_STRING)");
        return new K1(yb, bVarC);
    }
}
