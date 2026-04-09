package hm;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class b extends y {

    /* renamed from: h, reason: collision with root package name */
    public static final t7.m f25162h;

    /* renamed from: i, reason: collision with root package name */
    public static b f25163i;
    public static final ReentrantLock j;

    /* renamed from: k, reason: collision with root package name */
    public static final Condition f25164k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f25165l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f25166m;

    /* renamed from: e, reason: collision with root package name */
    public int f25167e;

    /* renamed from: f, reason: collision with root package name */
    public int f25168f = -1;
    public long g;

    static {
        t7.m mVar = new t7.m((char) 0, 12);
        mVar.f34474c = new b[8];
        f25162h = mVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        nk.k.d(conditionNewCondition, "newCondition(...)");
        f25164k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f25165l = millis;
        f25166m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j8 = this.f25220c;
        boolean z3 = this.f25218a;
        if (j8 != 0 || z3) {
            ReentrantLock reentrantLock = j;
            reentrantLock.lock();
            try {
                if (this.f25167e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f25167e = 1;
                ec.x.e(this);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = j;
        reentrantLock.lock();
        try {
            int i4 = this.f25167e;
            this.f25167e = 0;
            if (i4 != 1) {
                return i4 == 2;
            }
            f25162h.u(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException j(IOException iOException) {
        throw null;
    }

    public void k() {
    }
}
