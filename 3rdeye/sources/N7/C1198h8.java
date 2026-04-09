package N7;

import N7.AbstractC1138d8;
import N7.C1168f8;
import org.json.JSONObject;

/* compiled from: DivPivotJsonParser.kt */
/* renamed from: N7.h8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1198h8 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8355a;

    public C1198h8(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8355a = component;
    }

    @Override // D7.b
    public final Object a(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        String strV = k8.F.v(context, data);
        if (strV == null) {
            strV = "pivot-fixed";
        }
        boolean zEquals = strV.equals("pivot-fixed");
        Uc uc = this.f8355a;
        if (zEquals) {
            ((C1168f8.b) uc.f6518K5.getValue()).getClass();
            return new AbstractC1138d8.a(C1168f8.b.d(context, data));
        }
        if (strV.equals("pivot-percentage")) {
            ((C1255l8) uc.f6548N5.getValue()).getClass();
            return new AbstractC1138d8.b(C1255l8.d(context, data));
        }
        Z6.b bVarF = context.c().f(strV, data);
        AbstractC1311p8 abstractC1311p8 = bVarF instanceof AbstractC1311p8 ? (AbstractC1311p8) bVarF : null;
        if (abstractC1311p8 != null) {
            return ((C1227j8) uc.f6601S5.getValue()).a(context, abstractC1311p8, data);
        }
        throw z7.e.l(data, "type", strV);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1138d8 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1138d8.a;
        Uc uc = this.f8355a;
        if (z10) {
            ((C1168f8.b) uc.f6518K5.getValue()).getClass();
            return C1168f8.b.e(context, ((AbstractC1138d8.a) value).f8075b);
        }
        if (!(value instanceof AbstractC1138d8.b)) {
            throw new b9.j();
        }
        ((C1255l8) uc.f6548N5.getValue()).getClass();
        return C1255l8.e(context, ((AbstractC1138d8.b) value).f8076b);
    }
}
