package cv;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class d extends h0 {

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f6696h;

    /* renamed from: i, reason: collision with root package name */
    public static final Condition f6697i;
    public static final long j;
    public static final long k;

    /* renamed from: l, reason: collision with root package name */
    public static d f6698l;

    /* renamed from: e, reason: collision with root package name */
    public int f6699e;

    /* renamed from: f, reason: collision with root package name */
    public d f6700f;

    /* renamed from: g, reason: collision with root package name */
    public long f6701g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f6696h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        br.l.d(conditionNewCondition, "newCondition(...)");
        f6697i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        j = millis;
        k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j7 = this.f6710c;
        boolean z10 = this.f6708a;
        if (j7 != 0 || z10) {
            ReentrantLock reentrantLock = f6696h;
            reentrantLock.lock();
            try {
                if (this.f6699e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f6699e = 1;
                sm.f.z(this, j7, z10);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f6696h;
        reentrantLock.lock();
        try {
            int i10 = this.f6699e;
            this.f6699e = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            d dVar = f6698l;
            while (dVar != null) {
                d dVar2 = dVar.f6700f;
                if (dVar2 == this) {
                    dVar.f6700f = this.f6700f;
                    this.f6700f = null;
                    return false;
                }
                dVar = dVar2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
