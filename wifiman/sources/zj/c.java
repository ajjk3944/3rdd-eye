package zj;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import yj.n;
import yj.u;
import yj.w;

/* loaded from: classes2.dex */
public class c extends b implements yj.f {

    /* renamed from: b, reason: collision with root package name */
    private static final c f67387b = new c(new u[0]);

    /* renamed from: a, reason: collision with root package name */
    private final u[] f67388a;

    private static class a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private final u[] f67389a;

        /* renamed from: b, reason: collision with root package name */
        private int f67390b = 0;

        public a(u[] uVarArr) {
            this.f67389a = uVarArr;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u next() {
            int i10 = this.f67390b;
            u[] uVarArr = this.f67389a;
            if (i10 >= uVarArr.length) {
                throw new NoSuchElementException();
            }
            this.f67390b = i10 + 1;
            return uVarArr[i10];
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67390b != this.f67389a.length;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public c(u[] uVarArr) {
        this.f67388a = uVarArr;
    }

    private static void X(StringBuilder sb2, u uVar) {
        if (uVar.j()) {
            sb2.append(uVar.g());
        } else {
            sb2.append(uVar.toString());
        }
    }

    public static yj.f Y() {
        return f67387b;
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

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean N() {
        return super.N();
    }

    @Override // zj.b, yj.u
    /* renamed from: O */
    public yj.f i() {
        return this;
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

    @Override // zj.b
    /* renamed from: V */
    public /* bridge */ /* synthetic */ yj.l o() {
        return super.o();
    }

    @Override // zj.b
    /* renamed from: W */
    public /* bridge */ /* synthetic */ n L() {
        return super.L();
    }

    public u Z(int i10) {
        return this.f67388a[i10];
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
        if (uVar instanceof c) {
            return Arrays.equals(this.f67388a, ((c) uVar).f67388a);
        }
        if (!uVar.G()) {
            return false;
        }
        yj.a aVarI = uVar.i();
        if (size() != aVarI.size()) {
            return false;
        }
        Iterator it = aVarI.iterator();
        for (int i10 = 0; i10 < this.f67388a.length; i10++) {
            if (!it.hasNext() || !this.f67388a[i10].equals(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // yj.u
    public void f(org.msgpack.core.e eVar) {
        eVar.h(this.f67388a.length);
        int i10 = 0;
        while (true) {
            u[] uVarArr = this.f67388a;
            if (i10 >= uVarArr.length) {
                return;
            }
            uVarArr[i10].f(eVar);
            i10++;
        }
    }

    @Override // yj.u
    public String g() {
        if (this.f67388a.length == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        sb2.append(this.f67388a[0].g());
        for (int i10 = 1; i10 < this.f67388a.length; i10++) {
            sb2.append(",");
            sb2.append(this.f67388a[i10].g());
        }
        sb2.append("]");
        return sb2.toString();
    }

    public int hashCode() {
        int iHashCode = 1;
        int i10 = 0;
        while (true) {
            u[] uVarArr = this.f67388a;
            if (i10 >= uVarArr.length) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 31) + uVarArr[i10].hashCode();
            i10++;
        }
    }

    @Override // yj.a, java.lang.Iterable
    public Iterator iterator() {
        return new a(this.f67388a);
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // yj.u
    public w k() {
        return w.ARRAY;
    }

    @Override // yj.a
    public int size() {
        return this.f67388a.length;
    }

    public String toString() {
        if (this.f67388a.length == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        X(sb2, this.f67388a[0]);
        for (int i10 = 1; i10 < this.f67388a.length; i10++) {
            sb2.append(",");
            X(sb2, this.f67388a[i10]);
        }
        sb2.append("]");
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
