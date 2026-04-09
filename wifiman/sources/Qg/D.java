package qg;

import ig.AbstractC6152a;
import java.util.Iterator;
import java.util.Objects;
import yg.AbstractC8667b;
import yg.EnumC8669d;
import yg.EnumC8672g;
import zg.AbstractC8751d;

/* loaded from: classes4.dex */
public final class D extends gg.i {

    /* renamed from: b, reason: collision with root package name */
    final Iterable f58699b;

    static abstract class a extends AbstractC8667b {

        /* renamed from: a, reason: collision with root package name */
        Iterator f58700a;

        /* renamed from: b, reason: collision with root package name */
        volatile boolean f58701b;

        /* renamed from: c, reason: collision with root package name */
        boolean f58702c;

        a(Iterator it) {
            this.f58700a = it;
        }

        abstract void a();

        abstract void c(long j10);

        @Override // Dj.c
        public final void cancel() {
            this.f58701b = true;
        }

        @Override // Dg.g
        public final void clear() {
            this.f58700a = null;
        }

        @Override // Dg.g
        public final boolean isEmpty() {
            Iterator it = this.f58700a;
            if (it == null) {
                return true;
            }
            if (!this.f58702c || it.hasNext()) {
                return false;
            }
            clear();
            return true;
        }

        @Override // Dg.g
        public final Object poll() {
            Iterator it = this.f58700a;
            if (it == null) {
                return null;
            }
            if (!this.f58702c) {
                this.f58702c = true;
            } else if (!it.hasNext()) {
                return null;
            }
            Object next = this.f58700a.next();
            Objects.requireNonNull(next, "Iterator.next() returned a null value");
            return next;
        }

        @Override // Dj.c
        public final void request(long j10) {
            if (EnumC8672g.validate(j10) && AbstractC8751d.a(this, j10) == 0) {
                if (j10 == Long.MAX_VALUE) {
                    a();
                } else {
                    c(j10);
                }
            }
        }

        @Override // Dg.c
        public final int requestFusion(int i10) {
            return i10 & 1;
        }
    }

    static final class b extends a {

        /* renamed from: d, reason: collision with root package name */
        final Dg.a f58703d;

        b(Dg.a aVar, Iterator it) {
            super(it);
            this.f58703d = aVar;
        }

        @Override // qg.D.a
        void a() {
            Iterator it = this.f58700a;
            Dg.a aVar = this.f58703d;
            while (!this.f58701b) {
                try {
                    Object next = it.next();
                    if (this.f58701b) {
                        return;
                    }
                    if (next == null) {
                        aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    aVar.m(next);
                    if (this.f58701b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f58701b) {
                                return;
                            }
                            aVar.a();
                            return;
                        }
                    } catch (Throwable th2) {
                        AbstractC6152a.b(th2);
                        aVar.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    AbstractC6152a.b(th3);
                    aVar.onError(th3);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // qg.D.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void c(long r9) {
            /*
                r8 = this;
                java.util.Iterator r0 = r8.f58700a
                Dg.a r1 = r8.f58703d
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L53
                boolean r6 = r8.f58701b
                if (r6 == 0) goto L10
                return
            L10:
                java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L4b
                boolean r7 = r8.f58701b
                if (r7 == 0) goto L19
                return
            L19:
                if (r6 != 0) goto L26
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r10 = "Iterator.next() returned a null value"
                r9.<init>(r10)
                r1.onError(r9)
                return
            L26:
                boolean r6 = r1.m(r6)
                boolean r7 = r8.f58701b
                if (r7 == 0) goto L2f
                return
            L2f:
                boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L43
                if (r7 != 0) goto L3d
                boolean r9 = r8.f58701b
                if (r9 != 0) goto L3c
                r1.a()
            L3c:
                return
            L3d:
                if (r6 == 0) goto L7
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L43:
                r9 = move-exception
                ig.AbstractC6152a.b(r9)
                r1.onError(r9)
                return
            L4b:
                r9 = move-exception
                ig.AbstractC6152a.b(r9)
                r1.onError(r9)
                return
            L53:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.D.b.c(long):void");
        }
    }

    static final class c extends a {

        /* renamed from: d, reason: collision with root package name */
        final Dj.b f58704d;

        c(Dj.b bVar, Iterator it) {
            super(it);
            this.f58704d = bVar;
        }

        @Override // qg.D.a
        void a() {
            Iterator it = this.f58700a;
            Dj.b bVar = this.f58704d;
            while (!this.f58701b) {
                try {
                    Object next = it.next();
                    if (this.f58701b) {
                        return;
                    }
                    if (next == null) {
                        bVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    bVar.h(next);
                    if (this.f58701b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f58701b) {
                                return;
                            }
                            bVar.a();
                            return;
                        }
                    } catch (Throwable th2) {
                        AbstractC6152a.b(th2);
                        bVar.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    AbstractC6152a.b(th3);
                    bVar.onError(th3);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // qg.D.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void c(long r9) {
            /*
                r8 = this;
                java.util.Iterator r0 = r8.f58700a
                Dj.b r1 = r8.f58704d
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L50
                boolean r6 = r8.f58701b
                if (r6 == 0) goto L10
                return
            L10:
                java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L48
                boolean r7 = r8.f58701b
                if (r7 == 0) goto L19
                return
            L19:
                if (r6 != 0) goto L26
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r10 = "Iterator.next() returned a null value"
                r9.<init>(r10)
                r1.onError(r9)
                return
            L26:
                r1.h(r6)
                boolean r6 = r8.f58701b
                if (r6 == 0) goto L2e
                return
            L2e:
                boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
                if (r6 != 0) goto L3c
                boolean r9 = r8.f58701b
                if (r9 != 0) goto L3b
                r1.a()
            L3b:
                return
            L3c:
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L40:
                r9 = move-exception
                ig.AbstractC6152a.b(r9)
                r1.onError(r9)
                return
            L48:
                r9 = move-exception
                ig.AbstractC6152a.b(r9)
                r1.onError(r9)
                return
            L50:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.D.c.c(long):void");
        }
    }

    public D(Iterable iterable) {
        this.f58699b = iterable;
    }

    public static void h2(Dj.b bVar, Iterator it) {
        try {
            if (!it.hasNext()) {
                EnumC8669d.complete(bVar);
            } else if (bVar instanceof Dg.a) {
                bVar.j(new b((Dg.a) bVar, it));
            } else {
                bVar.j(new c(bVar, it));
            }
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            EnumC8669d.error(th2, bVar);
        }
    }

    @Override // gg.i
    public void E1(Dj.b bVar) {
        try {
            h2(bVar, this.f58699b.iterator());
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            EnumC8669d.error(th2, bVar);
        }
    }
}
