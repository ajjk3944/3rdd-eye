package J;

import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import w.o;
import y0.InterfaceC8567G;
import y0.InterfaceC8581b;

/* loaded from: classes.dex */
public abstract class b {

    static final class a extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        Object f9366b;

        /* renamed from: c, reason: collision with root package name */
        int f9367c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f9368d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f9369e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f9370f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar, InterfaceC6824a interfaceC6824a, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f9369e = cVar;
            this.f9370f = interfaceC6824a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f9369e, this.f9370f, interfaceC5380e);
            aVar.f9368d = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005f -> B:19:0x0062). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r12.f9367c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r12.f9366b
                y0.y r1 = (y0.C8604y) r1
                java.lang.Object r4 = r12.f9368d
                y0.b r4 = (y0.InterfaceC8581b) r4
                Yg.v.b(r13)
                goto L62
            L1a:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L22:
                java.lang.Object r1 = r12.f9368d
                y0.b r1 = (y0.InterfaceC8581b) r1
                Yg.v.b(r13)
                goto L43
            L2a:
                Yg.v.b(r13)
                java.lang.Object r13 = r12.f9368d
                r1 = r13
                y0.b r1 = (y0.InterfaceC8581b) r1
                r12.f9368d = r1
                r12.f9367c = r3
                r5 = 0
                r6 = 0
                r8 = 2
                r9 = 0
                r4 = r1
                r7 = r12
                java.lang.Object r13 = w.AbstractC8235B.f(r4, r5, r6, r7, r8, r9)
                if (r13 != r0) goto L43
                return r0
            L43:
                y0.y r13 = (y0.C8604y) r13
                J.c r4 = r12.f9369e
                long r5 = r13.h()
                r4.a(r5)
                mh.a r4 = r12.f9370f
                if (r4 == 0) goto L92
                r4 = r1
                r1 = r13
            L54:
                r12.f9368d = r4
                r12.f9366b = r1
                r12.f9367c = r2
                r13 = 0
                java.lang.Object r13 = y0.InterfaceC8581b.s1(r4, r13, r12, r3, r13)
                if (r13 != r0) goto L62
                return r0
            L62:
                y0.n r13 = (y0.C8593n) r13
                java.util.List r13 = r13.c()
                int r5 = r13.size()
                r6 = 0
            L6d:
                if (r6 >= r5) goto L8d
                java.lang.Object r7 = r13.get(r6)
                y0.y r7 = (y0.C8604y) r7
                long r8 = r7.f()
                long r10 = r1.f()
                boolean r8 = y0.C8603x.d(r8, r10)
                if (r8 == 0) goto L8a
                boolean r7 = r7.i()
                if (r7 == 0) goto L8a
                goto L54
            L8a:
                int r6 = r6 + 1
                goto L6d
            L8d:
                mh.a r13 = r12.f9370f
                r13.invoke()
            L92:
                Yg.J r13 = Yg.J.f24997a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: J.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8581b interfaceC8581b, InterfaceC5380e interfaceC5380e) {
            return ((a) create(interfaceC8581b, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final Object a(InterfaceC8567G interfaceC8567G, c cVar, InterfaceC6824a interfaceC6824a, InterfaceC5380e interfaceC5380e) {
        Object objD = o.d(interfaceC8567G, new a(cVar, interfaceC6824a, null), interfaceC5380e);
        return objD == AbstractC5467b.g() ? objD : J.f24997a;
    }
}
