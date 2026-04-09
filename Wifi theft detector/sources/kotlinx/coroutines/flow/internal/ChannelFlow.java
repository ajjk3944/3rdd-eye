package kotlinx.coroutines.flow.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.l0;
import y8.s;
import z8.z;

/* loaded from: classes4.dex */
public abstract class ChannelFlow implements i {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.coroutines.d f22452a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22453b;

    /* renamed from: c, reason: collision with root package name */
    public final BufferOverflow f22454c;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/j0;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlow$collect$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements l9.p {
        final /* synthetic */ kotlinx.coroutines.flow.c $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChannelFlow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(kotlinx.coroutines.flow.c cVar, ChannelFlow channelFlow, c9.c cVar2) {
            super(2, cVar2);
            this.$collector = cVar;
            this.this$0 = channelFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c9.c create(Object obj, c9.c cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$collector, this.this$0, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = kotlin.coroutines.intrinsics.a.f();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                j0 j0Var = (j0) this.L$0;
                kotlinx.coroutines.flow.c cVar = this.$collector;
                kotlinx.coroutines.channels.n nVarM = this.this$0.m(j0Var);
                this.label = 1;
                if (kotlinx.coroutines.flow.d.n(cVar, nVarM, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return s.f25199a;
        }

        @Override // l9.p
        public final Object invoke(j0 j0Var, c9.c cVar) {
            return ((AnonymousClass2) create(j0Var, cVar)).invokeSuspend(s.f25199a);
        }
    }

    public ChannelFlow(kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        this.f22452a = dVar;
        this.f22453b = i10;
        this.f22454c = bufferOverflow;
    }

    public static /* synthetic */ Object d(ChannelFlow channelFlow, kotlinx.coroutines.flow.c cVar, c9.c cVar2) {
        Object objE = k0.e(new AnonymousClass2(cVar, channelFlow, null), cVar2);
        return objE == kotlin.coroutines.intrinsics.a.f() ? objE : s.f25199a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // kotlinx.coroutines.flow.internal.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kotlinx.coroutines.flow.b b(kotlin.coroutines.d r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4) {
        /*
            r1 = this;
            kotlin.coroutines.d r0 = r1.f22452a
            kotlin.coroutines.d r2 = r2.plus(r0)
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.f22240a
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.f22453b
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r3 = r3 + r4
            if (r3 < 0) goto L20
            goto L23
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.f22454c
        L25:
            kotlin.coroutines.d r0 = r1.f22452a
            boolean r0 = kotlin.jvm.internal.p.a(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.f22453b
            if (r3 != r0) goto L36
            kotlinx.coroutines.channels.BufferOverflow r0 = r1.f22454c
            if (r4 != r0) goto L36
            return r1
        L36:
            kotlinx.coroutines.flow.internal.ChannelFlow r2 = r1.f(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlow.b(kotlin.coroutines.d, int, kotlinx.coroutines.channels.BufferOverflow):kotlinx.coroutines.flow.b");
    }

    public String c() {
        return null;
    }

    @Override // kotlinx.coroutines.flow.b
    public Object collect(kotlinx.coroutines.flow.c cVar, c9.c cVar2) {
        return d(this, cVar, cVar2);
    }

    public abstract Object e(kotlinx.coroutines.channels.l lVar, c9.c cVar);

    public abstract ChannelFlow f(kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow);

    public kotlinx.coroutines.flow.b i() {
        return null;
    }

    public final l9.p k() {
        return new ChannelFlow$collectToFun$1(this, null);
    }

    public final int l() {
        int i10 = this.f22453b;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public kotlinx.coroutines.channels.n m(j0 j0Var) {
        return ProduceKt.d(j0Var, this.f22452a, l(), this.f22454c, CoroutineStart.f22207c, null, k(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strC = c();
        if (strC != null) {
            arrayList.add(strC);
        }
        if (this.f22452a != EmptyCoroutineContext.f21979a) {
            arrayList.add("context=" + this.f22452a);
        }
        if (this.f22453b != -3) {
            arrayList.add("capacity=" + this.f22453b);
        }
        if (this.f22454c != BufferOverflow.f22240a) {
            arrayList.add("onBufferOverflow=" + this.f22454c);
        }
        return l0.a(this) + '[' + z.O(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
