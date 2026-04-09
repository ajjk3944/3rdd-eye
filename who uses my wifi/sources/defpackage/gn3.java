package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gn3 extends yq2 {
    public Object g;
    public int h;
    public final /* synthetic */ int i;
    public final Iterator j;
    public final /* synthetic */ Object k;

    public gn3() {
        super(1);
        this.h = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        cl3 cl3Var;
        Object next;
        Set set;
        zt0.b0(this.h != 4);
        int i = this.h;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.h = 4;
            switch (this.i) {
                case 0:
                    do {
                        Iterator it = this.j;
                        if (!it.hasNext()) {
                            this.h = 3;
                            next = null;
                            break;
                        } else {
                            cl3Var = (cl3) this.k;
                            next = it.next();
                        }
                    } while (!cl3Var.c(next));
                default:
                    do {
                        Iterator it2 = this.j;
                        if (!it2.hasNext()) {
                            this.h = 3;
                            next = null;
                            break;
                        } else {
                            set = (Set) this.k;
                            next = it2.next();
                        }
                    } while (!set.contains(next));
            }
            this.g = next;
            if (this.h != 3) {
                this.h = 1;
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yq2, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.h = 2;
        Object obj = this.g;
        this.g = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gn3(Iterator it, cl3 cl3Var) {
        this();
        this.i = 0;
        this.j = it;
        this.k = cl3Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gn3(ao3 ao3Var, Set set, Set set2) {
        this();
        this.i = 1;
        this.k = set2;
        this.j = set.iterator();
    }
}
