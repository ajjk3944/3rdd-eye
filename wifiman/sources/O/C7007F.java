package o;

import Zg.AbstractC3682n;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: o.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7007F extends M {
    public /* synthetic */ C7007F(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final boolean g(Object obj) {
        i(this.f54911b + 1);
        Object[] objArr = this.f54910a;
        int i10 = this.f54911b;
        objArr[i10] = obj;
        this.f54911b = i10 + 1;
        return true;
    }

    public final void h() {
        AbstractC3682n.v(this.f54910a, null, 0, this.f54911b);
        this.f54911b = 0;
    }

    public final void i(int i10) {
        Object[] objArr = this.f54910a;
        if (objArr.length < i10) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i10, (objArr.length * 3) / 2));
            AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
            this.f54910a = objArrCopyOf;
        }
    }

    public final boolean j(Object obj) {
        int iB = b(obj);
        if (iB < 0) {
            return false;
        }
        k(iB);
        return true;
    }

    public final Object k(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f54911b)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Index ");
            sb2.append(i10);
            sb2.append(" must be in 0..");
            sb2.append(this.f54911b - 1);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        Object[] objArr = this.f54910a;
        Object obj = objArr[i10];
        if (i10 != i11 - 1) {
            AbstractC3682n.m(objArr, objArr, i10, i10 + 1, i11);
        }
        int i12 = this.f54911b - 1;
        this.f54911b = i12;
        objArr[i12] = null;
        return obj;
    }

    public C7007F(int i10) {
        super(i10, null);
    }
}
