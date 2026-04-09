package d0;

import android.media.MediaCodecInfo;
import java.util.Objects;

/* compiled from: EncoderInfoImpl.java */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f37311a;

    public v(MediaCodecInfo mediaCodecInfo, String str) throws y {
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.f37311a = capabilitiesForType;
        } catch (RuntimeException e4) {
            throw new y(androidx.work.s.d("Unable to get CodecCapabilities for mime: ", str), e4);
        }
    }
}
