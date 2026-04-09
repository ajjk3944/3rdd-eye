package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* compiled from: DivActionArrayInsertValueJsonParser.kt */
/* renamed from: N7.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1344s0 implements D7.j<JSONObject, C1358t0, C1303p0> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9129a;

    public C1344s0(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9129a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1303p0 a(D7.f context, C1358t0 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarK = l7.d.k(context, template.f9198a, data, "index", l7.k.f43897b, l7.h.f43886g);
        Uc uc = this.f9129a;
        Yb yb = (Yb) l7.d.a(context, template.f9199b, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, uc.f6691a9, uc.f6668Y8);
        A7.b bVarC = l7.d.c(context, template.f9200c, data, "variable_name", l7.k.f43898c);
        kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…ame\", TYPE_HELPER_STRING)");
        return new C1303p0(bVarK, bVarC, yb);
    }
}
