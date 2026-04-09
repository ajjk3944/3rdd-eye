package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class m62 {

    /* renamed from: b, reason: collision with root package name */
    public static final m62 f30281b;

    /* renamed from: c, reason: collision with root package name */
    public static final m62 f30282c;

    /* renamed from: d, reason: collision with root package name */
    public static final m62 f30283d;

    /* renamed from: e, reason: collision with root package name */
    public static final m62 f30284e;

    /* renamed from: f, reason: collision with root package name */
    public static final m62 f30285f;

    /* renamed from: g, reason: collision with root package name */
    public static final m62 f30286g;

    /* renamed from: h, reason: collision with root package name */
    public static final m62 f30287h;
    public static final m62 i;

    /* renamed from: j, reason: collision with root package name */
    public static final m62 f30288j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ m62[] f30289k;

    static {
        m62 m62Var = new m62(0, "ADTUNE_CLICK");
        f30281b = m62Var;
        m62 m62Var2 = new m62(1, "ADTUNE_ITEM_CLICK");
        f30282c = m62Var2;
        m62 m62Var3 = new m62(2, "CLICK");
        f30283d = m62Var3;
        m62 m62Var4 = new m62(3, "FALSE_CLICK");
        f30284e = m62Var4;
        m62 m62Var5 = new m62(4, "MEDIATION_IMPRESSION");
        f30285f = m62Var5;
        m62 m62Var6 = new m62(5, "MEDIATION_RESPONSE");
        f30286g = m62Var6;
        m62 m62Var7 = new m62(6, "MRC_IMPRESSION");
        f30287h = m62Var7;
        m62 m62Var8 = new m62(7, "RENDER");
        i = m62Var8;
        m62 m62Var9 = new m62(8, "SERVER_SIDE_REWARD");
        f30288j = m62Var9;
        m62[] m62VarArr = {m62Var, m62Var2, m62Var3, m62Var4, m62Var5, m62Var6, m62Var7, m62Var8, m62Var9, new m62(9, "UNKNOWN")};
        f30289k = m62VarArr;
        com.google.gson.internal.c.l(m62VarArr);
    }

    private m62(int i10, String str) {
    }

    public static m62 valueOf(String str) {
        return (m62) Enum.valueOf(m62.class, str);
    }

    public static m62[] values() {
        return (m62[]) f30289k.clone();
    }
}
