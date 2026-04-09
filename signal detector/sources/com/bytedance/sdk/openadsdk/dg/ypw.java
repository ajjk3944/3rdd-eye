package com.bytedance.sdk.openadsdk.dg;

import com.bytedance.sdk.openadsdk.dg.xq.emc;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class ypw {
    public static final String emc = emc.InterfaceC0088emc.emc;
    public static final String ypw = emc.InterfaceC0088emc.ypw;
    public static final String xq = emc.InterfaceC0088emc.xq;
    public static final String dg = emc.InterfaceC0088emc.dg;
    public static final String bw = emc.InterfaceC0088emc.bw;
    public static final String ycc = emc.InterfaceC0088emc.ycc;
    public static final Set<String> uym = new HashSet(Arrays.asList("click", "show", "insight_log"));

    public static class emc {
        public static String dg = "saLandingPageLinks";
        public static String emc = "openDetailPage";
        public static String xq = "direct";
        public static String ypw = "openAdLandPageLinks";
    }

    /* renamed from: com.bytedance.sdk.openadsdk.dg.ypw$ypw, reason: collision with other inner class name */
    public static class C0089ypw {
        public static int emc = 1;
        public static int xq = 100;
        public static int ypw = 2;
    }

    public static boolean emc(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
