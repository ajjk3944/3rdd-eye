package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class BQ {

    /* renamed from: a, reason: collision with root package name */
    public static final BQ f7352a;

    /* renamed from: b, reason: collision with root package name */
    public static final BQ f7353b;

    /* renamed from: c, reason: collision with root package name */
    public static final BQ f7354c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ BQ[] f7355d;

    static {
        BQ bq = new BQ("PASS_THROUGH", 0);
        f7352a = bq;
        BQ bq2 = new BQ("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        f7353b = bq2;
        BQ bq3 = new BQ("DISCARDING", 2);
        f7354c = bq3;
        f7355d = new BQ[]{bq, bq2, bq3};
    }

    public static BQ[] values() {
        return (BQ[]) f7355d.clone();
    }
}
