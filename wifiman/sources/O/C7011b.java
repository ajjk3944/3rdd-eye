package o;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh.InterfaceC6945b;
import nh.InterfaceC6949f;
import p.AbstractC7173a;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7011b implements Collection, Set, InterfaceC6945b, InterfaceC6949f {

    /* renamed from: a, reason: collision with root package name */
    private int[] f54959a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f54960b;

    /* renamed from: c, reason: collision with root package name */
    private int f54961c;

    /* renamed from: o.b$a */
    private final class a extends AbstractC7017h {
        public a() {
            super(C7011b.this.i());
        }

        @Override // o.AbstractC7017h
        protected Object d(int i10) {
            return C7011b.this.u(i10);
        }

        @Override // o.AbstractC7017h
        protected void e(int i10) {
            C7011b.this.j(i10);
        }
    }

    public C7011b() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i10;
        int iC;
        int i11 = i();
        if (obj == null) {
            iC = AbstractC7013d.d(this);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iC = AbstractC7013d.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i12 = ~iC;
        if (i11 >= f().length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            int[] iArrF = f();
            Object[] objArrE = e();
            AbstractC7013d.a(this, i13);
            if (i11 != i()) {
                throw new ConcurrentModificationException();
            }
            if (!(f().length == 0)) {
                AbstractC3682n.p(iArrF, f(), 0, 0, iArrF.length, 6, null);
                AbstractC3682n.q(objArrE, e(), 0, 0, objArrE.length, 6, null);
            }
        }
        if (i12 < i11) {
            int i14 = i12 + 1;
            AbstractC3682n.k(f(), f(), i14, i12, i11);
            AbstractC3682n.m(e(), e(), i14, i12, i11);
        }
        if (i11 != i() || i12 >= f().length) {
            throw new ConcurrentModificationException();
        }
        f()[i12] = i10;
        e()[i12] = obj;
        s(i() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        b(i() + elements.size());
        Iterator it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final void b(int i10) {
        int i11 = i();
        if (f().length < i10) {
            int[] iArrF = f();
            Object[] objArrE = e();
            AbstractC7013d.a(this, i10);
            if (i() > 0) {
                AbstractC3682n.p(iArrF, f(), 0, 0, i(), 6, null);
                AbstractC3682n.q(objArrE, e(), 0, 0, i(), 6, null);
            }
        }
        if (i() != i11) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (i() != 0) {
            q(AbstractC7173a.f57281a);
            k(AbstractC7173a.f57283c);
            s(0);
        }
        if (i() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object[] e() {
        return this.f54960b;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && size() == ((Set) obj).size()) {
            try {
                int i10 = i();
                for (int i11 = 0; i11 < i10; i11++) {
                    if (((Set) obj).contains(u(i11))) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int[] f() {
        return this.f54959a;
    }

    public int g() {
        return this.f54961c;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArrF = f();
        int i10 = i();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArrF[i12];
        }
        return i11;
    }

    public final int i() {
        return this.f54961c;
    }

    public final int indexOf(Object obj) {
        return obj == null ? AbstractC7013d.d(this) : AbstractC7013d.c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return i() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a();
    }

    public final Object j(int i10) {
        int i11 = i();
        Object obj = e()[i10];
        if (i11 <= 1) {
            clear();
        } else {
            int i12 = i11 - 1;
            if (f().length <= 8 || i() >= f().length / 3) {
                if (i10 < i12) {
                    int i13 = i10 + 1;
                    AbstractC3682n.k(f(), f(), i10, i13, i11);
                    AbstractC3682n.m(e(), e(), i10, i13, i11);
                }
                e()[i12] = null;
            } else {
                int i14 = i() > 8 ? i() + (i() >> 1) : 8;
                int[] iArrF = f();
                Object[] objArrE = e();
                AbstractC7013d.a(this, i14);
                if (i10 > 0) {
                    AbstractC3682n.p(iArrF, f(), 0, 0, i10, 6, null);
                    AbstractC3682n.q(objArrE, e(), 0, 0, i10, 6, null);
                }
                if (i10 < i12) {
                    int i15 = i10 + 1;
                    AbstractC3682n.k(iArrF, f(), i10, i15, i11);
                    AbstractC3682n.m(objArrE, e(), i10, i15, i11);
                }
            }
            if (i11 != i()) {
                throw new ConcurrentModificationException();
            }
            s(i12);
        }
        return obj;
    }

    public final void k(Object[] objArr) {
        AbstractC6492s.i(objArr, "<set-?>");
        this.f54960b = objArr;
    }

    public final void q(int[] iArr) {
        AbstractC6492s.i(iArr, "<set-?>");
        this.f54959a = iArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        j(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        boolean z10 = false;
        for (int i10 = i() - 1; -1 < i10; i10--) {
            if (!AbstractC3689v.f0(elements, e()[i10])) {
                j(i10);
                z10 = true;
            }
        }
        return z10;
    }

    public final void s(int i10) {
        this.f54961c = i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC3682n.s(this.f54960b, 0, this.f54961c);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i() * 14);
        sb2.append('{');
        int i10 = i();
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object objU = u(i11);
            if (objU != this) {
                sb2.append(objU);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final Object u(int i10) {
        return e()[i10];
    }

    public C7011b(int i10) {
        this.f54959a = AbstractC7173a.f57281a;
        this.f54960b = AbstractC7173a.f57283c;
        if (i10 > 0) {
            AbstractC7013d.a(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        AbstractC6492s.i(array, "array");
        Object[] result = AbstractC7012c.a(array, this.f54961c);
        AbstractC3682n.m(this.f54960b, result, 0, 0, this.f54961c);
        AbstractC6492s.h(result, "result");
        return result;
    }

    public /* synthetic */ C7011b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
