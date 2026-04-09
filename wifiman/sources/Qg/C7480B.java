package qg;

import java.util.Objects;
import yg.AbstractC8667b;
import yg.EnumC8672g;
import zg.AbstractC8751d;

/* renamed from: qg.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7480B extends gg.i {

    /* renamed from: b, reason: collision with root package name */
    final Object[] f58691b;

    /* renamed from: qg.B$a */
    static final class a extends c {

        /* renamed from: d, reason: collision with root package name */
        final Dg.a f58692d;

        a(Dg.a aVar, Object[] objArr) {
            super(objArr);
            this.f58692d = aVar;
        }

        @Override // qg.C7480B.c
        void a() {
            Object[] objArr = this.f58694a;
            int length = objArr.length;
            Dg.a aVar = this.f58692d;
            for (int i10 = this.f58695b; i10 != length; i10++) {
                if (this.f58696c) {
                    return;
                }
                Object obj = objArr[i10];
                if (obj == null) {
                    aVar.onError(new NullPointerException("The element at index " + i10 + " is null"));
                    return;
                }
                aVar.m(obj);
            }
            if (this.f58696c) {
                return;
            }
            aVar.a();
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        
            r10.f58695b = r2;
            r11 = addAndGet(-r6);
         */
        @Override // qg.C7480B.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void c(long r11) {
            /*
                r10 = this;
                java.lang.Object[] r0 = r10.f58694a
                int r1 = r0.length
                int r2 = r10.f58695b
                Dg.a r3 = r10.f58692d
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 == 0) goto L44
                if (r2 == r1) goto L44
                boolean r8 = r10.f58696c
                if (r8 == 0) goto L15
                return
            L15:
                r8 = r0[r2]
                if (r8 != 0) goto L38
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r0 = "The element at index "
                r12.append(r0)
                r12.append(r2)
                java.lang.String r0 = " is null"
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                r11.<init>(r12)
                r3.onError(r11)
                return
            L38:
                boolean r8 = r3.m(r8)
                if (r8 == 0) goto L41
                r8 = 1
                long r6 = r6 + r8
            L41:
                int r2 = r2 + 1
                goto La
            L44:
                if (r2 != r1) goto L4e
                boolean r11 = r10.f58696c
                if (r11 != 0) goto L4d
                r3.a()
            L4d:
                return
            L4e:
                long r11 = r10.get()
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 != 0) goto La
                r10.f58695b = r2
                long r11 = -r6
                long r11 = r10.addAndGet(r11)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.C7480B.a.c(long):void");
        }
    }

    /* renamed from: qg.B$b */
    static final class b extends c {

        /* renamed from: d, reason: collision with root package name */
        final Dj.b f58693d;

        b(Dj.b bVar, Object[] objArr) {
            super(objArr);
            this.f58693d = bVar;
        }

        @Override // qg.C7480B.c
        void a() {
            Object[] objArr = this.f58694a;
            int length = objArr.length;
            Dj.b bVar = this.f58693d;
            for (int i10 = this.f58695b; i10 != length; i10++) {
                if (this.f58696c) {
                    return;
                }
                Object obj = objArr[i10];
                if (obj == null) {
                    bVar.onError(new NullPointerException("The element at index " + i10 + " is null"));
                    return;
                }
                bVar.h(obj);
            }
            if (this.f58696c) {
                return;
            }
            bVar.a();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        
            r10.f58695b = r2;
            r11 = addAndGet(-r6);
         */
        @Override // qg.C7480B.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void c(long r11) {
            /*
                r10 = this;
                java.lang.Object[] r0 = r10.f58694a
                int r1 = r0.length
                int r2 = r10.f58695b
                Dj.b r3 = r10.f58693d
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 == 0) goto L41
                if (r2 == r1) goto L41
                boolean r8 = r10.f58696c
                if (r8 == 0) goto L15
                return
            L15:
                r8 = r0[r2]
                if (r8 != 0) goto L38
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r0 = "The element at index "
                r12.append(r0)
                r12.append(r2)
                java.lang.String r0 = " is null"
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                r11.<init>(r12)
                r3.onError(r11)
                return
            L38:
                r3.h(r8)
                r8 = 1
                long r6 = r6 + r8
                int r2 = r2 + 1
                goto La
            L41:
                if (r2 != r1) goto L4b
                boolean r11 = r10.f58696c
                if (r11 != 0) goto L4a
                r3.a()
            L4a:
                return
            L4b:
                long r11 = r10.get()
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 != 0) goto La
                r10.f58695b = r2
                long r11 = -r6
                long r11 = r10.addAndGet(r11)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.C7480B.b.c(long):void");
        }
    }

    /* renamed from: qg.B$c */
    static abstract class c extends AbstractC8667b {

        /* renamed from: a, reason: collision with root package name */
        final Object[] f58694a;

        /* renamed from: b, reason: collision with root package name */
        int f58695b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f58696c;

        c(Object[] objArr) {
            this.f58694a = objArr;
        }

        abstract void a();

        abstract void c(long j10);

        @Override // Dj.c
        public final void cancel() {
            this.f58696c = true;
        }

        @Override // Dg.g
        public final void clear() {
            this.f58695b = this.f58694a.length;
        }

        @Override // Dg.g
        public final boolean isEmpty() {
            return this.f58695b == this.f58694a.length;
        }

        @Override // Dg.g
        public final Object poll() {
            int i10 = this.f58695b;
            Object[] objArr = this.f58694a;
            if (i10 == objArr.length) {
                return null;
            }
            this.f58695b = i10 + 1;
            Object obj = objArr[i10];
            Objects.requireNonNull(obj, "array element is null");
            return obj;
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

    public C7480B(Object[] objArr) {
        this.f58691b = objArr;
    }

    @Override // gg.i
    public void E1(Dj.b bVar) {
        if (bVar instanceof Dg.a) {
            bVar.j(new a((Dg.a) bVar, this.f58691b));
        } else {
            bVar.j(new b(bVar, this.f58691b));
        }
    }
}
