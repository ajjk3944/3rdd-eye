package j5;

import android.net.Uri;
import b5.b0;
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

/* loaded from: classes.dex */
public final class a implements b5.h {

    /* renamed from: a, reason: collision with root package name */
    public final b5.h f13255a;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f13256d;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f13257g;

    /* renamed from: r, reason: collision with root package name */
    public CipherInputStream f13258r;

    public a(b5.h hVar, byte[] bArr, byte[] bArr2) {
        this.f13255a = hVar;
        this.f13256d = bArr;
        this.f13257g = bArr2;
    }

    @Override // b5.h
    public final void close() {
        if (this.f13258r != null) {
            this.f13258r = null;
            this.f13255a.close();
        }
    }

    @Override // b5.h
    public final Map k() {
        return this.f13255a.k();
    }

    @Override // b5.h
    public final Uri o() {
        return this.f13255a.o();
    }

    @Override // androidx.media3.common.l
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        this.f13258r.getClass();
        int i12 = this.f13258r.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }

    @Override // b5.h
    public final long t(b5.k kVar) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f13256d, "AES"), new IvParameterSpec(this.f13257g));
                b5.j jVar = new b5.j(this.f13255a, kVar);
                this.f13258r = new CipherInputStream(jVar, cipher);
                jVar.b();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e4) {
                throw new RuntimeException(e4);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // b5.h
    public final void w(b0 b0Var) {
        b0Var.getClass();
        this.f13255a.w(b0Var);
    }
}
