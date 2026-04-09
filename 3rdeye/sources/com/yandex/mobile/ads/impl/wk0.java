package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.io.File;

/* loaded from: classes3.dex */
public final class wk0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f35003a;

    public wk0(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f35003a = context;
    }

    public final File a() {
        File file = new File(this.f35003a.getCacheDir(), "debug_panel");
        file.mkdir();
        return new File(file, "monetization_ads_debug_panel_report.txt");
    }
}
