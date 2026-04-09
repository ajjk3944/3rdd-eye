package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class Gb implements Function, Consumer {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Cb apply(File file) throws IOException {
        String strA = AbstractC4533cb.a(file);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        try {
            return new Cb(strA);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void consume(File file) {
        try {
            file.delete();
        } catch (Throwable unused) {
        }
    }
}
