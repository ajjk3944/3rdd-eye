package com.instagram.common.viewpoint.core;

import android.media.AudioDeviceInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.8z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC03478z {
    void A59(C1996qI c1996qI, int i4, int[] iArr) throws C03428s;

    void A5z();

    void A6M();

    void A6T();

    long A7f(boolean z3);

    C1975px A8m();

    boolean A9e(ByteBuffer byteBuffer, long j, int i4) throws C03468y, C03438t;

    void A9h();

    boolean A9o();

    boolean AAP();

    void AH0();

    void AH2() throws C03468y;

    void AJG(C2002qQ c2002qQ);

    void AJH(int i4);

    void AJI(AnonymousClass21 anonymousClass21);

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Enable Retry Audio Track")
    void AJQ(boolean z3);

    void AJV(InterfaceC03448v interfaceC03448v);

    void AJd(C1975px c1975px);

    void AJg(C8O c8o);

    void AJi(AudioDeviceInfo audioDeviceInfo);

    void AJo(boolean z3);

    boolean AKN(C1996qI c1996qI);

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    boolean AKP(int i4, int i10);

    void flush();

    void pause();

    void setVolume(float f10);
}
