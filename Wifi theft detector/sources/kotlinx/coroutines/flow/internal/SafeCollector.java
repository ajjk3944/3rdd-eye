package kotlinx.coroutines.flow.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.u1;
import l9.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010'\u001a\u00020&8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010%R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/c;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Ld9/c;", "collector", "Lkotlin/coroutines/d;", "collectContext", "<init>", "(Lkotlinx/coroutines/flow/c;Lkotlin/coroutines/d;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ly8/s;", "releaseIntercepted", "()V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "emit", "(Ljava/lang/Object;Lc9/c;)Ljava/lang/Object;", "Lc9/c;", "uCont", "n", "(Lc9/c;Ljava/lang/Object;)Ljava/lang/Object;", "currentContext", "previousContext", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "(Lkotlin/coroutines/d;Lkotlin/coroutines/d;Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/internal/f;", "exception", "o", "(Lkotlinx/coroutines/flow/internal/f;Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/c;", "Lkotlin/coroutines/d;", "", "collectContextSize", "I", "lastEmissionContext", "completion_", "Lc9/c;", "getCallerFrame", "()Ld9/c;", "callerFrame", "getContext", "()Lkotlin/coroutines/d;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSafeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.kt\nkotlinx/coroutines/flow/internal/SafeCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
/* loaded from: classes4.dex */
public final class SafeCollector<T> extends ContinuationImpl implements kotlinx.coroutines.flow.c, d9.c {

    @JvmField
    @NotNull
    public final kotlin.coroutines.d collectContext;

    @JvmField
    public final int collectContextSize;

    @JvmField
    @NotNull
    public final kotlinx.coroutines.flow.c collector;

    @Nullable
    private c9.c completion_;

    @Nullable
    private kotlin.coroutines.d lastEmissionContext;

    public SafeCollector(kotlinx.coroutines.flow.c cVar, kotlin.coroutines.d dVar) {
        super(j.f22477a, EmptyCoroutineContext.f21979a);
        this.collector = cVar;
        this.collectContext = dVar;
        this.collectContextSize = ((Number) dVar.fold(0, new l9.p() { // from class: kotlinx.coroutines.flow.internal.SafeCollector$collectContextSize$1
            public final Integer a(int i10, d.b bVar) {
                return Integer.valueOf(i10 + 1);
            }

            @Override // l9.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Number) obj).intValue(), (d.b) obj2);
            }
        })).intValue();
    }

    public final void b(kotlin.coroutines.d currentContext, kotlin.coroutines.d previousContext, Object value) {
        if (previousContext instanceof f) {
            o((f) previousContext, value);
        }
        SafeCollector_commonKt.a(this, currentContext);
    }

    @Override // kotlinx.coroutines.flow.c
    public Object emit(Object obj, c9.c cVar) {
        try {
            Object objN = n(cVar, obj);
            if (objN == kotlin.coroutines.intrinsics.a.f()) {
                d9.e.c(cVar);
            }
            return objN == kotlin.coroutines.intrinsics.a.f() ? objN : s.f25199a;
        } catch (Throwable th) {
            this.lastEmissionContext = new f(th, cVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, d9.c
    public d9.c getCallerFrame() {
        c9.c cVar = this.completion_;
        if (cVar instanceof d9.c) {
            return (d9.c) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, c9.c
    public kotlin.coroutines.d getContext() {
        kotlin.coroutines.d dVar = this.lastEmissionContext;
        return dVar == null ? EmptyCoroutineContext.f21979a : dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object result) {
        Throwable thE = Result.e(result);
        if (thE != null) {
            this.lastEmissionContext = new f(thE, getContext());
        }
        c9.c cVar = this.completion_;
        if (cVar != null) {
            cVar.resumeWith(result);
        }
        return kotlin.coroutines.intrinsics.a.f();
    }

    public final Object n(c9.c uCont, Object value) {
        kotlin.coroutines.d context = uCont.getContext();
        u1.g(context);
        kotlin.coroutines.d dVar = this.lastEmissionContext;
        if (dVar != context) {
            b(context, dVar, value);
            this.lastEmissionContext = context;
        }
        this.completion_ = uCont;
        q qVar = SafeCollectorKt.f22465a;
        kotlinx.coroutines.flow.c cVar = this.collector;
        kotlin.jvm.internal.p.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        kotlin.jvm.internal.p.c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = qVar.invoke(cVar, value, this);
        if (!kotlin.jvm.internal.p.a(objInvoke, kotlin.coroutines.intrinsics.a.f())) {
            this.completion_ = null;
        }
        return objInvoke;
    }

    public final void o(f exception, Object value) {
        throw new IllegalStateException(s9.k.j("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + exception.f22475a + ", but then emission attempt of value '" + value + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
