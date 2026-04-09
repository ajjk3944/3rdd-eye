package Z;

import C.RunnableC0615b;
import C.S;
import C.T;
import W.F;
import Z.j;
import d0.k;
import d0.w;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import o0.b;

/* compiled from: AudioSource.java */
/* loaded from: classes.dex */
public final class g implements I.c<w> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k.a f13908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f13909c;

    public g(h hVar, k.a aVar) {
        this.f13909c = hVar;
        this.f13908b = aVar;
    }

    @Override // I.c
    public final void onFailure(Throwable th) {
        h hVar = this.f13909c;
        if (hVar.f13920l != this.f13908b) {
            return;
        }
        S.a("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
        if (th instanceof IllegalStateException) {
            return;
        }
        H.g gVar = hVar.f13918j;
        F.c cVar = hVar.f13919k;
        if (gVar == null || cVar == null) {
            return;
        }
        gVar.execute(new T(11, cVar, th));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // I.c
    public final void onSuccess(w wVar) throws IllegalStateException {
        w wVar2 = wVar;
        h hVar = this.f13909c;
        if (!hVar.i || hVar.f13920l != this.f13908b) {
            wVar2.cancel();
            return;
        }
        boolean z10 = hVar.f13923o;
        q qVar = hVar.f13914e;
        p pVar = hVar.f13913d;
        if (z10) {
            A2.l.q(null, hVar.f13924p > 0);
            if (System.nanoTime() - hVar.f13924p >= hVar.f13915f) {
                A2.l.q(null, hVar.f13923o);
                try {
                    pVar.c();
                    S.a("AudioSource", "Retry start AudioStream succeed");
                    qVar.a();
                    qVar.f13975a.set(false);
                    hVar.f13923o = false;
                } catch (j.a e4) {
                    S.h("AudioSource", "Retry start AudioStream failed", e4);
                    hVar.f13924p = System.nanoTime();
                }
            }
        }
        if (!hVar.f13923o) {
            qVar = pVar;
        }
        ByteBuffer byteBufferW = wVar2.w();
        m mVar = qVar.read(byteBufferW);
        int i = mVar.f13954a;
        if (i > 0) {
            if (hVar.f13926r) {
                byte[] bArr = hVar.f13927s;
                if (bArr == null || bArr.length < i) {
                    hVar.f13927s = new byte[i];
                }
                int iPosition = byteBufferW.position();
                byteBufferW.put(hVar.f13927s, 0, i);
                byteBufferW.limit(byteBufferW.position()).position(iPosition);
            }
            H.g gVar = hVar.f13918j;
            long j4 = mVar.f13955b;
            if (gVar != null && j4 - hVar.f13929u >= 200) {
                hVar.f13929u = j4;
                F.c cVar = hVar.f13919k;
                if (hVar.f13930v == 2) {
                    ShortBuffer shortBufferAsShortBuffer = byteBufferW.asShortBuffer();
                    double dMax = 0.0d;
                    while (shortBufferAsShortBuffer.hasRemaining()) {
                        dMax = Math.max(dMax, Math.abs((int) shortBufferAsShortBuffer.get()));
                    }
                    hVar.f13928t = dMax / 32767.0d;
                    if (gVar != null && cVar != null) {
                        gVar.execute(new RunnableC0615b(11, hVar, cVar));
                    }
                }
            }
            byteBufferW.limit(i + byteBufferW.position());
            wVar2.d(TimeUnit.NANOSECONDS.toMicros(j4));
            wVar2.c();
        } else {
            S.g("AudioSource", "Unable to read data from AudioStream.");
            wVar2.cancel();
        }
        k.a aVar = hVar.f13920l;
        Objects.requireNonNull(aVar);
        b.d dVarC = aVar.c();
        g gVar2 = hVar.f13921m;
        Objects.requireNonNull(gVar2);
        I.j.a(dVarC, gVar2, hVar.f13910a);
    }
}
