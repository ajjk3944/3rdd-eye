package hm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25169a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f25170b;

    public /* synthetic */ c(g gVar, int i4) {
        this.f25169a = i4;
        this.f25170b = gVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jMin;
        switch (this.f25169a) {
            case 0:
                jMin = Math.min(((e) this.f25170b).f25174b, Integer.MAX_VALUE);
                break;
            default:
                q qVar = (q) this.f25170b;
                if (!qVar.f25205c) {
                    jMin = Math.min(qVar.f25204b.f25174b, Integer.MAX_VALUE);
                    break;
                } else {
                    throw new IOException("closed");
                }
        }
        return (int) jMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f25169a) {
            case 0:
                break;
            default:
                ((q) this.f25170b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f25169a) {
            case 0:
                e eVar = (e) this.f25170b;
                if (eVar.f25174b > 0) {
                    return eVar.readByte() & 255;
                }
                return -1;
            default:
                q qVar = (q) this.f25170b;
                e eVar2 = qVar.f25204b;
                if (qVar.f25205c) {
                    throw new IOException("closed");
                }
                if (eVar2.f25174b == 0 && qVar.f25203a.n(eVar2, 8192L) == -1) {
                    return -1;
                }
                return eVar2.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.f25169a) {
            case 0:
                return ((e) this.f25170b) + ".inputStream()";
            default:
                return ((q) this.f25170b) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.f25169a) {
            case 1:
                nk.k.e(outputStream, "out");
                q qVar = (q) this.f25170b;
                e eVar = qVar.f25204b;
                if (qVar.f25205c) {
                    throw new IOException("closed");
                }
                long j = 0;
                long j8 = 0;
                while (true) {
                    if (eVar.f25174b == j && qVar.f25203a.n(eVar, 8192L) == -1) {
                        return j8;
                    }
                    long j9 = eVar.f25174b;
                    j8 += j9;
                    i0.d(j9, 0L, j9);
                    r rVar = eVar.f25173a;
                    while (j9 > j) {
                        nk.k.b(rVar);
                        int iMin = (int) Math.min(j9, rVar.f25208c - rVar.f25207b);
                        outputStream.write(rVar.f25206a, rVar.f25207b, iMin);
                        int i4 = rVar.f25207b + iMin;
                        rVar.f25207b = i4;
                        long j10 = iMin;
                        eVar.f25174b -= j10;
                        j9 -= j10;
                        if (i4 == rVar.f25208c) {
                            r rVarA = rVar.a();
                            eVar.f25173a = rVarA;
                            s.a(rVar);
                            rVar = rVarA;
                        }
                        j = 0;
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i10) throws IOException {
        switch (this.f25169a) {
            case 0:
                nk.k.e(bArr, "sink");
                return ((e) this.f25170b).read(bArr, i4, i10);
            default:
                nk.k.e(bArr, "data");
                q qVar = (q) this.f25170b;
                e eVar = qVar.f25204b;
                if (!qVar.f25205c) {
                    i0.d(bArr.length, i4, i10);
                    if (eVar.f25174b == 0 && qVar.f25203a.n(eVar, 8192L) == -1) {
                        return -1;
                    }
                    return eVar.read(bArr, i4, i10);
                }
                throw new IOException("closed");
        }
    }

    private final void c() {
    }
}
