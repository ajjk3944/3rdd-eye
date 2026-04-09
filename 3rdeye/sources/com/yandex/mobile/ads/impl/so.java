package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class so {

    /* renamed from: c, reason: collision with root package name */
    public static final a f33147c;

    /* renamed from: d, reason: collision with root package name */
    public static final so f33148d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ so[] f33149e;

    /* renamed from: b, reason: collision with root package name */
    private final String f33150b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    static {
        so soVar = new so(0, "BROWSER", "browser");
        so soVar2 = new so(1, "WEBVIEW", "webview");
        f33148d = soVar2;
        so[] soVarArr = {soVar, soVar2};
        f33149e = soVarArr;
        com.google.gson.internal.c.l(soVarArr);
        f33147c = new a(0);
    }

    private so(int i, String str, String str2) {
        this.f33150b = str2;
    }

    public static so valueOf(String str) {
        return (so) Enum.valueOf(so.class, str);
    }

    public static so[] values() {
        return (so[]) f33149e.clone();
    }

    public final String a() {
        return this.f33150b;
    }
}
