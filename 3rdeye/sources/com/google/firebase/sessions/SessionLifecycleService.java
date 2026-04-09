package com.google.firebase.sessions;

import B4.e;
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
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.l;
import w5.C5723C;
import w5.t;
import w5.v;
import w5.y;

/* compiled from: SessionLifecycleService.kt */
/* loaded from: classes2.dex */
public final class SessionLifecycleService extends Service {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f23352b = new HandlerThread("FirebaseSessions_HandlerThread");

    /* renamed from: c, reason: collision with root package name */
    public a f23353c;

    /* renamed from: d, reason: collision with root package name */
    public Messenger f23354d;

    /* compiled from: SessionLifecycleService.kt */
    public static final class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public boolean f23355a;

        /* renamed from: b, reason: collision with root package name */
        public long f23356b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<Messenger> f23357c;

        public a(Looper looper) {
            super(looper);
            this.f23357c = new ArrayList<>();
        }

        public final void a(Messenger messenger) throws RemoteException {
            if (this.f23355a) {
                Object objB = e.c().b(C5723C.class);
                l.e(objB, "Firebase.app[SessionGenerator::class.java]");
                c(messenger, ((C5723C) objB).b().f47470a);
                return;
            }
            Object objB2 = e.c().b(t.class);
            l.e(objB2, "Firebase.app[SessionDatastore::class.java]");
            String strA = ((t) objB2).a();
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + strA);
            if (strA != null) {
                c(messenger, strA);
            }
        }

        public final void b() throws RemoteException {
            Object objB = e.c().b(C5723C.class);
            l.e(objB, "Firebase.app[SessionGenerator::class.java]");
            C5723C c5723c = (C5723C) objB;
            int i = c5723c.f47352d + 1;
            c5723c.f47352d = i;
            String strA = i == 0 ? c5723c.f47351c : c5723c.a();
            int i10 = c5723c.f47352d;
            c5723c.f47349a.getClass();
            c5723c.f47353e = new v(strA, c5723c.f47351c, i10, System.currentTimeMillis() * 1000);
            c5723c.b();
            StringBuilder sb = new StringBuilder("Generated new session ");
            Object objB2 = e.c().b(C5723C.class);
            l.e(objB2, "Firebase.app[SessionGenerator::class.java]");
            sb.append(((C5723C) objB2).b().f47470a);
            Log.d("SessionLifecycleService", sb.toString());
            StringBuilder sb2 = new StringBuilder("Broadcasting new session: ");
            Object objB3 = e.c().b(C5723C.class);
            l.e(objB3, "Firebase.app[SessionGenerator::class.java]");
            sb2.append(((C5723C) objB3).b());
            Log.d("SessionLifecycleService", sb2.toString());
            Object objB4 = e.c().b(y.class);
            l.e(objB4, "Firebase.app[SessionFirelogPublisher::class.java]");
            Object objB5 = e.c().b(C5723C.class);
            l.e(objB5, "Firebase.app[SessionGenerator::class.java]");
            ((y) objB4).a(((C5723C) objB5).b());
            Iterator it = new ArrayList(this.f23357c).iterator();
            while (it.hasNext()) {
                Messenger it2 = (Messenger) it.next();
                l.e(it2, "it");
                a(it2);
            }
            Object objB6 = e.c().b(t.class);
            l.e(objB6, "Firebase.app[SessionDatastore::class.java]");
            Object objB7 = e.c().b(C5723C.class);
            l.e(objB7, "Firebase.app[SessionGenerator::class.java]");
            ((t) objB6).b(((C5723C) objB7).b().f47470a);
        }

        public final void c(Messenger messenger, String str) throws RemoteException {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message messageObtain = Message.obtain(null, 3, 0, 0);
                messageObtain.setData(bundle);
                messenger.send(messageObtain);
            } catch (DeadObjectException unused) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
                this.f23357c.remove(messenger);
            } catch (Exception e4) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e4);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0157  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r12) throws android.os.RemoteException {
            /*
                Method dump skipped, instructions count: 397
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionLifecycleService.a.handleMessage(android.os.Message):void");
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger messenger = Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
        if (messenger != null) {
            Message messageObtain = Message.obtain(null, 4, 0, 0);
            messageObtain.replyTo = messenger;
            a aVar = this.f23353c;
            if (aVar != null) {
                aVar.sendMessage(messageObtain);
            }
        }
        Messenger messenger2 = this.f23354d;
        if (messenger2 != null) {
            return messenger2.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.f23352b;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        l.e(looper, "handlerThread.looper");
        this.f23353c = new a(looper);
        this.f23354d = new Messenger(this.f23353c);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f23352b.quit();
    }
}
