package G0;

import android.app.job.JobInfo;
import android.media.AudioRecordingConfiguration;
import android.media.MediaCodec;
import android.net.Uri;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o {
    public static /* synthetic */ JobInfo.TriggerContentUri b(Uri uri, int i) {
        return new JobInfo.TriggerContentUri(uri, i);
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration d(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern e(int i, int i10) {
        return new MediaCodec.CryptoInfo.Pattern(i, i10);
    }
}
