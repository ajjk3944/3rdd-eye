package s;

import android.os.Bundle;

/* compiled from: CustomTabsClient.java */
/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5539c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f45871c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f45872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BinderC5541e f45873e;

    public RunnableC5539c(BinderC5541e binderC5541e, int i, int i10, Bundle bundle) {
        this.f45873e = binderC5541e;
        this.f45870b = i;
        this.f45871c = i10;
        this.f45872d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45873e.f45882c.onActivityResized(this.f45870b, this.f45871c, this.f45872d);
    }
}
