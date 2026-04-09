package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jv3 {
    public static final jv3 b;
    public final HashMap a = new HashMap();

    static {
        yr3 yr3Var = yr3.k;
        jv3 jv3Var = new jv3();
        try {
            jv3Var.a(yr3Var, gv3.class);
            b = jv3Var;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final synchronized void a(iv3 iv3Var, Class cls) {
        try {
            HashMap map = this.a;
            iv3 iv3Var2 = (iv3) map.get(cls);
            if (iv3Var2 != null && !iv3Var2.equals(iv3Var)) {
                String string = cls.toString();
                StringBuilder sb = new StringBuilder(string.length() + 60);
                sb.append("Different key creator for parameters class ");
                sb.append(string);
                sb.append(" already inserted");
                throw new GeneralSecurityException(sb.toString());
            }
            map.put(cls, iv3Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final gi2 b(mr3 mr3Var, Integer num) {
        gi2 gi2VarA;
        synchronized (this) {
            iv3 iv3Var = (iv3) this.a.get(mr3Var.getClass());
            if (iv3Var == null) {
                String string = mr3Var.toString();
                StringBuilder sb = new StringBuilder(string.length() + 86);
                sb.append("Cannot create a new key for parameters ");
                sb.append(string);
                sb.append(": no key creator for this class was registered.");
                throw new GeneralSecurityException(sb.toString());
            }
            gi2VarA = iv3Var.a(mr3Var, num);
        }
        return gi2VarA;
    }
}
