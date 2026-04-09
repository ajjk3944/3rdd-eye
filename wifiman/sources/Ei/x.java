package Ei;

import Zg.AbstractC3682n;

/* loaded from: classes4.dex */
public abstract class x {
    public static final int e(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] f(Object[] objArr, int i10, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        AbstractC3682n.q(objArr, objArr2, 0, 0, i10, 6, null);
        AbstractC3682n.m(objArr, objArr2, i10 + 2, i10, objArr.length);
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] g(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 2];
        AbstractC3682n.q(objArr, objArr2, 0, 0, i10, 6, null);
        AbstractC3682n.m(objArr, objArr2, i10, i10 + 2, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] h(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC3682n.q(objArr, objArr2, 0, 0, i10, 6, null);
        AbstractC3682n.m(objArr, objArr2, i10, i10 + 1, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] i(Object[] objArr, int i10, int i11, t tVar) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC3682n.q(objArr, objArr2, 0, 0, i10, 6, null);
        AbstractC3682n.m(objArr, objArr2, i10, i10 + 2, i11);
        objArr2[i11 - 2] = tVar;
        AbstractC3682n.m(objArr, objArr2, i11 - 1, i11, objArr.length);
        return objArr2;
    }
}
