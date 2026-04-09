package F9;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: ConcurrentLinkedList.kt */
/* renamed from: F9.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0661d {

    /* renamed from: a, reason: collision with root package name */
    public static final y f1749a = new y("CLOSED");

    public static final Object a(w wVar, long j4, p9.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (wVar.f1786d >= j4 && !wVar.d()) {
                return wVar;
            }
            Object obj = AbstractC0662e.f1750b.get(wVar);
            y yVar = f1749a;
            if (obj == yVar) {
                return yVar;
            }
            w wVar2 = (w) ((AbstractC0662e) obj);
            if (wVar2 == null) {
                wVar2 = (w) pVar.invoke(Long.valueOf(wVar.f1786d + 1), wVar);
                do {
                    atomicReferenceFieldUpdater = AbstractC0662e.f1750b;
                    if (atomicReferenceFieldUpdater.compareAndSet(wVar, null, wVar2)) {
                        if (wVar.d()) {
                            wVar.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(wVar) == null);
            }
            wVar = wVar2;
        }
    }

    public static final w b(Object obj) {
        if (obj != f1749a) {
            return (w) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final boolean c(Object obj) {
        return obj == f1749a;
    }

    public static final Object d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }
}
