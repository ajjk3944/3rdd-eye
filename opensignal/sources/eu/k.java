package eu;

import bu.t;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: b, reason: collision with root package name */
    public static final t f8362b;

    /* renamed from: c, reason: collision with root package name */
    public static final t f8363c;

    /* renamed from: d, reason: collision with root package name */
    public static final t f8364d;

    /* renamed from: e, reason: collision with root package name */
    public static final t f8365e;

    /* renamed from: a, reason: collision with root package name */
    public static final int f8361a = bu.a.j("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 12);

    /* renamed from: f, reason: collision with root package name */
    public static final int f8366f = bu.a.j("kotlinx.coroutines.semaphore.segmentSize", 16, 12);

    static {
        int i10 = 0;
        f8362b = new t("PERMIT", i10);
        f8363c = new t("TAKEN", i10);
        f8364d = new t("BROKEN", i10);
        f8365e = new t("CANCELLED", i10);
    }
}
