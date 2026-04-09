package N7;

import N7.AbstractC1311p8;
import N7.C1168f8;
import org.json.JSONObject;

/* compiled from: DivPivotJsonParser.kt */
/* renamed from: N7.i8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1213i8 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8417a;

    public C1213i8(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8417a = component;
    }

    @Override // D7.b
    public final Object a(D7.f context, JSONObject data) {
        Object bVar;
        Object obj;
        Object obj2;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        String strV = k8.F.v(context, data);
        if (strV == null) {
            strV = "pivot-fixed";
        }
        Z6.b bVar2 = context.c().get(strV);
        Object obj3 = null;
        AbstractC1311p8 abstractC1311p8 = bVar2 instanceof AbstractC1311p8 ? (AbstractC1311p8) bVar2 : null;
        if (abstractC1311p8 != null) {
            if (abstractC1311p8 instanceof AbstractC1311p8.a) {
                strV = "pivot-fixed";
            } else {
                if (!(abstractC1311p8 instanceof AbstractC1311p8.b)) {
                    throw new b9.j();
                }
                strV = "pivot-percentage";
            }
        }
        boolean zEquals = strV.equals("pivot-fixed");
        Uc uc = this.f8417a;
        if (zEquals) {
            C1168f8.c cVar = (C1168f8.c) uc.f6529L5.getValue();
            if (abstractC1311p8 != null) {
                if (abstractC1311p8 instanceof AbstractC1311p8.a) {
                    obj2 = ((AbstractC1311p8.a) abstractC1311p8).f8901a;
                } else {
                    if (!(abstractC1311p8 instanceof AbstractC1311p8.b)) {
                        throw new b9.j();
                    }
                    obj2 = ((AbstractC1311p8.b) abstractC1311p8).f8902a;
                }
                obj3 = obj2;
            }
            cVar.getClass();
            bVar = new AbstractC1311p8.a(C1168f8.c.d(context, (C1183g8) obj3, data));
        } else {
            if (!strV.equals("pivot-percentage")) {
                throw z7.e.l(data, "type", strV);
            }
            C1269m8 c1269m8 = (C1269m8) uc.f6558O5.getValue();
            if (abstractC1311p8 != null) {
                if (abstractC1311p8 instanceof AbstractC1311p8.a) {
                    obj = ((AbstractC1311p8.a) abstractC1311p8).f8901a;
                } else {
                    if (!(abstractC1311p8 instanceof AbstractC1311p8.b)) {
                        throw new b9.j();
                    }
                    obj = ((AbstractC1311p8.b) abstractC1311p8).f8902a;
                }
                obj3 = obj;
            }
            c1269m8.getClass();
            bVar = new AbstractC1311p8.b(C1269m8.d(context, (C1297o8) obj3, data));
        }
        return bVar;
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1311p8 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1311p8.a;
        Uc uc = this.f8417a;
        if (z10) {
            ((C1168f8.c) uc.f6529L5.getValue()).getClass();
            return C1168f8.c.e(context, ((AbstractC1311p8.a) value).f8901a);
        }
        if (!(value instanceof AbstractC1311p8.b)) {
            throw new b9.j();
        }
        ((C1269m8) uc.f6558O5.getValue()).getClass();
        return C1269m8.e(context, ((AbstractC1311p8.b) value).f8902a);
    }
}
