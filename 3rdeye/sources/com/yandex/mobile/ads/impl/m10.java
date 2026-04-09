package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.io.File;

/* loaded from: classes3.dex */
public final class m10 {
    public static File a(Context context, String cacheDirName) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(cacheDirName, "cacheDirName");
        return new File(B4.g.o(context.getCacheDir().getPath(), File.separator, cacheDirName));
    }
}
