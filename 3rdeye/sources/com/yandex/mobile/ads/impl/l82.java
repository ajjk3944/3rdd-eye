package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class l82 {

    /* renamed from: a, reason: collision with root package name */
    private final k82 f29923a;

    public l82() {
        this(new k82());
    }

    public final boolean a(Context context, String url) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(url, "url");
        try {
            this.f29923a.getClass();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            intent.putExtra("monetization_ads_activity_click", true);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public l82(k82 intentCreator) {
        kotlin.jvm.internal.l.f(intentCreator, "intentCreator");
        this.f29923a = intentCreator;
    }
}
