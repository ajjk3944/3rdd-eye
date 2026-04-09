package S1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    protected int f20221a;

    /* renamed from: b, reason: collision with root package name */
    protected ByteBuffer f20222b;

    /* renamed from: c, reason: collision with root package name */
    private int f20223c;

    /* renamed from: d, reason: collision with root package name */
    private int f20224d;

    /* renamed from: e, reason: collision with root package name */
    d f20225e = d.a();

    protected int a(int i10) {
        return i10 + this.f20222b.getInt(i10);
    }

    protected int b(int i10) {
        if (i10 < this.f20224d) {
            return this.f20222b.getShort(this.f20223c + i10);
        }
        return 0;
    }

    protected void c(int i10, ByteBuffer byteBuffer) {
        this.f20222b = byteBuffer;
        if (byteBuffer == null) {
            this.f20221a = 0;
            this.f20223c = 0;
            this.f20224d = 0;
        } else {
            this.f20221a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f20223c = i11;
            this.f20224d = this.f20222b.getShort(i11);
        }
    }

    protected int d(int i10) {
        int i11 = i10 + this.f20221a;
        return i11 + this.f20222b.getInt(i11) + 4;
    }

    protected int e(int i10) {
        int i11 = i10 + this.f20221a;
        return this.f20222b.getInt(i11 + this.f20222b.getInt(i11));
    }
}
