package gt;

/* loaded from: classes.dex */
public class h implements ar.a {

    /* renamed from: a, reason: collision with root package name */
    public final l f9649a;

    /* renamed from: d, reason: collision with root package name */
    public final ar.a f9650d;

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f9651g;

    public h(l lVar, ar.a aVar) {
        if (lVar == null) {
            e(0);
            throw null;
        }
        this.f9651g = k.NOT_COMPUTED;
        this.f9649a = lVar;
        this.f9650d = aVar;
    }

    public static /* synthetic */ void e(int i10) {
        String str = (i10 == 2 || i10 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "computable";
        } else if (i10 == 2 || i10 == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 2) {
            objArr[1] = "recursionDetected";
        } else if (i10 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i10 != 2 && i10 != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:14:0x0024, B:16:0x0028, B:18:0x0035, B:19:0x0038, B:21:0x003c, B:23:0x0045, B:24:0x0048, B:28:0x0057, B:30:0x005d, B:32:0x0063, B:33:0x006a, B:34:0x0071, B:35:0x0072, B:36:0x0078, B:25:0x004a), top: B:39:0x0011, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:14:0x0024, B:16:0x0028, B:18:0x0035, B:19:0x0038, B:21:0x003c, B:23:0x0045, B:24:0x0048, B:28:0x0057, B:30:0x005d, B:32:0x0063, B:33:0x006a, B:34:0x0071, B:35:0x0072, B:36:0x0078, B:25:0x004a), top: B:39:0x0011, inners: #1 }] */
    @Override // ar.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c() throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f9651g
            boolean r1 = r0 instanceof gt.k
            if (r1 != 0) goto La
            rt.k.j(r0)
            return r0
        La:
            gt.l r0 = r4.f9649a
            gt.n r0 = r0.f9658a
            r0.lock()
            java.lang.Object r0 = r4.f9651g     // Catch: java.lang.Throwable -> L22
            boolean r1 = r0 instanceof gt.k     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L24
            rt.k.j(r0)     // Catch: java.lang.Throwable -> L22
        L1a:
            gt.l r1 = r4.f9649a
            gt.n r1 = r1.f9658a
            r1.unlock()
            return r0
        L22:
            r0 = move-exception
            goto L79
        L24:
            gt.k r1 = gt.k.COMPUTING     // Catch: java.lang.Throwable -> L22
            if (r0 != r1) goto L38
            gt.k r2 = gt.k.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L22
            r4.f9651g = r2     // Catch: java.lang.Throwable -> L22
            r2 = 1
            ab.g r2 = r4.i(r2)     // Catch: java.lang.Throwable -> L22
            boolean r3 = r2.f308d     // Catch: java.lang.Throwable -> L22
            if (r3 != 0) goto L38
            java.lang.Object r0 = r2.f309g     // Catch: java.lang.Throwable -> L22
            goto L1a
        L38:
            gt.k r2 = gt.k.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L22
            if (r0 != r2) goto L48
            r0 = 0
            ab.g r0 = r4.i(r0)     // Catch: java.lang.Throwable -> L22
            boolean r2 = r0.f308d     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L48
            java.lang.Object r0 = r0.f309g     // Catch: java.lang.Throwable -> L22
            goto L1a
        L48:
            r4.f9651g = r1     // Catch: java.lang.Throwable -> L22
            ar.a r0 = r4.f9650d     // Catch: java.lang.Throwable -> L56
            java.lang.Object r0 = r0.c()     // Catch: java.lang.Throwable -> L56
            r4.g(r0)     // Catch: java.lang.Throwable -> L56
            r4.f9651g = r0     // Catch: java.lang.Throwable -> L56
            goto L1a
        L56:
            r0 = move-exception
            boolean r1 = rt.k.h(r0)     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L72
            java.lang.Object r1 = r4.f9651g     // Catch: java.lang.Throwable -> L22
            gt.k r2 = gt.k.COMPUTING     // Catch: java.lang.Throwable -> L22
            if (r1 != r2) goto L6a
            rt.j r1 = new rt.j     // Catch: java.lang.Throwable -> L22
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L22
            r4.f9651g = r1     // Catch: java.lang.Throwable -> L22
        L6a:
            gt.l r1 = r4.f9649a     // Catch: java.lang.Throwable -> L22
            gt.a r1 = r1.f9659b     // Catch: java.lang.Throwable -> L22
            r1.getClass()     // Catch: java.lang.Throwable -> L22
            throw r0     // Catch: java.lang.Throwable -> L22
        L72:
            gt.k r1 = gt.k.NOT_COMPUTED     // Catch: java.lang.Throwable -> L22
            r4.f9651g = r1     // Catch: java.lang.Throwable -> L22
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L22
            throw r0     // Catch: java.lang.Throwable -> L22
        L79:
            gt.l r1 = r4.f9649a
            gt.n r1 = r1.f9658a
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gt.h.c():java.lang.Object");
    }

    public ab.g i(boolean z10) {
        ab.g gVarD = this.f9649a.d(null, "in a lazy value");
        if (gVarD != null) {
            return gVarD;
        }
        e(2);
        throw null;
    }

    public void g(Object obj) {
    }
}
