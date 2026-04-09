package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.gu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1232gu {
    public static final String a(byte[] bArr, byte[] bArr2, String str, C0750Tn c0750Tn) throws GeneralSecurityException, IOException {
        C2041vw c2041vwB;
        ByteArrayInputStream byteArrayInputStream;
        if (str != null) {
            try {
                try {
                    byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 11));
                } catch (IOException unused) {
                    throw new GeneralSecurityException("Parse keyset failed");
                }
            } catch (GeneralSecurityException e6) {
                AbstractC2907C.m("Failed to get keysethandle".concat(e6.toString()));
                p2.j.f22785C.f22795h.f("CryptoUtils.getHandle", e6);
                c2041vwB = null;
            }
            try {
                XK xk = XK.f12412a;
                int i = JK.f9277a;
                C1257hI c1257hIF = C1257hI.F(byteArrayInputStream, XK.f12413b);
                byteArrayInputStream.close();
                c2041vwB = C2041vw.b(c1257hIF);
                if (c2041vwB != null) {
                    try {
                        byte[] bArrA = ((VD) c2041vwB.A(AbstractC1984ut.f(), VD.class)).a(bArr, bArr2);
                        c0750Tn.f11457a.put("ds", "1");
                        return new String(bArrA, "UTF-8");
                    } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e7) {
                        AbstractC2907C.m("Failed to decrypt ".concat(e7.toString()));
                        p2.j.f22785C.f22795h.f("CryptoUtils.decrypt", e7);
                        c0750Tn.f11457a.put("dsf", e7.toString());
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
