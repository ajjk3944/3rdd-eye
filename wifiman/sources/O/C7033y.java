package o;

import Zg.AbstractC3682n;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: o.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7033y extends AbstractC7020k {
    public /* synthetic */ C7033y(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final void g(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f54979b)) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + this.f54979b);
        }
        j(i12 + 1);
        int[] iArr = this.f54978a;
        int i13 = this.f54979b;
        if (i10 != i13) {
            AbstractC3682n.k(iArr, iArr, i10 + 1, i10, i13);
        }
        iArr[i10] = i11;
        this.f54979b++;
    }

    public final boolean h(int i10) {
        j(this.f54979b + 1);
        int[] iArr = this.f54978a;
        int i11 = this.f54979b;
        iArr[i11] = i10;
        this.f54979b = i11 + 1;
        return true;
    }

    public final boolean i(int i10, int[] elements) {
        int i11;
        AbstractC6492s.i(elements, "elements");
        if (i10 < 0 || i10 > (i11 = this.f54979b)) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + this.f54979b);
        }
        if (elements.length == 0) {
            return false;
        }
        j(i11 + elements.length);
        int[] iArr = this.f54978a;
        int i12 = this.f54979b;
        if (i10 != i12) {
            AbstractC3682n.k(iArr, iArr, elements.length + i10, i10, i12);
        }
        AbstractC3682n.p(elements, iArr, i10, 0, 0, 12, null);
        this.f54979b += elements.length;
        return true;
    }

    public final void j(int i10) {
        int[] iArr = this.f54978a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            AbstractC6492s.h(iArrCopyOf, "copyOf(this, newSize)");
            this.f54978a = iArrCopyOf;
        }
    }

    public final void k(int[] elements) {
        AbstractC6492s.i(elements, "elements");
        i(this.f54979b, elements);
    }

    public final int l(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f54979b)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Index ");
            sb2.append(i10);
            sb2.append(" must be in 0..");
            sb2.append(this.f54979b - 1);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int[] iArr = this.f54978a;
        int i12 = iArr[i10];
        if (i10 != i11 - 1) {
            AbstractC3682n.k(iArr, iArr, i10, i10 + 1, i11);
        }
        this.f54979b--;
        return i12;
    }

    public final int m(int i10, int i11) {
        if (i10 >= 0 && i10 < this.f54979b) {
            int[] iArr = this.f54978a;
            int i12 = iArr[i10];
            iArr[i10] = i11;
            return i12;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("set index ");
        sb2.append(i10);
        sb2.append(" must be between 0 .. ");
        sb2.append(this.f54979b - 1);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final void n() {
        int i10 = this.f54979b;
        if (i10 == 0) {
            return;
        }
        AbstractC3682n.G(this.f54978a, 0, i10);
    }

    public C7033y(int i10) {
        super(i10, null);
    }
}
