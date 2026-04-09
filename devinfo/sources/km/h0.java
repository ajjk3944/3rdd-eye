package km;

import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h0 extends c1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28421c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f28422d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28423e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28424f;

    public /* synthetic */ h0(Method method, int i4, boolean z3, int i10) {
        this.f28421c = i10;
        this.f28422d = method;
        this.f28423e = i4;
        this.f28424f = z3;
    }

    @Override // km.c1
    public final void a(s0 s0Var, Object obj) {
        switch (this.f28421c) {
            case 0:
                Map map = (Map) obj;
                int i4 = this.f28423e;
                Method method = this.f28422d;
                if (map == null) {
                    throw c1.m(method, i4, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw c1.m(method, i4, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw c1.m(method, i4, d.h.t("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw c1.m(method, i4, "Field map value '" + value + "' converted to null by " + a.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    n nVar = s0Var.j;
                    if (this.f28424f) {
                        nVar.h(str, string);
                    } else {
                        nVar.g(str, string);
                    }
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                int i10 = this.f28423e;
                Method method2 = this.f28422d;
                if (map2 == null) {
                    throw c1.m(method2, i10, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw c1.m(method2, i10, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw c1.m(method2, i10, d.h.t("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    s0Var.a(str2, value2.toString(), this.f28424f);
                }
                return;
            default:
                Map map3 = (Map) obj;
                int i11 = this.f28423e;
                Method method3 = this.f28422d;
                if (map3 == null) {
                    throw c1.m(method3, i11, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw c1.m(method3, i11, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw c1.m(method3, i11, d.h.t("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw c1.m(method3, i11, "Query map value '" + value3 + "' converted to null by " + a.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    s0Var.c(str3, string2, this.f28424f);
                }
                return;
        }
    }
}
