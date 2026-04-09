package com.facebook.ads.redexgen.core;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.mi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3819mi implements InterfaceC2426Aw {
    public MediaCodecInfo[] A00;
    public final int A01;

    public C3819mi(boolean z10, boolean z11) {
        int i;
        if (z10 || z11) {
            i = 1;
        } else {
            i = 0;
        }
        this.A01 = i;
    }

    @EnsuresNonNull({"mediaCodecInfos"})
    private void A00() {
        if (this.A00 == null) {
            this.A00 = new MediaCodecList(this.A01).getCodecInfos();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2426Aw
    public final int A7H() {
        A00();
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2426Aw
    public final MediaCodecInfo A7I(int i) {
        A00();
        return this.A00[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2426Aw
    public final boolean AAI(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2426Aw
    public final boolean AAJ(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2426Aw
    public final boolean AIK() {
        return true;
    }
}
