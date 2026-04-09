package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0965c {

    /* renamed from: a, reason: collision with root package name */
    public final C2108x8 f13506a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f13507b;

    public C0965c(C2108x8 c2108x8, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC2022vd.K("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f13506a = c2108x8;
        this.f13507b = iArr;
    }
}
