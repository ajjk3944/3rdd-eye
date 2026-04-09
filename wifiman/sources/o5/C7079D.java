package o5;

import Ii.AbstractC3063k;
import Ii.InterfaceC3091y0;
import Ii.N;
import Ii.O;
import Zg.AbstractC3689v;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import ch.AbstractC4260a;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;
import p5.C7229a;
import p5.b;

/* renamed from: o5.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7079D {

    /* renamed from: f, reason: collision with root package name */
    public static final b f55349f = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5384i f55350a;

    /* renamed from: b, reason: collision with root package name */
    private Messenger f55351b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f55352c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingDeque f55353d;

    /* renamed from: e, reason: collision with root package name */
    private final d f55354e;

    /* renamed from: o5.D$a */
    public static final class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC5384i f55355a;

        /* renamed from: o5.D$a$a, reason: collision with other inner class name */
        static final class C1998a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f55356a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f55357b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1998a(String str, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f55357b = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C1998a(this.f55357b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f55356a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    C7229a c7229a = C7229a.f57670a;
                    this.f55356a = 1;
                    obj = c7229a.c(this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                Collection<p5.b> collectionValues = ((Map) obj).values();
                String str = this.f55357b;
                for (p5.b bVar : collectionValues) {
                    bVar.a(new b.C2029b(str));
                    Log.d("SessionLifecycleClient", "Notified " + bVar.c() + " of new session " + str);
                }
                return Yg.J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((C1998a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5384i backgroundDispatcher) {
            super(Looper.getMainLooper());
            AbstractC6492s.i(backgroundDispatcher, "backgroundDispatcher");
            this.f55355a = backgroundDispatcher;
        }

        private final void a(String str) {
            Log.d("SessionLifecycleClient", "Session update received.");
            AbstractC3063k.d(O.a(this.f55355a), null, null, new C1998a(str, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            String string;
            AbstractC6492s.i(msg, "msg");
            if (msg.what == 3) {
                Bundle data = msg.getData();
                if (data == null || (string = data.getString("SessionUpdateExtra")) == null) {
                    string = "";
                }
                a(string);
                return;
            }
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + msg);
            super.handleMessage(msg);
        }
    }

    /* renamed from: o5.D$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: o5.D$c */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f55358a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f55360c;

        /* renamed from: o5.D$c$a */
        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4260a.e(Long.valueOf(((Message) obj).getWhen()), Long.valueOf(((Message) obj2).getWhen()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f55360c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return C7079D.this.new c(this.f55360c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws RemoteException {
            Object objG = AbstractC5467b.g();
            int i10 = this.f55358a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C7229a c7229a = C7229a.f57670a;
                this.f55358a = 1;
                obj = c7229a.c(this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
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
                        if (((p5.b) it.next()).b()) {
                            List listX0 = AbstractC3689v.X0(AbstractC3689v.n0(AbstractC3689v.r(C7079D.this.l(this.f55360c, 2), C7079D.this.l(this.f55360c, 1))), new a());
                            C7079D c7079d = C7079D.this;
                            Iterator it2 = listX0.iterator();
                            while (it2.hasNext()) {
                                c7079d.p((Message) it2.next());
                            }
                        }
                    }
                    Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
                }
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: o5.D$d */
    public static final class d implements ServiceConnection {
        d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + C7079D.this.f55353d.size());
            C7079D.this.f55351b = new Messenger(iBinder);
            C7079D.this.f55352c = true;
            C7079D c7079d = C7079D.this;
            c7079d.o(c7079d.j());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            C7079D.this.f55351b = null;
            C7079D.this.f55352c = false;
        }
    }

    public C7079D(InterfaceC5384i backgroundDispatcher) {
        AbstractC6492s.i(backgroundDispatcher, "backgroundDispatcher");
        this.f55350a = backgroundDispatcher;
        this.f55353d = new LinkedBlockingDeque(20);
        this.f55354e = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List j() {
        ArrayList arrayList = new ArrayList();
        this.f55353d.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Message l(List list, int i10) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i10) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    private final void m(Message message) {
        if (!this.f55353d.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + this.f55353d.size());
    }

    private final void n(int i10) {
        List listJ = j();
        Message messageObtain = Message.obtain(null, i10, 0, 0);
        AbstractC6492s.h(messageObtain, "obtain(null, messageCode, 0, 0)");
        listJ.add(messageObtain);
        o(listJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3091y0 o(List list) {
        return AbstractC3063k.d(O.a(this.f55350a), null, null, new c(list, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Message message) throws RemoteException {
        if (this.f55351b == null) {
            m(message);
            return;
        }
        try {
            Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
            Messenger messenger = this.f55351b;
            if (messenger != null) {
                messenger.send(message);
            }
        } catch (RemoteException e10) {
            Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e10);
            m(message);
        }
    }

    public final void h() {
        n(2);
    }

    public final void i(F sessionLifecycleServiceBinder) {
        AbstractC6492s.i(sessionLifecycleServiceBinder, "sessionLifecycleServiceBinder");
        sessionLifecycleServiceBinder.a(new Messenger(new a(this.f55350a)), this.f55354e);
    }

    public final void k() {
        n(1);
    }
}
