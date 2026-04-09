package j$.util.stream;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f26514a;

    /* renamed from: b, reason: collision with root package name */
    public int f26515b;

    /* renamed from: c, reason: collision with root package name */
    public int f26516c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f26517d;

    public abstract void clear();

    public c() {
        this.f26514a = 4;
    }

    public c(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i4);
        }
        this.f26514a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i4 - 1));
    }

    public final long count() {
        int i4 = this.f26516c;
        if (i4 == 0) {
            return this.f26515b;
        }
        return this.f26517d[i4] + this.f26515b;
    }
}
