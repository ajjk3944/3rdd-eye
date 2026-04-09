package s;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: CustomTabsClient.java */
/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5538b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45865b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f45866c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f45867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f45868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BinderC5541e f45869f;

    public RunnableC5538b(BinderC5541e binderC5541e, int i, Uri uri, boolean z10, Bundle bundle) {
        this.f45869f = binderC5541e;
        this.f45865b = i;
        this.f45866c = uri;
        this.f45867d = z10;
        this.f45868e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45869f.f45882c.onRelationshipValidationResult(this.f45865b, this.f45866c, this.f45867d, this.f45868e);
    }
}
