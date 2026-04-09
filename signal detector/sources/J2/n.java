package J2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2075c;

    public n(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f2075c = bArr;
    }

    @Override // J2.m
    public final byte[] d1() {
        return this.f2075c;
    }
}
