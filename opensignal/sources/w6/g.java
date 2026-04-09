package w6;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f24278e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f24279a;

    /* renamed from: b, reason: collision with root package name */
    public int f24280b;

    /* renamed from: c, reason: collision with root package name */
    public int f24281c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f24282d;

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f24279a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f24282d;
            int length = bArr2.length;
            int i13 = this.f24280b + i12;
            if (length < i13) {
                this.f24282d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f24282d, this.f24280b, i12);
            this.f24280b += i12;
        }
    }
}
