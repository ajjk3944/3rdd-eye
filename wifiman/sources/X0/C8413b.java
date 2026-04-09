package x0;

import Ii.N;
import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import mh.InterfaceC6824a;
import org.snmp4j.mp.PduHandle;

/* renamed from: x0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8413b {

    /* renamed from: a, reason: collision with root package name */
    private C8414c f65297a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC6824a f65298b = new a();

    /* renamed from: c, reason: collision with root package name */
    private N f65299c;

    /* renamed from: x0.b$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N invoke() {
            return C8413b.this.h();
        }
    }

    /* renamed from: x0.b$b, reason: collision with other inner class name */
    static final class C2306b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f65301a;

        /* renamed from: c, reason: collision with root package name */
        int f65303c;

        C2306b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f65301a = obj;
            this.f65303c |= PduHandle.NONE;
            return C8413b.this.a(0L, 0L, this);
        }
    }

    /* renamed from: x0.b$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f65304a;

        /* renamed from: c, reason: collision with root package name */
        int f65306c;

        c(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f65304a = obj;
            this.f65306c |= PduHandle.NONE;
            return C8413b.this.c(0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r8, long r10, dh.InterfaceC5380e r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof x0.C8413b.C2306b
            if (r0 == 0) goto L14
            r0 = r12
            x0.b$b r0 = (x0.C8413b.C2306b) r0
            int r1 = r0.f65303c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f65303c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            x0.b$b r0 = new x0.b$b
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f65301a
            java.lang.Object r0 = eh.AbstractC5467b.g()
            int r1 = r6.f65303c
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            Yg.v.b(r12)
            goto L47
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            Yg.v.b(r12)
            x0.a r1 = r7.g()
            if (r1 == 0) goto L4e
            r6.f65303c = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.g1(r2, r4, r6)
            if (r12 != r0) goto L47
            return r0
        L47:
            Y0.y r12 = (Y0.y) r12
            long r8 = r12.o()
            goto L54
        L4e:
            Y0.y$a r8 = Y0.y.f24558b
            long r8 = r8.a()
        L54:
            Y0.y r8 = Y0.y.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C8413b.a(long, long, dh.e):java.lang.Object");
    }

    public final long b(long j10, long j11, int i10) {
        InterfaceC8412a interfaceC8412aG = g();
        return interfaceC8412aG != null ? interfaceC8412aG.L1(j10, j11, i10) : C6531g.f52335b.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r5, dh.InterfaceC5380e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof x0.C8413b.c
            if (r0 == 0) goto L13
            r0 = r7
            x0.b$c r0 = (x0.C8413b.c) r0
            int r1 = r0.f65306c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65306c = r1
            goto L18
        L13:
            x0.b$c r0 = new x0.b$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f65304a
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f65306c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Yg.v.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Yg.v.b(r7)
            x0.a r7 = r4.g()
            if (r7 == 0) goto L4a
            r0.f65306c = r3
            java.lang.Object r7 = r7.R(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            Y0.y r7 = (Y0.y) r7
            long r5 = r7.o()
            goto L50
        L4a:
            Y0.y$a r5 = Y0.y.f24558b
            long r5 = r5.a()
        L50:
            Y0.y r5 = Y0.y.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C8413b.c(long, dh.e):java.lang.Object");
    }

    public final long d(long j10, int i10) {
        InterfaceC8412a interfaceC8412aG = g();
        return interfaceC8412aG != null ? interfaceC8412aG.V0(j10, i10) : C6531g.f52335b.c();
    }

    public final N e() {
        N n10 = (N) this.f65298b.invoke();
        if (n10 != null) {
            return n10;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final C8414c f() {
        return this.f65297a;
    }

    public final InterfaceC8412a g() {
        C8414c c8414c = this.f65297a;
        if (c8414c != null) {
            return c8414c.G2();
        }
        return null;
    }

    public final N h() {
        return this.f65299c;
    }

    public final void i(InterfaceC6824a interfaceC6824a) {
        this.f65298b = interfaceC6824a;
    }

    public final void j(C8414c c8414c) {
        this.f65297a = c8414c;
    }

    public final void k(N n10) {
        this.f65299c = n10;
    }
}
