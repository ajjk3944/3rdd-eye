package r;

import android.os.Bundle;

/* renamed from: r.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2860c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23304b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f23305c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC2862e f23306d;

    public /* synthetic */ RunnableC2860c(BinderC2862e binderC2862e, String str, Bundle bundle, int i) {
        this.f23303a = i;
        this.f23306d = binderC2862e;
        this.f23304b = str;
        this.f23305c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23303a) {
            case 0:
                this.f23306d.f23313b.a(this.f23304b, this.f23305c);
                break;
            default:
                this.f23306d.f23313b.f(this.f23304b, this.f23305c);
                break;
        }
    }
}
