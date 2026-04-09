package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c10 {

    /* renamed from: c, reason: collision with root package name */
    public static final c10 f25492c;

    /* renamed from: d, reason: collision with root package name */
    public static final c10 f25493d;

    /* renamed from: e, reason: collision with root package name */
    public static final c10 f25494e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ c10[] f25495f;

    /* renamed from: b, reason: collision with root package name */
    private final String f25496b;

    static {
        c10 c10Var = new c10(0, "AD", "ad");
        f25492c = c10Var;
        c10 c10Var2 = new c10(1, "PACK_SHOT", "pack_shot");
        f25493d = c10Var2;
        c10 c10Var3 = new c10(2, "CLOSE_DIALOG", "close_dialog");
        f25494e = c10Var3;
        c10[] c10VarArr = {c10Var, c10Var2, c10Var3};
        f25495f = c10VarArr;
        com.google.gson.internal.c.l(c10VarArr);
    }

    private c10(int i, String str, String str2) {
        this.f25496b = str2;
    }

    public static c10 valueOf(String str) {
        return (c10) Enum.valueOf(c10.class, str);
    }

    public static c10[] values() {
        return (c10[]) f25495f.clone();
    }

    public final String a() {
        return this.f25496b;
    }
}
