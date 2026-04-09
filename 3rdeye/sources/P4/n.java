package P4;

import P4.o;
import io.appmetrica.analytics.impl.T;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10642b;

    public /* synthetic */ n(Object obj, int i) {
        this.f10641a = i;
        this.f10642b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        Map<String, String> mapA;
        switch (this.f10641a) {
            case 0:
                o.a aVar = (o.a) this.f10642b;
                aVar.f10651b.set(null);
                synchronized (aVar) {
                    try {
                        if (aVar.f10650a.isMarked()) {
                            mapA = aVar.f10650a.getReference().a();
                            AtomicMarkableReference<d> atomicMarkableReference = aVar.f10650a;
                            atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                        } else {
                            mapA = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (mapA != null) {
                    o oVar = aVar.f10653d;
                    oVar.f10643a.g(oVar.f10645c, mapA, aVar.f10652c);
                }
                return null;
            default:
                return T.e((T) this.f10642b);
        }
    }
}
