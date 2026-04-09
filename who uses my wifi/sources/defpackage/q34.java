package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q34 extends ThreadLocal {
    public final /* synthetic */ r2 a;

    public q34(r2 r2Var) {
        this.a = r2Var;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() throws InvalidKeyException {
        try {
            m34 m34Var = m34.c;
            r2 r2Var = this.a;
            Mac mac = (Mac) m34Var.a.l((String) r2Var.h);
            mac.init((SecretKeySpec) r2Var.j);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
