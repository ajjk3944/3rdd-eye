package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

/* loaded from: classes3.dex */
public final class z82 {

    /* renamed from: c, reason: collision with root package name */
    private static final String f36247c = "The Yandex Mobile Ads SDK needs to be updated to the latest version. Details in the logs";

    /* renamed from: a, reason: collision with root package name */
    private final Handler f36248a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f36249b;

    public /* synthetic */ z82(Context context) {
        this(context, new Handler(Looper.getMainLooper()));
    }

    public final void a() {
        this.f36248a.post(new J2(this, 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(z82 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        Toast.makeText(this$0.f36249b, f36247c, 1).show();
    }

    public z82(Context context, Handler handler) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(handler, "handler");
        this.f36248a = handler;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f36249b = applicationContext;
    }
}
