package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class u64 extends a54 {
    public static final int[] m = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int h;
    public final a54 i;
    public final a54 j;
    public final int k;
    public final int l;

    public u64(a54 a54Var, a54 a54Var2) {
        this.i = a54Var;
        this.j = a54Var2;
        int iD = a54Var.d();
        this.k = iD;
        this.h = a54Var2.d() + iD;
        this.l = Math.max(a54Var.g(), a54Var2.g()) + 1;
    }

    public static int r(int i) {
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return m[i];
    }

    @Override // defpackage.a54
    public final byte b(int i) {
        a54.q(i, this.h);
        return c(i);
    }

    @Override // defpackage.a54
    public final byte c(int i) {
        int i2 = this.k;
        return i < i2 ? this.i.c(i) : this.j.c(i - i2);
    }

    @Override // defpackage.a54
    public final int d() {
        return this.h;
    }

    @Override // defpackage.a54
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a54) {
            a54 a54Var = (a54) obj;
            int iD = a54Var.d();
            int i = this.h;
            if (i == iD) {
                if (i == 0) {
                    return true;
                }
                int i2 = this.f;
                int i3 = a54Var.f;
                if (i2 == 0 || i3 == 0 || i2 == i3) {
                    t64 t64Var = new t64(this);
                    y44 y44VarA = t64Var.next();
                    t64 t64Var2 = new t64(a54Var);
                    y44 y44VarA2 = t64Var2.next();
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        int iD2 = y44VarA.d() - i4;
                        int iD3 = y44VarA2.d() - i5;
                        int iMin = Math.min(iD2, iD3);
                        if (!(i4 == 0 ? y44VarA.s(y44VarA2, i5, iMin) : y44VarA2.s(y44VarA, i4, iMin))) {
                            break;
                        }
                        i6 += iMin;
                        if (i6 >= i) {
                            if (i6 == i) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == iD2) {
                            y44VarA = t64Var.next();
                            i4 = 0;
                        } else {
                            i4 += iMin;
                        }
                        if (iMin == iD3) {
                            y44VarA2 = t64Var2.next();
                            i5 = 0;
                        } else {
                            i5 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.a54
    public final void f(int i, int i2, int i3, byte[] bArr) {
        int i4 = i + i3;
        a54 a54Var = this.i;
        int i5 = this.k;
        if (i4 <= i5) {
            a54Var.f(i, i2, i3, bArr);
            return;
        }
        a54 a54Var2 = this.j;
        if (i >= i5) {
            a54Var2.f(i - i5, i2, i3, bArr);
            return;
        }
        int i6 = i5 - i;
        a54Var.f(i, i2, i6, bArr);
        a54Var2.f(0, i2 + i6, i3 - i6, bArr);
    }

    @Override // defpackage.a54
    public final int g() {
        return this.l;
    }

    @Override // defpackage.a54
    public final boolean h() {
        return this.h >= r(this.l);
    }

    @Override // defpackage.a54
    public final a54 i(int i, int i2) {
        int i3 = this.h;
        int iA = a54.a(i, i2, i3);
        if (iA == 0) {
            return a54.g;
        }
        if (iA == i3) {
            return this;
        }
        a54 a54Var = this.i;
        int i4 = this.k;
        if (i2 <= i4) {
            return a54Var.i(i, i2);
        }
        int i5 = i2 - i4;
        a54 a54Var2 = this.j;
        return i >= i4 ? a54Var2.i(i - i4, i5) : new u64(a54Var.i(i, a54Var.d()), a54Var2.i(0, i5));
    }

    @Override // defpackage.a54, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new s64(this);
    }

    @Override // defpackage.a54
    public final void j(g54 g54Var) {
        this.i.j(g54Var);
        this.j.j(g54Var);
    }

    @Override // defpackage.a54
    public final int k(int i, int i2, int i3) {
        int i4 = i2 + i3;
        a54 a54Var = this.i;
        int i5 = this.k;
        if (i4 <= i5) {
            return a54Var.k(i, i2, i3);
        }
        a54 a54Var2 = this.j;
        if (i2 >= i5) {
            return a54Var2.k(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return a54Var2.k(a54Var.k(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.a54
    public final m0 l() {
        y44 y44Var;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.l);
        arrayDeque.push(this);
        a54 a54Var = this.i;
        while (a54Var instanceof u64) {
            u64 u64Var = (u64) a54Var;
            arrayDeque.push(u64Var);
            a54Var = u64Var.i;
        }
        y44 y44Var2 = (y44) a54Var;
        while (true) {
            if (!(y44Var2 != null)) {
                int size = arrayList.size();
                int i = 0;
                int iRemaining = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    iRemaining += byteBuffer.remaining();
                    i = byteBuffer.hasArray() ? i | 1 : byteBuffer.isDirect() ? i | 2 : i | 4;
                }
                if (i == 2) {
                    return new c54(iRemaining, arrayList);
                }
                b64 b64Var = new b64();
                b64Var.f = arrayList.iterator();
                b64Var.h = 0;
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    b64Var.h++;
                }
                b64Var.i = -1;
                if (!b64Var.a()) {
                    b64Var.g = y54.c;
                    b64Var.i = 0;
                    b64Var.j = 0;
                    b64Var.n = 0L;
                }
                return new d54(b64Var);
            }
            if (y44Var2 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                if (arrayDeque.isEmpty()) {
                    y44Var = null;
                    break;
                }
                a54 a54Var2 = ((u64) arrayDeque.pop()).j;
                while (a54Var2 instanceof u64) {
                    u64 u64Var2 = (u64) a54Var2;
                    arrayDeque.push(u64Var2);
                    a54Var2 = u64Var2.i;
                }
                y44Var = (y44) a54Var2;
                if (y44Var.d() != 0) {
                    break;
                }
            }
            arrayList.add(ByteBuffer.wrap(y44Var2.h, y44Var2.r(), y44Var2.d()).asReadOnlyBuffer());
            y44Var2 = y44Var;
        }
    }

    @Override // defpackage.a54
    /* renamed from: m */
    public final yq2 iterator() {
        return new s64(this);
    }
}
