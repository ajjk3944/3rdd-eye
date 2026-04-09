package a3;

import androidx.lifecycle.AbstractC1781n;

/* compiled from: LifecycleRequestManagerRetriever.java */
/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC1781n f14119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f14120c;

    public j(k kVar, AbstractC1781n abstractC1781n) {
        this.f14120c = kVar;
        this.f14119b = abstractC1781n;
    }

    @Override // a3.i
    public final void onDestroy() {
        this.f14120c.f14121a.remove(this.f14119b);
    }

    @Override // a3.i
    public final void onStart() {
    }

    @Override // a3.i
    public final void onStop() {
    }
}
