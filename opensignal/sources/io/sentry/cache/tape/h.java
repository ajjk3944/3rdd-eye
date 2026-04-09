package io.sentry.cache.tape;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f12144a = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f12145d;

    /* renamed from: g, reason: collision with root package name */
    public int f12146g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f12147r;

    public h(i iVar) {
        this.f12147r = iVar;
        this.f12145d = iVar.f12152x.f12142a;
        this.f12146g = iVar.D;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        i iVar = this.f12147r;
        if (iVar.F) {
            throw new IllegalStateException("closed");
        }
        if (iVar.D == this.f12146g) {
            return this.f12144a != iVar.f12151r;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final Object next() throws IOException {
        byte[] bArr = i.G;
        i iVar = this.f12147r;
        if (iVar.F) {
            throw new IllegalStateException("closed");
        }
        if (iVar.D != this.f12146g) {
            throw new ConcurrentModificationException();
        }
        int i10 = iVar.f12151r;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        if (this.f12144a >= i10) {
            throw new NoSuchElementException();
        }
        try {
            g gVarY = iVar.Y(this.f12145d);
            int i11 = gVarY.f12143b;
            long j = gVarY.f12142a;
            byte[] bArr2 = new byte[i11];
            long j7 = j + 4;
            long jR0 = iVar.r0(j7);
            this.f12145d = jR0;
            if (!iVar.p0(i11, jR0, bArr2)) {
                this.f12144a = iVar.f12151r;
                return bArr;
            }
            this.f12145d = iVar.r0(j7 + i11);
            this.f12144a++;
            return bArr2;
        } catch (IOException e4) {
            throw e4;
        } catch (OutOfMemoryError unused) {
            iVar.o0();
            this.f12144a = iVar.f12151r;
            return bArr;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        i iVar = this.f12147r;
        if (iVar.D != this.f12146g) {
            throw new ConcurrentModificationException();
        }
        if (iVar.f12151r == 0) {
            throw new NoSuchElementException();
        }
        if (this.f12144a != 1) {
            throw new UnsupportedOperationException("Removal is only permitted from the head.");
        }
        iVar.n0(1);
        this.f12146g = iVar.D;
        this.f12144a--;
    }
}
