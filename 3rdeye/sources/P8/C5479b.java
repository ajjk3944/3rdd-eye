package p8;

import A9.E;
import b9.C1992A;
import b9.n;
import f9.InterfaceC4347e;
import h9.e;
import h9.i;
import java.util.Iterator;
import java.util.Map;
import p9.p;

/* compiled from: TotoConfigRepository.kt */
@e(c = "com.zipoapps.premiumhelper.configuration.toto.TotoConfigRepository$allPreferencesToString$2", f = "TotoConfigRepository.kt", l = {}, m = "invokeSuspend")
/* renamed from: p8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5479b extends i implements p<E, InterfaceC4347e<? super String>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f45299l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5479b(c cVar, InterfaceC4347e<? super C5479b> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f45299l = cVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new C5479b(this.f45299l, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super String> interfaceC4347e) {
        return ((C5479b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        n.b(obj);
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = this.f45299l.f45300a.getAll().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(entry.getKey() + " : " + entry.getValue());
            sb.append('\n');
        }
        return sb.toString();
    }
}
