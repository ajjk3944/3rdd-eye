package a1;

import b9.C1992A;
import b9.n;
import f9.InterfaceC4347e;
import h9.i;
import p9.p;

/* compiled from: PreferenceDataStoreFactory.kt */
@h9.e(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b extends i implements p<d, InterfaceC4347e<? super d>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f14086l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f14087m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f14088n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(p<? super d, ? super InterfaceC4347e<? super d>, ? extends Object> pVar, InterfaceC4347e<? super b> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f14088n = (i) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [h9.i, p9.p] */
    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        b bVar = new b(this.f14088n, interfaceC4347e);
        bVar.f14087m = obj;
        return bVar;
    }

    @Override // p9.p
    public final Object invoke(d dVar, InterfaceC4347e<? super d> interfaceC4347e) {
        return ((b) create(dVar, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h9.i, p9.p] */
    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f14086l;
        if (i == 0) {
            n.b(obj);
            d dVar = (d) this.f14087m;
            this.f14086l = 1;
            obj = this.f14088n.invoke(dVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        }
        d dVar2 = (d) obj;
        ((C1643a) dVar2).f14084b.set(true);
        return dVar2;
    }
}
