package com.unity3d.ads.adplayer;

import androidx.annotation.CallSuper;
import c9.c;
import com.unity3d.ads.adplayer.AdPlayer;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/unity3d/ads/adplayer/EmbeddableAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface EmbeddableAdPlayer extends AdPlayer {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @CallSuper
        @Nullable
        public static Object destroy(@NotNull EmbeddableAdPlayer embeddableAdPlayer, @NotNull c cVar) {
            Object objDestroy = AdPlayer.DefaultImpls.destroy(embeddableAdPlayer, cVar);
            return objDestroy == kotlin.coroutines.intrinsics.a.f() ? objDestroy : s.f25199a;
        }

        public static void show(@NotNull EmbeddableAdPlayer embeddableAdPlayer, @NotNull ShowOptions showOptions) {
            p.e(showOptions, "showOptions");
            AdPlayer.DefaultImpls.show(embeddableAdPlayer, showOptions);
        }
    }
}
