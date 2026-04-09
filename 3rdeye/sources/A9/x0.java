package A9;

import A9.C0605u0.d;
import b9.C1992A;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 extends kotlin.jvm.internal.k implements p9.q<C0605u0, J9.c<?>, Object, C1992A> {

    /* renamed from: b, reason: collision with root package name */
    public static final x0 f298b = new x0(3, C0605u0.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // p9.q
    public final C1992A invoke(C0605u0 c0605u0, J9.c<?> cVar, Object obj) {
        C0605u0 c0605u02 = c0605u0;
        J9.c<?> cVar2 = cVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0605u0.f274b;
        while (true) {
            Object objL = c0605u02.L();
            if (!(objL instanceof InterfaceC0584j0)) {
                if (!(objL instanceof C0602t)) {
                    objL = A0.b(objL);
                }
                cVar2.e(objL);
            } else if (c0605u02.a0(objL) >= 0) {
                cVar2.b(C0572d0.d(c0605u02, false, c0605u02.new d(cVar2), 3));
                break;
            }
        }
        return C1992A.f18074a;
    }
}
