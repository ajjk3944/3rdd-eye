package Z;

import C.S;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import t4.C5606d;

/* compiled from: SilentAudioStream.java */
/* loaded from: classes.dex */
public final class q implements j {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f13975a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f13976b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final int f13977c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13978d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f13979e;

    /* renamed from: f, reason: collision with root package name */
    public long f13980f;

    public q(a aVar) {
        this.f13977c = aVar.c();
        this.f13978d = aVar.e();
    }

    public final void a() {
        A2.l.q("AudioStream has been released.", !this.f13976b.get());
    }

    @Override // Z.j
    public final m read(ByteBuffer byteBuffer) throws InterruptedException {
        a();
        A2.l.q("AudioStream has not been started.", this.f13975a.get());
        long jRemaining = byteBuffer.remaining();
        int i = this.f13977c;
        long jC = C5606d.C(i, jRemaining);
        long j4 = i;
        A2.l.k("bytesPerFrame must be greater than 0.", j4 > 0);
        int i10 = (int) (j4 * jC);
        if (i10 <= 0) {
            return new m(0, this.f13980f);
        }
        long jU = this.f13980f + C5606d.u(this.f13978d, jC);
        long jNanoTime = jU - System.nanoTime();
        if (jNanoTime > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(jNanoTime));
            } catch (InterruptedException e4) {
                S.h("SilentAudioStream", "Ignore interruption", e4);
            }
        }
        A2.l.q(null, i10 <= byteBuffer.remaining());
        byte[] bArr = this.f13979e;
        if (bArr == null || bArr.length < i10) {
            this.f13979e = new byte[i10];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put(this.f13979e, 0, i10).limit(iPosition + i10).position(iPosition);
        m mVar = new m(i10, this.f13980f);
        this.f13980f = jU;
        return mVar;
    }
}
