package Ug;

import org.conscrypt.PSKKeyManager;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    byte[] f22469a;

    /* renamed from: b, reason: collision with root package name */
    int f22470b;

    /* renamed from: c, reason: collision with root package name */
    int f22471c;

    public g(byte[] bArr) {
        a(bArr, 0, bArr.length);
    }

    public void a(byte[] bArr, int i10, int i11) {
        this.f22469a = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        this.f22470b = 0;
        while (true) {
            int i12 = this.f22470b;
            if (i12 >= 256) {
                break;
            }
            this.f22469a[i12] = (byte) i12;
            this.f22470b = i12 + 1;
        }
        this.f22471c = 0;
        this.f22470b = 0;
        while (true) {
            int i13 = this.f22470b;
            if (i13 >= 256) {
                this.f22471c = 0;
                this.f22470b = 0;
                return;
            }
            int i14 = this.f22471c + bArr[(i13 % i11) + i10];
            byte[] bArr2 = this.f22469a;
            byte b10 = bArr2[i13];
            int i15 = (i14 + b10) & 255;
            this.f22471c = i15;
            bArr2[i13] = bArr2[i15];
            bArr2[i15] = b10;
            this.f22470b = i13 + 1;
        }
    }

    public void b(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13 = i11 + i10;
        while (i10 < i13) {
            int i14 = (this.f22470b + 1) & 255;
            this.f22470b = i14;
            int i15 = this.f22471c;
            byte[] bArr3 = this.f22469a;
            byte b10 = bArr3[i14];
            int i16 = (i15 + b10) & 255;
            this.f22471c = i16;
            bArr3[i14] = bArr3[i16];
            bArr3[i16] = b10;
            bArr2[i12] = (byte) (bArr[i10] ^ bArr3[(bArr3[i14] + b10) & 255]);
            i12++;
            i10++;
        }
    }
}
