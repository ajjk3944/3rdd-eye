package com.iab.omid.library.applovin.adsession.media;

import com.singular.sdk.internal.Constants;
import com.vungle.ads.internal.g;

/* loaded from: classes2.dex */
public enum PlayerState {
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL(Constants.NORMAL),
    EXPANDED("expanded"),
    FULLSCREEN(g.TEMPLATE_TYPE_FULLSCREEN);

    private final String playerState;

    PlayerState(String str) {
        this.playerState = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.playerState;
    }
}
