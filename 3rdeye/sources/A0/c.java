package a0;

import H.g;
import Z.k;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;

/* compiled from: Api29Impl.java */
/* loaded from: classes.dex */
public final class c {
    public static AudioRecordingConfiguration a(AudioRecord audioRecord) {
        return audioRecord.getActiveRecordingConfiguration();
    }

    public static boolean b(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.isClientSilenced();
    }

    public static void c(AudioRecord audioRecord, g gVar, k.a aVar) {
        audioRecord.registerAudioRecordingCallback(gVar, aVar);
    }

    public static void d(AudioRecord audioRecord, k.a aVar) {
        audioRecord.unregisterAudioRecordingCallback(aVar);
    }
}
