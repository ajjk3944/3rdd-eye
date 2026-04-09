package y0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6531g;

/* renamed from: y0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8583d {

    /* renamed from: a, reason: collision with root package name */
    private final long f66276a;

    /* renamed from: b, reason: collision with root package name */
    private final long f66277b;

    /* renamed from: c, reason: collision with root package name */
    private long f66278c;

    public /* synthetic */ C8583d(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12);
    }

    public final long a() {
        return this.f66278c;
    }

    public final long b() {
        return this.f66277b;
    }

    public final long c() {
        return this.f66276a;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f66276a + ", position=" + ((Object) C6531g.t(this.f66277b)) + ')';
    }

    public /* synthetic */ C8583d(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    private C8583d(long j10, long j11) {
        this.f66276a = j10;
        this.f66277b = j11;
        this.f66278c = C6531g.f52335b.c();
    }

    private C8583d(long j10, long j11, long j12) {
        this(j10, j11, (DefaultConstructorMarker) null);
        this.f66278c = j12;
    }
}
