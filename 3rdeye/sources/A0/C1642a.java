package a0;

import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;

/* compiled from: Api24Impl.java */
/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1642a {
    public static int a(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.getClientAudioSessionId();
    }

    public static int b(AudioRecord audioRecord, AudioTimestamp audioTimestamp) {
        return audioRecord.getTimestamp(audioTimestamp, 0);
    }
}
