package com.vungle.ads.internal.platform;

import android.content.Context;
import android.util.AndroidRuntimeException;
import android.webkit.WebSettings;
import com.vungle.ads.internal.util.k;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: WebViewUtil.kt */
/* loaded from: classes2.dex */
public final class c {
    public static final a Companion = new a(null);
    private static final String TAG = c.class.getSimpleName();
    private final Context context;

    /* compiled from: WebViewUtil.kt */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        private a() {
        }
    }

    public c(Context context) {
        l.f(context, "context");
        this.context = context;
    }

    public final void getUserAgent(K0.b<String> consumer) {
        l.f(consumer, "consumer");
        try {
            consumer.accept(WebSettings.getDefaultUserAgent(this.context));
        } catch (Exception e4) {
            if (e4 instanceof AndroidRuntimeException) {
                k.a aVar = k.Companion;
                String TAG2 = TAG;
                l.e(TAG2, "TAG");
                aVar.e(TAG2, "WebView could be missing here");
            }
            consumer.accept(null);
        }
    }
}
