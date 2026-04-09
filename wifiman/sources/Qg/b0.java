package qg;

import yg.AbstractC8667b;
import yg.EnumC8672g;
import zg.AbstractC8751d;

/* loaded from: classes4.dex */
public final class b0 extends gg.i {

    /* renamed from: b, reason: collision with root package name */
    final int f58858b;

    /* renamed from: c, reason: collision with root package name */
    final int f58859c;

    static abstract class a extends AbstractC8667b {

        /* renamed from: a, reason: collision with root package name */
        final int f58860a;

        /* renamed from: b, reason: collision with root package name */
        int f58861b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f58862c;

        a(int i10, int i11) {
            this.f58861b = i10;
            this.f58860a = i11;
        }

        abstract void a();

        @Override // Dg.g
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer poll() {
            int i10 = this.f58861b;
            if (i10 == this.f58860a) {
                return null;
            }
            this.f58861b = i10 + 1;
            return Integer.valueOf(i10);
        }

        @Override // Dj.c
        public final void cancel() {
            this.f58862c = true;
        }

        @Override // Dg.g
        public final void clear() {
            this.f58861b = this.f58860a;
        }

        abstract void d(long j10);

        @Override // Dg.g
        public final boolean isEmpty() {
            return this.f58861b == this.f58860a;
        }

        @Override // Dj.c
        public final void request(long j10) {
            if (EnumC8672g.validate(j10) && AbstractC8751d.a(this, j10) == 0) {
                if (j10 == Long.MAX_VALUE) {
                    a();
                } else {
                    d(j10);
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
        final Dg.a f58863d;

        b(Dg.a aVar, int i10, int i11) {
            super(i10, i11);
            this.f58863d = aVar;
        }

        @Override // qg.b0.a
        void a() {
            int i10 = this.f58860a;
            Dg.a aVar = this.f58863d;
            for (int i11 = this.f58861b; i11 != i10; i11++) {
                if (this.f58862c) {
                    return;
                }
                aVar.m(Integer.valueOf(i11));
            }
            if (this.f58862c) {
                return;
            }
            aVar.a();
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
        
            r9.f58861b = r1;
            r10 = addAndGet(-r5);
         */
        @Override // qg.b0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void d(long r10) {
            /*
                r9 = this;
                int r0 = r9.f58860a
                int r1 = r9.f58861b
                Dg.a r2 = r9.f58863d
                r3 = 0
            L8:
                r5 = r3
            L9:
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 == 0) goto L24
                if (r1 == r0) goto L24
                boolean r7 = r9.f58862c
                if (r7 == 0) goto L14
                return
            L14:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
                boolean r7 = r2.m(r7)
                if (r7 == 0) goto L21
                r7 = 1
                long r5 = r5 + r7
            L21:
                int r1 = r1 + 1
                goto L9
            L24:
                if (r1 != r0) goto L2e
                boolean r10 = r9.f58862c
                if (r10 != 0) goto L2d
                r2.a()
            L2d:
                return
            L2e:
                long r10 = r9.get()
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 != 0) goto L9
                r9.f58861b = r1
                long r10 = -r5
                long r10 = r9.addAndGet(r10)
                int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r5 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.b0.b.d(long):void");
        }
    }

    static final class c extends a {

        /* renamed from: d, reason: collision with root package name */
        final Dj.b f58864d;

        c(Dj.b bVar, int i10, int i11) {
            super(i10, i11);
            this.f58864d = bVar;
        }

        @Override // qg.b0.a
        void a() {
            int i10 = this.f58860a;
            Dj.b bVar = this.f58864d;
            for (int i11 = this.f58861b; i11 != i10; i11++) {
                if (this.f58862c) {
                    return;
                }
                bVar.h(Integer.valueOf(i11));
            }
            if (this.f58862c) {
                return;
            }
            bVar.a();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
        
            r9.f58861b = r1;
            r10 = addAndGet(-r5);
         */
        @Override // qg.b0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void d(long r10) {
            /*
                r9 = this;
                int r0 = r9.f58860a
                int r1 = r9.f58861b
                Dj.b r2 = r9.f58864d
                r3 = 0
            L8:
                r5 = r3
            L9:
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 == 0) goto L21
                if (r1 == r0) goto L21
                boolean r7 = r9.f58862c
                if (r7 == 0) goto L14
                return
            L14:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
                r2.h(r7)
                r7 = 1
                long r5 = r5 + r7
                int r1 = r1 + 1
                goto L9
            L21:
                if (r1 != r0) goto L2b
                boolean r10 = r9.f58862c
                if (r10 != 0) goto L2a
                r2.a()
            L2a:
                return
            L2b:
                long r10 = r9.get()
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 != 0) goto L9
                r9.f58861b = r1
                long r10 = -r5
                long r10 = r9.addAndGet(r10)
                int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r5 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.b0.c.d(long):void");
        }
    }

    public b0(int i10, int i11) {
        this.f58858b = i10;
        this.f58859c = i10 + i11;
    }

    @Override // gg.i
    public void E1(Dj.b bVar) {
        if (bVar instanceof Dg.a) {
            bVar.j(new b((Dg.a) bVar, this.f58858b, this.f58859c));
        } else {
            bVar.j(new c(bVar, this.f58858b, this.f58859c));
        }
    }
}
