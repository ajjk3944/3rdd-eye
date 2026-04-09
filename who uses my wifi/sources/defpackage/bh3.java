package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bh3 implements Runnable {
    public final /* synthetic */ int f;
    public Object g;

    public /* synthetic */ bh3() {
        this.f = 6;
    }

    private final void a() {
        gc4 gc4Var = (gc4) this.g;
        try {
            synchronized (gc4Var) {
            }
            try {
                gc4Var.a.a(gc4Var.c, gc4Var.d);
            } finally {
                gc4Var.b(true);
            }
        } catch (b84 e) {
            a30.C("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final /* synthetic */ void b() {
        wf4 wf4Var = (wf4) this.g;
        Object obj = wf4Var.a;
        synchronized (obj) {
            try {
                if (wf4Var.m) {
                    return;
                }
                long j = wf4Var.l - 1;
                wf4Var.l = j;
                if (j > 0) {
                    return;
                }
                if (j >= 0) {
                    wf4Var.a();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (obj) {
                    wf4Var.n = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        n70 n70Var;
        int i = 6;
        switch (this.f) {
            case 0:
                synchronized (((ft3) this.g).h) {
                    ((gi4) ((ft3) this.g).i.h).f();
                }
                return;
            case 1:
                zj3 zj3Var = (zj3) this.g;
                n70 n70VarC = ((ld2) zj3Var.d).c(new w53(10, zj3Var));
                zj3Var.c.d(53, n70VarC);
                zj3Var.g = n70VarC;
                return;
            case 2:
                ak3 ak3Var = (ak3) this.g;
                ra0 ra0Var = new ra0(i, ak3Var);
                try {
                    Object systemService = ak3Var.a.getSystemService("connectivity");
                    if (systemService == null) {
                        throw null;
                    }
                    ((ConnectivityManager) systemService).registerDefaultNetworkCallback(ra0Var);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                ek3 ek3Var = (ek3) this.g;
                ot1 ot1Var = new ot1(1, ek3Var);
                try {
                    Object systemService2 = ek3Var.a.getSystemService("appops");
                    if (systemService2 == null) {
                        throw null;
                    }
                    ((AppOpsManager) systemService2).startWatchingActive(ek3.g, ek3Var.b, ot1Var);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 4:
                x03 x03Var = ((sk3) this.g).a;
                ((er3) x03Var.i).a("unlinkToDeath", new Object[0]);
                kk3 kk3Var = (kk3) x03Var.o;
                kk3Var.getClass();
                ((sb1) kk3Var).g.unlinkToDeath((tk3) x03Var.m, 0);
                x03Var.o = null;
                x03Var.f = false;
                return;
            case 5:
                x03 x03Var2 = (x03) this.g;
                if (((kk3) x03Var2.o) != null) {
                    ((er3) x03Var2.i).a("Unbind from service.", new Object[0]);
                    Context context = (Context) x03Var2.g;
                    sk3 sk3Var = (sk3) x03Var2.n;
                    sk3Var.getClass();
                    context.unbindService(sk3Var);
                    x03Var2.f = false;
                    x03Var2.o = null;
                    x03Var2.n = null;
                    ArrayList arrayList = (ArrayList) x03Var2.k;
                    synchronized (arrayList) {
                        arrayList.clear();
                    }
                    return;
                }
                return;
            case 6:
                yq3 yq3Var = (yq3) this.g;
                if (yq3Var == null || (n70Var = yq3Var.m) == null) {
                    return;
                }
                this.g = null;
                if (n70Var.isDone()) {
                    yq3Var.m(n70Var);
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = yq3Var.n;
                    yq3Var.n = null;
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
                            yq3Var.e(new xq3(string));
                            throw th;
                        }
                    }
                    String string2 = n70Var.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 2 + string2.length());
                    sb2.append(string);
                    sb2.append(": ");
                    sb2.append(string2);
                    yq3Var.e(new xq3(sb2.toString()));
                    return;
                } finally {
                    n70Var.cancel(true);
                }
            case 7:
                ra4 ra4Var = (ra4) this.g;
                if (ra4Var.b) {
                    if (!(ra4Var.k() && ra4Var.l()) && ((Boolean) l02.b.w()).booleanValue()) {
                        synchronized (ra4Var.a) {
                            try {
                                if (Looper.getMainLooper() == null) {
                                    return;
                                }
                                if (ra4Var.e == null) {
                                    ra4Var.e = new yv1();
                                }
                                yv1 yv1Var = ra4Var.e;
                                synchronized (yv1Var.h) {
                                    if (yv1Var.f) {
                                        gi2.U("Content hash thread already started, quitting...");
                                    } else {
                                        yv1Var.f = true;
                                        yv1Var.start();
                                    }
                                }
                                gi2.f0("start fetching content...");
                                return;
                            } catch (Throwable th2) {
                                throw th2;
                            } finally {
                            }
                        }
                    }
                    return;
                }
                return;
            case 8:
                Context context2 = (Context) ((xb4) this.g).g;
                long j = xb4.I(context2).getLong("app_set_id_last_used_time", -1L);
                long j2 = j != -1 ? j + 33696000000L : -1L;
                if (j2 == -1 || System.currentTimeMillis() <= j2) {
                    return;
                }
                if (!xb4.I(context2).edit().remove("app_set_id").commit()) {
                    String strValueOf = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", strValueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(strValueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context2.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String strValueOf2 = String.valueOf(context2.getPackageName());
                Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(strValueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            case 9:
                ya4 ya4Var = (ya4) this.g;
                String str = v23.a;
                int iGenerateAudioSessionId = bd2.B(ya4Var.l).generateAudioSessionId();
                b = iGenerateAudioSessionId != -1 ? iGenerateAudioSessionId : (byte) 0;
                fw3 fw3Var = ya4Var.H;
                Integer numValueOf = Integer.valueOf(b);
                fw3Var.k = numValueOf;
                n62 n62Var = new n62(fw3Var, numValueOf, 15);
                d13 d13Var = (d13) fw3Var.h;
                if (d13Var.a.getLooper().getThread().isAlive()) {
                    d13Var.d(n62Var);
                    return;
                }
                return;
            case 10:
                md4 md4Var = ((jb4) this.g).A;
                md4Var.s(md4Var.t(), 1034, new t24(25, b));
                return;
            case 11:
                a();
                return;
            case 12:
                md4 md4Var2 = (md4) this.g;
                md4Var2.s(md4Var2.t(), 1028, new hd4(6));
                md4Var2.k.e();
                return;
            case 13:
                df4 df4Var = (df4) this.g;
                if (df4Var.Y >= 300000) {
                    ((ef4) df4Var.n.g).K0 = true;
                    df4Var.Y = 0L;
                    return;
                }
                return;
            case 14:
                b();
                return;
            case 15:
                ((uh) this.g).d();
                return;
            case 16:
                bi4 bi4Var = (bi4) ((zj4) this.g);
                for (ki4 ki4Var : bi4Var.w) {
                    ki4Var.i(true);
                    if (ki4Var.g != null) {
                        ki4Var.g = null;
                        ki4Var.f = null;
                    }
                }
                jr3 jr3Var = bi4Var.p;
                if (((lf1) jr3Var.h) != null) {
                    jr3Var.h = null;
                }
                jr3Var.i = null;
                return;
            default:
                ((md1) this.g).h.a();
                return;
        }
    }

    public /* synthetic */ bh3(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    public /* synthetic */ bh3(jb4 jb4Var, int i) {
        this.f = 10;
        this.g = jb4Var;
    }
}
