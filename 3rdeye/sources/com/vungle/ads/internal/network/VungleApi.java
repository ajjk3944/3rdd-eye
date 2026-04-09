package com.vungle.ads.internal.network;

import U9.D;
import a6.C1653b;
import a6.C1657f;
import a6.C1658g;
import androidx.annotation.Keep;

/* compiled from: VungleApi.kt */
@Keep
/* loaded from: classes2.dex */
public interface VungleApi {
    a<C1653b> ads(String str, String str2, C1657f c1657f);

    a<C1658g> config(String str, String str2, C1657f c1657f);

    a<Void> pingTPAT(String str, String str2);

    a<Void> ri(String str, String str2, C1657f c1657f);

    a<Void> sendAdMarkup(String str, D d10);

    a<Void> sendErrors(String str, String str2, D d10);

    a<Void> sendMetrics(String str, String str2, D d10);

    void setAppId(String str);
}
