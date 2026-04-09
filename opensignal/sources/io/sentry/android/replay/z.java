package io.sentry.android.replay;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class z extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12040d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f12041g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(View view, int i10) {
        super(1);
        this.f12040d = i10;
        this.f12041g = view;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f12040d) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                br.l.e(weakReference, "it");
                return Boolean.valueOf(br.l.a(weakReference.get(), this.f12041g));
            default:
                WeakReference weakReference2 = (WeakReference) obj;
                br.l.e(weakReference2, "it");
                return Boolean.valueOf(br.l.a(weakReference2.get(), this.f12041g));
        }
    }
}
