package com.vungle.ads.internal.load;

import kotlin.jvm.internal.l;

/* compiled from: RTADebugger.kt */
/* loaded from: classes2.dex */
public final class f {
    public static final a Companion = new a(null);
    public static final String RTA_DEBUG_ENDPOINT = "https://events.ads.vungle.com/rtadebugging";
    private final com.vungle.ads.internal.network.g apiClient;

    /* compiled from: RTADebugger.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    public f(com.vungle.ads.internal.network.g apiClient) {
        l.f(apiClient, "apiClient");
        this.apiClient = apiClient;
    }

    public final void reportAdMarkup(String adm) {
        l.f(adm, "adm");
        this.apiClient.sendAdMarkup(adm, RTA_DEBUG_ENDPOINT);
    }
}
