package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ll implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Uri g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Bundle i;
    public final /* synthetic */ nl j;

    public ll(nl nlVar, int i, Uri uri, boolean z, Bundle bundle) {
        this.j = nlVar;
        this.f = i;
        this.g = uri;
        this.h = z;
        this.i = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.j.g.g(this.f, this.g, this.h, this.i);
    }
}
