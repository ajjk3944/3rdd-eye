package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import l9.q;
import y8.s;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public /* synthetic */ class OnTimeout$selectClause$1 extends FunctionReferenceImpl implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final OnTimeout$selectClause$1 f22631a = new OnTimeout$selectClause$1();

    public OnTimeout$selectClause$1() {
        super(3, OnTimeout.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void b(OnTimeout onTimeout, h hVar, Object obj) {
        onTimeout.c(hVar, obj);
    }

    @Override // l9.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        b((OnTimeout) obj, (h) obj2, obj3);
        return s.f25199a;
    }
}
