package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.ms, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC2165ms extends InterfaceC05542c {
    void A47(int i10) throws IOException;

    boolean A48(int i10, boolean z10) throws IOException;

    long A8O();

    long A8i();

    long A8n();

    @MetaExoPlayerCustomization("Added API for MP4 extractor")
    Uri A9P();

    int AGs(byte[] bArr, int i10, int i11) throws IOException;

    void AGt(byte[] bArr, int i10, int i11) throws IOException;

    boolean AGu(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    boolean AHR(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    void AIl();

    int AK0(int i10) throws IOException;

    void AK3(int i10) throws IOException;

    @Override // com.instagram.common.viewpoint.core.InterfaceC05542c
    int read(byte[] bArr, int i10, int i11) throws IOException;

    void readFully(byte[] bArr, int i10, int i11) throws IOException;
}
