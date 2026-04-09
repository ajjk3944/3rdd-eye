package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class TO extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f11371a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11372b;

    public TO(int i, boolean z6) {
        super(A.f.i(i, "AudioOutput write failed: ", new StringBuilder(String.valueOf(i).length() + 26)));
        this.f11372b = z6;
        this.f11371a = i;
    }
}
