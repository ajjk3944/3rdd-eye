package com.unity3d.ads.adplayer;

import c9.c;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.j0;
import l9.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$applySafeAreaInsets$1$1", f = "AndroidWebViewContainer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nAndroidWebViewContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidWebViewContainer.kt\ncom/unity3d/ads/adplayer/AndroidWebViewContainer$applySafeAreaInsets$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
/* loaded from: classes3.dex */
public final class AndroidWebViewContainer$applySafeAreaInsets$1$1 extends SuspendLambda implements p {
    final /* synthetic */ String $js;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidWebViewContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewContainer$applySafeAreaInsets$1$1(AndroidWebViewContainer androidWebViewContainer, String str, c cVar) {
        super(2, cVar);
        this.this$0 = androidWebViewContainer;
        this.$js = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c create(@Nullable Object obj, @NotNull c cVar) {
        AndroidWebViewContainer$applySafeAreaInsets$1$1 androidWebViewContainer$applySafeAreaInsets$1$1 = new AndroidWebViewContainer$applySafeAreaInsets$1$1(this.this$0, this.$js, cVar);
        androidWebViewContainer$applySafeAreaInsets$1$1.L$0 = obj;
        return androidWebViewContainer$applySafeAreaInsets$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        kotlin.coroutines.intrinsics.a.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        AndroidWebViewContainer androidWebViewContainer = this.this$0;
        String str = this.$js;
        try {
            Result.Companion companion = Result.INSTANCE;
            androidWebViewContainer.getWebView().evaluateJavascript(str, null);
            Result.b(s.f25199a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.b(kotlin.c.a(th));
        }
        return s.f25199a;
    }

    @Override // l9.p
    @Nullable
    public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
        return ((AndroidWebViewContainer$applySafeAreaInsets$1$1) create(j0Var, cVar)).invokeSuspend(s.f25199a);
    }
}
