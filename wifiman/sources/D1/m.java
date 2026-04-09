package D1;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final l f2802a = new e(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final l f2803b = new e(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final l f2804c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f2805d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f2806e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f2807f;

    private static class a implements c {

        /* renamed from: b, reason: collision with root package name */
        static final a f2808b = new a(true);

        /* renamed from: a, reason: collision with root package name */
        private final boolean f2809a;

        private a(boolean z10) {
            this.f2809a = z10;
        }

        @Override // D1.m.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int iA = m.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                        i10++;
                        z10 = z10;
                    } else if (!this.f2809a) {
                        return 1;
                    }
                } else if (this.f2809a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f2809a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        static final b f2810a = new b();

        private b() {
        }

        @Override // D1.m.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int iB = 2;
            while (i10 < i12 && iB == 2) {
                iB = m.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return iB;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    private static abstract class d implements l {

        /* renamed from: a, reason: collision with root package name */
        private final c f2811a;

        d(c cVar) {
            this.f2811a = cVar;
        }

        private boolean c(CharSequence charSequence, int i10, int i11) {
            int iA = this.f2811a.a(charSequence, i10, i11);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return b();
            }
            return false;
        }

        @Override // D1.l
        public boolean a(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f2811a == null ? b() : c(charSequence, i10, i11);
        }

        protected abstract boolean b();
    }

    private static class e extends d {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f2812b;

        e(c cVar, boolean z10) {
            super(cVar);
            this.f2812b = z10;
        }

        @Override // D1.m.d
        protected boolean b() {
            return this.f2812b;
        }
    }

    private static class f extends d {

        /* renamed from: b, reason: collision with root package name */
        static final f f2813b = new f();

        f() {
            super(null);
        }

        @Override // D1.m.d
        protected boolean b() {
            return n.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f2810a;
        f2804c = new e(bVar, false);
        f2805d = new e(bVar, true);
        f2806e = new e(a.f2808b, false);
        f2807f = f.f2813b;
    }

    static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
