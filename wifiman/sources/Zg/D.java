package Zg;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import sh.C7974i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class D extends C {
    public static List S(List list) {
        AbstractC6492s.i(list, "<this>");
        return new b0(list);
    }

    public static List T(List list) {
        AbstractC6492s.i(list, "<this>");
        return new a0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int U(List list, int i10) {
        if (i10 >= 0 && i10 <= AbstractC3689v.n(list)) {
            return AbstractC3689v.n(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new C7974i(0, AbstractC3689v.n(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int V(List list, int i10) {
        return AbstractC3689v.n(list) - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int W(List list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new C7974i(0, list.size()) + "].");
    }
}
