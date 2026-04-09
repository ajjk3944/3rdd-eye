package androidx.media3.exoplayer.trackselection;

import a5.d0;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Handler;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Spatializer f1914a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1915b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f1916c;

    /* renamed from: d, reason: collision with root package name */
    public o f1917d;

    public p(Spatializer spatializer) {
        this.f1914a = spatializer;
        this.f1915b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public final boolean a(androidx.media3.common.f fVar, androidx.media3.common.r rVar) throws IllegalArgumentException {
        String str = rVar.H;
        int i10 = rVar.U;
        if ("audio/eac3-joc".equals(str) && i10 == 16) {
            i10 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(d0.m(i10));
        int i11 = rVar.V;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        return this.f1914a.canBeSpatialized((AudioAttributes) fVar.a().f2481d, channelMask.build());
    }
}
