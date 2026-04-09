package jcifs.smb1.smb1;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.conscrypt.PSKKeyManager;

/* renamed from: jcifs.smb1.smb1.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6279m implements L {

    /* renamed from: f, reason: collision with root package name */
    static Ug.e f50614f = Ug.e.a();

    /* renamed from: a, reason: collision with root package name */
    private MessageDigest f50615a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f50616b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f50617c;

    /* renamed from: d, reason: collision with root package name */
    private int f50618d;

    /* renamed from: e, reason: collision with root package name */
    private int f50619e;

    public C6279m(byte[] bArr, boolean z10) throws SmbException {
        this.f50617c = false;
        try {
            this.f50615a = MessageDigest.getInstance("MD5");
            this.f50616b = bArr;
            this.f50617c = z10;
            this.f50618d = 0;
            this.f50619e = 0;
            if (Ug.e.f22464b >= 5) {
                f50614f.println("macSigningKey:");
                Ug.d.a(f50614f, bArr, 0, bArr.length);
            }
        } catch (NoSuchAlgorithmException e10) {
            if (Ug.e.f22464b > 0) {
                e10.printStackTrace(f50614f);
            }
            throw new SmbException("MD5", e10);
        }
    }

    public byte[] a() throws IOException {
        byte[] bArrDigest = this.f50615a.digest();
        if (Ug.e.f22464b >= 5) {
            f50614f.println("digest: ");
            Ug.d.a(f50614f, bArrDigest, 0, bArrDigest.length);
            f50614f.flush();
        }
        this.f50618d = 0;
        return bArrDigest;
    }

    void b(byte[] bArr, int i10, int i11, AbstractC6278l abstractC6278l, AbstractC6278l abstractC6278l2) {
        int i12 = this.f50619e;
        abstractC6278l.f50608t = i12;
        if (abstractC6278l2 != null) {
            abstractC6278l2.f50608t = i12 + 1;
            abstractC6278l2.f50609u = false;
        }
        try {
            try {
                byte[] bArr2 = this.f50616b;
                c(bArr2, 0, bArr2.length);
                int i13 = i10 + 14;
                for (int i14 = 0; i14 < 8; i14++) {
                    bArr[i13 + i14] = 0;
                }
                AbstractC6278l.y(this.f50619e, bArr, i13);
                c(bArr, i10, i11);
                System.arraycopy(a(), 0, bArr, i13, 8);
                if (this.f50617c) {
                    this.f50617c = false;
                    System.arraycopy("BSRSPYL ".getBytes(), 0, bArr, i13, 8);
                }
            } catch (Exception e10) {
                if (Ug.e.f22464b > 0) {
                    e10.printStackTrace(f50614f);
                }
            }
            this.f50619e += 2;
        } catch (Throwable th2) {
            this.f50619e += 2;
            throw th2;
        }
    }

    public void c(byte[] bArr, int i10, int i11) throws IOException {
        if (Ug.e.f22464b >= 5) {
            f50614f.println("update: " + this.f50618d + " " + i10 + ":" + i11);
            Ug.d.a(f50614f, bArr, i10, Math.min(i11, PSKKeyManager.MAX_KEY_LENGTH_BYTES));
            f50614f.flush();
        }
        if (i11 == 0) {
            return;
        }
        this.f50615a.update(bArr, i10, i11);
        this.f50618d++;
    }

    boolean d(byte[] bArr, int i10, AbstractC6278l abstractC6278l) throws IOException {
        byte[] bArr2 = this.f50616b;
        c(bArr2, 0, bArr2.length);
        c(bArr, i10, 14);
        int i11 = i10 + 14;
        byte[] bArr3 = new byte[8];
        AbstractC6278l.y(abstractC6278l.f50608t, bArr3, 0);
        c(bArr3, 0, 8);
        int i12 = i10 + 22;
        if (abstractC6278l.f50591c == 46) {
            C6291z c6291z = (C6291z) abstractC6278l;
            c(bArr, i12, (abstractC6278l.f50594f - c6291z.f50680H) - 22);
            c(c6291z.f50677E, c6291z.f50678F, c6291z.f50680H);
        } else {
            c(bArr, i12, abstractC6278l.f50594f - 22);
        }
        byte[] bArrA = a();
        for (int i13 = 0; i13 < 8; i13++) {
            if (bArrA[i13] != bArr[i11 + i13]) {
                if (Ug.e.f22464b >= 2) {
                    f50614f.println("signature verification failure");
                    Ug.d.a(f50614f, bArrA, 0, 8);
                    Ug.d.a(f50614f, bArr, i11, 8);
                }
                abstractC6278l.f50609u = true;
                return true;
            }
        }
        abstractC6278l.f50609u = false;
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LM_COMPATIBILITY=");
        sb2.append(L.f50359I0);
        sb2.append(" MacSigningKey=");
        byte[] bArr = this.f50616b;
        sb2.append(Ug.d.d(bArr, 0, bArr.length));
        return sb2.toString();
    }
}
