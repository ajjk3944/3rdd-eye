package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class be {

    /* renamed from: c, reason: collision with root package name */
    public static final be f25242c;

    /* renamed from: d, reason: collision with root package name */
    public static final be f25243d;

    /* renamed from: e, reason: collision with root package name */
    public static final be f25244e;

    /* renamed from: f, reason: collision with root package name */
    public static final be f25245f;

    /* renamed from: g, reason: collision with root package name */
    public static final be f25246g;

    /* renamed from: h, reason: collision with root package name */
    public static final be f25247h;
    private static final /* synthetic */ be[] i;

    /* renamed from: b, reason: collision with root package name */
    private final String f25248b;

    static {
        be beVar = new be(0, "AD_REQUEST", "ad_request");
        f25242c = beVar;
        be beVar2 = new be(1, "AD_ATTEMPT", "ad_attempt");
        f25243d = beVar2;
        be beVar3 = new be(2, "AD_FILLED_REQUEST", "ad_filled_request");
        f25244e = beVar3;
        be beVar4 = new be(3, "AD_IMPRESSION", "ad_impression");
        f25245f = beVar4;
        be beVar5 = new be(4, "AD_CLICK", "ad_click");
        f25246g = beVar5;
        be beVar6 = new be(5, "AD_REWARD", "ad_reward");
        f25247h = beVar6;
        be[] beVarArr = {beVar, beVar2, beVar3, beVar4, beVar5, beVar6};
        i = beVarArr;
        com.google.gson.internal.c.l(beVarArr);
    }

    private be(int i10, String str, String str2) {
        this.f25248b = str2;
    }

    public static be valueOf(String str) {
        return (be) Enum.valueOf(be.class, str);
    }

    public static be[] values() {
        return (be[]) i.clone();
    }

    public final String a() {
        return this.f25248b;
    }
}
