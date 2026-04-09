package u;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f34693b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f34694c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f34695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f34696e;

    public d(g gVar, int i4, Uri uri, boolean z3, Bundle bundle) {
        this.f34696e = gVar;
        this.f34692a = i4;
        this.f34693b = uri;
        this.f34694c = z3;
        this.f34695d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34696e.f34708b.onRelationshipValidationResult(this.f34692a, this.f34693b, this.f34694c, this.f34695d);
    }
}
