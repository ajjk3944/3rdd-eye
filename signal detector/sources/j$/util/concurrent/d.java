package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class d extends a implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        l lVar = this.f20746b;
        if (lVar == null) {
            throw new NoSuchElementException();
        }
        Object obj = lVar.f20738b;
        Object obj2 = lVar.f20739c;
        this.f20728j = lVar;
        a();
        return new k(obj, obj2, this.i);
    }
}
