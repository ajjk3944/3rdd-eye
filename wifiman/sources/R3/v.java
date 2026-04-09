package r3;

import java.util.Arrays;

/* loaded from: classes.dex */
final class v extends u {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f60106b;

    v(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f60106b = bArr;
    }

    @Override // r3.u
    final byte[] n0() {
        return this.f60106b;
    }
}
