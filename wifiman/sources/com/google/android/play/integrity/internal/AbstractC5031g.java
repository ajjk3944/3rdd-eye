package com.google.android.play.integrity.internal;

import android.content.Context;

/* renamed from: com.google.android.play.integrity.internal.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5031g {
    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
