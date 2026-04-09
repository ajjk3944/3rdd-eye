package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.fk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC1376fk {
    void A9d();

    boolean A9q();

    boolean A9r();

    boolean AAc();

    void AGr(boolean z3, int i4);

    void AK1(int i4);

    void AK6(EnumC1323et enumC1323et, int i4);

    void AKF(int i4);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    EnumC1323et getStartReason();

    EnumC1378fm getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i4);

    void setBackgroundPlaybackEnabled(boolean z3);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z3);

    void setRequestedVolume(float f10);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(InterfaceC1379fn interfaceC1379fn);

    void setup(Uri uri);
}
