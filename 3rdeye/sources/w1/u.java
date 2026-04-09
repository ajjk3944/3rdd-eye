package w1;

import A9.C0575f;
import A9.D;
import D9.E;
import F9.C0663f;
import a8.C1674f;
import c9.C2078B;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p9.InterfaceC5480a;

/* compiled from: InvalidationTracker.kt */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f47283l = {"INSERT", "UPDATE", "DELETE"};

    /* renamed from: a, reason: collision with root package name */
    public final k f47284a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f47285b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f47286c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f47287d;

    /* renamed from: e, reason: collision with root package name */
    public final A8.q f47288e;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f47290g;

    /* renamed from: h, reason: collision with root package name */
    public final f f47291h;
    public final F3.f i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f47292j = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC5480a<Boolean> f47293k = new C1674f(1);

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f47289f = new LinkedHashMap();

    /* compiled from: InvalidationTracker.kt */
    public static final class a {
    }

    public u(k kVar, HashMap map, HashMap map2, String[] strArr, boolean z10, A8.q qVar) {
        String lowerCase;
        this.f47284a = kVar;
        this.f47285b = map;
        this.f47286c = map2;
        this.f47287d = z10;
        this.f47288e = qVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            kotlin.jvm.internal.l.e(lowerCase2, "toLowerCase(...)");
            this.f47289f.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.f47285b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.f47290g = strArr2;
        for (Map.Entry entry : this.f47285b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            kotlin.jvm.internal.l.e(lowerCase3, "toLowerCase(...)");
            if (this.f47289f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                kotlin.jvm.internal.l.e(lowerCase4, "toLowerCase(...)");
                LinkedHashMap linkedHashMap = this.f47289f;
                linkedHashMap.put(lowerCase4, C2078B.n(linkedHashMap, lowerCase3));
            }
        }
        this.f47291h = new f(this.f47290g.length);
        int length2 = this.f47290g.length;
        F3.f fVar = new F3.f();
        fVar.f1607b = E.c(new int[length2]);
        this.i = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(w1.u r4, w1.g r5, h9.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof w1.v
            if (r0 == 0) goto L16
            r0 = r6
            w1.v r0 = (w1.v) r0
            int r1 = r0.f47297o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f47297o = r1
            goto L1b
        L16:
            w1.v r0 = new w1.v
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r4 = r0.f47295m
            g9.a r6 = g9.a.COROUTINE_SUSPENDED
            int r1 = r0.f47297o
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r5 = r0.f47294l
            java.util.Set r5 = (java.util.Set) r5
            b9.n.b(r4)
            return r5
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            java.lang.Object r5 = r0.f47294l
            w1.g r5 = (w1.g) r5
            b9.n.b(r4)
            goto L57
        L41:
            b9.n.b(r4)
            w1.t r4 = new w1.t
            r1 = 0
            r4.<init>(r1)
            r0.f47294l = r5
            r0.f47297o = r3
            java.lang.String r1 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.a(r1, r4, r0)
            if (r4 != r6) goto L57
            goto L6e
        L57:
            java.util.Set r4 = (java.util.Set) r4
            r1 = r4
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L6f
            r0.f47294l = r4
            r0.f47297o = r2
            java.lang.String r1 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = w1.s.a(r5, r1, r0)
            if (r5 != r6) goto L6f
        L6e:
            return r6
        L6f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.u.a(w1.u, w1.g, h9.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(w1.u r7, h9.c r8) throws java.lang.Throwable {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof w1.w
            if (r0 == 0) goto L16
            r0 = r8
            w1.w r0 = (w1.w) r0
            int r1 = r0.f47302p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f47302p = r1
            goto L1b
        L16:
            w1.w r0 = new w1.w
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f47300n
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f47302p
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            E7.b r7 = r0.f47299m
            w1.u r0 = r0.f47298l
            b9.n.b(r8)     // Catch: java.lang.Throwable -> L30
            r2 = r7
            r7 = r0
            goto L82
        L30:
            r8 = move-exception
            goto La9
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            b9.n.b(r8)
            w1.k r8 = r7.f47284a
            E7.b r2 = r8.f47238g
            boolean r4 = r2.g()
            c9.v r5 = c9.C2101v.f18583b
            if (r4 == 0) goto Lad
            java.util.concurrent.atomic.AtomicBoolean r4 = r7.f47292j     // Catch: java.lang.Throwable -> L98
            r6 = 0
            boolean r4 = r4.compareAndSet(r3, r6)     // Catch: java.lang.Throwable -> L98
            if (r4 != 0) goto L57
            r2.s()
            return r5
        L57:
            p9.a<java.lang.Boolean> r4 = r7.f47293k     // Catch: java.lang.Throwable -> L98
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L98
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L98
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L98
            if (r4 != 0) goto L69
            r2.s()
            return r5
        L69:
            w1.x r4 = new w1.x     // Catch: java.lang.Throwable -> L98
            r5 = 0
            r4.<init>(r7, r5)     // Catch: java.lang.Throwable -> L98
            r0.f47298l = r7     // Catch: java.lang.Throwable -> L98
            r0.f47299m = r2     // Catch: java.lang.Throwable -> L98
            r0.f47302p = r3     // Catch: java.lang.Throwable -> L98
            w1.i r8 = r8.f47236e     // Catch: java.lang.Throwable -> La7
            if (r8 == 0) goto L9f
            y1.b r8 = r8.f47228f     // Catch: java.lang.Throwable -> La7
            java.lang.Object r8 = r8.Z(r6, r4, r0)     // Catch: java.lang.Throwable -> La7
            if (r8 != r1) goto L82
            return r1
        L82:
            java.util.Set r8 = (java.util.Set) r8     // Catch: java.lang.Throwable -> L98
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L98
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L98
            if (r0 != 0) goto L9b
            F3.f r0 = r7.i     // Catch: java.lang.Throwable -> L98
            r0.c(r8)     // Catch: java.lang.Throwable -> L98
            A8.q r7 = r7.f47288e     // Catch: java.lang.Throwable -> L98
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L98
            goto L9b
        L98:
            r8 = move-exception
        L99:
            r7 = r2
            goto La9
        L9b:
            r2.s()
            return r8
        L9f:
            java.lang.String r7 = "connectionManager"
            kotlin.jvm.internal.l.l(r7)     // Catch: java.lang.Throwable -> La7
            throw r5     // Catch: java.lang.Throwable -> La7
        La5:
            r8 = r7
            goto L99
        La7:
            r7 = move-exception
            goto La5
        La9:
            r7.s()
            throw r8
        Lad:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.u.b(w1.u, h9.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (w1.s.a(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00df, code lost:
    
        if (w1.s.a(r10, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00df -> B:28:0x00e2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(w1.u r17, w1.r r18, int r19, h9.c r20) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.u.c(w1.u, w1.r, int, h9.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r4v4, types: [w1.g] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0082 -> B:19:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(w1.u r8, w1.r r9, int r10, h9.c r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof w1.C5713A
            if (r0 == 0) goto L16
            r0 = r11
            w1.A r0 = (w1.C5713A) r0
            int r1 = r0.f47174s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f47174s = r1
            goto L1b
        L16:
            w1.A r0 = new w1.A
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.f47172q
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f47174s
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.f47171p
            int r9 = r0.f47170o
            java.lang.String[] r10 = r0.f47169n
            java.lang.String r2 = r0.f47168m
            w1.g r4 = r0.f47167l
            b9.n.b(r11)
            r11 = r10
            r10 = r4
            goto L85
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            b9.n.b(r11)
            java.lang.String[] r8 = r8.f47290g
            r8 = r8[r10]
            java.lang.String[] r10 = w1.u.f47283l
            r11 = 0
            r2 = 3
            r7 = r2
            r2 = r8
            r8 = r7
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L50:
            if (r9 >= r8) goto L87
            r4 = r11[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "room_table_modification_trigger_"
            r5.<init>(r6)
            r5.append(r2)
            r6 = 95
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r6 = 96
            java.lang.String r4 = androidx.work.s.e(r5, r4, r6)
            r0.f47167l = r10
            r0.f47168m = r2
            r0.f47169n = r11
            r0.f47170o = r9
            r0.f47171p = r8
            r0.f47174s = r3
            java.lang.Object r4 = w1.s.a(r10, r4, r0)
            if (r4 != r1) goto L85
            return r1
        L85:
            int r9 = r9 + r3
            goto L50
        L87:
            b9.A r8 = b9.C1992A.f18074a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.u.d(w1.u, w1.r, int, h9.c):java.lang.Object");
    }

    public final void e(G1.e onRefreshScheduled, B8.c onRefreshCompleted) {
        kotlin.jvm.internal.l.f(onRefreshScheduled, "onRefreshScheduled");
        kotlin.jvm.internal.l.f(onRefreshCompleted, "onRefreshCompleted");
        if (this.f47292j.compareAndSet(false, true)) {
            onRefreshScheduled.invoke();
            C0663f c0663f = this.f47284a.f47232a;
            if (c0663f != null) {
                C0575f.e(c0663f, new D(), null, new y(this, onRefreshCompleted, null), 2);
            } else {
                kotlin.jvm.internal.l.l("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(h9.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof w1.C5714B
            if (r0 == 0) goto L13
            r0 = r7
            w1.B r0 = (w1.C5714B) r0
            int r1 = r0.f47178o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47178o = r1
            goto L18
        L13:
            w1.B r0 = new w1.B
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f47176m
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f47178o
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            E7.b r0 = r0.f47175l
            b9.n.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L59
        L29:
            r7 = move-exception
            goto L67
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            b9.n.b(r7)
            w1.k r7 = r6.f47284a
            E7.b r2 = r7.f47238g
            boolean r4 = r2.g()
            if (r4 == 0) goto L6b
            w1.C r4 = new w1.C     // Catch: java.lang.Throwable -> L65
            r5 = 0
            r4.<init>(r6, r5)     // Catch: java.lang.Throwable -> L65
            r0.f47175l = r2     // Catch: java.lang.Throwable -> L65
            r0.f47178o = r3     // Catch: java.lang.Throwable -> L65
            w1.i r7 = r7.f47236e     // Catch: java.lang.Throwable -> L65
            if (r7 == 0) goto L5d
            y1.b r7 = r7.f47228f     // Catch: java.lang.Throwable -> L65
            r3 = 0
            java.lang.Object r7 = r7.Z(r3, r4, r0)     // Catch: java.lang.Throwable -> L65
            if (r7 != r1) goto L58
            return r1
        L58:
            r0 = r2
        L59:
            r0.s()
            goto L6b
        L5d:
            java.lang.String r7 = "connectionManager"
            kotlin.jvm.internal.l.l(r7)     // Catch: java.lang.Throwable -> L65
            throw r5     // Catch: java.lang.Throwable -> L65
        L63:
            r0 = r2
            goto L67
        L65:
            r7 = move-exception
            goto L63
        L67:
            r0.s()
            throw r7
        L6b:
            b9.A r7 = b9.C1992A.f18074a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.u.f(h9.c):java.lang.Object");
    }
}
