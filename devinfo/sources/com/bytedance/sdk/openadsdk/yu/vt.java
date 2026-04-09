package com.bytedance.sdk.openadsdk.yu;

import com.bytedance.sdk.openadsdk.yu.lh.ouw;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    public static final String ouw = ouw.InterfaceC0119ouw.ouw;
    public static final String vt = ouw.InterfaceC0119ouw.vt;

    /* renamed from: lh, reason: collision with root package name */
    public static final String f8851lh = ouw.InterfaceC0119ouw.f8808lh;
    public static final String yu = ouw.InterfaceC0119ouw.yu;
    public static final String fkw = ouw.InterfaceC0119ouw.fkw;

    /* renamed from: le, reason: collision with root package name */
    public static final String f8850le = ouw.InterfaceC0119ouw.f8807le;
    public static final Set<String> ra = new HashSet(Arrays.asList("click", "show", "insight_log"));

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {

        /* renamed from: lh, reason: collision with root package name */
        public static String f8852lh = "direct";
        public static String ouw = "openDetailPage";
        public static String vt = "openAdLandPageLinks";
        public static String yu = "saLandingPageLinks";
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.yu.vt$vt, reason: collision with other inner class name */
    public static class C0123vt {

        /* renamed from: lh, reason: collision with root package name */
        public static int f8853lh = 100;
        public static int ouw = 1;
        public static int vt = 2;
    }

    public static boolean ouw(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
