package com.yandex.mobile.ads.impl;

import android.util.Base64;
import com.yandex.mobile.ads.impl.ed;
import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.v42;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes3.dex */
public final class f00 {

    /* renamed from: h, reason: collision with root package name */
    public static final h32<String> f27134h = new G0(0);
    private static final Random i = new Random();

    /* renamed from: a, reason: collision with root package name */
    private final v42.d f27135a;

    /* renamed from: b, reason: collision with root package name */
    private final v42.b f27136b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, a> f27137c;

    /* renamed from: d, reason: collision with root package name */
    private final h32<String> f27138d;

    /* renamed from: e, reason: collision with root package name */
    private yh1 f27139e;

    /* renamed from: f, reason: collision with root package name */
    private v42 f27140f;

    /* renamed from: g, reason: collision with root package name */
    private String f27141g;

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f27142a;

        /* renamed from: b, reason: collision with root package name */
        private int f27143b;

        /* renamed from: c, reason: collision with root package name */
        private long f27144c;

        /* renamed from: d, reason: collision with root package name */
        private jw0.b f27145d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f27146e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f27147f;

        public a(String str, int i, jw0.b bVar) {
            this.f27142a = str;
            this.f27143b = i;
            this.f27144c = bVar == null ? -1L : bVar.f27473d;
            if (bVar == null || !bVar.a()) {
                return;
            }
            this.f27145d = bVar;
        }

