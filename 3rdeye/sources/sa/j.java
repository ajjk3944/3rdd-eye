package sa;

import A9.C0583j;
import H6.C0680q;
import U9.F;
import U9.InterfaceC1608e;
import f9.InterfaceC4347e;

/* compiled from: HttpServiceMethod.java */
/* loaded from: classes3.dex */
public abstract class j<ResponseT, ReturnT> extends x<ReturnT> {

    /* renamed from: a, reason: collision with root package name */
    public final t f46211a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1608e.a f46212b;

    /* renamed from: c, reason: collision with root package name */
    public final f<F, ResponseT> f46213c;

    /* compiled from: HttpServiceMethod.java */
    public static final class a<ResponseT, ReturnT> extends j<ResponseT, ReturnT> {

        /* renamed from: d, reason: collision with root package name */
        public final sa.c<ResponseT, ReturnT> f46214d;

        public a(t tVar, InterfaceC1608e.a aVar, f<F, ResponseT> fVar, sa.c<ResponseT, ReturnT> cVar) {
            super(tVar, aVar, fVar);
            this.f46214d = cVar;
        }

        @Override // sa.j
        public final Object c(m mVar, Object[] objArr) {
            return this.f46214d.b(mVar);
        }
    }

    /* compiled from: HttpServiceMethod.java */
    public static final class b<ResponseT> extends j<ResponseT, Object> {

        /* renamed from: d, reason: collision with root package name */
        public final sa.c<ResponseT, sa.b<ResponseT>> f46215d;

        public b(t tVar, InterfaceC1608e.a aVar, f fVar, sa.c cVar) {
            super(tVar, aVar, fVar);
            this.f46215d = cVar;
        }

        @Override // sa.j
        public final Object c(m mVar, Object[] objArr) {
            sa.b bVar = (sa.b) this.f46215d.b(mVar);
            InterfaceC4347e interfaceC4347e = (InterfaceC4347e) objArr[objArr.length - 1];
            try {
                C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(interfaceC4347e));
                c0583j.u(new C9.r(bVar, 12));
                bVar.c(new B7.e(c0583j, 9));
                Object objR = c0583j.r();
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                return objR;
            } catch (Exception e4) {
                return l.a(e4, interfaceC4347e);
            }
        }
    }

    /* compiled from: HttpServiceMethod.java */
    public static final class c<ResponseT> extends j<ResponseT, Object> {

        /* renamed from: d, reason: collision with root package name */
        public final sa.c<ResponseT, sa.b<ResponseT>> f46216d;

        public c(t tVar, InterfaceC1608e.a aVar, f<F, ResponseT> fVar, sa.c<ResponseT, sa.b<ResponseT>> cVar) {
            super(tVar, aVar, fVar);
            this.f46216d = cVar;
        }

        @Override // sa.j
        public final Object c(m mVar, Object[] objArr) {
            sa.b bVar = (sa.b) this.f46216d.b(mVar);
            InterfaceC4347e interfaceC4347e = (InterfaceC4347e) objArr[objArr.length - 1];
            try {
                C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(interfaceC4347e));
                c0583j.u(new C0680q(bVar, 10));
                bVar.c(new L9.b(c0583j));
                Object objR = c0583j.r();
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                return objR;
            } catch (Exception e4) {
                return l.a(e4, interfaceC4347e);
            }
        }
    }

    public j(t tVar, InterfaceC1608e.a aVar, f<F, ResponseT> fVar) {
        this.f46211a = tVar;
        this.f46212b = aVar;
        this.f46213c = fVar;
    }

    @Override // sa.x
    public final ReturnT a(Object[] objArr) {
        return (ReturnT) c(new m(this.f46211a, objArr, this.f46212b, this.f46213c), objArr);
    }

    public abstract Object c(m mVar, Object[] objArr);
}
