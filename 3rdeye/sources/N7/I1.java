package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* compiled from: DivActionSetStoredValueJsonParser.kt */
/* loaded from: classes.dex */
public final class I1 implements D7.j<JSONObject, J1, F1> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5439a;

    public I1(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5439a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final F1 a(D7.f context, J1 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarD = l7.d.d(context, template.f5561a, data, "lifetime", l7.k.f43897b, l7.h.f43886g);
        kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…ELPER_INT, NUMBER_TO_INT)");
        A7.b bVarC = l7.d.c(context, template.f5562b, data, AppMeasurementSdk.ConditionalUserProperty.NAME, l7.k.f43898c);
        kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…ame\", TYPE_HELPER_STRING)");
        Uc uc = this.f5439a;
        return new F1(bVarD, bVarC, (Yb) l7.d.a(context, template.f5563c, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, uc.f6691a9, uc.f6668Y8));
    }
}
