package n8;

import A9.E;
import b9.C1992A;
import b9.n;
import f9.InterfaceC4347e;
import h9.i;
import java.util.Map;
import kotlin.jvm.internal.l;
import p9.p;
import r5.k;

/* compiled from: RemoteConfig.kt */
@h9.e(c = "com.zipoapps.premiumhelper.configuration.remoteconfig.RemoteConfig$allValuesToString$2", f = "RemoteConfig.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class c extends i implements p<E, InterfaceC4347e<? super String>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f44410l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, InterfaceC4347e<? super c> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f44410l = fVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new c(this.f44410l, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super String> interfaceC4347e) {
        return ((c) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        n.b(obj);
        StringBuilder sb = new StringBuilder();
        r5.e eVar = this.f44410l.f44420a;
        if (eVar == null) {
            l.l("firebaseRemoteConfig");
            throw null;
        }
        for (Map.Entry entry : eVar.a().entrySet()) {
            sb.append(entry.getKey() + " = " + ((k) entry.getValue()).b() + " source: " + ((k) entry.getValue()).a());
            sb.append('\n');
        }
        return sb.toString();
    }
}
