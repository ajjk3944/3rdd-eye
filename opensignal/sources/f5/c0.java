package f5;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class c0 {
    public static void a(l lVar, Object obj) {
        t tVar;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        z zVar = (z) lVar;
        if (audioDeviceInfo == null) {
            tVar = null;
        } else {
            zVar.getClass();
            tVar = new t(audioDeviceInfo);
        }
        zVar.Y = tVar;
        AudioTrack audioTrack = zVar.f8625u;
        if (audioTrack != null) {
            r.a(audioTrack, tVar);
        }
    }
}
