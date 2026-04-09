package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static volatile p f1332a;

    /* renamed from: b, reason: collision with root package name */
    public static final p f1333b;

    static {
        p pVar = new p();
        Map map = Collections.EMPTY_MAP;
        f1333b = pVar;
    }

    public static p a() {
        p pVar;
        a1 a1Var = a1.f1244c;
        p pVar2 = f1332a;
        if (pVar2 != null) {
            return pVar2;
        }
        synchronized (p.class) {
            try {
                pVar = f1332a;
                if (pVar == null) {
                    Class cls = o.f1329a;
                    p pVar3 = null;
                    if (cls != null) {
                        try {
                            pVar3 = (p) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    pVar = pVar3 != null ? pVar3 : f1333b;
                    f1332a = pVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }
}
