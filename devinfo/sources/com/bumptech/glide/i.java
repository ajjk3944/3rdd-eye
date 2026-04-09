package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f6498a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f6499b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f6500c;

    /* renamed from: d, reason: collision with root package name */
    public static final i f6501d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i[] f6502e;

    static {
        i iVar = new i("IMMEDIATE", 0);
        f6498a = iVar;
        i iVar2 = new i("HIGH", 1);
        f6499b = iVar2;
        i iVar3 = new i("NORMAL", 2);
        f6500c = iVar3;
        i iVar4 = new i("LOW", 3);
        f6501d = iVar4;
        f6502e = new i[]{iVar, iVar2, iVar3, iVar4};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f6502e.clone();
    }
}
