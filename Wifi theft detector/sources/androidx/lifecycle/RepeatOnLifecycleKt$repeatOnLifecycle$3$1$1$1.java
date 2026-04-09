package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.r1;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/n;", "<anonymous parameter 0>", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "Ly8/s;", "onStateChanged", "(Landroidx/lifecycle/n;Landroidx/lifecycle/Lifecycle$Event;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.Event f3459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f3460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.j0 f3461c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.Event f3462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.o f3463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.sync.a f3464f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l9.p f3465g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", i = {0, 1}, l = {171, 110}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,165:1\n107#2,10:166\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1\n*L\n109#1:166,10\n*E\n"})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements l9.p {
        final /* synthetic */ l9.p $block;
        final /* synthetic */ kotlinx.coroutines.sync.a $mutex;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kotlinx.coroutines.sync.a aVar, l9.p pVar, c9.c cVar) {
            super(2, cVar);
            this.$mutex = aVar;
            this.$block = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c9.c create(Object obj, c9.c cVar) {
            return new AnonymousClass1(this.$mutex, this.$block, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            l9.p pVar;
            kotlinx.coroutines.sync.a aVar2;
            Throwable th;
            Object objF = kotlin.coroutines.intrinsics.a.f();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    aVar = this.$mutex;
                    pVar = this.$block;
                    this.L$0 = aVar;
                    this.L$1 = pVar;
                    this.label = 1;
                    if (aVar.a(null, this) != objF) {
                    }
                    return objF;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (kotlinx.coroutines.sync.a) this.L$0;
                    try {
                        kotlin.c.b(obj);
                        y8.s sVar = y8.s.f25199a;
                        aVar2.b(null);
                        return y8.s.f25199a;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2.b(null);
                        throw th;
                    }
                }
                pVar = (l9.p) this.L$1;
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.L$0;
                kotlin.c.b(obj);
                aVar = aVar3;
                RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(pVar, null);
                this.L$0 = aVar;
                this.L$1 = null;
                this.label = 2;
                if (kotlinx.coroutines.k0.e(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) != objF) {
                    aVar2 = aVar;
                    y8.s sVar2 = y8.s.f25199a;
                    aVar2.b(null);
                    return y8.s.f25199a;
                }
                return objF;
            } catch (Throwable th3) {
                aVar2 = aVar;
                th = th3;
                aVar2.b(null);
                throw th;
            }
        }

        @Override // l9.p
        public final Object invoke(kotlinx.coroutines.j0 j0Var, c9.c cVar) {
            return ((AnonymousClass1) create(j0Var, cVar)).invokeSuspend(y8.s.f25199a);
        }
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [T, kotlinx.coroutines.r1] */
    @Override // androidx.lifecycle.j
    public final void onStateChanged(n nVar, Lifecycle.Event event) {
        kotlin.jvm.internal.p.e(nVar, "<anonymous parameter 0>");
        kotlin.jvm.internal.p.e(event, "event");
        if (event == this.f3459a) {
            this.f3460b.element = kotlinx.coroutines.k.d(this.f3461c, null, null, new AnonymousClass1(this.f3464f, this.f3465g, null), 3, null);
            return;
        }
        if (event == this.f3462d) {
            r1 r1Var = (r1) this.f3460b.element;
            if (r1Var != null) {
                r1.a.a(r1Var, null, 1, null);
            }
            this.f3460b.element = null;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            kotlinx.coroutines.o oVar = this.f3463e;
            Result.Companion companion = Result.INSTANCE;
            oVar.resumeWith(Result.b(y8.s.f25199a));
        }
    }
}
