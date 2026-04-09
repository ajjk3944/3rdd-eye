package j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class h extends a implements Iterator, Enumeration {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f26319k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l[] lVarArr, int i4, int i10, ConcurrentHashMap concurrentHashMap, int i11) {
        super(lVarArr, i4, i10, concurrentHashMap);
        this.f26319k = i11;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f26319k) {
            case 0:
                l lVar = this.f26333b;
                if (lVar == null) {
                    throw new NoSuchElementException();
                }
                Object obj = lVar.f26325b;
                this.j = lVar;
                a();
                return obj;
            default:
                l lVar2 = this.f26333b;
                if (lVar2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj2 = lVar2.f26326c;
                this.j = lVar2;
                a();
                return obj2;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f26319k) {
        }
        return next();
    }
}
