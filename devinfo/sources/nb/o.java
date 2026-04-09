package nb;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o extends n {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f29917c;

    public o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f29917c = bArr;
    }

    @Override // nb.n
    public final byte[] r0() {
        return this.f29917c;
    }
}
