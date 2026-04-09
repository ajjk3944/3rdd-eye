package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: e, reason: collision with root package name */
    public final int f969e;

    /* renamed from: f, reason: collision with root package name */
    public final int f970f;

    public f(byte[] bArr, int i4, int i10) {
        super(bArr);
        g.c(i4, i4 + i10, bArr.length);
        this.f969e = i4;
        this.f970f = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final byte a(int i4) {
        int i10 = this.f970f;
        if (((i10 - (i4 + 1)) | i4) >= 0) {
            return this.f975b[this.f969e + i4];
        }
        if (i4 < 0) {
            throw new ArrayIndexOutOfBoundsException(je.u.r(i4, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a0.g.i(i4, i10, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final void f(int i4, byte[] bArr) {
        System.arraycopy(this.f975b, this.f969e, bArr, 0, i4);
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final int g() {
        return this.f969e;
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final byte i(int i4) {
        return this.f975b[this.f969e + i4];
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final int size() {
        return this.f970f;
    }
}
