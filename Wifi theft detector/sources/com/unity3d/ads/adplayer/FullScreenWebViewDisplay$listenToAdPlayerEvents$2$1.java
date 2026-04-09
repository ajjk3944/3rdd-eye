package com.unity3d.ads.adplayer;

import c9.c;
import com.unity3d.ads.adplayer.DisplayMessage;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.s0;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.o;
import l9.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/c;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/flow/c;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1", f = "FullScreenWebViewDisplay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1 extends SuspendLambda implements p {
    final /* synthetic */ o $continuation;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1", f = "FullScreenWebViewDisplay.kt", i = {0}, l = {102}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p {
        final /* synthetic */ o $continuation;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FullScreenWebViewDisplay fullScreenWebViewDisplay, o oVar, c cVar) {
            super(2, cVar);
            this.this$0 = fullScreenWebViewDisplay;
            this.$continuation = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c create(@Nullable Object obj, @NotNull c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$continuation, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            j0 j0Var;
            Object objF = kotlin.coroutines.intrinsics.a.f();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                j0 j0Var2 = (j0) this.L$0;
                s0 displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                DisplayMessage.WebViewInstanceRequest webViewInstanceRequest = new DisplayMessage.WebViewInstanceRequest(this.this$0.opportunityId);
                this.L$0 = j0Var2;
                this.label = 1;
                if (displayMessages.emit(webViewInstanceRequest, this) == objF) {
                    return objF;
                }
                j0Var = j0Var2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j0Var = (j0) this.L$0;
                kotlin.c.b(obj);
            }
            k0.f(j0Var);
            o oVar = this.$continuation;
            Result.Companion companion = Result.INSTANCE;
            s sVar = s.f25199a;
            oVar.resumeWith(Result.b(sVar));
            return sVar;
        }

        @Override // l9.p
        @Nullable
        public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
            return ((AnonymousClass1) create(j0Var, cVar)).invokeSuspend(s.f25199a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, o oVar, c cVar) {
        super(2, cVar);
        this.this$0 = fullScreenWebViewDisplay;
        this.$continuation = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c create(@Nullable Object obj, @NotNull c cVar) {
        return new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this.this$0, this.$continuation, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        kotlin.coroutines.intrinsics.a.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        k.d(androidx.lifecycle.o.a(this.this$0), this.this$0.getDispatchers().getDefault(), null, new AnonymousClass1(this.this$0, this.$continuation, null), 2, null);
        return s.f25199a;
    }

    @Override // l9.p
    @Nullable
    public final Object invoke(@NotNull kotlinx.coroutines.flow.c cVar, @Nullable c cVar2) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1) create(cVar, cVar2)).invokeSuspend(s.f25199a);
    }
}
