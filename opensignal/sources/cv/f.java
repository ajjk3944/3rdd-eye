package cv;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class f extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6703a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f6704d;

    public /* synthetic */ f(i iVar, int i10) {
        this.f6703a = i10;
        this.f6704d = iVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jMin;
        switch (this.f6703a) {
            case 0:
                jMin = Math.min(((g) this.f6704d).f6706d, Integer.MAX_VALUE);
                break;
            default:
                z zVar = (z) this.f6704d;
                if (!zVar.f6755g) {
                    jMin = Math.min(zVar.f6754d.f6706d, Integer.MAX_VALUE);
                    break;
                } else {
                    throw new IOException("closed");
                }
        }
        return (int) jMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f6703a) {
            case 0:
                break;
            default:
                ((z) this.f6704d).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f6703a) {
            case 0:
                g gVar = (g) this.f6704d;
                if (gVar.f6706d > 0) {
                    return gVar.readByte() & 255;
                }
                return -1;
            default:
                z zVar = (z) this.f6704d;
                g gVar2 = zVar.f6754d;
                if (zVar.f6755g) {
                    throw new IOException("closed");
                }
                if (gVar2.f6706d == 0 && zVar.f6753a.u(gVar2, 8192L) == -1) {
                    return -1;
                }
                return gVar2.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.f6703a) {
            case 0:
                return ((g) this.f6704d) + ".inputStream()";
            default:
                return ((z) this.f6704d) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        switch (this.f6703a) {
            case 0:
                br.l.e(bArr, "sink");
                return ((g) this.f6704d).read(bArr, i10, i11);
            default:
                br.l.e(bArr, "data");
                z zVar = (z) this.f6704d;
                g gVar = zVar.f6754d;
                if (!zVar.f6755g) {
                    xu.l.e(bArr.length, i10, i11);
                    if (gVar.f6706d == 0 && zVar.f6753a.u(gVar, 8192L) == -1) {
                        return -1;
                    }
                    return gVar.read(bArr, i10, i11);
                }
                throw new IOException("closed");
        }
    }

    private final void b() {
    }
}
