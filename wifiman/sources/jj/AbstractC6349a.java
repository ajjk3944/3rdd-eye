package jj;

import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import w.AbstractC8235B;
import w.o;
import y0.AbstractC8576P;
import y0.EnumC8595p;
import y0.InterfaceC8567G;
import y0.InterfaceC8581b;

/* renamed from: jj.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6349a {

    /* renamed from: jj.a$a, reason: collision with other inner class name */
    static final class C1880a extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f50880a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f50881b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f50882c;

        /* renamed from: jj.a$a$a, reason: collision with other inner class name */
        static final class C1881a extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f50883a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f50884b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f50885c;

            /* renamed from: jj.a$a$a$a, reason: collision with other inner class name */
            static final class C1882a extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

                /* renamed from: b, reason: collision with root package name */
                int f50886b;

                /* renamed from: c, reason: collision with root package name */
                private /* synthetic */ Object f50887c;

                C1882a(InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    C1882a c1882a = new C1882a(interfaceC5380e);
                    c1882a.f50887c = obj;
                    return c1882a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f50886b;
                    if (i10 == 0) {
                        v.b(obj);
                        InterfaceC8581b interfaceC8581b = (InterfaceC8581b) this.f50887c;
                        this.f50886b = 1;
                        obj = AbstractC8235B.e(interfaceC8581b, false, EnumC8595p.Main, this);
                        if (obj == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v.b(obj);
                    }
                    return obj;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC8581b interfaceC8581b, InterfaceC5380e interfaceC5380e) {
                    return ((C1882a) create(interfaceC8581b, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1881a(i iVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f50885c = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                C1881a c1881a = new C1881a(this.f50885c, interfaceC5380e);
                c1881a.f50884b = obj;
                return c1881a;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = eh.AbstractC5467b.g()
                    int r1 = r8.f50883a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r0 = r8.f50884b
                    y0.y r0 = (y0.C8604y) r0
                    Yg.v.b(r9)
                    goto L4e
                L16:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1e:
                    java.lang.Object r1 = r8.f50884b
                    y0.G r1 = (y0.InterfaceC8567G) r1
                    Yg.v.b(r9)
                    goto L3f
                L26:
                    Yg.v.b(r9)
                    java.lang.Object r9 = r8.f50884b
                    r1 = r9
                    y0.G r1 = (y0.InterfaceC8567G) r1
                    jj.a$a$a$a r9 = new jj.a$a$a$a
                    r4 = 0
                    r9.<init>(r4)
                    r8.f50884b = r1
                    r8.f50883a = r3
                    java.lang.Object r9 = r1.P(r9, r8)
                    if (r9 != r0) goto L3f
                    return r0
                L3f:
                    y0.y r9 = (y0.C8604y) r9
                    r8.f50884b = r9
                    r8.f50883a = r2
                    java.lang.Object r1 = jj.AbstractC6351c.b(r1, r9, r8)
                    if (r1 != r0) goto L4c
                    return r0
                L4c:
                    r0 = r9
                    r9 = r1
                L4e:
                    y0.y r9 = (y0.C8604y) r9
                    if (r9 == 0) goto L68
                    jj.i r9 = r8.f50885c
                    Ki.g r9 = r9.w()
                    jj.k r7 = new jj.k
                    long r2 = r0.f()
                    r5 = 2
                    r6 = 0
                    r4 = 0
                    r1 = r7
                    r1.<init>(r2, r4, r5, r6)
                    r9.k(r7)
                L68:
                    Yg.J r9 = Yg.J.f24997a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: jj.AbstractC6349a.C1880a.C1881a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
                return ((C1881a) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1880a(i iVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f50882c = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            C1880a c1880a = new C1880a(this.f50882c, interfaceC5380e);
            c1880a.f50881b = obj;
            return c1880a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f50880a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC8567G interfaceC8567G = (InterfaceC8567G) this.f50881b;
                C1881a c1881a = new C1881a(this.f50882c, null);
                this.f50880a = 1;
                if (o.e(interfaceC8567G, c1881a, this) == objG) {
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
        public final Object invoke(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
            return ((C1880a) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, i state) {
        AbstractC6492s.i(eVar, "<this>");
        AbstractC6492s.i(state, "state");
        return eVar.b0(AbstractC8576P.d(androidx.compose.ui.e.f28771b0, J.f24997a, new C1880a(state, null)));
    }
}
