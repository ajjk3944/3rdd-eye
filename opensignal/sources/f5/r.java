package f5;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class r {
    public static void a(AudioTrack audioTrack, t tVar) {
        audioTrack.setPreferredDevice(tVar == null ? null : tVar.f8581a);
    }
}
