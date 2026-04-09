package oe;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f19320a;

    /* renamed from: b, reason: collision with root package name */
    public int f19321b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19322c;

    public e0() {
        s.c(4, "initialCapacity");
        this.f19320a = new Object[4];
        this.f19321b = 0;
    }

    public static int e(int i10, int i11) {
        if (i11 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i10 + (i10 >> 1) + 1;
        if (iHighestOneBit < i11) {
            iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public final void a(Object obj) {
        obj.getClass();
        f(this.f19321b + 1);
        Object[] objArr = this.f19320a;
        int i10 = this.f19321b;
        this.f19321b = i10 + 1;
        objArr[i10] = obj;
    }

    public final void b(Object... objArr) {
        int length = objArr.length;
        s.a(length, objArr);
        f(this.f19321b + length);
        System.arraycopy(objArr, 0, this.f19320a, this.f19321b, length);
        this.f19321b += length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(List list) {
        if (list != 0) {
            f(list.size() + this.f19321b);
            if (list instanceof c0) {
                this.f19321b = ((c0) list).b(this.f19321b, this.f19320a);
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final u0 d() {
        this.f19322c = true;
        return h0.k(this.f19321b, this.f19320a);
    }

    public final void f(int i10) {
        Object[] objArr = this.f19320a;
        if (objArr.length < i10) {
            this.f19320a = Arrays.copyOf(objArr, e(objArr.length, i10));
            this.f19322c = false;
        } else if (this.f19322c) {
            this.f19320a = (Object[]) objArr.clone();
            this.f19322c = false;
        }
    }
}
