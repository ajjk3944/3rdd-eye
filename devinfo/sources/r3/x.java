package r3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x implements Handler.Callback, ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32785a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f32786b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f32787c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public HashSet f32788d = new HashSet();

    public x(Context context) {
        this.f32785a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f32786b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(w wVar) {
        boolean z3;
        ArrayDeque arrayDeque = wVar.f32783d;
        ComponentName componentName = wVar.f32780a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (wVar.f32781b) {
            z3 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f32785a;
            boolean zBindService = context.bindService(component, this, 33);
            wVar.f32781b = zBindService;
            if (zBindService) {
                wVar.f32784e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z3 = wVar.f32781b;
        }
        if (!z3 || wVar.f32782c == null) {
            b(wVar);
            return;
        }
        while (true) {
            u uVar = (u) arrayDeque.peek();
            if (uVar == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + uVar);
                }
                uVar.a(wVar.f32782c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e2) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e2);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(wVar);
    }

    public final void b(w wVar) {
        ComponentName componentName = wVar.f32780a;
        ArrayDeque arrayDeque = wVar.f32783d;
        Handler handler = this.f32786b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i4 = wVar.f32784e;
        int i10 = i4 + 1;
        wVar.f32784e = i10;
        if (i10 <= 6) {
            int i11 = (1 << i4) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i11);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + wVar.f32784e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i4 = message.what;
        c.c cVar = null;
        if (i4 == 0) {
            u uVar = (u) message.obj;
            String string = Settings.Secure.getString(this.f32785a.getContentResolver(), "enabled_notification_listeners");
            synchronized (y.f32789c) {
                if (string != null) {
                    try {
                        if (!string.equals(y.f32790d)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            y.f32791e = hashSet2;
                            y.f32790d = string;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                hashSet = y.f32791e;
            }
            if (!hashSet.equals(this.f32788d)) {
                this.f32788d = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.f32785a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!this.f32787c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f32787c.put(componentName2, new w(componentName2));
                    }
                }
                Iterator it2 = this.f32787c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        w wVar = (w) entry.getValue();
                        if (wVar.f32781b) {
                            this.f32785a.unbindService(this);
                            wVar.f32781b = false;
                        }
                        wVar.f32782c = null;
                        it2.remove();
                    }
                }
            }
            for (w wVar2 : this.f32787c.values()) {
                wVar2.f32783d.add(uVar);
                a(wVar2);
            }
        } else if (i4 == 1) {
            v vVar = (v) message.obj;
            ComponentName componentName3 = vVar.f32778a;
            IBinder iBinder = vVar.f32779b;
            w wVar3 = (w) this.f32787c.get(componentName3);
            if (wVar3 != null) {
                int i10 = c.b.f2352a;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c.c.F8);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c.c)) {
                        c.a aVar = new c.a();
                        aVar.f2351a = iBinder;
                        cVar = aVar;
                    } else {
                        cVar = (c.c) iInterfaceQueryLocalInterface;
                    }
                }
                wVar3.f32782c = cVar;
                wVar3.f32784e = 0;
                a(wVar3);
                return true;
            }
        } else if (i4 == 2) {
            w wVar4 = (w) this.f32787c.get((ComponentName) message.obj);
            if (wVar4 != null) {
                if (wVar4.f32781b) {
                    this.f32785a.unbindService(this);
                    wVar4.f32781b = false;
                }
                wVar4.f32782c = null;
                return true;
            }
        } else {
            if (i4 != 3) {
                return false;
            }
            w wVar5 = (w) this.f32787c.get((ComponentName) message.obj);
            if (wVar5 != null) {
                a(wVar5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f32786b.obtainMessage(1, new v(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f32786b.obtainMessage(2, componentName).sendToTarget();
    }
}
