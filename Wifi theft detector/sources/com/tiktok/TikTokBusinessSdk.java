package com.tiktok;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public abstract class TikTokBusinessSdk {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f19961a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f19962b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f19963c = Boolean.TRUE;

    /* renamed from: d, reason: collision with root package name */
    public static String f19964d = "v1.2";

    /* renamed from: e, reason: collision with root package name */
    public static String f19965e = "analytics.us.tiktok.com";

    /* renamed from: f, reason: collision with root package name */
    public static LogLevel f19966f = LogLevel.INFO;

    /* renamed from: g, reason: collision with root package name */
    public static AtomicBoolean f19967g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public static AtomicBoolean f19968h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public static AtomicBoolean f19969i = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public static String f19970j = "";

    /* renamed from: k, reason: collision with root package name */
    public static final String f19971k = UUID.randomUUID().toString();

    public enum LogLevel {
        NONE,
        INFO,
        WARN,
        DEBUG
    }

    public static LogLevel a() {
        return f19966f;
    }
}
