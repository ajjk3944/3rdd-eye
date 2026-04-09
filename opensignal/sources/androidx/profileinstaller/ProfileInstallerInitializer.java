package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import f7.f;
import io.sentry.hints.i;
import java.util.Collections;
import java.util.List;
import r7.b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // r7.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // r7.b
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new f(this, context.getApplicationContext()));
        return new i(7);
    }
}
