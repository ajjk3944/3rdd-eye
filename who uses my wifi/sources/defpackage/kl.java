package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kl implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Bundle h;
    public final /* synthetic */ nl i;

    public /* synthetic */ kl(nl nlVar, String str, Bundle bundle, int i) {
        this.f = i;
        this.i = nlVar;
        this.g = str;
        this.h = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                this.i.g.a(this.h, this.g);
                break;
            default:
                this.i.g.f(this.h, this.g);
                break;
        }
    }
}
