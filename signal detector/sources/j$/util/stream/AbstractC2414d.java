package j$.util.stream;

/* renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2414d {

    /* renamed from: a, reason: collision with root package name */
    public final int f21050a;

    /* renamed from: b, reason: collision with root package name */
    public int f21051b;

    /* renamed from: c, reason: collision with root package name */
    public int f21052c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f21053d;

    public abstract void clear();

    public AbstractC2414d() {
        this.f21050a = 4;
    }

    public AbstractC2414d(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        }
        this.f21050a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i - 1));
    }

    public final long count() {
        int i = this.f21052c;
        if (i == 0) {
            return this.f21051b;
        }
        return this.f21053d[i] + this.f21051b;
    }
}
