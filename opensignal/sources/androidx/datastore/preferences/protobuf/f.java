package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: x, reason: collision with root package name */
    public final int f1268x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1269y;

    public f(byte[] bArr, int i10, int i11) {
        super(bArr);
        g.b(i10, i10 + i11, bArr.length);
        this.f1268x = i10;
        this.f1269y = i11;
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final byte a(int i10) {
        int i11 = this.f1269y;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f1279d[this.f1268x + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(h0.b.h(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(h0.b.l("Index > length: ", i10, i11, ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final void d(int i10, byte[] bArr) {
        System.arraycopy(this.f1279d, this.f1268x, bArr, 0, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final int e() {
        return this.f1268x;
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final byte g(int i10) {
        return this.f1279d[this.f1268x + i10];
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final int size() {
        return this.f1269y;
    }
}
