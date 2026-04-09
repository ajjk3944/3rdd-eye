package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* renamed from: com.google.android.gms.measurement.internal.k5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4891k5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f36567a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Uri f36568b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f36569c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f36570d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C4867h5 f36571e;

    RunnableC4891k5(C4867h5 c4867h5, boolean z10, Uri uri, String str, String str2) {
        this.f36567a = z10;
        this.f36568b = uri;
        this.f36569c = str;
        this.f36570d = str2;
        this.f36571e = c4867h5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4867h5.f(this.f36571e, this.f36567a, this.f36568b, this.f36569c, this.f36570d);
    }
}
