package e1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public int f20872a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f20873b;

    /* renamed from: c, reason: collision with root package name */
    public int f20874c;

    /* renamed from: d, reason: collision with root package name */
    public int f20875d;

    /* renamed from: e, reason: collision with root package name */
    public d f20876e = d.a();

    public int a(int i10) {
        return i10 + this.f20873b.getInt(i10);
    }

    public int b(int i10) {
        if (i10 < this.f20875d) {
            return this.f20873b.getShort(this.f20874c + i10);
        }
        return 0;
    }

    public void c(int i10, ByteBuffer byteBuffer) {
        this.f20873b = byteBuffer;
        if (byteBuffer == null) {
            this.f20872a = 0;
            this.f20874c = 0;
            this.f20875d = 0;
        } else {
            this.f20872a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f20874c = i11;
            this.f20875d = this.f20873b.getShort(i11);
        }
    }

    public int d(int i10) {
        int i11 = i10 + this.f20872a;
        return i11 + this.f20873b.getInt(i11) + 4;
    }

    public int e(int i10) {
        int i11 = i10 + this.f20872a;
        return this.f20873b.getInt(i11 + this.f20873b.getInt(i11));
    }
}
