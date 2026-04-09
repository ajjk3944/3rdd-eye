package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.util.Log;
import android.webkit.WebView;
import androidx.recyclerview.widget.C0305b;
import f4.InterfaceFutureC2326a;
import j$.util.Objects;
import java.net.HttpURLConnection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class Fu implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8218a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8219b;

    public /* synthetic */ Fu() {
        this.f8218a = 13;
    }

    private final void a() {
        Hu hu = (Hu) this.f8219b;
        synchronized (hu) {
            HashMap map = hu.f9018c;
            ArrayList arrayList = new ArrayList(map.keySet());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ScheduledFuture scheduledFuture = (ScheduledFuture) arrayList.get(i);
                Gu gu = (Gu) map.get(scheduledFuture);
                if (gu != null && scheduledFuture != null && !scheduledFuture.isDone()) {
                    scheduledFuture.cancel(false);
                    map.remove(scheduledFuture);
                    p2.j.f22785C.f22797k.getClass();
                    long jCurrentTimeMillis = gu.f8475b - System.currentTimeMillis();
                    Runnable runnable = gu.f8474a;
                    long jMax = Math.max(0L, jCurrentTimeMillis);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    hu.a(runnable, jMax);
                }
            }
        }
    }

    private final /* synthetic */ void b() {
        C0447Bq c0447Bq = (C0447Bq) this.f8219b;
        if (((InterfaceC2164yA) c0447Bq.f7453j) != null) {
            ((YD) c0447Bq.f7448d).c("Unbind from service.", new Object[0]);
            Context context = (Context) c0447Bq.f7446b;
            HA ha = (HA) c0447Bq.i;
            ha.getClass();
            context.unbindService(ha);
            c0447Bq.f7445a = false;
            c0447Bq.f7453j = null;
            c0447Bq.i = null;
            ArrayList arrayList = (ArrayList) c0447Bq.f7450f;
            synchronized (arrayList) {
                arrayList.clear();
            }
        }
    }

    private final void c() {
        C1908tO c1908tO = (C1908tO) this.f8219b;
        try {
            synchronized (c1908tO) {
            }
            try {
                c1908tO.f16903a.c(c1908tO.f16905c, c1908tO.f16906d);
            } finally {
                c1908tO.b(true);
            }
        } catch (HN e6) {
            AbstractC2022vd.K("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e6);
            throw new RuntimeException(e6);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC2326a interfaceFutureC2326a;
        switch (this.f8218a) {
            case 0:
                a();
                return;
            case 1:
                Zv zv = (Zv) this.f8219b;
                AtomicBoolean atomicBoolean = zv.f12985e;
                AudioManager audioManager = zv.f12983c;
                int streamVolume = audioManager.getStreamVolume(3);
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                float f2 = 0.0f;
                if (streamMaxVolume > 0 && streamVolume > 0) {
                    f2 = streamVolume / streamMaxVolume;
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                }
                atomicBoolean.set(false);
                if (((Float) zv.f12984d.getAndSet(Float.valueOf(f2))).floatValue() != f2) {
                    zv.f12981a.post(new Yv(this, f2));
                    return;
                }
                return;
            case 2:
                ((WebView) this.f8219b).destroy();
                return;
            case 3:
                C1879sw c1879sw = ((C1933tw) this.f8219b).f17002e;
                c1879sw.getClass();
                AsyncTaskC2095ww asyncTaskC2095ww = new AsyncTaskC2095ww(c1879sw);
                C2041vw c2041vw = (C2041vw) c1879sw.f16824c;
                asyncTaskC2095ww.f17191a = c2041vw;
                ArrayDeque arrayDeque = (ArrayDeque) c2041vw.f17370c;
                arrayDeque.add(asyncTaskC2095ww);
                if (((AbstractAsyncTaskC1987uw) c2041vw.f17371d) == null) {
                    AbstractAsyncTaskC1987uw abstractAsyncTaskC1987uw = (AbstractAsyncTaskC1987uw) arrayDeque.poll();
                    c2041vw.f17371d = abstractAsyncTaskC1987uw;
                    if (abstractAsyncTaskC1987uw != null) {
                        abstractAsyncTaskC1987uw.executeOnExecutor((ThreadPoolExecutor) c2041vw.f17369b, new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                c3.f fVar = (c3.f) this.f8219b;
                BinderC1126ex binderC1126ex = new BinderC1126ex();
                Log.d("GASS", "Clearcut logging disabled");
                fVar.f5902a.g(new C0963bx(binderC1126ex));
                return;
            case 5:
                ((HttpURLConnection) this.f8219b).disconnect();
                return;
            case 6:
                C2260zz c2260zz = (C2260zz) this.f8219b;
                Gz gz = (Gz) c2260zz.f17996a.c();
                long j6 = c2260zz.f18000e;
                if (j6 > 0) {
                    gz.f8493e.a(new Fu(7, gz), j6);
                    return;
                } else {
                    gz.a();
                    return;
                }
            case 7:
                ((Gz) this.f8219b).a();
                return;
            case 8:
                C1463lA c1463lA = (C1463lA) this.f8219b;
                InterfaceFutureC2326a interfaceFutureC2326aB = ((C0623Mf) c1463lA.f15356d).b(new Zs(9, c1463lA));
                c1463lA.f15355c.e(53, interfaceFutureC2326aB);
                c1463lA.f15359g = interfaceFutureC2326aB;
                return;
            case 9:
                C1517mA c1517mA = (C1517mA) this.f8219b;
                if (Build.VERSION.SDK_INT < 24) {
                    return;
                }
                A1.r rVar = new A1.r(6, c1517mA);
                try {
                    Object systemService = c1517mA.f15590a.getSystemService("connectivity");
                    if (systemService == null) {
                        throw null;
                    }
                    ((ConnectivityManager) systemService).registerDefaultNetworkCallback(rVar);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 10:
                C1786rA c1786rA = (C1786rA) this.f8219b;
                C0973c7 c0973c7 = new C0973c7(1, c1786rA);
                try {
                    Object systemService2 = c1786rA.f16473a.getSystemService("appops");
                    if (systemService2 == null) {
                        throw null;
                    }
                    ((AppOpsManager) systemService2).startWatchingActive(C1786rA.f16472g, c1786rA.f16474b, c0973c7);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 11:
                C0447Bq c0447Bq = ((HA) this.f8219b).f8872a;
                ((YD) c0447Bq.f7448d).c("unlinkToDeath", new Object[0]);
                InterfaceC2164yA interfaceC2164yA = (InterfaceC2164yA) c0447Bq.f7453j;
                interfaceC2164yA.getClass();
                interfaceC2164yA.asBinder().unlinkToDeath((IA) c0447Bq.f7452h, 0);
                c0447Bq.f7453j = null;
                c0447Bq.f7445a = false;
                return;
            case 12:
                b();
                return;
            case 13:
                RD rd = (RD) this.f8219b;
                if (rd == null || (interfaceFutureC2326a = rd.f10872h) == null) {
                    return;
                }
                this.f8219b = null;
                if (interfaceFutureC2326a.isDone()) {
                    rd.m(interfaceFutureC2326a);
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = rd.i;
                    rd.i = null;
                    String string = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (jAbs > 10) {
                                StringBuilder sb = new StringBuilder(String.valueOf(jAbs).length() + 55);
                                sb.append("Timed out (timeout delayed by ");
                                sb.append(jAbs);
                                sb.append(" ms after scheduled time)");
                                string = sb.toString();
                            }
                        } catch (Throwable th) {
                            rd.e(new QD(string));
                            throw th;
                        }
                    }
                    String string2 = interfaceFutureC2326a.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 2 + string2.length());
                    sb2.append(string);
                    sb2.append(": ");
                    sb2.append(string2);
                    rd.e(new QD(sb2.toString()));
                    return;
                } finally {
                    interfaceFutureC2326a.cancel(true);
                }
            case 14:
                UN un = (UN) this.f8219b;
                String str = Vt.f12096a;
                int iGenerateAudioSessionId = AbstractC0709Rg.b(un.f11675f).generateAudioSessionId();
                int i = iGenerateAudioSessionId != -1 ? iGenerateAudioSessionId : 0;
                C0305b c0305b = un.f11657P;
                Integer numValueOf = Integer.valueOf(i);
                c0305b.f5435f = numValueOf;
                CD cd = new CD(c0305b, 21, numValueOf);
                C1231gt c1231gt = (C1231gt) c0305b.f5432c;
                if (c1231gt.f14397a.getLooper().getThread().isAlive()) {
                    c1231gt.e(cd);
                    return;
                }
                return;
            case 15:
                GO go = ((ZN) this.f8219b).f12837J;
                go.t(go.u(), 1034, new DO(4));
                return;
            case 16:
                c();
                return;
            case 17:
                GO go2 = (GO) this.f8219b;
                go2.t(go2.u(), 1028, new DO(26));
                go2.f8369f.e();
                return;
            case 18:
                C1801rP c1801rP = (C1801rP) this.f8219b;
                if (c1801rP.f16538U >= 300000) {
                    ((C1909tP) c1801rP.f16551l.f13695b).f16924e1 = true;
                    c1801rP.f16538U = 0L;
                    return;
                }
                return;
            default:
                GP gp = (GP) this.f8219b;
                Object obj = gp.f8372a;
                synchronized (obj) {
                    try {
                        if (gp.f8383m) {
                            return;
                        }
                        long j7 = gp.f8382l - 1;
                        gp.f8382l = j7;
                        if (j7 > 0) {
                            return;
                        }
                        if (j7 >= 0) {
                            gp.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (obj) {
                            gp.f8384n = illegalStateException;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ Fu(int i, Object obj) {
        this.f8218a = i;
        this.f8219b = obj;
    }

    public /* synthetic */ Fu(ZN zn, int i) {
        this.f8218a = 15;
        this.f8219b = zn;
    }

    public Fu(C1664ow c1664ow) {
        this.f8218a = 2;
        this.f8219b = c1664ow.f16079e;
    }

    public Fu(C1933tw c1933tw) {
        this.f8218a = 3;
        Objects.requireNonNull(c1933tw);
        this.f8219b = c1933tw;
    }
}
