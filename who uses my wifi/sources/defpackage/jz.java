package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jz implements Handler.Callback {
    public static final Status t = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status u = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object v = new Object();
    public static jz w;
    public long f;
    public boolean g;
    public q01 h;
    public uc1 i;
    public final Context j;
    public final fz k;
    public final vq2 l;
    public final AtomicInteger m;
    public final AtomicInteger n;
    public final ConcurrentHashMap o;
    public final u8 p;
    public final u8 q;
    public final wc1 r;
    public volatile boolean s;

    public jz(Context context, Looper looper) {
        fz fzVar = fz.d;
        this.f = 10000L;
        this.g = false;
        this.m = new AtomicInteger(1);
        this.n = new AtomicInteger(0);
        this.o = new ConcurrentHashMap(5, 0.75f, 1);
        this.p = new u8(0);
        this.q = new u8(0);
        this.s = true;
        this.j = context;
        wc1 wc1Var = new wc1(looper, this, 0);
        this.r = wc1Var;
        this.k = fzVar;
        this.l = new vq2(17);
        PackageManager packageManager = context.getPackageManager();
        if (i30.u == null) {
            i30.u = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (i30.u.booleanValue()) {
            this.s = false;
        }
        wc1Var.sendMessage(wc1Var.obtainMessage(6));
    }

    public static Status c(c5 c5Var, rh rhVar) {
        String str = (String) c5Var.b.h;
        String strValueOf = String.valueOf(rhVar);
        return new Status(17, ex0.m(new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", strValueOf), rhVar.h, rhVar);
    }

    public static jz e(Context context) {
        jz jzVar;
        HandlerThread handlerThread;
        synchronized (v) {
            if (w == null) {
                synchronized (nf4.g) {
                    try {
                        handlerThread = nf4.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            nf4.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = nf4.i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = fz.c;
                w = new jz(applicationContext, looper);
            }
            jzVar = w;
        }
        return jzVar;
    }

    public final boolean a() {
        if (this.g) {
            return false;
        }
        tq0 tq0Var = (tq0) sq0.k().g;
        if (tq0Var != null && !tq0Var.g) {
            return false;
        }
        int i = ((SparseIntArray) this.l.g).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean b(rh rhVar, int i) throws Resources.NotFoundException {
        fz fzVar = this.k;
        fzVar.getClass();
        Context context = this.j;
        if (!a30.f(context)) {
            int i2 = rhVar.g;
            PendingIntent activity = rhVar.h;
            if (!((i2 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentB = fzVar.b(i2, context, null);
                if (intentB != null) {
                    activity = PendingIntent.getActivity(context, 0, intentB, 201326592);
                }
            }
            if (activity != null) {
                int i3 = GoogleApiActivity.g;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                fzVar.g(context, i2, PendingIntent.getActivity(context, 0, intent, tc1.a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final xb1 d(ez ezVar) {
        c5 c5Var = ezVar.j;
        ConcurrentHashMap concurrentHashMap = this.o;
        xb1 xb1Var = (xb1) concurrentHashMap.get(c5Var);
        if (xb1Var == null) {
            xb1Var = new xb1(this, ezVar);
            concurrentHashMap.put(c5Var, xb1Var);
        }
        if (xb1Var.g.l()) {
            this.q.add(c5Var);
        }
        xb1Var.j();
        return xb1Var;
    }

    public final void f(rh rhVar, int i) {
        if (b(rhVar, i)) {
            return;
        }
        wc1 wc1Var = this.r;
        wc1Var.sendMessage(wc1Var.obtainMessage(5, i, 0, rhVar));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        xb1 xb1Var;
        ju[] juVarArrB;
        int i = 10;
        int i2 = 7;
        switch (message.what) {
            case 1:
                this.f = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.r.removeMessages(12);
                for (c5 c5Var : this.o.keySet()) {
                    wc1 wc1Var = this.r;
                    wc1Var.sendMessageDelayed(wc1Var.obtainMessage(12, c5Var), this.f);
                }
                return true;
            case 2:
                message.obj.getClass();
                throw new ClassCastException();
            case 3:
                for (xb1 xb1Var2 : this.o.values()) {
                    ou1.g(xb1Var2.r.r);
                    xb1Var2.p = null;
                    xb1Var2.j();
                }
                return true;
            case 4:
            case 8:
            case 13:
                jc1 jc1Var = (jc1) message.obj;
                xb1 xb1VarD = (xb1) this.o.get(jc1Var.c.j);
                if (xb1VarD == null) {
                    xb1VarD = d(jc1Var.c);
                }
                if (!xb1VarD.g.l() || this.n.get() == jc1Var.b) {
                    xb1VarD.k(jc1Var.a);
                    return true;
                }
                jc1Var.a.c(t);
                xb1VarD.m();
                return true;
            case 5:
                int i3 = message.arg1;
                rh rhVar = (rh) message.obj;
                Iterator it = this.o.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        xb1Var = (xb1) it.next();
                        if (xb1Var.l == i3) {
                        }
                    } else {
                        xb1Var = null;
                    }
                }
                if (xb1Var == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i3);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    return true;
                }
                int i4 = rhVar.g;
                if (i4 != 13) {
                    xb1Var.b(c(xb1Var.h, rhVar));
                    return true;
                }
                this.k.getClass();
                int i5 = oz.c;
                String strA = rh.a(i4);
                String str = rhVar.i;
                xb1Var.b(new Status(17, ex0.m(new StringBuilder(String.valueOf(strA).length() + 69 + String.valueOf(str).length()), "Error resolution was canceled by the user, original error message: ", strA, ": ", str), null, null));
                return true;
            case 6:
                if (this.j.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.j.getApplicationContext();
                    j9 j9Var = j9.j;
                    synchronized (j9Var) {
                        try {
                            if (!j9Var.i) {
                                application.registerActivityLifecycleCallbacks(j9Var);
                                application.registerComponentCallbacks(j9Var);
                                j9Var.i = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    wb1 wb1Var = new wb1(this);
                    synchronized (j9Var) {
                        j9Var.h.add(wb1Var);
                    }
                    AtomicBoolean atomicBoolean = j9Var.f;
                    AtomicBoolean atomicBoolean2 = j9Var.g;
                    if (!atomicBoolean2.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean.set(true);
                        }
                    }
                    if (!atomicBoolean.get()) {
                        this.f = 300000L;
                        return true;
                    }
                }
                return true;
            case 7:
                d((ez) message.obj);
                return true;
            case 9:
                if (this.o.containsKey(message.obj)) {
                    xb1 xb1Var3 = (xb1) this.o.get(message.obj);
                    ou1.g(xb1Var3.r.r);
                    if (xb1Var3.n) {
                        xb1Var3.j();
                        return true;
                    }
                }
                return true;
            case 10:
                u8 u8Var = this.q;
                u8Var.getClass();
                o8 o8Var = new o8(u8Var);
                while (o8Var.hasNext()) {
                    xb1 xb1Var4 = (xb1) this.o.remove((c5) o8Var.next());
                    if (xb1Var4 != null) {
                        xb1Var4.m();
                    }
                }
                this.q.clear();
                return true;
            case 11:
                if (this.o.containsKey(message.obj)) {
                    xb1 xb1Var5 = (xb1) this.o.get(message.obj);
                    jz jzVar = xb1Var5.r;
                    ou1.g(jzVar.r);
                    boolean z = xb1Var5.n;
                    if (z) {
                        c5 c5Var2 = xb1Var5.h;
                        wc1 wc1Var2 = xb1Var5.r.r;
                        if (z) {
                            wc1Var2.removeMessages(11, c5Var2);
                            wc1Var2.removeMessages(9, c5Var2);
                            xb1Var5.n = false;
                        }
                        xb1Var5.b(jzVar.k.c(jzVar.j, gz.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        xb1Var5.g.d("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (this.o.containsKey(message.obj)) {
                    xb1 xb1Var6 = (xb1) this.o.get(message.obj);
                    ou1.g(xb1Var6.r.r);
                    v4 v4Var = xb1Var6.g;
                    if (v4Var.a() && xb1Var6.k.size() == 0) {
                        tb1 tb1Var = xb1Var6.i;
                        if (tb1Var.a.isEmpty() && tb1Var.b.isEmpty()) {
                            v4Var.d("Timing out service connection.");
                            return true;
                        }
                        xb1Var6.g();
                        return true;
                    }
                }
                return true;
            case 14:
                message.obj.getClass();
                throw new ClassCastException();
            case 15:
                yb1 yb1Var = (yb1) message.obj;
                if (this.o.containsKey(yb1Var.a)) {
                    xb1 xb1Var7 = (xb1) this.o.get(yb1Var.a);
                    if (xb1Var7.o.contains(yb1Var) && !xb1Var7.n) {
                        if (xb1Var7.g.a()) {
                            xb1Var7.d();
                            return true;
                        }
                        xb1Var7.j();
                        return true;
                    }
                }
                return true;
            case 16:
                yb1 yb1Var2 = (yb1) message.obj;
                if (this.o.containsKey(yb1Var2.a)) {
                    xb1 xb1Var8 = (xb1) this.o.get(yb1Var2.a);
                    ArrayList arrayList = xb1Var8.o;
                    jz jzVar2 = xb1Var8.r;
                    LinkedList<cc1> linkedList = xb1Var8.f;
                    if (arrayList.remove(yb1Var2)) {
                        jzVar2.r.removeMessages(15, yb1Var2);
                        jzVar2.r.removeMessages(16, yb1Var2);
                        ju juVar = yb1Var2.b;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (cc1 cc1Var : linkedList) {
                            if (cc1Var != null && (juVarArrB = cc1Var.b(xb1Var8)) != null) {
                                int length = juVarArrB.length;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= length) {
                                        break;
                                    }
                                    if (!a30.c(juVarArrB[i6], juVar)) {
                                        i6++;
                                    } else if (i6 >= 0) {
                                        arrayList2.add(cc1Var);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            cc1 cc1Var2 = (cc1) arrayList2.get(i7);
                            linkedList.remove(cc1Var2);
                            cc1Var2.d(new d41(juVar));
                        }
                    }
                }
                return true;
            case 17:
                q01 q01Var = this.h;
                if (q01Var != null) {
                    if (q01Var.f > 0 || a()) {
                        if (this.i == null) {
                            this.i = new uc1(this.j, uc1.n, r01.b, dz.b);
                        }
                        uc1 uc1Var = this.i;
                        uc1Var.getClass();
                        sq0 sq0Var = new sq0(i2);
                        ju[] juVarArr = {a30.l};
                        sq0Var.g = new kf3(i, q01Var);
                        uc1Var.b(2, new rb(sq0Var, juVarArr, false, 0));
                    }
                    this.h = null;
                    return true;
                }
                return true;
            case 18:
                ic1 ic1Var = (ic1) message.obj;
                if (ic1Var.c == 0) {
                    q01 q01Var2 = new q01(ic1Var.b, Arrays.asList(ic1Var.a));
                    if (this.i == null) {
                        this.i = new uc1(this.j, uc1.n, r01.b, dz.b);
                    }
                    uc1 uc1Var2 = this.i;
                    uc1Var2.getClass();
                    sq0 sq0Var2 = new sq0(i2);
                    ju[] juVarArr2 = {a30.l};
                    sq0Var2.g = new kf3(i, q01Var2);
                    uc1Var2.b(2, new rb(sq0Var2, juVarArr2, false, 0));
                    return true;
                }
                q01 q01Var3 = this.h;
                if (q01Var3 != null) {
                    List list = q01Var3.g;
                    if (q01Var3.f != ic1Var.b || (list != null && list.size() >= ic1Var.d)) {
                        this.r.removeMessages(17);
                        q01 q01Var4 = this.h;
                        if (q01Var4 != null) {
                            if (q01Var4.f > 0 || a()) {
                                if (this.i == null) {
                                    this.i = new uc1(this.j, uc1.n, r01.b, dz.b);
                                }
                                uc1 uc1Var3 = this.i;
                                uc1Var3.getClass();
                                sq0 sq0Var3 = new sq0(i2);
                                ju[] juVarArr3 = {a30.l};
                                sq0Var3.g = new kf3(i, q01Var4);
                                uc1Var3.b(2, new rb(sq0Var3, juVarArr3, false, 0));
                            }
                            this.h = null;
                        }
                    } else {
                        q01 q01Var5 = this.h;
                        re0 re0Var = ic1Var.a;
                        if (q01Var5.g == null) {
                            q01Var5.g = new ArrayList();
                        }
                        q01Var5.g.add(re0Var);
                    }
                }
                if (this.h == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(ic1Var.a);
                    this.h = new q01(ic1Var.b, arrayList3);
                    wc1 wc1Var3 = this.r;
                    wc1Var3.sendMessageDelayed(wc1Var3.obtainMessage(17), ic1Var.c);
                    return true;
                }
                return true;
            case 19:
                this.g = false;
                return true;
            default:
                return false;
        }
    }
}
