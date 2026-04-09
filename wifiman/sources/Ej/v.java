package ej;

import Yg.J;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final long f46504a;

    /* renamed from: b, reason: collision with root package name */
    private final C5481e f46505b = new C5481e();

    /* renamed from: c, reason: collision with root package name */
    private boolean f46506c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f46507d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f46508e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC5474B f46509f;

    /* renamed from: g, reason: collision with root package name */
    private final ReentrantLock f46510g;

    /* renamed from: h, reason: collision with root package name */
    private final Condition f46511h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC5474B f46512i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC5476D f46513j;

    public static final class a implements InterfaceC5474B {

        /* renamed from: a, reason: collision with root package name */
        private final E f46514a = new E();

        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
        
            r1 = Yg.J.f24997a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
        
            r0.unlock();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
        
            if (r2 == null) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        
            r0 = r12.f46515b;
            r1 = r2.c();
            r0 = r0.k().c();
            r3 = r1.i();
            r5 = ej.E.f46436e.a(r0.i(), r1.i());
            r7 = java.util.concurrent.TimeUnit.NANOSECONDS;
            r1.h(r5, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
        
            if (r1.f() == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
        
            r5 = r1.d();
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
        
            if (r0.f() == false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
        
            r1.e(java.lang.Math.min(r1.d(), r0.d()));
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
        
            r2.Z(r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00c6, code lost:
        
            r1.h(r3, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
        
            if (r0.f() == false) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00cf, code lost:
        
            r1.e(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d3, code lost:
        
            r13 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00d4, code lost:
        
            r1.h(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00dd, code lost:
        
            if (r0.f() != false) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00df, code lost:
        
            r1.e(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00e2, code lost:
        
            throw r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00e7, code lost:
        
            if (r0.f() == false) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00e9, code lost:
        
            r1.e(r0.d());
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f0, code lost:
        
            r2.Z(r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00f3, code lost:
        
            r1.h(r3, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00fa, code lost:
        
            if (r0.f() == false) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00fc, code lost:
        
            r1.b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0100, code lost:
        
            r13 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0101, code lost:
        
            r1.h(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x010a, code lost:
        
            if (r0.f() != false) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x010c, code lost:
        
            r1.b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x010f, code lost:
        
            throw r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0110, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
        
            return;
         */
        @Override // ej.InterfaceC5474B
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void Z(ej.C5481e r13, long r14) {
            /*
                Method dump skipped, instructions count: 291
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ej.v.a.Z(ej.e, long):void");
        }

        @Override // ej.InterfaceC5474B
        public E c() {
            return this.f46514a;
        }

        @Override // ej.InterfaceC5474B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLock reentrantLockE = v.this.e();
            v vVar = v.this;
            reentrantLockE.lock();
            try {
                if (vVar.g()) {
                    reentrantLockE.unlock();
                    return;
                }
                InterfaceC5474B interfaceC5474BD = vVar.d();
                if (interfaceC5474BD == null) {
                    if (vVar.h() && vVar.a().D0() > 0) {
                        throw new IOException("source is closed");
                    }
                    vVar.i(true);
                    vVar.c().signalAll();
                    interfaceC5474BD = null;
                }
                J j10 = J.f24997a;
                reentrantLockE.unlock();
                if (interfaceC5474BD != null) {
                    v vVar2 = v.this;
                    E eC = interfaceC5474BD.c();
                    E eC2 = vVar2.k().c();
                    long jI = eC.i();
                    long jA = E.f46436e.a(eC2.i(), eC.i());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    eC.h(jA, timeUnit);
                    if (!eC.f()) {
                        if (eC2.f()) {
                            eC.e(eC2.d());
                        }
                        try {
                            interfaceC5474BD.close();
                            eC.h(jI, timeUnit);
                            if (eC2.f()) {
                                eC.b();
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            eC.h(jI, TimeUnit.NANOSECONDS);
                            if (eC2.f()) {
                                eC.b();
                            }
                            throw th2;
                        }
                    }
                    long jD = eC.d();
                    if (eC2.f()) {
                        eC.e(Math.min(eC.d(), eC2.d()));
                    }
                    try {
                        interfaceC5474BD.close();
                        eC.h(jI, timeUnit);
                        if (eC2.f()) {
                            eC.e(jD);
                        }
                    } catch (Throwable th3) {
                        eC.h(jI, TimeUnit.NANOSECONDS);
                        if (eC2.f()) {
                            eC.e(jD);
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                reentrantLockE.unlock();
                throw th4;
            }
        }

        @Override // ej.InterfaceC5474B, java.io.Flushable
        public void flush() {
            ReentrantLock reentrantLockE = v.this.e();
            v vVar = v.this;
            reentrantLockE.lock();
            try {
                if (vVar.g()) {
                    throw new IllegalStateException("closed");
                }
                if (vVar.b()) {
                    throw new IOException("canceled");
                }
                InterfaceC5474B interfaceC5474BD = vVar.d();
                if (interfaceC5474BD == null) {
                    if (vVar.h() && vVar.a().D0() > 0) {
                        throw new IOException("source is closed");
                    }
                    interfaceC5474BD = null;
                }
                J j10 = J.f24997a;
                reentrantLockE.unlock();
                if (interfaceC5474BD != null) {
                    v vVar2 = v.this;
                    E eC = interfaceC5474BD.c();
                    E eC2 = vVar2.k().c();
                    long jI = eC.i();
                    long jA = E.f46436e.a(eC2.i(), eC.i());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    eC.h(jA, timeUnit);
                    if (!eC.f()) {
                        if (eC2.f()) {
                            eC.e(eC2.d());
                        }
                        try {
                            interfaceC5474BD.flush();
                            eC.h(jI, timeUnit);
                            if (eC2.f()) {
                                eC.b();
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            eC.h(jI, TimeUnit.NANOSECONDS);
                            if (eC2.f()) {
                                eC.b();
                            }
                            throw th2;
                        }
                    }
                    long jD = eC.d();
                    if (eC2.f()) {
                        eC.e(Math.min(eC.d(), eC2.d()));
                    }
                    try {
                        interfaceC5474BD.flush();
                        eC.h(jI, timeUnit);
                        if (eC2.f()) {
                            eC.e(jD);
                        }
                    } catch (Throwable th3) {
                        eC.h(jI, TimeUnit.NANOSECONDS);
                        if (eC2.f()) {
                            eC.e(jD);
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                reentrantLockE.unlock();
                throw th4;
            }
        }
    }

    public static final class b implements InterfaceC5476D {

        /* renamed from: a, reason: collision with root package name */
        private final E f46516a = new E();

        b() {
        }

        @Override // ej.InterfaceC5476D
        public long U(C5481e sink, long j10) {
            AbstractC6492s.i(sink, "sink");
            ReentrantLock reentrantLockE = v.this.e();
            v vVar = v.this;
            reentrantLockE.lock();
            try {
                if (vVar.h()) {
                    throw new IllegalStateException("closed");
                }
                if (vVar.b()) {
                    throw new IOException("canceled");
                }
                while (vVar.a().D0() == 0) {
                    if (vVar.g()) {
                        reentrantLockE.unlock();
                        return -1L;
                    }
                    this.f46516a.a(vVar.c());
                    if (vVar.b()) {
                        throw new IOException("canceled");
                    }
                }
                long jU = vVar.a().U(sink, j10);
                vVar.c().signalAll();
                reentrantLockE.unlock();
                return jU;
            } catch (Throwable th2) {
                reentrantLockE.unlock();
                throw th2;
            }
        }

        @Override // ej.InterfaceC5476D
        public E c() {
            return this.f46516a;
        }

        @Override // ej.InterfaceC5476D, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLock reentrantLockE = v.this.e();
            v vVar = v.this;
            reentrantLockE.lock();
            try {
                vVar.j(true);
                vVar.c().signalAll();
                J j10 = J.f24997a;
            } finally {
                reentrantLockE.unlock();
            }
        }
    }

    public v(long j10) {
        this.f46504a = j10;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f46510g = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        AbstractC6492s.h(conditionNewCondition, "newCondition(...)");
        this.f46511h = conditionNewCondition;
        if (j10 >= 1) {
            this.f46512i = new a();
            this.f46513j = new b();
        } else {
            throw new IllegalArgumentException(("maxBufferSize < 1: " + j10).toString());
        }
    }

    public final C5481e a() {
        return this.f46505b;
    }

    public final boolean b() {
        return this.f46506c;
    }

    public final Condition c() {
        return this.f46511h;
    }

    public final InterfaceC5474B d() {
        return this.f46509f;
    }

    public final ReentrantLock e() {
        return this.f46510g;
    }

    public final long f() {
        return this.f46504a;
    }

    public final boolean g() {
        return this.f46507d;
    }

    public final boolean h() {
        return this.f46508e;
    }

    public final void i(boolean z10) {
        this.f46507d = z10;
    }

    public final void j(boolean z10) {
        this.f46508e = z10;
    }

    public final InterfaceC5474B k() {
        return this.f46512i;
    }

    public final InterfaceC5476D l() {
        return this.f46513j;
    }
}
