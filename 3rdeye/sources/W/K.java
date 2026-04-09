package W;

import android.media.MediaScannerConnection;
import android.net.Uri;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class K implements MediaScannerConnection.OnScanCompletedListener {
    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, Uri uri) {
        if (uri != null) {
            C.S.a("Recorder", String.format("File scan completed successfully [path: %s, URI: %s]", str, uri));
            return;
        }
        C.S.b("Recorder", "File scanning operation failed [path: " + str + "]");
    }
}
