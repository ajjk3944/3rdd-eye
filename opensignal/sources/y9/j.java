package y9;

import com.google.android.exoplayer2.Format;

/* loaded from: classes.dex */
public interface j {
    void onAudioCodecError(Exception exc);

    void onAudioDecoderInitialized(String str, long j, long j7);

    void onAudioDecoderReleased(String str);

    void onAudioDisabled(z9.b bVar);

    void onAudioEnabled(z9.b bVar);

    void onAudioInputFormatChanged(Format format);

    void onAudioInputFormatChanged(Format format, z9.e eVar);

    void onAudioPositionAdvancing(long j);

    void onAudioSinkError(Exception exc);

    void onAudioUnderrun(int i10, long j, long j7);

    void onSkipSilenceEnabledChanged(boolean z10);
}
