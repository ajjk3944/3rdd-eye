package s;

import android.os.Bundle;

/* compiled from: CustomTabsClient.java */
/* renamed from: s.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5540d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45874b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f45875c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f45876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f45877e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f45878f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Bundle f45879g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BinderC5541e f45880h;

    public RunnableC5540d(BinderC5541e binderC5541e, int i, int i10, int i11, int i12, int i13, Bundle bundle) {
        this.f45880h = binderC5541e;
        this.f45874b = i;
        this.f45875c = i10;
        this.f45876d = i11;
        this.f45877e = i12;
        this.f45878f = i13;
        this.f45879g = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45880h.f45882c.onActivityLayout(this.f45874b, this.f45875c, this.f45876d, this.f45877e, this.f45878f, this.f45879g);
    }
}
