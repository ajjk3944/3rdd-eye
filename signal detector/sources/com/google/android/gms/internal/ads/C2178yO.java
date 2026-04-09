package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2178yO {

    /* renamed from: c, reason: collision with root package name */
    public static final C2178yO f17716c;

    /* renamed from: d, reason: collision with root package name */
    public static final C2178yO f17717d;

    /* renamed from: a, reason: collision with root package name */
    public final long f17718a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17719b;

    static {
        C2178yO c2178yO = new C2178yO(0L, 0L);
        new C2178yO(Long.MAX_VALUE, Long.MAX_VALUE);
        f17716c = new C2178yO(Long.MAX_VALUE, 0L);
        new C2178yO(0L, Long.MAX_VALUE);
        f17717d = c2178yO;
    }

    public C2178yO(long j6, long j7) {
        AbstractC0582Jp.m(j6 >= 0);
        AbstractC0582Jp.m(j7 >= 0);
        this.f17718a = j6;
        this.f17719b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2178yO.class == obj.getClass()) {
            C2178yO c2178yO = (C2178yO) obj;
            if (this.f17718a == c2178yO.f17718a && this.f17719b == c2178yO.f17719b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f17718a) * 31) + ((int) this.f17719b);
    }
}
