package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivShapeDrawableJsonParser.kt */
/* renamed from: N7.t9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1367t9 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9336a;

    public C1367t9(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9336a = component;
    }

    @Override // D7.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C1353s9 a(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarA = l7.b.a(context, data, "color", l7.k.f43901f, l7.h.f43881b, l7.e.f43877a);
        Uc uc = this.f9336a;
        return new C1353s9(bVarA, (AbstractC1339r9) k8.F.l(context, data, "shape", uc.f6570P6), (C1185ga) k8.F.q(context, data, "stroke", uc.f6435C7));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1353s9 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.b.e(context, jSONObject, "color", value.f9187a, l7.h.f43880a);
        Uc uc = this.f9336a;
        k8.F.z(context, jSONObject, "shape", value.f9188b, uc.f6570P6);
        k8.F.z(context, jSONObject, "stroke", value.f9189c, uc.f6435C7);
        k8.F.y(context, jSONObject, "type", "shape_drawable");
        return jSONObject;
    }
}
