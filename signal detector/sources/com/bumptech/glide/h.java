package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f6508a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f6509b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f6510c;

    /* renamed from: d, reason: collision with root package name */
    public static final h f6511d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h[] f6512e;

    static {
        h hVar = new h("IMMEDIATE", 0);
        f6508a = hVar;
        h hVar2 = new h("HIGH", 1);
        f6509b = hVar2;
        h hVar3 = new h("NORMAL", 2);
        f6510c = hVar3;
        h hVar4 = new h("LOW", 3);
        f6511d = hVar4;
        f6512e = new h[]{hVar, hVar2, hVar3, hVar4};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f6512e.clone();
    }
}
