package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1046dP extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f13761a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13762b;

    /* renamed from: c, reason: collision with root package name */
    public final TP f13763c;

    public C1046dP(int i, TP tp, boolean z6) {
        super(A.f.i(i, "AudioTrack write failed: ", new StringBuilder(String.valueOf(i).length() + 25)));
        this.f13762b = z6;
        this.f13761a = i;
        this.f13763c = tp;
    }
}
