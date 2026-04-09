package q9;

import java.util.NoSuchElementException;
import z8.e0;

/* loaded from: classes4.dex */
public final class b extends e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f24088a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24089b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24090c;

    /* renamed from: d, reason: collision with root package name */
    public int f24091d;

    public b(int i10, int i11, int i12) {
        this.f24088a = i12;
        this.f24089b = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f24090c = z10;
        this.f24091d = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24090c;
    }

    @Override // z8.e0
    public int nextInt() {
        int i10 = this.f24091d;
        if (i10 != this.f24089b) {
            this.f24091d = this.f24088a + i10;
            return i10;
        }
        if (!this.f24090c) {
            throw new NoSuchElementException();
        }
        this.f24090c = false;
        return i10;
    }
}
