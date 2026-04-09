package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import l9.q;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final SafeCollectorKt$emitFun$1 f22466a = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, kotlinx.coroutines.flow.c.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // l9.q
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(kotlinx.coroutines.flow.c cVar, Object obj, c9.c cVar2) {
        return cVar.emit(obj, cVar2);
    }
}
