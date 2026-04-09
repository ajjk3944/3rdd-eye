package ah;

import Zg.AbstractC3672d;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh.InterfaceC6944a;
import nh.InterfaceC6948e;
import sh.AbstractC7978m;

/* renamed from: ah.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3854d implements Map, Serializable, InterfaceC6948e {

    /* renamed from: n, reason: collision with root package name */
    public static final a f26289n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private static final C3854d f26290o;

    /* renamed from: a, reason: collision with root package name */
    private Object[] f26291a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f26292b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f26293c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f26294d;

    /* renamed from: e, reason: collision with root package name */
    private int f26295e;

    /* renamed from: f, reason: collision with root package name */
    private int f26296f;

    /* renamed from: g, reason: collision with root package name */
    private int f26297g;

    /* renamed from: h, reason: collision with root package name */
    private int f26298h;

    /* renamed from: i, reason: collision with root package name */
    private int f26299i;

    /* renamed from: j, reason: collision with root package name */
    private C3856f f26300j;

    /* renamed from: k, reason: collision with root package name */
    private C3857g f26301k;

    /* renamed from: l, reason: collision with root package name */
    private C3855e f26302l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f26303m;

    /* renamed from: ah.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i10) {
            return Integer.highestOneBit(AbstractC7978m.d(i10, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        public final C3854d e() {
            return C3854d.f26290o;
        }

        private a() {
        }
    }

    /* renamed from: ah.d$b */
    public static final class b extends C1017d implements Iterator, InterfaceC6944a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3854d map) {
            super(map);
            AbstractC6492s.i(map, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public c next() {
            d();
            if (e() >= g().f26296f) {
                throw new NoSuchElementException();
            }
            int iE = e();
            i(iE + 1);
            j(iE);
            c cVar = new c(g(), f());
            h();
            return cVar;
        }

        public final void n(StringBuilder sb2) {
            AbstractC6492s.i(sb2, "sb");
            if (e() >= g().f26296f) {
                throw new NoSuchElementException();
            }
            int iE = e();
            i(iE + 1);
            j(iE);
            Object obj = g().f26291a[f()];
            if (obj == g()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = g().f26292b;
            AbstractC6492s.f(objArr);
            Object obj2 = objArr[f()];
            if (obj2 == g()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            h();
        }

        public final int p() {
            if (e() >= g().f26296f) {
                throw new NoSuchElementException();
            }
            int iE = e();
            i(iE + 1);
            j(iE);
            Object obj = g().f26291a[f()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = g().f26292b;
            AbstractC6492s.f(objArr);
            Object obj2 = objArr[f()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            h();
            return iHashCode2;
        }
    }

    /* renamed from: ah.d$c */
    public static final class c implements Map.Entry, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private final C3854d f26304a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26305b;

        /* renamed from: c, reason: collision with root package name */
        private final int f26306c;

        public c(C3854d map, int i10) {
            AbstractC6492s.i(map, "map");
            this.f26304a = map;
            this.f26305b = i10;
            this.f26306c = map.f26298h;
        }

        private final void b() {
            if (this.f26304a.f26298h != this.f26306c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (AbstractC6492s.d(entry.getKey(), getKey()) && AbstractC6492s.d(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            b();
            return this.f26304a.f26291a[this.f26305b];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            b();
            Object[] objArr = this.f26304a.f26292b;
            AbstractC6492s.f(objArr);
            return objArr[this.f26305b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            b();
            this.f26304a.B();
            Object[] objArrV = this.f26304a.v();
            int i10 = this.f26305b;
            Object obj2 = objArrV[i10];
            objArrV[i10] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* renamed from: ah.d$d, reason: collision with other inner class name */
    public static class C1017d {

        /* renamed from: a, reason: collision with root package name */
        private final C3854d f26307a;

        /* renamed from: b, reason: collision with root package name */
        private int f26308b;

        /* renamed from: c, reason: collision with root package name */
        private int f26309c;

        /* renamed from: d, reason: collision with root package name */
        private int f26310d;

        public C1017d(C3854d map) {
            AbstractC6492s.i(map, "map");
            this.f26307a = map;
            this.f26309c = -1;
            this.f26310d = map.f26298h;
            h();
        }

        public final void d() {
            if (this.f26307a.f26298h != this.f26310d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int e() {
            return this.f26308b;
        }

        public final int f() {
            return this.f26309c;
        }

        public final C3854d g() {
            return this.f26307a;
        }

        public final void h() {
            while (this.f26308b < this.f26307a.f26296f) {
                int[] iArr = this.f26307a.f26293c;
                int i10 = this.f26308b;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f26308b = i10 + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.f26308b < this.f26307a.f26296f;
        }

        public final void i(int i10) {
            this.f26308b = i10;
        }

        public final void j(int i10) {
            this.f26309c = i10;
        }

        public final void remove() {
            d();
            if (this.f26309c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f26307a.B();
            this.f26307a.b1(this.f26309c);
            this.f26309c = -1;
            this.f26310d = this.f26307a.f26298h;
        }
    }

    /* renamed from: ah.d$e */
    public static final class e extends C1017d implements Iterator, InterfaceC6944a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C3854d map) {
            super(map);
            AbstractC6492s.i(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            d();
            if (e() >= g().f26296f) {
                throw new NoSuchElementException();
            }
            int iE = e();
            i(iE + 1);
            j(iE);
            Object obj = g().f26291a[f()];
            h();
            return obj;
        }
    }

    /* renamed from: ah.d$f */
    public static final class f extends C1017d implements Iterator, InterfaceC6944a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C3854d map) {
            super(map);
            AbstractC6492s.i(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            d();
            if (e() >= g().f26296f) {
                throw new NoSuchElementException();
            }
            int iE = e();
            i(iE + 1);
            j(iE);
            Object[] objArr = g().f26292b;
            AbstractC6492s.f(objArr);
            Object obj = objArr[f()];
            h();
            return obj;
        }
    }

    static {
        C3854d c3854d = new C3854d(0);
        c3854d.f26303m = true;
        f26290o = c3854d;
    }

    private C3854d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f26291a = objArr;
        this.f26292b = objArr2;
        this.f26293c = iArr;
        this.f26294d = iArr2;
        this.f26295e = i10;
        this.f26296f = i11;
        this.f26297g = f26289n.d(G0());
    }

    private final void C(boolean z10) {
        int i10;
        Object[] objArr = this.f26292b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f26296f;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f26293c;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f26291a;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f26294d[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        AbstractC3853c.g(this.f26291a, i12, i10);
        if (objArr != null) {
            AbstractC3853c.g(objArr, i12, this.f26296f);
        }
        this.f26296f = i12;
    }

    private final int G0() {
        return this.f26294d.length;
    }

    private final boolean K(Map map) {
        return size() == map.size() && E(map.entrySet());
    }

    private final int P0(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f26297g;
    }

    private final void S(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > C0()) {
            int iE = AbstractC3672d.f25361a.e(C0(), i10);
            this.f26291a = AbstractC3853c.e(this.f26291a, iE);
            Object[] objArr = this.f26292b;
            this.f26292b = objArr != null ? AbstractC3853c.e(objArr, iE) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f26293c, iE);
            AbstractC6492s.h(iArrCopyOf, "copyOf(...)");
            this.f26293c = iArrCopyOf;
            int iC = f26289n.c(iE);
            if (iC > G0()) {
                Z0(iC);
            }
        }
    }

    private final void T(int i10) {
        if (f1(i10)) {
            C(true);
        } else {
            S(this.f26296f + i10);
        }
    }

    private final boolean V0(Collection collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        T(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (W0((Map.Entry) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    private final boolean W0(Map.Entry entry) {
        int iT = t(entry.getKey());
        Object[] objArrV = v();
        if (iT >= 0) {
            objArrV[iT] = entry.getValue();
            return true;
        }
        int i10 = (-iT) - 1;
        if (AbstractC6492s.d(entry.getValue(), objArrV[i10])) {
            return false;
        }
        objArrV[i10] = entry.getValue();
        return true;
    }

    private final boolean X0(int i10) {
        int iP0 = P0(this.f26291a[i10]);
        int i11 = this.f26295e;
        while (true) {
            int[] iArr = this.f26294d;
            if (iArr[iP0] == 0) {
                iArr[iP0] = i10 + 1;
                this.f26293c[i10] = iP0;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            iP0 = iP0 == 0 ? G0() - 1 : iP0 - 1;
        }
    }

    private final void Y0() {
        this.f26298h++;
    }

    private final void Z0(int i10) {
        Y0();
        int i11 = 0;
        if (this.f26296f > size()) {
            C(false);
        }
        this.f26294d = new int[i10];
        this.f26297g = f26289n.d(i10);
        while (i11 < this.f26296f) {
            int i12 = i11 + 1;
            if (!X0(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b1(int i10) {
        AbstractC3853c.f(this.f26291a, i10);
        Object[] objArr = this.f26292b;
        if (objArr != null) {
            AbstractC3853c.f(objArr, i10);
        }
        c1(this.f26293c[i10]);
        this.f26293c[i10] = -1;
        this.f26299i = size() - 1;
        Y0();
    }

    private final void c1(int i10) {
        int iG = AbstractC7978m.g(this.f26295e * 2, G0() / 2);
        int i11 = 0;
        int i12 = i10;
        do {
            i10 = i10 == 0 ? G0() - 1 : i10 - 1;
            i11++;
            if (i11 > this.f26295e) {
                this.f26294d[i12] = 0;
                return;
            }
            int[] iArr = this.f26294d;
            int i13 = iArr[i10];
            if (i13 == 0) {
                iArr[i12] = 0;
                return;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                if (((P0(this.f26291a[i14]) - i10) & (G0() - 1)) >= i11) {
                    this.f26294d[i12] = i13;
                    this.f26293c[i14] = i12;
                }
                iG--;
            }
            i12 = i10;
            i11 = 0;
            iG--;
        } while (iG >= 0);
        this.f26294d[i12] = -1;
    }

    private final int d0(Object obj) {
        int iP0 = P0(obj);
        int i10 = this.f26295e;
        while (true) {
            int i11 = this.f26294d[iP0];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (AbstractC6492s.d(this.f26291a[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iP0 = iP0 == 0 ? G0() - 1 : iP0 - 1;
        }
    }

    private final boolean f1(int i10) {
        int iC0 = C0();
        int i11 = this.f26296f;
        int i12 = iC0 - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= C0() / 4;
    }

    private final int q0(Object obj) {
        int i10 = this.f26296f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f26293c[i10] >= 0) {
                Object[] objArr = this.f26292b;
                AbstractC6492s.f(objArr);
                if (AbstractC6492s.d(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] v() {
        Object[] objArr = this.f26292b;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrD = AbstractC3853c.d(C0());
        this.f26292b = objArrD;
        return objArrD;
    }

    public final void B() {
        if (this.f26303m) {
            throw new UnsupportedOperationException();
        }
    }

    public final int C0() {
        return this.f26291a.length;
    }

    public final boolean E(Collection m10) {
        AbstractC6492s.i(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!J((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public Set E0() {
        C3855e c3855e = this.f26302l;
        if (c3855e != null) {
            return c3855e;
        }
        C3855e c3855e2 = new C3855e(this);
        this.f26302l = c3855e2;
        return c3855e2;
    }

    public final boolean J(Map.Entry entry) {
        AbstractC6492s.i(entry, "entry");
        int iD0 = d0(entry.getKey());
        if (iD0 < 0) {
            return false;
        }
        Object[] objArr = this.f26292b;
        AbstractC6492s.f(objArr);
        return AbstractC6492s.d(objArr[iD0], entry.getValue());
    }

    public Set K0() {
        C3856f c3856f = this.f26300j;
        if (c3856f != null) {
            return c3856f;
        }
        C3856f c3856f2 = new C3856f(this);
        this.f26300j = c3856f2;
        return c3856f2;
    }

    public int M0() {
        return this.f26299i;
    }

    public Collection N0() {
        C3857g c3857g = this.f26301k;
        if (c3857g != null) {
            return c3857g;
        }
        C3857g c3857g2 = new C3857g(this);
        this.f26301k = c3857g2;
        return c3857g2;
    }

    public final e U0() {
        return new e(this);
    }

    public final boolean a1(Map.Entry entry) {
        AbstractC6492s.i(entry, "entry");
        B();
        int iD0 = d0(entry.getKey());
        if (iD0 < 0) {
            return false;
        }
        Object[] objArr = this.f26292b;
        AbstractC6492s.f(objArr);
        if (!AbstractC6492s.d(objArr[iD0], entry.getValue())) {
            return false;
        }
        b1(iD0);
        return true;
    }

    public final b b0() {
        return new b(this);
    }

    @Override // java.util.Map
    public void clear() {
        B();
        int i10 = this.f26296f - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f26293c;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f26294d[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        AbstractC3853c.g(this.f26291a, 0, this.f26296f);
        Object[] objArr = this.f26292b;
        if (objArr != null) {
            AbstractC3853c.g(objArr, 0, this.f26296f);
        }
        this.f26299i = 0;
        this.f26296f = 0;
        Y0();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return d0(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return q0(obj) >= 0;
    }

    public final boolean d1(Object obj) {
        B();
        int iD0 = d0(obj);
        if (iD0 < 0) {
            return false;
        }
        b1(iD0);
        return true;
    }

    public final boolean e1(Object obj) {
        B();
        int iQ0 = q0(obj);
        if (iQ0 < 0) {
            return false;
        }
        b1(iQ0);
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return E0();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && K((Map) obj));
    }

    public final f g1() {
        return new f(this);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int iD0 = d0(obj);
        if (iD0 < 0) {
            return null;
        }
        Object[] objArr = this.f26292b;
        AbstractC6492s.f(objArr);
        return objArr[iD0];
    }

    @Override // java.util.Map
    public int hashCode() {
        b bVarB0 = b0();
        int iP = 0;
        while (bVarB0.hasNext()) {
            iP += bVarB0.p();
        }
        return iP;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return K0();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        B();
        int iT = t(obj);
        Object[] objArrV = v();
        if (iT >= 0) {
            objArrV[iT] = obj2;
            return null;
        }
        int i10 = (-iT) - 1;
        Object obj3 = objArrV[i10];
        objArrV[i10] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        AbstractC6492s.i(from, "from");
        B();
        V0(from.entrySet());
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        B();
        int iD0 = d0(obj);
        if (iD0 < 0) {
            return null;
        }
        Object[] objArr = this.f26292b;
        AbstractC6492s.f(objArr);
        Object obj2 = objArr[iD0];
        b1(iD0);
        return obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return M0();
    }

    public final int t(Object obj) {
        B();
        while (true) {
            int iP0 = P0(obj);
            int iG = AbstractC7978m.g(this.f26295e * 2, G0() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f26294d[iP0];
                if (i11 <= 0) {
                    if (this.f26296f < C0()) {
                        int i12 = this.f26296f;
                        int i13 = i12 + 1;
                        this.f26296f = i13;
                        this.f26291a[i12] = obj;
                        this.f26293c[i12] = iP0;
                        this.f26294d[iP0] = i13;
                        this.f26299i = size() + 1;
                        Y0();
                        if (i10 > this.f26295e) {
                            this.f26295e = i10;
                        }
                        return i12;
                    }
                    T(1);
                } else {
                    if (AbstractC6492s.d(this.f26291a[i11 - 1], obj)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > iG) {
                        Z0(G0() * 2);
                        break;
                    }
                    iP0 = iP0 == 0 ? G0() - 1 : iP0 - 1;
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b bVarB0 = b0();
        int i10 = 0;
        while (bVarB0.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            bVarB0.n(sb2);
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return N0();
    }

    public final Map y() {
        B();
        this.f26303m = true;
        if (size() > 0) {
            return this;
        }
        C3854d c3854d = f26290o;
        AbstractC6492s.g(c3854d, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c3854d;
    }

    public C3854d() {
        this(8);
    }

    public C3854d(int i10) {
        this(AbstractC3853c.d(i10), null, new int[i10], new int[f26289n.c(i10)], 2, 0);
    }
}
