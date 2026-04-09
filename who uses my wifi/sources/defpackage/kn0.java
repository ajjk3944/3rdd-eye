package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class kn0 implements Serializable, Iterable {
    public final ArrayList f;
    public final ArrayList g;
    public short h;
    public long i;

    public kn0(tn0 tn0Var) {
        ArrayList arrayList = new ArrayList(1);
        this.f = arrayList;
        ArrayList arrayList2 = new ArrayList(0);
        this.g = arrayList2;
        if (tn0Var instanceof jn0) {
            c((jn0) tn0Var, arrayList2);
        } else {
            c(tn0Var, arrayList);
        }
    }

    public static void d(Iterator it, StringBuilder sb) {
        while (it.hasNext()) {
            tn0 tn0Var = (tn0) it.next();
            sb.append("[");
            sb.append(tn0Var.l());
            sb.append("]");
            if (it.hasNext()) {
                sb.append(" ");
            }
        }
    }

    public final void c(tn0 tn0Var, ArrayList arrayList) {
        ArrayList arrayList2 = this.g;
        boolean zIsEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f;
        if (zIsEmpty && arrayList3.isEmpty()) {
            arrayList.add(tn0Var);
            this.i = tn0Var.i;
            return;
        }
        if (!arrayList3.isEmpty() && !tn0Var.n((tn0) arrayList3.get(0))) {
            throw new IllegalArgumentException("record does not match rrset");
        }
        if (!arrayList2.isEmpty() && !tn0Var.n((tn0) arrayList2.get(0))) {
            throw new IllegalArgumentException("record does not match rrset");
        }
        long j = tn0Var.i;
        long j2 = this.i;
        if (j > j2) {
            tn0Var = tn0Var.d();
            tn0Var.i = this.i;
        } else if (j < j2) {
            this.i = j;
            for (int i = 0; i < arrayList3.size(); i++) {
                tn0 tn0VarD = ((tn0) arrayList3.get(i)).d();
                tn0VarD.i = j;
                arrayList3.set(i, tn0VarD);
            }
            long j3 = tn0Var.i;
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                tn0 tn0VarD2 = ((tn0) arrayList2.get(i2)).d();
                tn0VarD2.i = j3;
                arrayList2.set(i2, tn0VarD2);
            }
        }
        if (arrayList.contains(tn0Var)) {
            return;
        }
        arrayList.add(tn0Var);
    }

    public final tn0 e() {
        ArrayList arrayList = this.f;
        if (!arrayList.isEmpty()) {
            return (tn0) arrayList.get(0);
        }
        ArrayList arrayList2 = this.g;
        if (arrayList2.isEmpty()) {
            throw new IllegalStateException("rrset is empty");
        }
        return (tn0) arrayList2.get(0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kn0)) {
            return false;
        }
        kn0 kn0Var = (kn0) obj;
        ArrayList arrayList = kn0Var.f;
        ArrayList arrayList2 = this.f;
        if (arrayList2 != null ? !arrayList2.equals(arrayList) : arrayList != null) {
            return false;
        }
        ArrayList arrayList3 = kn0Var.g;
        ArrayList arrayList4 = this.g;
        return arrayList4 != null ? arrayList4.equals(arrayList3) : arrayList3 == null;
    }

    public final List f(boolean z) {
        ArrayList arrayList = this.f;
        if (!z || arrayList.size() <= 1) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (this.h == Short.MAX_VALUE) {
            this.h = (short) 0;
        }
        short s = this.h;
        this.h = (short) (s + 1);
        int size = s % arrayList.size();
        arrayList2.addAll(arrayList.subList(size, arrayList.size()));
        arrayList2.addAll(arrayList.subList(0, size));
        return arrayList2;
    }

    public final int getType() {
        return e().h();
    }

    public final int hashCode() {
        ArrayList arrayList = this.f;
        int iHashCode = ((arrayList == null ? 43 : arrayList.hashCode()) + 59) * 59;
        ArrayList arrayList2 = this.g;
        return iHashCode + (arrayList2 != null ? arrayList2.hashCode() : 43);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return f(true).iterator();
    }

    public String toString() {
        ArrayList arrayList = this.f;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.g;
        if (zIsEmpty && arrayList2.isEmpty()) {
            return "{empty}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        sb.append(e().f);
        sb.append(" ");
        sb.append(e().i);
        sb.append(" ");
        sb.append(yl.a.e(e().h));
        sb.append(" ");
        sb.append(k31.a.e(getType()));
        sb.append(" ");
        d(arrayList.iterator(), sb);
        if (!arrayList2.isEmpty()) {
            sb.append(" sigs: ");
            d(arrayList2.iterator(), sb);
        }
        sb.append(" }");
        return sb.toString();
    }

    public kn0(kn0 kn0Var) {
        this.f = new ArrayList(kn0Var.f);
        this.g = new ArrayList(kn0Var.g);
        this.h = kn0Var.h;
        this.i = kn0Var.i;
    }
}
