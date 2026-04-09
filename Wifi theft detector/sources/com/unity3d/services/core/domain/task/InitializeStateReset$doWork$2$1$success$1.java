package com.unity3d.services.core.domain.task;

import c9.c;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.i;
import kotlinx.coroutines.j0;
import l9.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1", f = "InitializeStateReset.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class InitializeStateReset$doWork$2$1$success$1 extends SuspendLambda implements p {
    final /* synthetic */ WebViewApp $currentApp;
    int label;
    final /* synthetic */ InitializeStateReset this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1$1", f = "InitializeStateReset.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p {
        final /* synthetic */ WebViewApp $currentApp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WebViewApp webViewApp, c cVar) {
            super(2, cVar);
            this.$currentApp = webViewApp;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c create(@Nullable Object obj, @NotNull c cVar) {
            return new AnonymousClass1(this.$currentApp, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            WebView webView = this.$currentApp.getWebView();
            if (webView != null) {
                webView.destroy();
            }
            this.$currentApp.setWebView(null);
            return s.f25199a;
        }

        @Override // l9.p
        @Nullable
        public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
            return ((AnonymousClass1) create(j0Var, cVar)).invokeSuspend(s.f25199a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$2$1$success$1(InitializeStateReset initializeStateReset, WebViewApp webViewApp, c cVar) {
        super(2, cVar);
        this.this$0 = initializeStateReset;
        this.$currentApp = webViewApp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c create(@Nullable Object obj, @NotNull c cVar) {
        return new InitializeStateReset$doWork$2$1$success$1(this.this$0, this.$currentApp, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objF = a.f();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            CoroutineDispatcher main = this.this$0.dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentApp, null);
            this.label = 1;
            if (i.g(main, anonymousClass1, this) == objF) {
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
    @Nullable
    public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
        return ((InitializeStateReset$doWork$2$1$success$1) create(j0Var, cVar)).invokeSuspend(s.f25199a);
    }
}
