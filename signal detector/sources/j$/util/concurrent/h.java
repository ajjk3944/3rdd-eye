package j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class h extends a implements Iterator, Enumeration {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f20732k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l[] lVarArr, int i, int i3, ConcurrentHashMap concurrentHashMap, int i6) {
        super(lVarArr, i, i3, concurrentHashMap);
        this.f20732k = i6;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f20732k) {
            case 0:
                l lVar = this.f20746b;
                if (lVar == null) {
                    throw new NoSuchElementException();
                }
                Object obj = lVar.f20738b;
                this.f20728j = lVar;
                a();
                return obj;
            default:
                l lVar2 = this.f20746b;
                if (lVar2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj2 = lVar2.f20739c;
                this.f20728j = lVar2;
                a();
                return obj2;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f20732k) {
        }
        return next();
    }
}
