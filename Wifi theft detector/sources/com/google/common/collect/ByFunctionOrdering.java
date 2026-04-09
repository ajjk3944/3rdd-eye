package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
final class ByFunctionOrdering<F, T> extends j0 implements Serializable {
    private static final long serialVersionUID = 0;
    final com.google.common.base.c function;
    final j0 ordering;

    public ByFunctionOrdering(com.google.common.base.c cVar, j0 j0Var) {
        this.function = (com.google.common.base.c) com.google.common.base.g.m(cVar);
        this.ordering = (j0) com.google.common.base.g.m(j0Var);
    }

    @Override // com.google.common.collect.j0, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.ordering.compare(this.function.apply(obj), this.function.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByFunctionOrdering) {
            ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
            if (this.function.equals(byFunctionOrdering.function) && this.ordering.equals(byFunctionOrdering.ordering)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return com.google.common.base.f.b(this.function, this.ordering);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.ordering);
        String strValueOf2 = String.valueOf(this.function);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append(".onResultOf(");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }
}
