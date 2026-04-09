package w5;

import A9.C0575f;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import f9.InterfaceC4350h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: SessionLifecycleClient.kt */
/* loaded from: classes2.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4350h f47363a;

    /* renamed from: b, reason: collision with root package name */
    public Messenger f47364b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedBlockingDeque<Message> f47365c = new LinkedBlockingDeque<>(20);

    /* renamed from: d, reason: collision with root package name */
    public final b f47366d = new b();

    /* compiled from: SessionLifecycleClient.kt */
    public static final class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC4350h f47367a;

        public a(InterfaceC4350h interfaceC4350h) {
            super(Looper.getMainLooper());
            this.f47367a = interfaceC4350h;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message msg) {
            String string;
            kotlin.jvm.internal.l.f(msg, "msg");
            if (msg.what != 3) {
                Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + msg);
                super.handleMessage(msg);
                return;
            }
            Bundle data = msg.getData();
            if (data == null || (string = data.getString("SessionUpdateExtra")) == null) {
                string = "";
            }
            Log.d("SessionLifecycleClient", "Session update received: ".concat(string));
            C0575f.e(A9.F.a(this.f47367a), null, null, new C5725E(string, null), 3);
        }
    }

    /* compiled from: SessionLifecycleClient.kt */
    public static final class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            StringBuilder sb = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
            F f10 = F.this;
            sb.append(f10.f47365c.size());
            Log.d("SessionLifecycleClient", sb.toString());
            f10.f47364b = new Messenger(iBinder);
            ArrayList arrayList = new ArrayList();
            f10.f47365c.drainTo(arrayList);
            C0575f.e(A9.F.a(f10.f47363a), null, null, new G(f10, arrayList, null), 3);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            F f10 = F.this;
            f10.f47364b = null;
            f10.getClass();
        }
    }

    public F(InterfaceC4350h interfaceC4350h) {
        this.f47363a = interfaceC4350h;
    }

    public static final Message a(F f10, ArrayList arrayList, int i) {
        Object obj;
        f10.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Message) obj2).what == i) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
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

    public final void b(Message message) {
        LinkedBlockingDeque<Message> linkedBlockingDeque = this.f47365c;
        if (!linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
    }

    public final void c(int i) {
        ArrayList arrayList = new ArrayList();
        this.f47365c.drainTo(arrayList);
        Message messageObtain = Message.obtain(null, i, 0, 0);
        kotlin.jvm.internal.l.e(messageObtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(messageObtain);
        C0575f.e(A9.F.a(this.f47363a), null, null, new G(this, arrayList, null), 3);
    }
}
