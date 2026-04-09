package x;

import Ii.N;
import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.K;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import r.AbstractC7515B;
import r.AbstractC7537l;
import r.C7536k;
import r.InterfaceC7533i;
import r.InterfaceC7550z;
import w.InterfaceC8236C;
import w.v;

/* renamed from: x.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8406g implements InterfaceC8236C {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8408i f65251a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7550z f65252b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7533i f65253c;

    /* renamed from: d, reason: collision with root package name */
    private f0.g f65254d = androidx.compose.foundation.gestures.d.e();

    /* renamed from: x.g$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f65255a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f65256b;

        /* renamed from: d, reason: collision with root package name */
        int f65258d;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f65256b = obj;
            this.f65258d |= PduHandle.NONE;
            return C8406g.this.i(null, 0.0f, null, this);
        }
    }

    /* renamed from: x.g$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f65259a;

        /* renamed from: b, reason: collision with root package name */
        int f65260b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f65262d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f65263e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ v f65264f;

        /* renamed from: x.g$b$a */
        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ K f65265a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f65266b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(K k10, InterfaceC6835l interfaceC6835l) {
                super(1);
                this.f65265a = k10;
                this.f65266b = interfaceC6835l;
            }

            public final void a(float f10) {
                K k10 = this.f65265a;
                float f11 = k10.f51686a - f10;
                k10.f51686a = f11;
                this.f65266b.invoke(Float.valueOf(f11));
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).floatValue());
                return J.f24997a;
            }
        }

        /* renamed from: x.g$b$b, reason: collision with other inner class name */
        static final class C2305b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ K f65267a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f65268b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2305b(K k10, InterfaceC6835l interfaceC6835l) {
                super(1);
                this.f65267a = k10;
                this.f65268b = interfaceC6835l;
            }

            public final void a(float f10) {
                K k10 = this.f65267a;
                float f11 = k10.f51686a - f10;
                k10.f51686a = f11;
                this.f65268b.invoke(Float.valueOf(f11));
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).floatValue());
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, InterfaceC6835l interfaceC6835l, v vVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f65262d = f10;
            this.f65263e = interfaceC6835l;
            this.f65264f = vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return C8406g.this.new b(this.f65262d, this.f65263e, this.f65264f, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            K k10;
            Object objG = AbstractC5467b.g();
            int i10 = this.f65260b;
            if (i10 == 0) {
                Yg.v.b(obj);
                float fA = C8406g.this.f65251a.a(this.f65262d, AbstractC7515B.a(C8406g.this.f65252b, 0.0f, this.f65262d));
                if (Float.isNaN(fA)) {
                    throw new IllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
                }
                k10 = new K();
                float fAbs = Math.abs(fA) * Math.signum(this.f65262d);
                k10.f51686a = fAbs;
                this.f65263e.invoke(kotlin.coroutines.jvm.internal.b.c(fAbs));
                C8406g c8406g = C8406g.this;
                v vVar = this.f65264f;
                float f10 = k10.f51686a;
                float f11 = this.f65262d;
                C2305b c2305b = new C2305b(k10, this.f65263e);
                this.f65259a = k10;
                this.f65260b = 1;
                obj = c8406g.l(vVar, f10, f11, c2305b, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        Yg.v.b(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10 = (K) this.f65259a;
                Yg.v.b(obj);
            }
            C7536k c7536k = (C7536k) obj;
            float fB = C8406g.this.f65251a.b(((Number) c7536k.p()).floatValue());
            if (Float.isNaN(fB)) {
                throw new IllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
            }
            k10.f51686a = fB;
            v vVar2 = this.f65264f;
            C7536k c7536kG = AbstractC7537l.g(c7536k, 0.0f, 0.0f, 0L, 0L, false, 30, null);
            InterfaceC7533i interfaceC7533i = C8406g.this.f65253c;
            a aVar = new a(k10, this.f65263e);
            this.f65259a = null;
            this.f65260b = 2;
            obj = AbstractC8407h.h(vVar2, fB, fB, c7536kG, interfaceC7533i, aVar, this);
            return obj == objG ? objG : obj;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* renamed from: x.g$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f65269a;

        /* renamed from: c, reason: collision with root package name */
        int f65271c;

        c(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f65269a = obj;
            this.f65271c |= PduHandle.NONE;
            return C8406g.this.c(null, 0.0f, null, this);
        }
    }

    /* renamed from: x.g$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f65272a;

        /* renamed from: c, reason: collision with root package name */
        int f65274c;

        d(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f65272a = obj;
            this.f65274c |= PduHandle.NONE;
            return C8406g.this.l(null, 0.0f, 0.0f, null, this);
        }
    }

    public C8406g(InterfaceC8408i interfaceC8408i, InterfaceC7550z interfaceC7550z, InterfaceC7533i interfaceC7533i) {
        this.f65251a = interfaceC8408i;
        this.f65252b = interfaceC7550z;
        this.f65253c = interfaceC7533i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(w.v r11, float r12, mh.InterfaceC6835l r13, dh.InterfaceC5380e r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof x.C8406g.a
            if (r0 == 0) goto L13
            r0 = r14
            x.g$a r0 = (x.C8406g.a) r0
            int r1 = r0.f65258d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65258d = r1
            goto L18
        L13:
            x.g$a r0 = new x.g$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f65256b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f65258d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r11 = r0.f65255a
            r13 = r11
            mh.l r13 = (mh.InterfaceC6835l) r13
            Yg.v.b(r14)
            goto L51
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            Yg.v.b(r14)
            f0.g r14 = r10.f65254d
            x.g$b r2 = new x.g$b
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r12
            r7 = r13
            r8 = r11
            r4.<init>(r6, r7, r8, r9)
            r0.f65255a = r13
            r0.f65258d = r3
            java.lang.Object r14 = Ii.AbstractC3059i.g(r14, r2, r0)
            if (r14 != r1) goto L51
            return r1
        L51:
            x.a r14 = (x.C8400a) r14
            r11 = 0
            java.lang.Float r11 = kotlin.coroutines.jvm.internal.b.c(r11)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C8406g.i(w.v, float, mh.l, dh.e):java.lang.Object");
    }

    private final boolean j(float f10, float f11) {
        return Math.abs(AbstractC7515B.a(this.f65252b, 0.0f, f11)) >= Math.abs(f10);
    }

    private final Object k(v vVar, float f10, float f11, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        return AbstractC8407h.i(vVar, f10, f11, j(f10, f11) ? new C8402c(this.f65252b) : new C8411l(this.f65253c), interfaceC6835l, interfaceC5380e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(w.v r19, float r20, float r21, mh.InterfaceC6835l r22, dh.InterfaceC5380e r23) {
        /*
            r18 = this;
            r0 = r23
            boolean r1 = r0 instanceof x.C8406g.d
            if (r1 == 0) goto L18
            r1 = r0
            x.g$d r1 = (x.C8406g.d) r1
            int r2 = r1.f65274c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f65274c = r2
            r8 = r18
        L16:
            r7 = r1
            goto L20
        L18:
            x.g$d r1 = new x.g$d
            r8 = r18
            r1.<init>(r0)
            goto L16
        L20:
            java.lang.Object r0 = r7.f65272a
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r7.f65274c
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            Yg.v.b(r0)
            goto L73
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            Yg.v.b(r0)
            float r0 = java.lang.Math.abs(r20)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L46
            goto L4e
        L46:
            float r0 = java.lang.Math.abs(r21)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L60
        L4e:
            r16 = 28
            r17 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r9 = r20
            r10 = r21
            r.k r0 = r.AbstractC7537l.c(r9, r10, r11, r13, r15, r16, r17)
            goto L79
        L60:
            r7.f65274c = r3
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            java.lang.Object r0 = r2.k(r3, r4, r5, r6, r7)
            if (r0 != r1) goto L73
            return r1
        L73:
            x.a r0 = (x.C8400a) r0
            r.k r0 = r0.c()
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C8406g.l(w.v, float, float, mh.l, dh.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // w.InterfaceC8236C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(w.v r5, float r6, mh.InterfaceC6835l r7, dh.InterfaceC5380e r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof x.C8406g.c
            if (r0 == 0) goto L13
            r0 = r8
            x.g$c r0 = (x.C8406g.c) r0
            int r1 = r0.f65271c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65271c = r1
            goto L18
        L13:
            x.g$c r0 = new x.g$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f65269a
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f65271c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Yg.v.b(r8)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Yg.v.b(r8)
            r0.f65271c = r3
            java.lang.Object r8 = r4.i(r5, r6, r7, r0)
            if (r8 != r1) goto L3d
            return r1
        L3d:
            x.a r8 = (x.C8400a) r8
            java.lang.Object r5 = r8.a()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            r.k r6 = r8.b()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L53
            goto L5d
        L53:
            java.lang.Object r5 = r6.p()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L5d:
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.c(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C8406g.c(w.v, float, mh.l, dh.e):java.lang.Object");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8406g)) {
            return false;
        }
        C8406g c8406g = (C8406g) obj;
        return AbstractC6492s.d(c8406g.f65253c, this.f65253c) && AbstractC6492s.d(c8406g.f65252b, this.f65252b) && AbstractC6492s.d(c8406g.f65251a, this.f65251a);
    }

    public int hashCode() {
        return (((this.f65253c.hashCode() * 31) + this.f65252b.hashCode()) * 31) + this.f65251a.hashCode();
    }
}