        public final boolean a(ed.a aVar) {
            long j4 = this.f27144c;
            if (j4 == -1) {
                return false;
            }
            jw0.b bVar = aVar.f26800d;
            if (bVar == null) {
                return this.f27143b != aVar.f26799c;
            }
            if (bVar.f27473d > j4) {
                return true;
            }
            if (this.f27145d == null) {
                return false;
            }
            int iA = aVar.f26798b.a(bVar.f27470a);
            int iA2 = aVar.f26798b.a(this.f27145d.f27470a);
            jw0.b bVar2 = aVar.f26800d;
            if (bVar2.f27473d < this.f27145d.f27473d || iA < iA2) {
                return false;
            }
            if (iA > iA2) {
                return true;
            }
            if (!bVar2.a()) {
                int i = aVar.f26800d.f27474e;
                return i == -1 || i > this.f27145d.f27471b;
            }
            jw0.b bVar3 = aVar.f26800d;
            int i10 = bVar3.f27471b;
            int i11 = bVar3.f27472c;
            jw0.b bVar4 = this.f27145d;
            int i12 = bVar4.f27471b;
            return i10 > i12 || (i10 == i12 && i11 > bVar4.f27472c);
        }
    }

    public f00() {
        this(f27134h);
    }

    public final synchronized void a(ed.a aVar) {
        yh1 yh1Var;
        this.f27141g = null;
        Iterator<a> it = this.f27137c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            it.remove();
            if (next.f27146e && (yh1Var = this.f27139e) != null) {
                ((bw0) yh1Var).b(aVar, next.f27142a);
            }
        }
    }

    public final synchronized String b() {
        return this.f27141g;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0016 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void d(com.yandex.mobile.ads.impl.ed.a r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.yandex.mobile.ads.impl.yh1 r0 = r9.f27139e     // Catch: java.lang.Throwable -> L36
            r0.getClass()     // Catch: java.lang.Throwable -> L36
            com.yandex.mobile.ads.impl.v42 r0 = r9.f27140f     // Catch: java.lang.Throwable -> L36
            com.yandex.mobile.ads.impl.v42 r1 = r10.f26798b     // Catch: java.lang.Throwable -> L36
            r9.f27140f = r1     // Catch: java.lang.Throwable -> L36
            java.util.HashMap<java.lang.String, com.yandex.mobile.ads.impl.f00$a> r1 = r9.f27137c     // Catch: java.lang.Throwable -> L36
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L36
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L36
        L16:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto Laa
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L36
            com.yandex.mobile.ads.impl.f00$a r2 = (com.yandex.mobile.ads.impl.f00.a) r2     // Catch: java.lang.Throwable -> L36
            com.yandex.mobile.ads.impl.v42 r3 = r9.f27140f     // Catch: java.lang.Throwable -> L36
            int r4 = com.yandex.mobile.ads.impl.f00.a.b(r2)     // Catch: java.lang.Throwable -> L36
            int r5 = r0.b()     // Catch: java.lang.Throwable -> L36
            r6 = -1
            if (r4 < r5) goto L39
            int r5 = r3.b()     // Catch: java.lang.Throwable -> L36
            if (r4 >= r5) goto L69
            goto L6a
        L36:
            r10 = move-exception
            goto Laf
        L39:
            com.yandex.mobile.ads.impl.f00 r5 = com.yandex.mobile.ads.impl.f00.this     // Catch: java.lang.Throwable -> L36
            com.yandex.mobile.ads.impl.v42$d r5 = r5.f27135a     // Catch: java.lang.Throwable -> L36
            r7 = 0
            r0.a(r4, r5, r7)     // Catch: java.lang.Throwable -> L36
            com.yandex.mobile.ads.impl.f00 r4 = com.yandex.mobile.ads.impl.f00.this     // Catch: java.lang.Throwable -> L36
            com.yandex.mobile.ads.impl.v42$d r4 = r4.f27135a     // Catch: java.lang.Throwable -> L36
            int r4 = r4.f34371p     // Catch: java.lang.Throwable -> L36
        L48:
            com.yandex.mobile.ads.impl.f00 r5 = com.yandex.mobile.ads.impl.f00.this     // Catch: java.lang.Throwable -> L36
            com.yandex.mobile.ads.impl.v42$d r5 = r5.f27135a     // Catch: java.lang.Throwable -> L36
            int r5 = r5.f34372q     // Catch: java.lang.Throwable -> L36
            if (r4 > r5) goto L69
            java.lang.Object r5 = r0.a(r4)     // Catch: java.lang.Throwable -> L36
            int r5 = r3.a(r5)     // Catch: java.lang.Throwable -> L36
            if (r5 == r6) goto L66
            com.yandex.mobile.ads.impl.f00 r4 = com.yandex.mobile.ads.impl.f00.this     // Catch: java.lang.Throwable -> L36
            com.yandex.mobile.ads.impl.v42$b r4 = r4.f27136b     // Catch: java.lang.Throwable -> L36
            r7 = 0
            com.yandex.mobile.ads.impl.v42$b r4 = r3.a(r5, r4, r7)     // Catch: java.lang.Throwable -> L36
            int r4 = r4.f34345d     // Catch: java.lang.Throwable -> L36
            goto L6a
        L66:
            int r4 = r4 + 1
            goto L48
        L69:
            r4 = r6
        L6a:
            com.yandex.mobile.ads.impl.f00.a.g(r2, r4)     // Catch: java.lang.Throwable -> L36
            if (r4 != r6) goto L70
            goto L85
        L70:
            com.yandex.mobile.ads.impl.jw0$b r4 = com.yandex.mobile.ads.impl.f00.a.d(r2)     // Catch: java.lang.Throwable -> L36
            if (r4 != 0) goto L77
            goto L7f
        L77:
            java.lang.Object r4 = r4.f27470a     // Catch: java.lang.Throwable -> L36
            int r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L36
            if (r3 == r6) goto L85
        L7f:
            boolean r3 = r2.a(r10)     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L16
        L85:
            r1.remove()     // Catch: java.lang.Throwable -> L36
            boolean r3 = com.yandex.mobile.ads.impl.f00.a.e(r2)     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L16
            java.lang.String r3 = com.yandex.mobile.ads.impl.f00.a.a(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = r9.f27141g     // Catch: java.lang.Throwable -> L36
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L9d
            r3 = 0
            r9.f27141g = r3     // Catch: java.lang.Throwable -> L36
        L9d:
            com.yandex.mobile.ads.impl.yh1 r3 = r9.f27139e     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = com.yandex.mobile.ads.impl.f00.a.a(r2)     // Catch: java.lang.Throwable -> L36
            com.yandex.mobile.ads.impl.bw0 r3 = (com.yandex.mobile.ads.impl.bw0) r3     // Catch: java.lang.Throwable -> L36
            r3.b(r10, r2)     // Catch: java.lang.Throwable -> L36
            goto L16
        Laa:
            r9.b(r10)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r9)
            return
        Laf:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L36
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.f00.d(com.yandex.mobile.ads.impl.ed$a):void");
    }

    public f00(h32<String> h32Var) {
        this.f27138d = h32Var;
        this.f27135a = new v42.d();
        this.f27136b = new v42.b();
        this.f27137c = new HashMap<>();
        this.f27140f = v42.f34342b;
    }

    private void b(ed.a aVar) {
        jw0.b bVar;
        if (aVar.f26798b.c()) {
            this.f27141g = null;
            return;
        }
        a aVar2 = this.f27137c.get(this.f27141g);
        this.f27141g = a(aVar.f26799c, aVar.f26800d).f27142a;
        c(aVar);
        jw0.b bVar2 = aVar.f26800d;
        if (bVar2 == null || !bVar2.a()) {
            return;
        }
        if (aVar2 != null) {
            long j4 = aVar2.f27144c;
            jw0.b bVar3 = aVar.f26800d;
            if (j4 == bVar3.f27473d && (bVar = aVar2.f27145d) != null && bVar.f27471b == bVar3.f27471b && bVar.f27472c == bVar3.f27472c) {
                return;
            }
        }
        jw0.b bVar4 = aVar.f26800d;
        a(aVar.f26799c, new jw0.b(bVar4.f27470a, bVar4.f27473d));
        this.f27139e.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r1.f27473d < r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void c(com.yandex.mobile.ads.impl.ed.a r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.yandex.mobile.ads.impl.yh1 r0 = r6.f27139e     // Catch: java.lang.Throwable -> L33
            r0.getClass()     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.v42 r0 = r7.f26798b     // Catch: java.lang.Throwable -> L33
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L10
            monitor-exit(r6)
            return
        L10:
            java.util.HashMap<java.lang.String, com.yandex.mobile.ads.impl.f00$a> r0 = r6.f27137c     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = r6.f27141g     // Catch: java.lang.Throwable -> L33
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.f00$a r0 = (com.yandex.mobile.ads.impl.f00.a) r0     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.jw0$b r1 = r7.f26800d     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L3e
            if (r0 == 0) goto L3e
            long r2 = com.yandex.mobile.ads.impl.f00.a.c(r0)     // Catch: java.lang.Throwable -> L33
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L36
            int r0 = com.yandex.mobile.ads.impl.f00.a.b(r0)     // Catch: java.lang.Throwable -> L33
            int r2 = r7.f26799c     // Catch: java.lang.Throwable -> L33
            if (r0 == r2) goto L3e
            goto L3c
        L33:
            r7 = move-exception
            goto Ld0
        L36:
            long r4 = r1.f27473d     // Catch: java.lang.Throwable -> L33
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3e
        L3c:
            monitor-exit(r6)
            return
        L3e:
            int r0 = r7.f26799c     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.f00$a r0 = r6.a(r0, r1)     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = r6.f27141g     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L4e
            java.lang.String r1 = com.yandex.mobile.ads.impl.f00.a.a(r0)     // Catch: java.lang.Throwable -> L33
            r6.f27141g = r1     // Catch: java.lang.Throwable -> L33
        L4e:
            com.yandex.mobile.ads.impl.jw0$b r1 = r7.f26800d     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto La0
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto La0
            com.yandex.mobile.ads.impl.jw0$b r1 = new com.yandex.mobile.ads.impl.jw0$b     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.jw0$b r2 = r7.f26800d     // Catch: java.lang.Throwable -> L33
            java.lang.Object r3 = r2.f27470a     // Catch: java.lang.Throwable -> L33
            long r4 = r2.f27473d     // Catch: java.lang.Throwable -> L33
            int r2 = r2.f27471b     // Catch: java.lang.Throwable -> L33
            r1.<init>(r2, r4, r3)     // Catch: java.lang.Throwable -> L33
            int r2 = r7.f26799c     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.f00$a r1 = r6.a(r2, r1)     // Catch: java.lang.Throwable -> L33
            boolean r2 = com.yandex.mobile.ads.impl.f00.a.e(r1)     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto La0
            com.yandex.mobile.ads.impl.f00.a.i(r1)     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.v42 r1 = r7.f26798b     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.jw0$b r2 = r7.f26800d     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r2.f27470a     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.v42$b r3 = r6.f27136b     // Catch: java.lang.Throwable -> L33
            r1.a(r2, r3)     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.v42$b r1 = r6.f27136b     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.jw0$b r2 = r7.f26800d     // Catch: java.lang.Throwable -> L33
            int r2 = r2.f27471b     // Catch: java.lang.Throwable -> L33
            long r1 = r1.b(r2)     // Catch: java.lang.Throwable -> L33
            long r1 = com.yandex.mobile.ads.impl.s82.b(r1)     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.v42$b r3 = r6.f27136b     // Catch: java.lang.Throwable -> L33
            long r3 = r3.f34347f     // Catch: java.lang.Throwable -> L33
            long r3 = com.yandex.mobile.ads.impl.s82.b(r3)     // Catch: java.lang.Throwable -> L33
            long r3 = r3 + r1
            r1 = 0
            java.lang.Math.max(r1, r3)     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.yh1 r1 = r6.f27139e     // Catch: java.lang.Throwable -> L33
            r1.getClass()     // Catch: java.lang.Throwable -> L33
        La0:
            boolean r1 = com.yandex.mobile.ads.impl.f00.a.e(r0)     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto Lae
            com.yandex.mobile.ads.impl.f00.a.i(r0)     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.yh1 r1 = r6.f27139e     // Catch: java.lang.Throwable -> L33
            r1.getClass()     // Catch: java.lang.Throwable -> L33
        Lae:
            java.lang.String r1 = com.yandex.mobile.ads.impl.f00.a.a(r0)     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = r6.f27141g     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto Lce
            boolean r1 = com.yandex.mobile.ads.impl.f00.a.f(r0)     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto Lce
            com.yandex.mobile.ads.impl.f00.a.j(r0)     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.yh1 r1 = r6.f27139e     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = com.yandex.mobile.ads.impl.f00.a.a(r0)     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.bw0 r1 = (com.yandex.mobile.ads.impl.bw0) r1     // Catch: java.lang.Throwable -> L33
            r1.a(r7, r0)     // Catch: java.lang.Throwable -> L33
        Lce:
            monitor-exit(r6)
            return
        Ld0:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L33
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.f00.c(com.yandex.mobile.ads.impl.ed$a):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String a() {
        byte[] bArr = new byte[12];
        i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yandex.mobile.ads.impl.f00.a a(int r14, com.yandex.mobile.ads.impl.jw0.b r15) {
        /*
            r13 = this;
            java.util.HashMap<java.lang.String, com.yandex.mobile.ads.impl.f00$a> r0 = r13.f27137c
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L10:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L89
            java.lang.Object r4 = r0.next()
            com.yandex.mobile.ads.impl.f00$a r4 = (com.yandex.mobile.ads.impl.f00.a) r4
            long r5 = com.yandex.mobile.ads.impl.f00.a.c(r4)
            r7 = -1
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L33
            int r5 = com.yandex.mobile.ads.impl.f00.a.b(r4)
            if (r14 != r5) goto L33
            if (r15 == 0) goto L33
            long r5 = r15.f27473d
            com.yandex.mobile.ads.impl.f00.a.h(r4, r5)
        L33:
            if (r15 != 0) goto L3c
            int r5 = com.yandex.mobile.ads.impl.f00.a.b(r4)
            if (r14 != r5) goto L10
            goto L67
        L3c:
            com.yandex.mobile.ads.impl.jw0$b r5 = com.yandex.mobile.ads.impl.f00.a.d(r4)
            if (r5 != 0) goto L53
            boolean r5 = r15.a()
            if (r5 != 0) goto L10
            long r5 = r15.f27473d
            long r9 = com.yandex.mobile.ads.impl.f00.a.c(r4)
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L10
            goto L67
        L53:
            long r9 = r15.f27473d
            long r11 = r5.f27473d
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 != 0) goto L10
            int r6 = r15.f27471b
            int r9 = r5.f27471b
            if (r6 != r9) goto L10
            int r6 = r15.f27472c
            int r5 = r5.f27472c
            if (r6 != r5) goto L10
        L67:
            long r5 = com.yandex.mobile.ads.impl.f00.a.c(r4)
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L86
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 >= 0) goto L74
            goto L86
        L74:
            if (r7 != 0) goto L10
            int r5 = com.yandex.mobile.ads.impl.s82.f32899a
            com.yandex.mobile.ads.impl.jw0$b r5 = com.yandex.mobile.ads.impl.f00.a.d(r1)
            if (r5 == 0) goto L10
            com.yandex.mobile.ads.impl.jw0$b r5 = com.yandex.mobile.ads.impl.f00.a.d(r4)
            if (r5 == 0) goto L10
            r1 = r4
            goto L10
        L86:
            r1 = r4
            r2 = r5
            goto L10
        L89:
            if (r1 != 0) goto L9d
            com.yandex.mobile.ads.impl.h32<java.lang.String> r0 = r13.f27138d
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            com.yandex.mobile.ads.impl.f00$a r1 = new com.yandex.mobile.ads.impl.f00$a
            r1.<init>(r0, r14, r15)
            java.util.HashMap<java.lang.String, com.yandex.mobile.ads.impl.f00$a> r14 = r13.f27137c
            r14.put(r0, r1)
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.f00.a(int, com.yandex.mobile.ads.impl.jw0$b):com.yandex.mobile.ads.impl.f00$a");
    }

    public final synchronized String a(v42 v42Var, jw0.b bVar) {
        return a(v42Var.a(bVar.f27470a, this.f27136b).f34345d, bVar).f27142a;
    }

    public final void a(yh1 yh1Var) {
        this.f27139e = yh1Var;
    }

    public final synchronized void a(ed.a aVar, int i10) {
        try {
            this.f27139e.getClass();
            Iterator<a> it = this.f27137c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.a(aVar)) {
                    it.remove();
                    if (next.f27146e) {
                        if (next.f27142a.equals(this.f27141g)) {
                            this.f27141g = null;
                        }
                        ((bw0) this.f27139e).b(aVar, next.f27142a);
                    }
                }
            }
            b(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
