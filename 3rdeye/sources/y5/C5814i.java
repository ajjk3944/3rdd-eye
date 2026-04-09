package y5;

import a1.C1643a;
import a1.d;
import b9.C1992A;
import b9.n;
import f9.InterfaceC4347e;
import kotlin.jvm.internal.l;
import p9.p;

/* compiled from: SettingsCache.kt */
@h9.e(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
/* renamed from: y5.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5814i extends h9.i implements p<C1643a, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f48183l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f48184m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d.a<Object> f48185n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C5812g f48186o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5814i(Object obj, d.a<Object> aVar, C5812g c5812g, InterfaceC4347e<? super C5814i> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f48184m = obj;
        this.f48185n = aVar;
        this.f48186o = c5812g;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        C5814i c5814i = new C5814i(this.f48184m, this.f48185n, this.f48186o, interfaceC4347e);
        c5814i.f48183l = obj;
        return c5814i;
    }

    @Override // p9.p
    public final Object invoke(C1643a c1643a, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((C5814i) create(c1643a, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        n.b(obj);
        C1643a c1643a = (C1643a) this.f48183l;
        Object obj2 = this.f48184m;
        d.a<?> key = this.f48185n;
        if (obj2 != null) {
            c1643a.getClass();
            l.f(key, "key");
            c1643a.c(key, obj2);
        } else {
            c1643a.getClass();
            l.f(key, "key");
            if (c1643a.f14084b.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            c1643a.f14083a.remove(key);
        }
        C5812g.a(this.f48186o, c1643a);
        return C1992A.f18074a;
    }
}
