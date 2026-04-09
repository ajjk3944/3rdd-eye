package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mu2 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Cloneable g;
    public final Object h;
    public final Object i;

    public mu2(pm pmVar, kf3 kf3Var, vu2 vu2Var, tv2 tv2Var) {
        i30.m(pmVar, "adQualityDataStore");
        i30.m(vu2Var, "dataPinger");
        this.i = vu2Var;
        this.c = wl2.a(new jt((ExecutorService) kf3Var.g));
        this.d = new tf0();
        this.e = new tf0();
        this.f = new tf0();
        this.h = pmVar;
    }

    public void a(Object obj) {
        synchronized (this.i) {
            try {
                if (this.a) {
                    return;
                }
                ((CopyOnWriteArraySet) this.f).add(new ht2(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Object obj) {
        g();
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ht2 ht2Var = (ht2) it.next();
            if (ht2Var.a.equals(obj)) {
                vs2 vs2Var = (vs2) this.e;
                ht2Var.d = true;
                if (ht2Var.c) {
                    ht2Var.c = false;
                    vs2Var.e(ht2Var.a, ht2Var.b.g());
                }
                copyOnWriteArraySet.remove(ht2Var);
            }
        }
    }

    public void c(int i, ks2 ks2Var) {
        g();
        ((ArrayDeque) this.h).add(new k7(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f), i, ks2Var, 5));
    }

    public void d() {
        g();
        ArrayDeque arrayDeque = (ArrayDeque) this.h;
        if (arrayDeque.isEmpty()) {
            return;
        }
        d13 d13Var = (d13) this.d;
        Handler handler = d13Var.a;
        Handler handler2 = d13Var.a;
        if (!handler.hasMessages(1)) {
            v03 v03VarF = d13.f();
            Message messageObtainMessage = handler2.obtainMessage(1);
            v03VarF.a = messageObtainMessage;
            messageObtainMessage.getClass();
            handler2.sendMessageAtFrontOfQueue(messageObtainMessage);
            v03VarF.a = null;
            d13.e(v03VarF);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) this.g;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public void e() {
        g();
        synchronized (this.i) {
            this.a = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ht2 ht2Var = (ht2) it.next();
            vs2 vs2Var = (vs2) this.e;
            ht2Var.d = true;
            if (ht2Var.c) {
                ht2Var.c = false;
                vs2Var.e(ht2Var.a, ht2Var.b.g());
            }
        }
        copyOnWriteArraySet.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0109 A[EDGE_INSN: B:67:0x0109->B:58:0x0109 BREAK  A[LOOP:0: B:35:0x008b->B:57:0x00fb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r17v0, types: [mu2] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v19, types: [qf0] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(defpackage.qj r18) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu2.f(qj):java.lang.Object");
    }

    public void g() {
        if (this.b) {
            zt0.b0(Thread.currentThread() == ((d13) this.d).a.getLooper().getThread());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(java.lang.String r6, defpackage.qj r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ef3
            if (r0 == 0) goto L13
            r0 = r7
            ef3 r0 = (defpackage.ef3) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            ef3 r0 = new ef3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.k
            int r1 = r0.m
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            long r3 = r0.j
            tf0 r6 = r0.i
            java.lang.String r0 = r0.n
            defpackage.bd2.x(r7)
            goto L50
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.bd2.x(r7)
            java.lang.Object r7 = r5.d
            tf0 r7 = (defpackage.tf0) r7
            long r3 = java.lang.System.currentTimeMillis()
            r0.n = r6
            r0.i = r7
            r0.j = r3
            r0.m = r2
            java.lang.Object r0 = r7.c(r0)
            rk r1 = defpackage.rk.f
            if (r0 == r1) goto L85
            r0 = r6
            r6 = r7
        L50:
            boolean r7 = r5.a     // Catch: java.lang.Throwable -> L80
            z31 r1 = defpackage.z31.a
            if (r7 == 0) goto L5a
            r6.d()
            return r1
        L5a:
            r5.a = r2     // Catch: java.lang.Throwable -> L80
            qe3 r7 = defpackage.qe3.R()     // Catch: java.lang.Throwable -> L80
            n54 r7 = r7.s()     // Catch: java.lang.Throwable -> L80
            pe3 r7 = (defpackage.pe3) r7     // Catch: java.lang.Throwable -> L80
            r5.g = r7     // Catch: java.lang.Throwable -> L80
            r7.b()     // Catch: java.lang.Throwable -> L80
            p54 r2 = r7.g     // Catch: java.lang.Throwable -> L80
            qe3 r2 = (defpackage.qe3) r2     // Catch: java.lang.Throwable -> L80
            r2.S(r0)     // Catch: java.lang.Throwable -> L80
            r7.b()     // Catch: java.lang.Throwable -> L80
            p54 r7 = r7.g     // Catch: java.lang.Throwable -> L80
            qe3 r7 = (defpackage.qe3) r7     // Catch: java.lang.Throwable -> L80
            r7.Y(r3)     // Catch: java.lang.Throwable -> L80
            r6.d()
            return r1
        L80:
            r7 = move-exception
            r6.d()
            throw r7
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu2.h(java.lang.String, qj):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0088 A[Catch: all -> 0x00af, TRY_LEAVE, TryCatch #1 {all -> 0x00af, blocks: (B:31:0x0081, B:33:0x0088, B:40:0x00a9, B:41:0x00ae), top: B:51:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9 A[Catch: all -> 0x00af, TRY_ENTER, TryCatch #1 {all -> 0x00af, blocks: (B:31:0x0081, B:33:0x0088, B:40:0x00a9, B:41:0x00ae), top: B:51:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i(defpackage.qj r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.af3
            if (r0 == 0) goto L13
            r0 = r11
            af3 r0 = (defpackage.af3) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            af3 r0 = new af3
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.k
            int r1 = r0.m
            z31 r2 = defpackage.z31.a
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            rk r7 = defpackage.rk.f
            if (r1 == 0) goto L4c
            if (r1 == r6) goto L46
            if (r1 == r5) goto L3e
            if (r1 == r4) goto L3a
            if (r1 != r3) goto L32
            defpackage.bd2.x(r11)
            return r2
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3a:
            defpackage.bd2.x(r11)
            goto L9f
        L3e:
            long r5 = r0.j
            tf0 r1 = r0.i
            defpackage.bd2.x(r11)
            goto L81
        L46:
            tf0 r1 = r0.i
            defpackage.bd2.x(r11)
            goto L5e
        L4c:
            defpackage.bd2.x(r11)
            java.lang.Object r11 = r10.e
            r1 = r11
            tf0 r1 = (defpackage.tf0) r1
            r0.i = r1
            r0.m = r6
            java.lang.Object r11 = r1.c(r0)
            if (r11 == r7) goto Lb9
        L5e:
            boolean r11 = r10.b     // Catch: java.lang.Throwable -> Lb4
            if (r11 == 0) goto L66
            r1.d()
            return r2
        L66:
            r10.b = r6     // Catch: java.lang.Throwable -> Lb4
            r1.d()
            java.lang.Object r11 = r10.d
            r1 = r11
            tf0 r1 = (defpackage.tf0) r1
            long r8 = java.lang.System.currentTimeMillis()
            r0.i = r1
            r0.j = r8
            r0.m = r5
            java.lang.Object r11 = r1.c(r0)
            if (r11 == r7) goto Lb9
            r5 = r8
        L81:
            java.lang.Cloneable r11 = r10.g     // Catch: java.lang.Throwable -> Laf
            pe3 r11 = (defpackage.pe3) r11     // Catch: java.lang.Throwable -> Laf
            r8 = 0
            if (r11 == 0) goto La9
            r11.b()     // Catch: java.lang.Throwable -> Laf
            p54 r11 = r11.g     // Catch: java.lang.Throwable -> Laf
            qe3 r11 = (defpackage.qe3) r11     // Catch: java.lang.Throwable -> Laf
            r11.b0(r5)     // Catch: java.lang.Throwable -> Laf
            r1.d()
            r0.i = r8
            r0.m = r4
            java.lang.Object r11 = r10.p(r5, r0)
            if (r11 == r7) goto Lb9
        L9f:
            r0.m = r3
            java.lang.Object r11 = r10.q(r0)
            if (r11 != r7) goto La8
            goto Lb9
        La8:
            return r2
        La9:
            java.lang.String r11 = "adQualityDataBuilder"
            defpackage.i30.S(r11)     // Catch: java.lang.Throwable -> Laf
            throw r8     // Catch: java.lang.Throwable -> Laf
        Laf:
            r11 = move-exception
            r1.d()
            throw r11
        Lb4:
            r11 = move-exception
            r1.d()
            throw r11
        Lb9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu2.i(qj):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[Catch: all -> 0x00e7, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e7, blocks: (B:27:0x0074, B:30:0x007d, B:33:0x0089, B:35:0x008f, B:37:0x00b5, B:39:0x00c5, B:41:0x00cb, B:42:0x00df, B:43:0x00e2, B:44:0x00e3, B:45:0x00e6, B:48:0x00ea, B:49:0x00ed, B:50:0x00ee, B:52:0x00f4, B:54:0x00fe, B:56:0x0104, B:58:0x012a, B:59:0x013e, B:60:0x0141, B:61:0x0142, B:62:0x0145, B:63:0x0146, B:65:0x014c, B:68:0x015a, B:69:0x015d, B:70:0x015e, B:71:0x0161, B:72:0x0162, B:73:0x0165), top: B:80:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0162 A[Catch: all -> 0x00e7, TryCatch #0 {all -> 0x00e7, blocks: (B:27:0x0074, B:30:0x007d, B:33:0x0089, B:35:0x008f, B:37:0x00b5, B:39:0x00c5, B:41:0x00cb, B:42:0x00df, B:43:0x00e2, B:44:0x00e3, B:45:0x00e6, B:48:0x00ea, B:49:0x00ed, B:50:0x00ee, B:52:0x00f4, B:54:0x00fe, B:56:0x0104, B:58:0x012a, B:59:0x013e, B:60:0x0141, B:61:0x0142, B:62:0x0145, B:63:0x0146, B:65:0x014c, B:68:0x015a, B:69:0x015d, B:70:0x015e, B:71:0x0161, B:72:0x0162, B:73:0x0165), top: B:80:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(defpackage.qj r13) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu2.j(qj):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: all -> 0x0101, TRY_ENTER, TryCatch #0 {all -> 0x0101, blocks: (B:33:0x008b, B:36:0x0093, B:38:0x00a3, B:40:0x00bc, B:42:0x00cc, B:54:0x0103, B:55:0x0106, B:56:0x0107, B:57:0x010a, B:58:0x010b, B:59:0x010e, B:60:0x010f, B:61:0x0112), top: B:68:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:33:0x008b, B:36:0x0093, B:38:0x00a3, B:40:0x00bc, B:42:0x00cc, B:54:0x0103, B:55:0x0106, B:56:0x0107, B:57:0x010a, B:58:0x010b, B:59:0x010e, B:60:0x010f, B:61:0x0112), top: B:68:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object k(defpackage.qj r15) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu2.k(qj):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: all -> 0x0115, TRY_ENTER, TryCatch #1 {all -> 0x0115, blocks: (B:32:0x008e, B:35:0x0096, B:37:0x00a6, B:39:0x00c0, B:41:0x00d0, B:43:0x00e0, B:55:0x0117, B:56:0x011a, B:57:0x011b, B:58:0x011e, B:59:0x011f, B:60:0x0122, B:61:0x0123, B:62:0x0126, B:63:0x0127, B:64:0x012a), top: B:73:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127 A[Catch: all -> 0x0115, TryCatch #1 {all -> 0x0115, blocks: (B:32:0x008e, B:35:0x0096, B:37:0x00a6, B:39:0x00c0, B:41:0x00d0, B:43:0x00e0, B:55:0x0117, B:56:0x011a, B:57:0x011b, B:58:0x011e, B:59:0x011f, B:60:0x0122, B:61:0x0123, B:62:0x0126, B:63:0x0127, B:64:0x012a), top: B:73:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object l(defpackage.qj r19) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu2.l(qj):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(defpackage.qj r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ff3
            if (r0 == 0) goto L13
            r0 = r6
            ff3 r0 = (defpackage.ff3) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            ff3 r0 = new ff3
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.k
            int r1 = r0.m
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            long r1 = r0.i
            tf0 r0 = r0.j
            defpackage.bd2.x(r6)
            goto L4c
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.bd2.x(r6)
            java.lang.Object r6 = r5.d
            tf0 r6 = (defpackage.tf0) r6
            long r3 = java.lang.System.currentTimeMillis()
            r0.j = r6
            r0.i = r3
            r0.m = r2
            java.lang.Object r0 = r6.c(r0)
            rk r1 = defpackage.rk.f
            if (r0 == r1) goto L6e
            r0 = r6
            r1 = r3
        L4c:
            java.lang.Cloneable r6 = r5.g     // Catch: java.lang.Throwable -> L69
            pe3 r6 = (defpackage.pe3) r6     // Catch: java.lang.Throwable -> L69
            if (r6 == 0) goto L62
            r6.b()     // Catch: java.lang.Throwable -> L69
            p54 r6 = r6.g     // Catch: java.lang.Throwable -> L69
            qe3 r6 = (defpackage.qe3) r6     // Catch: java.lang.Throwable -> L69
            r6.B(r1)     // Catch: java.lang.Throwable -> L69
            r0.d()
            z31 r6 = defpackage.z31.a
            return r6
        L62:
            java.lang.String r6 = "adQualityDataBuilder"
            defpackage.i30.S(r6)     // Catch: java.lang.Throwable -> L69
            r6 = 0
            throw r6     // Catch: java.lang.Throwable -> L69
        L69:
            r6 = move-exception
            r0.d()
            throw r6
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu2.m(qj):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object n(java.lang.String r9, defpackage.qj r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.we3
            if (r0 == 0) goto L13
            r0 = r10
            we3 r0 = (defpackage.we3) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            we3 r0 = new we3
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.k
            int r1 = r0.m
            r2 = 2
            r3 = 1
            rk r4 = defpackage.rk.f
            if (r1 == 0) goto L44
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r9 = r0.i
            qf0 r9 = (defpackage.qf0) r9
            defpackage.bd2.x(r10)     // Catch: java.lang.Throwable -> L2e
            goto L73
        L2e:
            r10 = move-exception
            goto L81
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            tf0 r9 = r0.j
            java.lang.Object r1 = r0.i
            java.lang.String r1 = (java.lang.String) r1
            defpackage.bd2.x(r10)
            r10 = r9
            r9 = r1
            goto L57
        L44:
            defpackage.bd2.x(r10)
            java.lang.Object r10 = r8.f
            tf0 r10 = (defpackage.tf0) r10
            r0.i = r9
            r0.j = r10
            r0.m = r3
            java.lang.Object r1 = r10.c(r0)
            if (r1 == r4) goto L87
        L57:
            java.lang.Object r1 = r8.h     // Catch: java.lang.Throwable -> L7d
            pm r1 = (defpackage.pm) r1     // Catch: java.lang.Throwable -> L7d
            pa0 r3 = new pa0     // Catch: java.lang.Throwable -> L7d
            r5 = 4
            r6 = 0
            r3.<init>(r9, r6, r5)     // Catch: java.lang.Throwable -> L7d
            r0.i = r10     // Catch: java.lang.Throwable -> L7d
            r0.j = r6     // Catch: java.lang.Throwable -> L7d
            r0.m = r2     // Catch: java.lang.Throwable -> L7d
            yw0 r1 = (defpackage.yw0) r1     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r9 = r1.i(r3, r0)     // Catch: java.lang.Throwable -> L7d
            if (r9 == r4) goto L87
            r7 = r10
            r10 = r9
            r9 = r7
        L73:
            te3 r10 = (defpackage.te3) r10     // Catch: java.lang.Throwable -> L2e
            tf0 r9 = (defpackage.tf0) r9
            r9.d()
            z31 r9 = defpackage.z31.a
            return r9
        L7d:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L81:
            tf0 r9 = (defpackage.tf0) r9
            r9.d()
            throw r10
        L87:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu2.n(java.lang.String, qj):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v5, types: [qf0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object o(defpackage.qj r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ye3
            if (r0 == 0) goto L13
            r0 = r8
            ye3 r0 = (defpackage.ye3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ye3 r0 = new ye3
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.j
            int r1 = r0.l
            r2 = 1
            r3 = 2
            rk r4 = defpackage.rk.f
            if (r1 == 0) goto L3d
            if (r1 == r2) goto L36
            if (r1 != r3) goto L2e
            qf0 r0 = r0.i
            defpackage.bd2.x(r8)     // Catch: java.lang.Throwable -> L2c
            goto L67
        L2c:
            r8 = move-exception
            goto L75
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            qf0 r1 = r0.i
            defpackage.bd2.x(r8)
            r8 = r1
            goto L4e
        L3d:
            defpackage.bd2.x(r8)
            java.lang.Object r8 = r7.f
            tf0 r8 = (defpackage.tf0) r8
            r0.i = r8
            r0.l = r2
            java.lang.Object r1 = r8.c(r0)
            if (r1 == r4) goto L7b
        L4e:
            java.lang.Object r1 = r7.h     // Catch: java.lang.Throwable -> L71
            pm r1 = (defpackage.pm) r1     // Catch: java.lang.Throwable -> L71
            ze3 r2 = new ze3     // Catch: java.lang.Throwable -> L71
            r5 = 0
            r2.<init>(r3, r5)     // Catch: java.lang.Throwable -> L71
            r0.i = r8     // Catch: java.lang.Throwable -> L71
            r0.l = r3     // Catch: java.lang.Throwable -> L71
            yw0 r1 = (defpackage.yw0) r1     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r1.i(r2, r0)     // Catch: java.lang.Throwable -> L71
            if (r0 == r4) goto L7b
            r6 = r0
            r0 = r8
            r8 = r6
        L67:
            te3 r8 = (defpackage.te3) r8     // Catch: java.lang.Throwable -> L2c
            tf0 r0 = (defpackage.tf0) r0
            r0.d()
            z31 r8 = defpackage.z31.a
            return r8
        L71:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L75:
            tf0 r0 = (defpackage.tf0) r0
            r0.d()
            throw r8
        L7b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu2.o(qj):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object p(long r6, defpackage.qj r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.xe3
            if (r0 == 0) goto L13
            r0 = r8
            xe3 r0 = (defpackage.xe3) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            xe3 r0 = new xe3
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.k
            int r1 = r0.m
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            long r6 = r0.i
            tf0 r0 = r0.j
            defpackage.bd2.x(r8)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.bd2.x(r8)
            java.lang.Object r8 = r5.d
            tf0 r8 = (defpackage.tf0) r8
            r0.j = r8
            r0.i = r6
            r0.m = r2
            java.lang.Object r0 = r8.c(r0)
            rk r1 = defpackage.rk.f
            if (r0 == r1) goto L86
            r0 = r8
        L47:
            java.lang.Cloneable r8 = r5.g     // Catch: java.lang.Throwable -> L78
            pe3 r8 = (defpackage.pe3) r8     // Catch: java.lang.Throwable -> L78
            r1 = 0
            java.lang.String r2 = "adQualityDataBuilder"
            if (r8 == 0) goto L7e
            p54 r3 = r8.g     // Catch: java.lang.Throwable -> L78
            qe3 r3 = (defpackage.qe3) r3     // Catch: java.lang.Throwable -> L78
            long r3 = r3.J()     // Catch: java.lang.Throwable -> L78
            long r6 = r6 - r3
            java.lang.Cloneable r3 = r5.g     // Catch: java.lang.Throwable -> L78
            pe3 r3 = (defpackage.pe3) r3     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L7a
            p54 r1 = r3.g     // Catch: java.lang.Throwable -> L78
            qe3 r1 = (defpackage.qe3) r1     // Catch: java.lang.Throwable -> L78
            long r1 = r1.I()     // Catch: java.lang.Throwable -> L78
            long r6 = r6 - r1
            r8.b()     // Catch: java.lang.Throwable -> L78
            p54 r8 = r8.g     // Catch: java.lang.Throwable -> L78
            qe3 r8 = (defpackage.qe3) r8     // Catch: java.lang.Throwable -> L78
            r8.T(r6)     // Catch: java.lang.Throwable -> L78
            r0.d()
            z31 r6 = defpackage.z31.a
            return r6
        L78:
            r6 = move-exception
            goto L82
        L7a:
            defpackage.i30.S(r2)     // Catch: java.lang.Throwable -> L78
            throw r1     // Catch: java.lang.Throwable -> L78
        L7e:
            defpackage.i30.S(r2)     // Catch: java.lang.Throwable -> L78
            throw r1     // Catch: java.lang.Throwable -> L78
        L82:
            r0.d()
            throw r6
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu2.p(long, qj):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object q(defpackage.qj r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.df3
            if (r0 == 0) goto L13
            r0 = r9
            df3 r0 = (defpackage.df3) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            df3 r0 = new df3
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.k
            int r1 = r0.m
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            rk r6 = defpackage.rk.f
            if (r1 == 0) goto L4f
            if (r1 == r4) goto L47
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r0 = r0.i
            qf0 r0 = (defpackage.qf0) r0
            defpackage.bd2.x(r9)     // Catch: java.lang.Throwable -> L32
            goto L9c
        L32:
            r9 = move-exception
            goto La8
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3d:
            tf0 r1 = r0.j
            java.lang.Object r3 = r0.i
            qe3 r3 = (defpackage.qe3) r3
            defpackage.bd2.x(r9)
            goto L83
        L47:
            java.lang.Object r1 = r0.i
            qf0 r1 = (defpackage.qf0) r1
            defpackage.bd2.x(r9)
            goto L61
        L4f:
            defpackage.bd2.x(r9)
            java.lang.Object r9 = r8.d
            r1 = r9
            tf0 r1 = (defpackage.tf0) r1
            r0.i = r1
            r0.m = r4
            java.lang.Object r9 = r1.c(r0)
            if (r9 == r6) goto Lbc
        L61:
            java.lang.Cloneable r9 = r8.g     // Catch: java.lang.Throwable -> Lae
            pe3 r9 = (defpackage.pe3) r9     // Catch: java.lang.Throwable -> Lae
            if (r9 == 0) goto Lb0
            p54 r9 = r9.d()     // Catch: java.lang.Throwable -> Lae
            qe3 r9 = (defpackage.qe3) r9     // Catch: java.lang.Throwable -> Lae
            tf0 r1 = (defpackage.tf0) r1
            r1.d()
            java.lang.Object r1 = r8.f
            tf0 r1 = (defpackage.tf0) r1
            r0.i = r9
            r0.j = r1
            r0.m = r3
            java.lang.Object r3 = r1.c(r0)
            if (r3 == r6) goto Lbc
            r3 = r9
        L83:
            java.lang.Object r9 = r8.h     // Catch: java.lang.Throwable -> La6
            pm r9 = (defpackage.pm) r9     // Catch: java.lang.Throwable -> La6
            pa0 r4 = new pa0     // Catch: java.lang.Throwable -> La6
            r7 = 5
            r4.<init>(r3, r5, r7)     // Catch: java.lang.Throwable -> La6
            r0.i = r1     // Catch: java.lang.Throwable -> La6
            r0.j = r5     // Catch: java.lang.Throwable -> La6
            r0.m = r2     // Catch: java.lang.Throwable -> La6
            yw0 r9 = (defpackage.yw0) r9     // Catch: java.lang.Throwable -> La6
            java.lang.Object r9 = r9.i(r4, r0)     // Catch: java.lang.Throwable -> La6
            if (r9 == r6) goto Lbc
            r0 = r1
        L9c:
            te3 r9 = (defpackage.te3) r9     // Catch: java.lang.Throwable -> L32
            tf0 r0 = (defpackage.tf0) r0
            r0.d()
            z31 r9 = defpackage.z31.a
            return r9
        La6:
            r9 = move-exception
            r0 = r1
        La8:
            tf0 r0 = (defpackage.tf0) r0
            r0.d()
            throw r9
        Lae:
            r9 = move-exception
            goto Lb6
        Lb0:
            java.lang.String r9 = "adQualityDataBuilder"
            defpackage.i30.S(r9)     // Catch: java.lang.Throwable -> Lae
            throw r5     // Catch: java.lang.Throwable -> Lae
        Lb6:
            tf0 r1 = (defpackage.tf0) r1
            r1.d()
            throw r9
        Lbc:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu2.q(qj):java.lang.Object");
    }

    public mu2(Looper looper, pz pzVar, vs2 vs2Var) {
        this(new CopyOnWriteArraySet(), looper, pzVar, vs2Var, true);
    }

    public mu2(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, pz pzVar, vs2 vs2Var, boolean z) {
        this.c = pzVar;
        this.f = copyOnWriteArraySet;
        this.e = vs2Var;
        this.i = new Object();
        this.g = new ArrayDeque();
        this.h = new ArrayDeque();
        this.d = pzVar.p(looper, new zw0(1, this));
        this.b = z;
    }
}
