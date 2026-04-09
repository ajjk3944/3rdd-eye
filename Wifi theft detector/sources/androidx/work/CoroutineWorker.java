package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.concurrent.ExecutionException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.r1;
import kotlinx.coroutines.w0;
import kotlinx.coroutines.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u001b\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0018\u0010\u000bJ\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010!\u001a\b\u0012\u0004\u0012\u00020\t0 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010&\u001a\u00020%8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010\u001a\u001a\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lcom/google/common/util/concurrent/a;", "Landroidx/work/ListenableWorker$a;", "startWork", "()Lcom/google/common/util/concurrent/a;", "doWork", "(Lc9/c;)Ljava/lang/Object;", "Landroidx/work/e;", "getForegroundInfo", "Landroidx/work/d;", "data", "Ly8/s;", "setProgress", "(Landroidx/work/d;Lc9/c;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Landroidx/work/e;Lc9/c;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "()V", "Lkotlinx/coroutines/a0;", "job", "Lkotlinx/coroutines/a0;", "getJob$work_runtime_ktx_release", "()Lkotlinx/coroutines/a0;", "Ln2/a;", "future", "Ln2/a;", "getFuture$work_runtime_ktx_release", "()Ln2/a;", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext$annotations", "work-runtime-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {

    @NotNull
    private final CoroutineDispatcher coroutineContext;

    @NotNull
    private final n2.a future;

    @NotNull
    private final a0 job;

    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CoroutineWorker.this.getFuture().isCancelled()) {
                r1.a.a(CoroutineWorker.this.getJob(), null, 1, null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.work.CoroutineWorker$getForegroundInfoAsync$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements l9.p {
        final /* synthetic */ JobListenableFuture $jobFuture;
        Object L$0;
        int label;
        final /* synthetic */ CoroutineWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JobListenableFuture jobListenableFuture, CoroutineWorker coroutineWorker, c9.c cVar) {
            super(2, cVar);
            this.$jobFuture = jobListenableFuture;
            this.this$0 = coroutineWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c9.c create(Object obj, c9.c cVar) {
            return new AnonymousClass1(this.$jobFuture, this.this$0, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            JobListenableFuture jobListenableFuture;
            Object objF = kotlin.coroutines.intrinsics.a.f();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                JobListenableFuture jobListenableFuture2 = this.$jobFuture;
                CoroutineWorker coroutineWorker = this.this$0;
                this.L$0 = jobListenableFuture2;
                this.label = 1;
                Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
                if (foregroundInfo == objF) {
                    return objF;
                }
                jobListenableFuture = jobListenableFuture2;
                obj = foregroundInfo;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jobListenableFuture = (JobListenableFuture) this.L$0;
                kotlin.c.b(obj);
            }
            jobListenableFuture.b(obj);
            return y8.s.f25199a;
        }

        @Override // l9.p
        public final Object invoke(j0 j0Var, c9.c cVar) {
            return ((AnonymousClass1) create(j0Var, cVar)).invokeSuspend(y8.s.f25199a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.work.CoroutineWorker$startWork$1, reason: invalid class name and case insensitive filesystem */
    public static final class C05121 extends SuspendLambda implements l9.p {
        int label;

        public C05121(c9.c cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c9.c create(Object obj, c9.c cVar) {
            return CoroutineWorker.this.new C05121(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = kotlin.coroutines.intrinsics.a.f();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.label = 1;
                    obj = coroutineWorker.doWork(this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                CoroutineWorker.this.getFuture().o((ListenableWorker.a) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.getFuture().p(th);
            }
            return y8.s.f25199a;
        }

        @Override // l9.p
        public final Object invoke(j0 j0Var, c9.c cVar) {
            return ((C05121) create(j0Var, cVar)).invokeSuspend(y8.s.f25199a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        kotlin.jvm.internal.p.e(appContext, "appContext");
        kotlin.jvm.internal.p.e(params, "params");
        this.job = w1.b(null, 1, null);
        n2.a aVarS = n2.a.s();
        kotlin.jvm.internal.p.d(aVarS, "create()");
        this.future = aVarS;
        aVarS.addListener(new a(), getTaskExecutor().getBackgroundExecutor());
        this.coroutineContext = w0.a();
    }

    @Deprecated(message = "use withContext(...) inside doWork() instead.")
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, c9.c cVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(c9.c cVar);

    @NotNull
    public CoroutineDispatcher getCoroutineContext() {
        return this.coroutineContext;
    }

    @Nullable
    public Object getForegroundInfo(@NotNull c9.c cVar) {
        return getForegroundInfo$suspendImpl(this, cVar);
    }

    @Override // androidx.work.ListenableWorker
    @NotNull
    public final com.google.common.util.concurrent.a getForegroundInfoAsync() {
        a0 a0VarB = w1.b(null, 1, null);
        j0 j0VarA = k0.a(getCoroutineContext().plus(a0VarB));
        JobListenableFuture jobListenableFuture = new JobListenableFuture(a0VarB, null, 2, null);
        kotlinx.coroutines.k.d(j0VarA, null, null, new AnonymousClass1(jobListenableFuture, this, null), 3, null);
        return jobListenableFuture;
    }

    @NotNull
    /* renamed from: getFuture$work_runtime_ktx_release, reason: from getter */
    public final n2.a getFuture() {
        return this.future;
    }

    @NotNull
    /* renamed from: getJob$work_runtime_ktx_release, reason: from getter */
    public final a0 getJob() {
        return this.job;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    @Nullable
    public final Object setForeground(@NotNull e eVar, @NotNull c9.c cVar) throws Throwable {
        Object objW;
        com.google.common.util.concurrent.a foregroundAsync = setForegroundAsync(eVar);
        kotlin.jvm.internal.p.d(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                objW = foregroundAsync.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            pVar.F();
            foregroundAsync.addListener(new j(pVar, foregroundAsync), DirectExecutor.INSTANCE);
            objW = pVar.w();
            if (objW == kotlin.coroutines.intrinsics.a.f()) {
                d9.e.c(cVar);
            }
        }
        return objW == kotlin.coroutines.intrinsics.a.f() ? objW : y8.s.f25199a;
    }

    @Nullable
    public final Object setProgress(@NotNull d dVar, @NotNull c9.c cVar) throws Throwable {
        Object objW;
        com.google.common.util.concurrent.a progressAsync = setProgressAsync(dVar);
        kotlin.jvm.internal.p.d(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                objW = progressAsync.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            pVar.F();
            progressAsync.addListener(new j(pVar, progressAsync), DirectExecutor.INSTANCE);
            objW = pVar.w();
            if (objW == kotlin.coroutines.intrinsics.a.f()) {
                d9.e.c(cVar);
            }
        }
        return objW == kotlin.coroutines.intrinsics.a.f() ? objW : y8.s.f25199a;
    }

    @Override // androidx.work.ListenableWorker
    @NotNull
    public final com.google.common.util.concurrent.a startWork() {
        kotlinx.coroutines.k.d(k0.a(getCoroutineContext().plus(this.job)), null, null, new C05121(null), 3, null);
        return this.future;
    }
}
