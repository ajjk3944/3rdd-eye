package com.bytedance.sdk.component.adexpress.dynamic.yu;

import android.text.TextUtils;
import d.h;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw {

    /* renamed from: le, reason: collision with root package name */
    public static final Map<String, Integer> f7279le;
    public String fkw;

    /* renamed from: lh, reason: collision with root package name */
    public le f7280lh;
    public String ouw;
    public String vt;
    public le yu;

    static {
        HashMap map = new HashMap();
        f7279le = map;
        map.put("root", 8);
        map.put("footer", 6);
        map.put("empty", 6);
        map.put("title", 0);
        map.put("subtitle", 0);
        map.put("source", 0);
        map.put("score-count", 0);
        map.put("text_star", 0);
        map.put("text", 0);
        map.put("tag-group", 17);
        map.put("app-version", 0);
        map.put("development-name", 0);
        map.put("privacy-detail", 23);
        map.put("image", 1);
        map.put("image-wide", 1);
        map.put("image-square", 1);
        map.put("image-long", 1);
        map.put("image-splash", 1);
        map.put("image-cover", 1);
        map.put("app-icon", 1);
        map.put("icon-download", 1);
        map.put("logoad", 4);
        map.put("logounion", 5);
        map.put("logo-union", 9);
        map.put("dislike", 3);
        map.put("close", 3);
        map.put("close-fill", 3);
        map.put("webview-close", 22);
        map.put("feedback-dislike", 12);
        map.put("button", 2);
        map.put("downloadWithIcon", 2);
        map.put("downloadButton", 2);
        map.put("fillButton", 2);
        map.put("laceButton", 2);
        map.put("cardButton", 2);
        map.put("colourMixtureButton", 2);
        map.put("arrowButton", 1);
        map.put("download-progress-button", 2);
        map.put("vessel", 6);
        map.put("image-group", 6);
        map.put("custom-component-vessel", 6);
        map.put("carousel", 24);
        map.put("carousel-vessel", 26);
        map.put("leisure-interact", 25);
        map.put("video-hd", 7);
        map.put("video", 7);
        map.put("video-vd", 7);
        map.put("video-sq", 7);
        map.put("muted", 10);
        map.put("star", 11);
        map.put("skip-countdowns", 19);
        map.put("skip-with-countdowns-skip-btn", 21);
        map.put("skip-with-countdowns-video-countdown", 13);
        map.put("skip-with-countdowns-skip-countdown", 20);
        map.put("skip-with-time", 14);
        map.put("skip-with-time-countdown", 13);
        map.put("skip-with-time-skip-btn", 15);
        map.put("skip", 27);
        map.put("timedown", 13);
        map.put("icon", 16);
        map.put("scoreCountWithIcon", 6);
        map.put("split-line", 18);
        map.put("creative-playable-bait", 0);
        map.put("score-count-type-2", 0);
        map.put("lottie", 28);
    }

    public final int ouw() {
        if (TextUtils.isEmpty(this.ouw)) {
            return 0;
        }
        if (this.ouw.equals("logo")) {
            String str = this.ouw + this.vt;
            this.ouw = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.ouw.contains("logounion")) {
                return 5;
            }
        }
        Map<String, Integer> map = f7279le;
        if (map.get(this.ouw) != null) {
            return map.get(this.ouw).intValue();
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DynamicLayoutBrick{type='");
        sb2.append(this.ouw);
        sb2.append("', data='");
        sb2.append(this.vt);
        sb2.append("', value=");
        sb2.append(this.f7280lh);
        sb2.append(", themeValue=");
        sb2.append(this.yu);
        sb2.append(", dataExtraInfo='");
        return h.w(sb2, this.fkw, "'}");
    }
}
