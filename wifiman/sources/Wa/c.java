package Wa;

import Ii.N;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Wa.d;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import mh.q;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
public abstract class c {

    public static final class a implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f23747a;

        /* renamed from: Wa.c$a$a, reason: collision with other inner class name */
        public static final class C0885a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f23748a;

            /* renamed from: Wa.c$a$a$a, reason: collision with other inner class name */
            public static final class C0886a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f23749a;

                /* renamed from: b, reason: collision with root package name */
                int f23750b;

                public C0886a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f23749a = obj;
                    this.f23750b |= PduHandle.NONE;
                    return C0885a.this.a(null, this);
                }
            }

            public C0885a(InterfaceC3221h interfaceC3221h) {
                this.f23748a = interfaceC3221h;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Li.InterfaceC3221h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r5, dh.InterfaceC5380e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Wa.c.a.C0885a.C0886a
                    if (r0 == 0) goto L13
                    r0 = r6
                    Wa.c$a$a$a r0 = (Wa.c.a.C0885a.C0886a) r0
                    int r1 = r0.f23750b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f23750b = r1
                    goto L18
                L13:
                    Wa.c$a$a$a r0 = new Wa.c$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f23749a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f23750b
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L29
                    Yg.v.b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L32:
                    Yg.v.b(r6)
                    Li.h r6 = r4.f23748a
                    Wa.d$a r2 = new Wa.d$a
                    r2.<init>(r5)
                    r0.f23750b = r3
                    java.lang.Object r5 = r6.a(r2, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Wa.c.a.C0885a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public a(InterfaceC3220g interfaceC3220g) {
            this.f23747a = interfaceC3220g;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f23747a.b(new C0885a(interfaceC3221h), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : J.f24997a;
        }
    }

    public static final class b implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f23752a;

        public static final class a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f23753a;

            /* renamed from: Wa.c$b$a$a, reason: collision with other inner class name */
            public static final class C0887a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f23754a;

                /* renamed from: b, reason: collision with root package name */
                int f23755b;

                public C0887a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f23754a = obj;
                    this.f23755b |= PduHandle.NONE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC3221h interfaceC3221h) {
                this.f23753a = interfaceC3221h;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Li.InterfaceC3221h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r5, dh.InterfaceC5380e r6) throws java.lang.Throwable {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Wa.c.b.a.C0887a
                    if (r0 == 0) goto L13
                    r0 = r6
                    Wa.c$b$a$a r0 = (Wa.c.b.a.C0887a) r0
                    int r1 = r0.f23755b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f23755b = r1
                    goto L18
                L13:
                    Wa.c$b$a$a r0 = new Wa.c$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f23754a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f23755b
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L29
                    Yg.v.b(r6)
                    goto L4c
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L32:
                    Yg.v.b(r6)
                    Li.h r6 = r4.f23753a
                    Wa.d r5 = (Wa.d) r5
                    boolean r2 = r5 instanceof Wa.d.a
                    if (r2 == 0) goto L4f
                    Wa.d$a r5 = (Wa.d.a) r5
                    java.lang.Object r5 = r5.a()
                    r0.f23755b = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                L4f:
                    boolean r6 = r5 instanceof Wa.d.b
                    if (r6 == 0) goto L5a
                    Wa.d$b r5 = (Wa.d.b) r5
                    java.lang.Throwable r5 = r5.a()
                    throw r5
                L5a:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Wa.c.b.a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public b(InterfaceC3220g interfaceC3220g) {
            this.f23752a = interfaceC3220g;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f23752a.b(new a(interfaceC3221h), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : J.f24997a;
        }
    }

    /* renamed from: Wa.c$c, reason: collision with other inner class name */
    static final class C0888c extends kotlin.coroutines.jvm.internal.l implements q {

        /* renamed from: a, reason: collision with root package name */
        int f23757a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f23758b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f23759c;

        C0888c(InterfaceC5380e interfaceC5380e) {
            super(3, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f23757a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC3221h interfaceC3221h = (InterfaceC3221h) this.f23758b;
                d.b bVar = new d.b((Throwable) this.f23759c);
                this.f23758b = null;
                this.f23757a = 1;
                if (interfaceC3221h.a(bVar, this) == objG) {
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

        @Override // mh.q
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object s(InterfaceC3221h interfaceC3221h, Throwable th2, InterfaceC5380e interfaceC5380e) {
            C0888c c0888c = new C0888c(interfaceC5380e);
            c0888c.f23758b = interfaceC3221h;
            c0888c.f23759c = th2;
            return c0888c.invokeSuspend(J.f24997a);
        }
    }

    public static final InterfaceC3220g a(InterfaceC3220g interfaceC3220g, N scope, Li.J started, int i10) {
        AbstractC6492s.i(interfaceC3220g, "<this>");
        AbstractC6492s.i(scope, "scope");
        AbstractC6492s.i(started, "started");
        return new b(AbstractC3222i.K(AbstractC3222i.f(new a(interfaceC3220g), new C0888c(null)), scope, started, i10));
    }

    public static /* synthetic */ InterfaceC3220g b(InterfaceC3220g interfaceC3220g, N n10, Li.J j10, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return a(interfaceC3220g, n10, j10, i10);
    }
}
