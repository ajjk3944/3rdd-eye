package w;

import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.K;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import r.InterfaceC7533i;
import r.m0;
import s.EnumC7839L;

/* loaded from: classes.dex */
public abstract class u {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f64016a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f64017b;

        /* renamed from: c, reason: collision with root package name */
        int f64018c;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f64017b = obj;
            this.f64018c |= PduHandle.NONE;
            return u.a(null, 0.0f, null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f64019a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f64020b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f64021c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC7533i f64022d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ K f64023e;

        static final class a extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ K f64024a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f64025b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(K k10, v vVar) {
                super(2);
                this.f64024a = k10;
                this.f64025b = vVar;
            }

            public final void a(float f10, float f11) {
                K k10 = this.f64024a;
                float f12 = k10.f51686a;
                k10.f51686a = f12 + this.f64025b.a(f10 - f12);
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, InterfaceC7533i interfaceC7533i, K k10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f64021c = f10;
            this.f64022d = interfaceC7533i;
            this.f64023e = k10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(this.f64021c, this.f64022d, this.f64023e, interfaceC5380e);
            bVar.f64020b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f64019a;
            if (i10 == 0) {
                Yg.v.b(obj);
                v vVar = (v) this.f64020b;
                float f10 = this.f64021c;
                InterfaceC7533i interfaceC7533i = this.f64022d;
                a aVar = new a(this.f64023e, vVar);
                this.f64019a = 1;
                if (m0.e(0.0f, f10, 0.0f, interfaceC7533i, aVar, this, 4, null) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v vVar, InterfaceC5380e interfaceC5380e) {
            return ((b) create(vVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f64026a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f64027b;

        /* renamed from: c, reason: collision with root package name */
        int f64028c;

        c(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f64027b = obj;
            this.f64028c |= PduHandle.NONE;
            return u.b(null, 0.0f, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f64029a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f64030b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f64031c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f64032d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(K k10, float f10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f64031c = k10;
            this.f64032d = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            d dVar = new d(this.f64031c, this.f64032d, interfaceC5380e);
            dVar.f64030b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f64029a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            v vVar = (v) this.f64030b;
            this.f64031c.f51686a = vVar.a(this.f64032d);
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v vVar, InterfaceC5380e interfaceC5380e) {
            return ((d) create(vVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f64033a;

        e(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new e(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f64033a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v vVar, InterfaceC5380e interfaceC5380e) {
            return ((e) create(vVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(w.y r7, float r8, r.InterfaceC7533i r9, dh.InterfaceC5380e r10) {
        /*
            boolean r0 = r10 instanceof w.u.a
            if (r0 == 0) goto L14
            r0 = r10
            w.u$a r0 = (w.u.a) r0
            int r1 = r0.f64018c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f64018c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            w.u$a r0 = new w.u$a
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.f64017b
            java.lang.Object r0 = eh.AbstractC5467b.g()
            int r1 = r4.f64018c
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r7 = r4.f64016a
            kotlin.jvm.internal.K r7 = (kotlin.jvm.internal.K) r7
            Yg.v.b(r10)
            goto L55
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            Yg.v.b(r10)
            kotlin.jvm.internal.K r10 = new kotlin.jvm.internal.K
            r10.<init>()
            w.u$b r3 = new w.u$b
            r1 = 0
            r3.<init>(r8, r9, r10, r1)
            r4.f64016a = r10
            r4.f64018c = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r7 = w.y.b(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L54
            return r0
        L54:
            r7 = r10
        L55:
            float r7 = r7.f51686a
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.b.c(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w.u.a(w.y, float, r.i, dh.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(w.y r7, float r8, dh.InterfaceC5380e r9) {
        /*
            boolean r0 = r9 instanceof w.u.c
            if (r0 == 0) goto L14
            r0 = r9
            w.u$c r0 = (w.u.c) r0
            int r1 = r0.f64028c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f64028c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            w.u$c r0 = new w.u$c
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f64027b
            java.lang.Object r0 = eh.AbstractC5467b.g()
            int r1 = r4.f64028c
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r7 = r4.f64026a
            kotlin.jvm.internal.K r7 = (kotlin.jvm.internal.K) r7
            Yg.v.b(r9)
            goto L55
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            Yg.v.b(r9)
            kotlin.jvm.internal.K r9 = new kotlin.jvm.internal.K
            r9.<init>()
            w.u$d r3 = new w.u$d
            r1 = 0
            r3.<init>(r9, r8, r1)
            r4.f64026a = r9
            r4.f64028c = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r7 = w.y.b(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L54
            return r0
        L54:
            r7 = r9
        L55:
            float r7 = r7.f51686a
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.b.c(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w.u.b(w.y, float, dh.e):java.lang.Object");
    }

    public static final Object c(y yVar, EnumC7839L enumC7839L, InterfaceC5380e interfaceC5380e) {
        Object objC = yVar.c(enumC7839L, new e(null), interfaceC5380e);
        return objC == AbstractC5467b.g() ? objC : J.f24997a;
    }
}
