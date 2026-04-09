package g2;

import android.os.Bundle;
import d2.C4268c;
import r.InterfaceC5503a;
import s.BinderC5541e;

/* compiled from: RemoteClientUtils.java */
/* renamed from: g2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4378b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37943b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37944c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f37945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f37946e;

    public RunnableC4378b(C4268c c4268c, InterfaceC5503a interfaceC5503a, C4268c c4268c2) {
        this.f37944c = c4268c;
        this.f37946e = interfaceC5503a;
        this.f37945d = c4268c2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37943b) {
            case 0:
                C4268c c4268c = (C4268c) this.f37945d;
                try {
                    c4268c.i(((InterfaceC5503a) this.f37946e).apply(((C4268c) this.f37944c).get()));
                    break;
                } catch (Throwable th) {
                    th = th;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    c4268c.j(th);
                    return;
                }
            default:
                ((BinderC5541e) this.f37946e).f45882c.onPostMessage((String) this.f37944c, (Bundle) this.f37945d);
                break;
        }
    }

    public RunnableC4378b(BinderC5541e binderC5541e, String str, Bundle bundle) {
        this.f37946e = binderC5541e;
        this.f37944c = str;
        this.f37945d = bundle;
    }
}
