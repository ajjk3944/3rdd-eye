package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ly;
import com.yandex.mobile.ads.impl.my;
import com.yandex.mobile.ads.impl.ny;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public abstract class ey1<I extends my, O extends ny, E extends ly> implements jy<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f27087a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f27088b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f27089c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f27090d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    private final I[] f27091e;

    /* renamed from: f, reason: collision with root package name */
    private final O[] f27092f;

    /* renamed from: g, reason: collision with root package name */
    private int f27093g;

    /* renamed from: h, reason: collision with root package name */
    private int f27094h;
    private I i;

    /* renamed from: j, reason: collision with root package name */
    private d32 f27095j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f27096k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f27097l;

    public class a extends Thread {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ey1 f27098b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jy1 jy1Var) {
            super("ExoPlayer:SimpleDecoder");
            this.f27098b = jy1Var;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ey1 ey1Var = this.f27098b;
            ey1Var.getClass();
            do {
                try {
                } catch (InterruptedException e4) {
                    throw new IllegalStateException(e4);
                }
            } while (ey1Var.e());
        }
    }

    public ey1(I[] iArr, O[] oArr) {
        this.f27091e = iArr;
        this.f27093g = iArr.length;
        for (int i = 0; i < this.f27093g; i++) {
            this.f27091e[i] = c();
        }
        this.f27092f = oArr;
        this.f27094h = oArr.length;
        for (int i10 = 0; i10 < this.f27094h; i10++) {
            ((O[]) this.f27092f)[i10] = d();
        }
        a aVar = new a((jy1) this);
        this.f27087a = aVar;
        aVar.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f27088b
            monitor-enter(r0)
        L3:
            boolean r1 = r8.f27097l     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L1d
            java.util.ArrayDeque<I extends com.yandex.mobile.ads.impl.my> r1 = r8.f27089c     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L17
            int r1 = r8.f27094h     // Catch: java.lang.Throwable -> L14
            if (r1 <= 0) goto L17
            goto L1d
        L14:
            r1 = move-exception
            goto Lad
        L17:
            java.lang.Object r1 = r8.f27088b     // Catch: java.lang.Throwable -> L14
            r1.wait()     // Catch: java.lang.Throwable -> L14
            goto L3
        L1d:
            boolean r1 = r8.f27097l     // Catch: java.lang.Throwable -> L14
            r2 = 0
            if (r1 == 0) goto L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r2
        L24:
            java.util.ArrayDeque<I extends com.yandex.mobile.ads.impl.my> r1 = r8.f27089c     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L14
            com.yandex.mobile.ads.impl.my r1 = (com.yandex.mobile.ads.impl.my) r1     // Catch: java.lang.Throwable -> L14
            O extends com.yandex.mobile.ads.impl.ny[] r3 = r8.f27092f     // Catch: java.lang.Throwable -> L14
            int r4 = r8.f27094h     // Catch: java.lang.Throwable -> L14
            r5 = 1
            int r4 = r4 - r5
            r8.f27094h = r4     // Catch: java.lang.Throwable -> L14
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L14
            boolean r4 = r8.f27096k     // Catch: java.lang.Throwable -> L14
            r8.f27096k = r2     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            r0 = 4
            boolean r6 = r1.c(r0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == 0) goto L48
            r3.b(r0)
            goto L80
        L48:
            boolean r0 = r1.c(r7)
            if (r0 == 0) goto L51
            r3.b(r7)
        L51:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            boolean r6 = r1.c(r0)
            if (r6 == 0) goto L5c
            r3.b(r0)
        L5c:
            com.yandex.mobile.ads.impl.d32 r0 = r8.a(r1, r3, r4)     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.RuntimeException -> L6b
            goto L74
        L61:
            r0 = move-exception
            com.yandex.mobile.ads.impl.d32 r4 = new com.yandex.mobile.ads.impl.d32
            java.lang.String r6 = "Unexpected decode error"
            r4.<init>(r6, r0)
        L69:
            r0 = r4
            goto L74
        L6b:
            r0 = move-exception
            com.yandex.mobile.ads.impl.d32 r4 = new com.yandex.mobile.ads.impl.d32
            java.lang.String r6 = "Unexpected decode error"
            r4.<init>(r6, r0)
            goto L69
        L74:
            if (r0 == 0) goto L80
            java.lang.Object r4 = r8.f27088b
            monitor-enter(r4)
            r8.f27095j = r0     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7d
            return r2
        L7d:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7d
            throw r0
        L80:
            java.lang.Object r2 = r8.f27088b
            monitor-enter(r2)
            boolean r0 = r8.f27096k     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L8d
            r3.h()     // Catch: java.lang.Throwable -> L8b
            goto L9c
        L8b:
            r0 = move-exception
            goto Lab
        L8d:
            boolean r0 = r3.c(r7)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L97
            r3.h()     // Catch: java.lang.Throwable -> L8b
            goto L9c
        L97:
            java.util.ArrayDeque<O extends com.yandex.mobile.ads.impl.ny> r0 = r8.f27090d     // Catch: java.lang.Throwable -> L8b
            r0.addLast(r3)     // Catch: java.lang.Throwable -> L8b
        L9c:
            r1.b()     // Catch: java.lang.Throwable -> L8b
            I extends com.yandex.mobile.ads.impl.my[] r0 = r8.f27091e     // Catch: java.lang.Throwable -> L8b
            int r3 = r8.f27093g     // Catch: java.lang.Throwable -> L8b
            int r4 = r3 + 1
            r8.f27093g = r4     // Catch: java.lang.Throwable -> L8b
            r0[r3] = r1     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8b
            return r5
        Lab:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8b
            throw r0
        Lad:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ey1.e():boolean");
    }

    public abstract d32 a(my myVar, ny nyVar, boolean z10);

    @Override // com.yandex.mobile.ads.impl.jy
    public final Object b() throws ly {
        I i;
        synchronized (this.f27088b) {
            try {
                d32 d32Var = this.f27095j;
                if (d32Var != null) {
                    throw d32Var;
                }
                if (this.i != null) {
                    throw new IllegalStateException();
                }
                int i10 = this.f27093g;
                if (i10 == 0) {
                    i = null;
                } else {
                    I[] iArr = this.f27091e;
                    int i11 = i10 - 1;
                    this.f27093g = i11;
                    i = iArr[i11];
                }
                this.i = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public abstract f32 c();

    public abstract O d();

    public final void f() {
        int i = this.f27093g;
        I[] iArr = this.f27091e;
        if (i != iArr.length) {
            throw new IllegalStateException();
        }
        for (I i10 : iArr) {
            i10.e(1024);
        }
    }

    @Override // com.yandex.mobile.ads.impl.jy
    public final void flush() {
        synchronized (this.f27088b) {
            try {
                this.f27096k = true;
                I i = this.i;
                if (i != null) {
                    i.b();
                    I[] iArr = this.f27091e;
                    int i10 = this.f27093g;
                    this.f27093g = i10 + 1;
                    iArr[i10] = i;
                    this.i = null;
                }
                while (!this.f27089c.isEmpty()) {
                    I iRemoveFirst = this.f27089c.removeFirst();
                    iRemoveFirst.b();
                    I[] iArr2 = this.f27091e;
                    int i11 = this.f27093g;
                    this.f27093g = i11 + 1;
                    iArr2[i11] = iRemoveFirst;
                }
                while (!this.f27090d.isEmpty()) {
                    this.f27090d.removeFirst().h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.jy
    public final void release() throws InterruptedException {
        synchronized (this.f27088b) {
            this.f27097l = true;
            this.f27088b.notify();
        }
        try {
            this.f27087a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.yandex.mobile.ads.impl.jy
    public final Object a() throws ly {
        synchronized (this.f27088b) {
            try {
                d32 d32Var = this.f27095j;
                if (d32Var != null) {
                    throw d32Var;
                }
                if (this.f27090d.isEmpty()) {
                    return null;
                }
                return this.f27090d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.jy
    public final void a(f32 f32Var) throws ly {
        synchronized (this.f27088b) {
            try {
                d32 d32Var = this.f27095j;
                if (d32Var == null) {
                    if (f32Var == this.i) {
                        this.f27089c.addLast(f32Var);
                        if (!this.f27089c.isEmpty() && this.f27094h > 0) {
                            this.f27088b.notify();
                        }
                        this.i = null;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw d32Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(O o10) {
        synchronized (this.f27088b) {
            try {
                o10.b();
                O[] oArr = this.f27092f;
                int i = this.f27094h;
                this.f27094h = i + 1;
                oArr[i] = o10;
                if (!this.f27089c.isEmpty() && this.f27094h > 0) {
                    this.f27088b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
