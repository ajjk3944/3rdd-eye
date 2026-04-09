package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Tv {

    /* renamed from: a, reason: collision with root package name */
    public static final Tv f11507a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Tv[] f11508b;

    /* JADX INFO: Fake field, exist only in values array */
    Tv EF0;

    static {
        Tv tv = new Tv("VIDEO_CONTROLS", 0);
        Tv tv2 = new Tv("CLOSE_AD", 1);
        Tv tv3 = new Tv("NOT_VISIBLE", 2);
        f11507a = tv3;
        f11508b = new Tv[]{tv, tv2, tv3, new Tv("OTHER", 3)};
    }

    public static Tv[] values() {
        return (Tv[]) f11508b.clone();
    }
}
