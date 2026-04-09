package com.unity3d.ads.adplayer;

import com.unity3d.services.core.device.Storage;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.g0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/unity3d/ads/adplayer/WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/g0;", "Lkotlin/coroutines/d;", "context", "", "exception", "Ly8/s;", "handleException", "(Lkotlin/coroutines/d;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 WebViewAdPlayer.kt\ncom/unity3d/ads/adplayer/WebViewAdPlayer\n*L\n1#1,110:1\n76#2,2:111\n*E\n"})
/* loaded from: classes3.dex */
public final class WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1 extends kotlin.coroutines.a implements g0 {
    final /* synthetic */ WebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1(g0.b bVar, WebViewAdPlayer webViewAdPlayer) {
        super(bVar);
        this.this$0 = webViewAdPlayer;
    }

    @Override // kotlinx.coroutines.g0
    public void handleException(@NotNull d context, @NotNull Throwable exception) {
        Storage.INSTANCE.removeStorageEventCallback(this.this$0.storageEventCallback);
    }
}
