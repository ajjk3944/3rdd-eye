package com.vungle.ads.internal.presenter;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.VungleError;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class a {

    @NotNull
    public static final C0370a Companion = new C0370a(null);

    @NotNull
    private static final String TAG = "AdEventListener";
    private boolean adRewarded;

    @Nullable
    private q7.h placement;

    @Nullable
    private final b playAdCallback;

    /* renamed from: com.vungle.ads.internal.presenter.a$a, reason: collision with other inner class name */
    public static final class C0370a {
        public /* synthetic */ C0370a(kotlin.jvm.internal.i iVar) {
            this();
        }

        private C0370a() {
        }
    }

    public a(@Nullable b bVar, @Nullable q7.h hVar) {
        this.playAdCallback = bVar;
        this.placement = hVar;
    }

    public final void onError(@NotNull VungleError error, @Nullable String str) {
        p.e(error, "error");
        b bVar = this.playAdCallback;
        if (bVar != null) {
            bVar.onFailure(error);
            com.vungle.ads.internal.util.p.Companion.e(TAG, "AdEventListener#PlayAdCallback " + str, error);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void onNext(@NotNull String s10, @Nullable String str, @Nullable String str2) {
        q7.h hVar;
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        p.e(s10, "s");
        com.vungle.ads.internal.util.p.Companion.d(TAG, "s=" + s10 + ", value=" + str + ", id=" + str2);
        switch (s10.hashCode()) {
            case -1912374177:
                if (s10.equals(MRAIDPresenter.SUCCESSFUL_VIEW) && (hVar = this.placement) != null && hVar.isRewardedVideo() && !this.adRewarded) {
                    this.adRewarded = true;
                    b bVar5 = this.playAdCallback;
                    if (bVar5 != null) {
                        bVar5.onAdRewarded(str2);
                        break;
                    }
                }
                break;
            case -1627831289:
                if (s10.equals("adViewed") && (bVar = this.playAdCallback) != null) {
                    bVar.onAdImpression(str2);
                    break;
                }
                break;
            case 100571:
                if (s10.equals(TtmlNode.END) && (bVar2 = this.playAdCallback) != null) {
                    bVar2.onAdEnd(str2);
                    break;
                }
                break;
            case 3417674:
                if (s10.equals(MRAIDPresenter.OPEN)) {
                    if (!p.a(str, "adClick")) {
                        if (p.a(str, "adLeftApplication") && (bVar3 = this.playAdCallback) != null) {
                            bVar3.onAdLeftApplication(str2);
                            break;
                        }
                    } else {
                        b bVar6 = this.playAdCallback;
                        if (bVar6 != null) {
                            bVar6.onAdClick(str2);
                            break;
                        }
                    }
                }
                break;
            case 109757538:
                if (s10.equals("start") && (bVar4 = this.playAdCallback) != null) {
                    bVar4.onAdStart(str2);
                    break;
                }
                break;
        }
    }
}
