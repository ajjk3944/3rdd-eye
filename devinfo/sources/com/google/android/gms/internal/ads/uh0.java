package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class uh0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17204a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17205b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17206c;

    public /* synthetic */ uh0(int i4, Object obj, Object obj2) {
        this.f17204a = i4;
        this.f17205b = obj;
        this.f17206c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f17206c
            com.google.android.gms.internal.ads.it0 r0 = (com.google.android.gms.internal.ads.it0) r0
            java.lang.Object r1 = r6.f17205b
            va.x1 r1 = (va.x1) r1
            monitor-enter(r0)
            va.p0 r2 = r0.f12433h     // Catch: java.lang.Throwable -> L1b
            r3 = 1
            if (r2 == 0) goto L22
            va.t2 r4 = r0.f12431e     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L1d
            android.os.Parcel r5 = r2.T()     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L1d
            com.google.android.gms.internal.ads.ng.c(r5, r4)     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L1d
            r2.g1(r5, r3)     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L1d
            goto L22
        L1b:
            r1 = move-exception
            goto L3e
        L1d:
            java.lang.String r2 = "Failed to call onAdsAvailable"
            za.i.h(r2)     // Catch: java.lang.Throwable -> L1b
        L22:
            va.q0 r2 = r0.f12434i     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L35
            java.lang.String r4 = r0.f12436l     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L37
            android.os.Parcel r5 = r2.T()     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L37
            r5.writeString(r4)     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L37
            com.google.android.gms.internal.ads.ng.e(r5, r1)     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L37
            r2.g1(r5, r3)     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L37
        L35:
            monitor-exit(r0)
            goto L3d
        L37:
            java.lang.String r1 = "Failed to call onAdPreloaded"
            za.i.h(r1)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)
        L3d:
            return
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uh0.a():void");
    }

    private final void b() {
        it0 it0Var = (it0) this.f17206c;
        va.w1 w1Var = (va.w1) this.f17205b;
        synchronized (it0Var) {
            va.q0 q0Var = it0Var.f12434i;
            if (q0Var != null) {
                try {
                    String str = it0Var.f12436l;
                    Parcel parcelT = q0Var.T();
                    parcelT.writeString(str);
                    ng.c(parcelT, w1Var);
                    q0Var.g1(parcelT, 3);
                } catch (RemoteException unused) {
                    za.i.h("Failed to call onAdFailedToPreload");
                }
            }
        }
    }

    private final void c() throws RemoteException {
        Object i21Var;
        k21 k21Var;
        IBinder iBinder = (IBinder) this.f17206c;
        int i4 = j21.f12595a;
        if (iBinder == null) {
            i21Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
            i21Var = iInterfaceQueryLocalInterface instanceof k21 ? (k21) iInterfaceQueryLocalInterface : new i21(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService", 1);
        }
        t21 t21Var = (t21) this.f17205b;
        xi0 xi0Var = t21Var.f16676a;
        xi0Var.j = i21Var;
        int i10 = 0;
        ((ka1) xi0Var.f18395d).a("linkToDeath", new Object[0]);
        try {
            k21Var = (k21) xi0Var.j;
        } catch (RemoteException e2) {
            ((ka1) t21Var.f16676a.f18395d).e(e2, "linkToDeath failed", new Object[0]);
        }
        if (k21Var == null) {
            throw null;
        }
        k21Var.asBinder().linkToDeath((u21) xi0Var.f18398h, 0);
        xi0 xi0Var2 = t21Var.f16676a;
        xi0Var2.f18393b = false;
        synchronized (((ArrayList) xi0Var2.f18397f)) {
            try {
                ArrayList arrayList = (ArrayList) xi0Var2.f18397f;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((Runnable) obj).run();
                }
                ((ArrayList) xi0Var2.f18397f).clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void d() {
        g1 g1Var = (g1) this.f17205b;
        synchronized (((os1) this.f17206c)) {
        }
        String str = bq0.f9768a;
        wu1 wu1Var = g1Var.f11342b.f9804a.f12465s;
        wu1Var.l(wu1Var.o((jy1) wu1Var.f18200d.f9334e), 1013, new uu1(7));
    }

    private final void e() {
        uw1 uw1Var = (uw1) this.f17205b;
        uh0 uh0Var = (uh0) this.f17206c;
        uw1Var.f17370c.c();
        yw1 yw1Var = uw1Var.f17369b;
        synchronized (yw1Var.f18900a) {
            yw1Var.b();
            uh0Var.run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException, IOException {
        os osVar;
        int i4;
        long j;
        boolean z3;
        xi0 xi0Var;
        boolean z10 = true;
        switch (this.f17204a) {
            case 0:
                zt0 zt0Var = (zt0) this.f17205b;
                View view = (View) this.f17206c;
                xt0 xt0Var = xt0.f18491a;
                for (vt0 vt0Var : zt0Var.f19178d.values()) {
                    if (!vt0Var.f17704f) {
                        vt0Var.f17700b.a(view, xt0Var);
                    }
                }
                zt0Var.f19179e.a(view, xt0Var);
                return;
            case 1:
                pi0 pi0Var = (pi0) this.f17205b;
                qz qzVar = (qz) this.f17206c;
                qzVar.R0();
                hq0 hq0Var = pi0Var.f15012d;
                g00 g00VarZ1 = qzVar.z1();
                va.x2 x2Var = hq0Var.f11941a;
                if (x2Var != null && g00VarZ1 != null) {
                    g00VarZ1.i4(x2Var);
                }
                if (!((Boolean) va.s.f36163e.f36166c.a(sk.G1)).booleanValue() || qzVar.isAttachedToWindow()) {
                    return;
                }
                qzVar.onPause();
                qzVar.Q0();
                return;
            case 2:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) this.f17206c).registerReceiver(new kf(3, (yj0) this.f17205b), intentFilter);
                return;
            case 3:
                ((yj0) ((kf) this.f17205b).f13150b).c((Context) this.f17206c);
                return;
            case 4:
                ((zk0) ((pq0) ((ai) ((r7) this.f17205b).f15561f).f9332c).f15075d).o((va.w1) this.f17206c);
                return;
            case 5:
                ((po0) ((r7) this.f17205b).f15561f).f15061d.o((va.w1) this.f17206c);
                return;
            case 6:
                ((to0) this.f17205b).f16899d.o((va.w1) this.f17206c);
                return;
            case 7:
                ((qp0) ((r7) this.f17205b).f15561f).f15389d.o((va.w1) this.f17206c);
                return;
            case 8:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f17206c;
                InputStream inputStream = (InputStream) this.f17205b;
                try {
                    try {
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                        try {
                            tb.b.e(inputStream, autoCloseOutputStream, false);
                            autoCloseOutputStream.close();
                            inputStream.close();
                            return;
                        } finally {
                        }
                    } finally {
                    }
                } catch (IOException unused) {
                    return;
                }
            case 9:
                ((sr0) ((ai) this.f17205b).f9335f).f16527c.p1(new kh0(7, (pr0) this.f17206c));
                return;
            case 10:
                cs0 cs0Var = (cs0) this.f17205b;
                as0 as0Var = (as0) this.f17206c;
                synchronized (cs0.f10202l) {
                    try {
                        if (!cs0Var.f10211i) {
                            cs0Var.f10211i = true;
                            if (cs0.a()) {
                                try {
                                    ya.f0 f0Var = ua.j.C.f35261c;
                                    cs0Var.f10207d = ya.f0.O(cs0Var.f10204a);
                                } catch (RemoteException | RuntimeException e2) {
                                    ua.j.C.f35265h.f("CuiMonitor.gettingAppIdFromManifest", e2);
                                }
                                nb.f fVar = nb.f.f29899b;
                                Context context = cs0Var.f10204a;
                                fVar.getClass();
                                cs0Var.f10208e = nb.f.a(context);
                                pk pkVar = sk.S9;
                                va.s sVar = va.s.f36163e;
                                int iIntValue = ((Integer) sVar.f36166c.a(pkVar)).intValue();
                                if (((Boolean) sVar.f36166c.a(sk.f16129fd)).booleanValue()) {
                                    long j8 = iIntValue;
                                    fx.f11277d.scheduleWithFixedDelay(cs0Var, j8, j8, TimeUnit.MILLISECONDS);
                                } else {
                                    long j9 = iIntValue;
                                    fx.f11277d.scheduleAtFixedRate(cs0Var, j9, j9, TimeUnit.MILLISECONDS);
                                }
                                pk pkVar2 = sk.Y9;
                                if (((Boolean) sVar.f36166c.a(pkVar2)).booleanValue()) {
                                    t00 t00Var = cs0Var.f10210h;
                                    t00Var.getClass();
                                    if (((Boolean) sVar.f36166c.a(pkVar2)).booleanValue() && !t00Var.f16625e.getAndSet(true)) {
                                        t00Var.a();
                                    }
                                }
                            }
                        }
                    } finally {
                    }
                }
                if (cs0.a() && as0Var != null) {
                    synchronized (cs0.f10201k) {
                        try {
                            fs0 fs0Var = cs0Var.f10206c;
                            int iA = ((is0) fs0Var.f14755b).A();
                            pk pkVar3 = sk.T9;
                            va.s sVar2 = va.s.f36163e;
                            if (iA >= ((Integer) sVar2.f36166c.a(pkVar3)).intValue()) {
                                return;
                            }
                            ds0 ds0VarC = es0.C();
                            int i10 = as0Var.f9404m;
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).Y(i10);
                            boolean z11 = as0Var.f9395b;
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).D(z11);
                            long j10 = as0Var.f9394a;
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).E(j10);
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).Z();
                            String str = cs0Var.f10205b.f38129a;
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).G(str);
                            String str2 = cs0Var.f10207d;
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).H(str2);
                            String str3 = Build.VERSION.RELEASE;
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).I(str3);
                            int i11 = Build.VERSION.SDK_INT;
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).J(i11);
                            int i12 = as0Var.f9406o;
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).A(i12);
                            int i13 = as0Var.f9396c;
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).L(i13);
                            long j11 = cs0Var.f10208e;
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).M(j11);
                            int i14 = as0Var.f9405n;
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).B(i14);
                            String str4 = as0Var.f9397d;
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).N(str4);
                            String str5 = as0Var.f9398e;
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).O(str5);
                            String str6 = as0Var.f9399f;
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).P(str6);
                            cd0 cd0VarB = cs0Var.f10209f.b(as0Var.f9399f);
                            String string = (cd0VarB == null || (osVar = cd0VarB.f10084b) == null) ? "" : osVar.toString();
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).Q(string);
                            String str7 = as0Var.g;
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).R(str7);
                            int i15 = as0Var.f9400h;
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).V(i15);
                            String str8 = as0Var.f9402k;
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).U(str8);
                            String str9 = as0Var.f9401i;
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).S(str9);
                            String str10 = as0Var.j;
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).T(str10);
                            long j12 = as0Var.f9403l;
                            ds0VarC.b();
                            ((es0) ds0VarC.f14755b).F(j12);
                            if (((Boolean) sVar2.f36166c.a(sk.X9)).booleanValue()) {
                                AbstractCollection abstractCollection = cs0Var.g;
                                ds0VarC.b();
                                ((es0) ds0VarC.f14755b).K(abstractCollection);
                            }
                            if (((Boolean) sVar2.f36166c.a(sk.Y9)).booleanValue()) {
                                t00 t00Var2 = cs0Var.f10210h;
                                qp1 qp1Var = t00Var2.f16622b;
                                String str11 = t00Var2.f16621a;
                                if (qp1Var != null) {
                                    ds0VarC.b();
                                    ((es0) ds0VarC.f14755b).W(qp1Var);
                                }
                                if (str11 != null) {
                                    ds0VarC.b();
                                    ((es0) ds0VarC.f14755b).X(str11);
                                }
                            }
                            gs0 gs0VarA = hs0.A();
                            gs0VarA.b();
                            ((hs0) gs0VarA.f14755b).B((es0) ds0VarC.e());
                            fs0Var.b();
                            ((is0) fs0Var.f14755b).C((hs0) gs0VarA.e());
                            return;
                        } finally {
                        }
                    }
                }
                return;
            case 11:
                a();
                return;
            case 12:
                b();
                return;
            case 13:
                w5.D((WebView) this.f17205b, (String) this.f17206c);
                return;
            case 14:
                ((TaskCompletionSource) this.f17206c).setResult(fw0.a((Context) this.f17205b, "GLAS"));
                return;
            case 15:
                a11 a11Var = (a11) this.f17205b;
                xv0 xv0Var = (xv0) this.f17206c;
                if (!a11Var.f9183a.a(xv0Var)) {
                    throw new ac.m(2);
                }
                a11Var.f9188f.set("2.825731049.".concat(String.valueOf(xv0Var.f18515a.A())));
                return;
            case 16:
                c();
                return;
            case 17:
                ((z71) this.f17205b).v((t41) this.f17206c);
                return;
            case 18:
                it1 it1Var = (it1) this.f17205b;
                x8 x8Var = (x8) this.f17206c;
                int i16 = it1Var.F - x8Var.f18318b;
                it1Var.F = i16;
                if (x8Var.f18319c) {
                    it1Var.G = x8Var.f18320d;
                    it1Var.H = true;
                }
                if (i16 == 0) {
                    uh uhVar = ((eu1) x8Var.f18321e).f10872a;
                    int iO1 = -1;
                    if (!it1Var.f12447a0.f10872a.g() && uhVar.g()) {
                        it1Var.f12448b0 = -1;
                        it1Var.f12450c0 = 0L;
                    }
                    if (!uhVar.g()) {
                        List listAsList = Arrays.asList(((ju1) uhVar).f12843h);
                        int size = listAsList.size();
                        ArrayList arrayList = it1Var.f12463q;
                        mq0.c0(size == arrayList.size());
                        for (int i17 = 0; i17 < listAsList.size(); i17++) {
                            ((ft1) arrayList.get(i17)).f11259b = (uh) listAsList.get(i17);
                        }
                    }
                    long j13 = -9223372036854775807L;
                    if (it1Var.H) {
                        boolean z12 = ((eu1) x8Var.f18321e).f10872a.g() && it1Var.f12447a0.f10872a.g();
                        boolean zEquals = ((eu1) x8Var.f18321e).f10873b.equals(it1Var.f12447a0.f10873b);
                        long j14 = ((eu1) x8Var.f18321e).f10875d;
                        long j15 = it1Var.f12447a0.f10887r;
                        if (z12 || (zEquals && j14 == j15)) {
                            z10 = false;
                        }
                        if (z10) {
                            iO1 = it1Var.o1();
                            if (uhVar.g() || ((eu1) x8Var.f18321e).f10873b.b()) {
                                j13 = ((eu1) x8Var.f18321e).f10875d;
                            } else {
                                eu1 eu1Var = (eu1) x8Var.f18321e;
                                jy1 jy1Var = eu1Var.f10873b;
                                long j16 = eu1Var.f10875d;
                                uhVar.o(jy1Var.f12875a, it1Var.f12462p);
                                j13 = j16;
                            }
                        }
                        i4 = iO1;
                        j = j13;
                        z3 = z10;
                    } else {
                        i4 = -1;
                        j = -9223372036854775807L;
                        z3 = false;
                    }
                    it1Var.H = false;
                    it1Var.Q1((eu1) x8Var.f18321e, 1, z3, it1Var.G, j, i4);
                    return;
                }
                return;
            case 19:
                ((av1) this.f17205b).u((NetworkEvent) this.f17206c);
                return;
            case 20:
                ((av1) this.f17205b).v((PlaybackStateEvent) this.f17206c);
                return;
            case 21:
                ((av1) this.f17205b).w((TrackChangeEvent) this.f17206c);
                return;
            case 22:
                ((av1) this.f17205b).x((PlaybackMetrics) this.f17206c);
                return;
            case 23:
                ((av1) this.f17205b).t((PlaybackErrorEvent) this.f17206c);
                return;
            case 24:
                g1 g1Var = (g1) this.f17205b;
                ns1 ns1Var = (ns1) this.f17206c;
                g1Var.getClass();
                String str12 = bq0.f9768a;
                it1 it1Var2 = g1Var.f11342b.f9804a;
                for (Map.Entry entry : new HashMap(it1Var2.E).entrySet()) {
                    if (entry.getKey() != null) {
                        throw new ClassCastException();
                    }
                    List list = (List) entry.getValue();
                    if (!it1.K1(ns1Var, list).equals(it1.K1(it1Var2.Y, list))) {
                        throw null;
                    }
                }
                it1Var2.Y = ns1Var;
                return;
            case 25:
                d();
                return;
            case 26:
                ((xv1) this.f17205b).a((AudioRouting) this.f17206c);
                return;
            case 27:
                xv1 xv1Var = (xv1) this.f17205b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.f17206c;
                if (xv1Var.f18522c == null || (xi0Var = ((cw1) xv1Var.f18523d.f14280b).f10239f) == null || audioDeviceInfo.equals((AudioDeviceInfo) xi0Var.f18399i)) {
                    return;
                }
                xi0Var.f18399i = audioDeviceInfo;
                xi0Var.h(ev1.a((Context) xi0Var.f18392a, (p50) xi0Var.j, audioDeviceInfo));
                return;
            case 28:
                e();
                return;
            default:
                ix1 ix1Var = (ix1) this.f17205b;
                ix1Var.C.set(ix1Var.l((ce1) this.f17206c, ix1Var.f12529w, 0));
                return;
        }
    }

    public /* synthetic */ uh0(it0 it0Var, Object obj, int i4) {
        this.f17204a = i4;
        this.f17205b = obj;
        this.f17206c = it0Var;
    }

    public uh0(w5 w5Var, WebView webView, String str) {
        this.f17204a = 13;
        this.f17205b = webView;
        this.f17206c = str;
    }
}
