package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.util.Log;
import android.webkit.WebView;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.net.HttpURLConnection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class du0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10551a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10552b;

    public /* synthetic */ du0() {
        this.f10551a = 12;
    }

    private final /* synthetic */ void a() {
        xi0 xi0Var = (xi0) this.f10552b;
        if (((k21) xi0Var.j) != null) {
            ((ka1) xi0Var.f18395d).a("Unbind from service.", new Object[0]);
            Context context = (Context) xi0Var.f18392a;
            t21 t21Var = (t21) xi0Var.f18399i;
            t21Var.getClass();
            context.unbindService(t21Var);
            xi0Var.f18393b = false;
            xi0Var.j = null;
            xi0Var.f18399i = null;
            ArrayList arrayList = (ArrayList) xi0Var.f18397f;
            synchronized (arrayList) {
                arrayList.clear();
            }
        }
    }

    private final void b() {
        hu1 hu1Var = (hu1) this.f10552b;
        try {
            synchronized (hu1Var) {
            }
            try {
                hu1Var.f11977a.b(hu1Var.f11979c, hu1Var.f11980d);
            } finally {
                hu1Var.b(true);
            }
        } catch (us1 e2) {
            ls.H("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        vd.b bVar;
        int i4 = 3;
        switch (this.f10551a) {
            case 0:
                eu0 eu0Var = (eu0) this.f10552b;
                AtomicBoolean atomicBoolean = eu0Var.f10869e;
                AudioManager audioManager = eu0Var.f10867c;
                int streamVolume = audioManager.getStreamVolume(3);
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                float f10 = 0.0f;
                if (streamMaxVolume > 0 && streamVolume > 0) {
                    f10 = streamVolume / streamMaxVolume;
                    if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                }
                atomicBoolean.set(false);
                if (((Float) eu0Var.f10868d.getAndSet(Float.valueOf(f10))).floatValue() != f10) {
                    eu0Var.f10865a.post(new cu0(this, f10));
                    return;
                }
                return;
            case 1:
                ((WebView) this.f10552b).destroy();
                return;
            case 2:
                l90 l90Var = ((yu0) this.f10552b).f18873e;
                l90Var.getClass();
                bv0 bv0Var = new bv0(l90Var);
                av0 av0Var = (av0) l90Var.f13427c;
                bv0Var.f19182a = av0Var;
                ArrayDeque arrayDeque = (ArrayDeque) av0Var.f9423c;
                arrayDeque.add(bv0Var);
                if (((zu0) av0Var.f9424d) == null) {
                    zu0 zu0Var = (zu0) arrayDeque.poll();
                    av0Var.f9424d = zu0Var;
                    if (zu0Var != null) {
                        zu0Var.executeOnExecutor((ThreadPoolExecutor) av0Var.f9422b, new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f10552b;
                iw0 iw0Var = new iw0();
                Log.d("GASS", "Clearcut logging disabled");
                taskCompletionSource.setResult(new fw0(iw0Var));
                return;
            case 4:
                ((HttpURLConnection) this.f10552b).disconnect();
                return;
            case 5:
                m01 m01Var = (m01) this.f10552b;
                t01 t01Var = (t01) m01Var.f13701a.a();
                long j = m01Var.f13705e;
                if (j > 0) {
                    t01Var.f16630e.b(new du0(6, t01Var), j);
                    return;
                } else {
                    t01Var.a();
                    return;
                }
            case 6:
                ((t01) this.f10552b).a();
                return;
            case 7:
                y11 y11Var = (y11) this.f10552b;
                vd.b bVarE = ((ex) y11Var.f18603c).e(new go0(9, y11Var));
                y11Var.f18602b.e(53, bVarE);
                y11Var.f18606f = bVarE;
                return;
            case 8:
                ((z11) this.f10552b).e();
                return;
            case 9:
                ((e21) this.f10552b).f();
                return;
            case 10:
                xi0 xi0Var = ((t21) this.f10552b).f16676a;
                ((ka1) xi0Var.f18395d).a("unlinkToDeath", new Object[0]);
                k21 k21Var = (k21) xi0Var.j;
                k21Var.getClass();
                k21Var.asBinder().unlinkToDeath((u21) xi0Var.f18398h, 0);
                xi0Var.j = null;
                xi0Var.f18393b = false;
                return;
            case 11:
                a();
                return;
            case 12:
                f91 f91Var = (f91) this.f10552b;
                if (f91Var == null || (bVar = f91Var.f11072h) == null) {
                    return;
                }
                this.f10552b = null;
                if (bVar.isDone()) {
                    f91Var.n(bVar);
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = f91Var.f11073i;
                    f91Var.f11073i = null;
                    String string = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (jAbs > 10) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(jAbs).length() + 55);
                                sb2.append("Timed out (timeout delayed by ");
                                sb2.append(jAbs);
                                sb2.append(" ms after scheduled time)");
                                string = sb2.toString();
                            }
                        } catch (Throwable th2) {
                            f91Var.f(new e91(string, 0));
                            throw th2;
                        }
                    }
                    String string2 = bVar.toString();
                    StringBuilder sb3 = new StringBuilder(string.length() + 2 + string2.length());
                    sb3.append(string);
                    sb3.append(": ");
                    sb3.append(string2);
                    f91Var.f(new e91(sb3.toString(), 0));
                    return;
                } finally {
                    bVar.cancel(true);
                }
            case 13:
                it1 it1Var = (it1) this.f10552b;
                String str = bq0.f9768a;
                int iGenerateAudioSessionId = jz.d(it1Var.f12454f).generateAudioSessionId();
                int i10 = iGenerateAudioSessionId != -1 ? iGenerateAudioSessionId : 0;
                be1 be1Var = it1Var.B;
                Integer numValueOf = Integer.valueOf(i10);
                be1Var.f9662f = numValueOf;
                q81 q81Var = new q81(20, be1Var, numValueOf);
                no0 no0Var = (no0) be1Var.f9659c;
                if (no0Var.f14385a.getLooper().getThread().isAlive()) {
                    no0Var.e(q81Var);
                    return;
                }
                return;
            case 14:
                wu1 wu1Var = ((nt1) this.f10552b).f14432v;
                wu1Var.l(wu1Var.m(), 1034, new su1(11));
                return;
            case 15:
                b();
                return;
            case 16:
                wu1 wu1Var2 = (wu1) this.f10552b;
                wu1Var2.l(wu1Var2.m(), 1028, new uu1(i4));
                wu1Var2.f18202f.e();
                return;
            case 17:
                kw1 kw1Var = (kw1) this.f10552b;
                if (kw1Var.U >= 300000) {
                    ((mw1) kw1Var.f13271l.f13160b).Q0 = true;
                    kw1Var.U = 0L;
                    return;
                }
                return;
            default:
                yw1 yw1Var = (yw1) this.f10552b;
                Object obj = yw1Var.f18900a;
                synchronized (obj) {
                    try {
                        if (yw1Var.f18910m) {
                            return;
                        }
                        long j8 = yw1Var.f18909l - 1;
                        yw1Var.f18909l = j8;
                        if (j8 > 0) {
                            return;
                        }
                        if (j8 >= 0) {
                            yw1Var.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (obj) {
                            yw1Var.f18911n = illegalStateException;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ du0(int i4, Object obj) {
        this.f10551a = i4;
        this.f10552b = obj;
    }

    public /* synthetic */ du0(nt1 nt1Var, int i4) {
        this.f10551a = 14;
        this.f10552b = nt1Var;
    }

    public du0(tu0 tu0Var) {
        this.f10551a = 1;
        this.f10552b = tu0Var.f16964e;
    }

    public du0(yu0 yu0Var) {
        this.f10551a = 2;
        Objects.requireNonNull(yu0Var);
        this.f10552b = yu0Var;
    }
}
