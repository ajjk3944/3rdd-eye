package u;

import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34689b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f34690c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f34691d;

    public /* synthetic */ c(g gVar, String str, Bundle bundle, int i4) {
        this.f34688a = i4;
        this.f34691d = gVar;
        this.f34689b = str;
        this.f34690c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34688a) {
            case 0:
                this.f34691d.f34708b.extraCallback(this.f34689b, this.f34690c);
                break;
            default:
                this.f34691d.f34708b.onPostMessage(this.f34689b, this.f34690c);
                break;
        }
    }
}
