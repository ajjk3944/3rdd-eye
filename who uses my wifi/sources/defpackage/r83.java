package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class r83 {
    public static final String a(byte[] bArr, byte[] bArr2, String str, jv2 jv2Var) throws GeneralSecurityException, IOException {
        jr3 jr3VarA;
        ByteArrayInputStream byteArrayInputStream;
        if (str != null) {
            try {
                try {
                    byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 11));
                } catch (IOException unused) {
                    throw new GeneralSecurityException("Parse keyset failed");
                }
            } catch (GeneralSecurityException e) {
                gi2.G("Failed to get keysethandle".concat(e.toString()));
                hg4.C.h.d("CryptoUtils.getHandle", e);
                jr3VarA = null;
            }
            try {
                h54 h54Var = h54.a;
                int i = u44.a;
                vz3 vz3VarF = vz3.F(byteArrayInputStream, h54.b);
                byteArrayInputStream.close();
                jr3VarA = jr3.a(vz3VarF);
                if (jr3VarA != null) {
                    try {
                        byte[] bArrB = ((cr3) jr3VarA.q(um.E(), cr3.class)).b(bArr, bArr2);
                        jv2Var.a.put("ds", "1");
                        return new String(bArrB, "UTF-8");
                    } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e2) {
                        gi2.G("Failed to decrypt ".concat(e2.toString()));
                        hg4.C.h.d("CryptoUtils.decrypt", e2);
                        jv2Var.a.put("dsf", e2.toString());
                    }
                }
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
        }
        return null;
    }
}
