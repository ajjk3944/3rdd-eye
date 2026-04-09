package re;

import ac.c;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.widget.ProgressBar;
import ba.l;
import bc.c0;
import bc.d;
import bc.k;
import bc.n;
import bc.p;
import bc.z;
import cc.f;
import cc.g;
import cc.g0;
import cc.s;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.zay;
import com.google.android.gms.internal.measurement.a0;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.signin.internal.zak;
import com.staircase3.opensignal.activities.MainActivity;
import dd.e;
import dd.m;
import dd.o;
import dd.r;
import h7.r1;
import io.sentry.android.core.e0;
import ir.f0;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import oh.t;
import org.json.JSONException;
import wt.m0;
import wt.q;
import wt.w;
import yb.h;
import yb.i;
import yb.j;
import zc.a1;
import zc.c1;
import zc.d2;
import zc.i1;
import zc.j0;
import zc.k1;
import zc.p3;
import zc.s0;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21529a;

    /* renamed from: d, reason: collision with root package name */
    public Object f21530d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f21531g;

    public /* synthetic */ a(int i10, Object obj, Object obj2, boolean z10) {
        this.f21529a = i10;
        this.f21530d = obj2;
        this.f21531g = obj;
    }

    private final void a() {
        m mVar = (m) this.f21531g;
        synchronized (mVar.f7310g) {
            try {
                e eVar = (e) mVar.f7311r;
                if (eVar != null) {
                    eVar.h(((r) this.f21530d).h());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a9 A[DONT_GENERATE, PHI: r8 r9
  0x01a9: PHI (r8v10 java.net.HttpURLConnection) = (r8v8 java.net.HttpURLConnection), (r8v9 java.net.HttpURLConnection), (r8v11 java.net.HttpURLConnection) binds: [B:94:0x01a7, B:98:0x01ba, B:81:0x0184] A[DONT_GENERATE, DONT_INLINE]
  0x01a9: PHI (r9v4 long) = (r9v2 long), (r9v3 long), (r9v7 long) binds: [B:94:0x01a7, B:98:0x01ba, B:81:0x0184] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b() throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: re.a.b():void");
    }

    private final void c() {
        i iVar = (i) this.f21530d;
        IBinder iBinder = (IBinder) this.f21531g;
        synchronized (iVar) {
            if (iBinder == null) {
                iVar.a("Null service connection");
                return;
            }
            try {
                iVar.f26230c = new q3.a(iBinder);
                iVar.f26228a = 2;
                ((ScheduledExecutorService) iVar.f26233f.f26242c).execute(new h(iVar, 0));
            } catch (RemoteException e4) {
                iVar.a(e4.getMessage());
            }
        }
    }

    private final void d() {
        i iVar = (i) this.f21530d;
        int i10 = ((j) this.f21531g).f26234a;
        synchronized (iVar) {
            j jVar = (j) iVar.f26232e.get(i10);
            if (jVar != null) {
                e0.p("MessengerIpcClient", "Timing out request: " + i10);
                iVar.f26232e.remove(i10);
                jVar.b(new l("Timed out waiting for response", null));
                iVar.c();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:20|(1:22)(26:25|297|26|27|(1:30)(22:32|(1:34)|293|35|(7:37|(1:39)(1:41)|291|42|295|43|44)|24|48|(2:50|(2:52|(2:54|(2:56|(2:58|(2:60|(1:62)(1:63))(1:64))(1:65))(1:66))(1:67))(1:68))(1:69)|70|301|71|(1:73)(1:74)|75|(1:77)|81|(1:83)(7:85|(0)(1:88)|(3:303|90|(1:92)(1:93))|(2:99|(1:101)(4:102|(3:105|(1:309)(1:310)|103)|308|108))(1:108)|(1:110)(1:111)|112|(30:114|(1:116)(1:117)|118|(1:120)|121|(1:123)(1:124)|125|(2:127|(2:132|(1:134))(1:(3:131|132|(0))))(0)|135|(19:140|(1:142)|(1:157)(1:158)|159|(1:161)|162|(2:167|(2:173|(2:180|(2:181|(1:305)(2:183|(2:306|185)(1:307))))(0))(1:172))(1:166)|186|(3:190|(1:192)|193)|194|(1:196)|197|(1:201)|202|(3:204|(7:206|(1:208)(1:209)|210|(1:212)|213|(4:217|(1:219)|220|(1:222))|223)(1:225)|224)(10:226|(2:228|(2:241|242)(3:231|(5:233|(1:235)(1:236)|237|(1:239)|240)(0)|242))(1:243)|244|(1:246)|247|299|248|249|253|(5:255|(1:257)(1:258)|(1:262)|(1:264)|265))|266|(3:268|(1:270)(1:271)|(5:273|(1:275)|276|(1:278)|279))|280|281)(1:139)|143|(1:153)(1:155)|154|(0)(0)|159|(0)|162|(3:164|167|(3:170|173|(4:176|178|180|(3:181|(0)(0)|307))(0))(0))(0)|186|(4:188|190|(0)|193)(0)|194|(0)|197|(2:199|201)|202|(0)(0)|266|(0)|280|281)(2:282|283))|84|(0)|(0)(0)|(0)(0)|112|(0)(0))|31|293|35|(0)(0)|24|48|(0)(0)|70|301|71|(0)(0)|75|(0)|81|(0)(0)|84|(0)|(0)(0)|(0)(0)|112|(0)(0))|23|24|48|(0)(0)|70|301|71|(0)(0)|75|(0)|81|(0)(0)|84|(0)|(0)(0)|(0)(0)|112|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(26:25|297|26|27|(1:30)(22:32|(1:34)|293|35|(7:37|(1:39)(1:41)|291|42|295|43|44)|24|48|(2:50|(2:52|(2:54|(2:56|(2:58|(2:60|(1:62)(1:63))(1:64))(1:65))(1:66))(1:67))(1:68))(1:69)|70|301|71|(1:73)(1:74)|75|(1:77)|81|(1:83)(7:85|(0)(1:88)|(3:303|90|(1:92)(1:93))|(2:99|(1:101)(4:102|(3:105|(1:309)(1:310)|103)|308|108))(1:108)|(1:110)(1:111)|112|(30:114|(1:116)(1:117)|118|(1:120)|121|(1:123)(1:124)|125|(2:127|(2:132|(1:134))(1:(3:131|132|(0))))(0)|135|(19:140|(1:142)|(1:157)(1:158)|159|(1:161)|162|(2:167|(2:173|(2:180|(2:181|(1:305)(2:183|(2:306|185)(1:307))))(0))(1:172))(1:166)|186|(3:190|(1:192)|193)|194|(1:196)|197|(1:201)|202|(3:204|(7:206|(1:208)(1:209)|210|(1:212)|213|(4:217|(1:219)|220|(1:222))|223)(1:225)|224)(10:226|(2:228|(2:241|242)(3:231|(5:233|(1:235)(1:236)|237|(1:239)|240)(0)|242))(1:243)|244|(1:246)|247|299|248|249|253|(5:255|(1:257)(1:258)|(1:262)|(1:264)|265))|266|(3:268|(1:270)(1:271)|(5:273|(1:275)|276|(1:278)|279))|280|281)(1:139)|143|(1:153)(1:155)|154|(0)(0)|159|(0)|162|(3:164|167|(3:170|173|(4:176|178|180|(3:181|(0)(0)|307))(0))(0))(0)|186|(4:188|190|(0)|193)(0)|194|(0)|197|(2:199|201)|202|(0)(0)|266|(0)|280|281)(2:282|283))|84|(0)|(0)(0)|(0)(0)|112|(0)(0))|31|293|35|(0)(0)|24|48|(0)(0)|70|301|71|(0)(0)|75|(0)|81|(0)(0)|84|(0)|(0)(0)|(0)(0)|112|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0198, code lost:
    
        r5 = "Unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x025b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x025c, code lost:
    
        zc.c1.g(r13);
        r13.B.d(zc.j0.A1(r14), r0, "Fetching Google App Id failed with exception. appId");
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x029d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x057c A[EDGE_INSN: B:305:0x057c->B:186:0x057c BREAK  A[LOOP:0: B:181:0x0565->B:307:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017b A[Catch: NameNotFoundException -> 0x0198, TryCatch #1 {NameNotFoundException -> 0x0198, blocks: (B:35:0x0170, B:37:0x017b, B:39:0x0187), top: B:293:0x0170 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024c A[Catch: IllegalStateException -> 0x025b, TRY_LEAVE, TryCatch #5 {IllegalStateException -> 0x025b, blocks: (B:71:0x023a, B:75:0x0248, B:77:0x024c), top: B:301:0x023a }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02c3  */
    /* JADX WARN: Type inference failed for: r0v48, types: [zc.c2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e() throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 2154
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: re.a.e():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r1 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        ((java.lang.Runnable) r9.f21530d).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        cf.m.f3735y.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r9.f21530d), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        r9.f21530d = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f() {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r9.f21531g     // Catch: java.lang.Throwable -> L5a
            cf.m r2 = (cf.m) r2     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayDeque r2 = r2.f3737d     // Catch: java.lang.Throwable -> L5a
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5a
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r9.f21531g     // Catch: java.lang.Throwable -> L20
            cf.m r0 = (cf.m) r0     // Catch: java.lang.Throwable -> L20
            cf.l r3 = r0.f3738g     // Catch: java.lang.Throwable -> L20
            cf.l r4 = cf.l.RUNNING     // Catch: java.lang.Throwable -> L20
            if (r3 != r4) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L48
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L48
        L20:
            r0 = move-exception
            goto L7f
        L22:
            long r5 = r0.f3739r     // Catch: java.lang.Throwable -> L20
            r7 = 1
            long r5 = r5 + r7
            r0.f3739r = r5     // Catch: java.lang.Throwable -> L20
            r0.f3738g = r4     // Catch: java.lang.Throwable -> L20
            r0 = 1
        L2c:
            java.lang.Object r3 = r9.f21531g     // Catch: java.lang.Throwable -> L20
            cf.m r3 = (cf.m) r3     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r3 = r3.f3737d     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
            r9.f21530d = r3     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L49
            java.lang.Object r0 = r9.f21531g     // Catch: java.lang.Throwable -> L20
            cf.m r0 = (cf.m) r0     // Catch: java.lang.Throwable -> L20
            cf.l r3 = cf.l.IDLE     // Catch: java.lang.Throwable -> L20
            r0.f3738g = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L48
            goto L18
        L48:
            return
        L49:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5a
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r9.f21530d     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            r3.run()     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
        L57:
            r9.f21530d = r2     // Catch: java.lang.Throwable -> L5a
            goto L2
        L5a:
            r0 = move-exception
            goto L81
        L5c:
            r0 = move-exception
            goto L7c
        L5e:
            r3 = move-exception
            java.util.logging.Logger r4 = cf.m.f3735y     // Catch: java.lang.Throwable -> L5c
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r6.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r7 = r9.f21530d     // Catch: java.lang.Throwable -> L5c
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5c
            r6.append(r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5c
            goto L57
        L7c:
            r9.f21530d = r2     // Catch: java.lang.Throwable -> L5a
            throw r0     // Catch: java.lang.Throwable -> L5a
        L7f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L5a
        L81:
            if (r1 == 0) goto L8a
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L8a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: re.a.f():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v26, types: [bc.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v88, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r1v92, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v27, types: [bc.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [int] */
    @Override // java.lang.Runnable
    public final void run() throws JSONException, InterruptedException, Resources.NotFoundException, PackageManager.NameNotFoundException, ClassNotFoundException, IOException {
        g gVar;
        g g0Var;
        int i10 = 0;
        switch (this.f21529a) {
            case 0:
                q3.a aVar = (q3.a) this.f21531g;
                try {
                    f0.C((b) this.f21530d);
                    d2 d2Var = (d2) aVar.f20680g;
                    d2Var.s1();
                    aVar.T0();
                    d2Var.F = false;
                    d2Var.G = 1;
                    j0 j0Var = ((c1) d2Var.f1504d).f26889y;
                    c1.g(j0Var);
                    j0Var.J.c(((zzoh) aVar.f20679d).f5409a, "Successfully registered trigger URI");
                    d2Var.R1();
                    return;
                } catch (Error e4) {
                    e = e4;
                    aVar.L0(e);
                    return;
                } catch (RuntimeException e10) {
                    e = e10;
                    aVar.L0(e);
                    return;
                } catch (ExecutionException e11) {
                    aVar.L0(e11.getCause());
                    return;
                }
            case 1:
                ConnectionResult connectionResult = (ConnectionResult) this.f21530d;
                p pVar = (p) this.f21531g;
                d dVar = (d) pVar.f2641f;
                c cVar = (c) pVar.f2637b;
                n nVar = (n) dVar.F.get((bc.a) pVar.f2638c);
                if (nVar == null) {
                    return;
                }
                if (connectionResult.f4807d != 0) {
                    nVar.n(connectionResult, null);
                    return;
                }
                pVar.f2636a = true;
                if (cVar.b()) {
                    if (!pVar.f2636a || (gVar = (g) pVar.f2639d) == null) {
                        return;
                    }
                    ((cc.e) cVar).k(gVar, (Set) pVar.f2640e);
                    return;
                }
                try {
                    f fVar = (f) cVar;
                    ((cc.e) cVar).k(null, fVar.b() ? fVar.f3646z : Collections.EMPTY_SET);
                    return;
                } catch (SecurityException e12) {
                    e0.c("GoogleApiManager", "Failed to get service from broker. ", e12);
                    ((cc.e) cVar).f("Failed to get service from broker.");
                    nVar.n(new ConnectionResult(10, null, null), null);
                    return;
                }
            case 2:
                zb.g gVar2 = (zb.g) this.f21530d;
                bc.h hVar = (bc.h) this.f21531g;
                bc.g gVar3 = (bc.g) gVar2.f26826b;
                if (gVar3 == null) {
                    return;
                }
                hVar.y(gVar3.f2605a);
                return;
            case 3:
                z zVar = (z) this.f21531g;
                zak zakVar = (zak) this.f21530d;
                zVar.getClass();
                ConnectionResult connectionResult2 = zakVar.f5441d;
                if (connectionResult2.f4807d == 0) {
                    zay zayVar = zakVar.f5442g;
                    s.h(zayVar);
                    ConnectionResult connectionResult3 = zayVar.f4861g;
                    if (connectionResult3.f4807d != 0) {
                        e0.r("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult3)), new Exception());
                        zVar.k.f(connectionResult3);
                        zVar.j.e();
                        return;
                    }
                    p pVar2 = zVar.k;
                    IBinder iBinder = zayVar.f4860d;
                    if (iBinder == null) {
                        g0Var = null;
                    } else {
                        int i11 = cc.a.f3601e;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        g0Var = iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                    }
                    Set set = zVar.f2669h;
                    pVar2.getClass();
                    if (g0Var == null || set == null) {
                        e0.r("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        pVar2.f(new ConnectionResult(4, null, null));
                    } else {
                        pVar2.f2639d = g0Var;
                        pVar2.f2640e = set;
                        if (pVar2.f2636a) {
                            ((cc.e) ((c) pVar2.f2637b)).k(g0Var, set);
                        }
                    }
                } else {
                    zVar.k.f(connectionResult2);
                }
                zVar.j.e();
                return;
            case 4:
                k kVar = (k) this.f21531g;
                if (kVar.f2614d) {
                    c0 c0Var = (c0) this.f21530d;
                    ConnectionResult connectionResult4 = c0Var.f2587b;
                    if (connectionResult4.f4807d != 0 && connectionResult4.f4808g != null) {
                        ?? r12 = kVar.f2596a;
                        Activity activityA = kVar.a();
                        PendingIntent pendingIntent = connectionResult4.f4808g;
                        s.h(pendingIntent);
                        int i12 = c0Var.f2586a;
                        int i13 = GoogleApiActivity.f4815d;
                        Intent intent = new Intent(activityA, (Class<?>) GoogleApiActivity.class);
                        intent.putExtra("pending_intent", pendingIntent);
                        intent.putExtra("failing_client_id", i12);
                        intent.putExtra("notify_manager", false);
                        r12.g(1, intent);
                        return;
                    }
                    Activity activityA2 = kVar.a();
                    int i14 = connectionResult4.f4807d;
                    zb.c cVar2 = kVar.f2617x;
                    if (cVar2.a(i14, activityA2, null) != null) {
                        cVar2.e(kVar.a(), kVar.f2596a, connectionResult4.f4807d, kVar);
                        return;
                    }
                    if (connectionResult4.f4807d != 18) {
                        int i15 = c0Var.f2586a;
                        kVar.f2615g.set(null);
                        kVar.B.h(connectionResult4, i15);
                        return;
                    }
                    Activity activityA3 = kVar.a();
                    ProgressBar progressBar = new ProgressBar(activityA3, null, R.attr.progressBarStyleLarge);
                    progressBar.setIndeterminate(true);
                    progressBar.setVisibility(0);
                    AlertDialog.Builder builder = new AlertDialog.Builder(activityA3);
                    builder.setView(progressBar);
                    builder.setMessage(cc.j.b(activityA3, 18));
                    builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                    AlertDialog alertDialogCreate = builder.create();
                    zb.c.h(activityA3, alertDialogCreate, "GooglePlayServicesUpdatingDialog", kVar);
                    Context applicationContext = kVar.a().getApplicationContext();
                    io.sentry.internal.debugmeta.c cVar3 = new io.sentry.internal.debugmeta.c(6, this, alertDialogCreate, i10);
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme("package");
                    bc.s sVar = new bc.s(cVar3);
                    h3.c.d(applicationContext, sVar, intentFilter);
                    sVar.f2645b = applicationContext;
                    if (zb.f.c(applicationContext)) {
                        return;
                    }
                    k kVar2 = (k) this.f21531g;
                    kVar2.f2615g.set(null);
                    yh.a aVar2 = kVar2.B.J;
                    aVar2.sendMessage(aVar2.obtainMessage(3));
                    if (alertDialogCreate.isShowing()) {
                        alertDialogCreate.dismiss();
                    }
                    synchronized (sVar) {
                        try {
                            Context context = sVar.f2645b;
                            if (context != null) {
                                context.unregisterReceiver(sVar);
                            }
                            sVar.f2645b = null;
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                bu.g gVar4 = (bu.g) this.f21531g;
                q qVar = gVar4.f2967r;
                while (true) {
                    try {
                        ((Runnable) this.f21530d).run();
                    } catch (Throwable th2) {
                        w.o(th2, pq.i.f20621a);
                    }
                    Runnable runnableR0 = gVar4.r0();
                    if (runnableR0 == null) {
                        return;
                    }
                    this.f21530d = runnableR0;
                    i10++;
                    if (i10 >= 16 && qVar.p0(gVar4)) {
                        qVar.n0(gVar4, this);
                        return;
                    }
                }
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                try {
                    f();
                    return;
                } catch (Error e13) {
                    synchronized (((cf.m) this.f21531g).f3737d) {
                        ((cf.m) this.f21531g).f3738g = cf.l.IDLE;
                        throw e13;
                    }
                }
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                r rVar = (r) this.f21530d;
                if (rVar.f7321d) {
                    ((dd.l) this.f21531g).f7307r.o();
                    return;
                }
                try {
                    ((dd.l) this.f21531g).f7307r.l(((dd.l) this.f21531g).f7306g.j(rVar));
                    return;
                } catch (dd.f e14) {
                    if (e14.getCause() instanceof Exception) {
                        ((dd.l) this.f21531g).f7307r.n((Exception) e14.getCause());
                        return;
                    } else {
                        ((dd.l) this.f21531g).f7307r.n(e14);
                        return;
                    }
                } catch (Exception e15) {
                    ((dd.l) this.f21531g).f7307r.n(e15);
                    return;
                }
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                dd.l lVar = (dd.l) this.f21531g;
                try {
                    r rVar2 = (r) lVar.f7306g.j((r) this.f21530d);
                    if (rVar2 == null) {
                        lVar.y(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    o oVar = dd.i.f7296b;
                    rVar2.d(oVar, lVar);
                    rVar2.c(oVar, lVar);
                    rVar2.a(oVar, lVar);
                    return;
                } catch (dd.f e16) {
                    if (e16.getCause() instanceof Exception) {
                        lVar.f7307r.n((Exception) e16.getCause());
                        return;
                    } else {
                        lVar.f7307r.n(e16);
                        return;
                    }
                } catch (Exception e17) {
                    lVar.f7307r.n(e17);
                    return;
                }
            case 9:
                m mVar = (m) this.f21531g;
                synchronized (mVar.f7310g) {
                    try {
                        dd.c cVar4 = (dd.c) mVar.f7311r;
                        if (cVar4 != null) {
                            cVar4.s((r) this.f21530d);
                        }
                    } finally {
                    }
                }
                return;
            case 10:
                m mVar2 = (m) this.f21531g;
                synchronized (mVar2.f7310g) {
                    try {
                        dd.d dVar2 = (dd.d) mVar2.f7311r;
                        if (dVar2 != null) {
                            Exception excG = ((r) this.f21530d).g();
                            s.h(excG);
                            dVar2.y(excG);
                        }
                    } finally {
                    }
                }
                return;
            case 11:
                a();
                return;
            case 12:
                m mVar3 = (m) this.f21531g;
                try {
                    r rVarO = ((dd.g) mVar3.f7310g).o(((r) this.f21530d).h());
                    o oVar2 = dd.i.f7296b;
                    rVarO.d(oVar2, mVar3);
                    rVarO.c(oVar2, mVar3);
                    rVarO.a(oVar2, mVar3);
                    return;
                } catch (dd.f e18) {
                    if (e18.getCause() instanceof Exception) {
                        mVar3.y((Exception) e18.getCause());
                        return;
                    } else {
                        mVar3.y(e18);
                        return;
                    }
                } catch (CancellationException unused) {
                    mVar3.q();
                    return;
                } catch (Exception e19) {
                    mVar3.y(e19);
                    return;
                }
            case 13:
                r rVar3 = (r) this.f21530d;
                try {
                    rVar3.l(((Callable) this.f21531g).call());
                    return;
                } catch (Exception e20) {
                    rVar3.n(e20);
                    return;
                } catch (Throwable th3) {
                    rVar3.n(new RuntimeException(th3));
                    return;
                }
            case 14:
                ((g3.c) this.f21530d).f9277a = this.f21531g;
                return;
            case 15:
                ((Application) this.f21530d).unregisterActivityLifecycleCallbacks((g3.c) this.f21531g);
                return;
            case 16:
                Object obj = this.f21531g;
                Object obj2 = this.f21530d;
                try {
                    Method method = g3.d.f9286d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        g3.d.f9287e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e21) {
                    if (e21.getClass() == RuntimeException.class && e21.getMessage() != null && e21.getMessage().startsWith("Unable to stop")) {
                        throw e21;
                    }
                    return;
                } catch (Throwable th4) {
                    e0.c("ActivityRecreator", "Exception while invoking performStopActivity", th4);
                    return;
                }
            case 17:
                b();
                return;
            case 18:
                String str = (String) this.f21530d;
                t tVar = (t) this.f21531g;
                if (!Thread.interrupted()) {
                    tVar.h(str);
                }
                if (Thread.interrupted()) {
                    return;
                }
                tVar.g(str);
                return;
            case 19:
                r1 r1Var = (r1) this.f21530d;
                Typeface typeface = (Typeface) this.f21531g;
                j3.b bVar = (j3.b) r1Var.f10199d;
                if (bVar != null) {
                    bVar.i(typeface);
                    return;
                }
                return;
            case 20:
                ((q3.f) this.f21530d).accept(this.f21531g);
                return;
            case 21:
                ((View) this.f21530d).setVisibility(8);
                MainActivity mainActivity = (MainActivity) this.f21531g;
                if (((cm.a) mainActivity.f6008i0.getValue()).a()) {
                    ((jn.b) mainActivity.f6011l0.getValue()).a(true);
                }
                mainActivity.A();
                return;
            case 22:
                ((wt.g) this.f21531g).E((m0) this.f21530d);
                return;
            case 23:
                ((wt.g) this.f21530d).E((xt.c) this.f21531g);
                return;
            case 24:
                c();
                return;
            case 25:
                d();
                return;
            case 26:
                k1 k1Var = (k1) this.f21530d;
                k1Var.Z();
                if (zc.d.d()) {
                    k1Var.J().B1(this);
                    return;
                }
                zc.m mVar4 = (zc.m) this.f21531g;
                byte b2 = mVar4.f27006c != 0 ? (byte) 1 : (byte) 0;
                mVar4.f27006c = 0L;
                if (b2 != 0) {
                    mVar4.a();
                    return;
                }
                return;
            case 27:
                s0 s0Var = (s0) this.f21531g;
                c1 c1Var = s0Var.f27139b.f27154a;
                a1 a1Var = c1Var.B;
                c1.g(a1Var);
                a1Var.s1();
                Bundle bundle = new Bundle();
                bundle.putString("package_name", s0Var.f27138a);
                try {
                    a0 a0Var = (a0) ((com.google.android.gms.internal.measurement.c0) this.f21530d);
                    Parcel parcelR = a0Var.R();
                    com.google.android.gms.internal.measurement.z.b(parcelR, bundle);
                    Parcel parcelF = a0Var.f(parcelR, 1);
                    Bundle bundle2 = (Bundle) com.google.android.gms.internal.measurement.z.a(parcelF, Bundle.CREATOR);
                    parcelF.recycle();
                    if (bundle2 == null) {
                        j0 j0Var2 = c1Var.f26889y;
                        c1.g(j0Var2);
                        j0Var2.B.b("Install Referrer Service returned a null response");
                    }
                } catch (Exception e22) {
                    j0 j0Var3 = c1Var.f26889y;
                    c1.g(j0Var3);
                    j0Var3.B.c(e22.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                a1 a1Var2 = c1Var.B;
                c1.g(a1Var2);
                a1Var2.s1();
                throw new IllegalStateException("Unexpected call on client side");
            case 28:
                e();
                return;
            default:
                p3 p3Var = ((i1) this.f21531g).f26968d;
                p3Var.w();
                zzah zzahVar = (zzah) this.f21530d;
                if (zzahVar.f5399g.d() == null) {
                    p3Var.getClass();
                    String str2 = zzahVar.f5397a;
                    s.h(str2);
                    zzr zzrVarN = p3Var.N(str2);
                    if (zzrVarN != null) {
                        p3Var.W(zzahVar, zzrVarN);
                        return;
                    }
                    return;
                }
                p3Var.getClass();
                String str3 = zzahVar.f5397a;
                s.h(str3);
                zzr zzrVarN2 = p3Var.N(str3);
                if (zzrVarN2 != null) {
                    p3Var.V(zzahVar, zzrVarN2);
                    return;
                }
                return;
        }
    }

    public String toString() {
        switch (this.f21529a) {
            case 0:
                io.sentry.k kVar = new io.sentry.k(a.class.getSimpleName(), 18);
                q3.a aVar = (q3.a) this.f21531g;
                i4.b bVar = new i4.b();
                ((i4.b) kVar.f12399r).f11197d = bVar;
                kVar.f12399r = bVar;
                bVar.f11196a = aVar;
                return kVar.toString();
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                Runnable runnable = (Runnable) this.f21530d;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                return "SequentialExecutorWorker{state=" + ((cf.m) this.f21531g).f3738g + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(Object obj, int i10, Object obj2) {
        this.f21529a = i10;
        this.f21530d = obj;
        this.f21531g = obj2;
    }

    public a(k kVar, c0 c0Var) {
        this.f21529a = 4;
        Objects.requireNonNull(kVar);
        this.f21531g = kVar;
        this.f21530d = c0Var;
    }

    public a(s0 s0Var, com.google.android.gms.internal.measurement.c0 c0Var, s0 s0Var2) {
        this.f21529a = 27;
        this.f21530d = c0Var;
        this.f21531g = s0Var;
    }

    public a(cf.m mVar) {
        this.f21529a = 6;
        this.f21531g = mVar;
    }
}
