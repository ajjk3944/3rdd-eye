package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ku3 implements cr3 {
    public static final du a = new du(9);

    public static zt3 a(ns3 ns3Var) throws GeneralSecurityException {
        byte[] bArr = zt3.d;
        try {
            Cipher cipher = (Cipher) a.get();
            if (cipher == null) {
                throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
            }
            if (zt3.a(cipher)) {
                return new zt3(((v34) ns3Var.k.f).b(), ns3Var.l.b());
            }
            throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e);
        }
    }
}
