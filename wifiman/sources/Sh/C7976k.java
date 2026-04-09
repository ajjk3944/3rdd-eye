package sh;

import Zg.S;
import java.util.NoSuchElementException;

/* renamed from: sh.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7976k extends S {

    /* renamed from: a, reason: collision with root package name */
    private final long f61636a;

    /* renamed from: b, reason: collision with root package name */
    private final long f61637b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f61638c;

    /* renamed from: d, reason: collision with root package name */
    private long f61639d;

    public C7976k(long j10, long j11, long j12) {
        this.f61636a = j12;
        this.f61637b = j11;
        boolean z10 = false;
        if (j12 <= 0 ? j10 >= j11 : j10 <= j11) {
            z10 = true;
        }
        this.f61638c = z10;
        this.f61639d = z10 ? j10 : j11;
    }

    @Override // Zg.S
    public long d() {
        long j10 = this.f61639d;
        if (j10 != this.f61637b) {
            this.f61639d = this.f61636a + j10;
        } else {
            if (!this.f61638c) {
                throw new NoSuchElementException();
            }
            this.f61638c = false;
        }
        return j10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f61638c;
    }
}
