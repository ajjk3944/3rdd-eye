package T;

import e0.InterfaceC5408a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* renamed from: T.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3516b1 implements InterfaceC5408a, Iterable, InterfaceC6944a {

    /* renamed from: b, reason: collision with root package name */
    private int f21032b;

    /* renamed from: d, reason: collision with root package name */
    private int f21034d;

    /* renamed from: e, reason: collision with root package name */
    private int f21035e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21036f;

    /* renamed from: g, reason: collision with root package name */
    private int f21037g;

    /* renamed from: i, reason: collision with root package name */
    private HashMap f21039i;

    /* renamed from: j, reason: collision with root package name */
    private o.z f21040j;

    /* renamed from: a, reason: collision with root package name */
    private int[] f21031a = new int[0];

    /* renamed from: c, reason: collision with root package name */
    private Object[] f21033c = new Object[0];

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f21038h = new ArrayList();

    private final C3520d L(int i10) {
        int i11;
        if (this.f21036f) {
            AbstractC3546o.r("use active SlotWriter to crate an anchor for location instead");
        }
        if (i10 < 0 || i10 >= (i11 = this.f21032b)) {
            return null;
        }
        return AbstractC3522d1.G(this.f21038h, i10, i11);
    }

    public final boolean A() {
        return this.f21036f;
    }

    public final boolean C(int i10, C3520d c3520d) {
        if (this.f21036f) {
            AbstractC3546o.r("Writer is active");
        }
        if (!(i10 >= 0 && i10 < this.f21032b)) {
            AbstractC3546o.r("Invalid group index");
        }
        if (H(c3520d)) {
            int I10 = AbstractC3522d1.I(this.f21031a, i10) + i10;
            int iA = c3520d.a();
            if (i10 <= iA && iA < I10) {
                return true;
            }
        }
        return false;
    }

    public final C3513a1 D() {
        if (this.f21036f) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f21035e++;
        return new C3513a1(this);
    }

    public final C3525e1 G() {
        if (this.f21036f) {
            AbstractC3546o.r("Cannot start a writer when another writer is pending");
        }
        if (!(this.f21035e <= 0)) {
            AbstractC3546o.r("Cannot start a writer when a reader is pending");
        }
        this.f21036f = true;
        this.f21037g++;
        return new C3525e1(this);
    }

    public final boolean H(C3520d c3520d) {
        int iU;
        return c3520d.b() && (iU = AbstractC3522d1.U(this.f21038h, c3520d.a(), this.f21032b)) >= 0 && AbstractC6492s.d(this.f21038h.get(iU), c3520d);
    }

    public final void I(int[] iArr, int i10, Object[] objArr, int i11, ArrayList arrayList, HashMap map, o.z zVar) {
        this.f21031a = iArr;
        this.f21032b = i10;
        this.f21033c = objArr;
        this.f21034d = i11;
        this.f21038h = arrayList;
        this.f21039i = map;
        this.f21040j = zVar;
    }

    public final U J(int i10) {
        C3520d c3520dL;
        HashMap map = this.f21039i;
        if (map == null || (c3520dL = L(i10)) == null) {
            return null;
        }
        return (U) map.get(c3520dL);
    }

    public final C3520d b(int i10) {
        if (this.f21036f) {
            AbstractC3546o.r("use active SlotWriter to create an anchor location instead");
        }
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f21032b) {
            z10 = true;
        }
        if (!z10) {
            B0.a("Parameter index is out of range");
        }
        ArrayList arrayList = this.f21038h;
        int iU = AbstractC3522d1.U(arrayList, i10, this.f21032b);
        if (iU >= 0) {
            return (C3520d) arrayList.get(iU);
        }
        C3520d c3520d = new C3520d(i10);
        arrayList.add(-(iU + 1), c3520d);
        return c3520d;
    }

    public final int e(C3520d c3520d) {
        if (this.f21036f) {
            AbstractC3546o.r("Use active SlotWriter to determine anchor location instead");
        }
        if (!c3520d.b()) {
            B0.a("Anchor refers to a group that was removed");
        }
        return c3520d.a();
    }

    public final void f(C3513a1 c3513a1, HashMap map) {
        if (!(c3513a1.y() == this && this.f21035e > 0)) {
            AbstractC3546o.r("Unexpected reader close()");
        }
        this.f21035e--;
        if (map != null) {
            synchronized (this) {
                try {
                    HashMap map2 = this.f21039i;
                    if (map2 != null) {
                        map2.putAll(map);
                    } else {
                        this.f21039i = map;
                    }
                    Yg.J j10 = Yg.J.f24997a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void g(C3525e1 c3525e1, int[] iArr, int i10, Object[] objArr, int i11, ArrayList arrayList, HashMap map, o.z zVar) {
        if (!(c3525e1.f0() == this && this.f21036f)) {
            B0.a("Unexpected writer close()");
        }
        this.f21036f = false;
        I(iArr, i10, objArr, i11, arrayList, map, zVar);
    }

    public final void i() {
        this.f21040j = new o.z(0, 1, null);
    }

    public boolean isEmpty() {
        return this.f21032b == 0;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new S(this, 0, this.f21032b);
    }

    public final void j() {
        this.f21039i = new HashMap();
    }

    public final boolean k() {
        return this.f21032b > 0 && AbstractC3522d1.D(this.f21031a, 0);
    }

    public final ArrayList q() {
        return this.f21038h;
    }

    public final o.z s() {
        return this.f21040j;
    }

    public final int[] u() {
        return this.f21031a;
    }

    public final int v() {
        return this.f21032b;
    }

    public final Object[] w() {
        return this.f21033c;
    }

    public final int x() {
        return this.f21034d;
    }

    public final HashMap y() {
        return this.f21039i;
    }

    public final int z() {
        return this.f21037g;
    }
}
