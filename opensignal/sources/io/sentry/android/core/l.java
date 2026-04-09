package io.sentry.android.core;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements io.sentry.util.runtime.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11696a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f11697d;

    public /* synthetic */ l(Context context, int i10) {
        this.f11696a = i10;
        this.f11697d = context;
    }

    @Override // io.sentry.util.runtime.a
    public Object run() {
        switch (this.f11696a) {
            case 0:
                return new File(this.f11697d.getCacheDir(), "sentry").getAbsolutePath();
            default:
                return n0.a(this.f11697d);
        }
    }
}
