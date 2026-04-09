package com.vungle.ads.internal.load;

import com.vungle.ads.internal.network.VungleApiClient;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    public static final String RTA_DEBUG_ENDPOINT = "https://events.ads.vungle.com/rtadebugging";

    @NotNull
    private final VungleApiClient apiClient;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        private a() {
        }
    }

    public i(@NotNull VungleApiClient apiClient) {
        p.e(apiClient, "apiClient");
        this.apiClient = apiClient;
    }

    public final void reportAdMarkup(@NotNull String adm) {
        p.e(adm, "adm");
        this.apiClient.sendAdMarkup(adm, RTA_DEBUG_ENDPOINT);
    }
}
