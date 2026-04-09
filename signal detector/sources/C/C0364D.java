package c;

import android.window.OnBackInvokedCallback;
import z3.InterfaceC3017b;

/* renamed from: c.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0364D implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5789b;

    public /* synthetic */ C0364D(int i, Object obj) {
        this.f5788a = i;
        this.f5789b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f5788a) {
            case 0:
                p5.a aVar = (p5.a) this.f5789b;
                q5.i.e(aVar, "$onBackInvoked");
                aVar.b();
                break;
            case 1:
                ((h.v) this.f5789b).K();
                break;
            case 2:
                ((Runnable) this.f5789b).run();
                break;
            default:
                ((InterfaceC3017b) this.f5789b).b();
                break;
        }
    }
}
