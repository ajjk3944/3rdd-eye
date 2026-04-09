package s1;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import b.InterfaceC4037a;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    private static String f61114d;

    /* renamed from: g, reason: collision with root package name */
    private static d f61117g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f61118a;

    /* renamed from: b, reason: collision with root package name */
    private final NotificationManager f61119b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f61113c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static Set f61115e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f61116f = new Object();

    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    private static class b implements e {

        /* renamed from: a, reason: collision with root package name */
        final String f61120a;

        /* renamed from: b, reason: collision with root package name */
        final int f61121b;

        /* renamed from: c, reason: collision with root package name */
        final String f61122c;

        /* renamed from: d, reason: collision with root package name */
        final Notification f61123d;

        b(String str, int i10, String str2, Notification notification) {
            this.f61120a = str;
            this.f61121b = i10;
            this.f61122c = str2;
            this.f61123d = notification;
        }

        @Override // s1.n.e
        public void a(InterfaceC4037a interfaceC4037a) {
            interfaceC4037a.h0(this.f61120a, this.f61121b, this.f61122c, this.f61123d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f61120a + ", id:" + this.f61121b + ", tag:" + this.f61122c + "]";
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final ComponentName f61124a;

        /* renamed from: b, reason: collision with root package name */
        final IBinder f61125b;

        c(ComponentName componentName, IBinder iBinder) {
            this.f61124a = componentName;
            this.f61125b = iBinder;
        }
    }

    private static class d implements Handler.Callback, ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        private final Context f61126a;

        /* renamed from: b, reason: collision with root package name */
        private final HandlerThread f61127b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f61128c;

        /* renamed from: d, reason: collision with root package name */
        private final Map f61129d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        private Set f61130e = new HashSet();

        private static class a {

            /* renamed from: a, reason: collision with root package name */
            final ComponentName f61131a;

            /* renamed from: c, reason: collision with root package name */
            InterfaceC4037a f61133c;

            /* renamed from: b, reason: collision with root package name */
            boolean f61132b = false;

            /* renamed from: d, reason: collision with root package name */
            ArrayDeque f61134d = new ArrayDeque();

            /* renamed from: e, reason: collision with root package name */
            int f61135e = 0;

            a(ComponentName componentName) {
                this.f61131a = componentName;
            }
        }

        d(Context context) {
            this.f61126a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f61127b = handlerThread;
            handlerThread.start();
            this.f61128c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f61132b) {
                return true;
            }
            boolean zBindService = this.f61126a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f61131a), this, 33);
            aVar.f61132b = zBindService;
            if (zBindService) {
                aVar.f61135e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f61131a);
                this.f61126a.unbindService(this);
            }
            return aVar.f61132b;
        }

        private void b(a aVar) {
            if (aVar.f61132b) {
                this.f61126a.unbindService(this);
                aVar.f61132b = false;
            }
            aVar.f61133c = null;
        }

        private void c(e eVar) {
            j();
            for (a aVar : this.f61129d.values()) {
                aVar.f61134d.add(eVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = (a) this.f61129d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) this.f61129d.get(componentName);
            if (aVar != null) {
                aVar.f61133c = InterfaceC4037a.AbstractBinderC1135a.b(iBinder);
                aVar.f61135e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = (a) this.f61129d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f61131a + ", " + aVar.f61134d.size() + " queued tasks");
            }
            if (aVar.f61134d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f61133c == null) {
                i(aVar);
                return;
            }
            while (true) {
                e eVar = (e) aVar.f61134d.peek();
                if (eVar == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + eVar);
                    }
                    eVar.a(aVar.f61133c);
                    aVar.f61134d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f61131a);
                    }
                } catch (RemoteException e10) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f61131a, e10);
                }
            }
            if (aVar.f61134d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f61128c.hasMessages(3, aVar.f61131a)) {
                return;
            }
            int i10 = aVar.f61135e;
            int i11 = i10 + 1;
            aVar.f61135e = i11;
            if (i11 <= 6) {
                int i12 = (1 << i10) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
                }
                this.f61128c.sendMessageDelayed(this.f61128c.obtainMessage(3, aVar.f61131a), i12);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f61134d.size() + " tasks to " + aVar.f61131a + " after " + aVar.f61135e + " retries");
            aVar.f61134d.clear();
        }

        private void j() {
            Set setC = n.c(this.f61126a);
            if (setC.equals(this.f61130e)) {
                return;
            }
            this.f61130e = setC;
            List<ResolveInfo> listQueryIntentServices = this.f61126a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setC.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f61129d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f61129d.put(componentName2, new a(componentName2));
                }
            }
            Iterator it = this.f61129d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    b((a) entry.getValue());
                    it.remove();
                }
            }
        }

        public void h(e eVar) {
            this.f61128c.obtainMessage(0, eVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((e) message.obj);
                return true;
            }
            if (i10 == 1) {
                c cVar = (c) message.obj;
                e(cVar.f61124a, cVar.f61125b);
                return true;
            }
            if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f61128c.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f61128c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    private interface e {
        void a(InterfaceC4037a interfaceC4037a);
    }

    private n(Context context) {
        this.f61118a = context;
        this.f61119b = (NotificationManager) context.getSystemService("notification");
    }

    public static n b(Context context) {
        return new n(context);
    }

    public static Set c(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f61113c) {
            if (string != null) {
                try {
                    if (!string.equals(f61114d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f61115e = hashSet;
                        f61114d = string;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            set = f61115e;
        }
        return set;
    }

    private void f(e eVar) {
        synchronized (f61116f) {
            try {
                if (f61117g == null) {
                    f61117g = new d(this.f61118a.getApplicationContext());
                }
                f61117g.h(eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean g(Notification notification) {
        Bundle bundleA = k.a(notification);
        return bundleA != null && bundleA.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        return a.a(this.f61119b);
    }

    public void d(int i10, Notification notification) {
        e(null, i10, notification);
    }

    public void e(String str, int i10, Notification notification) {
        if (!g(notification)) {
            this.f61119b.notify(str, i10, notification);
        } else {
            f(new b(this.f61118a.getPackageName(), i10, str, notification));
            this.f61119b.cancel(str, i10);
        }
    }
}
