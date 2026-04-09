package nj;

import java.io.InputStream;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes3.dex */
public class v extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f54866a;

    /* renamed from: b, reason: collision with root package name */
    private int f54867b;

    /* renamed from: c, reason: collision with root package name */
    private int f54868c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f54869d;

    /* renamed from: e, reason: collision with root package name */
    private int f54870e;

    /* renamed from: f, reason: collision with root package name */
    private int f54871f;

    /* renamed from: g, reason: collision with root package name */
    private int f54872g = 0;

    public v(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        this.f54866a = (byte[]) bArr.clone();
        this.f54869d = (byte[]) bArr2.clone();
        this.f54867b = i10;
        this.f54870e = i12;
        this.f54868c = i11;
        this.f54871f = i13;
    }

    @Override // java.io.InputStream
    public int read() {
        int i10;
        int i11 = this.f54872g;
        int i12 = this.f54868c;
        if (i11 < i12) {
            i10 = this.f54866a[this.f54867b + i11];
        } else {
            if (i11 >= this.f54871f + i12) {
                return -1;
            }
            i10 = this.f54869d[(this.f54870e + i11) - i12];
        }
        if (i10 < 0) {
            i10 += PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        this.f54872g = i11 + 1;
        return i10;
    }
}
