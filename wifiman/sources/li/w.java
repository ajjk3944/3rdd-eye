package Li;

import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes4.dex */
abstract /* synthetic */ class w {

    public static final class a implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f12035a;

        /* renamed from: Li.w$a$a, reason: collision with other inner class name */
        public static final class C0473a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f12036a;

            /* renamed from: Li.w$a$a$a, reason: collision with other inner class name */
            public static final class C0474a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f12037a;

                /* renamed from: b, reason: collision with root package name */
                int f12038b;

                public C0474a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f12037a = obj;
                    this.f12038b |= PduHandle.NONE;
                    return C0473a.this.a(null, this);
                }
            }

            public C0473a(InterfaceC3221h interfaceC3221h) {
                this.f12036a = interfaceC3221h;
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
                    boolean r0 = r6 instanceof Li.w.a.C0473a.C0474a
                    if (r0 == 0) goto L13
                    r0 = r6
                    Li.w$a$a$a r0 = (Li.w.a.C0473a.C0474a) r0
                    int r1 = r0.f12038b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f12038b = r1
                    goto L18
                L13:
                    Li.w$a$a$a r0 = new Li.w$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f12037a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f12038b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    Yg.v.b(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    Yg.v.b(r6)
                    Li.h r6 = r4.f12036a
                    if (r5 == 0) goto L41
                    r0.f12038b = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Li.w.a.C0473a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public a(InterfaceC3220g interfaceC3220g) {
            this.f12035a = interfaceC3220g;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f12035a.b(new C0473a(interfaceC3221h), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : Yg.J.f24997a;
        }
    }

    public static final class b implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f12040a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f12041b;

        public static final class a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f12042a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f12043b;

            /* renamed from: Li.w$b$a$a, reason: collision with other inner class name */
            public static final class C0475a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f12044a;

                /* renamed from: b, reason: collision with root package name */
                int f12045b;

                /* renamed from: d, reason: collision with root package name */
                Object f12047d;

                /* renamed from: e, reason: collision with root package name */
                Object f12048e;

                public C0475a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f12044a = obj;
                    this.f12045b |= PduHandle.NONE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC3221h interfaceC3221h, InterfaceC6839p interfaceC6839p) {
                this.f12042a = interfaceC3221h;
                this.f12043b = interfaceC6839p;
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
                    boolean r0 = r7 instanceof Li.w.b.a.C0475a
                    if (r0 == 0) goto L13
                    r0 = r7
                    Li.w$b$a$a r0 = (Li.w.b.a.C0475a) r0
                    int r1 = r0.f12045b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f12045b = r1
                    goto L18
                L13:
                    Li.w$b$a$a r0 = new Li.w$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f12044a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f12045b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    Yg.v.b(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f12048e
                    Li.h r6 = (Li.InterfaceC3221h) r6
                    java.lang.Object r2 = r0.f12047d
                    Yg.v.b(r7)
                    goto L5c
                L3e:
                    Yg.v.b(r7)
                    Li.h r7 = r5.f12042a
                    mh.p r2 = r5.f12043b
                    r0.f12047d = r6
                    r0.f12048e = r7
                    r0.f12045b = r4
                    r4 = 6
                    kotlin.jvm.internal.AbstractC6491q.a(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.AbstractC6491q.a(r4)
                    if (r2 != r1) goto L5a
                    return r1
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.f12047d = r7
                    r0.f12048e = r7
                    r0.f12045b = r3
                    java.lang.Object r6 = r6.a(r2, r0)
                    if (r6 != r1) goto L6a
                    return r1
                L6a:
                    Yg.J r6 = Yg.J.f24997a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: Li.w.b.a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public b(InterfaceC3220g interfaceC3220g, InterfaceC6839p interfaceC6839p) {
            this.f12040a = interfaceC3220g;
            this.f12041b = interfaceC6839p;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f12040a.b(new a(interfaceC3221h, this.f12041b), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : Yg.J.f24997a;
        }
    }

    public static final InterfaceC3220g a(InterfaceC3220g interfaceC3220g) {
        return new a(interfaceC3220g);
    }

    public static final InterfaceC3220g b(InterfaceC3220g interfaceC3220g, InterfaceC6839p interfaceC6839p) {
        return new b(interfaceC3220g, interfaceC6839p);
    }
}
