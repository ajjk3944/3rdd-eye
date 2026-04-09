package com.vungle.ads.internal.presenter;

import a6.C1661j;
import com.vungle.ads.internal.util.k;
import com.vungle.ads.k0;
import kotlin.jvm.internal.l;

/* compiled from: AdEventListener.kt */
/* loaded from: classes2.dex */
public class a {
    public static final C0387a Companion = new C0387a(null);
    private static final String TAG = "AdEventListener";
    private boolean adRewarded;
    private C1661j placement;
    private final b playAdCallback;

    /* compiled from: AdEventListener.kt */
    /* renamed from: com.vungle.ads.internal.presenter.a$a, reason: collision with other inner class name */
    public static final class C0387a {
        public /* synthetic */ C0387a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private C0387a() {
        }
    }

    public a(b bVar, C1661j c1661j) {
        this.playAdCallback = bVar;
        this.placement = c1661j;
    }

    public final void onError(k0 error, String str) {
        l.f(error, "error");
        b bVar = this.playAdCallback;
        if (bVar != null) {
            bVar.onFailure(error);
            k.Companion.e(TAG, "AdEventListener#PlayAdCallback " + str, error);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void onNext(String s10, String str, String str2) {
        C1661j c1661j;
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        l.f(s10, "s");
        k.a aVar = k.Companion;
        StringBuilder sbD = j6.l.d("s=", s10, ", value=", str, ", id=");
        sbD.append(str2);
        aVar.d(TAG, sbD.toString());
        switch (s10.hashCode()) {
            case -1912374177:
                if (s10.equals(g.SUCCESSFUL_VIEW) && (c1661j = this.placement) != null && c1661j.isRewardedVideo() && !this.adRewarded) {
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
                if (s10.equals("end") && (bVar2 = this.playAdCallback) != null) {
                    bVar2.onAdEnd(str2);
                    break;
                }
                break;
            case 3417674:
                if (s10.equals(g.OPEN)) {
                    if (!l.b(str, "adClick")) {
                        if (l.b(str, "adLeftApplication") && (bVar3 = this.playAdCallback) != null) {
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
