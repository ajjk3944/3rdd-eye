package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.p4;
import defpackage.pz;
import defpackage.t20;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements t20 {
    @Override // defpackage.t20
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.t20
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new p4(this, context.getApplicationContext()));
        return new pz(28);
    }
}
