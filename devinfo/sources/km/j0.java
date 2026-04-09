package km;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j0 extends c1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28431c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Method f28432d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28433e;

    /* renamed from: f, reason: collision with root package name */
    public final m f28434f;
    public final Object g;

    public j0(Method method, int i4, m mVar, String str) {
        this.f28432d = method;
        this.f28433e = i4;
        this.f28434f = mVar;
        this.g = str;
    }

    @Override // km.c1
    public final void a(s0 s0Var, Object obj) {
        int i4 = this.f28431c;
        m mVar = this.f28434f;
        Object obj2 = this.g;
        Method method = this.f28432d;
        int i10 = this.f28433e;
        switch (i4) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    s0Var.b((rl.m) obj2, (rl.x) mVar.l(obj));
                    return;
                } catch (IOException e2) {
                    throw c1.m(method, i10, "Unable to convert " + obj + " to RequestBody", e2);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw c1.m(method, i10, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw c1.m(method, i10, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw c1.m(method, i10, d.h.t("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", d.h.t("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
                    rl.m mVar2 = rl.m.f33111b;
                    s0Var.b(t6.i0.r(strArr), (rl.x) mVar.l(value));
                }
                return;
        }
    }

    public j0(Method method, int i4, rl.m mVar, m mVar2) {
        this.f28432d = method;
        this.f28433e = i4;
        this.g = mVar;
        this.f28434f = mVar2;
    }
}
