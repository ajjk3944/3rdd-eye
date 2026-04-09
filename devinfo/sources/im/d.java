package im;

import a0.x0;
import hm.r;
import hm.s;
import hm.w;
import hm.y;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d implements w {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f26022a;

    /* renamed from: b, reason: collision with root package name */
    public final e f26023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f26024c;

    public d(x0 x0Var) {
        this.f26024c = x0Var;
        Socket socket = (Socket) x0Var.f148e;
        this.f26022a = socket.getInputStream();
        this.f26023b = new e(socket);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i4;
        x0 x0Var = this.f26024c;
        e eVar = this.f26023b;
        eVar.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) x0Var.f145b;
            Socket socket = (Socket) x0Var.f148e;
            k.e(atomicInteger, "<this>");
            while (true) {
                int i10 = atomicInteger.get();
                if ((i10 & 2) != 0) {
                    i4 = 0;
                    break;
                }
                int i11 = i10 | 2;
                if (atomicInteger.compareAndSet(i10, i11)) {
                    i4 = i11;
                    break;
                }
            }
            if (i4 != 0) {
                if (i4 == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.f26022a.close();
                    }
                }
                if (eVar.i()) {
                    throw eVar.j(null);
                }
            }
        } catch (IOException e2) {
            if (!eVar.i()) {
                throw e2;
            }
            throw eVar.j(e2);
        } finally {
            eVar.i();
        }
    }

    @Override // hm.w
    public final long n(hm.e eVar, long j) throws IOException {
        k.e(eVar, "sink");
        e eVar2 = this.f26023b;
        eVar2.f();
        r rVarW = eVar.w(1);
        int iMin = (int) Math.min(8192L, 8192 - rVarW.f25208c);
        try {
            eVar2.h();
            try {
                int i4 = this.f26022a.read(rVarW.f25206a, rVarW.f25208c, iMin);
                if (eVar2.i()) {
                    throw eVar2.j(null);
                }
                if (i4 != -1) {
                    rVarW.f25208c += i4;
                    long j8 = i4;
                    eVar.f25174b += j8;
                    return j8;
                }
                if (rVarW.f25207b != rVarW.f25208c) {
                    return -1L;
                }
                eVar.f25173a = rVarW.a();
                s.a(rVarW);
                return -1L;
            } catch (IOException e2) {
                if (eVar2.i()) {
                    throw eVar2.j(e2);
                }
                throw e2;
            } finally {
                eVar2.i();
            }
        } catch (AssertionError e10) {
            if (f.a(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // hm.w, hm.u
    public final y timeout() {
        return this.f26023b;
    }

    public final String toString() {
        return "source(" + ((Socket) this.f26024c.f148e) + ')';
    }
}
