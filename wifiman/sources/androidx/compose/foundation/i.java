package androidx.compose.foundation;

import E0.s0;
import Ii.AbstractC3063k;
import Ii.N;
import Yg.J;
import Yg.v;
import androidx.compose.ui.e;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import y.C8552g;
import y.C8553h;
import y.InterfaceC8558m;
import y0.AbstractC8596q;
import y0.C8593n;
import y0.EnumC8595p;

/* loaded from: classes.dex */
final class i extends e.c implements s0 {

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC8558m f28016n;

    /* renamed from: o, reason: collision with root package name */
    private C8552g f28017o;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f28018a;

        /* renamed from: b, reason: collision with root package name */
        Object f28019b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f28020c;

        /* renamed from: e, reason: collision with root package name */
        int f28022e;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28020c = obj;
            this.f28022e |= PduHandle.NONE;
            return i.this.F2(this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f28023a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f28024b;

        /* renamed from: d, reason: collision with root package name */
        int f28026d;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28024b = obj;
            this.f28026d |= PduHandle.NONE;
            return i.this.G2(this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f28027a;

        c(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return i.this.new c(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f28027a;
            if (i10 == 0) {
                v.b(obj);
                i iVar = i.this;
                this.f28027a = 1;
                if (iVar.F2(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f28029a;

        d(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return i.this.new d(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f28029a;
            if (i10 == 0) {
                v.b(obj);
                i iVar = i.this;
                this.f28029a = 1;
                if (iVar.G2(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public i(InterfaceC8558m interfaceC8558m) {
        this.f28016n = interfaceC8558m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object F2(dh.InterfaceC5380e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.i.a
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.i$a r0 = (androidx.compose.foundation.i.a) r0
            int r1 = r0.f28022e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28022e = r1
            goto L18
        L13:
            androidx.compose.foundation.i$a r0 = new androidx.compose.foundation.i$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f28020c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f28022e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f28019b
            y.g r1 = (y.C8552g) r1
            java.lang.Object r0 = r0.f28018a
            androidx.compose.foundation.i r0 = (androidx.compose.foundation.i) r0
            Yg.v.b(r5)
            goto L56
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            Yg.v.b(r5)
            y.g r5 = r4.f28017o
            if (r5 != 0) goto L58
            y.g r5 = new y.g
            r5.<init>()
            y.m r2 = r4.f28016n
            r0.f28018a = r4
            r0.f28019b = r5
            r0.f28022e = r3
            java.lang.Object r0 = r2.a(r5, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r4
            r1 = r5
        L56:
            r0.f28017o = r1
        L58:
            Yg.J r5 = Yg.J.f24997a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.i.F2(dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object G2(dh.InterfaceC5380e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.i.b
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.i$b r0 = (androidx.compose.foundation.i.b) r0
            int r1 = r0.f28026d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28026d = r1
            goto L18
        L13:
            androidx.compose.foundation.i$b r0 = new androidx.compose.foundation.i$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f28024b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f28026d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f28023a
            androidx.compose.foundation.i r0 = (androidx.compose.foundation.i) r0
            Yg.v.b(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            Yg.v.b(r5)
            y.g r5 = r4.f28017o
            if (r5 == 0) goto L52
            y.h r2 = new y.h
            r2.<init>(r5)
            y.m r5 = r4.f28016n
            r0.f28023a = r4
            r0.f28026d = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
        L4f:
            r5 = 0
            r0.f28017o = r5
        L52:
            Yg.J r5 = Yg.J.f24997a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.i.G2(dh.e):java.lang.Object");
    }

    private final void H2() {
        C8552g c8552g = this.f28017o;
        if (c8552g != null) {
            this.f28016n.c(new C8553h(c8552g));
            this.f28017o = null;
        }
    }

    @Override // E0.s0
    public void C0() {
        H2();
    }

    public final void I2(InterfaceC8558m interfaceC8558m) {
        if (AbstractC6492s.d(this.f28016n, interfaceC8558m)) {
            return;
        }
        H2();
        this.f28016n = interfaceC8558m;
    }

    @Override // androidx.compose.ui.e.c
    public void o2() {
        H2();
    }

    @Override // E0.s0
    public void s0(C8593n c8593n, EnumC8595p enumC8595p, long j10) {
        if (enumC8595p == EnumC8595p.Main) {
            int iF = c8593n.f();
            AbstractC8596q.a aVar = AbstractC8596q.f66307a;
            if (AbstractC8596q.i(iF, aVar.a())) {
                AbstractC3063k.d(d2(), null, null, new c(null), 3, null);
            } else if (AbstractC8596q.i(iF, aVar.b())) {
                AbstractC3063k.d(d2(), null, null, new d(null), 3, null);
            }
        }
    }
}
