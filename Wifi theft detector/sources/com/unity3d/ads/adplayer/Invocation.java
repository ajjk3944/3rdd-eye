package com.unity3d.ads.adplayer;

import c9.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.x;
import kotlinx.coroutines.z;
import l9.l;
import l9.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\f\u001a\u00020\u000b2\u001e\b\u0002\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/unity3d/ads/adplayer/Invocation;", "", "", "location", "", "parameters", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lc9/c;", "handler", "Ly8/s;", "handle", "(Ll9/l;Lc9/c;)Ljava/lang/Object;", "getResult", "(Lc9/c;)Ljava/lang/Object;", "Ljava/lang/String;", "getLocation", "()Ljava/lang/String;", "[Ljava/lang/Object;", "getParameters", "()[Ljava/lang/Object;", "Lkotlinx/coroutines/x;", "_isHandled", "Lkotlinx/coroutines/x;", "completableDeferred", "Lkotlinx/coroutines/o0;", "isHandled", "()Lkotlinx/coroutines/o0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Invocation {

    @NotNull
    private final x _isHandled;

    @NotNull
    private final x completableDeferred;

    @NotNull
    private final String location;

    @NotNull
    private final Object[] parameters;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ly8/s;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.unity3d.ads.adplayer.Invocation$handle$2", f = "Invocation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.Invocation$handle$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements l {
        int label;

        public AnonymousClass2(c cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c create(@NotNull c cVar) {
            return new AnonymousClass2(cVar);
        }

        @Override // l9.l
        @Nullable
        public final Object invoke(@Nullable c cVar) {
            return ((AnonymousClass2) create(cVar)).invokeSuspend(s.f25199a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return s.f25199a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.unity3d.ads.adplayer.Invocation$handle$3", f = "Invocation.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.Invocation$handle$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements p {
        final /* synthetic */ l $handler;
        int label;
        final /* synthetic */ Invocation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(l lVar, Invocation invocation, c cVar) {
            super(2, cVar);
            this.$handler = lVar;
            this.this$0 = invocation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c create(@Nullable Object obj, @NotNull c cVar) {
            return new AnonymousClass3(this.$handler, this.this$0, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objF = kotlin.coroutines.intrinsics.a.f();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    l lVar = this.$handler;
                    this.label = 1;
                    obj = lVar.invoke(this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                this.this$0.completableDeferred.p(obj);
            } catch (Throwable th) {
                this.this$0.completableDeferred.o(th);
            }
            return s.f25199a;
        }

        @Override // l9.p
        @Nullable
        public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
            return ((AnonymousClass3) create(j0Var, cVar)).invokeSuspend(s.f25199a);
        }
    }

    public Invocation(@NotNull String location, @NotNull Object[] parameters) {
        kotlin.jvm.internal.p.e(location, "location");
        kotlin.jvm.internal.p.e(parameters, "parameters");
        this.location = location;
        this.parameters = parameters;
        this._isHandled = z.b(null, 1, null);
        this.completableDeferred = z.b(null, 1, null);
    }

    public static /* synthetic */ Object handle$default(Invocation invocation, l lVar, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = new AnonymousClass2(null);
        }
        return invocation.handle(lVar, cVar);
    }

    @NotNull
    public final String getLocation() {
        return this.location;
    }

    @NotNull
    public final Object[] getParameters() {
        return this.parameters;
    }

    @Nullable
    public final Object getResult(@NotNull c cVar) {
        return this.completableDeferred.q(cVar);
    }

    @Nullable
    public final Object handle(@NotNull l lVar, @NotNull c cVar) {
        x xVar = this._isHandled;
        s sVar = s.f25199a;
        xVar.p(sVar);
        k.d(k0.a(cVar.getContext()), null, null, new AnonymousClass3(lVar, this, null), 3, null);
        return sVar;
    }

    @NotNull
    public final o0 isHandled() {
        return this._isHandled;
    }
}
