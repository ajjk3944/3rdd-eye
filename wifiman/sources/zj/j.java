package zj;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import yj.n;
import yj.u;
import yj.w;

/* loaded from: classes2.dex */
public class j extends zj.b implements yj.l {

    /* renamed from: b, reason: collision with root package name */
    private static final j f67407b = new j(new u[0]);

    /* renamed from: a, reason: collision with root package name */
    private final u[] f67408a;

    private static class a extends AbstractSet {

        /* renamed from: a, reason: collision with root package name */
        private final u[] f67409a;

        a(u[] uVarArr) {
            this.f67409a = uVarArr;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(this.f67409a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f67409a.length / 2;
        }
    }

    private static class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private final u[] f67410a;

        /* renamed from: b, reason: collision with root package name */
        private int f67411b = 0;

        b(u[] uVarArr) {
            this.f67410a = uVarArr;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            int i10 = this.f67411b;
            u[] uVarArr = this.f67410a;
            if (i10 >= uVarArr.length) {
                throw new NoSuchElementException();
            }
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(uVarArr[i10], uVarArr[i10 + 1]);
            this.f67411b += 2;
            return simpleImmutableEntry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67411b < this.f67410a.length;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static class c extends AbstractMap {

        /* renamed from: a, reason: collision with root package name */
        private final u[] f67412a;

        public c(u[] uVarArr) {
            this.f67412a = uVarArr;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            return new a(this.f67412a);
        }
    }

    public j(u[] uVarArr) {
        this.f67408a = uVarArr;
    }

    private static void X(StringBuilder sb2, u uVar) {
        if (uVar.j()) {
            sb2.append(uVar.g());
        } else {
            zj.a.X(sb2, uVar.toString());
        }
    }

    private static void Y(StringBuilder sb2, u uVar) {
        if (uVar.j()) {
            sb2.append(uVar.g());
        } else {
            sb2.append(uVar.toString());
        }
    }

    public static yj.l Z() {
        return f67407b;
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean C() {
        return super.C();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean G() {
        return super.G();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean H() {
        return super.H();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean I() {
        return super.I();
    }

    @Override // yj.q
    public Map J() {
        return new c(this.f67408a);
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean N() {
        return super.N();
    }

    @Override // zj.b
    /* renamed from: O */
    public /* bridge */ /* synthetic */ yj.f i() {
        return super.i();
    }

    @Override // zj.b
    /* renamed from: Q */
    public /* bridge */ /* synthetic */ yj.g F() {
        return super.F();
    }

    @Override // zj.b
    /* renamed from: R */
    public /* bridge */ /* synthetic */ yj.h M() {
        return super.M();
    }

    @Override // zj.b
    /* renamed from: S */
    public /* bridge */ /* synthetic */ yj.i D() {
        return super.D();
    }

    @Override // zj.b
    /* renamed from: T */
    public /* bridge */ /* synthetic */ yj.j A() {
        return super.A();
    }

    @Override // zj.b
    /* renamed from: U */
    public /* bridge */ /* synthetic */ yj.k x() {
        return super.x();
    }

    @Override // zj.b, yj.u
    /* renamed from: V */
    public yj.l o() {
        return this;
    }

    @Override // zj.b
    /* renamed from: W */
    public /* bridge */ /* synthetic */ n L() {
        return super.L();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean e() {
        return super.e();
    }

    @Override // yj.u
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (!uVar.z()) {
            return false;
        }
        return J().equals(uVar.o().J());
    }

    @Override // yj.u
    public void f(org.msgpack.core.e eVar) {
        eVar.J(this.f67408a.length / 2);
        int i10 = 0;
        while (true) {
            u[] uVarArr = this.f67408a;
            if (i10 >= uVarArr.length) {
                return;
            }
            uVarArr[i10].f(eVar);
            i10++;
        }
    }

    @Override // yj.u
    public String g() {
        if (this.f67408a.length == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        X(sb2, this.f67408a[0]);
        sb2.append(":");
        sb2.append(this.f67408a[1].g());
        for (int i10 = 2; i10 < this.f67408a.length; i10 += 2) {
            sb2.append(",");
            X(sb2, this.f67408a[i10]);
            sb2.append(":");
            sb2.append(this.f67408a[i10 + 1].g());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public int hashCode() {
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            u[] uVarArr = this.f67408a;
            if (i10 >= uVarArr.length) {
                return iHashCode;
            }
            iHashCode += uVarArr[i10].hashCode() ^ this.f67408a[i10 + 1].hashCode();
            i10 += 2;
        }
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // yj.u
    public w k() {
        return w.MAP;
    }

    public String toString() {
        if (this.f67408a.length == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        Y(sb2, this.f67408a[0]);
        sb2.append(":");
        Y(sb2, this.f67408a[1]);
        for (int i10 = 2; i10 < this.f67408a.length; i10 += 2) {
            sb2.append(",");
            Y(sb2, this.f67408a[i10]);
            sb2.append(":");
            Y(sb2, this.f67408a[i10 + 1]);
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean v() {
        return super.v();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean y() {
        return super.y();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean z() {
        return super.z();
    }
}
