package com.vungle.ads;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: AdConfig.kt */
/* renamed from: com.vungle.ads.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4045c {
    public static final int AUTO_ROTATE = 2;
    public static final a Companion = new a(null);
    public static final int IMMEDIATE_BACK = 2;
    public static final int LANDSCAPE = 1;
    public static final int PORTRAIT = 0;
    private static final String WATERMARK = "WATERMARK";
    private int settings;
    private Map<String, String> extras = new LinkedHashMap();
    private int adOrientation = 2;

    /* compiled from: AdConfig.kt */
    /* renamed from: com.vungle.ads.c$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    public final int getAdOrientation() {
        return this.adOrientation;
    }

    public final int getSettings() {
        return this.settings;
    }

    public final String getWatermark$vungle_ads_release() {
        return this.extras.get(WATERMARK);
    }

    public final void setAdOrientation(int i) {
        this.adOrientation = i;
    }

    public final void setBackButtonImmediatelyEnabled(boolean z10) {
        this.settings = z10 ? this.settings | 2 : this.settings & (-3);
    }

    public final void setWatermark(String watermark) {
        kotlin.jvm.internal.l.f(watermark, "watermark");
        this.extras.put(WATERMARK, watermark);
    }

    public static /* synthetic */ void getAdOrientation$annotations() {
    }
}
