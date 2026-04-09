package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.sessions.c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;
import q5.f;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0007\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003J\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u0003R\u001a\u0010\u0013\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/Messenger;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Landroid/content/Intent;)Landroid/os/Messenger;", "LYg/J;", "onCreate", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onDestroy", "Landroid/os/HandlerThread;", "Landroid/os/HandlerThread;", "getHandlerThread$com_google_firebase_firebase_sessions", "()Landroid/os/HandlerThread;", "handlerThread", "Lcom/google/firebase/sessions/SessionLifecycleService$b;", SnmpConfigurator.O_BIND_ADDRESS, "Lcom/google/firebase/sessions/SessionLifecycleService$b;", "messageHandler", SnmpConfigurator.O_COMMUNITY, "Landroid/os/Messenger;", "messenger", "d", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SessionLifecycleService extends Service {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final HandlerThread handlerThread = new HandlerThread("FirebaseSessions_HandlerThread");

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private b messageHandler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Messenger messenger;

    public static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private boolean f38924a;

        /* renamed from: b, reason: collision with root package name */
        private long f38925b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f38926c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Looper looper) {
            super(looper);
            AbstractC6492s.i(looper, "looper");
            this.f38926c = new ArrayList();
        }

        private final void a() throws RemoteException {
            Log.d("SessionLifecycleService", "Broadcasting new session");
            com.google.firebase.sessions.b.f38929a.a().a(c.f38931f.a().c());
            for (Messenger it : new ArrayList(this.f38926c)) {
                AbstractC6492s.h(it, "it");
                f(it);
            }
        }

        private final void b(Message message) {
            Log.d("SessionLifecycleService", "Activity backgrounding at " + message.getWhen());
            this.f38925b = message.getWhen();
        }

        private final void c(Message message) throws RemoteException {
            this.f38926c.add(message.replyTo);
            Messenger messenger = message.replyTo;
            AbstractC6492s.h(messenger, "msg.replyTo");
            f(messenger);
            Log.d("SessionLifecycleService", "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + this.f38926c.size());
        }

        private final void d(Message message) throws RemoteException {
            Log.d("SessionLifecycleService", "Activity foregrounding at " + message.getWhen() + '.');
            if (!this.f38924a) {
                Log.d("SessionLifecycleService", "Cold start detected.");
                this.f38924a = true;
                g();
            } else if (e(message.getWhen())) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                g();
            }
            this.f38925b = message.getWhen();
        }

        private final boolean e(long j10) {
            return j10 - this.f38925b > Ai.a.v(f.f58428c.c().c());
        }

        private final void f(Messenger messenger) throws RemoteException {
            try {
                if (this.f38924a) {
                    h(messenger, c.f38931f.a().c().b());
                } else {
                    String strA = a.f38927a.a().a();
                    Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session.");
                    if (strA != null) {
                        h(messenger, strA);
                    }
                }
            } catch (IllegalStateException e10) {
                Log.w("SessionLifecycleService", "Failed to send session to client.", e10);
            }
        }

        private final void g() throws RemoteException {
            try {
                c.b bVar = c.f38931f;
                bVar.a().a();
                Log.d("SessionLifecycleService", "Generated new session.");
                a();
                a.f38927a.a().b(bVar.a().c().b());
            } catch (IllegalStateException e10) {
                Log.w("SessionLifecycleService", "Failed to generate new session.", e10);
            }
        }

        private final void h(Messenger messenger, String str) throws RemoteException {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message messageObtain = Message.obtain(null, 3, 0, 0);
                messageObtain.setData(bundle);
                messenger.send(messageObtain);
            } catch (DeadObjectException unused) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
                this.f38926c.remove(messenger);
            } catch (Exception e10) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e10);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) throws RemoteException {
            AbstractC6492s.i(msg, "msg");
            if (this.f38925b > msg.getWhen()) {
                Log.d("SessionLifecycleService", "Ignoring old message from " + msg.getWhen() + " which is older than " + this.f38925b + '.');
                return;
            }
            int i10 = msg.what;
            if (i10 == 1) {
                d(msg);
                return;
            }
            if (i10 == 2) {
                b(msg);
                return;
            }
            if (i10 == 4) {
                c(msg);
                return;
            }
            Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + msg);
            super.handleMessage(msg);
        }
    }

    private final Messenger a(Intent intent) {
        return Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger messengerA = a(intent);
        if (messengerA != null) {
            Message messageObtain = Message.obtain(null, 4, 0, 0);
            messageObtain.replyTo = messengerA;
            b bVar = this.messageHandler;
            if (bVar != null) {
                bVar.sendMessage(messageObtain);
            }
        }
        Messenger messenger = this.messenger;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.handlerThread.start();
        Looper looper = this.handlerThread.getLooper();
        AbstractC6492s.h(looper, "handlerThread.looper");
        this.messageHandler = new b(looper);
        this.messenger = new Messenger(this.messageHandler);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.handlerThread.quit();
    }
}
