package X1;

import A9.E;
import D9.C0640b;
import D9.H;
import D9.InterfaceC0644f;
import D9.InterfaceC0645g;
import b2.C1842w;
import b9.C1992A;
import b9.n;
import c9.C2092m;
import c9.C2097r;
import f9.C4351i;
import f9.InterfaceC4347e;
import h9.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p9.p;

/* compiled from: WorkConstraintsTracker.kt */
@h9.e(c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f = "WorkConstraintsTracker.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f13551l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f13552m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1842w f13553n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d f13554o;

    /* compiled from: WorkConstraintsTracker.kt */
    public static final class a<T> implements InterfaceC0645g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f13555b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C1842w f13556c;

        public a(d dVar, C1842w c1842w) {
            this.f13555b = dVar;
            this.f13556c = c1842w;
        }

        @Override // D9.InterfaceC0645g
        public final Object emit(Object obj, InterfaceC4347e interfaceC4347e) {
            C1842w c1842w = this.f13556c;
            this.f13555b.a(c1842w, (b) obj);
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, C1842w c1842w, d dVar, InterfaceC4347e<? super g> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f13552m = eVar;
        this.f13553n = c1842w;
        this.f13554o = dVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new g(this.f13552m, this.f13553n, this.f13554o, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((g) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f13551l;
        if (i == 0) {
            n.b(obj);
            e eVar = this.f13552m;
            eVar.getClass();
            C1842w c1842w = this.f13553n;
            List<Y1.d<?>> list = eVar.f13544a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((Y1.d) obj2).b(c1842w)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Y1.d dVar = (Y1.d) it.next();
                dVar.getClass();
                arrayList2.add(new C0640b(new Y1.c(dVar, null), C4351i.f37871b, -2, C9.a.SUSPEND));
            }
            InterfaceC0644f interfaceC0644fC = H.c(new f((InterfaceC0644f[]) C2097r.G0(arrayList2).toArray(new InterfaceC0644f[0])));
            a aVar2 = new a(this.f13554o, c1842w);
            this.f13551l = 1;
            if (interfaceC0644fC.b(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        }
        return C1992A.f18074a;
    }
}
