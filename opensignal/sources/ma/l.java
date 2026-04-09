package ma;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f16497f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f16498a;

    /* renamed from: b, reason: collision with root package name */
    public int f16499b;

    /* renamed from: c, reason: collision with root package name */
    public int f16500c;

    /* renamed from: d, reason: collision with root package name */
    public int f16501d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f16502e;

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f16498a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f16502e;
            int length = bArr2.length;
            int i13 = this.f16500c + i12;
            if (length < i13) {
                this.f16502e = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f16502e, this.f16500c, i12);
            this.f16500c += i12;
        }
    }
}
