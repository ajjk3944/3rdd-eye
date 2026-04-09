package Li;

import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.KotlinNothingValueException;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes4.dex */
final class L implements J {

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f11864a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f11865b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N f11866c;

        /* renamed from: Li.L$a$a, reason: collision with other inner class name */
        static final class C0466a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.J f11867a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f11868b;

            /* renamed from: Li.L$a$a$a, reason: collision with other inner class name */
            static final class C0467a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f11869a;

                /* renamed from: c, reason: collision with root package name */
                int f11871c;

                C0467a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f11869a = obj;
                    this.f11871c |= PduHandle.NONE;
                    return C0466a.this.b(0, this);
                }
            }

            C0466a(kotlin.jvm.internal.J j10, InterfaceC3221h interfaceC3221h) {
                this.f11867a = j10;
                this.f11868b = interfaceC3221h;
            }

            @Override // Li.InterfaceC3221h
            public /* bridge */ /* synthetic */ Object a(Object obj, InterfaceC5380e interfaceC5380e) {
                return b(((Number) obj).intValue(), interfaceC5380e);
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object b(int r5, dh.InterfaceC5380e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Li.L.a.C0466a.C0467a
                    if (r0 == 0) goto L13
                    r0 = r6
                    Li.L$a$a$a r0 = (Li.L.a.C0466a.C0467a) r0
                    int r1 = r0.f11871c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f11871c = r1
                    goto L18
                L13:
                    Li.L$a$a$a r0 = new Li.L$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f11869a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f11871c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    Yg.v.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    Yg.v.b(r6)
                    if (r5 <= 0) goto L4e
                    kotlin.jvm.internal.J r5 = r4.f11867a
                    boolean r6 = r5.f51685a
                    if (r6 != 0) goto L4e
                    r5.f51685a = r3
                    Li.h r5 = r4.f11868b
                    Li.H r6 = Li.H.START
                    r0.f11871c = r3
                    java.lang.Object r5 = r5.a(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                L4e:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Li.L.a.C0466a.b(int, dh.e):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(N n10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f11866c = n10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f11866c, interfaceC5380e);
            aVar.f11865b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f11864a;
            if (i10 == 0) {
                Yg.v.b(obj);
                InterfaceC3221h interfaceC3221h = (InterfaceC3221h) this.f11865b;
                kotlin.jvm.internal.J j10 = new kotlin.jvm.internal.J();
                N n10 = this.f11866c;
                C0466a c0466a = new C0466a(j10, interfaceC3221h);
                this.f11864a = 1;
                if (n10.b(c0466a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            return ((a) create(interfaceC3221h, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    @Override // Li.J
    public InterfaceC3220g a(N n10) {
        return AbstractC3222i.A(new a(n10, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
