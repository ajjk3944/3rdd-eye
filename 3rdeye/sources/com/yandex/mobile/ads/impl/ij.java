package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ij {

    /* renamed from: c, reason: collision with root package name */
    public static final a f28703c;

    /* renamed from: d, reason: collision with root package name */
    public static final ij f28704d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ ij[] f28705e;

    /* renamed from: b, reason: collision with root package name */
    private final String f28706b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    static {
        ij ijVar = new ij(0, "CONSTANT", "constant");
        ij ijVar2 = new ij(1, "RATIO", "ratio");
        ij ijVar3 = new ij(2, "SCREEN_BASED", "screen_based");
        ij ijVar4 = new ij(3, "SCREEN_ORIENTATION_BASED", "screen_orientation_based");
        f28704d = ijVar4;
        ij[] ijVarArr = {ijVar, ijVar2, ijVar3, ijVar4, new ij(4, "MEDIATION", "mediation")};
        f28705e = ijVarArr;
        com.google.gson.internal.c.l(ijVarArr);
        f28703c = new a(0);
    }

    private ij(int i, String str, String str2) {
        this.f28706b = str2;
    }

    public static ij valueOf(String str) {
        return (ij) Enum.valueOf(ij.class, str);
    }

    public static ij[] values() {
        return (ij[]) f28705e.clone();
    }

    public final String a() {
        return this.f28706b;
    }
}
