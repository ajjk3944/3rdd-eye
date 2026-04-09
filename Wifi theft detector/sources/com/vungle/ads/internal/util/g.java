package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.vungle.ads.LinkError;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.util.p;
import java.net.URISyntaxException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class g {

    @NotNull
    public static final g INSTANCE = new g();

    @NotNull
    private static final String TAG = "ExternalRouter";

    private g() {
    }

    private final Intent getIntentFromUrl(String str, boolean z10) throws URISyntaxException {
        Intent uri = null;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    uri = Intent.parseUri(str, 0);
                }
            } catch (URISyntaxException e10) {
                p.Companion.e(TAG, "url format is not correct " + e10.getLocalizedMessage());
            }
        }
        if (uri != null && z10) {
            uri.setFlags(268435456);
            return uri;
        }
        return uri;
    }

    public static /* synthetic */ Intent getIntentFromUrl$default(g gVar, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return gVar.getIntentFromUrl(str, z10);
    }

    public static /* synthetic */ Intent getIntentFromUrl$vungle_ads_release$default(g gVar, Context context, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return gVar.getIntentFromUrl$vungle_ads_release(context, str);
    }

    public static /* synthetic */ boolean launch$vungle_ads_release$default(g gVar, String str, String str2, Context context, o oVar, com.vungle.ads.internal.ui.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            oVar = null;
        }
        if ((i10 & 16) != 0) {
            bVar = null;
        }
        return gVar.launch$vungle_ads_release(str, str2, context, oVar, bVar);
    }

    @Nullable
    public final Intent getIntentFromUrl$vungle_ads_release(@NotNull Context context, @Nullable String str) {
        kotlin.jvm.internal.p.e(context, "context");
        return getIntentFromUrl(str, !(context instanceof Activity));
    }

    public final boolean launch$vungle_ads_release(@Nullable String str, @Nullable String str2, @NotNull Context context, @Nullable o oVar, @Nullable com.vungle.ads.internal.ui.b bVar) {
        kotlin.jvm.internal.p.e(context, "context");
        if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
            boolean z10 = !(context instanceof Activity);
            try {
                return a.Companion.startWhenForeground(context, getIntentFromUrl(str, z10), getIntentFromUrl(str2, z10), bVar);
            } catch (Exception e10) {
                if (str == null || str.length() == 0) {
                    new LinkError(Sdk$SDKError.Reason.LINK_COMMAND_OPEN_FAILED, "Fail to open " + str2).setLogEntry$vungle_ads_release(oVar).logErrorNoReturnValue$vungle_ads_release();
                } else {
                    new LinkError(Sdk$SDKError.Reason.DEEPLINK_OPEN_FAILED, "Fail to open " + str).setLogEntry$vungle_ads_release(oVar).logErrorNoReturnValue$vungle_ads_release();
                }
                p.a aVar = p.Companion;
                aVar.e(TAG, "Error while opening url" + e10.getLocalizedMessage());
                aVar.d(TAG, "Cannot open url " + str2);
            }
        }
        return false;
    }
}
