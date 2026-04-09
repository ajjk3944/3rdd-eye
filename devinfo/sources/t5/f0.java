package t5;

import androidx.work.impl.WorkDatabase_Impl;
import b5.i0;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f34225l = {"INSERT", "UPDATE", "DELETE"};

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f34226a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f34227b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f34228c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34229d;

    /* renamed from: e, reason: collision with root package name */
    public final c0.a f34230e;
    public final String[] g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f34232h;

    /* renamed from: i, reason: collision with root package name */
    public final o.e f34233i;
    public final AtomicBoolean j = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    public mk.a f34234k = new r0.i0(5);

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f34231f = new LinkedHashMap();

    public f0(WorkDatabase_Impl workDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z3, c0.a aVar) {
        String lowerCase;
        this.f34226a = workDatabase_Impl;
        this.f34227b = linkedHashMap;
        this.f34228c = linkedHashMap2;
        this.f34229d = z3;
        this.f34230e = aVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i4 = 0; i4 < length; i4++) {
            String str = strArr[i4];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            nk.k.d(lowerCase2, "toLowerCase(...)");
            this.f34231f.put(lowerCase2, Integer.valueOf(i4));
            String str2 = (String) this.f34227b.get(strArr[i4]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                nk.k.d(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i4] = lowerCase2;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.f34227b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            nk.k.d(lowerCase3, "toLowerCase(...)");
            if (this.f34231f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                nk.k.d(lowerCase4, "toLowerCase(...)");
                LinkedHashMap linkedHashMap3 = this.f34231f;
                linkedHashMap3.put(lowerCase4, zj.w.G(lowerCase3, linkedHashMap3));
            }
        }
        int length2 = this.g.length;
        i0 i0Var = new i0();
        i0Var.f1821b = new ReentrantLock();
        i0Var.f1822c = new long[length2];
        i0Var.f1823d = new boolean[length2];
        this.f34232h = i0Var;
        this.f34233i = new o.e(this.g.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(t5.f0 r4, t5.m r5, ek.c r6) {
        /*
            boolean r0 = r6 instanceof t5.x
            if (r0 == 0) goto L13
            r0 = r6
            t5.x r0 = (t5.x) r0
            int r1 = r0.f34297d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34297d = r1
            goto L18
        L13:
            t5.x r0 = new t5.x
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.f34295b
            int r6 = r0.f34297d
            r1 = 2
            r2 = 1
            dk.a r3 = dk.a.f22275a
            if (r6 == 0) goto L3e
            if (r6 == r2) goto L36
            if (r6 != r1) goto L2e
            java.lang.Object r5 = r0.f34294a
            java.util.Set r5 = (java.util.Set) r5
            ci.b.D(r4)
            return r5
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            java.lang.Object r5 = r0.f34294a
            t5.m r5 = (t5.m) r5
            ci.b.D(r4)
            goto L54
        L3e:
            ci.b.D(r4)
            sl.b r4 = new sl.b
            r6 = 3
            r4.<init>(r6)
            r0.f34294a = r5
            r0.f34297d = r2
            java.lang.String r6 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.a(r6, r4, r0)
            if (r4 != r3) goto L54
            goto L6b
        L54:
            java.util.Set r4 = (java.util.Set) r4
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L6c
            r0.f34294a = r4
            r0.f34297d = r1
            java.lang.String r6 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = b7.d.b(r5, r6, r0)
            if (r5 != r3) goto L6c
        L6b:
            return r3
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.f0.a(t5.f0, t5.m, ek.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(t5.f0 r8, ek.c r9) throws java.lang.Throwable {
        /*
            androidx.work.impl.WorkDatabase_Impl r0 = r8.f34226a
            boolean r1 = r9 instanceof t5.z
            if (r1 == 0) goto L15
            r1 = r9
            t5.z r1 = (t5.z) r1
            int r2 = r1.f34307e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f34307e = r2
            goto L1a
        L15:
            t5.z r1 = new t5.z
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.f34305c
            int r2 = r1.f34307e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            km.n r8 = r1.f34304b
            t5.f0 r0 = r1.f34303a
            ci.b.D(r9)     // Catch: java.lang.Throwable -> L2f
            r7 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            goto L7b
        L2f:
            r9 = move-exception
            goto L9a
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            ci.b.D(r9)
            km.n r9 = r0.f34284f
            boolean r2 = r9.i()
            zj.u r4 = zj.u.f38319a
            if (r2 == 0) goto L9e
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.j     // Catch: java.lang.Throwable -> L91
            r5 = 0
            boolean r2 = r2.compareAndSet(r3, r5)     // Catch: java.lang.Throwable -> L91
            if (r2 != 0) goto L53
            r9.A()
            return r4
        L53:
            mk.a r2 = r8.f34234k     // Catch: java.lang.Throwable -> L91
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L91
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L91
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L91
            if (r2 != 0) goto L65
            r9.A()
            return r4
        L65:
            t5.a0 r2 = new t5.a0     // Catch: java.lang.Throwable -> L91
            r4 = 0
            r6 = 1
            r2.<init>(r8, r4, r6)     // Catch: java.lang.Throwable -> L91
            r1.f34303a = r8     // Catch: java.lang.Throwable -> L91
            r1.f34304b = r9     // Catch: java.lang.Throwable -> L91
            r1.f34307e = r3     // Catch: java.lang.Throwable -> L91
            java.lang.Object r0 = r0.q(r5, r2, r1)     // Catch: java.lang.Throwable -> L91
            dk.a r1 = dk.a.f22275a
            if (r0 != r1) goto L7b
            return r1
        L7b:
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L91
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L91
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r1 != 0) goto L96
            o.e r1 = r8.f34233i     // Catch: java.lang.Throwable -> L91
            r1.r(r0)     // Catch: java.lang.Throwable -> L91
            c0.a r8 = r8.f34230e     // Catch: java.lang.Throwable -> L91
            r8.invoke(r0)     // Catch: java.lang.Throwable -> L91
            goto L96
        L91:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L9a
        L96:
            r9.A()
            return r0
        L9a:
            r8.A()
            throw r9
        L9e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.f0.b(t5.f0, ek.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (b7.d.b(r1, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00df, code lost:
    
        if (b7.d.b(r10, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
    
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00df -> B:28:0x00e2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(t5.f0 r17, t5.w r18, int r19, ek.c r20) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.f0.c(t5.f0, t5.w, int, ek.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r3v4, types: [t5.m] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0082 -> B:19:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(t5.f0 r7, t5.w r8, int r9, ek.c r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof t5.c0
            if (r0 == 0) goto L16
            r0 = r10
            t5.c0 r0 = (t5.c0) r0
            int r1 = r0.f34210h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f34210h = r1
            goto L1b
        L16:
            t5.c0 r0 = new t5.c0
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.f34209f
            int r1 = r0.f34210h
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            int r7 = r0.f34208e
            int r8 = r0.f34207d
            java.lang.String[] r9 = r0.f34206c
            java.lang.String r1 = r0.f34205b
            t5.m r3 = r0.f34204a
            ci.b.D(r10)
            r10 = r9
            r9 = r3
            goto L85
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            ci.b.D(r10)
            java.lang.String[] r7 = r7.g
            r7 = r7[r9]
            java.lang.String[] r9 = t5.f0.f34225l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4e:
            if (r8 >= r7) goto L87
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = d.h.p(r5, r4, r3)
            r0.f34204a = r9
            r0.f34205b = r1
            r0.f34206c = r10
            r0.f34207d = r8
            r0.f34208e = r7
            r0.f34210h = r2
            java.lang.Object r3 = b7.d.b(r9, r3, r0)
            dk.a r4 = dk.a.f22275a
            if (r3 != r4) goto L85
            return r4
        L85:
            int r8 = r8 + r2
            goto L4e
        L87:
            yj.u r7 = yj.u.f37649a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.f0.d(t5.f0, t5.w, int, ek.c):java.lang.Object");
    }

    public final void e(mk.a aVar, mk.a aVar2) {
        nk.k.e(aVar, "onRefreshScheduled");
        nk.k.e(aVar2, "onRefreshCompleted");
        if (this.j.compareAndSet(false, true)) {
            aVar.invoke();
            cl.d dVar = this.f34226a.f34279a;
            ck.c cVar = null;
            if (dVar != null) {
                xk.x.v(dVar, new xk.u(), null, new pf.n(this, aVar2, cVar, 7), 2);
            } else {
                nk.k.k("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(ek.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof t5.d0
            if (r0 == 0) goto L13
            r0 = r7
            t5.d0 r0 = (t5.d0) r0
            int r1 = r0.f34214d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34214d = r1
            goto L18
        L13:
            t5.d0 r0 = new t5.d0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f34212b
            int r1 = r0.f34214d
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            km.n r0 = r0.f34211a
            ci.b.D(r7)     // Catch: java.lang.Throwable -> L27
            goto L54
        L27:
            r7 = move-exception
            goto L5a
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            ci.b.D(r7)
            androidx.work.impl.WorkDatabase_Impl r7 = r6.f34226a
            km.n r1 = r7.f34284f
            boolean r3 = r1.i()
            if (r3 == 0) goto L5e
            t5.a0 r3 = new t5.a0     // Catch: java.lang.Throwable -> L58
            r4 = 0
            r5 = 2
            r3.<init>(r6, r4, r5)     // Catch: java.lang.Throwable -> L58
            r0.f34211a = r1     // Catch: java.lang.Throwable -> L58
            r0.f34214d = r2     // Catch: java.lang.Throwable -> L58
            r2 = 0
            java.lang.Object r7 = r7.q(r2, r3, r0)     // Catch: java.lang.Throwable -> L58
            dk.a r0 = dk.a.f22275a
            if (r7 != r0) goto L53
            return r0
        L53:
            r0 = r1
        L54:
            r0.A()
            goto L5e
        L58:
            r7 = move-exception
            r0 = r1
        L5a:
            r0.A()
            throw r7
        L5e:
            yj.u r7 = yj.u.f37649a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.f0.f(ek.c):java.lang.Object");
    }
}
