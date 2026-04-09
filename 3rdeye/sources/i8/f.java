package i8;

import A9.E;
import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Preferences.kt */
@h9.e(c = "com.zipoapps.premiumhelper.Preferences$allPreferencesToString$2", f = "Preferences.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class f extends h9.i implements p9.p<E, InterfaceC4347e<? super String>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.c f38588l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.zipoapps.premiumhelper.c cVar, InterfaceC4347e<? super f> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f38588l = cVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new f(this.f38588l, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super String> interfaceC4347e) {
        return ((f) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        b9.n.b(obj);
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = this.f38588l.f37004a.getAll().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(entry.getKey() + " : " + entry.getValue());
            sb.append('\n');
        }
        return sb.toString();
    }
}
