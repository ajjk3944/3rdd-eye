package sh;

import Zg.Q;
import java.util.NoSuchElementException;

/* renamed from: sh.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7973h extends Q {

    /* renamed from: a, reason: collision with root package name */
    private final int f61626a;

    /* renamed from: b, reason: collision with root package name */
    private final int f61627b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f61628c;

    /* renamed from: d, reason: collision with root package name */
    private int f61629d;

    public C7973h(int i10, int i11, int i12) {
        this.f61626a = i12;
        this.f61627b = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f61628c = z10;
        this.f61629d = z10 ? i10 : i11;
    }

    @Override // Zg.Q
    public int d() {
        int i10 = this.f61629d;
        if (i10 != this.f61627b) {
            this.f61629d = this.f61626a + i10;
        } else {
            if (!this.f61628c) {
                throw new NoSuchElementException();
            }
            this.f61628c = false;
        }
        return i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f61628c;
    }
}
