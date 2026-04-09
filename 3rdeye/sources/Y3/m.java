package y3;

import java.util.HashMap;
import java.util.Map;
import y3.h;

/* compiled from: EventInternal.java */
/* loaded from: classes.dex */
public abstract class m {

    /* compiled from: EventInternal.java */
    public static abstract class a {
        public final void a(String str, String str2) {
            HashMap map = ((h.a) this).f48066f;
            if (map == null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put(str, str2);
        }
    }

    public final String a(String str) {
        String str2 = b().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> b();

    public abstract Integer c();

    public abstract l d();

    public abstract long e();

    public abstract byte[] f();

    public abstract byte[] g();

    public final int h(String str) {
        String str2 = b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract Integer i();

    public abstract String j();

    public abstract String k();

    public abstract long l();

    public final h.a m() {
        h.a aVar = new h.a();
        String strK = k();
        if (strK == null) {
            throw new NullPointerException("Null transportName");
        }
        aVar.f48061a = strK;
        aVar.f48062b = c();
        aVar.f48067g = i();
        aVar.f48068h = j();
        aVar.i = f();
        aVar.f48069j = g();
        l lVarD = d();
        if (lVarD == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        aVar.f48063c = lVarD;
        aVar.f48064d = Long.valueOf(e());
        aVar.f48065e = Long.valueOf(l());
        aVar.f48066f = new HashMap(b());
        return aVar;
    }
}
