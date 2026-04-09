package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Bq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0447Bq implements InterfaceC0595Kl {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7445a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7446b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7447c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7448d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7449e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f7450f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f7451g;

    /* renamed from: h, reason: collision with root package name */
    public Object f7452h;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public Object f7453j;

    public C0447Bq(Context context, C2951a c2951a, C0657Of c0657Of, Qt qt, InterfaceC0828Yg interfaceC0828Yg, C0960bu c0960bu, boolean z6, C0500Fb c0500Fb, BinderC0718Rp binderC0718Rp, C0784Vn c0784Vn) {
        this.f7446b = context;
        this.f7447c = c2951a;
        this.f7448d = c0657Of;
        this.f7449e = qt;
        this.f7450f = interfaceC0828Yg;
        this.f7451g = c0960bu;
        this.f7452h = c0500Fb;
        this.f7445a = z6;
        this.i = binderC0718Rp;
        this.f7453j = c0784Vn;
    }

    public void a(OO oo) {
        if (!this.f7445a || oo.equals((OO) this.f7452h)) {
            return;
        }
        this.f7452h = oo;
        K4.c cVar = (K4.c) ((Wu) this.f7447c).f12337b;
        cVar.u();
        OO oo2 = (OO) cVar.f2214g;
        if (oo2 == null || oo.equals(oo2)) {
            return;
        }
        cVar.f2214g = oo;
        C1009cp c1009cp = (C1009cp) cVar.f2210c;
        if (c1009cp != null) {
            c1009cp.c(-1, EO.f7954g);
            c1009cp.d();
        }
    }

    public void b(Runnable runnable) {
        ((Handler) ((ZA) this.f7447c).a()).post(new JA(this, runnable, 1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0595Kl
    public Qt c() {
        return (Qt) this.f7449e;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // com.google.android.gms.internal.ads.InterfaceC0595Kl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(boolean r18, android.content.Context r19, com.google.android.gms.internal.ads.C1760qk r20) {
        /*
            r17 = this;
            r1 = r17
            java.lang.Object r0 = r1.f7452h
            r2 = r0
            com.google.android.gms.internal.ads.Fb r2 = (com.google.android.gms.internal.ads.C0500Fb) r2
            java.lang.Object r0 = r1.f7448d
            com.google.android.gms.internal.ads.Of r0 = (com.google.android.gms.internal.ads.C0657Of) r0
            java.lang.Object r0 = com.google.android.gms.internal.ads.AbstractC1984ut.I(r0)
            com.google.android.gms.internal.ads.Zh r0 = (com.google.android.gms.internal.ads.C0846Zh) r0
            java.lang.Object r3 = r1.f7450f
            r6 = r3
            com.google.android.gms.internal.ads.Yg r6 = (com.google.android.gms.internal.ads.InterfaceC0828Yg) r6
            r3 = 1
            r6.h1(r3)
            p2.f r7 = new p2.f
            boolean r4 = r1.f7445a
            r5 = 0
            if (r4 == 0) goto L26
            boolean r8 = r2.b(r5)
            goto L27
        L26:
            r8 = r5
        L27:
            p2.j r9 = p2.j.f22785C
            t2.G r9 = r9.f22790c
            java.lang.Object r9 = r1.f7446b
            android.content.Context r9 = (android.content.Context) r9
            boolean r9 = t2.C2911G.j(r9)
            if (r4 == 0) goto L3d
            monitor-enter(r2)
            boolean r10 = r2.f8138b     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r2)
            if (r10 == 0) goto L3d
            r10 = r3
            goto L42
        L3d:
            r10 = r5
            goto L42
        L3f:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3f
            throw r0
        L42:
            if (r4 == 0) goto L4a
            float r2 = r2.c()
        L48:
            r11 = r2
            goto L4c
        L4a:
            r2 = 0
            goto L48
        L4c:
            java.lang.Object r2 = r1.f7449e
            com.google.android.gms.internal.ads.Qt r2 = (com.google.android.gms.internal.ads.Qt) r2
            boolean r13 = r2.f10745O
            r14 = 0
            r12 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            if (r20 == 0) goto L5d
            r20.H1()
        L5d:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.rN r0 = r0.f12936a0
            java.lang.Object r0 = r0.c()
            r5 = r0
            com.google.android.gms.internal.ads.Il r5 = (com.google.android.gms.internal.ads.C0561Il) r5
            r10 = r7
            int r7 = r2.f10747Q
            java.lang.Object r0 = r1.f7447c
            r8 = r0
            u2.a r8 = (u2.C2951a) r8
            java.lang.String r9 = r2.f10726B
            com.google.android.gms.internal.ads.Ut r0 = r2.f10791s
            java.lang.String r11 = r0.f11812b
            java.lang.String r12 = r0.f11811a
            java.lang.Object r0 = r1.f7451g
            com.google.android.gms.internal.ads.bu r0 = (com.google.android.gms.internal.ads.C0960bu) r0
            boolean r2 = r2.b()
            if (r2 == 0) goto L88
            java.lang.Object r2 = r1.i
            com.google.android.gms.internal.ads.Rp r2 = (com.google.android.gms.internal.ads.BinderC0718Rp) r2
        L86:
            r15 = r2
            goto L8a
        L88:
            r2 = 0
            goto L86
        L8a:
            java.lang.String r13 = r0.f13485g
            java.lang.String r16 = r6.o()
            r14 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r0 = r1.f7453j
            com.google.android.gms.internal.ads.Vn r0 = (com.google.android.gms.internal.ads.C0784Vn) r0
            r2 = r19
            p1.e.i(r2, r4, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0447Bq.p(boolean, android.content.Context, com.google.android.gms.internal.ads.qk):void");
    }

    public C0447Bq() {
        this.f7446b = new HashMap();
        this.f7447c = new HashMap();
        this.f7448d = new HashMap();
        this.f7449e = new HashSet();
        this.f7450f = new HashSet();
        this.f7451g = new HashSet();
        this.f7452h = new HashMap();
        this.i = new HashSet();
        this.f7453j = new WeakHashMap();
    }

    public C0447Bq(Context context, Wu wu, C0729Sj c0729Sj, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.f7446b = applicationContext;
        this.f7447c = wu;
        this.f7453j = c0729Sj;
        this.i = audioDeviceInfo;
        String str = Vt.f12096a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f7448d = handler;
        this.f7449e = new PO(this);
        this.f7450f = new A1.t(13, this);
        OO oo = OO.f10188c;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f7451g = uriFor != null ? new QO(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public C0447Bq(Context context, YD yd, Intent intent) {
        this.f7450f = new ArrayList();
        this.f7446b = context;
        this.f7448d = yd;
        this.f7449e = "OverlayDisplayService";
        this.f7451g = intent;
        this.f7447c = AbstractC1984ut.d(new C1285ht(11, (byte) 0));
        this.f7452h = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.IA
            @Override // android.os.IBinder.DeathRecipient
            public final /* synthetic */ void binderDied() {
                C0447Bq c0447Bq = this.f9080a;
                ((YD) c0447Bq.f7448d).c("%s : Binder has died.", (String) c0447Bq.f7449e);
                ArrayList arrayList = (ArrayList) c0447Bq.f7450f;
                synchronized (arrayList) {
                    arrayList.clear();
                }
            }
        };
    }
}
