package Li;

import Zg.AbstractC3689v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
final class M implements J {

    /* renamed from: b, reason: collision with root package name */
    private final long f11872b;

    /* renamed from: c, reason: collision with root package name */
    private final long f11873c;

    static final class a extends kotlin.coroutines.jvm.internal.l implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        int f11874a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f11875b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ int f11876c;

        a(InterfaceC5380e interfaceC5380e) {
            super(3, interfaceC5380e);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r9.f11874a
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.f11875b
                Li.h r1 = (Li.InterfaceC3221h) r1
                Yg.v.b(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.f11875b
                Li.h r1 = (Li.InterfaceC3221h) r1
                Yg.v.b(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.f11875b
                Li.h r1 = (Li.InterfaceC3221h) r1
                Yg.v.b(r10)
                goto L64
            L38:
                Yg.v.b(r10)
                goto L9c
            L3c:
                Yg.v.b(r10)
                java.lang.Object r10 = r9.f11875b
                r1 = r10
                Li.h r1 = (Li.InterfaceC3221h) r1
                int r10 = r9.f11876c
                if (r10 <= 0) goto L53
                Li.H r10 = Li.H.START
                r9.f11874a = r6
                java.lang.Object r10 = r1.a(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L53:
                Li.M r10 = Li.M.this
                long r6 = Li.M.c(r10)
                r9.f11875b = r1
                r9.f11874a = r5
                java.lang.Object r10 = Ii.Y.a(r6, r9)
                if (r10 != r0) goto L64
                return r0
            L64:
                Li.M r10 = Li.M.this
                long r5 = Li.M.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                Li.H r10 = Li.H.STOP
                r9.f11875b = r1
                r9.f11874a = r4
                java.lang.Object r10 = r1.a(r10, r9)
                if (r10 != r0) goto L7d
                return r0
            L7d:
                Li.M r10 = Li.M.this
                long r4 = Li.M.b(r10)
                r9.f11875b = r1
                r9.f11874a = r3
                java.lang.Object r10 = Ii.Y.a(r4, r9)
                if (r10 != r0) goto L8e
                return r0
            L8e:
                Li.H r10 = Li.H.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f11875b = r3
                r9.f11874a = r2
                java.lang.Object r10 = r1.a(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L9c:
                Yg.J r10 = Yg.J.f24997a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: Li.M.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object n(InterfaceC3221h interfaceC3221h, int i10, InterfaceC5380e interfaceC5380e) {
            a aVar = M.this.new a(interfaceC5380e);
            aVar.f11875b = interfaceC3221h;
            aVar.f11876c = i10;
            return aVar.invokeSuspend(Yg.J.f24997a);
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return n((InterfaceC3221h) obj, ((Number) obj2).intValue(), (InterfaceC5380e) obj3);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f11878a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11879b;

        b(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(interfaceC5380e);
            bVar.f11879b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f11878a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(((H) this.f11879b) != H.START);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(H h10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(h10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public M(long j10, long j11) {
        this.f11872b = j10;
        this.f11873c = j11;
        if (j10 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
        }
        if (j11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j11 + " ms) cannot be negative").toString());
    }

    @Override // Li.J
    public InterfaceC3220g a(N n10) {
        return AbstractC3222i.n(AbstractC3222i.r(AbstractC3222i.O(n10, new a(null)), new b(null)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof M) {
            M m10 = (M) obj;
            if (this.f11872b == m10.f11872b && this.f11873c == m10.f11873c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Long.hashCode(this.f11872b) * 31) + Long.hashCode(this.f11873c);
    }

    public String toString() {
        List listD = AbstractC3689v.d(2);
        if (this.f11872b > 0) {
            listD.add("stopTimeout=" + this.f11872b + "ms");
        }
        if (this.f11873c < Long.MAX_VALUE) {
            listD.add("replayExpiration=" + this.f11873c + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + AbstractC3689v.z0(AbstractC3689v.a(listD), null, null, null, 0, null, null, 63, null) + ')';
    }
}
