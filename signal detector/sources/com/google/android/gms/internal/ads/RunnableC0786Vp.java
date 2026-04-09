package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.webkit.WebView;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import q2.C2841s;
import q2.C2852x0;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.Vp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0786Vp implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12090c;

    public /* synthetic */ RunnableC0786Vp(Ev ev, Object obj, int i) {
        this.f12088a = i;
        this.f12089b = obj;
        this.f12090c = ev;
    }

    private final void a() {
        C2184yd c2184yd;
        Yu yu = (Yu) this.f12089b;
        Uu uu = (Uu) this.f12090c;
        synchronized (Yu.f12722l) {
            try {
                if (!yu.i) {
                    yu.i = true;
                    if (Yu.a()) {
                        try {
                            C2911G c2911g = p2.j.f22785C.f22790c;
                            yu.f12727d = C2911G.O(yu.f12724a);
                        } catch (RemoteException | RuntimeException e6) {
                            p2.j.f22785C.f22795h.f("CuiMonitor.gettingAppIdFromManifest", e6);
                        }
                        J2.f fVar = J2.f.f2059b;
                        Context context = yu.f12724a;
                        fVar.getClass();
                        yu.f12728e = J2.f.a(context);
                        E9 e9 = H9.Q9;
                        C2841s c2841s = C2841s.f23267e;
                        int iIntValue = ((Integer) c2841s.f23270c.a(e9)).intValue();
                        if (((Boolean) c2841s.f23270c.a(H9.dd)).booleanValue()) {
                            long j6 = iIntValue;
                            AbstractC0640Nf.f10008d.scheduleWithFixedDelay(yu, j6, j6, TimeUnit.MILLISECONDS);
                        } else {
                            long j7 = iIntValue;
                            AbstractC0640Nf.f10008d.scheduleAtFixedRate(yu, j7, j7, TimeUnit.MILLISECONDS);
                        }
                        E9 e92 = H9.W9;
                        if (((Boolean) c2841s.f23270c.a(e92)).booleanValue()) {
                            C0421Ah c0421Ah = yu.f12731h;
                            c0421Ah.getClass();
                            if (((Boolean) c2841s.f23270c.a(e92)).booleanValue() && !c0421Ah.f7026e.getAndSet(true)) {
                                c0421Ah.a();
                            }
                        }
                    }
                }
            } finally {
            }
        }
        if (Yu.a() && uu != null) {
            synchronized (Yu.f12721k) {
                try {
                    C0961bv c0961bv = yu.f12726c;
                    int iA = ((C1124ev) c0961bv.f13551b).A();
                    E9 e93 = H9.R9;
                    C2841s c2841s2 = C2841s.f23267e;
                    if (iA >= ((Integer) c2841s2.f23270c.a(e93)).intValue()) {
                        return;
                    }
                    Zu zuC = C0906av.C();
                    int i = uu.f11826m;
                    zuC.b();
                    ((C0906av) zuC.f13551b).Y(i);
                    boolean z6 = uu.f11816b;
                    zuC.b();
                    ((C0906av) zuC.f13551b).D(z6);
                    long j8 = uu.f11815a;
                    zuC.b();
                    ((C0906av) zuC.f13551b).E(j8);
                    zuC.b();
                    ((C0906av) zuC.f13551b).Z();
                    String str = yu.f12725b.f23784a;
                    zuC.b();
                    ((C0906av) zuC.f13551b).G(str);
                    String str2 = yu.f12727d;
                    zuC.b();
                    ((C0906av) zuC.f13551b).H(str2);
                    String str3 = Build.VERSION.RELEASE;
                    zuC.b();
                    ((C0906av) zuC.f13551b).I(str3);
                    int i3 = Build.VERSION.SDK_INT;
                    zuC.b();
                    ((C0906av) zuC.f13551b).J(i3);
                    int i6 = uu.f11828o;
                    zuC.b();
                    ((C0906av) zuC.f13551b).A(i6);
                    int i7 = uu.f11817c;
                    zuC.b();
                    ((C0906av) zuC.f13551b).L(i7);
                    long j9 = yu.f12728e;
                    zuC.b();
                    ((C0906av) zuC.f13551b).M(j9);
                    int i8 = uu.f11827n;
                    zuC.b();
                    ((C0906av) zuC.f13551b).B(i8);
                    String str4 = uu.f11818d;
                    zuC.b();
                    ((C0906av) zuC.f13551b).N(str4);
                    String str5 = uu.f11819e;
                    zuC.b();
                    ((C0906av) zuC.f13551b).O(str5);
                    String str6 = uu.f11820f;
                    zuC.b();
                    ((C0906av) zuC.f13551b).P(str6);
                    C0529Gn c0529GnB = yu.f12729f.b(uu.f11820f);
                    String string = (c0529GnB == null || (c2184yd = c0529GnB.f8439b) == null) ? "" : c2184yd.toString();
                    zuC.b();
                    ((C0906av) zuC.f13551b).Q(string);
                    String str7 = uu.f11821g;
                    zuC.b();
                    ((C0906av) zuC.f13551b).R(str7);
                    int i9 = uu.f11822h;
                    zuC.b();
                    ((C0906av) zuC.f13551b).V(i9);
                    String str8 = uu.f11824k;
                    zuC.b();
                    ((C0906av) zuC.f13551b).U(str8);
                    String str9 = uu.i;
                    zuC.b();
                    ((C0906av) zuC.f13551b).S(str9);
                    String str10 = uu.f11823j;
                    zuC.b();
                    ((C0906av) zuC.f13551b).T(str10);
                    long j10 = uu.f11825l;
                    zuC.b();
                    ((C0906av) zuC.f13551b).F(j10);
                    if (((Boolean) c2841s2.f23270c.a(H9.V9)).booleanValue()) {
                        AbstractCollection abstractCollection = yu.f12730g;
                        zuC.b();
                        ((C0906av) zuC.f13551b).K(abstractCollection);
                    }
                    if (((Boolean) c2841s2.f23270c.a(H9.W9)).booleanValue()) {
                        C0421Ah c0421Ah2 = yu.f12731h;
                        C1097eM c1097eM = c0421Ah2.f7023b;
                        String str11 = c0421Ah2.f7022a;
                        if (c1097eM != null) {
                            zuC.b();
                            ((C0906av) zuC.f13551b).W(c1097eM);
                        }
                        if (str11 != null) {
                            zuC.b();
                            ((C0906av) zuC.f13551b).X(str11);
                        }
                    }
                    C1015cv c1015cvA = C1069dv.A();
                    c1015cvA.b();
                    ((C1069dv) c1015cvA.f13551b).B((C0906av) zuC.d());
                    c0961bv.b();
                    ((C1124ev) c0961bv.f13551b).C((C1069dv) c1015cvA.d());
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f12090c
            com.google.android.gms.internal.ads.Ev r0 = (com.google.android.gms.internal.ads.Ev) r0
            java.lang.Object r1 = r6.f12089b
            q2.y0 r1 = (q2.InterfaceC2854y0) r1
            monitor-enter(r0)
            q2.P r2 = r0.f8030h     // Catch: java.lang.Throwable -> L1b
            r3 = 1
            if (r2 == 0) goto L22
            q2.U0 r4 = r0.f8027e     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L1d
            android.os.Parcel r5 = r2.h0()     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L1d
            com.google.android.gms.internal.ads.C7.c(r5, r4)     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L1d
            r2.I0(r5, r3)     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L1d
            goto L22
        L1b:
            r1 = move-exception
            goto L3e
        L1d:
            java.lang.String r2 = "Failed to call onAdsAvailable"
            u2.k.h(r2)     // Catch: java.lang.Throwable -> L1b
        L22:
            q2.Q r2 = r0.i     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L35
            java.lang.String r4 = r0.f8033l     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L37
            android.os.Parcel r5 = r2.h0()     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L37
            r5.writeString(r4)     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L37
            com.google.android.gms.internal.ads.C7.e(r5, r1)     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L37
            r2.I0(r5, r3)     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L37
        L35:
            monitor-exit(r0)
            goto L3d
        L37:
            java.lang.String r1 = "Failed to call onAdPreloaded"
            u2.k.h(r1)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)
        L3d:
            return
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.RunnableC0786Vp.b():void");
    }

    private final void c() {
        Ev ev = (Ev) this.f12090c;
        C2852x0 c2852x0 = (C2852x0) this.f12089b;
        synchronized (ev) {
            q2.Q q3 = ev.i;
            if (q3 != null) {
                try {
                    String str = ev.f8033l;
                    Parcel parcelH0 = q3.h0();
                    parcelH0.writeString(str);
                    C7.c(parcelH0, c2852x0);
                    q3.I0(parcelH0, 3);
                } catch (RemoteException unused) {
                    u2.k.h("Failed to call onAdFailedToPreload");
                }
            }
        }
    }

    private final void d() throws RemoteException {
        Object c2056wA;
        InterfaceC2164yA interfaceC2164yA;
        IBinder iBinder = (IBinder) this.f12090c;
        int i = AbstractBinderC2110xA.f17551a;
        if (iBinder == null) {
            c2056wA = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
            c2056wA = iInterfaceQueryLocalInterface instanceof InterfaceC2164yA ? (InterfaceC2164yA) iInterfaceQueryLocalInterface : new C2056wA(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService", 2);
        }
        HA ha = (HA) this.f12089b;
        C0447Bq c0447Bq = ha.f8872a;
        c0447Bq.f7453j = c2056wA;
        int i3 = 0;
        ((YD) c0447Bq.f7448d).c("linkToDeath", new Object[0]);
        try {
            interfaceC2164yA = (InterfaceC2164yA) c0447Bq.f7453j;
        } catch (RemoteException e6) {
            ((YD) ha.f8872a.f7448d).g(e6, "linkToDeath failed", new Object[0]);
        }
        if (interfaceC2164yA == null) {
            throw null;
        }
        interfaceC2164yA.asBinder().linkToDeath((IA) c0447Bq.f7452h, 0);
        C0447Bq c0447Bq2 = ha.f8872a;
        c0447Bq2.f7445a = false;
        synchronized (((ArrayList) c0447Bq2.f7450f)) {
            try {
                ArrayList arrayList = (ArrayList) c0447Bq2.f7450f;
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((Runnable) obj).run();
                }
                ((ArrayList) c0447Bq2.f7450f).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e() {
        Vu vu = (Vu) this.f12089b;
        synchronized (((BN) this.f12090c)) {
        }
        String str = Vt.f12096a;
        GO go = ((NN) vu.f12106b).f9997a.f11649G;
        go.t(go.x((C1749qQ) go.f8367d.f16141e), 1013, new EO(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0359  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws android.os.RemoteException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.RunnableC0786Vp.run():void");
    }

    public /* synthetic */ RunnableC0786Vp(Object obj, int i, Object obj2) {
        this.f12088a = i;
        this.f12089b = obj;
        this.f12090c = obj2;
    }

    public RunnableC0786Vp(C1994v2 c1994v2, WebView webView, String str) {
        this.f12088a = 14;
        this.f12089b = webView;
        this.f12090c = str;
    }
}
