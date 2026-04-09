package com.applovin.sdk;

import androidx.work.s;
import java.util.Locale;

/* loaded from: classes.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;

    /* renamed from: a, reason: collision with root package name */
    private final String f22007a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22008b;

    /* renamed from: c, reason: collision with root package name */
    private final int f22009c;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, "BANNER");
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, "LEADER");
    public static final AppLovinAdSize MREC = new AppLovinAdSize(300, 250, "MREC");
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, "INTER");
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");

    private AppLovinAdSize(int i, int i10, String str) {
        this.f22008b = i;
        this.f22009c = i10;
        this.f22007a = str;
    }

    public static AppLovinAdSize fromString(String str) {
        if ("BANNER".equalsIgnoreCase(str)) {
            return BANNER;
        }
        if ("MREC".equalsIgnoreCase(str)) {
            return MREC;
        }
        if ("LEADER".equalsIgnoreCase(str)) {
            return LEADER;
        }
        if ("INTERSTITIAL".equalsIgnoreCase(str) || "INTER".equalsIgnoreCase(str)) {
            return INTERSTITIAL;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException(s.d("Unknown Ad Size: ", str));
    }

    public int getHeight() {
        return this.f22009c;
    }

    public String getLabel() {
        return this.f22007a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.f22008b;
    }

    public String toString() {
        return getLabel();
    }
}
