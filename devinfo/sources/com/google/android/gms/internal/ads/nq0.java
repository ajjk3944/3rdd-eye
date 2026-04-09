package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nq0 {
    public static final String a(byte[] bArr, byte[] bArr2, String str, od0 od0Var) throws GeneralSecurityException, IOException {
        av0 av0VarA;
        ByteArrayInputStream byteArrayInputStream;
        if (str != null) {
            try {
                try {
                    byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 11));
                } catch (IOException unused) {
                    throw new GeneralSecurityException("Parse keyset failed");
                }
            } catch (GeneralSecurityException e2) {
                ya.a0.m("Failed to get keysethandle".concat(e2.toString()));
                ua.j.C.f35265h.f("CryptoUtils.getHandle", e2);
                av0VarA = null;
            }
            try {
                jn1 jn1Var = jn1.f12801a;
                int i4 = um1.f17262a;
                vh1 vh1VarF = vh1.F(byteArrayInputStream, jn1.f12802b);
                byteArrayInputStream.close();
                av0VarA = av0.a(vh1VarF);
                if (av0VarA != null) {
                    try {
                        byte[] bArrA = ((j91) av0VarA.A(yo0.f(), j91.class)).a(bArr, bArr2);
                        od0Var.f14674a.put("ds", "1");
                        return new String(bArrA, "UTF-8");
                    } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e10) {
                        ya.a0.m("Failed to decrypt ".concat(e10.toString()));
                        ua.j.C.f35265h.f("CryptoUtils.decrypt", e10);
                        od0Var.f14674a.put("dsf", e10.toString());
                    }
                }
            } catch (Throwable th2) {
                byteArrayInputStream.close();
                throw th2;
            }
        }
        return null;
    }
}
