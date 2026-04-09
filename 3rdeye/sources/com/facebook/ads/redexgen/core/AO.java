package com.facebook.ads.redexgen.core;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* loaded from: assets/audience_network.dex */
public interface AO {
    @MetaExoPlayerCustomization("No longer in upstream exo")
    void A50(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i, Object obj);

    int A5k();

    int A5m(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer A8B(int i);

    ByteBuffer A8W(int i);

    MediaFormat A8X();

    @MetaExoPlayerCustomization("Added in D39791066")
    Pair<Long, Integer> A8b();

    @MetaExoPlayerCustomization("Added in D39791066")
    int A9C();

    void AGY(int i, int i10, int i11, long j4, int i12);

    void AGa(int i, int i10, C5N c5n, long j4, int i11);

    void AGr();

    void AGx(int i, long j4);

    void AGy(int i, boolean z10);

    void AIq(AN an, Handler handler);

    void AIr(Surface surface);

    void AJ8(int i);

    void flush();

    @MetaExoPlayerCustomization("No longer in upstream exo")
    @Deprecated
    void reset();

    @MetaExoPlayerCustomization("No longer in upstream exo")
    void start();

    @MetaExoPlayerCustomization("No longer in upstream exo")
    @Deprecated
    void stop();
}
