package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import l9.q;
import y8.s;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public /* synthetic */ class BufferedChannel$onReceiveCatching$1 extends FunctionReferenceImpl implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final BufferedChannel$onReceiveCatching$1 f22260a = new BufferedChannel$onReceiveCatching$1();

    public BufferedChannel$onReceiveCatching$1() {
        super(3, BufferedChannel.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void b(BufferedChannel bufferedChannel, kotlinx.coroutines.selects.h hVar, Object obj) {
        bufferedChannel.J0(hVar, obj);
    }

    @Override // l9.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        b((BufferedChannel) obj, (kotlinx.coroutines.selects.h) obj2, obj3);
        return s.f25199a;
    }
}
