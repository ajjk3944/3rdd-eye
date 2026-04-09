package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import javax.annotation.Nullable;

@MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "Encapsulate error info from subtitle decoder")
/* renamed from: com.facebook.ads.redexgen.X.Dp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2494Dp {

    @Nullable
    public final C3949or A00;
    public final Throwable A01;

    public C2494Dp(@Nullable C3949or c3949or, Throwable th) {
        this.A00 = c3949or;
        this.A01 = th;
    }
}
