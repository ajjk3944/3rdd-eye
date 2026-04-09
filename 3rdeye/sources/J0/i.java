package J0;

/* compiled from: TextDirectionHeuristicsCompat.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2708a = new c(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final c f2709b = new c(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final c f2710c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f2711d;

    /* compiled from: TextDirectionHeuristicsCompat.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f2712a = new a();
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public final a f2713a;

        public b(a aVar) {
            this.f2713a = aVar;
        }

        public abstract boolean a();

        /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b(java.lang.CharSequence r7, int r8) {
            /*
                r6 = this;
                r0 = 1
                if (r7 == 0) goto L42
                if (r8 < 0) goto L42
                int r1 = r7.length()
                int r1 = r1 - r8
                if (r1 < 0) goto L42
                J0.i$a r1 = r6.f2713a
                if (r1 != 0) goto L15
                boolean r7 = r6.a()
                return r7
            L15:
                r1 = 0
                r2 = 2
                r3 = r1
                r4 = r2
            L19:
                if (r3 >= r8) goto L37
                if (r4 != r2) goto L37
                char r4 = r7.charAt(r3)
                byte r4 = java.lang.Character.getDirectionality(r4)
                J0.i$c r5 = J0.i.f2708a
                if (r4 == 0) goto L34
                if (r4 == r0) goto L32
                if (r4 == r2) goto L32
                switch(r4) {
                    case 14: goto L34;
                    case 15: goto L34;
                    case 16: goto L32;
                    case 17: goto L32;
                    default: goto L30;
                }
            L30:
                r4 = r2
                goto L35
            L32:
                r4 = r1
                goto L35
            L34:
                r4 = r0
            L35:
                int r3 = r3 + r0
                goto L19
            L37:
                if (r4 == 0) goto L41
                if (r4 == r0) goto L40
                boolean r7 = r6.a()
                return r7
            L40:
                return r1
            L41:
                return r0
            L42:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: J0.i.b.b(java.lang.CharSequence, int):boolean");
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    public static class c extends b {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f2714b;

        public c(a aVar, boolean z10) {
            super(aVar);
            this.f2714b = z10;
        }

        @Override // J0.i.b
        public final boolean a() {
            return this.f2714b;
        }
    }

    static {
        a aVar = a.f2712a;
        f2710c = new c(aVar, false);
        f2711d = new c(aVar, true);
    }
}
