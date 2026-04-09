package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
import h6.b;
import j6.i;
import java.util.Collections;
import java.util.List;
import r5.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // h6.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // h6.b
    public final Object create(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new i(12);
        }
        Choreographer.getInstance().postFrameCallback(new f(this, context.getApplicationContext()));
        return new i(12);
    }
}
