package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1774qy implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f16427a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16428b;

    public C1774qy(Runnable runnable, long j6) {
        this.f16427a = runnable;
        this.f16428b = j6;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f16428b, ((C1774qy) obj).f16428b);
    }
}
