package ec;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.or;
import com.google.android.gms.internal.ads.ys1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j3 extends f0 {

    /* renamed from: d, reason: collision with root package name */
    public final i3 f22818d;

    /* renamed from: e, reason: collision with root package name */
    public g0 f22819e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Boolean f22820f;
    public final f3 g;

    /* renamed from: h, reason: collision with root package name */
    public ScheduledExecutorService f22821h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.recyclerview.widget.d f22822i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final f3 f22823k;

    public j3(o1 o1Var) {
        super(o1Var);
        this.j = new ArrayList();
        this.f22822i = new androidx.recyclerview.widget.d(o1Var.f22957k);
        this.f22818d = new i3(this);
        this.g = new f3(this, o1Var, 0);
        this.f22823k = new f3(this, o1Var, 1);
    }

    @Override // ec.f0
    public final boolean E() {
        return false;
    }

    public final void F(AtomicReference atomicReference) {
        B();
        C();
        P(new b4.o(this, atomicReference, R(false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(android.os.Bundle r8) {
        /*
            r7 = this;
            r7.B()
            r7.C()
            ec.t r4 = new ec.t
            r4.<init>(r8)
            r7.N()
            java.lang.Object r0 = r7.f218b
            ec.o1 r0 = (ec.o1) r0
            ec.g r1 = r0.f22952d
            r2 = 0
            ec.c0 r3 = ec.d0.f22624c1
            boolean r1 = r1.L(r2, r3)
            r2 = 0
            if (r1 == 0) goto L59
            ec.n0 r0 = r0.o()
            java.lang.Object r1 = r0.f218b
            ec.o1 r1 = (ec.o1) r1
            ec.l4 r3 = r1.f22956i
            ec.s0 r1 = r1.f22954f
            ec.o1.k(r3)
            byte[] r3 = ec.l4.g0(r4)
            if (r3 != 0) goto L3f
            ec.o1.m(r1)
            com.google.android.gms.internal.ads.or r0 = r1.f23054h
            java.lang.String r1 = "Null default event parameters; not writing to database"
            r0.d(r1)
        L3d:
            r0 = r2
            goto L54
        L3f:
            int r5 = r3.length
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r5 <= r6) goto L4f
            ec.o1.m(r1)
            com.google.android.gms.internal.ads.or r0 = r1.f23054h
            java.lang.String r1 = "Default event parameters too long for local database. Sending directly to service"
            r0.d(r1)
            goto L3d
        L4f:
            r1 = 4
            boolean r0 = r0.I(r1, r3)
        L54:
            if (r0 == 0) goto L59
            r0 = 1
            r3 = r0
            goto L5a
        L59:
            r3 = r2
        L5a:
            ec.n4 r2 = r7.R(r2)
            ec.g2 r0 = new ec.g2
            r1 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r7.P(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.j3.G(android.os.Bundle):void");
    }

    public final void H() {
        B();
        C();
        if (S()) {
            return;
        }
        if (I()) {
            this.f22818d.a();
            return;
        }
        o1 o1Var = (o1) this.f218b;
        if (o1Var.f22952d.E()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = o1Var.f22949a.getPackageManager().queryIntentServices(new Intent().setClassName(o1Var.f22949a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.g.d("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(o1Var.f22949a, "com.google.android.gms.measurement.AppMeasurementService"));
        i3 i3Var = this.f22818d;
        j3 j3Var = i3Var.f22798c;
        j3Var.B();
        Context context = ((o1) j3Var.f218b).f22949a;
        sb.a aVarA = sb.a.a();
        synchronized (i3Var) {
            try {
                if (i3Var.f22796a) {
                    s0 s0Var2 = ((o1) i3Var.f22798c.f218b).f22954f;
                    o1.m(s0Var2);
                    s0Var2.f23060o.d("Connection attempt already in progress");
                    return;
                }
                j3 j3Var2 = i3Var.f22798c;
                s0 s0Var3 = ((o1) j3Var2.f218b).f22954f;
                o1.m(s0Var3);
                s0Var3.f23060o.d("Using local app measurement service");
                i3Var.f22796a = true;
                aVarA.c(context, context.getClass().getName(), intent, j3Var2.f22818d, 129, null);
            } catch (Throwable th2) {
                throw th2;
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
    public final boolean I() throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.j3.I():boolean");
    }

    public final void J() {
        B();
        C();
        i3 i3Var = this.f22818d;
        if (i3Var.f22797b != null && (i3Var.f22797b.g() || i3Var.f22797b.c())) {
            i3Var.f22797b.f();
        }
        i3Var.f22797b = null;
        try {
            sb.a.a().b(((o1) this.f218b).f22949a, i3Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f22819e = null;
    }

    public final boolean K() {
        B();
        C();
        if (!I()) {
            return true;
        }
        l4 l4Var = ((o1) this.f218b).f22956i;
        o1.k(l4Var);
        return l4Var.i0() >= ((Integer) d0.K0.a(null)).intValue();
    }

    public final boolean L() {
        B();
        C();
        if (!I()) {
            return true;
        }
        l4 l4Var = ((o1) this.f218b).f22956i;
        o1.k(l4Var);
        return l4Var.i0() >= 241200;
    }

    public final void M(ComponentName componentName) {
        B();
        if (this.f22819e != null) {
            this.f22819e = null;
            s0 s0Var = ((o1) this.f218b).f22954f;
            o1.m(s0Var);
            s0Var.f23060o.e(componentName, "Disconnected from device MeasurementService");
            B();
            H();
        }
    }

    public final void N() {
        ((o1) this.f218b).getClass();
    }

    public final void O() {
        B();
        androidx.recyclerview.widget.d dVar = this.f22822i;
        ((tb.a) dVar.f1324c).getClass();
        dVar.f1323b = SystemClock.elapsedRealtime();
        ((o1) this.f218b).getClass();
        this.g.b(((Long) d0.Z.a(null)).longValue());
    }

    public final void P(Runnable runnable) {
        B();
        if (S()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.j;
        long size = arrayList.size();
        o1 o1Var = (o1) this.f218b;
        o1Var.getClass();
        if (size >= 1000) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.g.d("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.f22823k.b(60000L);
            H();
        }
    }

    public final void Q() {
        B();
        o1 o1Var = (o1) this.f218b;
        s0 s0Var = o1Var.f22954f;
        o1.m(s0Var);
        or orVar = s0Var.f23060o;
        ArrayList arrayList = this.j;
        orVar.e(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e2) {
                s0 s0Var2 = o1Var.f22954f;
                o1.m(s0Var2);
                s0Var2.g.e(e2, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f22823k.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ec.n4 R(boolean r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f218b
            ec.o1 r0 = (ec.o1) r0
            r0.getClass()
            ec.l0 r1 = r0.r()
            r2 = 0
            if (r11 == 0) goto Lca
            ec.s0 r11 = r0.f22954f
            ec.o1.m(r11)
            java.lang.Object r11 = r11.f218b
            ec.o1 r11 = (ec.o1) r11
            ec.b1 r0 = r11.f22953e
            ec.o1.k(r0)
            b8.d r0 = r0.f22559f
            if (r0 != 0) goto L22
            goto Lca
        L22:
            ec.b1 r11 = r11.f22953e
            ec.o1.k(r11)
            b8.d r11 = r11.f22559f
            java.lang.Object r0 = r11.f2077e
            ec.b1 r0 = (ec.b1) r0
            r0.B()
            r0.B()
            java.lang.Object r3 = r11.f2077e
            ec.b1 r3 = (ec.b1) r3
            android.content.SharedPreferences r3 = r3.F()
            java.lang.Object r4 = r11.f2074b
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            long r3 = r3.getLong(r4, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L4e
            r11.i()
            r3 = r5
            goto L60
        L4e:
            java.lang.Object r7 = r0.f218b
            ec.o1 r7 = (ec.o1) r7
            tb.a r7 = r7.f22957k
            r7.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r7
            long r3 = java.lang.Math.abs(r3)
        L60:
            long r7 = r11.f2073a
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L68
        L66:
            r11 = r2
            goto L9f
        L68:
            long r7 = r7 + r7
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 <= 0) goto L71
            r11.i()
            goto L66
        L71:
            java.lang.Object r3 = r11.f2076d
            java.lang.String r3 = (java.lang.String) r3
            android.content.SharedPreferences r4 = r0.F()
            java.lang.String r3 = r4.getString(r3, r2)
            java.lang.Object r4 = r11.f2075c
            java.lang.String r4 = (java.lang.String) r4
            android.content.SharedPreferences r0 = r0.F()
            long r7 = r0.getLong(r4, r5)
            r11.i()
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
            android.util.Pair r11 = ec.b1.A
        L9f:
            if (r11 == 0) goto Lca
            android.util.Pair r0 = ec.b1.A
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
            java.lang.String r2 = r5.c.m(r4, r0, r2, r11)
        Lca:
            ec.n4 r11 = r1.F(r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.j3.R(boolean):ec.n4");
    }

    public final boolean S() {
        B();
        C();
        return this.f22819e != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x02da A[Catch: all -> 0x0202, SQLiteException -> 0x02b4, SQLiteDatabaseLockedException -> 0x02b9, SQLiteFullException -> 0x02bd, TryCatch #61 {all -> 0x0202, blocks: (B:102:0x01dd, B:104:0x01f1, B:106:0x01f6, B:119:0x021a, B:120:0x021d, B:118:0x0216, B:123:0x0223, B:125:0x0237, B:132:0x024f, B:133:0x0258, B:134:0x025b, B:130:0x0249, B:137:0x025f, B:139:0x0273, B:146:0x028b, B:147:0x0295, B:148:0x0298, B:144:0x0285, B:151:0x029c, B:155:0x02b0, B:170:0x02da, B:171:0x02e4, B:172:0x02e7, B:168:0x02d4, B:180:0x02f4, B:181:0x0301, B:206:0x0366), top: B:422:0x01dd }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0444 A[Catch: all -> 0x0480, TRY_ENTER, TryCatch #58 {all -> 0x0480, blocks: (B:269:0x0470, B:259:0x0444, B:261:0x044a, B:262:0x044d, B:279:0x0491, B:208:0x037b, B:210:0x0385, B:215:0x0396), top: B:420:0x0470 }] */
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
    public final void T(ec.g0 r67, qb.a r68, ec.n4 r69) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.j3.T(ec.g0, qb.a, ec.n4):void");
    }

    public final void U(e eVar) {
        boolean zI;
        B();
        C();
        o1 o1Var = (o1) this.f218b;
        o1Var.getClass();
        n0 n0VarO = o1Var.o();
        o1 o1Var2 = (o1) n0VarO.f218b;
        o1.k(o1Var2.f22956i);
        byte[] bArrG0 = l4.g0(eVar);
        if (bArrG0.length > 131072) {
            s0 s0Var = o1Var2.f22954f;
            o1.m(s0Var);
            s0Var.f23054h.d("Conditional user property too long for local database. Sending directly to service");
            zI = false;
        } else {
            zI = n0VarO.I(2, bArrG0);
        }
        P(new ys1(this, R(true), zI, new e(eVar)));
    }
}
