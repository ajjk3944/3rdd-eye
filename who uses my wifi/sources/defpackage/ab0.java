package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ab0 extends cb0 implements Iterator, p40 {
    public final /* synthetic */ int j;

    public ab0(db0 db0Var, int i) {
        this.j = i;
        i30.m(db0Var, "map");
        this.i = db0Var;
        this.g = -1;
        this.h = db0Var.m;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.j) {
            case 0:
                b();
                int i = this.f;
                db0 db0Var = (db0) this.i;
                if (i >= db0Var.k) {
                    throw new NoSuchElementException();
                }
                this.f = i + 1;
                this.g = i;
                bb0 bb0Var = new bb0(db0Var, i);
                e();
                return bb0Var;
            case 1:
                b();
                int i2 = this.f;
                db0 db0Var2 = (db0) this.i;
                if (i2 >= db0Var2.k) {
                    throw new NoSuchElementException();
                }
                this.f = i2 + 1;
                this.g = i2;
                Object obj = db0Var2.f[i2];
                e();
                return obj;
            default:
                b();
                int i3 = this.f;
                db0 db0Var3 = (db0) this.i;
                if (i3 >= db0Var3.k) {
                    throw new NoSuchElementException();
                }
                this.f = i3 + 1;
                this.g = i3;
                Object[] objArr = db0Var3.g;
                i30.j(objArr);
                Object obj2 = objArr[this.g];
                e();
                return obj2;
        }
    }
}
