package q0;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final o f23968a = new e(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final o f23969b = new e(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final o f23970c;

    /* renamed from: d, reason: collision with root package name */
    public static final o f23971d;

    /* renamed from: e, reason: collision with root package name */
    public static final o f23972e;

    /* renamed from: f, reason: collision with root package name */
    public static final o f23973f;

    public static class a implements c {

        /* renamed from: b, reason: collision with root package name */
        public static final a f23974b = new a(true);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f23975a;

        public a(boolean z10) {
            this.f23975a = z10;
        }

        @Override // q0.p.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int iA = p.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                        i10++;
                        z10 = z10;
                    } else if (!this.f23975a) {
                        return 1;
                    }
                } else if (this.f23975a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f23975a ? 1 : 0;
            }
            return 2;
        }
    }

    public static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f23976a = new b();

        @Override // q0.p.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int iB = 2;
            while (i10 < i12 && iB == 2) {
                iB = p.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return iB;
        }
    }

    public interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    public static abstract class d implements o {

        /* renamed from: a, reason: collision with root package name */
        public final c f23977a;

        public d(c cVar) {
            this.f23977a = cVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i10, int i11) {
            int iA = this.f23977a.a(charSequence, i10, i11);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }

        @Override // q0.o
        public boolean isRtl(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f23977a == null ? a() : b(charSequence, i10, i11);
        }
    }

    public static class e extends d {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f23978b;

        public e(c cVar, boolean z10) {
            super(cVar);
            this.f23978b = z10;
        }

        @Override // q0.p.d
        public boolean a() {
            return this.f23978b;
        }
    }

    public static class f extends d {

        /* renamed from: b, reason: collision with root package name */
        public static final f f23979b = new f();

        public f() {
            super(null);
        }

        @Override // q0.p.d
        public boolean a() {
            return q.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f23976a;
        f23970c = new e(bVar, false);
        f23971d = new e(bVar, true);
        f23972e = new e(a.f23974b, false);
        f23973f = f.f23979b;
    }

    public static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i10) {
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
