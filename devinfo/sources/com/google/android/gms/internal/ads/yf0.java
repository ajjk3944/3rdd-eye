package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yf0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18727a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18728b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18729c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18730d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f18731e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f18732f;
    public Cloneable g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f18733h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f18734i;

    public yf0(p4.g gVar, kh0 kh0Var, bd0 bd0Var, tk0 tk0Var) {
        nk.k.e(gVar, "adQualityDataStore");
        nk.k.e(bd0Var, "dataPinger");
        this.f18734i = bd0Var;
        this.f18729c = xk.x.b(new xk.s0((ExecutorService) kh0Var.f13160b));
        this.f18730d = gl.d.a();
        this.f18731e = gl.d.a();
        this.f18732f = gl.d.a();
        this.f18733h = gVar;
    }

    public void a(Object obj) {
        obj.getClass();
        synchronized (this.f18734i) {
            try {
                if (this.f18727a) {
                    return;
                }
                ((CopyOnWriteArraySet) this.f18732f).add(new me0(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(Object obj) {
        h();
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f18732f;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            me0 me0Var = (me0) it.next();
            if (me0Var.f13877a.equals(obj)) {
                zd0 zd0Var = (zd0) this.f18731e;
                me0Var.f13880d = true;
                if (zd0Var != null && me0Var.f13879c) {
                    me0Var.f13879c = false;
                    zd0Var.j(me0Var.f13877a, me0Var.f13878b.w());
                }
                copyOnWriteArraySet.remove(me0Var);
            }
        }
    }

    public void c(int i4, rd0 rd0Var) {
        h();
        ((ArrayDeque) this.f18733h).add(new af0(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f18732f), i4, rd0Var, 0));
    }

    public void d() {
        h();
        ArrayDeque arrayDeque = (ArrayDeque) this.f18733h;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (((zd0) this.f18731e) != null) {
            no0 no0Var = (no0) this.f18730d;
            no0Var.getClass();
            Handler handler = no0Var.f14385a;
            if (!handler.hasMessages(1)) {
                io0 io0VarG = no0.g();
                Message messageObtainMessage = handler.obtainMessage(1);
                io0VarG.f12403a = messageObtainMessage;
                messageObtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(messageObtainMessage);
                io0VarG.f12403a = null;
                no0.f(io0VarG);
            }
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
        h();
        synchronized (this.f18734i) {
            this.f18727a = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f18732f;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            me0 me0Var = (me0) it.next();
            zd0 zd0Var = (zd0) this.f18731e;
            me0Var.f13880d = true;
            if (zd0Var != null && me0Var.f13879c) {
                me0Var.f13879c = false;
                zd0Var.j(me0Var.f13877a, me0Var.f13878b.w());
            }
        }
        copyOnWriteArraySet.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.google.android.gms.internal.ads.yf0] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [gl.a] */
    /* JADX WARN: Type inference failed for: r3v17, types: [gl.a] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v5, types: [gl.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(ek.c r19) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.f(ek.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(java.lang.String r7, ek.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.bx0
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.bx0 r0 = (com.google.android.gms.internal.ads.bx0) r0
            int r1 = r0.f9844e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9844e = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.bx0 r0 = new com.google.android.gms.internal.ads.bx0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f9842c
            int r1 = r0.f9844e
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            long r3 = r0.f9841b
            gl.c r7 = r0.f9840a
            java.lang.String r0 = r0.f9845f
            ci.b.D(r8)
            goto L50
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            ci.b.D(r8)
            java.lang.Object r8 = r6.f18730d
            gl.c r8 = (gl.c) r8
            long r3 = java.lang.System.currentTimeMillis()
            r0.f9845f = r7
            r0.f9840a = r8
            r0.f9841b = r3
            r0.f9844e = r2
            java.lang.Object r0 = r8.c(r0)
            dk.a r1 = dk.a.f22275a
            if (r0 == r1) goto L86
            r0 = r7
            r7 = r8
        L50:
            r8 = 0
            boolean r1 = r6.f18727a     // Catch: java.lang.Throwable -> L81
            yj.u r5 = yj.u.f37649a
            if (r1 == 0) goto L5b
            r7.e(r8)
            return r5
        L5b:
            r6.f18727a = r2     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.internal.ads.ow0 r1 = com.google.android.gms.internal.ads.ow0.R()     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.internal.ads.on1 r1 = r1.s()     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.internal.ads.nw0 r1 = (com.google.android.gms.internal.ads.nw0) r1     // Catch: java.lang.Throwable -> L81
            r6.g = r1     // Catch: java.lang.Throwable -> L81
            r1.b()     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.internal.ads.qn1 r2 = r1.f14755b     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.internal.ads.ow0 r2 = (com.google.android.gms.internal.ads.ow0) r2     // Catch: java.lang.Throwable -> L81
            r2.S(r0)     // Catch: java.lang.Throwable -> L81
            r1.b()     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.internal.ads.qn1 r0 = r1.f14755b     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.internal.ads.ow0 r0 = (com.google.android.gms.internal.ads.ow0) r0     // Catch: java.lang.Throwable -> L81
            r0.Y(r3)     // Catch: java.lang.Throwable -> L81
            r7.e(r8)
            return r5
        L81:
            r0 = move-exception
            r7.e(r8)
            throw r0
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.g(java.lang.String, ek.c):java.lang.Object");
    }

    public void h() {
        if (this.f18728b) {
            mq0.c0(Thread.currentThread() == ((Thread) this.f18729c));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0088 A[Catch: all -> 0x00af, TRY_LEAVE, TryCatch #1 {all -> 0x00af, blocks: (B:31:0x0082, B:33:0x0088, B:40:0x00a9, B:41:0x00ae), top: B:51:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9 A[Catch: all -> 0x00af, TRY_ENTER, TryCatch #1 {all -> 0x00af, blocks: (B:31:0x0082, B:33:0x0088, B:40:0x00a9, B:41:0x00ae), top: B:51:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i(ek.c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.google.android.gms.internal.ads.yw0
            if (r0 == 0) goto L13
            r0 = r12
            com.google.android.gms.internal.ads.yw0 r0 = (com.google.android.gms.internal.ads.yw0) r0
            int r1 = r0.f18899e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18899e = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.yw0 r0 = new com.google.android.gms.internal.ads.yw0
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f18897c
            int r1 = r0.f18899e
            yj.u r2 = yj.u.f37649a
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            dk.a r8 = dk.a.f22275a
            if (r1 == 0) goto L4d
            if (r1 == r6) goto L47
            if (r1 == r5) goto L3f
            if (r1 == r4) goto L3b
            if (r1 != r3) goto L33
            ci.b.D(r12)
            return r2
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3b:
            ci.b.D(r12)
            goto L9f
        L3f:
            long r5 = r0.f18896b
            gl.c r1 = r0.f18895a
            ci.b.D(r12)
            goto L82
        L47:
            gl.c r1 = r0.f18895a
            ci.b.D(r12)
            goto L5f
        L4d:
            ci.b.D(r12)
            java.lang.Object r12 = r11.f18731e
            r1 = r12
            gl.c r1 = (gl.c) r1
            r0.f18895a = r1
            r0.f18899e = r6
            java.lang.Object r12 = r1.c(r0)
            if (r12 == r8) goto Lb9
        L5f:
            boolean r12 = r11.f18728b     // Catch: java.lang.Throwable -> Lb4
            if (r12 == 0) goto L67
            r1.e(r7)
            return r2
        L67:
            r11.f18728b = r6     // Catch: java.lang.Throwable -> Lb4
            r1.e(r7)
            java.lang.Object r12 = r11.f18730d
            r1 = r12
            gl.c r1 = (gl.c) r1
            long r9 = java.lang.System.currentTimeMillis()
            r0.f18895a = r1
            r0.f18896b = r9
            r0.f18899e = r5
            java.lang.Object r12 = r1.c(r0)
            if (r12 == r8) goto Lb9
            r5 = r9
        L82:
            java.lang.Cloneable r12 = r11.g     // Catch: java.lang.Throwable -> Laf
            com.google.android.gms.internal.ads.nw0 r12 = (com.google.android.gms.internal.ads.nw0) r12     // Catch: java.lang.Throwable -> Laf
            if (r12 == 0) goto La9
            r12.b()     // Catch: java.lang.Throwable -> Laf
            com.google.android.gms.internal.ads.qn1 r12 = r12.f14755b     // Catch: java.lang.Throwable -> Laf
            com.google.android.gms.internal.ads.ow0 r12 = (com.google.android.gms.internal.ads.ow0) r12     // Catch: java.lang.Throwable -> Laf
            r12.b0(r5)     // Catch: java.lang.Throwable -> Laf
            r1.e(r7)
            r0.f18895a = r7
            r0.f18899e = r4
            java.lang.Object r12 = r11.p(r5, r0)
            if (r12 == r8) goto Lb9
        L9f:
            r0.f18899e = r3
            java.lang.Object r12 = r11.q(r0)
            if (r12 != r8) goto La8
            goto Lb9
        La8:
            return r2
        La9:
            java.lang.String r12 = "adQualityDataBuilder"
            nk.k.k(r12)     // Catch: java.lang.Throwable -> Laf
            throw r7     // Catch: java.lang.Throwable -> Laf
        Laf:
            r12 = move-exception
            r1.e(r7)
            throw r12
        Lb4:
            r12 = move-exception
            r1.e(r7)
            throw r12
        Lb9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.i(ek.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[Catch: all -> 0x00e7, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e7, blocks: (B:27:0x0075, B:30:0x007d, B:33:0x0089, B:35:0x008f, B:37:0x00b5, B:39:0x00c5, B:41:0x00cb, B:42:0x00df, B:43:0x00e2, B:44:0x00e3, B:45:0x00e6, B:48:0x00ea, B:49:0x00ed, B:50:0x00ee, B:52:0x00f4, B:54:0x00fe, B:56:0x0104, B:58:0x012a, B:59:0x013e, B:60:0x0141, B:61:0x0142, B:62:0x0145, B:63:0x0146, B:65:0x014c, B:68:0x015a, B:69:0x015d, B:70:0x015e, B:71:0x0161, B:72:0x0162, B:73:0x0165), top: B:80:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0162 A[Catch: all -> 0x00e7, TryCatch #0 {all -> 0x00e7, blocks: (B:27:0x0075, B:30:0x007d, B:33:0x0089, B:35:0x008f, B:37:0x00b5, B:39:0x00c5, B:41:0x00cb, B:42:0x00df, B:43:0x00e2, B:44:0x00e3, B:45:0x00e6, B:48:0x00ea, B:49:0x00ed, B:50:0x00ee, B:52:0x00f4, B:54:0x00fe, B:56:0x0104, B:58:0x012a, B:59:0x013e, B:60:0x0141, B:61:0x0142, B:62:0x0145, B:63:0x0146, B:65:0x014c, B:68:0x015a, B:69:0x015d, B:70:0x015e, B:71:0x0161, B:72:0x0162, B:73:0x0165), top: B:80:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(ek.c r13) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.j(ek.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008f A[Catch: all -> 0x00fb, TRY_ENTER, TryCatch #1 {all -> 0x00fb, blocks: (B:33:0x0087, B:36:0x008f, B:38:0x009f, B:40:0x00b8, B:42:0x00c8, B:54:0x00fd, B:55:0x0100, B:56:0x0101, B:57:0x0104, B:58:0x0105, B:59:0x0108, B:60:0x0109, B:61:0x010c), top: B:70:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0109 A[Catch: all -> 0x00fb, TryCatch #1 {all -> 0x00fb, blocks: (B:33:0x0087, B:36:0x008f, B:38:0x009f, B:40:0x00b8, B:42:0x00c8, B:54:0x00fd, B:55:0x0100, B:56:0x0101, B:57:0x0104, B:58:0x0105, B:59:0x0108, B:60:0x0109, B:61:0x010c), top: B:70:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object k(ek.c r15) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.k(ek.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008f A[Catch: all -> 0x010b, TRY_ENTER, TryCatch #1 {all -> 0x010b, blocks: (B:33:0x0087, B:36:0x008f, B:38:0x009f, B:40:0x00b8, B:42:0x00c8, B:44:0x00d8, B:56:0x010d, B:57:0x0110, B:58:0x0111, B:59:0x0114, B:60:0x0115, B:61:0x0118, B:62:0x0119, B:63:0x011c, B:64:0x011d, B:65:0x0120), top: B:74:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011d A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:33:0x0087, B:36:0x008f, B:38:0x009f, B:40:0x00b8, B:42:0x00c8, B:44:0x00d8, B:56:0x010d, B:57:0x0110, B:58:0x0111, B:59:0x0114, B:60:0x0115, B:61:0x0118, B:62:0x0119, B:63:0x011c, B:64:0x011d, B:65:0x0120), top: B:74:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object l(ek.c r15) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.l(ek.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(ek.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.cx0
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.gms.internal.ads.cx0 r0 = (com.google.android.gms.internal.ads.cx0) r0
            int r1 = r0.f10252e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10252e = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.cx0 r0 = new com.google.android.gms.internal.ads.cx0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f10250c
            int r1 = r0.f10252e
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            long r1 = r0.f10248a
            gl.c r0 = r0.f10249b
            ci.b.D(r6)
            goto L4c
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            ci.b.D(r6)
            java.lang.Object r6 = r5.f18730d
            gl.c r6 = (gl.c) r6
            long r3 = java.lang.System.currentTimeMillis()
            r0.f10249b = r6
            r0.f10248a = r3
            r0.f10252e = r2
            java.lang.Object r0 = r6.c(r0)
            dk.a r1 = dk.a.f22275a
            if (r0 == r1) goto L6e
            r0 = r6
            r1 = r3
        L4c:
            r6 = 0
            java.lang.Cloneable r3 = r5.g     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.internal.ads.nw0 r3 = (com.google.android.gms.internal.ads.nw0) r3     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L63
            r3.b()     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.internal.ads.qn1 r3 = r3.f14755b     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.internal.ads.ow0 r3 = (com.google.android.gms.internal.ads.ow0) r3     // Catch: java.lang.Throwable -> L69
            r3.B(r1)     // Catch: java.lang.Throwable -> L69
            r0.e(r6)
            yj.u r6 = yj.u.f37649a
            return r6
        L63:
            java.lang.String r1 = "adQualityDataBuilder"
            nk.k.k(r1)     // Catch: java.lang.Throwable -> L69
            throw r6     // Catch: java.lang.Throwable -> L69
        L69:
            r1 = move-exception
            r0.e(r6)
            throw r1
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.m(ek.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object n(java.lang.String r9, ek.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.gms.internal.ads.vw0
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.gms.internal.ads.vw0 r0 = (com.google.android.gms.internal.ads.vw0) r0
            int r1 = r0.f17749e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17749e = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.vw0 r0 = new com.google.android.gms.internal.ads.vw0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f17747c
            int r1 = r0.f17749e
            r2 = 2
            r3 = 1
            r4 = 0
            dk.a r5 = dk.a.f22275a
            if (r1 == 0) goto L45
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r9 = r0.f17745a
            gl.a r9 = (gl.a) r9
            ci.b.D(r10)     // Catch: java.lang.Throwable -> L2f
            goto L71
        L2f:
            r10 = move-exception
            goto L7d
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            gl.c r9 = r0.f17746b
            java.lang.Object r1 = r0.f17745a
            java.lang.String r1 = (java.lang.String) r1
            ci.b.D(r10)
            r10 = r9
            r9 = r1
            goto L58
        L45:
            ci.b.D(r10)
            java.lang.Object r10 = r8.f18732f
            gl.c r10 = (gl.c) r10
            r0.f17745a = r9
            r0.f17746b = r10
            r0.f17749e = r3
            java.lang.Object r1 = r10.c(r0)
            if (r1 == r5) goto L81
        L58:
            java.lang.Object r1 = r8.f18733h     // Catch: java.lang.Throwable -> L79
            p4.g r1 = (p4.g) r1     // Catch: java.lang.Throwable -> L79
            androidx.lifecycle.u r3 = new androidx.lifecycle.u     // Catch: java.lang.Throwable -> L79
            r6 = 1
            r3.<init>(r9, r4, r6)     // Catch: java.lang.Throwable -> L79
            r0.f17745a = r10     // Catch: java.lang.Throwable -> L79
            r0.f17746b = r4     // Catch: java.lang.Throwable -> L79
            r0.f17749e = r2     // Catch: java.lang.Throwable -> L79
            java.lang.Object r9 = r1.a(r3, r0)     // Catch: java.lang.Throwable -> L79
            if (r9 == r5) goto L81
            r7 = r10
            r10 = r9
            r9 = r7
        L71:
            com.google.android.gms.internal.ads.rw0 r10 = (com.google.android.gms.internal.ads.rw0) r10     // Catch: java.lang.Throwable -> L2f
            r9.e(r4)
            yj.u r9 = yj.u.f37649a
            return r9
        L79:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L7d:
            r9.e(r4)
            throw r10
        L81:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.n(java.lang.String, ek.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v4, types: [gl.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object o(ek.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.xw0
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.xw0 r0 = (com.google.android.gms.internal.ads.xw0) r0
            int r1 = r0.f18529d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18529d = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.xw0 r0 = new com.google.android.gms.internal.ads.xw0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f18527b
            int r1 = r0.f18529d
            r2 = 1
            r3 = 2
            r4 = 0
            dk.a r5 = dk.a.f22275a
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L37
            if (r1 != r3) goto L2f
            gl.a r0 = r0.f18526a
            ci.b.D(r9)     // Catch: java.lang.Throwable -> L2d
            goto L66
        L2d:
            r9 = move-exception
            goto L72
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            gl.a r1 = r0.f18526a
            ci.b.D(r9)
            r9 = r1
            goto L4f
        L3e:
            ci.b.D(r9)
            java.lang.Object r9 = r8.f18732f
            gl.c r9 = (gl.c) r9
            r0.f18526a = r9
            r0.f18529d = r2
            java.lang.Object r1 = r9.c(r0)
            if (r1 == r5) goto L76
        L4f:
            java.lang.Object r1 = r8.f18733h     // Catch: java.lang.Throwable -> L6e
            p4.g r1 = (p4.g) r1     // Catch: java.lang.Throwable -> L6e
            bh.p r2 = new bh.p     // Catch: java.lang.Throwable -> L6e
            r6 = 2
            r2.<init>(r3, r4, r6)     // Catch: java.lang.Throwable -> L6e
            r0.f18526a = r9     // Catch: java.lang.Throwable -> L6e
            r0.f18529d = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = r1.a(r2, r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 == r5) goto L76
            r7 = r0
            r0 = r9
            r9 = r7
        L66:
            com.google.android.gms.internal.ads.rw0 r9 = (com.google.android.gms.internal.ads.rw0) r9     // Catch: java.lang.Throwable -> L2d
            r0.e(r4)
            yj.u r9 = yj.u.f37649a
            return r9
        L6e:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L72:
            r0.e(r4)
            throw r9
        L76:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.o(ek.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object p(long r6, ek.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.ww0
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.ww0 r0 = (com.google.android.gms.internal.ads.ww0) r0
            int r1 = r0.f18221e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18221e = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.ww0 r0 = new com.google.android.gms.internal.ads.ww0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f18219c
            int r1 = r0.f18221e
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            long r6 = r0.f18217a
            gl.c r0 = r0.f18218b
            ci.b.D(r8)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            ci.b.D(r8)
            java.lang.Object r8 = r5.f18730d
            gl.c r8 = (gl.c) r8
            r0.f18218b = r8
            r0.f18217a = r6
            r0.f18221e = r2
            java.lang.Object r0 = r8.c(r0)
            dk.a r1 = dk.a.f22275a
            if (r0 == r1) goto L86
            r0 = r8
        L47:
            r8 = 0
            java.lang.Cloneable r1 = r5.g     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.nw0 r1 = (com.google.android.gms.internal.ads.nw0) r1     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = "adQualityDataBuilder"
            if (r1 == 0) goto L7e
            com.google.android.gms.internal.ads.qn1 r3 = r1.f14755b     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.ow0 r3 = (com.google.android.gms.internal.ads.ow0) r3     // Catch: java.lang.Throwable -> L78
            long r3 = r3.J()     // Catch: java.lang.Throwable -> L78
            long r6 = r6 - r3
            java.lang.Cloneable r3 = r5.g     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.nw0 r3 = (com.google.android.gms.internal.ads.nw0) r3     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L7a
            com.google.android.gms.internal.ads.qn1 r2 = r3.f14755b     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.ow0 r2 = (com.google.android.gms.internal.ads.ow0) r2     // Catch: java.lang.Throwable -> L78
            long r2 = r2.I()     // Catch: java.lang.Throwable -> L78
            long r6 = r6 - r2
            r1.b()     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.qn1 r1 = r1.f14755b     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.ow0 r1 = (com.google.android.gms.internal.ads.ow0) r1     // Catch: java.lang.Throwable -> L78
            r1.T(r6)     // Catch: java.lang.Throwable -> L78
            r0.e(r8)
            yj.u r6 = yj.u.f37649a
            return r6
        L78:
            r6 = move-exception
            goto L82
        L7a:
            nk.k.k(r2)     // Catch: java.lang.Throwable -> L78
            throw r8     // Catch: java.lang.Throwable -> L78
        L7e:
            nk.k.k(r2)     // Catch: java.lang.Throwable -> L78
            throw r8     // Catch: java.lang.Throwable -> L78
        L82:
            r0.e(r8)
            throw r6
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.p(long, ek.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object q(ek.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.ax0
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.ax0 r0 = (com.google.android.gms.internal.ads.ax0) r0
            int r1 = r0.f9481e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9481e = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.ax0 r0 = new com.google.android.gms.internal.ads.ax0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f9479c
            int r1 = r0.f9481e
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            dk.a r6 = dk.a.f22275a
            if (r1 == 0) goto L4e
            if (r1 == r4) goto L46
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L34
            java.lang.Object r0 = r0.f9477a
            gl.a r0 = (gl.a) r0
            ci.b.D(r9)     // Catch: java.lang.Throwable -> L32
            goto L97
        L32:
            r9 = move-exception
            goto La1
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3c:
            gl.c r1 = r0.f9478b
            java.lang.Object r3 = r0.f9477a
            com.google.android.gms.internal.ads.ow0 r3 = (com.google.android.gms.internal.ads.ow0) r3
            ci.b.D(r9)
            goto L80
        L46:
            java.lang.Object r1 = r0.f9477a
            gl.a r1 = (gl.a) r1
            ci.b.D(r9)
            goto L60
        L4e:
            ci.b.D(r9)
            java.lang.Object r9 = r8.f18730d
            r1 = r9
            gl.c r1 = (gl.c) r1
            r0.f9477a = r1
            r0.f9481e = r4
            java.lang.Object r9 = r1.c(r0)
            if (r9 == r6) goto Lb1
        L60:
            java.lang.Cloneable r9 = r8.g     // Catch: java.lang.Throwable -> La5
            com.google.android.gms.internal.ads.nw0 r9 = (com.google.android.gms.internal.ads.nw0) r9     // Catch: java.lang.Throwable -> La5
            if (r9 == 0) goto La7
            com.google.android.gms.internal.ads.qn1 r9 = r9.e()     // Catch: java.lang.Throwable -> La5
            com.google.android.gms.internal.ads.ow0 r9 = (com.google.android.gms.internal.ads.ow0) r9     // Catch: java.lang.Throwable -> La5
            r1.e(r5)
            java.lang.Object r1 = r8.f18732f
            gl.c r1 = (gl.c) r1
            r0.f9477a = r9
            r0.f9478b = r1
            r0.f9481e = r3
            java.lang.Object r3 = r1.c(r0)
            if (r3 == r6) goto Lb1
            r3 = r9
        L80:
            java.lang.Object r9 = r8.f18733h     // Catch: java.lang.Throwable -> L9f
            p4.g r9 = (p4.g) r9     // Catch: java.lang.Throwable -> L9f
            androidx.lifecycle.u r4 = new androidx.lifecycle.u     // Catch: java.lang.Throwable -> L9f
            r7 = 2
            r4.<init>(r3, r5, r7)     // Catch: java.lang.Throwable -> L9f
            r0.f9477a = r1     // Catch: java.lang.Throwable -> L9f
            r0.f9478b = r5     // Catch: java.lang.Throwable -> L9f
            r0.f9481e = r2     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r9 = r9.a(r4, r0)     // Catch: java.lang.Throwable -> L9f
            if (r9 == r6) goto Lb1
            r0 = r1
        L97:
            com.google.android.gms.internal.ads.rw0 r9 = (com.google.android.gms.internal.ads.rw0) r9     // Catch: java.lang.Throwable -> L32
            r0.e(r5)
            yj.u r9 = yj.u.f37649a
            return r9
        L9f:
            r9 = move-exception
            r0 = r1
        La1:
            r0.e(r5)
            throw r9
        La5:
            r9 = move-exception
            goto Lad
        La7:
            java.lang.String r9 = "adQualityDataBuilder"
            nk.k.k(r9)     // Catch: java.lang.Throwable -> La5
            throw r5     // Catch: java.lang.Throwable -> La5
        Lad:
            r1.e(r5)
            throw r9
        Lb1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.q(ek.c):java.lang.Object");
    }

    public yf0(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public yf0(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, w5 w5Var, zd0 zd0Var, boolean z3) {
        this.f18729c = thread;
        this.f18732f = copyOnWriteArraySet;
        this.f18731e = zd0Var;
        this.f18734i = new Object();
        this.g = new ArrayDeque();
        this.f18733h = new ArrayDeque();
        this.f18730d = (looper == null || w5Var == null || zd0Var == null) ? null : w5Var.A(looper, new of0(0, this));
        this.f18728b = z3;
    }
}
