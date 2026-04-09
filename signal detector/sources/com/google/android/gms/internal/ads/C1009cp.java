package com.google.android.gms.internal.ads;

import a0.InterfaceC0252f;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import z5.AbstractC3046w;

/* renamed from: com.google.android.gms.internal.ads.cp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1009cp {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13672a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13673b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13674c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f13675d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f13676e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f13677f;

    /* renamed from: g, reason: collision with root package name */
    public Cloneable f13678g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f13679h;
    public final Object i;

    public C1009cp(InterfaceC0252f interfaceC0252f, Wu wu, C0512Fn c0512Fn, C1285ht c1285ht) {
        q5.i.e(interfaceC0252f, "adQualityDataStore");
        q5.i.e(c0512Fn, "dataPinger");
        this.i = c0512Fn;
        this.f13674c = AbstractC3046w.a(new z5.M((ExecutorService) wu.f12337b));
        this.f13675d = new H5.d();
        this.f13676e = new H5.d();
        this.f13677f = new H5.d();
        this.f13679h = interfaceC0252f;
    }

    public void a(Object obj) {
        obj.getClass();
        synchronized (this.i) {
            try {
                if (this.f13672a) {
                    return;
                }
                ((CopyOnWriteArraySet) this.f13677f).add(new C1871so(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Object obj) {
        h();
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f13677f;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C1871so c1871so = (C1871so) it.next();
            if (c1871so.f16795a.equals(obj)) {
                InterfaceC1172fo interfaceC1172fo = (InterfaceC1172fo) this.f13676e;
                c1871so.f16798d = true;
                if (interfaceC1172fo != null && c1871so.f16797c) {
                    c1871so.f16797c = false;
                    interfaceC1172fo.q(c1871so.f16795a, c1871so.f16796b.j());
                }
                copyOnWriteArraySet.remove(c1871so);
            }
        }
    }

    public void c(int i, InterfaceC0801Wn interfaceC0801Wn) {
        h();
        ((ArrayDeque) this.f13679h).add(new RunnableC0496Eo(i, 0, new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f13677f), interfaceC0801Wn));
    }

    public void d() {
        h();
        ArrayDeque arrayDeque = (ArrayDeque) this.f13679h;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (((InterfaceC1172fo) this.f13676e) != null) {
            C1231gt c1231gt = (C1231gt) this.f13675d;
            c1231gt.getClass();
            Handler handler = c1231gt.f14397a;
            if (!handler.hasMessages(1)) {
                C0959bt c0959btG = C1231gt.g();
                Message messageObtainMessage = handler.obtainMessage(1);
                c0959btG.f13478a = messageObtainMessage;
                messageObtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(messageObtainMessage);
                c0959btG.f13478a = null;
                C1231gt.f(c0959btG);
            }
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) this.f13678g;
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
        synchronized (this.i) {
            this.f13672a = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f13677f;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C1871so c1871so = (C1871so) it.next();
            InterfaceC1172fo interfaceC1172fo = (InterfaceC1172fo) this.f13676e;
            c1871so.f16798d = true;
            if (interfaceC1172fo != null && c1871so.f16797c) {
                c1871so.f16797c = false;
                interfaceC1172fo.q(c1871so.f16795a, c1871so.f16796b.j());
            }
        }
        copyOnWriteArraySet.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fd A[EDGE_INSN: B:63:0x00fd->B:54:0x00fd BREAK  A[LOOP:0: B:35:0x008b->B:53:0x00ef], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.google.android.gms.internal.ads.cp] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v19, types: [H5.a] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(j5.b r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1009cp.f(j5.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(java.lang.String r6, j5.b r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.gms.internal.ads.Ax
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.gms.internal.ads.Ax r0 = (com.google.android.gms.internal.ads.Ax) r0
            int r1 = r0.f7078h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7078h = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.Ax r0 = new com.google.android.gms.internal.ads.Ax
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f7076f
            int r1 = r0.f7078h
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            long r3 = r0.f7075e
            H5.d r6 = r0.f7074d
            java.lang.String r0 = r0.i
            R2.a.H(r7)
            goto L50
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            R2.a.H(r7)
            java.lang.Object r7 = r5.f13675d
            H5.d r7 = (H5.d) r7
            long r3 = java.lang.System.currentTimeMillis()
            r0.i = r6
            r0.f7074d = r7
            r0.f7075e = r3
            r0.f7078h = r2
            java.lang.Object r0 = r7.c(r0)
            i5.a r1 = i5.EnumC2380a.f20635a
            if (r0 == r1) goto L85
            r0 = r6
            r6 = r7
        L50:
            boolean r7 = r5.f13672a     // Catch: java.lang.Throwable -> L80
            c5.i r1 = c5.C0412i.f5929a
            if (r7 == 0) goto L5a
            r6.d()
            return r1
        L5a:
            r5.f13672a = r2     // Catch: java.lang.Throwable -> L80
            com.google.android.gms.internal.ads.kx r7 = com.google.android.gms.internal.ads.C1449kx.R()     // Catch: java.lang.Throwable -> L80
            com.google.android.gms.internal.ads.cL r7 = r7.s()     // Catch: java.lang.Throwable -> L80
            com.google.android.gms.internal.ads.jx r7 = (com.google.android.gms.internal.ads.C1395jx) r7     // Catch: java.lang.Throwable -> L80
            r5.f13678g = r7     // Catch: java.lang.Throwable -> L80
            r7.b()     // Catch: java.lang.Throwable -> L80
            com.google.android.gms.internal.ads.eL r2 = r7.f13551b     // Catch: java.lang.Throwable -> L80
            com.google.android.gms.internal.ads.kx r2 = (com.google.android.gms.internal.ads.C1449kx) r2     // Catch: java.lang.Throwable -> L80
            r2.S(r0)     // Catch: java.lang.Throwable -> L80
            r7.b()     // Catch: java.lang.Throwable -> L80
            com.google.android.gms.internal.ads.eL r7 = r7.f13551b     // Catch: java.lang.Throwable -> L80
            com.google.android.gms.internal.ads.kx r7 = (com.google.android.gms.internal.ads.C1449kx) r7     // Catch: java.lang.Throwable -> L80
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1009cp.g(java.lang.String, j5.b):java.lang.Object");
    }

    public void h() {
        if (this.f13673b) {
            AbstractC0582Jp.h0(Thread.currentThread() == ((Thread) this.f13674c));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0088 A[Catch: all -> 0x00af, TRY_LEAVE, TryCatch #1 {all -> 0x00af, blocks: (B:31:0x0081, B:33:0x0088, B:40:0x00a9, B:41:0x00ae), top: B:51:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9 A[Catch: all -> 0x00af, TRY_ENTER, TryCatch #1 {all -> 0x00af, blocks: (B:31:0x0081, B:33:0x0088, B:40:0x00a9, B:41:0x00ae), top: B:51:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i(j5.b r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.gms.internal.ads.C2096wx
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.gms.internal.ads.wx r0 = (com.google.android.gms.internal.ads.C2096wx) r0
            int r1 = r0.f17522h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17522h = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.wx r0 = new com.google.android.gms.internal.ads.wx
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f17520f
            int r1 = r0.f17522h
            c5.i r2 = c5.C0412i.f5929a
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            i5.a r7 = i5.EnumC2380a.f20635a
            if (r1 == 0) goto L4c
            if (r1 == r6) goto L46
            if (r1 == r5) goto L3e
            if (r1 == r4) goto L3a
            if (r1 != r3) goto L32
            R2.a.H(r11)
            return r2
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3a:
            R2.a.H(r11)
            goto L9f
        L3e:
            long r5 = r0.f17519e
            H5.d r1 = r0.f17518d
            R2.a.H(r11)
            goto L81
        L46:
            H5.d r1 = r0.f17518d
            R2.a.H(r11)
            goto L5e
        L4c:
            R2.a.H(r11)
            java.lang.Object r11 = r10.f13676e
            r1 = r11
            H5.d r1 = (H5.d) r1
            r0.f17518d = r1
            r0.f17522h = r6
            java.lang.Object r11 = r1.c(r0)
            if (r11 == r7) goto Lb9
        L5e:
            boolean r11 = r10.f13673b     // Catch: java.lang.Throwable -> Lb4
            if (r11 == 0) goto L66
            r1.d()
            return r2
        L66:
            r10.f13673b = r6     // Catch: java.lang.Throwable -> Lb4
            r1.d()
            java.lang.Object r11 = r10.f13675d
            r1 = r11
            H5.d r1 = (H5.d) r1
            long r8 = java.lang.System.currentTimeMillis()
            r0.f17518d = r1
            r0.f17519e = r8
            r0.f17522h = r5
            java.lang.Object r11 = r1.c(r0)
            if (r11 == r7) goto Lb9
            r5 = r8
        L81:
            java.lang.Cloneable r11 = r10.f13678g     // Catch: java.lang.Throwable -> Laf
            com.google.android.gms.internal.ads.jx r11 = (com.google.android.gms.internal.ads.C1395jx) r11     // Catch: java.lang.Throwable -> Laf
            r8 = 0
            if (r11 == 0) goto La9
            r11.b()     // Catch: java.lang.Throwable -> Laf
            com.google.android.gms.internal.ads.eL r11 = r11.f13551b     // Catch: java.lang.Throwable -> Laf
            com.google.android.gms.internal.ads.kx r11 = (com.google.android.gms.internal.ads.C1449kx) r11     // Catch: java.lang.Throwable -> Laf
            r11.b0(r5)     // Catch: java.lang.Throwable -> Laf
            r1.d()
            r0.f17518d = r8
            r0.f17522h = r4
            java.lang.Object r11 = r10.p(r5, r0)
            if (r11 == r7) goto Lb9
        L9f:
            r0.f17522h = r3
            java.lang.Object r11 = r10.q(r0)
            if (r11 != r7) goto La8
            goto Lb9
        La8:
            return r2
        La9:
            java.lang.String r11 = "adQualityDataBuilder"
            q5.i.g(r11)     // Catch: java.lang.Throwable -> Laf
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1009cp.i(j5.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[Catch: all -> 0x00e7, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e7, blocks: (B:27:0x0074, B:30:0x007d, B:33:0x0089, B:35:0x008f, B:37:0x00b5, B:39:0x00c5, B:41:0x00cb, B:42:0x00df, B:43:0x00e2, B:44:0x00e3, B:45:0x00e6, B:48:0x00ea, B:49:0x00ed, B:50:0x00ee, B:52:0x00f4, B:54:0x00fe, B:56:0x0104, B:58:0x012a, B:59:0x013e, B:60:0x0141, B:61:0x0142, B:62:0x0145, B:63:0x0146, B:65:0x014c, B:68:0x015a, B:69:0x015d, B:70:0x015e, B:71:0x0161, B:72:0x0162, B:73:0x0165), top: B:80:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0162 A[Catch: all -> 0x00e7, TryCatch #0 {all -> 0x00e7, blocks: (B:27:0x0074, B:30:0x007d, B:33:0x0089, B:35:0x008f, B:37:0x00b5, B:39:0x00c5, B:41:0x00cb, B:42:0x00df, B:43:0x00e2, B:44:0x00e3, B:45:0x00e6, B:48:0x00ea, B:49:0x00ed, B:50:0x00ee, B:52:0x00f4, B:54:0x00fe, B:56:0x0104, B:58:0x012a, B:59:0x013e, B:60:0x0141, B:61:0x0142, B:62:0x0145, B:63:0x0146, B:65:0x014c, B:68:0x015a, B:69:0x015d, B:70:0x015e, B:71:0x0161, B:72:0x0162, B:73:0x0165), top: B:80:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(j5.b r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1009cp.j(j5.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: all -> 0x0101, TRY_ENTER, TryCatch #0 {all -> 0x0101, blocks: (B:33:0x008b, B:36:0x0093, B:38:0x00a3, B:40:0x00bc, B:42:0x00cc, B:54:0x0103, B:55:0x0106, B:56:0x0107, B:57:0x010a, B:58:0x010b, B:59:0x010e, B:60:0x010f, B:61:0x0112), top: B:68:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:33:0x008b, B:36:0x0093, B:38:0x00a3, B:40:0x00bc, B:42:0x00cc, B:54:0x0103, B:55:0x0106, B:56:0x0107, B:57:0x010a, B:58:0x010b, B:59:0x010e, B:60:0x010f, B:61:0x0112), top: B:68:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object k(j5.b r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1009cp.k(j5.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: all -> 0x0111, TRY_ENTER, TryCatch #0 {all -> 0x0111, blocks: (B:33:0x008b, B:36:0x0093, B:38:0x00a3, B:40:0x00bc, B:42:0x00cc, B:44:0x00dc, B:56:0x0113, B:57:0x0116, B:58:0x0117, B:59:0x011a, B:60:0x011b, B:61:0x011e, B:62:0x011f, B:63:0x0122, B:64:0x0123, B:65:0x0126), top: B:72:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0123 A[Catch: all -> 0x0111, TryCatch #0 {all -> 0x0111, blocks: (B:33:0x008b, B:36:0x0093, B:38:0x00a3, B:40:0x00bc, B:42:0x00cc, B:44:0x00dc, B:56:0x0113, B:57:0x0116, B:58:0x0117, B:59:0x011a, B:60:0x011b, B:61:0x011e, B:62:0x011f, B:63:0x0122, B:64:0x0123, B:65:0x0126), top: B:72:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object l(j5.b r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1009cp.l(j5.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(j5.b r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.Cx
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.gms.internal.ads.Cx r0 = (com.google.android.gms.internal.ads.Cx) r0
            int r1 = r0.f7706h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7706h = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.Cx r0 = new com.google.android.gms.internal.ads.Cx
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f7704f
            int r1 = r0.f7706h
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            long r1 = r0.f7702d
            H5.d r0 = r0.f7703e
            R2.a.H(r6)
            goto L4c
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            R2.a.H(r6)
            java.lang.Object r6 = r5.f13675d
            H5.d r6 = (H5.d) r6
            long r3 = java.lang.System.currentTimeMillis()
            r0.f7703e = r6
            r0.f7702d = r3
            r0.f7706h = r2
            java.lang.Object r0 = r6.c(r0)
            i5.a r1 = i5.EnumC2380a.f20635a
            if (r0 == r1) goto L6e
            r0 = r6
            r1 = r3
        L4c:
            java.lang.Cloneable r6 = r5.f13678g     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.internal.ads.jx r6 = (com.google.android.gms.internal.ads.C1395jx) r6     // Catch: java.lang.Throwable -> L69
            if (r6 == 0) goto L62
            r6.b()     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.internal.ads.eL r6 = r6.f13551b     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.internal.ads.kx r6 = (com.google.android.gms.internal.ads.C1449kx) r6     // Catch: java.lang.Throwable -> L69
            r6.B(r1)     // Catch: java.lang.Throwable -> L69
            r0.d()
            c5.i r6 = c5.C0412i.f5929a
            return r6
        L62:
            java.lang.String r6 = "adQualityDataBuilder"
            q5.i.g(r6)     // Catch: java.lang.Throwable -> L69
            r6 = 0
            throw r6     // Catch: java.lang.Throwable -> L69
        L69:
            r6 = move-exception
            r0.d()
            throw r6
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1009cp.m(j5.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object n(java.lang.String r8, j5.b r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.C1826rx
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.rx r0 = (com.google.android.gms.internal.ads.C1826rx) r0
            int r1 = r0.f16651h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16651h = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.rx r0 = new com.google.android.gms.internal.ads.rx
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f16649f
            int r1 = r0.f16651h
            r2 = 2
            r3 = 1
            i5.a r4 = i5.EnumC2380a.f20635a
            if (r1 == 0) goto L44
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r8 = r0.f16647d
            H5.a r8 = (H5.a) r8
            R2.a.H(r9)     // Catch: java.lang.Throwable -> L2e
            goto L72
        L2e:
            r9 = move-exception
            goto L80
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            H5.d r8 = r0.f16648e
            java.lang.Object r1 = r0.f16647d
            java.lang.String r1 = (java.lang.String) r1
            R2.a.H(r9)
            r9 = r8
            r8 = r1
            goto L57
        L44:
            R2.a.H(r9)
            java.lang.Object r9 = r7.f13677f
            H5.d r9 = (H5.d) r9
            r0.f16647d = r8
            r0.f16648e = r9
            r0.f16651h = r3
            java.lang.Object r1 = r9.c(r0)
            if (r1 == r4) goto L86
        L57:
            java.lang.Object r1 = r7.f13679h     // Catch: java.lang.Throwable -> L7c
            a0.f r1 = (a0.InterfaceC0252f) r1     // Catch: java.lang.Throwable -> L7c
            com.google.android.gms.internal.ads.sx r3 = new com.google.android.gms.internal.ads.sx     // Catch: java.lang.Throwable -> L7c
            r5 = 0
            r3.<init>(r8, r5)     // Catch: java.lang.Throwable -> L7c
            r0.f16647d = r9     // Catch: java.lang.Throwable -> L7c
            r0.f16648e = r5     // Catch: java.lang.Throwable -> L7c
            r0.f16651h = r2     // Catch: java.lang.Throwable -> L7c
            a0.C r1 = (a0.C0244C) r1     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r8 = r1.i(r3, r0)     // Catch: java.lang.Throwable -> L7c
            if (r8 == r4) goto L86
            r6 = r9
            r9 = r8
            r8 = r6
        L72:
            com.google.android.gms.internal.ads.nx r9 = (com.google.android.gms.internal.ads.C1611nx) r9     // Catch: java.lang.Throwable -> L2e
            H5.d r8 = (H5.d) r8
            r8.d()
            c5.i r8 = c5.C0412i.f5929a
            return r8
        L7c:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L80:
            H5.d r8 = (H5.d) r8
            r8.d()
            throw r9
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1009cp.n(java.lang.String, j5.b):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v5, types: [H5.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object o(j5.b r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.C1988ux
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.ux r0 = (com.google.android.gms.internal.ads.C1988ux) r0
            int r1 = r0.f17196g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17196g = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.ux r0 = new com.google.android.gms.internal.ads.ux
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f17194e
            int r1 = r0.f17196g
            r2 = 1
            r3 = 2
            i5.a r4 = i5.EnumC2380a.f20635a
            if (r1 == 0) goto L3d
            if (r1 == r2) goto L36
            if (r1 != r3) goto L2e
            H5.a r0 = r0.f17193d
            R2.a.H(r8)     // Catch: java.lang.Throwable -> L2c
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
            H5.a r1 = r0.f17193d
            R2.a.H(r8)
            r8 = r1
            goto L4e
        L3d:
            R2.a.H(r8)
            java.lang.Object r8 = r7.f13677f
            H5.d r8 = (H5.d) r8
            r0.f17193d = r8
            r0.f17196g = r2
            java.lang.Object r1 = r8.c(r0)
            if (r1 == r4) goto L7b
        L4e:
            java.lang.Object r1 = r7.f13679h     // Catch: java.lang.Throwable -> L71
            a0.f r1 = (a0.InterfaceC0252f) r1     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.internal.ads.vx r2 = new com.google.android.gms.internal.ads.vx     // Catch: java.lang.Throwable -> L71
            r5 = 0
            r2.<init>(r3, r5)     // Catch: java.lang.Throwable -> L71
            r0.f17193d = r8     // Catch: java.lang.Throwable -> L71
            r0.f17196g = r3     // Catch: java.lang.Throwable -> L71
            a0.C r1 = (a0.C0244C) r1     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r1.i(r2, r0)     // Catch: java.lang.Throwable -> L71
            if (r0 == r4) goto L7b
            r6 = r0
            r0 = r8
            r8 = r6
        L67:
            com.google.android.gms.internal.ads.nx r8 = (com.google.android.gms.internal.ads.C1611nx) r8     // Catch: java.lang.Throwable -> L2c
            H5.d r0 = (H5.d) r0
            r0.d()
            c5.i r8 = c5.C0412i.f5929a
            return r8
        L71:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L75:
            H5.d r0 = (H5.d) r0
            r0.d()
            throw r8
        L7b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1009cp.o(j5.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object p(long r6, j5.b r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.C1934tx
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.tx r0 = (com.google.android.gms.internal.ads.C1934tx) r0
            int r1 = r0.f17008h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17008h = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.tx r0 = new com.google.android.gms.internal.ads.tx
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f17006f
            int r1 = r0.f17008h
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            long r6 = r0.f17004d
            H5.d r0 = r0.f17005e
            R2.a.H(r8)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            R2.a.H(r8)
            java.lang.Object r8 = r5.f13675d
            H5.d r8 = (H5.d) r8
            r0.f17005e = r8
            r0.f17004d = r6
            r0.f17008h = r2
            java.lang.Object r0 = r8.c(r0)
            i5.a r1 = i5.EnumC2380a.f20635a
            if (r0 == r1) goto L86
            r0 = r8
        L47:
            java.lang.Cloneable r8 = r5.f13678g     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.jx r8 = (com.google.android.gms.internal.ads.C1395jx) r8     // Catch: java.lang.Throwable -> L78
            r1 = 0
            java.lang.String r2 = "adQualityDataBuilder"
            if (r8 == 0) goto L7e
            com.google.android.gms.internal.ads.eL r3 = r8.f13551b     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.kx r3 = (com.google.android.gms.internal.ads.C1449kx) r3     // Catch: java.lang.Throwable -> L78
            long r3 = r3.J()     // Catch: java.lang.Throwable -> L78
            long r6 = r6 - r3
            java.lang.Cloneable r3 = r5.f13678g     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.jx r3 = (com.google.android.gms.internal.ads.C1395jx) r3     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L7a
            com.google.android.gms.internal.ads.eL r1 = r3.f13551b     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.kx r1 = (com.google.android.gms.internal.ads.C1449kx) r1     // Catch: java.lang.Throwable -> L78
            long r1 = r1.I()     // Catch: java.lang.Throwable -> L78
            long r6 = r6 - r1
            r8.b()     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.eL r8 = r8.f13551b     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.kx r8 = (com.google.android.gms.internal.ads.C1449kx) r8     // Catch: java.lang.Throwable -> L78
            r8.T(r6)     // Catch: java.lang.Throwable -> L78
            r0.d()
            c5.i r6 = c5.C0412i.f5929a
            return r6
        L78:
            r6 = move-exception
            goto L82
        L7a:
            q5.i.g(r2)     // Catch: java.lang.Throwable -> L78
            throw r1     // Catch: java.lang.Throwable -> L78
        L7e:
            q5.i.g(r2)     // Catch: java.lang.Throwable -> L78
            throw r1     // Catch: java.lang.Throwable -> L78
        L82:
            r0.d()
            throw r6
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1009cp.p(long, j5.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object q(j5.b r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.C2204yx
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.yx r0 = (com.google.android.gms.internal.ads.C2204yx) r0
            int r1 = r0.f17798h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17798h = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.yx r0 = new com.google.android.gms.internal.ads.yx
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f17796f
            int r1 = r0.f17798h
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            i5.a r6 = i5.EnumC2380a.f20635a
            if (r1 == 0) goto L4f
            if (r1 == r4) goto L47
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r0 = r0.f17794d
            H5.a r0 = (H5.a) r0
            R2.a.H(r8)     // Catch: java.lang.Throwable -> L32
            goto L9b
        L32:
            r8 = move-exception
            goto La7
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            H5.d r1 = r0.f17795e
            java.lang.Object r3 = r0.f17794d
            com.google.android.gms.internal.ads.kx r3 = (com.google.android.gms.internal.ads.C1449kx) r3
            R2.a.H(r8)
            goto L83
        L47:
            java.lang.Object r1 = r0.f17794d
            H5.a r1 = (H5.a) r1
            R2.a.H(r8)
            goto L61
        L4f:
            R2.a.H(r8)
            java.lang.Object r8 = r7.f13675d
            r1 = r8
            H5.d r1 = (H5.d) r1
            r0.f17794d = r1
            r0.f17798h = r4
            java.lang.Object r8 = r1.c(r0)
            if (r8 == r6) goto Lbb
        L61:
            java.lang.Cloneable r8 = r7.f13678g     // Catch: java.lang.Throwable -> Lad
            com.google.android.gms.internal.ads.jx r8 = (com.google.android.gms.internal.ads.C1395jx) r8     // Catch: java.lang.Throwable -> Lad
            if (r8 == 0) goto Laf
            com.google.android.gms.internal.ads.eL r8 = r8.d()     // Catch: java.lang.Throwable -> Lad
            com.google.android.gms.internal.ads.kx r8 = (com.google.android.gms.internal.ads.C1449kx) r8     // Catch: java.lang.Throwable -> Lad
            H5.d r1 = (H5.d) r1
            r1.d()
            java.lang.Object r1 = r7.f13677f
            H5.d r1 = (H5.d) r1
            r0.f17794d = r8
            r0.f17795e = r1
            r0.f17798h = r3
            java.lang.Object r3 = r1.c(r0)
            if (r3 == r6) goto Lbb
            r3 = r8
        L83:
            java.lang.Object r8 = r7.f13679h     // Catch: java.lang.Throwable -> La5
            a0.f r8 = (a0.InterfaceC0252f) r8     // Catch: java.lang.Throwable -> La5
            com.google.android.gms.internal.ads.zx r4 = new com.google.android.gms.internal.ads.zx     // Catch: java.lang.Throwable -> La5
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> La5
            r0.f17794d = r1     // Catch: java.lang.Throwable -> La5
            r0.f17795e = r5     // Catch: java.lang.Throwable -> La5
            r0.f17798h = r2     // Catch: java.lang.Throwable -> La5
            a0.C r8 = (a0.C0244C) r8     // Catch: java.lang.Throwable -> La5
            java.lang.Object r8 = r8.i(r4, r0)     // Catch: java.lang.Throwable -> La5
            if (r8 == r6) goto Lbb
            r0 = r1
        L9b:
            com.google.android.gms.internal.ads.nx r8 = (com.google.android.gms.internal.ads.C1611nx) r8     // Catch: java.lang.Throwable -> L32
            H5.d r0 = (H5.d) r0
            r0.d()
            c5.i r8 = c5.C0412i.f5929a
            return r8
        La5:
            r8 = move-exception
            r0 = r1
        La7:
            H5.d r0 = (H5.d) r0
            r0.d()
            throw r8
        Lad:
            r8 = move-exception
            goto Lb5
        Laf:
            java.lang.String r8 = "adQualityDataBuilder"
            q5.i.g(r8)     // Catch: java.lang.Throwable -> Lad
            throw r5     // Catch: java.lang.Throwable -> Lad
        Lb5:
            H5.d r1 = (H5.d) r1
            r1.d()
            throw r8
        Lbb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1009cp.q(j5.b):java.lang.Object");
    }

    public C1009cp(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public C1009cp(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, C1994v2 c1994v2, InterfaceC1172fo interfaceC1172fo, boolean z6) {
        this.f13674c = thread;
        this.f13677f = copyOnWriteArraySet;
        this.f13676e = interfaceC1172fo;
        this.i = new Object();
        this.f13678g = new ArrayDeque();
        this.f13679h = new ArrayDeque();
        this.f13675d = (looper == null || c1994v2 == null || interfaceC1172fo == null) ? null : c1994v2.B(looper, new C0734So(0, this));
        this.f13673b = z6;
    }
}
