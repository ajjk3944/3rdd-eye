package im;

import a0.x0;
import hm.r;
import hm.s;
import hm.u;
import hm.y;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import nk.k;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c implements u {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f26019a;

    /* renamed from: b, reason: collision with root package name */
    public final e f26020b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f26021c;

    public c(x0 x0Var) {
        this.f26021c = x0Var;
        Socket socket = (Socket) x0Var.f148e;
        this.f26019a = socket.getOutputStream();
        this.f26020b = new e(socket);
    }

    @Override // hm.u
    public final void Q(hm.e eVar, long j) throws IOException {
        i0.d(eVar.f25174b, 0L, j);
        while (j > 0) {
            e eVar2 = this.f26020b;
            eVar2.f();
            r rVar = eVar.f25173a;
            k.b(rVar);
            int iMin = (int) Math.min(j, rVar.f25208c - rVar.f25207b);
            eVar2.h();
            try {
                try {
                    this.f26019a.write(rVar.f25206a, rVar.f25207b, iMin);
                    if (eVar2.i()) {
                        throw eVar2.j(null);
                    }
                    int i4 = rVar.f25207b + iMin;
                    rVar.f25207b = i4;
                    long j8 = iMin;
                    j -= j8;
                    eVar.f25174b -= j8;
                    if (i4 == rVar.f25208c) {
                        eVar.f25173a = rVar.a();
                        s.a(rVar);
                    }
                } catch (IOException e2) {
                    if (!eVar2.i()) {
                        throw e2;
                    }
                    throw eVar2.j(e2);
                }
            } catch (Throwable th2) {
                eVar2.i();
                throw th2;
            }
        }
    }

    @Override // hm.u, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        int i4;
        OutputStream outputStream = this.f26019a;
        x0 x0Var = this.f26021c;
        e eVar = this.f26020b;
        eVar.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) x0Var.f145b;
            Socket socket = (Socket) x0Var.f148e;
            k.e(atomicInteger, "<this>");
            while (true) {
                int i10 = atomicInteger.get();
                if ((i10 & 1) != 0) {
                    i4 = 0;
                    break;
                }
                int i11 = i10 | 1;
                if (atomicInteger.compareAndSet(i10, i11)) {
                    i4 = i11;
                    break;
                }
            }
            if (i4 != 0) {
                if (i4 != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
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

    @Override // hm.u, java.io.Flushable
    public final void flush() throws IOException {
        e eVar = this.f26020b;
        eVar.h();
        try {
            this.f26019a.flush();
            if (eVar.i()) {
                throw eVar.j(null);
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

    @Override // hm.u
    public final y timeout() {
        return this.f26020b;
    }

    public final String toString() {
        return "sink(" + ((Socket) this.f26021c.f148e) + ')';
    }
}
