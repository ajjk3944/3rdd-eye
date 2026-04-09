package ot;

import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f19794a;

    /* renamed from: d, reason: collision with root package name */
    public int f19795d;

    @Override // ot.a
    public final int a() {
        return this.f19795d;
    }

    @Override // ot.a
    public final void b(int i10, ht.i iVar) {
        Object[] objArr = this.f19794a;
        if (objArr.length <= i10) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length * 2);
            br.l.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f19794a = objArrCopyOf;
        }
        Object[] objArr2 = this.f19794a;
        if (objArr2[i10] == null) {
            this.f19795d++;
        }
        objArr2[i10] = iVar;
    }

    @Override // ot.a
    public final Object get(int i10) {
        return mq.l.q0(i10, this.f19794a);
    }

    @Override // ot.a, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this);
    }
}
