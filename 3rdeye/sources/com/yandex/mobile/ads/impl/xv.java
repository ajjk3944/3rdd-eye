package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class xv {

    /* renamed from: c, reason: collision with root package name */
    public static final xv f35431c;

    /* renamed from: d, reason: collision with root package name */
    public static final xv f35432d;

    /* renamed from: e, reason: collision with root package name */
    public static final xv f35433e;

    /* renamed from: f, reason: collision with root package name */
    public static final xv f35434f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ xv[] f35435g;

    /* renamed from: b, reason: collision with root package name */
    private final String f35436b;

    static {
        xv xvVar = new xv(0, "CROSS_CLICKED", "cross_clicked");
        f35431c = xvVar;
        xv xvVar2 = new xv(1, "CROSS_TIMER_START", "cross_timer_start");
        f35432d = xvVar2;
        xv xvVar3 = new xv(2, "CROSS_TIMER_END", "cross_timer_end");
        f35433e = xvVar3;
        xv xvVar4 = new xv(3, "FAILED_TO_CREATE_DOWNLOAD_MANAGER", "failed_to_create_download_manager");
        f35434f = xvVar4;
        xv[] xvVarArr = {xvVar, xvVar2, xvVar3, xvVar4, new xv(4, "LISTENER_IS_NULL_ON_LOADING_FINISHED", "listener_is_null_on_loading_finished")};
        f35435g = xvVarArr;
        com.google.gson.internal.c.l(xvVarArr);
    }

    private xv(int i, String str, String str2) {
        this.f35436b = str2;
    }

    public static xv valueOf(String str) {
        return (xv) Enum.valueOf(xv.class, str);
    }

    public static xv[] values() {
        return (xv[]) f35435g.clone();
    }

    public final String a() {
        return this.f35436b;
    }
}
