package zb;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m extends l {

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f26834g;

    public m(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f26834g = bArr;
    }

    @Override // zb.l
    public final byte[] U() {
        return this.f26834g;
    }
}
