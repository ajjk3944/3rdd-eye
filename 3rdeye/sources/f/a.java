package F;

import android.media.EncoderProfiles;
import androidx.camera.core.impl.C1685e;
import androidx.camera.core.impl.C1687f;
import androidx.camera.core.impl.C1689g;
import androidx.camera.core.impl.InterfaceC1680b0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: EncoderProfilesProxyCompatApi31Impl.java */
/* loaded from: classes.dex */
public final class a {
    public static C1687f a(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(new C1685e(audioProfile.getCodec(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile(), audioProfile.getMediaType()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(new C1689g(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), 8, 0, 0));
        }
        return InterfaceC1680b0.b.e(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }
}
