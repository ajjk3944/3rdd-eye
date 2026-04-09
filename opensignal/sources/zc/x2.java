package zc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzah;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class x2 extends w {
    public final t2 B;
    public ScheduledExecutorService D;
    public final dj.i E;
    public final ArrayList F;
    public final t2 G;

    /* renamed from: r, reason: collision with root package name */
    public final w2 f27266r;

    /* renamed from: x, reason: collision with root package name */
    public x f27267x;

    /* renamed from: y, reason: collision with root package name */
    public volatile Boolean f27268y;

    public x2(c1 c1Var) {
        super(c1Var);
        this.F = new ArrayList();
        this.E = new dj.i(c1Var.G);
        this.f27266r = new w2(this);
        this.B = new t2(this, c1Var, 0);
        this.G = new t2(this, c1Var, 1);
    }

    public final void A1() {
        s1();
        t1();
        w2 w2Var = this.f27266r;
        if (w2Var.f27259b != null && (w2Var.f27259b.q() || w2Var.f27259b.r())) {
            w2Var.f27259b.e();
        }
        w2Var.f27259b = null;
        try {
            fc.a.b().c(((c1) this.f1504d).f26884a, w2Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f27267x = null;
    }

    public final boolean B1() {
        s1();
        t1();
        if (!z1()) {
            return true;
        }
        s3 s3Var = ((c1) this.f1504d).E;
        c1.e(s3Var);
        return s3Var.Y1() >= ((Integer) u.J0.a(null)).intValue();
    }

    public final boolean C1() {
        s1();
        t1();
        if (!z1()) {
            return true;
        }
        s3 s3Var = ((c1) this.f1504d).E;
        c1.e(s3Var);
        return s3Var.Y1() >= 241200;
    }

    public final void D1(ComponentName componentName) {
        s1();
        if (this.f27267x != null) {
            this.f27267x = null;
            j0 j0Var = ((c1) this.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.K.c(componentName, "Disconnected from device MeasurementService");
            s1();
            y1();
        }
    }

    public final void E1() {
        ((c1) this.f1504d).getClass();
    }

    public final void F1() {
        s1();
        dj.i iVar = this.E;
        ((gc.a) iVar.f7405g).getClass();
        iVar.f7404d = SystemClock.elapsedRealtime();
        ((c1) this.f1504d).getClass();
        this.B.b(((Long) u.Y.a(null)).longValue());
    }

    public final void G1(Runnable runnable) {
        s1();
        if (J1()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.F;
        long size = arrayList.size();
        c1 c1Var = (c1) this.f1504d;
        c1Var.getClass();
        if (size >= 1000) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.B.b("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.G.b(60000L);
            y1();
        }
    }

    public final void H1() {
        s1();
        c1 c1Var = (c1) this.f1504d;
        j0 j0Var = c1Var.f26889y;
        c1.g(j0Var);
        su.b bVar = j0Var.K;
        ArrayList arrayList = this.F;
        bVar.c(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e4) {
                j0 j0Var2 = c1Var.f26889y;
                c1.g(j0Var2);
                j0Var2.B.c(e4, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.G.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzr I1(boolean r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f1504d
            zc.c1 r0 = (zc.c1) r0
            r0.getClass()
            zc.c0 r1 = r0.l()
            r2 = 0
            if (r11 == 0) goto Lca
            zc.j0 r11 = r0.f26889y
            zc.c1.g(r11)
            java.lang.Object r11 = r11.f1504d
            zc.c1 r11 = (zc.c1) r11
            zc.r0 r0 = r11.f26888x
            zc.c1.e(r0)
            zc.q0 r0 = r0.f27123y
            if (r0 != 0) goto L22
            goto Lca
        L22:
            zc.r0 r11 = r11.f26888x
            zc.c1.e(r11)
            zc.q0 r11 = r11.f27123y
            zc.k1 r0 = r11.f27107e
            zc.r0 r0 = (zc.r0) r0
            r0.s1()
            r0.s1()
            zc.k1 r3 = r11.f27107e
            zc.r0 r3 = (zc.r0) r3
            android.content.SharedPreferences r3 = r3.w1()
            java.lang.Object r4 = r11.f27104b
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            long r3 = r3.getLong(r4, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L4e
            r11.b()
            r3 = r5
            goto L60
        L4e:
            java.lang.Object r7 = r0.f1504d
            zc.c1 r7 = (zc.c1) r7
            gc.a r7 = r7.G
            r7.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r7
            long r3 = java.lang.Math.abs(r3)
        L60:
            long r7 = r11.f27103a
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L68
        L66:
            r11 = r2
            goto L9f
        L68:
            long r7 = r7 + r7
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 <= 0) goto L71
            r11.b()
            goto L66
        L71:
            java.io.Serializable r3 = r11.f27106d
            java.lang.String r3 = (java.lang.String) r3
            android.content.SharedPreferences r4 = r0.w1()
            java.lang.String r3 = r4.getString(r3, r2)
            java.io.Serializable r4 = r11.f27105c
            java.lang.String r4 = (java.lang.String) r4
            android.content.SharedPreferences r0 = r0.w1()
            long r7 = r0.getLong(r4, r5)
            r11.b()
            if (r3 == 0) goto L9d
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 > 0) goto L93
            goto L9d
        L93:
            android.util.Pair r11 = new android.util.Pair
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r11.<init>(r3, r0)
            goto L9f
        L9d:
            android.util.Pair r11 = zc.r0.W
        L9f:
            if (r11 == 0) goto Lca
            android.util.Pair r0 = zc.r0.W
            if (r11 != r0) goto La6
            goto Lca
        La6:
            java.lang.Object r0 = r11.second
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r11 = r11.first
            java.lang.String r11 = (java.lang.String) r11
            int r2 = r0.length()
            java.lang.String r3 = java.lang.String.valueOf(r11)
            int r2 = r2 + 1
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = ":"
            java.lang.String r2 = h0.b.s(r4, r0, r2, r11)
        Lca:
            com.google.android.gms.measurement.internal.zzr r11 = r1.w1(r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.x2.I1(boolean):com.google.android.gms.measurement.internal.zzr");
    }

    public final boolean J1() {
        s1();
        t1();
        return this.f27267x != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x02da A[Catch: all -> 0x0202, SQLiteException -> 0x02b4, SQLiteDatabaseLockedException -> 0x02b9, SQLiteFullException -> 0x02bd, TryCatch #59 {all -> 0x0202, blocks: (B:102:0x01dd, B:104:0x01f1, B:106:0x01f6, B:119:0x021a, B:120:0x021d, B:118:0x0216, B:123:0x0223, B:125:0x0237, B:132:0x024f, B:133:0x0258, B:134:0x025b, B:130:0x0249, B:137:0x025f, B:139:0x0273, B:146:0x028b, B:147:0x0295, B:148:0x0298, B:144:0x0285, B:151:0x029c, B:155:0x02b0, B:170:0x02da, B:171:0x02e4, B:172:0x02e7, B:168:0x02d4, B:180:0x02f4, B:181:0x0301, B:206:0x0366), top: B:422:0x01dd }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0444 A[Catch: all -> 0x0480, TRY_ENTER, TryCatch #56 {all -> 0x0480, blocks: (B:269:0x0470, B:259:0x0444, B:261:0x044a, B:262:0x044d, B:279:0x0491, B:208:0x037b, B:210:0x0385, B:215:0x0396), top: B:420:0x0470 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x047c A[PHI: r5 r6 r24 r25 r27 r37 r38
  0x047c: PHI (r5v15 android.database.sqlite.SQLiteDatabase) = 
  (r5v12 android.database.sqlite.SQLiteDatabase)
  (r5v13 android.database.sqlite.SQLiteDatabase)
  (r5v16 android.database.sqlite.SQLiteDatabase)
 binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
  0x047c: PHI (r6v5 int) = (r6v3 int), (r6v3 int), (r6v6 int) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
  0x047c: PHI (r24v9 int) = (r24v6 int), (r24v7 int), (r24v10 int) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
  0x047c: PHI (r25v9 java.lang.String) = (r25v6 java.lang.String), (r25v7 java.lang.String), (r25v10 java.lang.String) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
  0x047c: PHI (r27v9 java.lang.String) = (r27v6 java.lang.String), (r27v7 java.lang.String), (r27v10 java.lang.String) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
  0x047c: PHI (r37v9 int) = (r37v6 int), (r37v7 int), (r37v10 int) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
  0x047c: PHI (r38v9 java.lang.String) = (r38v6 java.lang.String), (r38v7 java.lang.String), (r38v10 java.lang.String) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:476:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x04a6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K1(zc.x r67, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r68, com.google.android.gms.measurement.internal.zzr r69) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.x2.K1(zc.x, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable, com.google.android.gms.measurement.internal.zzr):void");
    }

    public final void L1(zzah zzahVar) {
        boolean zZ1;
        s1();
        t1();
        c1 c1Var = (c1) this.f1504d;
        c1Var.getClass();
        e0 e0VarI = c1Var.i();
        c1 c1Var2 = (c1) e0VarI.f1504d;
        c1.e(c1Var2.E);
        byte[] bArrW1 = s3.W1(zzahVar);
        if (bArrW1.length > 131072) {
            j0 j0Var = c1Var2.f26889y;
            c1.g(j0Var);
            j0Var.D.b("Conditional user property too long for local database. Sending directly to service");
            zZ1 = false;
        } else {
            zZ1 = e0VarI.z1(2, bArrW1);
        }
        G1(new yb.g(this, I1(true), zZ1, new zzah(zzahVar)));
    }

    @Override // zc.w
    public final boolean v1() {
        return false;
    }

    public final void w1(AtomicReference atomicReference) {
        s1();
        t1();
        G1(new bc.e0(this, atomicReference, I1(false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x1(android.os.Bundle r8) {
        /*
            r7 = this;
            r7.s1()
            r7.t1()
            com.google.android.gms.measurement.internal.zzbe r4 = new com.google.android.gms.measurement.internal.zzbe
            r4.<init>(r8)
            r7.E1()
            java.lang.Object r0 = r7.f1504d
            zc.c1 r0 = (zc.c1) r0
            zc.f r1 = r0.f26887r
            r2 = 0
            zc.t r3 = zc.u.f27166b1
            boolean r1 = r1.C1(r2, r3)
            r2 = 0
            if (r1 == 0) goto L59
            zc.e0 r0 = r0.i()
            java.lang.Object r1 = r0.f1504d
            zc.c1 r1 = (zc.c1) r1
            zc.s3 r3 = r1.E
            zc.j0 r1 = r1.f26889y
            zc.c1.e(r3)
            byte[] r3 = zc.s3.W1(r4)
            if (r3 != 0) goto L3f
            zc.c1.g(r1)
            su.b r0 = r1.D
            java.lang.String r1 = "Null default event parameters; not writing to database"
            r0.b(r1)
        L3d:
            r0 = r2
            goto L54
        L3f:
            int r5 = r3.length
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r5 <= r6) goto L4f
            zc.c1.g(r1)
            su.b r0 = r1.D
            java.lang.String r1 = "Default event parameters too long for local database. Sending directly to service"
            r0.b(r1)
            goto L3d
        L4f:
            r1 = 4
            boolean r0 = r0.z1(r1, r3)
        L54:
            if (r0 == 0) goto L59
            r0 = 1
            r3 = r0
            goto L5a
        L59:
            r3 = r2
        L5a:
            com.google.android.gms.measurement.internal.zzr r2 = r7.I1(r2)
            zc.u1 r0 = new zc.u1
            r1 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r7.G1(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.x2.x1(android.os.Bundle):void");
    }

    public final void y1() {
        s1();
        t1();
        if (J1()) {
            return;
        }
        if (z1()) {
            w2 w2Var = this.f27266r;
            x2 x2Var = w2Var.f27260c;
            x2Var.s1();
            Context context = ((c1) x2Var.f1504d).f26884a;
            synchronized (w2Var) {
                try {
                    if (w2Var.f27258a) {
                        j0 j0Var = ((c1) w2Var.f27260c.f1504d).f26889y;
                        c1.g(j0Var);
                        j0Var.K.b("Connection attempt already in progress");
                        return;
                    } else {
                        if (w2Var.f27259b != null && (w2Var.f27259b.r() || w2Var.f27259b.q())) {
                            j0 j0Var2 = ((c1) w2Var.f27260c.f1504d).f26889y;
                            c1.g(j0Var2);
                            j0Var2.K.b("Already awaiting connection attempt");
                            return;
                        }
                        w2Var.f27259b = new g0(context, Looper.getMainLooper(), cc.e0.a(context), zb.d.f26817b, 93, w2Var, w2Var, null);
                        j0 j0Var3 = ((c1) w2Var.f27260c.f1504d).f26889y;
                        c1.g(j0Var3);
                        j0Var3.K.b("Connecting to remote service");
                        w2Var.f27258a = true;
                        cc.s.h(w2Var.f27259b);
                        w2Var.f27259b.c();
                        return;
                    }
                } finally {
                }
            }
        }
        c1 c1Var = (c1) this.f1504d;
        if (c1Var.f26887r.v1()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = c1Var.f26884a.getPackageManager().queryIntentServices(new Intent().setClassName(c1Var.f26884a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            j0 j0Var4 = c1Var.f26889y;
            c1.g(j0Var4);
            j0Var4.B.b("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(c1Var.f26884a, "com.google.android.gms.measurement.AppMeasurementService"));
        w2 w2Var2 = this.f27266r;
        x2 x2Var2 = w2Var2.f27260c;
        x2Var2.s1();
        Context context2 = ((c1) x2Var2.f1504d).f26884a;
        fc.a aVarB = fc.a.b();
        synchronized (w2Var2) {
            try {
                if (w2Var2.f27258a) {
                    j0 j0Var5 = ((c1) w2Var2.f27260c.f1504d).f26889y;
                    c1.g(j0Var5);
                    j0Var5.K.b("Connection attempt already in progress");
                } else {
                    x2 x2Var3 = w2Var2.f27260c;
                    j0 j0Var6 = ((c1) x2Var3.f1504d).f26889y;
                    c1.g(j0Var6);
                    j0Var6.K.b("Using local app measurement service");
                    w2Var2.f27258a = true;
                    aVarB.a(context2, intent, x2Var3.f27266r, 129);
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z1() {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.x2.z1():boolean");
    }
}
