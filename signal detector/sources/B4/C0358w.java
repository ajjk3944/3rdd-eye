package b4;

/* renamed from: b4.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0358w {

    /* renamed from: a, reason: collision with root package name */
    public final int f5776a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5777b;

    public C0358w(int i, long j6) {
        this.f5776a = i;
        this.f5777b = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0358w)) {
            return false;
        }
        C0358w c0358w = (C0358w) obj;
        return this.f5776a == c0358w.f5776a && this.f5777b == c0358w.f5777b;
    }

    public final int hashCode() {
        int i = this.f5776a ^ 1000003;
        long j6 = this.f5777b;
        return (i * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f5776a + ", eventTimestamp=" + this.f5777b + "}";
    }
}
