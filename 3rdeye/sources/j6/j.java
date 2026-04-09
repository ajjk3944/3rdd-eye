package j6;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DivCreationTracker.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicBoolean f43028f = new AtomicBoolean(true);

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f43029g = new AtomicBoolean(true);

    /* renamed from: a, reason: collision with root package name */
    public final long f43030a;

    /* renamed from: b, reason: collision with root package name */
    public long f43031b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f43032c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final String f43033d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f43034e;

    public j(long j4) {
        this.f43030a = j4;
        this.f43033d = f43028f.compareAndSet(true, false) ? "Cold" : "Cool";
        this.f43034e = new AtomicBoolean(true);
    }
}
