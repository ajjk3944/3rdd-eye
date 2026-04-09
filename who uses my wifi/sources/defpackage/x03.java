package defpackage;

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
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class x03 implements qq2 {
    public boolean f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public Object m;
    public Object n;
    public Object o;

    public x03(Context context, e51 e51Var, pd2 pd2Var, a83 a83Var, ag2 ag2Var, l83 l83Var, boolean z, e42 e42Var, pz2 pz2Var, mv2 mv2Var) {
        this.g = context;
        this.h = e51Var;
        this.i = pd2Var;
        this.j = a83Var;
        this.k = ag2Var;
        this.l = l83Var;
        this.m = e42Var;
        this.f = z;
        this.n = pz2Var;
        this.o = mv2Var;
    }

    public void a(AudioDeviceInfo audioDeviceInfo) {
        if (Objects.equals(audioDeviceInfo, (AudioDeviceInfo) this.n)) {
            return;
        }
        this.n = audioDeviceInfo;
        b(ae4.a((Context) this.g, (in2) this.o, audioDeviceInfo));
    }

    public void b(ae4 ae4Var) {
        lj4 lj4Var;
        if (!this.f || ae4Var.equals((ae4) this.m)) {
            return;
        }
        this.m = ae4Var;
        df4 df4Var = (df4) ((it3) this.h).g;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = df4Var.W;
        String name = looperMyLooper == null ? "null" : looperMyLooper.getThread().getName();
        Looper looper2 = df4Var.W;
        String name2 = looper2 == null ? "null" : looper2.getThread().getName();
        if (!(looper == looperMyLooper)) {
            throw new IllegalStateException(qb1.J("Current looper (%s) is not the playback looper (%s)", name, name2));
        }
        ae4 ae4Var2 = df4Var.s;
        if (ae4Var2 == null || ae4Var.equals(ae4Var2)) {
            return;
        }
        df4Var.s = ae4Var;
        bi3 bi3Var = df4Var.n;
        if (bi3Var != null) {
            ef4 ef4Var = (ef4) bi3Var.g;
            synchronized (ef4Var.f) {
                lj4Var = ef4Var.w;
            }
            if (lj4Var != null) {
                synchronized (lj4Var.c) {
                    lj4Var.e.getClass();
                }
            }
        }
    }

    public void c(Runnable runnable) {
        ((Handler) ((ll3) this.h).a()).post(new vk3(this, runnable, 1));
    }

    @Override // defpackage.qq2
    public a83 d() {
        return (a83) this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // defpackage.qq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q(boolean r18, android.content.Context r19, defpackage.an2 r20) {
        /*
            r17 = this;
            r1 = r17
            java.lang.Object r0 = r1.m
            r2 = r0
            e42 r2 = (defpackage.e42) r2
            java.lang.Object r0 = r1.i
            pd2 r0 = (defpackage.pd2) r0
            java.lang.Object r0 = defpackage.pu1.S(r0)
            di2 r0 = (defpackage.di2) r0
            java.lang.Object r3 = r1.k
            r6 = r3
            ag2 r6 = (defpackage.ag2) r6
            r3 = 1
            r6.P0(r3)
            zb4 r7 = new zb4
            boolean r4 = r1.f
            r5 = 0
            if (r4 == 0) goto L26
            boolean r8 = r2.a(r5)
            goto L27
        L26:
            r8 = r5
        L27:
            hg4 r9 = defpackage.hg4.C
            lf4 r9 = r9.c
            java.lang.Object r9 = r1.g
            android.content.Context r9 = (android.content.Context) r9
            boolean r9 = defpackage.lf4.i(r9)
            if (r4 == 0) goto L3d
            monitor-enter(r2)
            boolean r10 = r2.b     // Catch: java.lang.Throwable -> L3f
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
            if (r4 == 0) goto L4d
            monitor-enter(r2)
            float r4 = r2.c     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r2)
        L48:
            r11 = r4
            goto L4f
        L4a:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4a
            throw r0
        L4d:
            r4 = 0
            goto L48
        L4f:
            java.lang.Object r2 = r1.j
            a83 r2 = (defpackage.a83) r2
            boolean r13 = r2.O
            r14 = 0
            r12 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            if (r20 == 0) goto L60
            r20.U1()
        L60:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            ba4 r0 = r0.K
            java.lang.Object r0 = r0.d()
            r5 = r0
            oq2 r5 = (defpackage.oq2) r5
            r10 = r7
            int r7 = r2.Q
            java.lang.Object r0 = r1.h
            r8 = r0
            e51 r8 = (defpackage.e51) r8
            java.lang.String r9 = r2.B
            e83 r0 = r2.s
            java.lang.String r11 = r0.b
            java.lang.String r12 = r0.a
            java.lang.Object r0 = r1.l
            l83 r0 = (defpackage.l83) r0
            boolean r2 = r2.b()
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r1.n
            pz2 r2 = (defpackage.pz2) r2
        L89:
            r15 = r2
            goto L8d
        L8b:
            r2 = 0
            goto L89
        L8d:
            java.lang.String r13 = r0.g
            java.lang.String r16 = r6.o()
            r14 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r0 = r1.o
            mv2 r0 = (defpackage.mv2) r0
            r2 = r19
            defpackage.y24.b(r2, r4, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x03.q(boolean, android.content.Context, an2):void");
    }

    public x03() {
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new HashMap();
        this.j = new HashSet();
        this.k = new HashSet();
        this.l = new HashSet();
        this.m = new HashMap();
        this.n = new HashSet();
        this.o = new WeakHashMap();
    }

    public x03(Context context, er3 er3Var, Intent intent) {
        this.k = new ArrayList();
        this.g = context;
        this.i = er3Var;
        this.j = "OverlayDisplayService";
        this.l = intent;
        this.h = i41.I(new su2(12));
        this.m = new IBinder.DeathRecipient() { // from class: tk3
            @Override // android.os.IBinder.DeathRecipient
            public final /* synthetic */ void binderDied() {
                x03 x03Var = this.a;
                ((er3) x03Var.i).a("%s : Binder has died.", (String) x03Var.j);
                ArrayList arrayList = (ArrayList) x03Var.k;
                synchronized (arrayList) {
                    arrayList.clear();
                }
            }
        };
    }

    public x03(Context context, it3 it3Var, in2 in2Var, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.g = applicationContext;
        this.h = it3Var;
        this.o = in2Var;
        this.n = audioDeviceInfo;
        String str = v23.a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.i = handler;
        this.j = new be4(this);
        this.k = new d6(8, this);
        ae4 ae4Var = ae4.c;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.l = uriFor != null ? new ce4(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }
}
