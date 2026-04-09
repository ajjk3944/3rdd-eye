package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class i7 {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f28531A = 0;

    /* renamed from: a, reason: collision with root package name */
    private static final C4128i3 f28532a = new C4128i3(1, "Received unsupported ad type", "Received unsupported ad type. We are already working on this issue.", null);

    /* renamed from: b, reason: collision with root package name */
    private static final C4128i3 f28533b = new C4128i3(5, "android.webkit.WebView database is inoperable", "android.webkit.WebViewDatabase is inoperable. Try using another device for testing.", null);

    /* renamed from: c, reason: collision with root package name */
    private static final C4128i3 f28534c = new C4128i3(1, "Internal state wasn't completely configured", "Internal state wasn't completely configured. Please try again later.", null);

    /* renamed from: d, reason: collision with root package name */
    private static final C4128i3 f28535d = new C4128i3(1, "Incorrect data in server response", "Failed to parse server's response. We are already working on this issue.", null);

    /* renamed from: e, reason: collision with root package name */
    private static final C4128i3 f28536e = new C4128i3(5, "android.webkit.WebView creation failed", "android.webkit.WebView creation failed. Try using another device for testing.", null);

    /* renamed from: f, reason: collision with root package name */
    private static final C4128i3 f28537f = new C4128i3(1, "Invalid server response code", "Unexpected server response code. We are already working on this issue.", null);

    /* renamed from: g, reason: collision with root package name */
    private static final C4128i3 f28538g = new C4128i3(1, "Service temporarily unavailable", "Service temporarily unavailable. Please try again later.", null);

    /* renamed from: h, reason: collision with root package name */
    private static final C4128i3 f28539h = new C4128i3(1, "The loaded banner can't fit in the container.", "The loaded banner can't fit in the container.", null);
    private static final C4128i3 i = new C4128i3(1, "Banner rendering failed with timeout", "Banner rendering failed with timeout. Please try again.", null);

    /* renamed from: j, reason: collision with root package name */
    private static final C4128i3 f28540j = new C4128i3(1, "Invalid SDK state.", "Invalid SDK state.", null);

    /* renamed from: k, reason: collision with root package name */
    private static final C4128i3 f28541k = new C4128i3(1, "Invalid SDK state.", "Invalid SDK state.", null);

    /* renamed from: l, reason: collision with root package name */
    private static final C4128i3 f28542l = new C4128i3(4, "Ad request completed successfully, but there are no ads available.", "Ad request completed successfully, but there are no ads available.", null);

    /* renamed from: m, reason: collision with root package name */
    private static final C4128i3 f28543m = new C4128i3(2, "Ad request configured incorrectly", "Ad request configured incorrectly", null);

    /* renamed from: n, reason: collision with root package name */
    private static final C4128i3 f28544n = new C4128i3(2, "Invalid request parameters", "Invalid request parameters", null);

    /* renamed from: o, reason: collision with root package name */
    private static final C4128i3 f28545o = new C4128i3(2, "Invalid Ad Unit Id. AdUnitId should be not empty string", "Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.", null);

    /* renamed from: p, reason: collision with root package name */
    private static final C4128i3 f28546p = new C4128i3(2, "Invalid ad size. Please, specify AdSize excplicitly", "Invalid ad size. Set the ad size using the 'setAdSize' method.", null);

    /* renamed from: q, reason: collision with root package name */
    private static final C4128i3 f28547q = new C4128i3(1, "Invalid sdk configuration. Please request another ad.", "Invalid sdk configuration. Please request another ad.", null);

    /* renamed from: r, reason: collision with root package name */
    private static final C4128i3 f28548r = new C4128i3(5, "Device hasn't enough free memory.", "Device has not enough free memory.", null);

    /* renamed from: s, reason: collision with root package name */
    private static final C4128i3 f28549s = new C4128i3(2, "Feed ad preloading has already started", "Feed ad preloading was already started. You should use preloadAd method only once", null);

    /* renamed from: t, reason: collision with root package name */
    private static final C4128i3 f28550t = new C4128i3(3, "Ad request failed with network error", "Ad request failed with network error. Please try again later.", null);

    /* renamed from: u, reason: collision with root package name */
    private static final C4128i3 f28551u = new C4128i3(3, "Ad request failed with no connection error", "Ad request failed with network error. Please try again later.", null);

    /* renamed from: v, reason: collision with root package name */
    private static final C4128i3 f28552v = new C4128i3(3, "Ad request failed with timeout error", "Ad request failed with network error. Please try again later.", null);

    /* renamed from: w, reason: collision with root package name */
    private static final C4128i3 f28553w = new C4128i3(3, "Ad request failed with auth failure", "Ad request failed with network error. Please try again later.", null);

    /* renamed from: x, reason: collision with root package name */
    private static final C4128i3 f28554x = new C4128i3(3, "Ad request failed with client error", "Ad request failed with network error. Please try again later.", null);

    /* renamed from: y, reason: collision with root package name */
    private static final C4128i3 f28555y = new C4128i3(3, "Ad request failed with parse error", "Ad request failed with network error. Please try again later.", null);

    /* renamed from: z, reason: collision with root package name */
    private static final C4128i3 f28556z = new C4128i3(1, "Ad request failed with content preloading error", "Ad request failed with content preloading error. Please try again later", null);

    public static C4128i3 a(String errorType, String description) {
        kotlin.jvm.internal.l.f(errorType, "errorType");
        kotlin.jvm.internal.l.f(description, "description");
        return a(1, errorType, description);
    }

    public static C4128i3 b() {
        return f28539h;
    }

    public static C4128i3 c() {
        return f28554x;
    }

    public static C4128i3 d() {
        return f28556z;
    }

    public static C4128i3 e() {
        return f28546p;
    }

    public static C4128i3 f() {
        return f28545o;
    }

    public static C4128i3 g() {
        return f28541k;
    }

    public static C4128i3 h() {
        return f28547q;
    }

    public static C4128i3 i() {
        return f28540j;
    }

    public static C4128i3 j() {
        return f28537f;
    }

    public static C4128i3 k() {
        return f28535d;
    }

    public static C4128i3 l() {
        return i;
    }

    public static C4128i3 m() {
        return f28534c;
    }

    public static C4128i3 n() {
        return f28550t;
    }

    public static C4128i3 o() {
        return f28548r;
    }

    public static C4128i3 p() {
        return f28551u;
    }

    public static C4128i3 q() {
        return f28542l;
    }

    public static C4128i3 r() {
        return f28555y;
    }

    public static C4128i3 s() {
        return f28549s;
    }

    public static C4128i3 t() {
        return f28543m;
    }

    public static C4128i3 u() {
        return f28544n;
    }

    public static C4128i3 v() {
        return f28538g;
    }

    public static C4128i3 w() {
        return f28552v;
    }

    public static C4128i3 x() {
        return f28532a;
    }

    public static C4128i3 y() {
        return f28536e;
    }

    public static C4128i3 z() {
        return f28533b;
    }

    public static C4128i3 a(String str) {
        String str2;
        String str3;
        if (str != null && str.length() != 0) {
            str2 = "Provided AdUnitId '%s' does not exist! Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.";
            str3 = "Provided ad unit id doesn't exist";
        } else {
            str2 = "Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.";
            str3 = "Invalid Ad Unit Id. AdUnitId should be not empty string";
        }
        return new C4128i3(2, str3, String.format(Locale.US, str2, Arrays.copyOf(new Object[]{str}, 1)), null);
    }

    public static C4128i3 a() {
        return f28553w;
    }

    public static C4128i3 a(int i10, int i11, int i12, int i13, int i14, int i15) {
        return new C4128i3(1, "Ad was loaded successfully, but there is not enough space to display it", String.format(Locale.US, "Ad was loaded successfully, but there is not enough space to display it. Requested size: [%dx%d], Received size : [%dx%d], device screen size: [%dx%d].", Arrays.copyOf(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15)}, 6)), null);
    }

    private static C4128i3 a(int i10, String str, String str2) {
        return new C4128i3(i10, str, str2, null);
    }
}
