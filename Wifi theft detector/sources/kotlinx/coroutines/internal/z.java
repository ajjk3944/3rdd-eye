package kotlinx.coroutines.internal;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.g2;

/* loaded from: classes4.dex */
public abstract class z extends e implements g2 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22568d = AtomicIntegerFieldUpdater.newUpdater(z.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f22569c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public z(long j10, z zVar, int i10) {
        super(zVar);
        this.f22569c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // kotlinx.coroutines.internal.e
    public boolean j() {
        return f22568d.get(this) == q() && !k();
    }

    public final boolean o() {
        return f22568d.addAndGet(this, -65536) == q() && !k();
    }

    public abstract int q();

    public abstract void r(int i10, Throwable th, kotlin.coroutines.d dVar);

    public final void s() {
        if (f22568d.incrementAndGet(this) == q()) {
            m();
        }
    }

    public final boolean t() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22568d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == q() && !k()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, C.DEFAULT_BUFFER_SEGMENT_SIZE + i10));
        return true;
    }
}
