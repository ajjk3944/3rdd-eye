package ma;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f16477e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f16478a;

    /* renamed from: b, reason: collision with root package name */
    public int f16479b;

    /* renamed from: c, reason: collision with root package name */
    public int f16480c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f16481d;

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f16478a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f16481d;
            int length = bArr2.length;
            int i13 = this.f16479b + i12;
            if (length < i13) {
                this.f16481d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f16481d, this.f16479b, i12);
            this.f16479b += i12;
        }
    }
}
