package Li;

import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* renamed from: Li.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract /* synthetic */ class AbstractC3231s {

    /* renamed from: Li.s$a */
    public static final class a implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f11962a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11963b;

        public a(InterfaceC3220g interfaceC3220g, int i10) {
            this.f11962a = interfaceC3220g;
            this.f11963b = i10;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f11962a.b(new b(new kotlin.jvm.internal.L(), this.f11963b, interfaceC3221h), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : Yg.J.f24997a;
        }
    }

    /* renamed from: Li.s$b */
    static final class b implements InterfaceC3221h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.L f11964a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11965b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3221h f11966c;

        /* renamed from: Li.s$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f11967a;

            /* renamed from: c, reason: collision with root package name */
            int f11969c;

            a(InterfaceC5380e interfaceC5380e) {
                super(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f11967a = obj;
                this.f11969c |= PduHandle.NONE;
                return b.this.a(null, this);
            }
        }

        b(kotlin.jvm.internal.L l10, int i10, InterfaceC3221h interfaceC3221h) {
            this.f11964a = l10;
            this.f11965b = i10;
            this.f11966c = interfaceC3221h;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Li.InterfaceC3221h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(java.lang.Object r6, dh.InterfaceC5380e r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof Li.AbstractC3231s.b.a
                if (r0 == 0) goto L13
                r0 = r7
                Li.s$b$a r0 = (Li.AbstractC3231s.b.a) r0
                int r1 = r0.f11969c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f11969c = r1
                goto L18
            L13:
                Li.s$b$a r0 = new Li.s$b$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f11967a
                java.lang.Object r1 = eh.AbstractC5467b.g()
                int r2 = r0.f11969c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Yg.v.b(r7)
                goto L47
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                Yg.v.b(r7)
                kotlin.jvm.internal.L r7 = r5.f11964a
                int r2 = r7.f51687a
                int r4 = r5.f11965b
                if (r2 < r4) goto L4a
                Li.h r7 = r5.f11966c
                r0.f11969c = r3
                java.lang.Object r6 = r7.a(r6, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                Yg.J r6 = Yg.J.f24997a
                return r6
            L4a:
                int r2 = r2 + r3
                r7.f51687a = r2
                Yg.J r6 = Yg.J.f24997a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Li.AbstractC3231s.b.a(java.lang.Object, dh.e):java.lang.Object");
        }
    }

    /* renamed from: Li.s$c */
    public static final class c implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f11970a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f11971b;

        public c(InterfaceC3220g interfaceC3220g, InterfaceC6839p interfaceC6839p) {
            this.f11970a = interfaceC3220g;
            this.f11971b = interfaceC6839p;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f11970a.b(new d(new kotlin.jvm.internal.J(), interfaceC3221h, this.f11971b), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : Yg.J.f24997a;
        }
    }

    /* renamed from: Li.s$d */
    static final class d implements InterfaceC3221h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f11972a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3221h f11973b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f11974c;

        /* renamed from: Li.s$d$a */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f11975a;

            /* renamed from: b, reason: collision with root package name */
            Object f11976b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f11977c;

            /* renamed from: e, reason: collision with root package name */
            int f11979e;

            a(InterfaceC5380e interfaceC5380e) {
                super(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f11977c = obj;
                this.f11979e |= PduHandle.NONE;
                return d.this.a(null, this);
            }
        }

        d(kotlin.jvm.internal.J j10, InterfaceC3221h interfaceC3221h, InterfaceC6839p interfaceC6839p) {
            this.f11972a = j10;
            this.f11973b = interfaceC3221h;
            this.f11974c = interfaceC6839p;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Li.InterfaceC3221h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(java.lang.Object r7, dh.InterfaceC5380e r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof Li.AbstractC3231s.d.a
                if (r0 == 0) goto L13
                r0 = r8
                Li.s$d$a r0 = (Li.AbstractC3231s.d.a) r0
                int r1 = r0.f11979e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f11979e = r1
                goto L18
            L13:
                Li.s$d$a r0 = new Li.s$d$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f11977c
                java.lang.Object r1 = eh.AbstractC5467b.g()
                int r2 = r0.f11979e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                Yg.v.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f11976b
                java.lang.Object r2 = r0.f11975a
                Li.s$d r2 = (Li.AbstractC3231s.d) r2
                Yg.v.b(r8)
                goto L6c
            L41:
                Yg.v.b(r8)
                goto L59
            L45:
                Yg.v.b(r8)
                kotlin.jvm.internal.J r8 = r6.f11972a
                boolean r8 = r8.f51685a
                if (r8 == 0) goto L5c
                Li.h r8 = r6.f11973b
                r0.f11979e = r5
                java.lang.Object r7 = r8.a(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                Yg.J r7 = Yg.J.f24997a
                return r7
            L5c:
                mh.p r8 = r6.f11974c
                r0.f11975a = r6
                r0.f11976b = r7
                r0.f11979e = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.J r8 = r2.f11972a
                r8.f51685a = r5
                Li.h r8 = r2.f11973b
                r2 = 0
                r0.f11975a = r2
                r0.f11976b = r2
                r0.f11979e = r3
                java.lang.Object r7 = r8.a(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                Yg.J r7 = Yg.J.f24997a
                return r7
            L8b:
                Yg.J r7 = Yg.J.f24997a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Li.AbstractC3231s.d.a(java.lang.Object, dh.e):java.lang.Object");
        }
    }

    /* renamed from: Li.s$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f11980a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11981b;

        /* renamed from: c, reason: collision with root package name */
        int f11982c;

        e(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11981b = obj;
            this.f11982c |= PduHandle.NONE;
            return AbstractC3231s.d(null, null, null, this);
        }
    }

    /* renamed from: Li.s$f */
    public static final class f implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f11983a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11984b;

        /* renamed from: Li.s$f$a */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f11985a;

            /* renamed from: b, reason: collision with root package name */
            int f11986b;

            /* renamed from: d, reason: collision with root package name */
            Object f11988d;

            public a(InterfaceC5380e interfaceC5380e) {
                super(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f11985a = obj;
                this.f11986b |= PduHandle.NONE;
                return f.this.b(null, this);
            }
        }

        public f(InterfaceC3220g interfaceC3220g, int i10) {
            this.f11983a = interfaceC3220g;
            this.f11984b = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Li.InterfaceC3220g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object b(Li.InterfaceC3221h r9, dh.InterfaceC5380e r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof Li.AbstractC3231s.f.a
                if (r0 == 0) goto L13
                r0 = r10
                Li.s$f$a r0 = (Li.AbstractC3231s.f.a) r0
                int r1 = r0.f11986b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f11986b = r1
                goto L18
            L13:
                Li.s$f$a r0 = new Li.s$f$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f11985a
                java.lang.Object r1 = eh.AbstractC5467b.g()
                int r2 = r0.f11986b
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r9 = r0.f11988d
                Yg.v.b(r10)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
                goto L5d
            L2b:
                r10 = move-exception
                goto L5a
            L2d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L35:
                Yg.v.b(r10)
                java.lang.Object r10 = new java.lang.Object
                r10.<init>()
                kotlin.jvm.internal.L r2 = new kotlin.jvm.internal.L
                r2.<init>()
                Li.g r4 = r8.f11983a     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
                Li.s$g r5 = new Li.s$g     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
                int r6 = r8.f11984b     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
                r5.<init>(r2, r6, r9, r10)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
                r0.f11988d = r10     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
                r0.f11986b = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
                java.lang.Object r9 = r4.b(r5, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
                if (r9 != r1) goto L5d
                return r1
            L56:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L5a:
                Mi.n.a(r10, r9)
            L5d:
                Yg.J r9 = Yg.J.f24997a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: Li.AbstractC3231s.f.b(Li.h, dh.e):java.lang.Object");
        }
    }

    /* renamed from: Li.s$g */
    static final class g implements InterfaceC3221h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.L f11989a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11990b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3221h f11991c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f11992d;

        /* renamed from: Li.s$g$a */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f11993a;

            /* renamed from: c, reason: collision with root package name */
            int f11995c;

            a(InterfaceC5380e interfaceC5380e) {
                super(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f11993a = obj;
                this.f11995c |= PduHandle.NONE;
                return g.this.a(null, this);
            }
        }

        g(kotlin.jvm.internal.L l10, int i10, InterfaceC3221h interfaceC3221h, Object obj) {
            this.f11989a = l10;
            this.f11990b = i10;
            this.f11991c = interfaceC3221h;
            this.f11992d = obj;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Li.InterfaceC3221h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(java.lang.Object r6, dh.InterfaceC5380e r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof Li.AbstractC3231s.g.a
                if (r0 == 0) goto L13
                r0 = r7
                Li.s$g$a r0 = (Li.AbstractC3231s.g.a) r0
                int r1 = r0.f11995c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f11995c = r1
                goto L18
            L13:
                Li.s$g$a r0 = new Li.s$g$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f11993a
                java.lang.Object r1 = eh.AbstractC5467b.g()
                int r2 = r0.f11995c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                Yg.v.b(r7)
                goto L61
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                Yg.v.b(r7)
                goto L51
            L38:
                Yg.v.b(r7)
                kotlin.jvm.internal.L r7 = r5.f11989a
                int r2 = r7.f51687a
                int r2 = r2 + r4
                r7.f51687a = r2
                int r7 = r5.f11990b
                if (r2 >= r7) goto L54
                Li.h r7 = r5.f11991c
                r0.f11995c = r4
                java.lang.Object r6 = r7.a(r6, r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                Yg.J r6 = Yg.J.f24997a
                return r6
            L54:
                Li.h r7 = r5.f11991c
                java.lang.Object r2 = r5.f11992d
                r0.f11995c = r3
                java.lang.Object r6 = Li.AbstractC3231s.a(r7, r6, r2, r0)
                if (r6 != r1) goto L61
                return r1
            L61:
                Yg.J r6 = Yg.J.f24997a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Li.AbstractC3231s.g.a(java.lang.Object, dh.e):java.lang.Object");
        }
    }

    public static final InterfaceC3220g b(InterfaceC3220g interfaceC3220g, int i10) {
        if (i10 >= 0) {
            return new a(interfaceC3220g, i10);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i10).toString());
    }

    public static final InterfaceC3220g c(InterfaceC3220g interfaceC3220g, InterfaceC6839p interfaceC6839p) {
        return new c(interfaceC3220g, interfaceC6839p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(Li.InterfaceC3221h r4, java.lang.Object r5, java.lang.Object r6, dh.InterfaceC5380e r7) {
        /*
            boolean r0 = r7 instanceof Li.AbstractC3231s.e
            if (r0 == 0) goto L13
            r0 = r7
            Li.s$e r0 = (Li.AbstractC3231s.e) r0
            int r1 = r0.f11982c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11982c = r1
            goto L18
        L13:
            Li.s$e r0 = new Li.s$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f11981b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f11982c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r6 = r0.f11980a
            Yg.v.b(r7)
            goto L41
        L33:
            Yg.v.b(r7)
            r0.f11980a = r6
            r0.f11982c = r3
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 != r1) goto L41
            return r1
        L41:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Li.AbstractC3231s.d(Li.h, java.lang.Object, java.lang.Object, dh.e):java.lang.Object");
    }

    public static final InterfaceC3220g e(InterfaceC3220g interfaceC3220g, int i10) {
        if (i10 > 0) {
            return new f(interfaceC3220g, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }
}
