package Q0;

import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.mp.PduHandle;

/* renamed from: Q0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3430g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f19056a = a.b(null);

    /* renamed from: b, reason: collision with root package name */
    private final P0.b f19057b = new P0.b(16);

    /* renamed from: c, reason: collision with root package name */
    private final P0.c f19058c = new P0.c(0, 1, null);

    /* renamed from: d, reason: collision with root package name */
    private final T0.r f19059d = T0.q.a();

    /* renamed from: Q0.g$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f19060a;

        private /* synthetic */ a(Object obj) {
            this.f19060a = obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        public static Object b(Object obj) {
            return obj;
        }

        public static boolean c(Object obj, Object obj2) {
            return (obj2 instanceof a) && AbstractC6492s.d(obj, ((a) obj2).g());
        }

        public static int d(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static final boolean e(Object obj) {
            return obj == null;
        }

        public static String f(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return c(this.f19060a, obj);
        }

        public final /* synthetic */ Object g() {
            return this.f19060a;
        }

        public int hashCode() {
            return d(this.f19060a);
        }

        public String toString() {
            return f(this.f19060a);
        }
    }

    /* renamed from: Q0.g$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3433j f19061a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f19062b;

        public b(InterfaceC3433j interfaceC3433j, Object obj) {
            this.f19061a = interfaceC3433j;
            this.f19062b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f19061a, bVar.f19061a) && AbstractC6492s.d(this.f19062b, bVar.f19062b);
        }

        public int hashCode() {
            int iHashCode = this.f19061a.hashCode() * 31;
            Object obj = this.f19062b;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.f19061a + ", loaderKey=" + this.f19062b + ')';
        }
    }

    /* renamed from: Q0.g$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f19063a;

        /* renamed from: b, reason: collision with root package name */
        Object f19064b;

        /* renamed from: c, reason: collision with root package name */
        boolean f19065c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f19066d;

        /* renamed from: f, reason: collision with root package name */
        int f19068f;

        c(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19066d = obj;
            this.f19068f |= PduHandle.NONE;
            return C3430g.this.g(null, null, false, null, this);
        }
    }

    public static /* synthetic */ void f(C3430g c3430g, InterfaceC3433j interfaceC3433j, G g10, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        c3430g.e(interfaceC3433j, g10, obj, z10);
    }

    public final a d(InterfaceC3433j interfaceC3433j, G g10) {
        a aVar;
        b bVar = new b(interfaceC3433j, g10.c());
        synchronized (this.f19059d) {
            aVar = (a) this.f19057b.d(bVar);
            if (aVar == null) {
                aVar = (a) this.f19058c.b(bVar);
            }
        }
        return aVar;
    }

    public final void e(InterfaceC3433j interfaceC3433j, G g10, Object obj, boolean z10) {
        b bVar = new b(interfaceC3433j, g10.c());
        synchronized (this.f19059d) {
            try {
                if (obj == null) {
                } else if (z10) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(Q0.InterfaceC3433j r6, Q0.G r7, boolean r8, mh.InterfaceC6835l r9, dh.InterfaceC5380e r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof Q0.C3430g.c
            if (r0 == 0) goto L13
            r0 = r10
            Q0.g$c r0 = (Q0.C3430g.c) r0
            int r1 = r0.f19068f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19068f = r1
            goto L18
        L13:
            Q0.g$c r0 = new Q0.g$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f19066d
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f19068f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            boolean r8 = r0.f19065c
            java.lang.Object r6 = r0.f19064b
            Q0.g$b r6 = (Q0.C3430g.b) r6
            java.lang.Object r7 = r0.f19063a
            Q0.g r7 = (Q0.C3430g) r7
            Yg.v.b(r10)
            goto L7d
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            Yg.v.b(r10)
            Q0.g$b r10 = new Q0.g$b
            java.lang.Object r7 = r7.c()
            r10.<init>(r6, r7)
            T0.r r6 = r5.f19059d
            monitor-enter(r6)
            P0.b r7 = r5.f19057b     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r7.d(r10)     // Catch: java.lang.Throwable -> L5d
            Q0.g$a r7 = (Q0.C3430g.a) r7     // Catch: java.lang.Throwable -> L5d
            if (r7 != 0) goto L5f
            P0.c r7 = r5.f19058c     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r7.b(r10)     // Catch: java.lang.Throwable -> L5d
            Q0.g$a r7 = (Q0.C3430g.a) r7     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r7 = move-exception
            goto Lb3
        L5f:
            if (r7 == 0) goto L67
            java.lang.Object r7 = r7.g()     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r6)
            return r7
        L67:
            Yg.J r7 = Yg.J.f24997a     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r6)
            r0.f19063a = r5
            r0.f19064b = r10
            r0.f19065c = r8
            r0.f19068f = r3
            java.lang.Object r6 = r9.invoke(r0)
            if (r6 != r1) goto L79
            return r1
        L79:
            r7 = r5
            r4 = r10
            r10 = r6
            r6 = r4
        L7d:
            T0.r r9 = r7.f19059d
            monitor-enter(r9)
            if (r10 != 0) goto L90
            P0.c r8 = r7.f19058c     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r7 = r7.f19056a     // Catch: java.lang.Throwable -> L8e
            Q0.g$a r7 = Q0.C3430g.a.a(r7)     // Catch: java.lang.Throwable -> L8e
            r8.h(r6, r7)     // Catch: java.lang.Throwable -> L8e
            goto Lad
        L8e:
            r6 = move-exception
            goto Lb1
        L90:
            if (r8 == 0) goto La0
            P0.c r7 = r7.f19058c     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r8 = Q0.C3430g.a.b(r10)     // Catch: java.lang.Throwable -> L8e
            Q0.g$a r8 = Q0.C3430g.a.a(r8)     // Catch: java.lang.Throwable -> L8e
            r7.h(r6, r8)     // Catch: java.lang.Throwable -> L8e
            goto Lad
        La0:
            P0.b r7 = r7.f19057b     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r8 = Q0.C3430g.a.b(r10)     // Catch: java.lang.Throwable -> L8e
            Q0.g$a r8 = Q0.C3430g.a.a(r8)     // Catch: java.lang.Throwable -> L8e
            r7.e(r6, r8)     // Catch: java.lang.Throwable -> L8e
        Lad:
            Yg.J r6 = Yg.J.f24997a     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r9)
            return r10
        Lb1:
            monitor-exit(r9)
            throw r6
        Lb3:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C3430g.g(Q0.j, Q0.G, boolean, mh.l, dh.e):java.lang.Object");
    }
}
