package J8;

/* compiled from: PHResult.kt */
/* loaded from: classes3.dex */
public abstract class E<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2813a = new a();

    /* compiled from: PHResult.kt */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(p9.l r5, h9.c r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof J8.D
                if (r0 == 0) goto L13
                r0 = r6
                J8.D r0 = (J8.D) r0
                int r1 = r0.f2812n
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f2812n = r1
                goto L18
            L13:
                J8.D r0 = new J8.D
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f2810l
                g9.a r1 = g9.a.COROUTINE_SUSPENDED
                int r2 = r0.f2812n
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                b9.n.b(r6)     // Catch: java.lang.Exception -> L27
                goto L3d
            L27:
                r5 = move-exception
                goto L43
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                b9.n.b(r6)
                r0.f2812n = r3     // Catch: java.lang.Exception -> L27
                java.lang.Object r6 = r5.invoke(r0)     // Catch: java.lang.Exception -> L27
                if (r6 != r1) goto L3d
                return r1
            L3d:
                J8.E$c r5 = new J8.E$c     // Catch: java.lang.Exception -> L27
                r5.<init>(r6)     // Catch: java.lang.Exception -> L27
                return r5
            L43:
                J8.E$b r6 = new J8.E$b
                r6.<init>(r5)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: J8.E.a.a(p9.l, h9.c):java.lang.Object");
        }
    }

    /* compiled from: PHResult.kt */
    public static final class b extends E {

        /* renamed from: b, reason: collision with root package name */
        public final Exception f2814b;

        public b(Exception exc) {
            this.f2814b = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.l.b(this.f2814b, ((b) obj).f2814b);
        }

        public final int hashCode() {
            Exception exc = this.f2814b;
            if (exc == null) {
                return 0;
            }
            return exc.hashCode();
        }

        public final String toString() {
            return "Failure(error=" + this.f2814b + ")";
        }
    }

    /* compiled from: PHResult.kt */
    public static final class c<T> extends E<T> {

        /* renamed from: b, reason: collision with root package name */
        public final T f2815b;

        public c(T t10) {
            this.f2815b = t10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.l.b(this.f2815b, ((c) obj).f2815b);
        }

        public final int hashCode() {
            T t10 = this.f2815b;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        public final String toString() {
            return "Success(value=" + this.f2815b + ")";
        }
    }
}
