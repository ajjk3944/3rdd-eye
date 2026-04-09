package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* compiled from: DivActionArraySetValueJsonParser.kt */
/* loaded from: classes.dex */
public final class C0 implements D7.j<JSONObject, D0, C1442z0> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5006a;

    public C0(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5006a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1442z0 a(D7.f context, D0 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarD = l7.d.d(context, template.f5052a, data, "index", l7.k.f43897b, l7.h.f43886g);
        kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…ELPER_INT, NUMBER_TO_INT)");
        Uc uc = this.f5006a;
        Yb yb = (Yb) l7.d.a(context, template.f5053b, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, uc.f6691a9, uc.f6668Y8);
        A7.b bVarC = l7.d.c(context, template.f5054c, data, "variable_name", l7.k.f43898c);
        kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…ame\", TYPE_HELPER_STRING)");
        return new C1442z0(bVarD, bVarC, yb);
    }
}
