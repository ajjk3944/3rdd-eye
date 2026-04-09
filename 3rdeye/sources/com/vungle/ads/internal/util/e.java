package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.vungle.ads.C4055m;
import com.vungle.ads.internal.util.b;
import com.vungle.ads.internal.util.k;
import java.net.URISyntaxException;

/* compiled from: ExternalRouter.kt */
/* loaded from: classes2.dex */
public final class e {
    public static final e INSTANCE = new e();
    private static final String TAG = e.class.getSimpleName();

    private e() {
    }

    private final Intent getIntentFromUrl(String str, boolean z10) throws URISyntaxException {
        Intent uri = null;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    uri = Intent.parseUri(str, 0);
                }
            } catch (URISyntaxException e4) {
                k.a aVar = k.Companion;
                String TAG2 = TAG;
                kotlin.jvm.internal.l.e(TAG2, "TAG");
                aVar.e(TAG2, "url format is not correct " + e4.getLocalizedMessage());
            }
        }
        if (uri != null && z10) {
            uri.setFlags(268435456);
            return uri;
        }
        return uri;
    }

    public static final boolean launch(String str, String str2, Context context, b.InterfaceC0396b interfaceC0396b, com.vungle.ads.internal.ui.b bVar) {
        kotlin.jvm.internal.l.f(context, "context");
        if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
            boolean z10 = !(context instanceof Activity);
            try {
                e eVar = INSTANCE;
                b.Companion.startWhenForeground(context, eVar.getIntentFromUrl(str, z10), eVar.getIntentFromUrl(str2, z10), interfaceC0396b, bVar);
                return true;
            } catch (Exception e4) {
                if (str == null || str.length() == 0) {
                    C4055m.logError$vungle_ads_release$default(C4055m.INSTANCE, 314, androidx.work.s.d("Fail to open ", str2), "", (String) null, (String) null, 24, (Object) null);
                } else {
                    C4055m.logError$vungle_ads_release$default(C4055m.INSTANCE, 312, androidx.work.s.d("Fail to open ", str), "", (String) null, (String) null, 24, (Object) null);
                }
                k.a aVar = k.Companion;
                String TAG2 = TAG;
                kotlin.jvm.internal.l.e(TAG2, "TAG");
                aVar.e(TAG2, "Error while opening url" + e4.getLocalizedMessage());
                kotlin.jvm.internal.l.e(TAG2, "TAG");
                aVar.d(TAG2, "Cannot open url " + str2);
            }
        }
        return false;
    }
}
