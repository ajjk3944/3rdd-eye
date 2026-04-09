package z1;

import h9.i;
import p9.l;
import w1.q;
import w1.r;
import y1.p;

/* compiled from: SupportSQLiteConnectionPool.android.kt */
/* renamed from: z1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5854c implements r, p {

    /* renamed from: a, reason: collision with root package name */
    public final C5852a f48412a;

    /* compiled from: SupportSQLiteConnectionPool.android.kt */
    /* renamed from: z1.c$a */
    public final class a<T> implements q<T>, p {
        public a() {
        }

        @Override // w1.g
        public final Object a(String str, l lVar, h9.c cVar) {
            return C5854c.this.a(str, lVar, cVar);
        }

        @Override // y1.p
        public final E1.a d() {
            return C5854c.this.f48412a;
        }
    }

    /* compiled from: SupportSQLiteConnectionPool.android.kt */
    /* renamed from: z1.c$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48414a;

        static {
            int[] iArr = new int[r.a.values().length];
            try {
                iArr[r.a.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.a.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.a.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f48414a = iArr;
        }
    }

    public C5854c(C5852a c5852a) {
        this.f48412a = c5852a;
    }

    @Override // w1.g
    public final Object a(String str, l lVar, h9.c cVar) throws Exception {
        AbstractC5856e abstractC5856eK0 = this.f48412a.K0(str);
        try {
            Object objInvoke = lVar.invoke(abstractC5856eK0);
            abstractC5856eK0.close();
            return objInvoke;
        } finally {
        }
    }

    @Override // w1.r
    public final Object b(i iVar) {
        return Boolean.valueOf(this.f48412a.f48410b.s0());
    }

    @Override // w1.r
    public final Object c(r.a aVar, p9.p pVar, i iVar) {
        return e(aVar, pVar, iVar);
    }

    @Override // y1.p
    public final E1.a d() {
        return this.f48412a;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(w1.r.a r5, p9.p r6, h9.c r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof z1.C5855d
            if (r0 == 0) goto L13
            r0 = r7
            z1.d r0 = (z1.C5855d) r0
            int r1 = r0.f48419p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48419p = r1
            goto L18
        L13:
            z1.d r0 = new z1.d
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f48417n
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f48419p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            F1.b r5 = r0.f48416m
            z1.c r6 = r0.f48415l
            b9.n.b(r7)     // Catch: java.lang.Throwable -> L2b
            goto L76
        L2b:
            r7 = move-exception
            goto L8b
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            b9.n.b(r7)
            z1.a r7 = r4.f48412a
            F1.b r7 = r7.f48410b
            r7.s0()
            int[] r2 = z1.C5854c.b.f48414a
            int r5 = r5.ordinal()
            r5 = r2[r5]
            if (r5 == r3) goto L5d
            r2 = 2
            if (r5 == r2) goto L59
            r2 = 3
            if (r5 != r2) goto L53
            r7.r()
            goto L60
        L53:
            b9.j r5 = new b9.j
            r5.<init>()
            throw r5
        L59:
            r7.Y()
            goto L60
        L5d:
            r7.J()
        L60:
            z1.c$a r5 = new z1.c$a     // Catch: java.lang.Throwable -> L86
            r5.<init>()     // Catch: java.lang.Throwable -> L86
            r0.f48415l = r4     // Catch: java.lang.Throwable -> L86
            r0.f48416m = r7     // Catch: java.lang.Throwable -> L86
            r0.f48419p = r3     // Catch: java.lang.Throwable -> L86
            java.lang.Object r5 = r6.invoke(r5, r0)     // Catch: java.lang.Throwable -> L86
            if (r5 != r1) goto L72
            return r1
        L72:
            r6 = r7
            r7 = r5
            r5 = r6
            r6 = r4
        L76:
            r5.u()     // Catch: java.lang.Throwable -> L2b
            r5.v()
            boolean r5 = r5.s0()
            if (r5 != 0) goto L85
            r6.getClass()
        L85:
            return r7
        L86:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r6
            r6 = r4
        L8b:
            r5.v()
            boolean r5 = r5.s0()
            if (r5 != 0) goto L97
            r6.getClass()
        L97:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.C5854c.e(w1.r$a, p9.p, h9.c):java.lang.Object");
    }
}
