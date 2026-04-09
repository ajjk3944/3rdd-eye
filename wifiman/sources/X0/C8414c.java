package x0;

import E0.A0;
import E0.B0;
import Ii.N;
import androidx.compose.ui.e;
import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import mh.InterfaceC6824a;
import org.snmp4j.mp.PduHandle;

/* renamed from: x0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8414c extends e.c implements A0, InterfaceC8412a {

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC8412a f65307n;

    /* renamed from: o, reason: collision with root package name */
    private C8413b f65308o;

    /* renamed from: p, reason: collision with root package name */
    private final Object f65309p;

    /* renamed from: x0.c$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f65310a;

        /* renamed from: b, reason: collision with root package name */
        long f65311b;

        /* renamed from: c, reason: collision with root package name */
        long f65312c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f65313d;

        /* renamed from: f, reason: collision with root package name */
        int f65315f;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f65313d = obj;
            this.f65315f |= PduHandle.NONE;
            return C8414c.this.g1(0L, 0L, this);
        }
    }

    /* renamed from: x0.c$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f65316a;

        /* renamed from: b, reason: collision with root package name */
        long f65317b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f65318c;

        /* renamed from: e, reason: collision with root package name */
        int f65320e;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f65318c = obj;
            this.f65320e |= PduHandle.NONE;
            return C8414c.this.R(0L, this);
        }
    }

    /* renamed from: x0.c$c, reason: collision with other inner class name */
    static final class C2307c extends AbstractC6494u implements InterfaceC6824a {
        C2307c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N invoke() {
            return C8414c.this.E2();
        }
    }

    public C8414c(InterfaceC8412a interfaceC8412a, C8413b c8413b) {
        this.f65307n = interfaceC8412a;
        this.f65308o = c8413b == null ? new C8413b() : c8413b;
        this.f65309p = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N E2() {
        N nH;
        C8414c c8414cG2 = G2();
        if ((c8414cG2 == null || (nH = c8414cG2.E2()) == null) && (nH = this.f65308o.h()) == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return nH;
    }

    private final InterfaceC8412a F2() {
        if (k2()) {
            return G2();
        }
        return null;
    }

    private final void H2() {
        if (this.f65308o.f() == this) {
            this.f65308o.j(null);
        }
    }

    private final void I2(C8413b c8413b) {
        H2();
        if (c8413b == null) {
            this.f65308o = new C8413b();
        } else if (!AbstractC6492s.d(c8413b, this.f65308o)) {
            this.f65308o = c8413b;
        }
        if (k2()) {
            J2();
        }
    }

    private final void J2() {
        this.f65308o.j(this);
        this.f65308o.i(new C2307c());
        this.f65308o.k(d2());
    }

    public final C8414c G2() {
        if (k2()) {
            return (C8414c) B0.b(this);
        }
        return null;
    }

    public final void K2(InterfaceC8412a interfaceC8412a, C8413b c8413b) {
        this.f65307n = interfaceC8412a;
        I2(c8413b);
    }

    @Override // x0.InterfaceC8412a
    public long L1(long j10, long j11, int i10) {
        long jL1 = this.f65307n.L1(j10, j11, i10);
        InterfaceC8412a interfaceC8412aF2 = F2();
        return C6531g.r(jL1, interfaceC8412aF2 != null ? interfaceC8412aF2.L1(C6531g.r(j10, jL1), C6531g.q(j11, jL1), i10) : C6531g.f52335b.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // x0.InterfaceC8412a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object R(long r9, dh.InterfaceC5380e r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof x0.C8414c.b
            if (r0 == 0) goto L13
            r0 = r11
            x0.c$b r0 = (x0.C8414c.b) r0
            int r1 = r0.f65320e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65320e = r1
            goto L18
        L13:
            x0.c$b r0 = new x0.c$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f65318c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f65320e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r9 = r0.f65317b
            Yg.v.b(r11)
            goto L7d
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            long r9 = r0.f65317b
            java.lang.Object r2 = r0.f65316a
            x0.c r2 = (x0.C8414c) r2
            Yg.v.b(r11)
            goto L57
        L40:
            Yg.v.b(r11)
            x0.a r11 = r8.F2()
            if (r11 == 0) goto L61
            r0.f65316a = r8
            r0.f65317b = r9
            r0.f65320e = r4
            java.lang.Object r11 = r11.R(r9, r0)
            if (r11 != r1) goto L56
            return r1
        L56:
            r2 = r8
        L57:
            Y0.y r11 = (Y0.y) r11
            long r4 = r11.o()
        L5d:
            r6 = r9
            r9 = r4
            r4 = r6
            goto L69
        L61:
            Y0.y$a r11 = Y0.y.f24558b
            long r4 = r11.a()
            r2 = r8
            goto L5d
        L69:
            x0.a r11 = r2.f65307n
            long r4 = Y0.y.k(r4, r9)
            r2 = 0
            r0.f65316a = r2
            r0.f65317b = r9
            r0.f65320e = r3
            java.lang.Object r11 = r11.R(r4, r0)
            if (r11 != r1) goto L7d
            return r1
        L7d:
            Y0.y r11 = (Y0.y) r11
            long r0 = r11.o()
            long r9 = Y0.y.l(r9, r0)
            Y0.y r9 = Y0.y.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C8414c.R(long, dh.e):java.lang.Object");
    }

    @Override // x0.InterfaceC8412a
    public long V0(long j10, int i10) {
        InterfaceC8412a interfaceC8412aF2 = F2();
        long jV0 = interfaceC8412aF2 != null ? interfaceC8412aF2.V0(j10, i10) : C6531g.f52335b.c();
        return C6531g.r(jV0, this.f65307n.V0(C6531g.q(j10, jV0), i10));
    }

    @Override // E0.A0
    public Object W() {
        return this.f65309p;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // x0.InterfaceC8412a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g1(long r16, long r18, dh.InterfaceC5380e r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof x0.C8414c.a
            if (r2 == 0) goto L16
            r2 = r1
            x0.c$a r2 = (x0.C8414c.a) r2
            int r3 = r2.f65315f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f65315f = r3
            goto L1b
        L16:
            x0.c$a r2 = new x0.c$a
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.f65313d
            java.lang.Object r9 = eh.AbstractC5467b.g()
            int r3 = r2.f65315f
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L47
            if (r3 == r4) goto L39
            if (r3 != r10) goto L31
            long r2 = r2.f65311b
            Yg.v.b(r1)
            goto L8c
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            long r3 = r2.f65312c
            long r5 = r2.f65311b
            java.lang.Object r7 = r2.f65310a
            x0.c r7 = (x0.C8414c) r7
            Yg.v.b(r1)
            r13 = r3
            r11 = r5
            goto L65
        L47:
            Yg.v.b(r1)
            x0.a r3 = r0.f65307n
            r2.f65310a = r0
            r11 = r16
            r2.f65311b = r11
            r13 = r18
            r2.f65312c = r13
            r2.f65315f = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.g1(r4, r6, r8)
            if (r1 != r9) goto L64
            return r9
        L64:
            r7 = r0
        L65:
            Y0.y r1 = (Y0.y) r1
            long r4 = r1.o()
            x0.a r3 = r7.F2()
            if (r3 == 0) goto L94
            long r6 = Y0.y.l(r11, r4)
            long r11 = Y0.y.k(r13, r4)
            r1 = 0
            r2.f65310a = r1
            r2.f65311b = r4
            r2.f65315f = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.g1(r4, r6, r8)
            if (r1 != r9) goto L8b
            return r9
        L8b:
            r2 = r13
        L8c:
            Y0.y r1 = (Y0.y) r1
            long r4 = r1.o()
            r13 = r2
            goto L9b
        L94:
            r13 = r4
            Y0.y$a r1 = Y0.y.f24558b
            long r4 = r1.a()
        L9b:
            long r1 = Y0.y.l(r13, r4)
            Y0.y r1 = Y0.y.b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C8414c.g1(long, long, dh.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.e.c
    public void n2() {
        J2();
    }

    @Override // androidx.compose.ui.e.c
    public void o2() {
        H2();
    }
}
