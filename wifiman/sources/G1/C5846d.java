package g1;

import j1.e;
import org.snmp4j.mp.MPv3;

/* renamed from: g1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5846d {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f47467i = new String("FIXED_DIMENSION");

    /* renamed from: j, reason: collision with root package name */
    public static final Object f47468j = new String("WRAP_DIMENSION");

    /* renamed from: k, reason: collision with root package name */
    public static final Object f47469k = new String("SPREAD_DIMENSION");

    /* renamed from: l, reason: collision with root package name */
    public static final Object f47470l = new String("PARENT_DIMENSION");

    /* renamed from: m, reason: collision with root package name */
    public static final Object f47471m = new String("PERCENT_DIMENSION");

    /* renamed from: n, reason: collision with root package name */
    public static final Object f47472n = new String("RATIO_DIMENSION");

    /* renamed from: a, reason: collision with root package name */
    private final int f47473a;

    /* renamed from: b, reason: collision with root package name */
    int f47474b;

    /* renamed from: c, reason: collision with root package name */
    int f47475c;

    /* renamed from: d, reason: collision with root package name */
    float f47476d;

    /* renamed from: e, reason: collision with root package name */
    int f47477e;

    /* renamed from: f, reason: collision with root package name */
    String f47478f;

    /* renamed from: g, reason: collision with root package name */
    Object f47479g;

    /* renamed from: h, reason: collision with root package name */
    boolean f47480h;

    private C5846d() {
        this.f47473a = -2;
        this.f47474b = 0;
        this.f47475c = MPv3.MAX_MESSAGE_ID;
        this.f47476d = 1.0f;
        this.f47477e = 0;
        this.f47478f = null;
        this.f47479g = f47468j;
        this.f47480h = false;
    }

    public static C5846d b(int i10) {
        C5846d c5846d = new C5846d(f47467i);
        c5846d.i(i10);
        return c5846d;
    }

    public static C5846d c(Object obj) {
        C5846d c5846d = new C5846d(f47467i);
        c5846d.j(obj);
        return c5846d;
    }

    public static C5846d d() {
        return new C5846d(f47470l);
    }

    public static C5846d e(Object obj, float f10) {
        C5846d c5846d = new C5846d(f47471m);
        c5846d.p(obj, f10);
        return c5846d;
    }

    public static C5846d f(String str) {
        C5846d c5846d = new C5846d(f47472n);
        c5846d.q(str);
        return c5846d;
    }

    public static C5846d g(Object obj) {
        C5846d c5846d = new C5846d();
        c5846d.s(obj);
        return c5846d;
    }

    public static C5846d h() {
        return new C5846d(f47468j);
    }

    public void a(AbstractC5849g abstractC5849g, j1.e eVar, int i10) {
        String str = this.f47478f;
        if (str != null) {
            eVar.r0(str);
        }
        int i11 = 2;
        if (i10 == 0) {
            if (this.f47480h) {
                eVar.D0(e.b.MATCH_CONSTRAINT);
                Object obj = this.f47479g;
                if (obj == f47468j) {
                    i11 = 1;
                } else if (obj != f47471m) {
                    i11 = 0;
                }
                eVar.E0(i11, this.f47474b, this.f47475c, this.f47476d);
                return;
            }
            int i12 = this.f47474b;
            if (i12 > 0) {
                eVar.L0(i12);
            }
            int i13 = this.f47475c;
            if (i13 < Integer.MAX_VALUE) {
                eVar.I0(i13);
            }
            Object obj2 = this.f47479g;
            if (obj2 == f47468j) {
                eVar.D0(e.b.WRAP_CONTENT);
                return;
            }
            if (obj2 == f47470l) {
                eVar.D0(e.b.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    eVar.D0(e.b.FIXED);
                    eVar.U0(this.f47477e);
                    return;
                }
                return;
            }
        }
        if (this.f47480h) {
            eVar.Q0(e.b.MATCH_CONSTRAINT);
            Object obj3 = this.f47479g;
            if (obj3 == f47468j) {
                i11 = 1;
            } else if (obj3 != f47471m) {
                i11 = 0;
            }
            eVar.R0(i11, this.f47474b, this.f47475c, this.f47476d);
            return;
        }
        int i14 = this.f47474b;
        if (i14 > 0) {
            eVar.K0(i14);
        }
        int i15 = this.f47475c;
        if (i15 < Integer.MAX_VALUE) {
            eVar.H0(i15);
        }
        Object obj4 = this.f47479g;
        if (obj4 == f47468j) {
            eVar.Q0(e.b.WRAP_CONTENT);
            return;
        }
        if (obj4 == f47470l) {
            eVar.Q0(e.b.MATCH_PARENT);
        } else if (obj4 == null) {
            eVar.Q0(e.b.FIXED);
            eVar.z0(this.f47477e);
        }
    }

    public C5846d i(int i10) {
        this.f47479g = null;
        this.f47477e = i10;
        return this;
    }

    public C5846d j(Object obj) {
        this.f47479g = obj;
        if (obj instanceof Integer) {
            this.f47477e = ((Integer) obj).intValue();
            this.f47479g = null;
        }
        return this;
    }

    int k() {
        return this.f47477e;
    }

    public C5846d l(int i10) {
        if (this.f47475c >= 0) {
            this.f47475c = i10;
        }
        return this;
    }

    public C5846d m(Object obj) {
        Object obj2 = f47468j;
        if (obj == obj2 && this.f47480h) {
            this.f47479g = obj2;
            this.f47475c = MPv3.MAX_MESSAGE_ID;
        }
        return this;
    }

    public C5846d n(int i10) {
        if (i10 >= 0) {
            this.f47474b = i10;
        }
        return this;
    }

    public C5846d o(Object obj) {
        if (obj == f47468j) {
            this.f47474b = -2;
        }
        return this;
    }

    public C5846d p(Object obj, float f10) {
        this.f47476d = f10;
        return this;
    }

    public C5846d q(String str) {
        this.f47478f = str;
        return this;
    }

    public C5846d r(int i10) {
        this.f47480h = true;
        if (i10 >= 0) {
            this.f47475c = i10;
        }
        return this;
    }

    public C5846d s(Object obj) {
        this.f47479g = obj;
        this.f47480h = true;
        return this;
    }

    private C5846d(Object obj) {
        this.f47473a = -2;
        this.f47474b = 0;
        this.f47475c = MPv3.MAX_MESSAGE_ID;
        this.f47476d = 1.0f;
        this.f47477e = 0;
        this.f47478f = null;
        this.f47480h = false;
        this.f47479g = obj;
    }
}
