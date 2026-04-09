package X0;

import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.List;

/* compiled from: DataMigrationInitializer.kt */
@h9.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e extends h9.i implements p9.p<j<Object>, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f13427l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f13428m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List<d<Object>> f13429n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(List<? extends d<Object>> list, InterfaceC4347e<? super e> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f13429n = list;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        e eVar = new e(this.f13429n, interfaceC4347e);
        eVar.f13428m = obj;
        return eVar;
    }

    @Override // p9.p
    public final Object invoke(j<Object> jVar, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((e) create(jVar, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f13427l;
        if (i == 0) {
            b9.n.b(obj);
            j jVar = (j) this.f13428m;
            this.f13427l = 1;
            if (T1.B.b(this.f13429n, jVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        return C1992A.f18074a;
    }
}
