package u;

import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34698b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f34699c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f34700d;

    public e(g gVar, int i4, int i10, Bundle bundle) {
        this.f34700d = gVar;
        this.f34697a = i4;
        this.f34698b = i10;
        this.f34699c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34700d.f34708b.onActivityResized(this.f34697a, this.f34698b, this.f34699c);
    }
}
