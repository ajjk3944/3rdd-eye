package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static volatile o f1022a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f1023b;

    static {
        o oVar = new o();
        Map map = Collections.EMPTY_MAP;
        f1023b = oVar;
    }

    public static o a() {
        o oVar;
        u0 u0Var = u0.f1071c;
        o oVar2 = f1022a;
        if (oVar2 != null) {
            return oVar2;
        }
        synchronized (o.class) {
            try {
                oVar = f1022a;
                if (oVar == null) {
                    Class cls = n.f1019a;
                    o oVar3 = null;
                    if (cls != null) {
                        try {
                            oVar3 = (o) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    oVar = oVar3 != null ? oVar3 : f1023b;
                    f1022a = oVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oVar;
    }
}
