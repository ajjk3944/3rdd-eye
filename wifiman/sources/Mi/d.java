package Mi;

import Ii.N;
import Ii.O;
import Ii.P;
import Ii.S;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Yg.J;
import Zg.AbstractC3689v;
import dh.C5385j;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.ArrayList;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class d implements o {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5384i f13236a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13237b;

    /* renamed from: c, reason: collision with root package name */
    public final Ki.a f13238c;

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f13239a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f13240b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3221h f13241c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f13242d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3221h interfaceC3221h, d dVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f13241c = interfaceC3221h;
            this.f13242d = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f13241c, this.f13242d, interfaceC5380e);
            aVar.f13240b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f13239a;
            if (i10 == 0) {
                Yg.v.b(obj);
                N n10 = (N) this.f13240b;
                InterfaceC3221h interfaceC3221h = this.f13241c;
                Ki.v vVarO = this.f13242d.o(n10);
                this.f13239a = 1;
                if (AbstractC3222i.s(interfaceC3221h, vVarO, this) == objG) {
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
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f13243a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f13244b;

        b(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = d.this.new b(interfaceC5380e);
            bVar.f13244b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f13243a;
            if (i10 == 0) {
                Yg.v.b(obj);
                Ki.t tVar = (Ki.t) this.f13244b;
                d dVar = d.this;
                this.f13243a = 1;
                if (dVar.g(tVar, this) == objG) {
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
        public final Object invoke(Ki.t tVar, InterfaceC5380e interfaceC5380e) {
            return ((b) create(tVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public d(InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar) {
        this.f13236a = interfaceC5384i;
        this.f13237b = i10;
        this.f13238c = aVar;
    }

    static /* synthetic */ Object f(d dVar, InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
        Object objG = O.g(new a(interfaceC3221h, dVar, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : J.f24997a;
    }

    @Override // Li.InterfaceC3220g
    public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
        return f(this, interfaceC3221h, interfaceC5380e);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // Mi.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Li.InterfaceC3220g d(dh.InterfaceC5384i r2, int r3, Ki.a r4) {
        /*
            r1 = this;
            dh.i r0 = r1.f13236a
            dh.i r2 = r2.plus(r0)
            Ki.a r0 = Ki.a.SUSPEND
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.f13237b
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r3 = r3 + r4
            if (r3 < 0) goto L20
            goto L23
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            Ki.a r4 = r1.f13238c
        L25:
            dh.i r0 = r1.f13236a
            boolean r0 = kotlin.jvm.internal.AbstractC6492s.d(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.f13237b
            if (r3 != r0) goto L36
            Ki.a r0 = r1.f13238c
            if (r4 != r0) goto L36
            return r1
        L36:
            Mi.d r2 = r1.i(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Mi.d.d(dh.i, int, Ki.a):Li.g");
    }

    protected String e() {
        return null;
    }

    protected abstract Object g(Ki.t tVar, InterfaceC5380e interfaceC5380e);

    protected abstract d i(InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar);

    public InterfaceC3220g k() {
        return null;
    }

    public final InterfaceC6839p m() {
        return new b(null);
    }

    public final int n() {
        int i10 = this.f13237b;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public Ki.v o(N n10) {
        return Ki.r.d(n10, this.f13236a, n(), this.f13238c, P.ATOMIC, null, m(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strE = e();
        if (strE != null) {
            arrayList.add(strE);
        }
        if (this.f13236a != C5385j.f46088a) {
            arrayList.add("context=" + this.f13236a);
        }
        if (this.f13237b != -3) {
            arrayList.add("capacity=" + this.f13237b);
        }
        if (this.f13238c != Ki.a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f13238c);
        }
        return S.a(this) + '[' + AbstractC3689v.z0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
