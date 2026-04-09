package androidx.work;

import android.content.Context;
import defpackage.h80;
import defpackage.ha1;
import defpackage.pz;
import defpackage.ru0;
import defpackage.t20;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements t20 {
    static {
        h80.f("WrkMgrInitializer");
    }

    @Override // defpackage.t20
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.t20
    public final Object b(Context context) {
        h80.d().a(new Throwable[0]);
        ha1.k0(context, new ru0(new pz(15)));
        return ha1.j0(context);
    }
}
