package com.ui.btle.v2.encryption.dh;

import com.ui.btle.v2.encryption.dh.DiffieHellman$Error;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class d {
    public d() {
        wj.a.a();
    }

    protected final byte[] a(byte[] privateKey, byte[] publicKey, byte[] serverPublicKey, byte[] bArr) {
        AbstractC6492s.i(privateKey, "privateKey");
        AbstractC6492s.i(publicKey, "publicKey");
        AbstractC6492s.i(serverPublicKey, "serverPublicKey");
        int iH = wj.b.h();
        byte[] bArr2 = new byte[iH];
        if (wj.b.f(bArr2, privateKey, serverPublicKey) != 0) {
            throw new DiffieHellman$Error.KeyExchange("Cannot prepare DH shared key result container!", null, 2, null);
        }
        int iA = wj.b.a();
        byte[] bArr3 = new byte[iA];
        byte[] bArr4 = new byte[wj.b.d()];
        wj.b.c(bArr4, new byte[0], 0, iA);
        wj.b.e(bArr4, bArr2, iH);
        wj.b.e(bArr4, publicKey, publicKey.length);
        wj.b.e(bArr4, serverPublicKey, serverPublicKey.length);
        if (bArr != null) {
            wj.b.e(bArr4, bArr, bArr.length);
        }
        wj.b.b(bArr4, bArr3, iA);
        return bArr3;
    }

    protected final byte[] b() {
        byte[] bArr = new byte[32];
        wj.b.k(bArr, 32);
        return bArr;
    }

    protected final byte[] c(byte[] privateKey) {
        AbstractC6492s.i(privateKey, "privateKey");
        byte[] bArr = new byte[32];
        if (wj.b.g(bArr, privateKey) == 0) {
            return bArr;
        }
        throw new DiffieHellman$Error.KeyExchange("Cannot generate DH public key!", null, 2, null);
    }
}
