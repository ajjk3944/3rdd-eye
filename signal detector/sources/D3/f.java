package D3;

import android.content.ClipData;
import android.media.MediaRecorder;
import android.telephony.TelephonyCallback;
import android.view.ContentInfo;
import com.lefan.signal.ui.noise.NoiseActivity;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* synthetic */ MediaRecorder f(NoiseActivity noiseActivity) {
        return new MediaRecorder(noiseActivity);
    }

    public static /* bridge */ /* synthetic */ TelephonyCallback h(Object obj) {
        return (TelephonyCallback) obj;
    }

    public static /* synthetic */ ContentInfo.Builder i(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo k(Object obj) {
        return (ContentInfo) obj;
    }
}
