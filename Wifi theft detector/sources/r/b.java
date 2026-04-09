package r;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.p;
import z8.z;

/* loaded from: classes.dex */
public final class b implements Collection, Set, m9.a {

    /* renamed from: a, reason: collision with root package name */
    public int[] f24106a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f24107b;

    /* renamed from: c, reason: collision with root package name */
    public int f24108c;

    public final class a extends g {
        public a() {
            super(b.this.g());
        }

        @Override // r.g
        public Object a(int i10) {
            return b.this.u(i10);
        }

        @Override // r.g
        public void c(int i10) {
            b.this.h(i10);
        }
    }

    public b() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i10;
        int iC;
        int iG = g();
        if (obj == null) {
            iC = d.d(this);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iC = d.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i11 = ~iC;
        if (iG >= e().length) {
            int i12 = 8;
            if (iG >= 8) {
                i12 = (iG >> 1) + iG;
            } else if (iG < 4) {
                i12 = 4;
            }
            int[] iArrE = e();
            Object[] objArrD = d();
            d.a(this, i12);
            if (iG != g()) {
                throw new ConcurrentModificationException();
            }
            if (!(e().length == 0)) {
                z8.m.i(iArrE, e(), 0, 0, iArrE.length, 6, null);
                z8.m.j(objArrD, d(), 0, 0, objArrD.length, 6, null);
            }
        }
        if (i11 < iG) {
            int i13 = i11 + 1;
            z8.m.e(e(), e(), i13, i11, iG);
            z8.m.g(d(), d(), i13, i11, iG);
        }
        if (iG != g() || i11 >= e().length) {
            throw new ConcurrentModificationException();
        }
        e()[i11] = i10;
        d()[i11] = obj;
        s(g() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        p.e(elements, "elements");
        c(g() + elements.size());
        Iterator it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final void c(int i10) {
        int iG = g();
        if (e().length < i10) {
            int[] iArrE = e();
            Object[] objArrD = d();
            d.a(this, i10);
            if (g() > 0) {
                z8.m.i(iArrE, e(), 0, 0, g(), 6, null);
                z8.m.j(objArrD, d(), 0, 0, g(), 6, null);
            }
        }
        if (g() != iG) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (g() != 0) {
            j(s.a.f24185a);
            i(s.a.f24187c);
            s(0);
        }
        if (g() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        p.e(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object[] d() {
        return this.f24107b;
    }

    public final int[] e() {
        return this.f24106a;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int iG = g();
            for (int i10 = 0; i10 < iG; i10++) {
                if (!((Set) obj).contains(u(i10))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public int f() {
        return this.f24108c;
    }

    public final int g() {
        return this.f24108c;
    }

    public final Object h(int i10) {
        int i11;
        Object[] objArr;
        int iG = g();
        Object obj = d()[i10];
        if (iG <= 1) {
            clear();
            return obj;
        }
        int i12 = iG - 1;
        if (e().length <= 8 || g() >= e().length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                z8.m.e(e(), e(), i10, i13, iG);
                z8.m.g(d(), d(), i10, i13, iG);
            }
            d()[i12] = null;
        } else {
            int iG2 = g() > 8 ? g() + (g() >> 1) : 8;
            int[] iArrE = e();
            Object[] objArrD = d();
            d.a(this, iG2);
            if (i10 > 0) {
                z8.m.i(iArrE, e(), 0, 0, i10, 6, null);
                objArr = objArrD;
                z8.m.j(objArr, d(), 0, 0, i10, 6, null);
                i11 = i10;
            } else {
                i11 = i10;
                objArr = objArrD;
            }
            if (i11 < i12) {
                int i14 = i11 + 1;
                z8.m.e(iArrE, e(), i11, i14, iG);
                z8.m.g(objArr, d(), i11, i14, iG);
            }
        }
        if (iG != g()) {
            throw new ConcurrentModificationException();
        }
        s(i12);
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArrE = e();
        int iG = g();
        int i10 = 0;
        for (int i11 = 0; i11 < iG; i11++) {
            i10 += iArrE[i11];
        }
        return i10;
    }

    public final void i(Object[] objArr) {
        p.e(objArr, "<set-?>");
        this.f24107b = objArr;
    }

    public final int indexOf(Object obj) {
        return obj == null ? d.d(this) : d.c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return g() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a();
    }

    public final void j(int[] iArr) {
        p.e(iArr, "<set-?>");
        this.f24106a = iArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        h(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        p.e(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        p.e(elements, "elements");
        boolean z10 = false;
        for (int iG = g() - 1; -1 < iG; iG--) {
            if (!z.C(elements, d()[iG])) {
                h(iG);
                z10 = true;
            }
        }
        return z10;
    }

    public final void s(int i10) {
        this.f24108c = i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return z8.m.l(this.f24107b, 0, this.f24108c);
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(g() * 14);
        sb.append('{');
        int iG = g();
        for (int i10 = 0; i10 < iG; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object objU = u(i10);
            if (objU != this) {
                sb.append(objU);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        p.d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final Object u(int i10) {
        return d()[i10];
    }

    public b(int i10) {
        this.f24106a = s.a.f24185a;
        this.f24107b = s.a.f24187c;
        if (i10 > 0) {
            d.a(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        p.e(array, "array");
        Object[] result = c.a(array, this.f24108c);
        z8.m.g(this.f24107b, result, 0, 0, this.f24108c);
        p.d(result, "result");
        return result;
    }

    public /* synthetic */ b(int i10, int i11, kotlin.jvm.internal.i iVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
