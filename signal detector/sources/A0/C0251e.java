package a0;

import c5.C0412i;
import h5.InterfaceC2370d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: a0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251e extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public Iterator f4571e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4572f;

    /* renamed from: g, reason: collision with root package name */
    public int f4573g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4574h;
    public final /* synthetic */ List i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4575j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0251e(List list, ArrayList arrayList, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.i = list;
        this.f4575j = arrayList;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((C0251e) j((InterfaceC2370d) obj2, obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        C0251e c0251e = new C0251e(this.i, this.f4575j, interfaceC2370d);
        c0251e.f4574h = obj;
        return c0251e;
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        Iterator it;
        List list;
        int i = this.f4573g;
        if (i == 0) {
            R2.a.H(obj);
            obj = this.f4574h;
            it = this.i.iterator();
            list = this.f4575j;
        } else if (i == 1) {
            Object obj2 = this.f4572f;
            Iterator it2 = this.f4571e;
            List list2 = (List) this.f4574h;
            R2.a.H(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0250d(1, null));
                this.f4574h = list2;
                this.f4571e = it2;
                this.f4572f = null;
                this.f4573g = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f4571e;
            list = (List) this.f4574h;
            R2.a.H(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f4574h = list;
        this.f4571e = it;
        this.f4572f = obj;
        this.f4573g = 1;
        throw null;
    }
}
