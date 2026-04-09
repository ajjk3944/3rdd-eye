package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import pb.u0;

/* loaded from: classes.dex */
public final class a implements pb.n {

    /* renamed from: a, reason: collision with root package name */
    public final pb.n f4469a;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4470d;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f4471g;

    /* renamed from: r, reason: collision with root package name */
    public CipherInputStream f4472r;

    public a(pb.n nVar, byte[] bArr, byte[] bArr2) {
        this.f4469a = nVar;
        this.f4470d = bArr;
        this.f4471g = bArr2;
    }

    @Override // pb.n
    public final void close() {
        if (this.f4472r != null) {
            this.f4472r = null;
            this.f4469a.close();
        }
    }

    @Override // pb.n
    public final Map k() {
        return this.f4469a.k();
    }

    @Override // pb.n
    public final Uri o() {
        return this.f4469a.o();
    }

    @Override // pb.n
    public final long q(na.c cVar) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f4470d, "AES"), new IvParameterSpec(this.f4471g));
                b5.j jVar = new b5.j(this.f4469a, cVar);
                this.f4472r = new CipherInputStream(jVar, cipher);
                jVar.b();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e4) {
                throw new RuntimeException(e4);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // pb.k
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        this.f4472r.getClass();
        int i12 = this.f4472r.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }

    @Override // pb.n
    public final void s(u0 u0Var) {
        u0Var.getClass();
        this.f4469a.s(u0Var);
    }
}
