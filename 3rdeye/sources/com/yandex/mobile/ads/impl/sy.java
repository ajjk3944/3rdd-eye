package com.yandex.mobile.ads.impl;

import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class sy {

    /* renamed from: b, reason: collision with root package name */
    public static final a f33318b;

    /* renamed from: c, reason: collision with root package name */
    public static final sy f33319c;

    /* renamed from: d, reason: collision with root package name */
    public static final sy f33320d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ sy[] f33321e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4463a f33322f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    static {
        sy syVar = new sy(0, "DEFAULT");
        f33319c = syVar;
        sy syVar2 = new sy(1, "RESULT");
        f33320d = syVar2;
        sy[] syVarArr = {syVar, syVar2};
        f33321e = syVarArr;
        f33322f = com.google.gson.internal.c.l(syVarArr);
        f33318b = new a(0);
    }

    private sy(int i, String str) {
    }

    public static InterfaceC4463a<sy> a() {
        return f33322f;
    }

    public static sy valueOf(String str) {
        return (sy) Enum.valueOf(sy.class, str);
    }

    public static sy[] values() {
        return (sy[]) f33321e.clone();
    }
}
