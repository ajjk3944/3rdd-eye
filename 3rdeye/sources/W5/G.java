package w5;

import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import b9.C1992A;
import c9.C2092m;
import c9.C2097r;
import f9.InterfaceC4347e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import x5.C5768a;

/* compiled from: SessionLifecycleClient.kt */
@h9.e(c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", f = "SessionLifecycleClient.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class G extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f47369l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ F f47370m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f47371n;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return com.google.gson.internal.c.g(Long.valueOf(((Message) t10).getWhen()), Long.valueOf(((Message) t11).getWhen()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(F f10, ArrayList arrayList, InterfaceC4347e interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f47370m = f10;
        this.f47371n = arrayList;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new G(this.f47370m, this.f47371n, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((G) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) throws RemoteException {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f47369l;
        if (i == 0) {
            b9.n.b(obj);
            C5768a c5768a = C5768a.f47773a;
            this.f47369l = 1;
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
        Map map = (Map) obj;
        if (map.isEmpty()) {
            Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
        } else {
            Collection collectionValues = map.values();
            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
            } else {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((x5.c) it.next()).a()) {
                        ArrayList arrayList = this.f47371n;
                        F f10 = this.f47370m;
                        for (Message message : C2097r.C0(new a(), C2097r.n0(C2092m.X(F.a(f10, arrayList, 2), F.a(f10, arrayList, 1))))) {
                            if (f10.f47364b != null) {
                                try {
                                    Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                                    Messenger messenger = f10.f47364b;
                                    if (messenger != null) {
                                        messenger.send(message);
                                    }
                                } catch (RemoteException e4) {
                                    Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e4);
                                    f10.b(message);
                                }
                            } else {
                                f10.b(message);
                            }
                        }
                    }
                }
                Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
            }
        }
        return C1992A.f18074a;
    }
}
