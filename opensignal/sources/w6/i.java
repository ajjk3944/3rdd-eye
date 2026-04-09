package w6;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f24298f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f24299a;

    /* renamed from: b, reason: collision with root package name */
    public int f24300b;

    /* renamed from: c, reason: collision with root package name */
    public int f24301c;

    /* renamed from: d, reason: collision with root package name */
    public int f24302d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f24303e;

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f24299a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f24303e;
            int length = bArr2.length;
            int i13 = this.f24301c + i12;
            if (length < i13) {
                this.f24303e = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f24303e, this.f24301c, i12);
            this.f24301c += i12;
        }
    }
}
