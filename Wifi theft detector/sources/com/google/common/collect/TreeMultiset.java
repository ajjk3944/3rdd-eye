package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Multisets;
import com.google.common.collect.e0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import org.xbill.DNS.TTL;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class TreeMultiset<E> extends com.google.common.collect.f implements Serializable {

    @GwtIncompatible
    private static final long serialVersionUID = 1;

    /* renamed from: d, reason: collision with root package name */
    public final transient f f11993d;

    /* renamed from: e, reason: collision with root package name */
    public final transient GeneralRange f11994e;

    /* renamed from: f, reason: collision with root package name */
    public final transient e f11995f;

    public enum Aggregate {
        SIZE { // from class: com.google.common.collect.TreeMultiset.Aggregate.1
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public int f(e eVar) {
                return eVar.f12009b;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public long g(e eVar) {
                if (eVar == null) {
                    return 0L;
                }
                return eVar.f12011d;
            }
        },
        DISTINCT { // from class: com.google.common.collect.TreeMultiset.Aggregate.2
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public int f(e eVar) {
                return 1;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public long g(e eVar) {
                if (eVar == null) {
                    return 0L;
                }
                return eVar.f12010c;
            }
        };

        public abstract int f(e eVar);

        public abstract long g(e eVar);

        /* synthetic */ Aggregate(a aVar) {
            this();
        }
    }

    public class a extends Multisets.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f11999a;

        public a(e eVar) {
            this.f11999a = eVar;
        }

        @Override // com.google.common.collect.e0.a
        public Object d() {
            return this.f11999a.x();
        }

        @Override // com.google.common.collect.e0.a
        public int getCount() {
            int iW = this.f11999a.w();
            return iW == 0 ? TreeMultiset.this.r(d()) : iW;
        }
    }

    public class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public e f12001a;

        /* renamed from: b, reason: collision with root package name */
        public e0.a f12002b;

        public b() {
            this.f12001a = TreeMultiset.this.H();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e0.a next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            TreeMultiset treeMultiset = TreeMultiset.this;
            e eVar = this.f12001a;
            Objects.requireNonNull(eVar);
            e0.a aVarL = treeMultiset.L(eVar);
            this.f12002b = aVarL;
            if (this.f12001a.L() == TreeMultiset.this.f11995f) {
                this.f12001a = null;
                return aVarL;
            }
            this.f12001a = this.f12001a.L();
            return aVarL;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12001a == null) {
                return false;
            }
            if (!TreeMultiset.this.f11994e.n(this.f12001a.x())) {
                return true;
            }
            this.f12001a = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.base.g.s(this.f12002b != null, "no calls to next() since the last call to remove()");
            TreeMultiset.this.l(this.f12002b.d(), 0);
            this.f12002b = null;
        }
    }

    public class c implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public e f12004a;

        /* renamed from: b, reason: collision with root package name */
        public e0.a f12005b = null;

        public c() {
            this.f12004a = TreeMultiset.this.I();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e0.a next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Objects.requireNonNull(this.f12004a);
            e0.a aVarL = TreeMultiset.this.L(this.f12004a);
            this.f12005b = aVarL;
            if (this.f12004a.z() == TreeMultiset.this.f11995f) {
                this.f12004a = null;
                return aVarL;
            }
            this.f12004a = this.f12004a.z();
            return aVarL;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12004a == null) {
                return false;
            }
            if (!TreeMultiset.this.f11994e.o(this.f12004a.x())) {
                return true;
            }
            this.f12004a = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.base.g.s(this.f12005b != null, "no calls to next() since the last call to remove()");
            TreeMultiset.this.l(this.f12005b.d(), 0);
            this.f12005b = null;
        }
    }

    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12007a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f12007a = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12007a[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public Object f12017a;

        public f() {
        }

        public void a(Object obj, Object obj2) {
            if (this.f12017a != obj) {
                throw new ConcurrentModificationException();
            }
            this.f12017a = obj2;
        }

        public void b() {
            this.f12017a = null;
        }

        public Object c() {
            return this.f12017a;
        }

        public /* synthetic */ f(a aVar) {
            this();
        }
    }

    public TreeMultiset(f fVar, GeneralRange generalRange, e eVar) {
        super(generalRange.d());
        this.f11993d = fVar;
        this.f11994e = generalRange;
        this.f11995f = eVar;
    }

    public static int G(e eVar) {
        if (eVar == null) {
            return 0;
        }
        return eVar.f12010c;
    }

    public static void J(e eVar, e eVar2) {
        eVar.f12016i = eVar2;
        eVar2.f12015h = eVar;
    }

    public static void K(e eVar, e eVar2, e eVar3) {
        J(eVar, eVar2);
        J(eVar2, eVar3);
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        n0.a(com.google.common.collect.f.class, "comparator").b(this, comparator);
        n0.a(TreeMultiset.class, "range").b(this, GeneralRange.a(comparator));
        n0.a(TreeMultiset.class, "rootReference").b(this, new f(null));
        e eVar = new e();
        n0.a(TreeMultiset.class, "header").b(this, eVar);
        J(eVar, eVar);
        n0.f(this, objectInputStream);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(k().comparator());
        n0.k(this, objectOutputStream);
    }

    public final long D(Aggregate aggregate, e eVar) {
        long jG;
        long jD;
        if (eVar == null) {
            return 0L;
        }
        int iCompare = comparator().compare(f0.a(this.f11994e.j()), eVar.x());
        if (iCompare > 0) {
            return D(aggregate, eVar.f12014g);
        }
        if (iCompare == 0) {
            int i10 = d.f12007a[this.f11994e.i().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return aggregate.g(eVar.f12014g);
                }
                throw new AssertionError();
            }
            jG = aggregate.f(eVar);
            jD = aggregate.g(eVar.f12014g);
        } else {
            jG = aggregate.g(eVar.f12014g) + aggregate.f(eVar);
            jD = D(aggregate, eVar.f12013f);
        }
        return jG + jD;
    }

    public final long E(Aggregate aggregate, e eVar) {
        long jG;
        long jE;
        if (eVar == null) {
            return 0L;
        }
        int iCompare = comparator().compare(f0.a(this.f11994e.h()), eVar.x());
        if (iCompare < 0) {
            return E(aggregate, eVar.f12013f);
        }
        if (iCompare == 0) {
            int i10 = d.f12007a[this.f11994e.g().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return aggregate.g(eVar.f12013f);
                }
                throw new AssertionError();
            }
            jG = aggregate.f(eVar);
            jE = aggregate.g(eVar.f12013f);
        } else {
            jG = aggregate.g(eVar.f12013f) + aggregate.f(eVar);
            jE = E(aggregate, eVar.f12014g);
        }
        return jG + jE;
    }

    public final long F(Aggregate aggregate) {
        e eVar = (e) this.f11993d.c();
        long jG = aggregate.g(eVar);
        if (this.f11994e.k()) {
            jG -= E(aggregate, eVar);
        }
        return this.f11994e.l() ? jG - D(aggregate, eVar) : jG;
    }

    public final e H() {
        e eVarL;
        e eVar = (e) this.f11993d.c();
        if (eVar == null) {
            return null;
        }
        if (this.f11994e.k()) {
            Object objA = f0.a(this.f11994e.h());
            eVarL = eVar.s(comparator(), objA);
            if (eVarL == null) {
                return null;
            }
            if (this.f11994e.g() == BoundType.OPEN && comparator().compare(objA, eVarL.x()) == 0) {
                eVarL = eVarL.L();
            }
        } else {
            eVarL = this.f11995f.L();
        }
        if (eVarL == this.f11995f || !this.f11994e.e(eVarL.x())) {
            return null;
        }
        return eVarL;
    }

    public final e I() {
        e eVarZ;
        e eVar = (e) this.f11993d.c();
        if (eVar == null) {
            return null;
        }
        if (this.f11994e.l()) {
            Object objA = f0.a(this.f11994e.j());
            eVarZ = eVar.v(comparator(), objA);
            if (eVarZ == null) {
                return null;
            }
            if (this.f11994e.i() == BoundType.OPEN && comparator().compare(objA, eVarZ.x()) == 0) {
                eVarZ = eVarZ.z();
            }
        } else {
            eVarZ = this.f11995f.z();
        }
        if (eVarZ == this.f11995f || !this.f11994e.e(eVarZ.x())) {
            return null;
        }
        return eVarZ;
    }

    public final e0.a L(e eVar) {
        return new a(eVar);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.r0
    public /* bridge */ /* synthetic */ r0 a(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return super.a(obj, boundType, obj2, boundType2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (this.f11994e.k() || this.f11994e.l()) {
            Iterators.c(j());
            return;
        }
        e eVarL = this.f11995f.L();
        while (true) {
            e eVar = this.f11995f;
            if (eVarL == eVar) {
                J(eVar, eVar);
                this.f11993d.b();
                return;
            }
            e eVarL2 = eVarL.L();
            eVarL.f12009b = 0;
            eVarL.f12013f = null;
            eVarL.f12014g = null;
            eVarL.f12015h = null;
            eVarL.f12016i = null;
            eVarL = eVarL2;
        }
    }

    @Override // com.google.common.collect.f, com.google.common.collect.r0, com.google.common.collect.p0
    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.e0
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.e0
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.r0
    public /* bridge */ /* synthetic */ e0.a firstEntry() {
        return super.firstEntry();
    }

    @Override // com.google.common.collect.d
    public int h() {
        return com.google.common.primitives.c.d(F(Aggregate.DISTINCT));
    }

    @Override // com.google.common.collect.d
    public Iterator i() {
        return Multisets.e(j());
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return Multisets.h(this);
    }

    @Override // com.google.common.collect.d
    public Iterator j() {
        return new b();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.d, com.google.common.collect.e0
    public /* bridge */ /* synthetic */ NavigableSet k() {
        return super.k();
    }

    @Override // com.google.common.collect.e0
    public int l(Object obj, int i10) {
        j.b(i10, "count");
        if (!this.f11994e.e(obj)) {
            com.google.common.base.g.d(i10 == 0);
            return 0;
        }
        e eVar = (e) this.f11993d.c();
        if (eVar == null) {
            if (i10 > 0) {
                n(obj, i10);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.f11993d.a(eVar, eVar.K(comparator(), obj, i10, iArr));
        return iArr[0];
    }

    @Override // com.google.common.collect.f, com.google.common.collect.r0
    public /* bridge */ /* synthetic */ e0.a lastEntry() {
        return super.lastEntry();
    }

    @Override // com.google.common.collect.d, com.google.common.collect.e0
    public int m(Object obj, int i10) {
        j.b(i10, "occurrences");
        if (i10 == 0) {
            return r(obj);
        }
        e eVar = (e) this.f11993d.c();
        int[] iArr = new int[1];
        try {
            if (this.f11994e.e(obj) && eVar != null) {
                this.f11993d.a(eVar, eVar.E(comparator(), obj, i10, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.d, com.google.common.collect.e0
    public int n(Object obj, int i10) {
        j.b(i10, "occurrences");
        if (i10 == 0) {
            return r(obj);
        }
        com.google.common.base.g.d(this.f11994e.e(obj));
        e eVar = (e) this.f11993d.c();
        if (eVar != null) {
            int[] iArr = new int[1];
            this.f11993d.a(eVar, eVar.o(comparator(), obj, i10, iArr));
            return iArr[0];
        }
        comparator().compare(obj, obj);
        e eVar2 = new e(obj, i10);
        e eVar3 = this.f11995f;
        K(eVar3, eVar2, eVar3);
        this.f11993d.a(eVar, eVar2);
        return 0;
    }

    @Override // com.google.common.collect.f, com.google.common.collect.r0
    public /* bridge */ /* synthetic */ r0 o() {
        return super.o();
    }

    @Override // com.google.common.collect.d, com.google.common.collect.e0
    public boolean p(Object obj, int i10, int i11) {
        j.b(i11, "newCount");
        j.b(i10, "oldCount");
        com.google.common.base.g.d(this.f11994e.e(obj));
        e eVar = (e) this.f11993d.c();
        if (eVar != null) {
            int[] iArr = new int[1];
            this.f11993d.a(eVar, eVar.J(comparator(), obj, i10, i11, iArr));
            return iArr[0] == i10;
        }
        if (i10 != 0) {
            return false;
        }
        if (i11 > 0) {
            n(obj, i11);
        }
        return true;
    }

    @Override // com.google.common.collect.f, com.google.common.collect.r0
    public /* bridge */ /* synthetic */ e0.a pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.r0
    public /* bridge */ /* synthetic */ e0.a pollLastEntry() {
        return super.pollLastEntry();
    }

    @Override // com.google.common.collect.r0
    public r0 q(Object obj, BoundType boundType) {
        return new TreeMultiset(this.f11993d, this.f11994e.m(GeneralRange.p(comparator(), obj, boundType)), this.f11995f);
    }

    @Override // com.google.common.collect.e0
    public int r(Object obj) {
        try {
            e eVar = (e) this.f11993d.c();
            if (this.f11994e.e(obj) && eVar != null) {
                return eVar.t(comparator(), obj);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.e0
    public int size() {
        return com.google.common.primitives.c.d(F(Aggregate.SIZE));
    }

    @Override // com.google.common.collect.r0
    public r0 t(Object obj, BoundType boundType) {
        return new TreeMultiset(this.f11993d, this.f11994e.m(GeneralRange.f(comparator(), obj, boundType)), this.f11995f);
    }

    @Override // com.google.common.collect.f
    public Iterator v() {
        return new c();
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final Object f12008a;

        /* renamed from: b, reason: collision with root package name */
        public int f12009b;

        /* renamed from: c, reason: collision with root package name */
        public int f12010c;

        /* renamed from: d, reason: collision with root package name */
        public long f12011d;

        /* renamed from: e, reason: collision with root package name */
        public int f12012e;

        /* renamed from: f, reason: collision with root package name */
        public e f12013f;

        /* renamed from: g, reason: collision with root package name */
        public e f12014g;

        /* renamed from: h, reason: collision with root package name */
        public e f12015h;

        /* renamed from: i, reason: collision with root package name */
        public e f12016i;

        public e(Object obj, int i10) {
            com.google.common.base.g.d(i10 > 0);
            this.f12008a = obj;
            this.f12009b = i10;
            this.f12011d = i10;
            this.f12010c = 1;
            this.f12012e = 1;
            this.f12013f = null;
            this.f12014g = null;
        }

        public static long M(e eVar) {
            if (eVar == null) {
                return 0L;
            }
            return eVar.f12011d;
        }

        public static int y(e eVar) {
            if (eVar == null) {
                return 0;
            }
            return eVar.f12012e;
        }

        public final e A() {
            int iR = r();
            if (iR == -2) {
                Objects.requireNonNull(this.f12014g);
                if (this.f12014g.r() > 0) {
                    this.f12014g = this.f12014g.I();
                }
                return H();
            }
            if (iR != 2) {
                C();
                return this;
            }
            Objects.requireNonNull(this.f12013f);
            if (this.f12013f.r() < 0) {
                this.f12013f = this.f12013f.H();
            }
            return I();
        }

        public final void B() {
            D();
            C();
        }

        public final void C() {
            this.f12012e = Math.max(y(this.f12013f), y(this.f12014g)) + 1;
        }

        public final void D() {
            this.f12010c = TreeMultiset.G(this.f12013f) + 1 + TreeMultiset.G(this.f12014g);
            this.f12011d = this.f12009b + M(this.f12013f) + M(this.f12014g);
        }

        public e E(Comparator comparator, Object obj, int i10, int[] iArr) {
            int iCompare = comparator.compare(obj, x());
            if (iCompare < 0) {
                e eVar = this.f12013f;
                if (eVar == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f12013f = eVar.E(comparator, obj, i10, iArr);
                int i11 = iArr[0];
                if (i11 > 0) {
                    if (i10 >= i11) {
                        this.f12010c--;
                        this.f12011d -= i11;
                    } else {
                        this.f12011d -= i10;
                    }
                }
                return i11 == 0 ? this : A();
            }
            if (iCompare <= 0) {
                int i12 = this.f12009b;
                iArr[0] = i12;
                if (i10 >= i12) {
                    return u();
                }
                this.f12009b = i12 - i10;
                this.f12011d -= i10;
                return this;
            }
            e eVar2 = this.f12014g;
            if (eVar2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.f12014g = eVar2.E(comparator, obj, i10, iArr);
            int i13 = iArr[0];
            if (i13 > 0) {
                if (i10 >= i13) {
                    this.f12010c--;
                    this.f12011d -= i13;
                } else {
                    this.f12011d -= i10;
                }
            }
            return A();
        }

        public final e F(e eVar) {
            e eVar2 = this.f12014g;
            if (eVar2 == null) {
                return this.f12013f;
            }
            this.f12014g = eVar2.F(eVar);
            this.f12010c--;
            this.f12011d -= eVar.f12009b;
            return A();
        }

        public final e G(e eVar) {
            e eVar2 = this.f12013f;
            if (eVar2 == null) {
                return this.f12014g;
            }
            this.f12013f = eVar2.G(eVar);
            this.f12010c--;
            this.f12011d -= eVar.f12009b;
            return A();
        }

        public final e H() {
            com.google.common.base.g.r(this.f12014g != null);
            e eVar = this.f12014g;
            this.f12014g = eVar.f12013f;
            eVar.f12013f = this;
            eVar.f12011d = this.f12011d;
            eVar.f12010c = this.f12010c;
            B();
            eVar.C();
            return eVar;
        }

        public final e I() {
            com.google.common.base.g.r(this.f12013f != null);
            e eVar = this.f12013f;
            this.f12013f = eVar.f12014g;
            eVar.f12014g = this;
            eVar.f12011d = this.f12011d;
            eVar.f12010c = this.f12010c;
            B();
            eVar.C();
            return eVar;
        }

        public e J(Comparator comparator, Object obj, int i10, int i11, int[] iArr) {
            int iCompare = comparator.compare(obj, x());
            if (iCompare < 0) {
                e eVar = this.f12013f;
                if (eVar != null) {
                    this.f12013f = eVar.J(comparator, obj, i10, i11, iArr);
                    int i12 = iArr[0];
                    if (i12 == i10) {
                        if (i11 == 0 && i12 != 0) {
                            this.f12010c--;
                        } else if (i11 > 0 && i12 == 0) {
                            this.f12010c++;
                        }
                        this.f12011d += i11 - i12;
                    }
                    return A();
                }
                iArr[0] = 0;
                if (i10 == 0 && i11 > 0) {
                    return p(obj, i11);
                }
            } else if (iCompare > 0) {
                e eVar2 = this.f12014g;
                if (eVar2 != null) {
                    this.f12014g = eVar2.J(comparator, obj, i10, i11, iArr);
                    int i13 = iArr[0];
                    if (i13 == i10) {
                        if (i11 == 0 && i13 != 0) {
                            this.f12010c--;
                        } else if (i11 > 0 && i13 == 0) {
                            this.f12010c++;
                        }
                        this.f12011d += i11 - i13;
                    }
                    return A();
                }
                iArr[0] = 0;
                if (i10 == 0 && i11 > 0) {
                    return q(obj, i11);
                }
            } else {
                int i14 = this.f12009b;
                iArr[0] = i14;
                if (i10 == i14) {
                    if (i11 == 0) {
                        return u();
                    }
                    this.f12011d += i11 - i14;
                    this.f12009b = i11;
                }
            }
            return this;
        }

        public e K(Comparator comparator, Object obj, int i10, int[] iArr) {
            int iCompare = comparator.compare(obj, x());
            if (iCompare < 0) {
                e eVar = this.f12013f;
                if (eVar != null) {
                    this.f12013f = eVar.K(comparator, obj, i10, iArr);
                    if (i10 == 0 && iArr[0] != 0) {
                        this.f12010c--;
                    } else if (i10 > 0 && iArr[0] == 0) {
                        this.f12010c++;
                    }
                    this.f12011d += i10 - iArr[0];
                    return A();
                }
                iArr[0] = 0;
                if (i10 > 0) {
                    return p(obj, i10);
                }
            } else {
                if (iCompare <= 0) {
                    iArr[0] = this.f12009b;
                    if (i10 == 0) {
                        return u();
                    }
                    this.f12011d += i10 - r3;
                    this.f12009b = i10;
                    return this;
                }
                e eVar2 = this.f12014g;
                if (eVar2 != null) {
                    this.f12014g = eVar2.K(comparator, obj, i10, iArr);
                    if (i10 == 0 && iArr[0] != 0) {
                        this.f12010c--;
                    } else if (i10 > 0 && iArr[0] == 0) {
                        this.f12010c++;
                    }
                    this.f12011d += i10 - iArr[0];
                    return A();
                }
                iArr[0] = 0;
                if (i10 > 0) {
                    return q(obj, i10);
                }
            }
            return this;
        }

        public final e L() {
            e eVar = this.f12016i;
            Objects.requireNonNull(eVar);
            return eVar;
        }

        public e o(Comparator comparator, Object obj, int i10, int[] iArr) {
            int iCompare = comparator.compare(obj, x());
            if (iCompare < 0) {
                e eVar = this.f12013f;
                if (eVar == null) {
                    iArr[0] = 0;
                    return p(obj, i10);
                }
                int i11 = eVar.f12012e;
                e eVarO = eVar.o(comparator, obj, i10, iArr);
                this.f12013f = eVarO;
                if (iArr[0] == 0) {
                    this.f12010c++;
                }
                this.f12011d += i10;
                if (eVarO.f12012e != i11) {
                    return A();
                }
            } else {
                if (iCompare <= 0) {
                    int i12 = this.f12009b;
                    iArr[0] = i12;
                    long j10 = i10;
                    com.google.common.base.g.d(((long) i12) + j10 <= TTL.MAX_VALUE);
                    this.f12009b += i10;
                    this.f12011d += j10;
                    return this;
                }
                e eVar2 = this.f12014g;
                if (eVar2 == null) {
                    iArr[0] = 0;
                    return q(obj, i10);
                }
                int i13 = eVar2.f12012e;
                e eVarO2 = eVar2.o(comparator, obj, i10, iArr);
                this.f12014g = eVarO2;
                if (iArr[0] == 0) {
                    this.f12010c++;
                }
                this.f12011d += i10;
                if (eVarO2.f12012e != i13) {
                    return A();
                }
            }
            return this;
        }

        public final e p(Object obj, int i10) {
            this.f12013f = new e(obj, i10);
            TreeMultiset.K(z(), this.f12013f, this);
            this.f12012e = Math.max(2, this.f12012e);
            this.f12010c++;
            this.f12011d += i10;
            return this;
        }

        public final e q(Object obj, int i10) {
            e eVar = new e(obj, i10);
            this.f12014g = eVar;
            TreeMultiset.K(this, eVar, L());
            this.f12012e = Math.max(2, this.f12012e);
            this.f12010c++;
            this.f12011d += i10;
            return this;
        }

        public final int r() {
            return y(this.f12013f) - y(this.f12014g);
        }

        public final e s(Comparator comparator, Object obj) {
            int iCompare = comparator.compare(obj, x());
            if (iCompare < 0) {
                e eVar = this.f12013f;
                if (eVar != null) {
                    return (e) com.google.common.base.e.a(eVar.s(comparator, obj), this);
                }
            } else if (iCompare != 0) {
                e eVar2 = this.f12014g;
                if (eVar2 == null) {
                    return null;
                }
                return eVar2.s(comparator, obj);
            }
            return this;
        }

        public int t(Comparator comparator, Object obj) {
            int iCompare = comparator.compare(obj, x());
            if (iCompare < 0) {
                e eVar = this.f12013f;
                if (eVar == null) {
                    return 0;
                }
                return eVar.t(comparator, obj);
            }
            if (iCompare <= 0) {
                return this.f12009b;
            }
            e eVar2 = this.f12014g;
            if (eVar2 == null) {
                return 0;
            }
            return eVar2.t(comparator, obj);
        }

        public String toString() {
            return Multisets.g(x(), w()).toString();
        }

        public final e u() {
            int i10 = this.f12009b;
            this.f12009b = 0;
            TreeMultiset.J(z(), L());
            e eVar = this.f12013f;
            if (eVar == null) {
                return this.f12014g;
            }
            e eVar2 = this.f12014g;
            if (eVar2 == null) {
                return eVar;
            }
            if (eVar.f12012e >= eVar2.f12012e) {
                e eVarZ = z();
                eVarZ.f12013f = this.f12013f.F(eVarZ);
                eVarZ.f12014g = this.f12014g;
                eVarZ.f12010c = this.f12010c - 1;
                eVarZ.f12011d = this.f12011d - i10;
                return eVarZ.A();
            }
            e eVarL = L();
            eVarL.f12014g = this.f12014g.G(eVarL);
            eVarL.f12013f = this.f12013f;
            eVarL.f12010c = this.f12010c - 1;
            eVarL.f12011d = this.f12011d - i10;
            return eVarL.A();
        }

        public final e v(Comparator comparator, Object obj) {
            int iCompare = comparator.compare(obj, x());
            if (iCompare > 0) {
                e eVar = this.f12014g;
                if (eVar != null) {
                    return (e) com.google.common.base.e.a(eVar.v(comparator, obj), this);
                }
            } else if (iCompare != 0) {
                e eVar2 = this.f12013f;
                if (eVar2 == null) {
                    return null;
                }
                return eVar2.v(comparator, obj);
            }
            return this;
        }

        public int w() {
            return this.f12009b;
        }

        public Object x() {
            return f0.a(this.f12008a);
        }

        public final e z() {
            e eVar = this.f12015h;
            Objects.requireNonNull(eVar);
            return eVar;
        }

        public e() {
            this.f12008a = null;
            this.f12009b = 1;
        }
    }
}
