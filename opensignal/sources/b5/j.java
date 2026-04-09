package b5;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class j extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2436a;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2437d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2438g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2439r;

    /* renamed from: x, reason: collision with root package name */
    public final Object f2440x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f2441y;

    public j(pb.n nVar, na.c cVar) {
        this.f2436a = 1;
        this.f2438g = false;
        this.f2439r = false;
        this.f2440x = nVar;
        this.f2441y = cVar;
        this.f2437d = new byte[1];
    }

    public final void b() {
        switch (this.f2436a) {
            case 0:
                if (!this.f2438g) {
                    ((h) this.f2440x).t((k) this.f2441y);
                    this.f2438g = true;
                    break;
                }
                break;
            default:
                if (!this.f2438g) {
                    ((pb.n) this.f2440x).q((na.c) this.f2441y);
                    this.f2438g = true;
                    break;
                }
                break;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f2436a) {
            case 0:
                if (!this.f2439r) {
                    ((h) this.f2440x).close();
                    this.f2439r = true;
                    break;
                }
                break;
            default:
                if (!this.f2439r) {
                    ((pb.n) this.f2440x).close();
                    this.f2439r = true;
                    break;
                }
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f2436a) {
            case 0:
                byte[] bArr = this.f2437d;
                if (read(bArr, 0, bArr.length) == -1) {
                    return -1;
                }
                return bArr[0] & 255;
            default:
                byte[] bArr2 = this.f2437d;
                if (read(bArr2, 0, bArr2.length) == -1) {
                    return -1;
                }
                return bArr2[0] & 255;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        switch (this.f2436a) {
        }
        return read(bArr, 0, bArr.length);
    }

    public j(h hVar, k kVar) {
        this.f2436a = 0;
        this.f2438g = false;
        this.f2439r = false;
        this.f2440x = hVar;
        this.f2441y = kVar;
        this.f2437d = new byte[1];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        switch (this.f2436a) {
            case 0:
                a5.a.i(!this.f2439r);
                b();
                int i12 = ((h) this.f2440x).read(bArr, i10, i11);
                if (i12 == -1) {
                    break;
                }
                break;
            default:
                qb.b.j(!this.f2439r);
                b();
                int i13 = ((pb.n) this.f2440x).read(bArr, i10, i11);
                if (i13 == -1) {
                    break;
                }
                break;
        }
        return -1;
    }
}
