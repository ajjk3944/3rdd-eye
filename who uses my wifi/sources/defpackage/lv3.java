package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lv3 {
    public static final lv3 b = new lv3();
    public final HashMap a = new HashMap();

    public final synchronized void a(kv3 kv3Var, Class cls) {
        try {
            HashMap map = this.a;
            kv3 kv3Var2 = (kv3) map.get(cls);
            if (kv3Var2 != null && !kv3Var2.equals(kv3Var)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            map.put(cls, kv3Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
