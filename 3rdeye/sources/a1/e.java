package a1;

import b9.C1992A;
import b9.n;
import c9.C2078B;
import f9.InterfaceC4347e;
import h9.i;
import p9.p;

/* compiled from: Preferences.kt */
@h9.e(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {329}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e extends i implements p<d, InterfaceC4347e<? super d>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f14091l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f14092m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f14093n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(p<? super C1643a, ? super InterfaceC4347e<? super C1992A>, ? extends Object> pVar, InterfaceC4347e<? super e> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f14093n = (i) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [h9.i, p9.p] */
    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        e eVar = new e(this.f14093n, interfaceC4347e);
        eVar.f14092m = obj;
        return eVar;
    }

    @Override // p9.p
    public final Object invoke(d dVar, InterfaceC4347e<? super d> interfaceC4347e) {
        return ((e) create(dVar, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [h9.i, p9.p] */
    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f14091l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1643a c1643a = (C1643a) this.f14092m;
            n.b(obj);
            return c1643a;
        }
        n.b(obj);
        C1643a c1643a2 = new C1643a(C2078B.u(((d) this.f14092m).a()), false);
        this.f14092m = c1643a2;
        this.f14091l = 1;
        return this.f14093n.invoke(c1643a2, this) == aVar ? aVar : c1643a2;
    }
}
