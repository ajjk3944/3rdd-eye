package w5;

import android.util.Log;
import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.Map;
import x5.C5768a;
import x5.c;

/* compiled from: SessionLifecycleClient.kt */
@h9.e(c = "com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1", f = "SessionLifecycleClient.kt", l = {74}, m = "invokeSuspend")
/* renamed from: w5.E, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5725E extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f47361l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f47362m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5725E(String str, InterfaceC4347e<? super C5725E> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f47362m = str;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new C5725E(this.f47362m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((C5725E) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f47361l;
        if (i == 0) {
            b9.n.b(obj);
            C5768a c5768a = C5768a.f47773a;
            this.f47361l = 1;
            obj = c5768a.b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        for (x5.c cVar : ((Map) obj).values()) {
            String str = this.f47362m;
            cVar.c(new c.b(str));
            Log.d("SessionLifecycleClient", "Notified " + cVar.b() + " of new session " + str);
        }
        return C1992A.f18074a;
    }
}
