package E0;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    private int f3811a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f3812b = new int[16];

    /* renamed from: c, reason: collision with root package name */
    private V.b[] f3813c = new V.b[16];

    public final boolean a() {
        int i10 = this.f3811a;
        return i10 > 0 && this.f3812b[i10 - 1] >= 0;
    }

    public final Object b() {
        int i10 = this.f3811a;
        if (i10 <= 0) {
            throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()");
        }
        int i11 = i10 - 1;
        int i12 = this.f3812b[i11];
        V.b bVar = this.f3813c[i11];
        AbstractC6492s.f(bVar);
        if (i12 > 0) {
            this.f3812b[i11] = r3[i11] - 1;
        } else if (i12 == 0) {
            this.f3813c[i11] = null;
            this.f3811a--;
        }
        return bVar.m()[i12];
    }

    public final void c(V.b bVar) {
        if (bVar.s()) {
            return;
        }
        int i10 = this.f3811a;
        int[] iArr = this.f3812b;
        if (i10 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC6492s.h(iArrCopyOf, "copyOf(this, newSize)");
            this.f3812b = iArrCopyOf;
            V.b[] bVarArr = this.f3813c;
            Object[] objArrCopyOf = Arrays.copyOf(bVarArr, bVarArr.length * 2);
            AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
            this.f3813c = (V.b[]) objArrCopyOf;
        }
        this.f3812b[i10] = bVar.o() - 1;
        this.f3813c[i10] = bVar;
        this.f3811a++;
    }
}
