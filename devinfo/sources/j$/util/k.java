package j$.util;

import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class k extends i implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    @Override // j$.util.i, java.util.List
    public final java.util.List subList(int i4, int i10) {
        k kVar;
        synchronized (this.f26403b) {
            kVar = new k(this.f26407c.subList(i4, i10), this.f26403b);
        }
        return kVar;
    }

    private Object writeReplace() {
        return new i(this.f26407c);
    }
}
