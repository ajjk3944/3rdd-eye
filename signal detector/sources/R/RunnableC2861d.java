package r;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: r.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2861d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f23308b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23309c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f23310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BinderC2862e f23311e;

    public RunnableC2861d(BinderC2862e binderC2862e, int i, Uri uri, boolean z6, Bundle bundle) {
        this.f23311e = binderC2862e;
        this.f23307a = i;
        this.f23308b = uri;
        this.f23309c = z6;
        this.f23310d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23311e.f23313b.g(this.f23307a, this.f23308b, this.f23309c, this.f23310d);
    }
}
