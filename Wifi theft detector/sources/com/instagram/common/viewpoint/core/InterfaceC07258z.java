package com.instagram.common.viewpoint.core;

import android.media.AudioDeviceInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.8z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC07258z {
    void A59(C2374qI c2374qI, int i10, int[] iArr) throws C07208s;

    void A5z();

    void A6M();

    void A6T();

    long A7f(boolean z10);

    C2353px A8m();

    boolean A9e(ByteBuffer byteBuffer, long j10, int i10) throws C07248y, C07218t;

    void A9h();

    boolean A9o();

    boolean AAP();

    void AH0();

    void AH2() throws C07248y;

    void AJG(C2380qQ c2380qQ);

    void AJH(int i10);

    void AJI(AnonymousClass21 anonymousClass21);

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Enable Retry Audio Track")
    void AJQ(boolean z10);

    void AJV(InterfaceC07228v interfaceC07228v);

    void AJd(C2353px c2353px);

    void AJg(C8O c8o);

    void AJi(AudioDeviceInfo audioDeviceInfo);

    void AJo(boolean z10);

    boolean AKN(C2374qI c2374qI);

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    boolean AKP(int i10, int i11);

    void flush();

    void pause();

    void setVolume(float f10);
}
