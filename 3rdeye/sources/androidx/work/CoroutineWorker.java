package androidx.work;

import A9.A;
import A9.C0572d0;
import A9.C0575f;
import A9.C0583j;
import A9.C0599r0;
import A9.E;
import A9.F;
import A9.U;
import C.V;
import F9.C0663f;
import android.content.Context;
import androidx.work.l;
import b9.C1992A;
import d2.AbstractC4266a;
import d2.C4268c;
import f9.InterfaceC4347e;
import java.util.concurrent.ExecutionException;

/* compiled from: CoroutineWorker.kt */
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends l {
    private final A coroutineContext;
    private final C4268c<l.a> future;
    private final A9.r job;

    /* compiled from: CoroutineWorker.kt */
    @h9.e(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public k f16842l;

        /* renamed from: m, reason: collision with root package name */
        public int f16843m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ k<h> f16844n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ CoroutineWorker f16845o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k<h> kVar, CoroutineWorker coroutineWorker, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f16844n = kVar;
            this.f16845o = coroutineWorker;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f16844n, this.f16845o, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            k<h> kVar;
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f16843m;
            if (i == 0) {
                b9.n.b(obj);
                k<h> kVar2 = this.f16844n;
                this.f16842l = kVar2;
                this.f16843m = 1;
                Object foregroundInfo = this.f16845o.getForegroundInfo(this);
                if (foregroundInfo == aVar) {
                    return aVar;
                }
                kVar = kVar2;
                obj = foregroundInfo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kVar = this.f16842l;
                b9.n.b(obj);
            }
            kVar.f16945b.i(obj);
            return C1992A.f18074a;
        }
    }

    /* compiled from: CoroutineWorker.kt */
    @h9.e(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
    public static final class b extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f16846l;

        public b(InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return CoroutineWorker.this.new b(interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f16846l;
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            try {
                if (i == 0) {
                    b9.n.b(obj);
                    this.f16846l = 1;
                    obj = coroutineWorker.doWork(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b9.n.b(obj);
                }
                coroutineWorker.getFuture$work_runtime_release().i((l.a) obj);
            } catch (Throwable th) {
                coroutineWorker.getFuture$work_runtime_release().j(th);
            }
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        kotlin.jvm.internal.l.f(appContext, "appContext");
        kotlin.jvm.internal.l.f(params, "params");
        this.job = C0572d0.a();
        C4268c<l.a> c4268c = new C4268c<>();
        this.future = c4268c;
        c4268c.addListener(new V(this, 7), getTaskExecutor().c());
        this.coroutineContext = U.f211a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CoroutineWorker this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        if (this$0.future.f37349b instanceof AbstractC4266a.b) {
            this$0.job.c(null);
        }
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, InterfaceC4347e<? super h> interfaceC4347e) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(InterfaceC4347e<? super l.a> interfaceC4347e);

    public A getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(InterfaceC4347e<? super h> interfaceC4347e) {
        return getForegroundInfo$suspendImpl(this, interfaceC4347e);
    }

    @Override // androidx.work.l
    public final A4.a<h> getForegroundInfoAsync() {
        C0599r0 c0599r0A = C0572d0.a();
        C0663f c0663fA = F.a(getCoroutineContext().plus(c0599r0A));
        k kVar = new k(c0599r0A);
        C0575f.e(c0663fA, null, null, new a(kVar, this, null), 3);
        return kVar;
    }

    public final C4268c<l.a> getFuture$work_runtime_release() {
        return this.future;
    }

    public final A9.r getJob$work_runtime_release() {
        return this.job;
    }

    @Override // androidx.work.l
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public final Object setForeground(h hVar, InterfaceC4347e<? super C1992A> interfaceC4347e) throws Throwable {
        A4.a<Void> foregroundAsync = setForegroundAsync(hVar);
        kotlin.jvm.internal.l.e(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e4) {
                Throwable cause = e4.getCause();
                if (cause == null) {
                    throw e4;
                }
                throw cause;
            }
        } else {
            C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(interfaceC4347e));
            c0583j.s();
            foregroundAsync.addListener(new U1.a(c0583j, foregroundAsync), f.INSTANCE);
            c0583j.u(new F7.h(foregroundAsync, 7));
            Object objR = c0583j.r();
            if (objR == g9.a.COROUTINE_SUSPENDED) {
                return objR;
            }
        }
        return C1992A.f18074a;
    }

    public final Object setProgress(e eVar, InterfaceC4347e<? super C1992A> interfaceC4347e) throws Throwable {
        A4.a<Void> progressAsync = setProgressAsync(eVar);
        kotlin.jvm.internal.l.e(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e4) {
                Throwable cause = e4.getCause();
                if (cause == null) {
                    throw e4;
                }
                throw cause;
            }
        } else {
            C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(interfaceC4347e));
            c0583j.s();
            progressAsync.addListener(new U1.a(c0583j, progressAsync), f.INSTANCE);
            c0583j.u(new F7.h(progressAsync, 7));
            Object objR = c0583j.r();
            if (objR == g9.a.COROUTINE_SUSPENDED) {
                return objR;
            }
        }
        return C1992A.f18074a;
    }

    @Override // androidx.work.l
    public final A4.a<l.a> startWork() {
        C0575f.e(F.a(getCoroutineContext().plus(this.job)), null, null, new b(null), 3);
        return this.future;
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }
}
