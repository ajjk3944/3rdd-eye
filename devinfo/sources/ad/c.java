package ad;

import android.window.OnBackInvokedCallback;
import i.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f328b;

    public /* synthetic */ c(int i4, Object obj) {
        this.f327a = i4;
        this.f328b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f327a) {
            case 0:
                ((b) this.f328b).b();
                break;
            case 1:
                ((v) this.f328b).F();
                break;
            case 2:
                ((k5.j) this.f328b).a();
                break;
            default:
                ((Runnable) this.f328b).run();
                break;
        }
    }
}
