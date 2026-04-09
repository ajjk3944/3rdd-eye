package o4;

import A4.C;
import A4.D;
import A4.I;
import A4.y;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes3.dex */
abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f55319a = Charset.forName("UTF-8");

    public static D.c a(C.c cVar) {
        return (D.c) D.c.Z().x(cVar.Y().Z()).w(cVar.b0()).u(cVar.a0()).t(cVar.Z()).i();
    }

    public static D b(C c10) {
        D.b bVarU = D.Z().u(c10.b0());
        Iterator it = c10.a0().iterator();
        while (it.hasNext()) {
            bVarU.t(a((C.c) it.next()));
        }
        return (D) bVarU.i();
    }

    public static void c(C.c cVar) throws GeneralSecurityException {
        if (!cVar.c0()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.Z())));
        }
        if (cVar.a0() == I.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.Z())));
        }
        if (cVar.b0() == A4.z.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.Z())));
        }
    }

    public static void d(C c10) throws GeneralSecurityException {
        int iB0 = c10.b0();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (C.c cVar : c10.a0()) {
            if (cVar.b0() == A4.z.ENABLED) {
                c(cVar);
                if (cVar.Z() == iB0) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                if (cVar.Y().Y() != y.c.ASYMMETRIC_PUBLIC) {
                    z11 = false;
                }
                i10++;
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
