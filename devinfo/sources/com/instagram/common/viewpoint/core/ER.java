package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import javax.annotation.Nullable;

@MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "Encapsulate error info from subtitle decoder")
/* loaded from: assets/audience_network/classes2.dex */
public class ER {

    @Nullable
    public final C1996qI A00;
    public final Throwable A01;

    public ER(@Nullable C1996qI c1996qI, Throwable th2) {
        this.A00 = c1996qI;
        this.A01 = th2;
    }
}
