package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cn3 extends rm3 {
    public Object[] d;
    public int e;

    @Override // defpackage.rm3
    public final /* bridge */ /* synthetic */ rm3 c(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        if (this.d != null) {
            int i = dn3.i(this.b);
            Object[] objArr = this.d;
            if (i <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iU = g82.u(iHashCode);
                while (true) {
                    int i2 = iU & length;
                    Object[] objArr2 = this.d;
                    Object obj2 = objArr2[i2];
                    if (obj2 == null) {
                        objArr2[i2] = obj;
                        this.e += iHashCode;
                        a(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        iU = i2 + 1;
                    }
                }
            }
        }
        this.d = null;
        a(obj);
    }

    public final void g(Iterable iterable) {
        iterable.getClass();
        if (this.d == null) {
            b(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            f(it.next());
        }
    }

    public final dn3 h() {
        dn3 dn3VarM;
        int i = this.b;
        if (i == 0) {
            return yn3.o;
        }
        if (i == 1) {
            Object obj = this.a[0];
            Objects.requireNonNull(obj);
            return new en3(obj);
        }
        if (this.d == null || dn3.i(i) != this.d.length) {
            dn3VarM = dn3.m(this.a, this.b);
            this.b = dn3VarM.size();
        } else {
            int i2 = this.b;
            Object[] objArrCopyOf = this.a;
            int length = objArrCopyOf.length;
            if (i2 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            dn3VarM = new yn3(this.e, r8.length - 1, this.b, objArrCopyOf, this.d);
        }
        this.c = true;
        this.d = null;
        return dn3VarM;
    }
}
