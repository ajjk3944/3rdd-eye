package f2;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f46922a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f46923b;

    /* renamed from: c, reason: collision with root package name */
    private final int f46924c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f46925d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f46926e;

    /* renamed from: f, reason: collision with root package name */
    private final int f46927f;

    /* renamed from: g, reason: collision with root package name */
    private final int f46928g;

    /* renamed from: h, reason: collision with root package name */
    private final int f46929h;

    /* renamed from: i, reason: collision with root package name */
    private final int f46930i;

    /* renamed from: j, reason: collision with root package name */
    private String f46931j;

    /* renamed from: k, reason: collision with root package name */
    private th.d f46932k;

    /* renamed from: l, reason: collision with root package name */
    private Object f46933l;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f46934a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f46935b;

        /* renamed from: d, reason: collision with root package name */
        private String f46937d;

        /* renamed from: e, reason: collision with root package name */
        private th.d f46938e;

        /* renamed from: f, reason: collision with root package name */
        private Object f46939f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f46940g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f46941h;

        /* renamed from: c, reason: collision with root package name */
        private int f46936c = -1;

        /* renamed from: i, reason: collision with root package name */
        private int f46942i = -1;

        /* renamed from: j, reason: collision with root package name */
        private int f46943j = -1;

        /* renamed from: k, reason: collision with root package name */
        private int f46944k = -1;

        /* renamed from: l, reason: collision with root package name */
        private int f46945l = -1;

        public static /* synthetic */ a k(a aVar, int i10, boolean z10, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return aVar.g(i10, z10, z11);
        }

        public final y a() {
            String str = this.f46937d;
            if (str != null) {
                return new y(this.f46934a, this.f46935b, str, this.f46940g, this.f46941h, this.f46942i, this.f46943j, this.f46944k, this.f46945l);
            }
            th.d dVar = this.f46938e;
            if (dVar != null) {
                return new y(this.f46934a, this.f46935b, dVar, this.f46940g, this.f46941h, this.f46942i, this.f46943j, this.f46944k, this.f46945l);
            }
            Object obj = this.f46939f;
            if (obj == null) {
                return new y(this.f46934a, this.f46935b, this.f46936c, this.f46940g, this.f46941h, this.f46942i, this.f46943j, this.f46944k, this.f46945l);
            }
            boolean z10 = this.f46934a;
            boolean z11 = this.f46935b;
            AbstractC6492s.f(obj);
            return new y(z10, z11, obj, this.f46940g, this.f46941h, this.f46942i, this.f46943j, this.f46944k, this.f46945l);
        }

        public final a b(int i10) {
            this.f46942i = i10;
            return this;
        }

        public final a c(int i10) {
            this.f46943j = i10;
            return this;
        }

        public final a d(boolean z10) {
            this.f46934a = z10;
            return this;
        }

        public final a e(int i10) {
            this.f46944k = i10;
            return this;
        }

        public final a f(int i10) {
            this.f46945l = i10;
            return this;
        }

        public final a g(int i10, boolean z10, boolean z11) {
            this.f46936c = i10;
            this.f46937d = null;
            this.f46940g = z10;
            this.f46941h = z11;
            return this;
        }

        public final a h(Object route, boolean z10, boolean z11) {
            AbstractC6492s.i(route, "route");
            this.f46939f = route;
            g(h2.c.b(Vi.w.d(O.b(route.getClass()))), z10, z11);
            return this;
        }

        public final a i(String str, boolean z10, boolean z11) {
            this.f46937d = str;
            this.f46936c = -1;
            this.f46940g = z10;
            this.f46941h = z11;
            return this;
        }

        public final a j(th.d klass, boolean z10, boolean z11) {
            AbstractC6492s.i(klass, "klass");
            this.f46938e = klass;
            this.f46936c = -1;
            this.f46940g = z10;
            this.f46941h = z11;
            return this;
        }

        public final a l(boolean z10) {
            this.f46935b = z10;
            return this;
        }
    }

    public y(boolean z10, boolean z11, int i10, boolean z12, boolean z13, int i11, int i12, int i13, int i14) {
        this.f46922a = z10;
        this.f46923b = z11;
        this.f46924c = i10;
        this.f46925d = z12;
        this.f46926e = z13;
        this.f46927f = i11;
        this.f46928g = i12;
        this.f46929h = i13;
        this.f46930i = i14;
    }

    public final int a() {
        return this.f46927f;
    }

    public final int b() {
        return this.f46928g;
    }

    public final int c() {
        return this.f46929h;
    }

    public final int d() {
        return this.f46930i;
    }

    public final int e() {
        return this.f46924c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f46922a == yVar.f46922a && this.f46923b == yVar.f46923b && this.f46924c == yVar.f46924c && AbstractC6492s.d(this.f46931j, yVar.f46931j) && AbstractC6492s.d(this.f46932k, yVar.f46932k) && AbstractC6492s.d(this.f46933l, yVar.f46933l) && this.f46925d == yVar.f46925d && this.f46926e == yVar.f46926e && this.f46927f == yVar.f46927f && this.f46928g == yVar.f46928g && this.f46929h == yVar.f46929h && this.f46930i == yVar.f46930i;
    }

    public final String f() {
        return this.f46931j;
    }

    public final th.d g() {
        return this.f46932k;
    }

    public final Object h() {
        return this.f46933l;
    }

    public int hashCode() {
        int i10 = (((((j() ? 1 : 0) * 31) + (l() ? 1 : 0)) * 31) + this.f46924c) * 31;
        String str = this.f46931j;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        th.d dVar = this.f46932k;
        int iHashCode2 = (iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        Object obj = this.f46933l;
        return ((((((((((((iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31) + (i() ? 1 : 0)) * 31) + (k() ? 1 : 0)) * 31) + this.f46927f) * 31) + this.f46928g) * 31) + this.f46929h) * 31) + this.f46930i;
    }

    public final boolean i() {
        return this.f46925d;
    }

    public final boolean j() {
        return this.f46922a;
    }

    public final boolean k() {
        return this.f46926e;
    }

    public final boolean l() {
        return this.f46923b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(y.class.getSimpleName());
        sb2.append("(");
        if (this.f46922a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f46923b) {
            sb2.append("restoreState ");
        }
        String str = this.f46931j;
        if ((str != null || this.f46924c != -1) && str != null) {
            sb2.append("popUpTo(");
            String str2 = this.f46931j;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                th.d dVar = this.f46932k;
                if (dVar != null) {
                    sb2.append(dVar);
                } else {
                    Object obj = this.f46933l;
                    if (obj != null) {
                        sb2.append(obj);
                    } else {
                        sb2.append("0x");
                        sb2.append(Integer.toHexString(this.f46924c));
                    }
                }
            }
            if (this.f46925d) {
                sb2.append(" inclusive");
            }
            if (this.f46926e) {
                sb2.append(" saveState");
            }
            sb2.append(")");
        }
        if (this.f46927f != -1 || this.f46928g != -1 || this.f46929h != -1 || this.f46930i != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(this.f46927f));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(this.f46928g));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(this.f46929h));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(this.f46930i));
            sb2.append(")");
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "sb.toString()");
        return string;
    }

    public y(boolean z10, boolean z11, String str, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, r.f46869k.a(str).hashCode(), z12, z13, i10, i11, i12, i13);
        this.f46931j = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(boolean z10, boolean z11, th.d dVar, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, h2.c.b(Vi.w.d(dVar)), z12, z13, i10, i11, i12, i13);
        AbstractC6492s.f(dVar);
        this.f46932k = dVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(boolean z10, boolean z11, Object popUpToRouteObject, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, h2.c.b(Vi.w.d(O.b(popUpToRouteObject.getClass()))), z12, z13, i10, i11, i12, i13);
        AbstractC6492s.i(popUpToRouteObject, "popUpToRouteObject");
        this.f46933l = popUpToRouteObject;
    }
}
