package o1;

import java.util.HashSet;
import java.util.Iterator;
import n1.i;

/* renamed from: o1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7048d {

    /* renamed from: b, reason: collision with root package name */
    public final C7049e f55073b;

    /* renamed from: c, reason: collision with root package name */
    public final b f55074c;

    /* renamed from: d, reason: collision with root package name */
    public C7048d f55075d;

    /* renamed from: g, reason: collision with root package name */
    n1.i f55078g;

    /* renamed from: a, reason: collision with root package name */
    private HashSet f55072a = null;

    /* renamed from: e, reason: collision with root package name */
    public int f55076e = 0;

    /* renamed from: f, reason: collision with root package name */
    int f55077f = -1;

    /* renamed from: o1.d$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f55079a;

        static {
            int[] iArr = new int[b.values().length];
            f55079a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55079a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55079a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55079a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55079a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55079a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55079a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f55079a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f55079a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: o1.d$b */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C7048d(C7049e c7049e, b bVar) {
        this.f55073b = c7049e;
        this.f55074c = bVar;
    }

    public boolean a(C7048d c7048d, int i10) {
        return b(c7048d, i10, -1, false);
    }

    public boolean b(C7048d c7048d, int i10, int i11, boolean z10) {
        if (c7048d == null) {
            l();
            return true;
        }
        if (!z10 && !k(c7048d)) {
            return false;
        }
        this.f55075d = c7048d;
        if (c7048d.f55072a == null) {
            c7048d.f55072a = new HashSet();
        }
        this.f55075d.f55072a.add(this);
        if (i10 > 0) {
            this.f55076e = i10;
        } else {
            this.f55076e = 0;
        }
        this.f55077f = i11;
        return true;
    }

    public int c() {
        C7048d c7048d;
        if (this.f55073b.O() == 8) {
            return 0;
        }
        return (this.f55077f <= -1 || (c7048d = this.f55075d) == null || c7048d.f55073b.O() != 8) ? this.f55076e : this.f55077f;
    }

    public final C7048d d() {
        switch (a.f55079a[this.f55074c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f55073b.f55084D;
            case 3:
                return this.f55073b.f55082B;
            case 4:
                return this.f55073b.f55085E;
            case 5:
                return this.f55073b.f55083C;
            default:
                throw new AssertionError(this.f55074c.name());
        }
    }

    public C7049e e() {
        return this.f55073b;
    }

    public n1.i f() {
        return this.f55078g;
    }

    public C7048d g() {
        return this.f55075d;
    }

    public b h() {
        return this.f55074c;
    }

    public boolean i() {
        HashSet hashSet = this.f55072a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C7048d) it.next()).d().j()) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.f55075d != null;
    }

    public boolean k(C7048d c7048d) {
        if (c7048d == null) {
            return false;
        }
        b bVarH = c7048d.h();
        b bVar = this.f55074c;
        if (bVarH == bVar) {
            return bVar != b.BASELINE || (c7048d.e().S() && e().S());
        }
        switch (a.f55079a[bVar.ordinal()]) {
            case 1:
                return (bVarH == b.BASELINE || bVarH == b.CENTER_X || bVarH == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z10 = bVarH == b.LEFT || bVarH == b.RIGHT;
                if (c7048d.e() instanceof C7052h) {
                    return z10 || bVarH == b.CENTER_X;
                }
                return z10;
            case 4:
            case 5:
                boolean z11 = bVarH == b.TOP || bVarH == b.BOTTOM;
                if (c7048d.e() instanceof C7052h) {
                    return z11 || bVarH == b.CENTER_Y;
                }
                return z11;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f55074c.name());
        }
    }

    public void l() {
        HashSet hashSet;
        C7048d c7048d = this.f55075d;
        if (c7048d != null && (hashSet = c7048d.f55072a) != null) {
            hashSet.remove(this);
        }
        this.f55075d = null;
        this.f55076e = 0;
        this.f55077f = -1;
    }

    public void m(n1.c cVar) {
        n1.i iVar = this.f55078g;
        if (iVar == null) {
            this.f55078g = new n1.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public void n(int i10) {
        if (j()) {
            this.f55077f = i10;
        }
    }

    public String toString() {
        return this.f55073b.r() + ":" + this.f55074c.toString();
    }
}
