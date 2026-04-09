package A9;

import A9.C0605u0.e;
import b9.C1992A;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 extends kotlin.jvm.internal.k implements p9.q<C0605u0, J9.c<?>, Object, C1992A> {

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f302b = new z0(3, C0605u0.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // p9.q
    public final C1992A invoke(C0605u0 c0605u0, J9.c<?> cVar, Object obj) {
        C0605u0 c0605u02 = c0605u0;
        J9.c<?> cVar2 = cVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0605u0.f274b;
        while (true) {
            Object objL = c0605u02.L();
            if (!(objL instanceof InterfaceC0584j0)) {
                cVar2.e(C1992A.f18074a);
                break;
            }
            if (c0605u02.a0(objL) >= 0) {
                cVar2.b(C0572d0.d(c0605u02, false, c0605u02.new e(cVar2), 3));
                break;
            }
        }
        return C1992A.f18074a;
    }
}
