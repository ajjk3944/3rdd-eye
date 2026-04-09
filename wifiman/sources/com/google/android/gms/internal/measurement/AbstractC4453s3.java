package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import m4.AbstractC6769h;
import m4.InterfaceC6764c;

/* renamed from: com.google.android.gms.internal.measurement.s3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4453s3 {

    /* renamed from: h, reason: collision with root package name */
    private static final Object f35460h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static volatile E3 f35461i;

    /* renamed from: j, reason: collision with root package name */
    private static I3 f35462j;

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicInteger f35463k;

    /* renamed from: a, reason: collision with root package name */
    private final B3 f35464a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35465b;

    /* renamed from: c, reason: collision with root package name */
    private Object f35466c;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f35467d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f35468e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f35469f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f35470g;

    static {
        new AtomicReference();
        f35462j = new I3(new H3() { // from class: com.google.android.gms.internal.measurement.x3
            @Override // com.google.android.gms.internal.measurement.H3
            public final boolean zza() {
                return AbstractC4453s3.n();
            }
        });
        f35463k = new AtomicInteger();
    }

    static /* synthetic */ AbstractC4453s3 a(B3 b32, String str, Boolean bool, boolean z10) {
        return new A3(b32, str, bool, true);
    }

    static /* synthetic */ AbstractC4453s3 b(B3 b32, String str, Double d10, boolean z10) {
        return new C4509z3(b32, str, d10, true);
    }

    static /* synthetic */ AbstractC4453s3 c(B3 b32, String str, Long l10, boolean z10) {
        return new C4485w3(b32, str, l10, true);
    }

    static /* synthetic */ AbstractC4453s3 d(B3 b32, String str, String str2, boolean z10) {
        return new C3(b32, str, str2, true);
    }

    private final Object f(E3 e32) {
        InterfaceC6764c interfaceC6764c;
        String str;
        B3 b32 = this.f35464a;
        if (!b32.f34945e && ((interfaceC6764c = b32.f34949i) == null || ((Boolean) interfaceC6764c.apply(e32.a())).booleanValue())) {
            C4398l3 c4398l3A = C4398l3.a(e32.a());
            B3 b33 = this.f35464a;
            String strH = b33.f34945e ? null : h(b33.f34943c);
            if (strH != null && (str = (String) c4398l3A.zza(strH)) != null) {
                return g(str);
            }
        }
        return null;
    }

    private final String h(String str) {
        if (str != null && str.isEmpty()) {
            return this.f35465b;
        }
        return str + this.f35465b;
    }

    private final Object j(E3 e32) {
        Object objZza;
        InterfaceC4390k3 interfaceC4390k3A = this.f35464a.f34942b != null ? AbstractC4445r3.b(e32.a(), this.f35464a.f34942b) ? this.f35464a.f34948h ? C4337e3.a(e32.a().getContentResolver(), AbstractC4461t3.a(AbstractC4461t3.b(e32.a(), (String) AbstractC6769h.i(this.f35464a.f34942b.getLastPathSegment()))), new Runnable() { // from class: com.google.android.gms.internal.measurement.v3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4453s3.m();
            }
        }) : C4337e3.a(e32.a().getContentResolver(), this.f35464a.f34942b, new Runnable() { // from class: com.google.android.gms.internal.measurement.v3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4453s3.m();
            }
        }) : null : G3.b(e32.a(), (String) AbstractC6769h.i(this.f35464a.f34941a), new Runnable() { // from class: com.google.android.gms.internal.measurement.v3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4453s3.m();
            }
        });
        if (interfaceC4390k3A == null || (objZza = interfaceC4390k3A.zza(k())) == null) {
            return null;
        }
        return g(objZza);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void l(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.E3 r0 = com.google.android.gms.internal.measurement.AbstractC4453s3.f35461i
            if (r0 != 0) goto L4e
            if (r3 != 0) goto L7
            goto L4e
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.AbstractC4453s3.f35460h
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.E3 r1 = com.google.android.gms.internal.measurement.AbstractC4453s3.f35461i     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L4a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.measurement.E3 r1 = com.google.android.gms.internal.measurement.AbstractC4453s3.f35461i     // Catch: java.lang.Throwable -> L22
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L18
            goto L19
        L18:
            r3 = r2
        L19:
            if (r1 == 0) goto L24
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> L22
            if (r2 == r3) goto L44
            goto L24
        L22:
            r3 = move-exception
            goto L46
        L24:
            if (r1 == 0) goto L2f
            com.google.android.gms.internal.measurement.C4337e3.d()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.G3.c()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.C4398l3.c()     // Catch: java.lang.Throwable -> L22
        L2f:
            com.google.android.gms.internal.measurement.u3 r1 = new com.google.android.gms.internal.measurement.u3     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            m4.k r1 = m4.AbstractC6773l.a(r1)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.f3 r2 = new com.google.android.gms.internal.measurement.f3     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.AbstractC4453s3.f35461i = r2     // Catch: java.lang.Throwable -> L22
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.measurement.AbstractC4453s3.f35463k     // Catch: java.lang.Throwable -> L22
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L22
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            goto L4a
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r3     // Catch: java.lang.Throwable -> L48
        L48:
            r3 = move-exception
            goto L4c
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r3
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC4453s3.l(android.content.Context):void");
    }

    public static void m() {
        f35463k.incrementAndGet();
    }

    static /* synthetic */ boolean n() {
        return true;
    }

    private final Object o() {
        return this.f35466c;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0088 A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0029, B:14:0x002f, B:16:0x0045, B:22:0x0061, B:24:0x006c, B:37:0x008c, B:40:0x0094, B:41:0x0099, B:42:0x009d, B:27:0x0073, B:36:0x0088, B:30:0x007a, B:33:0x0081, B:43:0x00a1), top: B:49:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e() {
        /*
            r8 = this;
            boolean r0 = r8.f35469f
            if (r0 != 0) goto L11
            com.google.android.gms.internal.measurement.I3 r0 = com.google.android.gms.internal.measurement.AbstractC4453s3.f35462j
            java.lang.String r1 = r8.f35465b
            boolean r0 = r0.a(r1)
            java.lang.String r1 = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error."
            m4.AbstractC6769h.o(r0, r1)
        L11:
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.AbstractC4453s3.f35463k
            int r0 = r0.get()
            int r1 = r8.f35467d
            if (r1 >= r0) goto La5
            monitor-enter(r8)
            int r1 = r8.f35467d     // Catch: java.lang.Throwable -> L5a
            if (r1 >= r0) goto La1
            com.google.android.gms.internal.measurement.E3 r1 = com.google.android.gms.internal.measurement.AbstractC4453s3.f35461i     // Catch: java.lang.Throwable -> L5a
            m4.g r2 = m4.AbstractC6768g.a()     // Catch: java.lang.Throwable -> L5a
            r3 = 0
            if (r1 == 0) goto L5c
            m4.k r4 = r1.b()     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L5c
            m4.k r2 = r1.b()     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r2 = m4.AbstractC6769h.i(r2)     // Catch: java.lang.Throwable -> L5a
            m4.k r2 = (m4.InterfaceC6772k) r2     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L5a
            m4.g r2 = (m4.AbstractC6768g) r2     // Catch: java.lang.Throwable -> L5a
            boolean r4 = r2.d()     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L5c
            java.lang.Object r3 = r2.c()     // Catch: java.lang.Throwable -> L5a
            com.google.android.gms.internal.measurement.q3 r3 = (com.google.android.gms.internal.measurement.InterfaceC4438q3) r3     // Catch: java.lang.Throwable -> L5a
            com.google.android.gms.internal.measurement.B3 r4 = r8.f35464a     // Catch: java.lang.Throwable -> L5a
            android.net.Uri r5 = r4.f34942b     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r4.f34941a     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = r4.f34944d     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = r8.f35465b     // Catch: java.lang.Throwable -> L5a
            java.lang.String r3 = r3.a(r5, r6, r4, r7)     // Catch: java.lang.Throwable -> L5a
            goto L5c
        L5a:
            r0 = move-exception
            goto La3
        L5c:
            if (r1 == 0) goto L60
            r4 = 1
            goto L61
        L60:
            r4 = 0
        L61:
            java.lang.String r5 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            m4.AbstractC6769h.o(r4, r5)     // Catch: java.lang.Throwable -> L5a
            com.google.android.gms.internal.measurement.B3 r4 = r8.f35464a     // Catch: java.lang.Throwable -> L5a
            boolean r4 = r4.f34946f     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L7a
            java.lang.Object r4 = r8.f(r1)     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L73
            goto L8c
        L73:
            java.lang.Object r4 = r8.j(r1)     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L88
            goto L8c
        L7a:
            java.lang.Object r4 = r8.j(r1)     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L81
            goto L8c
        L81:
            java.lang.Object r4 = r8.f(r1)     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L88
            goto L8c
        L88:
            java.lang.Object r4 = r8.o()     // Catch: java.lang.Throwable -> L5a
        L8c:
            boolean r1 = r2.d()     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L9d
            if (r3 != 0) goto L99
            java.lang.Object r4 = r8.o()     // Catch: java.lang.Throwable -> L5a
            goto L9d
        L99:
            java.lang.Object r4 = r8.g(r3)     // Catch: java.lang.Throwable -> L5a
        L9d:
            r8.f35468e = r4     // Catch: java.lang.Throwable -> L5a
            r8.f35467d = r0     // Catch: java.lang.Throwable -> L5a
        La1:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5a
            goto La5
        La3:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5a
            throw r0
        La5:
            java.lang.Object r0 = r8.f35468e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC4453s3.e():java.lang.Object");
    }

    abstract Object g(Object obj);

    public final String k() {
        return h(this.f35464a.f34944d);
    }

    private AbstractC4453s3(B3 b32, String str, Object obj, boolean z10) {
        this.f35467d = -1;
        String str2 = b32.f34941a;
        if (str2 == null && b32.f34942b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && b32.f34942b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.f35464a = b32;
        this.f35465b = str;
        this.f35466c = obj;
        this.f35469f = z10;
        this.f35470g = false;
    }
}
