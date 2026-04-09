package Z;

import C.S;
import Z.j;
import android.annotation.SuppressLint;
import g0.C4356c;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import t4.C5606d;

/* compiled from: BufferedAudioStream.java */
/* loaded from: classes.dex */
public final class p implements j {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f13960a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f13961b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentLinkedQueue f13962c = new ConcurrentLinkedQueue();

    /* renamed from: d, reason: collision with root package name */
    public final H.g f13963d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f13964e;

    /* renamed from: f, reason: collision with root package name */
    public a f13965f;

    /* renamed from: g, reason: collision with root package name */
    public final k f13966g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13967h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f13968j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f13969k;

    /* renamed from: l, reason: collision with root package name */
    public int f13970l;

    /* compiled from: BufferedAudioStream.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f13971a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13972b;

        /* renamed from: c, reason: collision with root package name */
        public final ByteBuffer f13973c;

        /* renamed from: d, reason: collision with root package name */
        public long f13974d;

        public a(ByteBuffer byteBuffer, j.b bVar, int i, int i10) {
            byteBuffer.rewind();
            int iLimit = byteBuffer.limit() - byteBuffer.position();
            if (iLimit != bVar.a()) {
                StringBuilder sbJ = C4356c.j(iLimit, "Byte buffer size is not match with packet info: ", " != ");
                sbJ.append(bVar.a());
                throw new IllegalStateException(sbJ.toString());
            }
            this.f13971a = i;
            this.f13972b = i10;
            this.f13973c = byteBuffer;
            this.f13974d = bVar.b();
        }

        public final m a(ByteBuffer byteBuffer) {
            int iRemaining;
            long j4 = this.f13974d;
            ByteBuffer byteBuffer2 = this.f13973c;
            int iPosition = byteBuffer2.position();
            int iPosition2 = byteBuffer.position();
            if (byteBuffer2.remaining() > byteBuffer.remaining()) {
                iRemaining = byteBuffer.remaining();
                this.f13974d += C5606d.u(this.f13972b, C5606d.C(this.f13971a, iRemaining));
                ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
                byteBufferDuplicate.position(iPosition).limit(iPosition + iRemaining);
                byteBuffer.put(byteBufferDuplicate).limit(iPosition2 + iRemaining).position(iPosition2);
            } else {
                iRemaining = byteBuffer2.remaining();
                byteBuffer.put(byteBuffer2).limit(iPosition2 + iRemaining).position(iPosition2);
            }
            byteBuffer2.position(iPosition + iRemaining);
            return new m(iRemaining, j4);
        }
    }

    public p(k kVar, Z.a aVar) {
        H.a aVar2;
        if (H.a.f1943c != null) {
            aVar2 = H.a.f1943c;
        } else {
            synchronized (H.a.class) {
                try {
                    if (H.a.f1943c == null) {
                        H.a.f1943c = new H.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            aVar2 = H.a.f1943c;
        }
        this.f13963d = new H.g(aVar2);
        this.f13964e = new Object();
        this.f13965f = null;
        this.f13969k = new AtomicBoolean(false);
        this.f13966g = kVar;
        int iC = aVar.c();
        this.f13967h = iC;
        int iE = aVar.e();
        this.i = iE;
        A2.l.k("mBytesPerFrame must be greater than 0.", ((long) iC) > 0);
        A2.l.k("mSampleRate must be greater than 0.", ((long) iE) > 0);
        this.f13968j = 500;
        this.f13970l = iC * 1024;
    }

    public final void a() {
        A2.l.q("AudioStream has been released.", !this.f13961b.get());
    }

    public final void b() {
        if (this.f13969k.get()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f13970l);
            a aVar = new a(byteBufferAllocateDirect, this.f13966g.read(byteBufferAllocateDirect), this.f13967h, this.i);
            int i = this.f13968j;
            synchronized (this.f13964e) {
                try {
                    this.f13962c.offer(aVar);
                    while (this.f13962c.size() > i) {
                        this.f13962c.poll();
                        S.g("BufferedAudioStream", "Drop audio data due to full of queue.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f13969k.get()) {
                this.f13963d.execute(new C2.h(this, 11));
            }
        }
    }

    public final void c() throws IllegalStateException, j.a {
        a();
        AtomicBoolean atomicBoolean = this.f13960a;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new B.b(this, 10), null);
        this.f13963d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e4) {
            atomicBoolean.set(false);
            throw new j.a(e4);
        }
    }

    @Override // Z.j
    @SuppressLint({"BanThreadSleep"})
    public final m read(ByteBuffer byteBuffer) throws InterruptedException {
        boolean z10;
        a();
        A2.l.q("AudioStream has not been started.", this.f13960a.get());
        final int iRemaining = byteBuffer.remaining();
        this.f13963d.execute(new Runnable() { // from class: Z.o
            @Override // java.lang.Runnable
            public final void run() {
                p pVar = this.f13958b;
                int i = pVar.f13970l;
                int i10 = iRemaining;
                if (i == i10) {
                    return;
                }
                int i11 = pVar.f13967h;
                pVar.f13970l = (i10 / i11) * i11;
                StringBuilder sbJ = C4356c.j(i, "Update buffer size from ", " to ");
                sbJ.append(pVar.f13970l);
                S.a("BufferedAudioStream", sbJ.toString());
            }
        });
        m mVar = new m(0, 0L);
        do {
            synchronized (this.f13964e) {
                try {
                    a aVar = this.f13965f;
                    this.f13965f = null;
                    if (aVar == null) {
                        aVar = (a) this.f13962c.poll();
                    }
                    if (aVar != null) {
                        mVar = aVar.a(byteBuffer);
                        if (aVar.f13973c.remaining() > 0) {
                            this.f13965f = aVar;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z10 = mVar.f13954a <= 0 && this.f13960a.get() && !this.f13961b.get();
            if (z10) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e4) {
                    S.h("BufferedAudioStream", "Interruption while waiting for audio data", e4);
                }
            }
        } while (z10);
        return mVar;
    }
}
