package u;

import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34702b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f34703c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f34704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f34705e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f34706f;
    public final /* synthetic */ g g;

    public f(g gVar, int i4, int i10, int i11, int i12, int i13, Bundle bundle) {
        this.g = gVar;
        this.f34701a = i4;
        this.f34702b = i10;
        this.f34703c = i11;
        this.f34704d = i12;
        this.f34705e = i13;
        this.f34706f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.f34708b.onActivityLayout(this.f34701a, this.f34702b, this.f34703c, this.f34704d, this.f34705e, this.f34706f);
    }
}
